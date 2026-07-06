package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public final class bg implements org.bouncycastle.b.e {
    private int[] a = new int[4];
    private int[] b = new int[32];
    private int[] c = new int[32];
    private boolean d = false;
    private boolean e;

    private static int a(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return ((bArr[i2] & 255) << 16) | (bArr[i] << 24) | ((bArr[i3] & 255) << 8) | (bArr[i3 + 1] & 255);
    }

    private static void a(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    private void a(byte[] bArr) {
        int i = 0;
        if (bArr.length != 16) {
            throw new IllegalArgumentException("Key size must be 128 bits.");
        }
        int i2 = 0;
        int i3 = 0;
        while (i3 < 4) {
            this.a[i3] = a(bArr, i2);
            i3++;
            i2 += 4;
        }
        int i4 = 0;
        while (true) {
            int i5 = i;
            if (i5 >= 32) {
                return;
            }
            this.b[i5] = this.a[i4 & 3] + i4;
            i4 -= 1640531527;
            this.c[i5] = this.a[(i4 >>> 11) & 3] + i4;
            i = i5 + 1;
        }
    }

    private int b(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iA = a(bArr, i);
        int iA2 = a(bArr, i + 4);
        for (int i3 = 0; i3 < 32; i3++) {
            iA += (((iA2 << 4) ^ (iA2 >>> 5)) + iA2) ^ this.b[i3];
            iA2 += (((iA << 4) ^ (iA >>> 5)) + iA) ^ this.c[i3];
        }
        a(iA, bArr2, i2);
        a(iA2, bArr2, i2 + 4);
        return 8;
    }

    private int c(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iA = a(bArr, i);
        int iA2 = a(bArr, i + 4);
        for (int i3 = 31; i3 >= 0; i3--) {
            iA2 -= (((iA << 4) ^ (iA >>> 5)) + iA) ^ this.c[i3];
            iA -= (((iA2 << 4) ^ (iA2 >>> 5)) + iA2) ^ this.b[i3];
        }
        a(iA, bArr2, i2);
        a(iA2, bArr2, i2 + 4);
        return 8;
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (!this.d) {
            throw new IllegalStateException("XTEA not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new org.bouncycastle.b.ac("output buffer too short");
        }
        return this.e ? b(bArr, i, bArr2, i2) : c(bArr, i, bArr2, i2);
    }

    @Override // org.bouncycastle.b.e
    public final String a() {
        return "XTEA";
    }

    @Override // org.bouncycastle.b.e
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof org.bouncycastle.b.k.ba)) {
            throw new IllegalArgumentException("invalid parameter passed to TEA init - " + iVar.getClass().getName());
        }
        this.e = z;
        this.d = true;
        a(((org.bouncycastle.b.k.ba) iVar).a());
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return 8;
    }

    @Override // org.bouncycastle.b.e
    public final void c() {
    }
}
