package org.cybergarage.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

/* JADX INFO: compiled from: HTTPRequest.java */
/* JADX INFO: loaded from: classes.dex */
public class e extends d {
    private String a = null;
    private String b = null;
    private String c = "";
    private int d = -1;
    private k e = null;
    private Socket f = null;

    public e() {
        a("1.0");
    }

    public final void k(String str) {
        this.a = str;
    }

    private String I() {
        return this.a != null ? this.a : a(0);
    }

    private boolean n(String str) {
        String strI = I();
        if (strI == null) {
            return false;
        }
        return strI.equalsIgnoreCase(str);
    }

    public final boolean q() {
        return n("GET");
    }

    public final boolean r() {
        return n("POST");
    }

    public final boolean s() {
        return n("HEAD");
    }

    public final boolean t() {
        return n("SUBSCRIBE");
    }

    public final boolean u() {
        return n("UNSUBSCRIBE");
    }

    public final boolean v() {
        return n("NOTIFY");
    }

    public final void a(String str, boolean z) {
        this.b = str;
        if (z) {
            this.b = b.d(this.b);
        }
    }

    public final void l(String str) {
        a(str, false);
    }

    public final String w() {
        return this.b != null ? this.b : a(1);
    }

    public final n x() {
        int iIndexOf;
        n nVar = new n();
        String strW = w();
        if (strW != null && (iIndexOf = strW.indexOf(63)) >= 0) {
            while (iIndexOf > 0) {
                int iIndexOf2 = strW.indexOf(61, iIndexOf + 1);
                String strSubstring = strW.substring(iIndexOf + 1, iIndexOf2);
                iIndexOf = strW.indexOf(38, iIndexOf2 + 1);
                nVar.add(new m(strSubstring, strW.substring(iIndexOf2 + 1, iIndexOf > 0 ? iIndexOf : strW.length())));
            }
            return nVar;
        }
        return nVar;
    }

    public final void m(String str) {
        this.c = str;
    }

    public final String y() {
        return this.c;
    }

    public final void b(int i) {
        this.d = i;
    }

    public final int z() {
        return this.d;
    }

    public final void b(k kVar) {
        this.e = kVar;
    }

    private String J() {
        return c() ? a(2) : "HTTP/" + super.a();
    }

    private String K() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.valueOf(I()) + " " + w() + " " + J() + "\r\n");
        stringBuffer.append(d());
        return stringBuffer.toString();
    }

    public final boolean C() {
        if (l()) {
            return false;
        }
        if (m()) {
            return true;
        }
        return !(J().indexOf("1.0") > 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.InputStream] */
    public final g c(String str, int i) throws Throwable {
        OutputStream outputStream;
        InputStream inputStream;
        g gVar = new g();
        ?? r1 = "HOST";
        a("HOST", org.cybergarage.b.a.c(str) ? "[" + str + "]" : str);
        i("close");
        boolean zN = n("HEAD");
        try {
            try {
                if (this.f == null) {
                    this.f = new Socket();
                    this.f.connect(new InetSocketAddress(str, i), 80000);
                }
                outputStream = this.f.getOutputStream();
            } catch (SocketException e) {
                e = e;
                inputStream = null;
                outputStream = null;
            } catch (IOException e2) {
                e = e2;
                inputStream = null;
                outputStream = null;
            } catch (Throwable th) {
                th = th;
                r1 = 0;
                outputStream = null;
            }
            try {
                PrintStream printStream = new PrintStream(outputStream);
                String str2 = String.valueOf(String.valueOf("") + K()) + "\r\n";
                boolean zP = p();
                String strF = f();
                int length = strF.length();
                if (length > 0) {
                    if (zP) {
                        str2 = String.valueOf(String.valueOf(str2) + Long.toHexString(length)) + "\r\n";
                    }
                    str2 = String.valueOf(str2) + strF;
                    if (zP) {
                        str2 = String.valueOf(str2) + "\r\n";
                    }
                }
                if (zP) {
                    str2 = String.valueOf(String.valueOf(str2) + "0") + "\r\n";
                }
                printStream.print(str2);
                printStream.flush();
                inputStream = this.f.getInputStream();
            } catch (SocketException e3) {
                e = e3;
                inputStream = null;
            } catch (IOException e4) {
                e = e4;
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
                r1 = 0;
                try {
                    r1.close();
                } catch (Exception e5) {
                }
                if (r1 != 0) {
                    try {
                        outputStream.close();
                    } catch (Exception e6) {
                    }
                }
                if (outputStream != null) {
                    try {
                        this.f.close();
                    } catch (Exception e7) {
                    }
                }
                this.f = null;
                throw th;
            }
            try {
                gVar.a(inputStream, zN);
                try {
                    inputStream.close();
                } catch (Exception e8) {
                }
                if (inputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Exception e9) {
                    }
                }
                if (outputStream != null) {
                    try {
                        this.f.close();
                    } catch (Exception e10) {
                    }
                }
                this.f = null;
                r1 = inputStream;
            } catch (SocketException e11) {
                e = e11;
                gVar.b(500);
                org.cybergarage.e.a.a(e);
                try {
                    inputStream.close();
                } catch (Exception e12) {
                }
                if (inputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Exception e13) {
                    }
                }
                if (outputStream != null) {
                    try {
                        this.f.close();
                    } catch (Exception e14) {
                    }
                }
                this.f = null;
                r1 = inputStream;
            } catch (IOException e15) {
                e = e15;
                gVar.b(500);
                org.cybergarage.e.a.a(e);
                try {
                    inputStream.close();
                } catch (Exception e16) {
                }
                if (inputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Exception e17) {
                    }
                }
                if (outputStream != null) {
                    try {
                        this.f.close();
                    } catch (Exception e18) {
                    }
                }
                this.f = null;
                r1 = inputStream;
            }
            return gVar;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void a(e eVar) {
        a((d) eVar);
        this.e = eVar.e;
    }

    private boolean c(int i) {
        g gVar = new g();
        gVar.b(i);
        gVar.a(0L);
        return a(gVar);
    }

    public final boolean E() {
        return c(200);
    }

    public final boolean F() {
        return c(400);
    }

    public final boolean G() {
        return c(403);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(K());
        stringBuffer.append("\r\n");
        stringBuffer.append(f());
        return stringBuffer.toString();
    }

    public void H() {
        org.cybergarage.e.a.b("[HTTPRequest.java] request content:\n" + toString());
    }

    public final String A() {
        return this.e.a().getLocalAddress().getHostAddress();
    }

    public final InetAddress B() {
        return this.e.a().getInetAddress();
    }

    public final boolean D() {
        return super.a(this.e);
    }

    public final boolean a(g gVar) {
        long j;
        k kVar = this.e;
        long jK = gVar.k();
        if (n()) {
            j = o()[0];
            long j2 = o()[1];
            if (j2 <= 0) {
                j2 = jK - 1;
            }
            if (j > jK || j2 > jK) {
                return c(416);
            }
            gVar.a("Content-Range", String.valueOf(String.valueOf(String.valueOf(String.valueOf("") + "bytes ") + Long.toString(j) + "-") + Long.toString(j2) + "/") + (0 < jK ? Long.toString(jK) : "*"));
            gVar.b(206);
            jK = (j2 - j) + 1;
        } else {
            j = 0;
        }
        return kVar.a(gVar, j, jK, n("HEAD"));
    }
}
