package org.bouncycastle.p054a.p080y.p081a;

import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.C0592bp;
import org.bouncycastle.p054a.InterfaceC0502aa;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p080y.C0750a;
import org.bouncycastle.p054a.p080y.C0755b;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.y.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0753c {
    /* JADX INFO: renamed from: a */
    public static String m1763a(InterfaceC0618f interfaceC0618f) {
        StringBuffer stringBuffer = new StringBuffer();
        if (!(interfaceC0618f instanceof InterfaceC0502aa) || (interfaceC0618f instanceof C0592bp)) {
            try {
                stringBuffer.append("#" + m1764a(C1541f.m4108b(interfaceC0618f.mo1358i().m1577a("DER"))));
            } catch (IOException e) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String strMo1350b = ((InterfaceC0502aa) interfaceC0618f).mo1350b();
            if (strMo1350b.length() <= 0 || strMo1350b.charAt(0) != '#') {
                stringBuffer.append(strMo1350b);
            } else {
                stringBuffer.append("\\".concat(String.valueOf(strMo1350b)));
            }
        }
        int length = stringBuffer.length();
        int i = (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') ? 2 : 0;
        while (i != length) {
            if (stringBuffer.charAt(i) == ',' || stringBuffer.charAt(i) == '\"' || stringBuffer.charAt(i) == '\\' || stringBuffer.charAt(i) == '+' || stringBuffer.charAt(i) == '=' || stringBuffer.charAt(i) == '<' || stringBuffer.charAt(i) == '>' || stringBuffer.charAt(i) == ';') {
                stringBuffer.insert(i, "\\");
                i++;
                length++;
            }
            i++;
        }
        if (stringBuffer.length() > 0) {
            for (int i2 = 0; stringBuffer.length() > i2 && stringBuffer.charAt(i2) == ' '; i2 += 2) {
                stringBuffer.insert(i2, "\\");
            }
        }
        for (int length2 = stringBuffer.length() - 1; length2 >= 0 && stringBuffer.charAt(length2) == ' '; length2--) {
            stringBuffer.insert(length2, '\\');
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    private static String m1764a(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i = 0; i != cArr.length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: a */
    private static void m1765a(StringBuffer stringBuffer, C0750a c0750a, Hashtable hashtable) {
        String str = (String) hashtable.get(c0750a.m1755a());
        if (str != null) {
            stringBuffer.append(str);
        } else {
            stringBuffer.append(c0750a.m1755a().m1593b());
        }
        stringBuffer.append('=');
        stringBuffer.append(m1763a(c0750a.m1756b()));
    }

    /* JADX INFO: renamed from: a */
    public static void m1766a(StringBuffer stringBuffer, C0755b c0755b, Hashtable hashtable) {
        if (!c0755b.m1771a()) {
            if (c0755b.m1772b() != null) {
                m1765a(stringBuffer, c0755b.m1772b(), hashtable);
                return;
            }
            return;
        }
        C0750a[] c0750aArrM1773c = c0755b.m1773c();
        boolean z = true;
        for (int i = 0; i != c0750aArrM1773c.length; i++) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append('+');
            }
            m1765a(stringBuffer, c0750aArrM1773c[i], hashtable);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1767a(C0750a c0750a, C0750a c0750a2) {
        if (c0750a == c0750a2) {
            return true;
        }
        return c0750a != null && c0750a2 != null && c0750a.m1755a().equals(c0750a2.m1755a()) && m1762a(m1763a(c0750a.m1756b())).equals(m1762a(m1763a(c0750a2.m1756b())));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1768a(C0755b c0755b, C0755b c0755b2) {
        if (!c0755b.m1771a()) {
            if (c0755b2.m1771a()) {
                return false;
            }
            return m1767a(c0755b.m1772b(), c0755b2.m1772b());
        }
        if (!c0755b2.m1771a()) {
            return false;
        }
        C0750a[] c0750aArrM1773c = c0755b.m1773c();
        C0750a[] c0750aArrM1773c2 = c0755b2.m1773c();
        if (c0750aArrM1773c.length != c0750aArrM1773c2.length) {
            return false;
        }
        for (int i = 0; i != c0750aArrM1773c.length; i++) {
            if (!m1767a(c0750aArrM1773c[i], c0750aArrM1773c2[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static AbstractC0686u m1769b(String str) {
        try {
            return AbstractC0686u.m1692b(C1541f.m4106a(str.substring(1)));
        } catch (IOException e) {
            throw new IllegalStateException("unknown encoding in name: ".concat(String.valueOf(e)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m1762a(java.lang.String r8) {
        /*
            r7 = 92
            r3 = 1
            r2 = 0
            r6 = 32
            java.lang.String r1 = org.bouncycastle.p142f.C1560k.m4166c(r8)
            int r0 = r1.length()
            if (r0 <= 0) goto La2
            char r0 = r1.charAt(r2)
            r4 = 35
            if (r0 != r4) goto La2
            org.bouncycastle.a.u r0 = m1769b(r1)
            boolean r4 = r0 instanceof org.bouncycastle.p054a.InterfaceC0502aa
            if (r4 == 0) goto La2
            org.bouncycastle.a.aa r0 = (org.bouncycastle.p054a.InterfaceC0502aa) r0
            java.lang.String r0 = r0.mo1350b()
            java.lang.String r0 = org.bouncycastle.p142f.C1560k.m4166c(r0)
        L2a:
            int r1 = r0.length()
            if (r1 <= r3) goto L75
            r1 = r2
        L31:
            int r4 = r1 + 1
            int r5 = r0.length()
            if (r4 >= r5) goto L4a
            char r4 = r0.charAt(r1)
            if (r4 != r7) goto L4a
            int r4 = r1 + 1
            char r4 = r0.charAt(r4)
            if (r4 != r6) goto L4a
            int r1 = r1 + 2
            goto L31
        L4a:
            int r4 = r0.length()
            int r4 = r4 + (-1)
        L50:
            int r5 = r4 + (-1)
            if (r5 <= 0) goto L65
            int r5 = r4 + (-1)
            char r5 = r0.charAt(r5)
            if (r5 != r7) goto L65
            char r5 = r0.charAt(r4)
            if (r5 != r6) goto L65
            int r4 = r4 + (-2)
            goto L50
        L65:
            if (r1 > 0) goto L6f
            int r5 = r0.length()
            int r5 = r5 + (-1)
            if (r4 >= r5) goto L75
        L6f:
            int r4 = r4 + 1
            java.lang.String r0 = r0.substring(r1, r4)
        L75:
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            int r1 = r0.length()
            if (r1 == 0) goto L9d
            char r2 = r0.charAt(r2)
            r4.append(r2)
            r1 = r3
        L88:
            int r3 = r0.length()
            if (r1 >= r3) goto L9d
            char r3 = r0.charAt(r1)
            if (r2 != r6) goto L96
            if (r3 == r6) goto L99
        L96:
            r4.append(r3)
        L99:
            int r1 = r1 + 1
            r2 = r3
            goto L88
        L9d:
            java.lang.String r0 = r4.toString()
            return r0
        La2:
            r0 = r1
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.p054a.p080y.p081a.C0753c.m1762a(java.lang.String):java.lang.String");
    }
}
