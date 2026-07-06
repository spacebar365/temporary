package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public final class az implements org.bouncycastle.b.e {
    private int a;
    private int b;
    private int c;
    private int d;
    private boolean e = false;
    private boolean f;

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

    private int b(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iA = a(bArr, i);
        int iA2 = a(bArr, i + 4);
        int i3 = 0;
        int i4 = 0;
        while (i3 != 32) {
            i4 -= 1640531527;
            int i5 = ((((iA2 << 4) + this.a) ^ (iA2 + i4)) ^ ((iA2 >>> 5) + this.b)) + iA;
            iA2 += (((i5 << 4) + this.c) ^ (i5 + i4)) ^ ((i5 >>> 5) + this.d);
            i3++;
            iA = i5;
        }
        a(iA, bArr2, i2);
        a(iA2, bArr2, i2 + 4);
        return 8;
    }

    private int c(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iA = a(bArr, i);
        int iA2 = a(bArr, i + 4);
        int i3 = -957401312;
        for (int i4 = 0; i4 != 32; i4++) {
            iA2 -= (((iA << 4) + this.c) ^ (iA + i3)) ^ ((iA >>> 5) + this.d);
            iA -= (((iA2 << 4) + this.a) ^ (iA2 + i3)) ^ ((iA2 >>> 5) + this.b);
            i3 += 1640531527;
        }
        a(iA, bArr2, i2);
        a(iA2, bArr2, i2 + 4);
        return 8;
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (!this.e) {
            throw new IllegalStateException("TEA not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new org.bouncycastle.b.ac("output buffer too short");
        }
        return this.f ? b(bArr, i, bArr2, i2) : c(bArr, i, bArr2, i2);
    }

    @Override // org.bouncycastle.b.e
    public final String a() {
        return "TEA";
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return 8;
    }

    @Override // org.bouncycastle.b.e
    public final void c() {
    }

    @Override // org.bouncycastle.b.e
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof org.bouncycastle.b.k.ba)) {
            throw new IllegalArgumentException("invalid parameter passed to TEA init - " + iVar.getClass().getName());
        }
        this.f = z;
        this.e = true;
        byte[] bArrA = ((org.bouncycastle.b.k.ba) iVar).a();
        if (bArrA.length != 16) {
            throw new IllegalArgumentException("Key size must be 128 bits.");
        }
        this.a = a(bArrA, 0);
        this.b = a(bArrA, 4);
        this.c = a(bArrA, 8);
        this.d = a(bArrA, 12);
    }
}
