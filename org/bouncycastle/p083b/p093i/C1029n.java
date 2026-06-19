package org.bouncycastle.p083b.p093i;

/* JADX INFO: renamed from: org.bouncycastle.b.i.n */
/* JADX INFO: loaded from: classes.dex */
final class C1029n {
    /* JADX INFO: renamed from: a */
    public static byte[] m2529a(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, bArr.length - i, bArr2, 0, i);
        return bArr2;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m2530a(byte[] bArr, int i, int i2) {
        if (bArr.length < i + i2) {
            i = bArr.length - i2;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, i2, bArr2, 0, i);
        return bArr2;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m2531a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }
}
