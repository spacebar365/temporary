package org.cybergarage.p154a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import org.cybergarage.p155b.C1637a;
import org.cybergarage.p173e.C1744a;

/* JADX INFO: renamed from: org.cybergarage.a.e */
/* JADX INFO: compiled from: HTTPRequest.java */
/* JADX INFO: loaded from: classes.dex */
public class C1627e extends C1626d {

    /* JADX INFO: renamed from: a */
    private String f6335a = null;

    /* JADX INFO: renamed from: b */
    private String f6336b = null;

    /* JADX INFO: renamed from: c */
    private String f6337c = "";

    /* JADX INFO: renamed from: d */
    private int f6338d = -1;

    /* JADX INFO: renamed from: e */
    private C1633k f6339e = null;

    /* JADX INFO: renamed from: f */
    private Socket f6340f = null;

    public C1627e() {
        m4604a("1.0");
    }

    /* JADX INFO: renamed from: k */
    public final void m4656k(String str) {
        this.f6335a = str;
    }

    /* JADX INFO: renamed from: I */
    private String m4637I() {
        return this.f6335a != null ? this.f6335a : m4601a(0);
    }

    /* JADX INFO: renamed from: n */
    private boolean m4641n(String str) {
        String strM4637I = m4637I();
        if (strM4637I == null) {
            return false;
        }
        return strM4637I.equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4659q() {
        return m4641n("GET");
    }

    /* JADX INFO: renamed from: r */
    public final boolean m4660r() {
        return m4641n("POST");
    }

    /* JADX INFO: renamed from: s */
    public final boolean m4661s() {
        return m4641n("HEAD");
    }

    /* JADX INFO: renamed from: t */
    public final boolean m4662t() {
        return m4641n("SUBSCRIBE");
    }

    /* JADX INFO: renamed from: u */
    public final boolean m4663u() {
        return m4641n("UNSUBSCRIBE");
    }

    /* JADX INFO: renamed from: v */
    public final boolean m4664v() {
        return m4641n("NOTIFY");
    }

    /* JADX INFO: renamed from: a */
    public final void m4650a(String str, boolean z) {
        this.f6336b = str;
        if (z) {
            this.f6336b = C1624b.m4584d(this.f6336b);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4657l(String str) {
        m4650a(str, false);
    }

    /* JADX INFO: renamed from: w */
    public final String m4665w() {
        return this.f6336b != null ? this.f6336b : m4601a(1);
    }

    /* JADX INFO: renamed from: x */
    public final C1636n m4666x() {
        int iIndexOf;
        C1636n c1636n = new C1636n();
        String strM4665w = m4665w();
        if (strM4665w != null && (iIndexOf = strM4665w.indexOf(63)) >= 0) {
            while (iIndexOf > 0) {
                int iIndexOf2 = strM4665w.indexOf(61, iIndexOf + 1);
                String strSubstring = strM4665w.substring(iIndexOf + 1, iIndexOf2);
                iIndexOf = strM4665w.indexOf(38, iIndexOf2 + 1);
                c1636n.add(new C1635m(strSubstring, strM4665w.substring(iIndexOf2 + 1, iIndexOf > 0 ? iIndexOf : strM4665w.length())));
            }
            return c1636n;
        }
        return c1636n;
    }

    /* JADX INFO: renamed from: m */
    public final void m4658m(String str) {
        this.f6337c = str;
    }

    /* JADX INFO: renamed from: y */
    public final String m4667y() {
        return this.f6337c;
    }

    /* JADX INFO: renamed from: b */
    public final void m4653b(int i) {
        this.f6338d = i;
    }

    /* JADX INFO: renamed from: z */
    public final int m4668z() {
        return this.f6338d;
    }

    /* JADX INFO: renamed from: b */
    public final void m4654b(C1633k c1633k) {
        this.f6339e = c1633k;
    }

    /* JADX INFO: renamed from: J */
    private String m4638J() {
        return m4616c() ? m4601a(2) : "HTTP/" + super.m4600a();
    }

    /* JADX INFO: renamed from: K */
    private String m4639K() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.valueOf(m4637I()) + " " + m4665w() + " " + m4638J() + "\r\n");
        stringBuffer.append(m4617d());
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: C */
    public final boolean m4644C() {
        if (m4632l()) {
            return false;
        }
        if (m4633m()) {
            return true;
        }
        return !(m4638J().indexOf("1.0") > 0);
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
    /* JADX INFO: renamed from: c */
    public final C1629g m4655c(String str, int i) throws Throwable {
        OutputStream outputStream;
        InputStream inputStream;
        C1629g c1629g = new C1629g();
        ?? r1 = "HOST";
        m4606a("HOST", C1637a.m4710c(str) ? "[" + str + "]" : str);
        m4627i("close");
        boolean zM4641n = m4641n("HEAD");
        try {
            try {
                if (this.f6340f == null) {
                    this.f6340f = new Socket();
                    this.f6340f.connect(new InetSocketAddress(str, i), 80000);
                }
                outputStream = this.f6340f.getOutputStream();
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
                String str2 = String.valueOf(String.valueOf("") + m4639K()) + "\r\n";
                boolean zP = m4636p();
                String strF = m4621f();
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
                inputStream = this.f6340f.getInputStream();
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
                        this.f6340f.close();
                    } catch (Exception e7) {
                    }
                }
                this.f6340f = null;
                throw th;
            }
            try {
                c1629g.m4610a(inputStream, zM4641n);
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
                        this.f6340f.close();
                    } catch (Exception e10) {
                    }
                }
                this.f6340f = null;
                r1 = inputStream;
            } catch (SocketException e11) {
                e = e11;
                c1629g.m4671b(500);
                C1744a.m5117a(e);
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
                        this.f6340f.close();
                    } catch (Exception e14) {
                    }
                }
                this.f6340f = null;
                r1 = inputStream;
            } catch (IOException e15) {
                e = e15;
                c1629g.m4671b(500);
                C1744a.m5117a(e);
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
                        this.f6340f.close();
                    } catch (Exception e18) {
                    }
                }
                this.f6340f = null;
                r1 = inputStream;
            }
            return c1629g;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4651a(C1627e c1627e) {
        m4608a((C1626d) c1627e);
        this.f6339e = c1627e.f6339e;
    }

    /* JADX INFO: renamed from: c */
    private boolean m4640c(int i) {
        C1629g c1629g = new C1629g();
        c1629g.m4671b(i);
        c1629g.m4603a(0L);
        return m4652a(c1629g);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m4646E() {
        return m4640c(200);
    }

    /* JADX INFO: renamed from: F */
    public final boolean m4647F() {
        return m4640c(400);
    }

    /* JADX INFO: renamed from: G */
    public final boolean m4648G() {
        return m4640c(403);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(m4639K());
        stringBuffer.append("\r\n");
        stringBuffer.append(m4621f());
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: H */
    public void mo4649H() {
        C1744a.m5120b("[HTTPRequest.java] request content:\n" + toString());
    }

    /* JADX INFO: renamed from: A */
    public final String m4642A() {
        return this.f6339e.m4691a().getLocalAddress().getHostAddress();
    }

    /* JADX INFO: renamed from: B */
    public final InetAddress m4643B() {
        return this.f6339e.m4691a().getInetAddress();
    }

    /* JADX INFO: renamed from: D */
    public final boolean m4645D() {
        return super.m4611a(this.f6339e);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4652a(C1629g c1629g) {
        long j;
        C1633k c1633k = this.f6339e;
        long jK = c1629g.m4631k();
        if (m4634n()) {
            j = m4635o()[0];
            long j2 = m4635o()[1];
            if (j2 <= 0) {
                j2 = jK - 1;
            }
            if (j > jK || j2 > jK) {
                return m4640c(416);
            }
            c1629g.m4606a("Content-Range", String.valueOf(String.valueOf(String.valueOf(String.valueOf("") + "bytes ") + Long.toString(j) + "-") + Long.toString(j2) + "/") + (0 < jK ? Long.toString(jK) : "*"));
            c1629g.m4671b(206);
            jK = (j2 - j) + 1;
        } else {
            j = 0;
        }
        return c1633k.m4692a(c1629g, j, jK, m4641n("HEAD"));
    }
}
