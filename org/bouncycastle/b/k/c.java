package org.bouncycastle.b.k;

/* JADX INFO: loaded from: classes.dex */
public class c extends ba {
    private static byte[] a = {1, 1, 1, 1, 1, 1, 1, 1, 31, 31, 31, 31, 14, 14, 14, 14, -32, -32, -32, -32, -15, -15, -15, -15, -2, -2, -2, -2, -2, -2, -2, -2, 1, -2, 1, -2, 1, -2, 1, -2, 31, -32, 31, -32, 14, -15, 14, -15, 1, -32, 1, -32, 1, -15, 1, -15, 31, -2, 31, -2, 14, -2, 14, -2, 1, 31, 1, 31, 1, 14, 1, 14, -32, -2, -32, -2, -15, -2, -15, -2, -2, 1, -2, 1, -2, 1, -2, 1, -32, 31, -32, 31, -15, 14, -15, 14, -32, 1, -32, 1, -15, 1, -15, 1, -2, 31, -2, 31, -2, 14, -2, 14, 31, 1, 31, 1, 14, 1, 14, 1, -2, -32, -2, -32, -2, -15, -2, -15};

    public static void a(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            bArr[i] = (byte) (((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) & 1) | (b & 254));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(byte[] r7, int r8) {
        /*
            r6 = 8
            r0 = 0
            int r1 = r7.length
            int r1 = r1 - r8
            if (r1 >= r6) goto Lf
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "key material too short."
            r0.<init>(r1)
            throw r0
        Lf:
            r2 = r0
        L10:
            r1 = 16
            if (r2 >= r1) goto L28
            r1 = r0
        L15:
            if (r1 >= r6) goto L27
            int r3 = r1 + r8
            r3 = r7[r3]
            byte[] r4 = org.bouncycastle.b.k.c.a
            int r5 = r2 * 8
            int r5 = r5 + r1
            r4 = r4[r5]
            if (r3 != r4) goto L29
            int r1 = r1 + 1
            goto L15
        L27:
            r0 = 1
        L28:
            return r0
        L29:
            int r1 = r2 + 1
            r2 = r1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.b.k.c.a(byte[], int):boolean");
    }
}
