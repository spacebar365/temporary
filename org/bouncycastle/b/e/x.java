package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public final class x implements org.bouncycastle.b.ao {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private int[] d;
    private int[] e;
    private int f;
    private int g = 4;
    private boolean h = false;

    private static int[] a(int[] iArr, int i) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = i;
        return iArr;
    }

    private int b() {
        int i = this.e[0];
        int i2 = (this.e[0] >>> 3) | (this.e[1] << 29);
        int i3 = (this.e[0] >>> 11) | (this.e[1] << 21);
        int i4 = (this.e[0] >>> 13) | (this.e[1] << 19);
        int i5 = (this.e[0] >>> 17) | (this.e[1] << 15);
        int i6 = (this.e[0] >>> 18) | (this.e[1] << 14);
        int i7 = (this.e[0] >>> 26) | (this.e[1] << 6);
        int i8 = (this.e[0] >>> 27) | (this.e[1] << 5);
        int i9 = (this.e[1] >>> 8) | (this.e[2] << 24);
        int i10 = (this.e[1] >>> 16) | (this.e[2] << 16);
        int i11 = (this.e[1] >>> 24) | (this.e[2] << 8);
        int i12 = (this.e[1] >>> 27) | (this.e[2] << 5);
        int i13 = (this.e[1] >>> 29) | (this.e[2] << 3);
        int i14 = (this.e[2] >>> 1) | (this.e[3] << 31);
        int i15 = (this.e[2] >>> 3) | (this.e[3] << 29);
        int i16 = (this.e[2] >>> 4) | (this.e[3] << 28);
        int i17 = (this.e[2] >>> 20) | (this.e[3] << 12);
        return ((((((((((i ^ i7) ^ i11) ^ ((this.e[2] >>> 27) | (this.e[3] << 5))) ^ this.e[3]) ^ (i2 & i15)) ^ (i3 & i4)) ^ (i5 & i6)) ^ (i8 & i12)) ^ (i9 & i10)) ^ (i13 & i14)) ^ (i16 & i17);
    }

    private int d() {
        int i = this.d[0];
        int i2 = (this.d[0] >>> 7) | (this.d[1] << 25);
        int i3 = (this.d[1] >>> 6) | (this.d[2] << 26);
        int i4 = (this.d[2] >>> 6) | (this.d[3] << 26);
        return ((((i ^ i2) ^ i3) ^ i4) ^ ((this.d[2] >>> 17) | (this.d[3] << 15))) ^ this.d[3];
    }

    private int e() {
        int i = (this.e[0] >>> 2) | (this.e[1] << 30);
        int i2 = (this.e[0] >>> 12) | (this.e[1] << 20);
        int i3 = (this.e[0] >>> 15) | (this.e[1] << 17);
        int i4 = (this.e[1] >>> 4) | (this.e[2] << 28);
        int i5 = (this.e[1] >>> 13) | (this.e[2] << 19);
        int i6 = this.e[2];
        int i7 = (this.e[2] >>> 9) | (this.e[3] << 23);
        int i8 = (this.e[2] >>> 25) | (this.e[3] << 7);
        int i9 = (this.e[2] >>> 31) | (this.e[3] << 1);
        int i10 = (this.d[0] >>> 8) | (this.d[1] << 24);
        int i11 = (this.d[0] >>> 13) | (this.d[1] << 19);
        int i12 = (this.d[0] >>> 20) | (this.d[1] << 12);
        int i13 = (this.d[1] >>> 10) | (this.d[2] << 22);
        int i14 = (this.d[1] >>> 28) | (this.d[2] << 4);
        int i15 = (this.d[2] >>> 15) | (this.d[3] << 17);
        return ((((((i ^ ((((i2 & i9) & ((this.d[2] >>> 31) | (this.d[3] << 1))) ^ ((((i10 & i2) ^ (i11 & i12)) ^ (i9 & i13)) ^ (i14 & i15))) ^ ((this.d[2] >>> 29) | (this.d[3] << 3)))) ^ i3) ^ i4) ^ i5) ^ i6) ^ i7) ^ i8;
    }

    @Override // org.bouncycastle.b.ao
    public final String a() {
        return "Grain-128";
    }

    @Override // org.bouncycastle.b.ao
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof org.bouncycastle.b.k.be)) {
            throw new IllegalArgumentException("Grain-128 Init parameters must include an IV");
        }
        org.bouncycastle.b.k.be beVar = (org.bouncycastle.b.k.be) iVar;
        byte[] bArrA = beVar.a();
        if (bArrA == null || bArrA.length != 12) {
            throw new IllegalArgumentException("Grain-128  requires exactly 12 bytes of IV");
        }
        if (!(beVar.b() instanceof org.bouncycastle.b.k.ba)) {
            throw new IllegalArgumentException("Grain-128 Init parameters must include a key");
        }
        org.bouncycastle.b.k.ba baVar = (org.bouncycastle.b.k.ba) beVar.b();
        this.b = new byte[baVar.a().length];
        this.a = new byte[baVar.a().length];
        this.d = new int[4];
        this.e = new int[4];
        this.c = new byte[4];
        System.arraycopy(bArrA, 0, this.b, 0, bArrA.length);
        System.arraycopy(baVar.a(), 0, this.a, 0, baVar.a().length);
        c();
    }

    @Override // org.bouncycastle.b.ao
    public final int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.h) {
            throw new IllegalStateException("Grain-128 not initialised");
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
            if (this.g > 3) {
                this.f = e();
                this.c[0] = (byte) this.f;
                this.c[1] = (byte) (this.f >> 8);
                this.c[2] = (byte) (this.f >> 16);
                this.c[3] = (byte) (this.f >> 24);
                this.e = a(this.e, b() ^ this.d[0]);
                this.d = a(this.d, d());
                this.g = 0;
            }
            byte[] bArr3 = this.c;
            int i6 = this.g;
            this.g = i6 + 1;
            bArr2[i5] = (byte) (b ^ bArr3[i6]);
        }
        return i2;
    }

    @Override // org.bouncycastle.b.ao
    public final void c() {
        this.g = 4;
        byte[] bArr = this.a;
        byte[] bArr2 = this.b;
        bArr2[12] = -1;
        bArr2[13] = -1;
        bArr2[14] = -1;
        bArr2[15] = -1;
        this.a = bArr;
        this.b = bArr2;
        int i = 0;
        for (int i2 = 0; i2 < this.e.length; i2++) {
            this.e[i2] = (this.a[i + 3] << 24) | ((this.a[i + 2] << 16) & 16711680) | ((this.a[i + 1] << 8) & 65280) | (this.a[i] & 255);
            this.d[i2] = (this.b[i + 3] << 24) | ((this.b[i + 2] << 16) & 16711680) | ((this.b[i + 1] << 8) & 65280) | (this.b[i] & 255);
            i += 4;
        }
        for (int i3 = 0; i3 < 8; i3++) {
            this.f = e();
            this.e = a(this.e, (b() ^ this.d[0]) ^ this.f);
            this.d = a(this.d, d() ^ this.f);
        }
        this.h = true;
    }
}
