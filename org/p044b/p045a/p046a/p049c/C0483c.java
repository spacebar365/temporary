package org.p044b.p045a.p046a.p049c;

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
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.zip.GZIPOutputStream;
import org.p044b.p045a.p046a.AbstractC0486d;
import org.p044b.p045a.p046a.p047a.C0475a;
import org.p044b.p045a.p046a.p048b.EnumC0479a;

/* JADX INFO: renamed from: org.b.a.a.c.c */
/* JADX INFO: compiled from: Response.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"DefaultLocale"})
public final class C0483c implements Closeable {

    /* JADX INFO: renamed from: a */
    private InterfaceC0482b f1795a;

    /* JADX INFO: renamed from: b */
    private String f1796b;

    /* JADX INFO: renamed from: c */
    private InputStream f1797c;

    /* JADX INFO: renamed from: d */
    private long f1798d;

    /* JADX INFO: renamed from: g */
    private EnumC0479a f1801g;

    /* JADX INFO: renamed from: h */
    private boolean f1802h;

    /* JADX INFO: renamed from: i */
    private boolean f1803i;

    /* JADX INFO: renamed from: j */
    private List<String> f1804j;

    /* JADX INFO: renamed from: e */
    private final Map<String, String> f1799e = new C0484d(this);

    /* JADX INFO: renamed from: f */
    private final Map<String, String> f1800f = new HashMap();

    /* JADX INFO: renamed from: k */
    private a f1805k = a.DEFAULT;

    /* JADX INFO: renamed from: org.b.a.a.c.c$a */
    /* JADX INFO: compiled from: Response.java */
    private enum a {
        DEFAULT,
        ALWAYS,
        NEVER;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    private C0483c(InterfaceC0482b interfaceC0482b, String str, InputStream inputStream, long j) {
        this.f1795a = interfaceC0482b;
        this.f1796b = str;
        if (inputStream == null) {
            this.f1797c = new ByteArrayInputStream(new byte[0]);
            this.f1798d = 0L;
        } else {
            this.f1797c = inputStream;
            this.f1798d = j;
        }
        this.f1802h = this.f1798d < 0;
        this.f1803i = true;
        this.f1804j = new ArrayList(10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f1797c != null) {
            this.f1797c.close();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1311a(String str) {
        this.f1804j.add(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m1312a(String str, String str2) {
        this.f1799e.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m1314a(boolean z) {
        if (z) {
            this.f1799e.put("connection", "close");
        } else {
            this.f1799e.remove("connection");
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m1315b(String str) {
        return this.f1800f.get(str.toLowerCase());
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0482b m1309a() {
        return this.f1795a;
    }

    /* JADX INFO: renamed from: b */
    public final void m1317b(boolean z) {
        this.f1803i = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m1310a(OutputStream outputStream) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            if (this.f1795a == null) {
                throw new Error("sendResponse(): Status can't be null.");
            }
            PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, new C0475a(this.f1796b).m1284b())), false);
            printWriter.append("HTTP/1.1 ").append(this.f1795a.mo1299a()).append(" \r\n");
            if (this.f1796b != null) {
                m1306a(printWriter, "Content-Type", this.f1796b);
            }
            if (m1315b("date") == null) {
                m1306a(printWriter, "Date", simpleDateFormat.format(new Date()));
            }
            for (Map.Entry<String, String> entry : this.f1799e.entrySet()) {
                m1306a(printWriter, entry.getKey(), entry.getValue());
            }
            Iterator<String> it = this.f1804j.iterator();
            while (it.hasNext()) {
                m1306a(printWriter, "Set-Cookie", it.next());
            }
            if (m1315b("connection") == null) {
                m1306a(printWriter, "Connection", this.f1803i ? "keep-alive" : "close");
            }
            if (m1315b("content-length") != null) {
                m1316b();
            }
            if (m1308c()) {
                m1306a(printWriter, "Content-Encoding", "gzip");
                this.f1802h = true;
            }
            long jM1300a = this.f1797c != null ? this.f1798d : 0L;
            if (this.f1801g != EnumC0479a.HEAD && this.f1802h) {
                m1306a(printWriter, "Transfer-Encoding", "chunked");
            } else if (!m1308c()) {
                jM1300a = m1300a(printWriter, jM1300a);
            }
            printWriter.append("\r\n");
            printWriter.flush();
            if (this.f1801g != EnumC0479a.HEAD && this.f1802h) {
                C0481a c0481a = new C0481a(outputStream);
                m1305a(c0481a, -1L);
                try {
                    c0481a.m1298a();
                } catch (Exception e) {
                    if (this.f1797c != null) {
                        this.f1797c.close();
                    }
                }
            } else {
                m1305a(outputStream, jM1300a);
            }
            AbstractC0486d.m1318a(this.f1797c);
        } catch (IOException e2) {
            AbstractC0486d.f1849d.log(Level.SEVERE, "Could not send response to the client", (Throwable) e2);
            AbstractC0486d.m1318a(this.f1797c);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1306a(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    /* JADX INFO: renamed from: a */
    private long m1300a(PrintWriter printWriter, long j) {
        String strM1315b = m1315b("content-length");
        if (strM1315b != null) {
            try {
                return Long.parseLong(strM1315b);
            } catch (NumberFormatException e) {
                AbstractC0486d.f1849d.severe("content-length was no number ".concat(String.valueOf(strM1315b)));
                return j;
            }
        }
        printWriter.print("Content-Length: " + j + "\r\n");
        return j;
    }

    /* JADX INFO: renamed from: a */
    private void m1305a(OutputStream outputStream, long j) throws IOException {
        GZIPOutputStream gZIPOutputStream;
        if (m1308c()) {
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
            } catch (Exception e) {
                if (this.f1797c != null) {
                    this.f1797c.close();
                }
                gZIPOutputStream = null;
            }
            if (gZIPOutputStream != null) {
                m1307b(gZIPOutputStream, -1L);
                gZIPOutputStream.finish();
                return;
            }
            return;
        }
        m1307b(outputStream, j);
    }

    /* JADX INFO: renamed from: b */
    private void m1307b(OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[16384];
        boolean z = j == -1;
        while (true) {
            if (j > 0 || z) {
                int i = this.f1797c.read(bArr, 0, (int) (z ? 16384L : Math.min(j, 16384L)));
                if (i > 0) {
                    try {
                        outputStream.write(bArr, 0, i);
                        outputStream.flush();
                        if (!z) {
                            j -= (long) i;
                        }
                    } catch (Exception e) {
                        AbstractC0486d.f1849d.log(Level.SEVERE, "Could not send response to the client, pending=" + j + "\n" + String.valueOf(e) + "\n" + String.valueOf(e.getCause()));
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

    /* JADX INFO: renamed from: a */
    public final void m1313a(EnumC0479a enumC0479a) {
        this.f1801g = enumC0479a;
    }

    /* JADX INFO: renamed from: a */
    public static C0483c m1302a(InterfaceC0482b interfaceC0482b, String str, InputStream inputStream) {
        return new C0483c(interfaceC0482b, str, inputStream, -1L);
    }

    /* JADX INFO: renamed from: a */
    public static C0483c m1303a(InterfaceC0482b interfaceC0482b, String str, InputStream inputStream, long j) {
        return new C0483c(interfaceC0482b, str, inputStream, j);
    }

    /* JADX INFO: renamed from: a */
    public static C0483c m1304a(InterfaceC0482b interfaceC0482b, String str, String str2) {
        byte[] bytes;
        C0475a c0475a = new C0475a(str);
        if (str2 == null) {
            return m1303a(interfaceC0482b, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            if (!Charset.forName(c0475a.m1284b()).newEncoder().canEncode(str2)) {
                c0475a = c0475a.m1285c();
            }
            bytes = str2.getBytes(c0475a.m1284b());
        } catch (UnsupportedEncodingException e) {
            AbstractC0486d.f1849d.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e);
            bytes = new byte[0];
        }
        return m1303a(interfaceC0482b, c0475a.m1283a(), new ByteArrayInputStream(bytes), bytes.length);
    }

    /* JADX INFO: renamed from: b */
    public final C0483c m1316b() {
        this.f1805k = a.NEVER;
        return this;
    }

    /* JADX INFO: renamed from: c */
    private boolean m1308c() {
        return this.f1805k == a.DEFAULT ? this.f1796b != null && (this.f1796b.toLowerCase().contains("text/") || this.f1796b.toLowerCase().contains("/json")) : this.f1805k == a.ALWAYS;
    }
}
