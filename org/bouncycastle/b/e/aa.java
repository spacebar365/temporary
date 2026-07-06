package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public final class aa implements org.bouncycastle.b.ao {
    private byte[] d;
    private byte[] e;
    private boolean f;
    private int[] a = new int[1024];
    private int[] b = new int[1024];
    private int c = 0;
    private byte[] g = new byte[4];
    private int h = 0;

    private static int a(int i, int i2) {
        return (i >>> i2) | (i << (-i2));
    }

    private int b() {
        int i;
        int i2 = this.c & 1023;
        if (this.c < 1024) {
            int i3 = this.a[(i2 - 3) & 1023];
            int i4 = this.a[(i2 - 1023) & 1023];
            int[] iArr = this.a;
            iArr[i2] = this.b[(i3 ^ i4) & 1023] + this.a[(i2 - 10) & 1023] + (a(i3, 10) ^ a(i4, 23)) + iArr[i2];
            int i5 = this.a[(i2 - 12) & 1023];
            i = this.a[i2] ^ (this.b[((i5 >> 24) & 255) + 768] + ((this.b[i5 & 255] + this.b[((i5 >> 8) & 255) + 256]) + this.b[((i5 >> 16) & 255) + 512]));
        } else {
            int i6 = this.b[(i2 - 3) & 1023];
            int i7 = this.b[(i2 - 1023) & 1023];
            int[] iArr2 = this.b;
            iArr2[i2] = this.a[(i6 ^ i7) & 1023] + this.b[(i2 - 10) & 1023] + (a(i6, 10) ^ a(i7, 23)) + iArr2[i2];
            int i8 = this.b[(i2 - 12) & 1023];
            i = this.b[i2] ^ (this.a[((i8 >> 24) & 255) + 768] + ((this.a[i8 & 255] + this.a[((i8 >> 8) & 255) + 256]) + this.a[((i8 >> 16) & 255) + 512]));
        }
        this.c = (this.c + 1) & 2047;
        return i;
    }

    private void d() {
        if (this.d.length != 32 && this.d.length != 16) {
            throw new IllegalArgumentException("The key must be 128/256 bits long");
        }
        if (this.e.length < 16) {
            throw new IllegalArgumentException("The IV must be at least 128 bits long");
        }
        if (this.d.length != 32) {
            byte[] bArr = new byte[32];
            System.arraycopy(this.d, 0, bArr, 0, this.d.length);
            System.arraycopy(this.d, 0, bArr, 16, this.d.length);
            this.d = bArr;
        }
        if (this.e.length < 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(this.e, 0, bArr2, 0, this.e.length);
            System.arraycopy(this.e, 0, bArr2, this.e.length, 32 - this.e.length);
            this.e = bArr2;
        }
        this.h = 0;
        this.c = 0;
        int[] iArr = new int[2560];
        for (int i = 0; i < 32; i++) {
            int i2 = i >> 2;
            iArr[i2] = iArr[i2] | ((this.d[i] & 255) << ((i & 3) * 8));
        }
        for (int i3 = 0; i3 < 32; i3++) {
            int i4 = (i3 >> 2) + 8;
            iArr[i4] = iArr[i4] | ((this.e[i3] & 255) << ((i3 & 3) * 8));
        }
        for (int i5 = 16; i5 < 2560; i5++) {
            int i6 = iArr[i5 - 2];
            int i7 = iArr[i5 - 15];
            iArr[i5] = ((i6 >>> 10) ^ (a(i6, 17) ^ a(i6, 19))) + iArr[i5 - 7] + ((i7 >>> 3) ^ (a(i7, 7) ^ a(i7, 18))) + iArr[i5 - 16] + i5;
        }
        System.arraycopy(iArr, 512, this.a, 0, 1024);
        System.arraycopy(iArr, 1536, this.b, 0, 1024);
        for (int i8 = 0; i8 < 4096; i8++) {
            b();
        }
        this.c = 0;
    }

    @Override // org.bouncycastle.b.ao
    public final String a() {
        return "HC-256";
    }

    @Override // org.bouncycastle.b.ao
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        org.bouncycastle.b.i iVarB;
        if (iVar instanceof org.bouncycastle.b.k.be) {
            this.e = ((org.bouncycastle.b.k.be) iVar).a();
            iVarB = ((org.bouncycastle.b.k.be) iVar).b();
        } else {
            this.e = new byte[0];
            iVarB = iVar;
        }
        if (!(iVarB instanceof org.bouncycastle.b.k.ba)) {
            throw new IllegalArgumentException("Invalid parameter passed to HC256 init - " + iVar.getClass().getName());
        }
        this.d = ((org.bouncycastle.b.k.ba) iVarB).a();
        d();
        this.f = true;
    }

    @Override // org.bouncycastle.b.ao
    public final void c() {
        d();
    }

    @Override // org.bouncycastle.b.ao
    public final int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.f) {
            throw new IllegalStateException("HC-256 not initialised");
        }
        if (i + i2 > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new org.bouncycastle.b.ac("output buffer too short");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + i4;
            byte b = bArr[i + i4];
            if (this.h == 0) {
                int iB = b();
                this.g[0] = (byte) (iB & 255);
                int i6 = iB >> 8;
                this.g[1] = (byte) (i6 & 255);
                int i7 = i6 >> 8;
                this.g[2] = (byte) (i7 & 255);
                this.g[3] = (byte) ((i7 >> 8) & 255);
            }
            byte b2 = this.g[this.h];
            this.h = (this.h + 1) & 3;
            bArr2[i5] = (byte) (b ^ b2);
        }
        return i2;
    }
}
