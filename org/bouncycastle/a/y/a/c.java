package org.bouncycastle.a.y.a;

import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.a.aa;
import org.bouncycastle.a.bp;
import org.bouncycastle.a.f;
import org.bouncycastle.a.u;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static String a(f fVar) {
        StringBuffer stringBuffer = new StringBuffer();
        if (!(fVar instanceof aa) || (fVar instanceof bp)) {
            try {
                stringBuffer.append("#" + a(org.bouncycastle.f.a.f.b(fVar.i().a("DER"))));
            } catch (IOException e) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String strB = ((aa) fVar).b();
            if (strB.length() <= 0 || strB.charAt(0) != '#') {
                stringBuffer.append(strB);
            } else {
                stringBuffer.append("\\".concat(String.valueOf(strB)));
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

    private static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i = 0; i != cArr.length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    private static void a(StringBuffer stringBuffer, org.bouncycastle.a.y.a aVar, Hashtable hashtable) {
        String str = (String) hashtable.get(aVar.a());
        if (str != null) {
            stringBuffer.append(str);
        } else {
            stringBuffer.append(aVar.a().b());
        }
        stringBuffer.append('=');
        stringBuffer.append(a(aVar.b()));
    }

    public static void a(StringBuffer stringBuffer, org.bouncycastle.a.y.b bVar, Hashtable hashtable) {
        if (!bVar.a()) {
            if (bVar.b() != null) {
                a(stringBuffer, bVar.b(), hashtable);
                return;
            }
            return;
        }
        org.bouncycastle.a.y.a[] aVarArrC = bVar.c();
        boolean z = true;
        for (int i = 0; i != aVarArrC.length; i++) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append('+');
            }
            a(stringBuffer, aVarArrC[i], hashtable);
        }
    }

    private static boolean a(org.bouncycastle.a.y.a aVar, org.bouncycastle.a.y.a aVar2) {
        if (aVar == aVar2) {
            return true;
        }
        return aVar != null && aVar2 != null && aVar.a().equals(aVar2.a()) && a(a(aVar.b())).equals(a(a(aVar2.b())));
    }

    public static boolean a(org.bouncycastle.a.y.b bVar, org.bouncycastle.a.y.b bVar2) {
        if (!bVar.a()) {
            if (bVar2.a()) {
                return false;
            }
            return a(bVar.b(), bVar2.b());
        }
        if (!bVar2.a()) {
            return false;
        }
        org.bouncycastle.a.y.a[] aVarArrC = bVar.c();
        org.bouncycastle.a.y.a[] aVarArrC2 = bVar2.c();
        if (aVarArrC.length != aVarArrC2.length) {
            return false;
        }
        for (int i = 0; i != aVarArrC.length; i++) {
            if (!a(aVarArrC[i], aVarArrC2[i])) {
                return false;
            }
        }
        return true;
    }

    private static u b(String str) {
        try {
            return u.b(org.bouncycastle.f.a.f.a(str.substring(1)));
        } catch (IOException e) {
            throw new IllegalStateException("unknown encoding in name: ".concat(String.valueOf(e)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r8) {
        /*
            r7 = 92
            r3 = 1
            r2 = 0
            r6 = 32
            java.lang.String r1 = org.bouncycastle.f.k.c(r8)
            int r0 = r1.length()
            if (r0 <= 0) goto La2
            char r0 = r1.charAt(r2)
            r4 = 35
            if (r0 != r4) goto La2
            org.bouncycastle.a.u r0 = b(r1)
            boolean r4 = r0 instanceof org.bouncycastle.a.aa
            if (r4 == 0) goto La2
            org.bouncycastle.a.aa r0 = (org.bouncycastle.a.aa) r0
            java.lang.String r0 = r0.b()
            java.lang.String r0 = org.bouncycastle.f.k.c(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.a.y.a.c.a(java.lang.String):java.lang.String");
    }
}
