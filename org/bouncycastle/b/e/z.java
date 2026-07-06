package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public final class z implements org.bouncycastle.b.ao {
    private byte[] d;
    private byte[] e;
    private boolean f;
    private int[] a = new int[512];
    private int[] b = new int[512];
    private int c = 0;
    private byte[] g = new byte[4];
    private int h = 0;

    private static int a(int i, int i2) {
        return (i << i2) | (i >>> (-i2));
    }

    private static int b(int i, int i2) {
        return (i >>> i2) | (i << (-i2));
    }

    @Override // org.bouncycastle.b.ao
    public final String a() {
        return "HC-128";
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
            throw new IllegalArgumentException("Invalid parameter passed to HC128 init - " + iVar.getClass().getName());
        }
        this.d = ((org.bouncycastle.b.k.ba) iVarB).a();
        d();
        this.f = true;
    }

    @Override // org.bouncycastle.b.ao
    public final void c() {
        d();
    }

    private int b() {
        int i;
        int i2 = this.c & 511;
        if (this.c < 512) {
            int[] iArr = this.a;
            iArr[i2] = iArr[i2] + (b(this.a[(i2 - 3) & 511], 10) ^ b(this.a[(i2 - 511) & 511], 23)) + b(this.a[(i2 - 10) & 511], 8);
            int i3 = this.a[(i2 - 12) & 511];
            i = this.a[i2] ^ (this.b[((i3 >> 16) & 255) + 256] + this.b[i3 & 255]);
        } else {
            int[] iArr2 = this.b;
            iArr2[i2] = iArr2[i2] + (a(this.b[(i2 - 3) & 511], 10) ^ a(this.b[(i2 - 511) & 511], 23)) + a(this.b[(i2 - 10) & 511], 8);
            int i4 = this.b[(i2 - 12) & 511];
            i = this.b[i2] ^ (this.a[((i4 >> 16) & 255) + 256] + this.a[i4 & 255]);
        }
        this.c = (this.c + 1) & 1023;
        return i;
    }

    private void d() {
        if (this.d.length != 16) {
            throw new IllegalArgumentException("The key must be 128 bits long");
        }
        this.h = 0;
        this.c = 0;
        int[] iArr = new int[1280];
        for (int i = 0; i < 16; i++) {
            int i2 = i >> 2;
            iArr[i2] = iArr[i2] | ((this.d[i] & 255) << ((i & 3) * 8));
        }
        System.arraycopy(iArr, 0, iArr, 4, 4);
        for (int i3 = 0; i3 < this.e.length && i3 < 16; i3++) {
            int i4 = (i3 >> 2) + 8;
            iArr[i4] = iArr[i4] | ((this.e[i3] & 255) << ((i3 & 3) * 8));
        }
        System.arraycopy(iArr, 8, iArr, 12, 4);
        for (int i5 = 16; i5 < 1280; i5++) {
            int i6 = iArr[i5 - 2];
            int iB = ((i6 >>> 10) ^ (b(i6, 17) ^ b(i6, 19))) + iArr[i5 - 7];
            int i7 = iArr[i5 - 15];
            iArr[i5] = iB + ((i7 >>> 3) ^ (b(i7, 7) ^ b(i7, 18))) + iArr[i5 - 16] + i5;
        }
        System.arraycopy(iArr, 256, this.a, 0, 512);
        System.arraycopy(iArr, 768, this.b, 0, 512);
        for (int i8 = 0; i8 < 512; i8++) {
            this.a[i8] = b();
        }
        for (int i9 = 0; i9 < 512; i9++) {
            this.b[i9] = b();
        }
        this.c = 0;
    }

    @Override // org.bouncycastle.b.ao
    public final int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.f) {
            throw new IllegalStateException("HC-128 not initialised");
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
