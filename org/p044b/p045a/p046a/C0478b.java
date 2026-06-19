package org.p044b.p045a.p046a;

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
import org.p044b.p045a.p046a.AbstractC0486d;
import org.p044b.p045a.p046a.p047a.C0477c;
import org.p044b.p045a.p046a.p048b.EnumC0479a;
import org.p044b.p045a.p046a.p049c.C0483c;
import org.p044b.p045a.p046a.p049c.EnumC0485e;
import org.p044b.p045a.p046a.p051e.InterfaceC0491c;

/* JADX INFO: renamed from: org.b.a.a.b */
/* JADX INFO: compiled from: HTTPSession.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0478b implements InterfaceC0480c {

    /* JADX INFO: renamed from: a */
    private final AbstractC0486d f1760a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0491c f1761b;

    /* JADX INFO: renamed from: c */
    private final OutputStream f1762c;

    /* JADX INFO: renamed from: d */
    private final BufferedInputStream f1763d;

    /* JADX INFO: renamed from: e */
    private int f1764e;

    /* JADX INFO: renamed from: f */
    private int f1765f;

    /* JADX INFO: renamed from: g */
    private String f1766g;

    /* JADX INFO: renamed from: h */
    private EnumC0479a f1767h;

    /* JADX INFO: renamed from: i */
    private Map<String, List<String>> f1768i;

    /* JADX INFO: renamed from: j */
    private Map<String, String> f1769j;

    /* JADX INFO: renamed from: k */
    private C0477c f1770k;

    /* JADX INFO: renamed from: l */
    private String f1771l;

    /* JADX INFO: renamed from: m */
    private String f1772m;

    /* JADX INFO: renamed from: n */
    private InetAddress f1773n;

    /* JADX INFO: renamed from: o */
    private String f1774o;

    /* JADX INFO: renamed from: p */
    private String f1775p;

    public C0478b(AbstractC0486d abstractC0486d, InterfaceC0491c interfaceC0491c, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        InetAddress byName = null;
        try {
            byName = InetAddress.getByName("127.0.0.1");
        } catch (UnknownHostException e) {
        }
        this.f1760a = abstractC0486d;
        this.f1761b = interfaceC0491c;
        this.f1763d = new BufferedInputStream(inputStream, 8192);
        this.f1762c = outputStream;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            byName = inetAddress;
        }
        this.f1773n = byName;
        this.f1772m = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
        this.f1774o = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "localhost" : inetAddress.getHostName().toString();
        this.f1769j = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    private void m1289a(BufferedReader bufferedReader, Map<String, String> map, Map<String, List<String>> map2, Map<String, String> map3) throws AbstractC0486d.a {
        String strM1319b;
        try {
            String line = bufferedReader.readLine();
            if (line != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(line);
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new AbstractC0486d.a(EnumC0485e.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
                }
                map.put("method", stringTokenizer.nextToken());
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new AbstractC0486d.a(EnumC0485e.BAD_REQUEST, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                }
                String strNextToken = stringTokenizer.nextToken();
                int iIndexOf = strNextToken.indexOf(63);
                if (iIndexOf >= 0) {
                    m1290a(strNextToken.substring(iIndexOf + 1), map2);
                    strM1319b = AbstractC0486d.m1319b(strNextToken.substring(0, iIndexOf));
                } else {
                    strM1319b = AbstractC0486d.m1319b(strNextToken);
                }
                if (stringTokenizer.hasMoreTokens()) {
                    this.f1775p = stringTokenizer.nextToken();
                } else {
                    this.f1775p = "HTTP/1.1";
                    AbstractC0486d.f1849d.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
                }
                String line2 = bufferedReader.readLine();
                while (line2 != null && !line2.trim().isEmpty()) {
                    int iIndexOf2 = line2.indexOf(58);
                    if (iIndexOf2 >= 0) {
                        map3.put(line2.substring(0, iIndexOf2).trim().toLowerCase(Locale.US), line2.substring(iIndexOf2 + 1).trim());
                    }
                    line2 = bufferedReader.readLine();
                }
                map.put("uri", strM1319b);
            }
        } catch (IOException e) {
            throw new AbstractC0486d.a(EnumC0485e.INTERNAL_ERROR, "SERVER INTERNAL ERROR: IOException: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1290a(String str, Map<String, List<String>> map) {
        String strM1319b;
        String strTrim;
        if (str == null) {
            this.f1771l = "";
            return;
        }
        this.f1771l = str;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(61);
            if (iIndexOf >= 0) {
                String strTrim2 = AbstractC0486d.m1319b(strNextToken.substring(0, iIndexOf)).trim();
                strM1319b = AbstractC0486d.m1319b(strNextToken.substring(iIndexOf + 1));
                strTrim = strTrim2;
            } else {
                strM1319b = "";
                strTrim = AbstractC0486d.m1319b(strNextToken).trim();
            }
            List<String> arrayList = map.get(strTrim);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(strTrim, arrayList);
            }
            arrayList.add(strM1319b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1291a() {
        boolean z = false;
        try {
            try {
                try {
                    try {
                        try {
                            byte[] bArr = new byte[8192];
                            this.f1764e = 0;
                            this.f1765f = 0;
                            this.f1763d.mark(8192);
                            try {
                                int i = this.f1763d.read(bArr, 0, 8192);
                                if (i == -1) {
                                    AbstractC0486d.m1318a(this.f1763d);
                                    AbstractC0486d.m1318a(this.f1762c);
                                    throw new SocketException("NanoHttpd Shutdown");
                                }
                                while (i > 0) {
                                    this.f1765f = i + this.f1765f;
                                    this.f1764e = m1288a(bArr, this.f1765f);
                                    if (this.f1764e > 0) {
                                        break;
                                    } else {
                                        i = this.f1763d.read(bArr, this.f1765f, 8192 - this.f1765f);
                                    }
                                }
                                if (this.f1764e < this.f1765f) {
                                    this.f1763d.reset();
                                    this.f1763d.skip(this.f1764e);
                                }
                                this.f1768i = new HashMap();
                                if (this.f1769j == null) {
                                    this.f1769j = new HashMap();
                                } else {
                                    this.f1769j.clear();
                                }
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f1765f)));
                                HashMap map = new HashMap();
                                m1289a(bufferedReader, map, this.f1768i, this.f1769j);
                                if (this.f1772m != null) {
                                    this.f1769j.put("remote-addr", this.f1772m);
                                    this.f1769j.put("http-client-ip", this.f1772m);
                                }
                                this.f1767h = EnumC0479a.m1297a(map.get("method"));
                                if (this.f1767h == null) {
                                    throw new AbstractC0486d.a(EnumC0485e.BAD_REQUEST, "BAD REQUEST: Syntax error. HTTP verb " + map.get("method") + " unhandled.");
                                }
                                this.f1766g = map.get("uri");
                                this.f1770k = new C0477c(this.f1769j);
                                String str = this.f1769j.get("connection");
                                if ("HTTP/1.1".equals(this.f1775p) && (str == null || !str.matches("(?i).*close.*"))) {
                                    z = true;
                                }
                                C0483c c0483cM1321b = this.f1760a.m1321b(this);
                                if (c0483cM1321b == null) {
                                    throw new AbstractC0486d.a(EnumC0485e.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                                }
                                String str2 = this.f1769j.get("accept-encoding");
                                this.f1770k.m1287a(c0483cM1321b);
                                c0483cM1321b.m1313a(this.f1767h);
                                if (str2 == null || !str2.contains("gzip")) {
                                    c0483cM1321b.m1316b();
                                }
                                c0483cM1321b.m1317b(z);
                                c0483cM1321b.m1310a(this.f1762c);
                                if (!z || "close".equals(c0483cM1321b.m1315b("connection"))) {
                                    throw new SocketException("NanoHttpd Shutdown");
                                }
                                AbstractC0486d.m1318a(c0483cM1321b);
                                this.f1761b.mo1328a();
                            } catch (SSLException e) {
                                throw e;
                            } catch (IOException e2) {
                                AbstractC0486d.m1318a(this.f1763d);
                                AbstractC0486d.m1318a(this.f1762c);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                        } catch (SocketTimeoutException e3) {
                            throw e3;
                        } catch (AbstractC0486d.a e4) {
                            C0483c.m1304a(e4.m1325a(), "text/plain", e4.getMessage()).m1310a(this.f1762c);
                            AbstractC0486d.m1318a(this.f1762c);
                            AbstractC0486d.m1318a((Object) null);
                            this.f1761b.mo1328a();
                        }
                    } catch (SocketException e5) {
                        throw e5;
                    }
                } catch (IOException e6) {
                    C0483c.m1304a(EnumC0485e.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e6.getMessage()).m1310a(this.f1762c);
                    AbstractC0486d.m1318a(this.f1762c);
                    AbstractC0486d.m1318a((Object) null);
                    this.f1761b.mo1328a();
                }
            } catch (SSLException e7) {
                C0483c.m1304a(EnumC0485e.INTERNAL_ERROR, "text/plain", "SSL PROTOCOL FAILURE: " + e7.getMessage()).m1310a(this.f1762c);
                AbstractC0486d.m1318a(this.f1762c);
                AbstractC0486d.m1318a((Object) null);
                this.f1761b.mo1328a();
            }
        } catch (Throwable th) {
            AbstractC0486d.m1318a((Object) null);
            this.f1761b.mo1328a();
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m1288a(byte[] bArr, int i) {
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

    @Override // org.p044b.p045a.p046a.InterfaceC0480c
    /* JADX INFO: renamed from: b */
    public final Map<String, String> mo1292b() {
        return this.f1769j;
    }

    @Override // org.p044b.p045a.p046a.InterfaceC0480c
    /* JADX INFO: renamed from: c */
    public final EnumC0479a mo1293c() {
        return this.f1767h;
    }

    @Override // org.p044b.p045a.p046a.InterfaceC0480c
    /* JADX INFO: renamed from: d */
    public final String mo1294d() {
        return this.f1766g;
    }

    @Override // org.p044b.p045a.p046a.InterfaceC0480c
    /* JADX INFO: renamed from: e */
    public final String mo1295e() {
        return this.f1772m;
    }

    @Override // org.p044b.p045a.p046a.InterfaceC0480c
    /* JADX INFO: renamed from: f */
    public final InetAddress mo1296f() {
        return this.f1773n;
    }
}
