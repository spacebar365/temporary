package org.b.a.a.c;

import android.annotation.SuppressLint;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map$Entry;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: Response.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"DefaultLocale"})
public final class c implements Closeable {
    private b a;
    private String b;
    private InputStream c;
    private long d;
    private org.b.a.a.b.a g;
    private boolean h;
    private boolean i;
    private List<String> j;
    private final Map<String, String> e = new d(this);
    private final Map<String, String> f = new HashMap();
    private c$a k = c$a.a;

    static /* synthetic */ Map a(c cVar) {
        return cVar.f;
    }

    private c(b bVar, String str, InputStream inputStream, long j) {
        this.a = bVar;
        this.b = str;
        if (inputStream == null) {
            this.c = new ByteArrayInputStream(new byte[0]);
            this.d = 0L;
        } else {
            this.c = inputStream;
            this.d = j;
        }
        this.h = this.d < 0;
        this.i = true;
        this.j = new ArrayList(10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.c != null) {
            this.c.close();
        }
    }

    public final void a(String str) {
        this.j.add(str);
    }

    public final void a(String str, String str2) {
        this.e.put(str, str2);
    }

    public final void a(boolean z) {
        if (z) {
            this.e.put("connection", "close");
        } else {
            this.e.remove("connection");
        }
    }

    public final String b(String str) {
        return this.f.get(str.toLowerCase());
    }

    public final b a() {
        return this.a;
    }

    public final void b(boolean z) {
        this.i = z;
    }

    public final void a(OutputStream outputStream) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            if (this.a == null) {
                throw new Error("sendResponse(): Status can't be null.");
            }
            PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, new org.b.a.a.a.a(this.b).b())), false);
            printWriter.append("HTTP/1.1 ").append(this.a.a()).append(" \r\n");
            if (this.b != null) {
                a(printWriter, "Content-Type", this.b);
            }
            if (b("date") == null) {
                a(printWriter, "Date", simpleDateFormat.format(new Date()));
            }
            for (Map$Entry<String, String> map$Entry : this.e.entrySet()) {
                a(printWriter, map$Entry.getKey(), map$Entry.getValue());
            }
            Iterator<String> it = this.j.iterator();
            while (it.hasNext()) {
                a(printWriter, "Set-Cookie", it.next());
            }
            if (b("connection") == null) {
                a(printWriter, "Connection", this.i ? "keep-alive" : "close");
            }
            if (b("content-length") != null) {
                b();
            }
            if (c()) {
                a(printWriter, "Content-Encoding", "gzip");
                this.h = true;
            }
            long jA = this.c != null ? this.d : 0L;
            if (this.g != org.b.a.a.b.a.e && this.h) {
                a(printWriter, "Transfer-Encoding", "chunked");
            } else if (!c()) {
                jA = a(printWriter, jA);
            }
            printWriter.append("\r\n");
            printWriter.flush();
            if (this.g != org.b.a.a.b.a.e && this.h) {
                a aVar = new a(outputStream);
                a(aVar, -1L);
                try {
                    aVar.a();
                } catch (Exception e) {
                    if (this.c != null) {
                        this.c.close();
                    }
                }
            } else {
                a(outputStream, jA);
            }
            org.b.a.a.d.a(this.c);
        } catch (IOException e2) {
            org.b.a.a.d.d.log(Level.SEVERE, "Could not send response to the client", (Throwable) e2);
            org.b.a.a.d.a(this.c);
        }
    }

    private static void a(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    private long a(PrintWriter printWriter, long j) {
        String strB = b("content-length");
        if (strB != null) {
            try {
                return Long.parseLong(strB);
            } catch (NumberFormatException e) {
                org.b.a.a.d.d.severe("content-length was no number ".concat(String.valueOf(strB)));
                return j;
            }
        }
        printWriter.print("Content-Length: " + j + "\r\n");
        return j;
    }

    private void a(OutputStream outputStream, long j) throws IOException {
        GZIPOutputStream gZIPOutputStream;
        if (c()) {
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
            } catch (Exception e) {
                if (this.c != null) {
                    this.c.close();
                }
                gZIPOutputStream = null;
            }
            if (gZIPOutputStream != null) {
                b(gZIPOutputStream, -1L);
                gZIPOutputStream.finish();
                return;
            }
            return;
        }
        b(outputStream, j);
    }

    private void b(OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[16384];
        boolean z = j == -1;
        while (true) {
            if (j > 0 || z) {
                int i = this.c.read(bArr, 0, (int) (z ? 16384L : Math.min(j, 16384L)));
                if (i > 0) {
                    try {
                        outputStream.write(bArr, 0, i);
                        outputStream.flush();
                        if (!z) {
                            j -= (long) i;
                        }
                    } catch (Exception e) {
                        org.b.a.a.d.d.log(Level.SEVERE, "Could not send response to the client, pending=" + j + "\n" + String.valueOf(e) + "\n" + String.valueOf(e.getCause()));
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void a(org.b.a.a.b.a aVar) {
        this.g = aVar;
    }

    public static c a(b bVar, String str, InputStream inputStream) {
        return new c(bVar, str, inputStream, -1L);
    }

    public static c a(b bVar, String str, InputStream inputStream, long j) {
        return new c(bVar, str, inputStream, j);
    }

    public static c a(b bVar, String str, String str2) {
        byte[] bytes;
        org.b.a.a.a.a aVar = new org.b.a.a.a.a(str);
        if (str2 == null) {
            return a(bVar, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            if (!Charset.forName(aVar.b()).newEncoder().canEncode(str2)) {
                aVar = aVar.c();
            }
            bytes = str2.getBytes(aVar.b());
        } catch (UnsupportedEncodingException e) {
            org.b.a.a.d.d.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e);
            bytes = new byte[0];
        }
        return a(bVar, aVar.a(), new ByteArrayInputStream(bytes), bytes.length);
    }

    public final c b() {
        this.k = c$a.c;
        return this;
    }

    private boolean c() {
        return this.k == c$a.a ? this.b != null && (this.b.toLowerCase().contains("text/") || this.b.toLowerCase().contains("/json")) : this.k == c$a.b;
    }
}
