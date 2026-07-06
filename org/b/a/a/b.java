package org.b.a.a;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import javax.net.ssl.SSLException;

/* JADX INFO: compiled from: HTTPSession.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c {
    private final d a;
    private final org.b.a.a.e.c b;
    private final OutputStream c;
    private final BufferedInputStream d;
    private int e;
    private int f;
    private String g;
    private org.b.a.a.b.a h;
    private Map<String, List<String>> i;
    private Map<String, String> j;
    private org.b.a.a.a.c k;
    private String l;
    private String m;
    private InetAddress n;
    private String o;
    private String p;

    public b(d dVar, org.b.a.a.e.c cVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        InetAddress byName = null;
        try {
            byName = InetAddress.getByName("127.0.0.1");
        } catch (UnknownHostException e) {
        }
        this.a = dVar;
        this.b = cVar;
        this.d = new BufferedInputStream(inputStream, 8192);
        this.c = outputStream;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            byName = inetAddress;
        }
        this.n = byName;
        this.m = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
        this.o = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "localhost" : inetAddress.getHostName().toString();
        this.j = new HashMap();
    }

    private void a(BufferedReader bufferedReader, Map<String, String> map, Map<String, List<String>> map2, Map<String, String> map3) throws d$a {
        String strB;
        try {
            String line = bufferedReader.readLine();
            if (line != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(line);
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new d$a(org.b.a.a.c.e.m, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
                }
                map.put("method", stringTokenizer.nextToken());
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new d$a(org.b.a.a.c.e.m, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                }
                String strNextToken = stringTokenizer.nextToken();
                int iIndexOf = strNextToken.indexOf(63);
                if (iIndexOf >= 0) {
                    a(strNextToken.substring(iIndexOf + 1), map2);
                    strB = d.b(strNextToken.substring(0, iIndexOf));
                } else {
                    strB = d.b(strNextToken);
                }
                if (stringTokenizer.hasMoreTokens()) {
                    this.p = stringTokenizer.nextToken();
                } else {
                    this.p = "HTTP/1.1";
                    d.d.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
                }
                String line2 = bufferedReader.readLine();
                while (line2 != null && !line2.trim().isEmpty()) {
                    int iIndexOf2 = line2.indexOf(58);
                    if (iIndexOf2 >= 0) {
                        map3.put(line2.substring(0, iIndexOf2).trim().toLowerCase(Locale.US), line2.substring(iIndexOf2 + 1).trim());
                    }
                    line2 = bufferedReader.readLine();
                }
                map.put("uri", strB);
            }
        } catch (IOException e) {
            throw new d$a(org.b.a.a.c.e.C, "SERVER INTERNAL ERROR: IOException: " + e.getMessage(), e);
        }
    }

    private void a(String str, Map<String, List<String>> map) {
        String strB;
        String strTrim;
        if (str == null) {
            this.l = "";
            return;
        }
        this.l = str;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(61);
            if (iIndexOf >= 0) {
                String strTrim2 = d.b(strNextToken.substring(0, iIndexOf)).trim();
                strB = d.b(strNextToken.substring(iIndexOf + 1));
                strTrim = strTrim2;
            } else {
                strB = "";
                strTrim = d.b(strNextToken).trim();
            }
            List<String> arrayList = map.get(strTrim);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(strTrim, arrayList);
            }
            arrayList.add(strB);
        }
    }

    public final void a() {
        boolean z = false;
        try {
            try {
                try {
                    try {
                        try {
                            byte[] bArr = new byte[8192];
                            this.e = 0;
                            this.f = 0;
                            this.d.mark(8192);
                            try {
                                int i = this.d.read(bArr, 0, 8192);
                                if (i == -1) {
                                    d.a(this.d);
                                    d.a(this.c);
                                    throw new SocketException("NanoHttpd Shutdown");
                                }
                                while (i > 0) {
                                    this.f = i + this.f;
                                    this.e = a(bArr, this.f);
                                    if (this.e > 0) {
                                        break;
                                    } else {
                                        i = this.d.read(bArr, this.f, 8192 - this.f);
                                    }
                                }
                                if (this.e < this.f) {
                                    this.d.reset();
                                    this.d.skip(this.e);
                                }
                                this.i = new HashMap();
                                if (this.j == null) {
                                    this.j = new HashMap();
                                } else {
                                    this.j.clear();
                                }
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f)));
                                HashMap map = new HashMap();
                                a(bufferedReader, map, this.i, this.j);
                                if (this.m != null) {
                                    this.j.put("remote-addr", this.m);
                                    this.j.put("http-client-ip", this.m);
                                }
                                this.h = org.b.a.a.b.a.a(map.get("method"));
                                if (this.h == null) {
                                    throw new d$a(org.b.a.a.c.e.m, "BAD REQUEST: Syntax error. HTTP verb " + map.get("method") + " unhandled.");
                                }
                                this.g = map.get("uri");
                                this.k = new org.b.a.a.a.c(this.j);
                                String str = this.j.get("connection");
                                if ("HTTP/1.1".equals(this.p) && (str == null || !str.matches("(?i).*close.*"))) {
                                    z = true;
                                }
                                org.b.a.a.c.c cVarB = this.a.b(this);
                                if (cVarB == null) {
                                    throw new d$a(org.b.a.a.c.e.C, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                                }
                                String str2 = this.j.get("accept-encoding");
                                this.k.a(cVarB);
                                cVarB.a(this.h);
                                if (str2 == null || !str2.contains("gzip")) {
                                    cVarB.b();
                                }
                                cVarB.b(z);
                                cVarB.a(this.c);
                                if (!z || "close".equals(cVarB.b("connection"))) {
                                    throw new SocketException("NanoHttpd Shutdown");
                                }
                                d.a(cVarB);
                                this.b.a();
                            } catch (SSLException e) {
                                throw e;
                            } catch (IOException e2) {
                                d.a(this.d);
                                d.a(this.c);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                        } catch (SocketTimeoutException e3) {
                            throw e3;
                        } catch (d$a e4) {
                            org.b.a.a.c.c.a(e4.a(), "text/plain", e4.getMessage()).a(this.c);
                            d.a(this.c);
                            d.a((Object) null);
                            this.b.a();
                        }
                    } catch (SocketException e5) {
                        throw e5;
                    }
                } catch (IOException e6) {
                    org.b.a.a.c.c.a(org.b.a.a.c.e.C, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e6.getMessage()).a(this.c);
                    d.a(this.c);
                    d.a((Object) null);
                    this.b.a();
                }
            } catch (SSLException e7) {
                org.b.a.a.c.c.a(org.b.a.a.c.e.C, "text/plain", "SSL PROTOCOL FAILURE: " + e7.getMessage()).a(this.c);
                d.a(this.c);
                d.a((Object) null);
                this.b.a();
            }
        } catch (Throwable th) {
            d.a((Object) null);
            this.b.a();
            throw th;
        }
    }

    private static int a(byte[] bArr, int i) {
        for (int i2 = 0; i2 + 1 < i; i2++) {
            if (bArr[i2] == 13 && bArr[i2 + 1] == 10 && i2 + 3 < i && bArr[i2 + 2] == 13 && bArr[i2 + 3] == 10) {
                return i2 + 4;
            }
            if (bArr[i2] == 10 && bArr[i2 + 1] == 10) {
                return i2 + 2;
            }
        }
        return 0;
    }

    @Override // org.b.a.a.c
    public final Map<String, String> b() {
        return this.j;
    }

    @Override // org.b.a.a.c
    public final org.b.a.a.b.a c() {
        return this.h;
    }

    @Override // org.b.a.a.c
    public final String d() {
        return this.g;
    }

    @Override // org.b.a.a.c
    public final String e() {
        return this.m;
    }

    @Override // org.b.a.a.c
    public final InetAddress f() {
        return this.n;
    }
}
