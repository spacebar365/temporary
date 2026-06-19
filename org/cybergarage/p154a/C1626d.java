package org.cybergarage.p154a;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Calendar;
import java.util.StringTokenizer;
import java.util.Vector;
import org.cybergarage.p155b.C1637a;
import org.cybergarage.p173e.C1744a;
import org.cybergarage.p173e.C1747d;

/* JADX INFO: renamed from: org.cybergarage.a.d */
/* JADX INFO: compiled from: HTTPPacket.java */
/* JADX INFO: loaded from: classes.dex */
public class C1626d {

    /* JADX INFO: renamed from: e */
    private InputStream f6334e;

    /* JADX INFO: renamed from: b */
    private String f6331b = "";

    /* JADX INFO: renamed from: c */
    private Vector f6332c = new Vector();

    /* JADX INFO: renamed from: d */
    private byte[] f6333d = new byte[0];

    /* JADX INFO: renamed from: a */
    private String f6330a = "1.1";

    public C1626d() {
        this.f6334e = null;
        this.f6334e = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m4604a(String str) {
        this.f6330a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m4600a() {
        return this.f6330a;
    }

    /* JADX INFO: renamed from: a */
    private static String m4592a(BufferedInputStream bufferedInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1];
        try {
            int i = bufferedInputStream.read(bArr);
            while (i > 0) {
                if (bArr[0] == 10) {
                    break;
                }
                if (bArr[0] != 13) {
                    byteArrayOutputStream.write(bArr[0]);
                }
                i = bufferedInputStream.read(bArr);
            }
        } catch (InterruptedIOException e) {
        } catch (IOException e2) {
            C1744a.m5117a(e2);
        }
        return byteArrayOutputStream.toString();
    }

    /* JADX INFO: renamed from: a */
    protected final boolean m4610a(InputStream inputStream, boolean z) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            String strM4592a = m4592a(bufferedInputStream);
            if (strM4592a == null || strM4592a.length() <= 0) {
                return false;
            }
            this.f6331b = strM4592a;
            if (new C1634l(strM4592a).m4698a() == 100) {
                while (true) {
                    String strM4592a2 = m4592a(bufferedInputStream);
                    if (strM4592a2 == null || strM4592a2.length() <= 0) {
                        break;
                    }
                    C1625c c1625c = new C1625c(strM4592a2);
                    if (c1625c.m4591c()) {
                        m4595a(c1625c);
                    }
                }
                String strM4592a3 = m4592a(bufferedInputStream);
                if (strM4592a3 == null || strM4592a3.length() <= 0) {
                    return true;
                }
                this.f6331b = strM4592a3;
            }
            for (String strM4592a4 = m4592a(bufferedInputStream); strM4592a4 != null && strM4592a4.length() > 0; strM4592a4 = m4592a(bufferedInputStream)) {
                C1625c c1625c2 = new C1625c(strM4592a4);
                if (c1625c2.m4591c()) {
                    m4595a(c1625c2);
                }
            }
            if (z) {
                m4594a("", false);
                return true;
            }
            boolean zM4636p = m4636p();
            long jM4631k = 0;
            if (zM4636p) {
                try {
                    String strM4592a5 = m4592a(bufferedInputStream);
                    jM4631k = strM4592a5 != null ? Long.parseLong(strM4592a5.trim(), 16) : 0L;
                } catch (Exception e) {
                }
            } else {
                jM4631k = m4631k();
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (0 < jM4631k) {
                int iM4577a = C1624b.m4577a();
                byte[] bArr = new byte[(int) (jM4631k > ((long) iM4577a) ? iM4577a : jM4631k)];
                long j = 0;
                while (true) {
                    long j2 = j;
                    if (j2 >= jM4631k) {
                        break;
                    }
                    long j3 = jM4631k - j2;
                    if (iM4577a < j3) {
                        j3 = iM4577a;
                    }
                    try {
                        int i = bufferedInputStream.read(bArr, 0, (int) j3);
                        if (i < 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                        j = ((long) i) + j2;
                    } catch (Exception e2) {
                        C1744a.m5117a(e2);
                    }
                }
                if (zM4636p) {
                    long j4 = 0;
                    try {
                        do {
                            long jSkip = bufferedInputStream.skip(2 - j4);
                            if (jSkip >= 0) {
                                j4 += jSkip;
                            }
                            break;
                        } while (j4 < 2);
                        break;
                        jM4631k = Long.parseLong(new String(m4592a(bufferedInputStream).getBytes(), 0, r0.length() - 2), 16);
                    } catch (Exception e3) {
                        jM4631k = 0;
                    }
                }
                jM4631k = 0;
            }
            m4596a(byteArrayOutputStream.toByteArray(), false);
            return true;
        } catch (Exception e4) {
            C1744a.m5117a(e4);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    protected final String m4612b() {
        return this.f6331b;
    }

    /* JADX INFO: renamed from: a */
    protected final String m4601a(int i) {
        StringTokenizer stringTokenizer = new StringTokenizer(this.f6331b, " ");
        String strNextToken = "";
        for (int i2 = 0; i2 <= i; i2++) {
            if (!stringTokenizer.hasMoreTokens()) {
                return "";
            }
            strNextToken = stringTokenizer.nextToken();
        }
        return strNextToken;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4616c() {
        return this.f6331b.length() > 0;
    }

    /* JADX INFO: renamed from: b */
    private C1625c m4597b(int i) {
        return (C1625c) this.f6332c.get(i);
    }

    /* JADX INFO: renamed from: q */
    private void m4599q() {
        this.f6332c.clear();
        this.f6332c = new Vector();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4614b(String str) {
        return m4598k(str) != null;
    }

    /* JADX INFO: renamed from: a */
    public final void m4606a(String str, String str2) {
        C1625c c1625cM4598k = m4598k(str);
        if (c1625cM4598k != null) {
            c1625cM4598k.m4589a(str2);
        } else {
            this.f6332c.add(new C1625c(str, str2));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4605a(String str, int i) {
        m4606a(str, Integer.toString(i));
    }

    /* JADX INFO: renamed from: a */
    private void m4595a(C1625c c1625c) {
        m4606a(c1625c.m4588a(), c1625c.m4590b());
    }

    /* JADX INFO: renamed from: c */
    public final String m4615c(String str) {
        C1625c c1625cM4598k = m4598k(str);
        return c1625cM4598k == null ? "" : c1625cM4598k.m4590b();
    }

    /* JADX INFO: renamed from: a */
    public final String m4602a(String str, String str2, String str3) {
        String strM4615c = m4615c(str);
        if (strM4615c.startsWith(str2)) {
            strM4615c = strM4615c.substring(1, strM4615c.length());
        }
        if (strM4615c.endsWith(str3)) {
            return strM4615c.substring(0, strM4615c.length() - 1);
        }
        return strM4615c;
    }

    /* JADX INFO: renamed from: d */
    public final String m4618d(String str) {
        return m4602a(str, "\"", "\"");
    }

    /* JADX INFO: renamed from: a */
    private void m4593a(String str, long j) {
        m4606a(str, Long.toString(j));
    }

    /* JADX INFO: renamed from: e */
    public final long m4619e(String str) {
        C1625c c1625cM4598k = m4598k(str);
        if (c1625cM4598k == null) {
            return 0L;
        }
        return C1747d.m5126a(c1625cM4598k.m4590b());
    }

    /* JADX INFO: renamed from: d */
    public final String m4617d() {
        StringBuffer stringBuffer = new StringBuffer();
        int size = this.f6332c.size();
        for (int i = 0; i < size; i++) {
            C1625c c1625cM4597b = m4597b(i);
            stringBuffer.append(String.valueOf(c1625cM4597b.m4588a()) + ": " + c1625cM4597b.m4590b() + "\r\n");
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    private void m4596a(byte[] bArr, boolean z) {
        this.f6333d = bArr;
        if (z) {
            m4603a(bArr.length);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4609a(byte[] bArr) {
        m4596a(bArr, true);
    }

    /* JADX INFO: renamed from: a */
    private void m4594a(String str, boolean z) {
        m4596a(str.getBytes(), z);
    }

    /* JADX INFO: renamed from: f */
    public final void m4622f(String str) {
        m4594a(str, true);
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m4620e() {
        return this.f6333d;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m4624g() {
        return this.f6333d.length > 0;
    }

    /* JADX INFO: renamed from: h */
    public final InputStream m4625h() {
        return this.f6334e;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4628i() {
        return this.f6334e != null;
    }

    /* JADX INFO: renamed from: g */
    public final void m4623g(String str) {
        m4606a("Content-Type", str);
    }

    /* JADX INFO: renamed from: j */
    public final String m4629j() {
        return m4615c("Content-Type");
    }

    /* JADX INFO: renamed from: h */
    public final void m4626h(String str) {
        m4606a("Content-Language", str);
    }

    /* JADX INFO: renamed from: a */
    public final void m4603a(long j) {
        m4593a("Content-Length", j);
    }

    /* JADX INFO: renamed from: k */
    public final long m4631k() {
        return m4619e("Content-Length");
    }

    /* JADX INFO: renamed from: i */
    public final void m4627i(String str) {
        m4606a("Connection", str);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m4634n() {
        return m4614b("Content-Range") || m4614b("Range");
    }

    /* JADX INFO: renamed from: o */
    public final long[] m4635o() {
        long[] jArr = {0, 0, 0};
        if (!m4634n()) {
            return jArr;
        }
        String strM4615c = m4615c("Content-Range");
        if (strM4615c.length() <= 0) {
            strM4615c = m4615c("Range");
        }
        if (strM4615c.length() <= 0) {
            return jArr;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(strM4615c, " =");
        if (!stringTokenizer.hasMoreTokens()) {
            return jArr;
        }
        stringTokenizer.nextToken(" ");
        if (!stringTokenizer.hasMoreTokens()) {
            return jArr;
        }
        try {
            jArr[0] = Long.parseLong(stringTokenizer.nextToken(" -"));
        } catch (NumberFormatException e) {
        }
        if (!stringTokenizer.hasMoreTokens()) {
            return jArr;
        }
        try {
            jArr[1] = Long.parseLong(stringTokenizer.nextToken("-/"));
        } catch (NumberFormatException e2) {
        }
        if (!stringTokenizer.hasMoreTokens()) {
            return jArr;
        }
        try {
            jArr[2] = Long.parseLong(stringTokenizer.nextToken("/"));
        } catch (NumberFormatException e3) {
        }
        return jArr;
    }

    /* JADX INFO: renamed from: j */
    public final void m4630j(String str) {
        m4606a("Server", str);
    }

    /* JADX INFO: renamed from: b */
    public final void m4613b(String str, int i) {
        if (C1637a.m4710c(str)) {
            str = "[" + str + "]";
        }
        m4606a("HOST", String.valueOf(str) + ":" + Integer.toString(i));
    }

    /* JADX INFO: renamed from: a */
    public final void m4607a(Calendar calendar) {
        m4606a("Date", new C1623a(calendar).m4576a());
    }

    /* JADX INFO: renamed from: a */
    protected final void m4608a(C1626d c1626d) {
        this.f6331b = c1626d.f6331b;
        m4599q();
        int size = c1626d.f6332c.size();
        for (int i = 0; i < size; i++) {
            this.f6332c.add(c1626d.m4597b(i));
        }
        m4596a(c1626d.f6333d, true);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4611a(C1633k c1633k) {
        this.f6331b = "";
        m4599q();
        m4596a(new byte[0], false);
        this.f6334e = null;
        return m4610a(c1633k.m4693b(), false);
    }

    /* JADX INFO: renamed from: k */
    private C1625c m4598k(String str) {
        int size = this.f6332c.size();
        for (int i = 0; i < size; i++) {
            C1625c c1625cM4597b = m4597b(i);
            if (c1625cM4597b.m4588a().equalsIgnoreCase(str)) {
                return c1625cM4597b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final String m4621f() {
        String lowerCase;
        int iIndexOf;
        String str;
        String strM4615c = m4615c("Content-Type");
        if (strM4615c == null || (iIndexOf = (lowerCase = strM4615c.toLowerCase()).indexOf("charset")) < 0) {
            str = "";
        } else {
            int i = iIndexOf + 7 + 1;
            String str2 = new String(lowerCase.getBytes(), i, lowerCase.length() - i);
            if (str2.length() < 0) {
                str = "";
            } else {
                if (str2.charAt(0) == '\"') {
                    str2 = str2.substring(1, str2.length() - 1);
                }
                if (str2.length() < 0) {
                    str = "";
                } else {
                    if (str2.charAt(str2.length() - 1) == '\"') {
                        str2 = str2.substring(0, str2.length() - 1);
                    }
                    str = str2;
                }
            }
        }
        if (str == null || str.length() <= 0) {
            return new String(this.f6333d);
        }
        try {
            return new String(this.f6333d, str);
        } catch (Exception e) {
            C1744a.m5117a(e);
            return new String(this.f6333d);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m4632l() {
        String strM4615c;
        if (m4614b("Connection") && (strM4615c = m4615c("Connection")) != null) {
            return strM4615c.equalsIgnoreCase("close");
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m4633m() {
        String strM4615c;
        if (m4614b("Connection") && (strM4615c = m4615c("Connection")) != null) {
            return strM4615c.equalsIgnoreCase("Keep-Alive");
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m4636p() {
        String strM4615c;
        if (m4614b("Transfer-Encoding") && (strM4615c = m4615c("Transfer-Encoding")) != null) {
            return strM4615c.equalsIgnoreCase("Chunked");
        }
        return false;
    }
}
