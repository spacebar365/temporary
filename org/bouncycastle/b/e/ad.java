package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public final class ad implements org.bouncycastle.b.e {
    private static final int[] a = {0, 0, 0, 0};
    private static final int[] b = {128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212};
    private int[] c = new int[4];
    private int[] d = new int[4];
    private int[] e = new int[4];
    private boolean f = false;
    private boolean g;

    private static int a(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

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

    private static void a(int[] iArr) {
        iArr[1] = iArr[1] ^ ((iArr[3] ^ (-1)) & (iArr[2] ^ (-1)));
        iArr[0] = iArr[0] ^ (iArr[2] & iArr[1]);
        int i = iArr[3];
        iArr[3] = iArr[0];
        iArr[0] = i;
        iArr[2] = iArr[2] ^ ((iArr[0] ^ iArr[1]) ^ iArr[3]);
        iArr[1] = iArr[1] ^ ((iArr[3] ^ (-1)) & (iArr[2] ^ (-1)));
        iArr[0] = iArr[0] ^ (iArr[2] & iArr[1]);
    }

    private static void a(int[] iArr, int[] iArr2) {
        int i = iArr[0] ^ iArr[2];
        int iA = i ^ (a(i, 8) ^ a(i, 24));
        iArr[1] = iArr[1] ^ iA;
        iArr[3] = iA ^ iArr[3];
        for (int i2 = 0; i2 < 4; i2++) {
            iArr[i2] = iArr[i2] ^ iArr2[i2];
        }
        int i3 = iArr[1] ^ iArr[3];
        int iA2 = i3 ^ (a(i3, 8) ^ a(i3, 24));
        iArr[0] = iArr[0] ^ iA2;
        iArr[2] = iA2 ^ iArr[2];
    }

    private int b(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.c[0] = a(bArr, i);
        this.c[1] = a(bArr, i + 4);
        this.c[2] = a(bArr, i + 8);
        this.c[3] = a(bArr, i + 12);
        int i3 = 0;
        while (i3 < 16) {
            int[] iArr = this.c;
            iArr[0] = iArr[0] ^ b[i3];
            a(this.c, this.d);
            b(this.c);
            a(this.c);
            c(this.c);
            i3++;
        }
        int[] iArr2 = this.c;
        iArr2[0] = b[i3] ^ iArr2[0];
        a(this.c, this.d);
        a(this.c[0], bArr2, i2);
        a(this.c[1], bArr2, i2 + 4);
        a(this.c[2], bArr2, i2 + 8);
        a(this.c[3], bArr2, i2 + 12);
        return 16;
    }

    private static void b(int[] iArr) {
        iArr[1] = a(iArr[1], 1);
        iArr[2] = a(iArr[2], 5);
        iArr[3] = a(iArr[3], 2);
    }

    private int c(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.c[0] = a(bArr, i);
        this.c[1] = a(bArr, i + 4);
        this.c[2] = a(bArr, i + 8);
        this.c[3] = a(bArr, i + 12);
        System.arraycopy(this.d, 0, this.e, 0, this.d.length);
        a(this.e, a);
        int i3 = 16;
        while (i3 > 0) {
            a(this.c, this.e);
            int[] iArr = this.c;
            iArr[0] = iArr[0] ^ b[i3];
            b(this.c);
            a(this.c);
            c(this.c);
            i3--;
        }
        a(this.c, this.e);
        int[] iArr2 = this.c;
        iArr2[0] = b[i3] ^ iArr2[0];
        a(this.c[0], bArr2, i2);
        a(this.c[1], bArr2, i2 + 4);
        a(this.c[2], bArr2, i2 + 8);
        a(this.c[3], bArr2, i2 + 12);
        return 16;
    }

    private static void c(int[] iArr) {
        iArr[1] = a(iArr[1], 31);
        iArr[2] = a(iArr[2], 27);
        iArr[3] = a(iArr[3], 30);
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (!this.f) {
            throw new IllegalStateException("Noekeon not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new org.bouncycastle.b.ac("output buffer too short");
        }
        return this.g ? b(bArr, i, bArr2, i2) : c(bArr, i, bArr2, i2);
    }

    @Override // org.bouncycastle.b.e
    public final String a() {
        return "Noekeon";
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return 16;
    }

    @Override // org.bouncycastle.b.e
    public final void c() {
    }

    @Override // org.bouncycastle.b.e
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof org.bouncycastle.b.k.ba)) {
            throw new IllegalArgumentException("invalid parameter passed to Noekeon init - " + iVar.getClass().getName());
        }
        this.g = z;
        this.f = true;
        byte[] bArrA = ((org.bouncycastle.b.k.ba) iVar).a();
        this.d[0] = a(bArrA, 0);
        this.d[1] = a(bArrA, 4);
        this.d[2] = a(bArrA, 8);
        this.d[3] = a(bArrA, 12);
    }
}
