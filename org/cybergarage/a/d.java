package org.cybergarage.a;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Calendar;
import java.util.StringTokenizer;
import java.util.Vector;

/* JADX INFO: compiled from: HTTPPacket.java */
/* JADX INFO: loaded from: classes.dex */
public class d {
    private InputStream e;
    private String b = "";
    private Vector c = new Vector();
    private byte[] d = new byte[0];
    private String a = "1.1";

    public d() {
        this.e = null;
        this.e = null;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    private static String a(BufferedInputStream bufferedInputStream) {
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
            org.cybergarage.e.a.a(e2);
        }
        return byteArrayOutputStream.toString();
    }

    protected final boolean a(InputStream inputStream, boolean z) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            String strA = a(bufferedInputStream);
            if (strA == null || strA.length() <= 0) {
                return false;
            }
            this.b = strA;
            if (new l(strA).a() == 100) {
                while (true) {
                    String strA2 = a(bufferedInputStream);
                    if (strA2 == null || strA2.length() <= 0) {
                        break;
                    }
                    c cVar = new c(strA2);
                    if (cVar.c()) {
                        a(cVar);
                    }
                }
                String strA3 = a(bufferedInputStream);
                if (strA3 == null || strA3.length() <= 0) {
                    return true;
                }
                this.b = strA3;
            }
            for (String strA4 = a(bufferedInputStream); strA4 != null && strA4.length() > 0; strA4 = a(bufferedInputStream)) {
                c cVar2 = new c(strA4);
                if (cVar2.c()) {
                    a(cVar2);
                }
            }
            if (z) {
                a("", false);
                return true;
            }
            boolean zP = p();
            long jK = 0;
            if (zP) {
                try {
                    String strA5 = a(bufferedInputStream);
                    jK = strA5 != null ? Long.parseLong(strA5.trim(), 16) : 0L;
                } catch (Exception e) {
                }
            } else {
                jK = k();
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (0 < jK) {
                int iA = b.a();
                byte[] bArr = new byte[(int) (jK > ((long) iA) ? iA : jK)];
                long j = 0;
                while (true) {
                    long j2 = j;
                    if (j2 >= jK) {
                        break;
                    }
                    long j3 = jK - j2;
                    if (iA < j3) {
                        j3 = iA;
                    }
                    try {
                        int i = bufferedInputStream.read(bArr, 0, (int) j3);
                        if (i < 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                        j = ((long) i) + j2;
                    } catch (Exception e2) {
                        org.cybergarage.e.a.a(e2);
                    }
                }
                if (zP) {
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
                        jK = Long.parseLong(new String(a(bufferedInputStream).getBytes(), 0, r0.length() - 2), 16);
                    } catch (Exception e3) {
                        jK = 0;
                    }
                }
                jK = 0;
            }
            a(byteArrayOutputStream.toByteArray(), false);
            return true;
        } catch (Exception e4) {
            org.cybergarage.e.a.a(e4);
            return false;
        }
    }

    protected final String b() {
        return this.b;
    }

    protected final String a(int i) {
        StringTokenizer stringTokenizer = new StringTokenizer(this.b, " ");
        String strNextToken = "";
        for (int i2 = 0; i2 <= i; i2++) {
            if (!stringTokenizer.hasMoreTokens()) {
                return "";
            }
            strNextToken = stringTokenizer.nextToken();
        }
        return strNextToken;
    }

    public final boolean c() {
        return this.b.length() > 0;
    }

    private c b(int i) {
        return (c) this.c.get(i);
    }

    private void q() {
        this.c.clear();
        this.c = new Vector();
    }

    public final boolean b(String str) {
        return k(str) != null;
    }

    public final void a(String str, String str2) {
        c cVarK = k(str);
        if (cVarK != null) {
            cVarK.a(str2);
        } else {
            this.c.add(new c(str, str2));
        }
    }

    public final void a(String str, int i) {
        a(str, Integer.toString(i));
    }

    private void a(c cVar) {
        a(cVar.a(), cVar.b());
    }

    public final String c(String str) {
        c cVarK = k(str);
        return cVarK == null ? "" : cVarK.b();
    }

    public final String a(String str, String str2, String str3) {
        String strC = c(str);
        if (strC.startsWith(str2)) {
            strC = strC.substring(1, strC.length());
        }
        if (strC.endsWith(str3)) {
            return strC.substring(0, strC.length() - 1);
        }
        return strC;
    }

    public final String d(String str) {
        return a(str, "\"", "\"");
    }

    private void a(String str, long j) {
        a(str, Long.toString(j));
    }

    public final long e(String str) {
        c cVarK = k(str);
        if (cVarK == null) {
            return 0L;
        }
        return org.cybergarage.e.d.a(cVarK.b());
    }

    public final String d() {
        StringBuffer stringBuffer = new StringBuffer();
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            c cVarB = b(i);
            stringBuffer.append(String.valueOf(cVarB.a()) + ": " + cVarB.b() + "\r\n");
        }
        return stringBuffer.toString();
    }

    private void a(byte[] bArr, boolean z) {
        this.d = bArr;
        if (z) {
            a(bArr.length);
        }
    }

    public final void a(byte[] bArr) {
        a(bArr, true);
    }

    private void a(String str, boolean z) {
        a(str.getBytes(), z);
    }

    public final void f(String str) {
        a(str, true);
    }

    public final byte[] e() {
        return this.d;
    }

    public final boolean g() {
        return this.d.length > 0;
    }

    public final InputStream h() {
        return this.e;
    }

    public final boolean i() {
        return this.e != null;
    }

    public final void g(String str) {
        a("Content-Type", str);
    }

    public final String j() {
        return c("Content-Type");
    }

    public final void h(String str) {
        a("Content-Language", str);
    }

    public final void a(long j) {
        a("Content-Length", j);
    }

    public final long k() {
        return e("Content-Length");
    }

    public final void i(String str) {
        a("Connection", str);
    }

    public final boolean n() {
        return b("Content-Range") || b("Range");
    }

    public final long[] o() {
        long[] jArr = {0, 0, 0};
        if (!n()) {
            return jArr;
        }
        String strC = c("Content-Range");
        if (strC.length() <= 0) {
            strC = c("Range");
        }
        if (strC.length() <= 0) {
            return jArr;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(strC, " =");
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

    public final void j(String str) {
        a("Server", str);
    }

    public final void b(String str, int i) {
        if (org.cybergarage.b.a.c(str)) {
            str = "[" + str + "]";
        }
        a("HOST", String.valueOf(str) + ":" + Integer.toString(i));
    }

    public final void a(Calendar calendar) {
        a("Date", new a(calendar).a());
    }

    protected final void a(d dVar) {
        this.b = dVar.b;
        q();
        int size = dVar.c.size();
        for (int i = 0; i < size; i++) {
            this.c.add(dVar.b(i));
        }
        a(dVar.d, true);
    }

    public final boolean a(k kVar) {
        this.b = "";
        q();
        a(new byte[0], false);
        this.e = null;
        return a(kVar.b(), false);
    }

    private c k(String str) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            c cVarB = b(i);
            if (cVarB.a().equalsIgnoreCase(str)) {
                return cVarB;
            }
        }
        return null;
    }

    public final String f() {
        String lowerCase;
        int iIndexOf;
        String str;
        String strC = c("Content-Type");
        if (strC == null || (iIndexOf = (lowerCase = strC.toLowerCase()).indexOf("charset")) < 0) {
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
            return new String(this.d);
        }
        try {
            return new String(this.d, str);
        } catch (Exception e) {
            org.cybergarage.e.a.a(e);
            return new String(this.d);
        }
    }

    public final boolean l() {
        String strC;
        if (b("Connection") && (strC = c("Connection")) != null) {
            return strC.equalsIgnoreCase("close");
        }
        return false;
    }

    public final boolean m() {
        String strC;
        if (b("Connection") && (strC = c("Connection")) != null) {
            return strC.equalsIgnoreCase("Keep-Alive");
        }
        return false;
    }

    public final boolean p() {
        String strC;
        if (b("Transfer-Encoding") && (strC = c("Transfer-Encoding")) != null) {
            return strC.equalsIgnoreCase("Chunked");
        }
        return false;
    }
}
