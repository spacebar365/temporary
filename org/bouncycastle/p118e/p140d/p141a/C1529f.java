package org.bouncycastle.p118e.p140d.p141a;

/* JADX INFO: renamed from: org.bouncycastle.e.d.a.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1529f {
    /* JADX INFO: renamed from: a */
    public static int m4036a(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255) | ((bArr[i3] & 255) << 16) | ((bArr[i3 + 1] & 255) << 24);
    }

    /* JADX INFO: renamed from: a */
    public static int m4037a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            i3 |= (bArr[i + i4] & 255) << (i4 * 8);
        }
        return i3;
    }

    /* JADX INFO: renamed from: a */
    public static void m4038a(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) i;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 8);
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }
}
