package org.bouncycastle.b.m;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static byte[] a(d dVar, int i) {
        byte[] bArr = new byte[i];
        if (i * 8 <= dVar.b()) {
            System.arraycopy(dVar.a(), 0, bArr, 0, bArr.length);
        } else {
            int iB = dVar.b() / 8;
            for (int i2 = 0; i2 < bArr.length; i2 += iB) {
                byte[] bArrA = dVar.a();
                if (bArrA.length <= bArr.length - i2) {
                    System.arraycopy(bArrA, 0, bArr, i2, bArrA.length);
                } else {
                    System.arraycopy(bArrA, 0, bArr, i2, bArr.length - i2);
                }
            }
        }
        return bArr;
    }
}
