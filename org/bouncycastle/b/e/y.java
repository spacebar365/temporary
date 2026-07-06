package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public final class y implements org.bouncycastle.b.ao {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private int[] d;
    private int[] e;
    private int f;
    private int g = 2;
    private boolean h = false;

    private static int[] a(int[] iArr, int i) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = i;
        return iArr;
    }

    private int b() {
        int i = this.e[0];
        int i2 = (this.e[0] >>> 9) | (this.e[1] << 7);
        int i3 = (this.e[0] >>> 14) | (this.e[1] << 2);
        int i4 = (this.e[0] >>> 15) | (this.e[1] << 1);
        int i5 = (this.e[1] >>> 5) | (this.e[2] << 11);
        int i6 = (this.e[1] >>> 12) | (this.e[2] << 4);
        int i7 = (this.e[2] >>> 1) | (this.e[3] << 15);
        int i8 = (this.e[2] >>> 5) | (this.e[3] << 11);
        int i9 = (this.e[2] >>> 13) | (this.e[3] << 3);
        int i10 = (this.e[3] >>> 4) | (this.e[4] << 12);
        int i11 = (this.e[3] >>> 12) | (this.e[4] << 4);
        int i12 = (this.e[3] >>> 14) | (this.e[4] << 2);
        int i13 = (this.e[3] >>> 15) | (this.e[4] << 1);
        return ((((((((((((i ^ ((i3 ^ (((((((i12 ^ i11) ^ i10) ^ i9) ^ i8) ^ i7) ^ i6) ^ i5)) ^ i2)) ^ (i13 & i11)) ^ (i8 & i7)) ^ (i4 & i2)) ^ ((i11 & i10) & i9)) ^ ((i7 & i6) & i5)) ^ (((i13 & i9) & i6) & i2)) ^ (((i11 & i10) & i8) & i7)) ^ (((i13 & i11) & i5) & i4)) ^ ((((i13 & i11) & i10) & i9) & i8)) ^ (i2 & (((i7 & i6) & i5) & i4))) ^ (((((i10 & i9) & i8) & i7) & i6) & i5)) & 65535;
    }

    private int d() {
        int i = this.d[0];
        int i2 = (this.d[0] >>> 13) | (this.d[1] << 3);
        int i3 = (this.d[1] >>> 7) | (this.d[2] << 9);
        int i4 = (this.d[2] >>> 6) | (this.d[3] << 10);
        return (((((i ^ i2) ^ i3) ^ i4) ^ ((this.d[3] >>> 3) | (this.d[4] << 13))) ^ ((this.d[3] >>> 14) | (this.d[4] << 2))) & 65535;
    }

    private int e() {
        int i = (this.e[0] >>> 1) | (this.e[1] << 15);
        int i2 = (this.e[0] >>> 2) | (this.e[1] << 14);
        int i3 = (this.e[0] >>> 4) | (this.e[1] << 12);
        int i4 = (this.e[0] >>> 10) | (this.e[1] << 6);
        int i5 = (this.e[1] >>> 15) | (this.e[2] << 1);
        int i6 = (this.e[2] >>> 11) | (this.e[3] << 5);
        int i7 = (this.e[3] >>> 8) | (this.e[4] << 8);
        int i8 = (this.e[3] >>> 15) | (this.e[4] << 1);
        int i9 = (this.d[0] >>> 3) | (this.d[1] << 13);
        int i10 = (this.d[1] >>> 9) | (this.d[2] << 7);
        int i11 = (this.d[2] >>> 14) | (this.d[3] << 2);
        int i12 = this.d[4];
        return (((((((i ^ ((i8 & (i11 & i12)) ^ ((((i9 & i11) & i8) ^ ((((((i10 ^ i8) ^ (i9 & i12)) ^ (i11 & i12)) ^ (i12 & i8)) ^ ((i9 & i10) & i11)) ^ ((i9 & i11) & i12))) ^ ((i10 & i11) & i8)))) ^ i2) ^ i3) ^ i4) ^ i5) ^ i6) ^ i7) & 65535;
    }

    @Override // org.bouncycastle.b.ao
    public final String a() {
        return "Grain v1";
    }

    @Override // org.bouncycastle.b.ao
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof org.bouncycastle.b.k.be)) {
            throw new IllegalArgumentException("Grain v1 Init parameters must include an IV");
        }
        org.bouncycastle.b.k.be beVar = (org.bouncycastle.b.k.be) iVar;
        byte[] bArrA = beVar.a();
        if (bArrA == null || bArrA.length != 8) {
            throw new IllegalArgumentException("Grain v1 requires exactly 8 bytes of IV");
        }
        if (!(beVar.b() instanceof org.bouncycastle.b.k.ba)) {
            throw new IllegalArgumentException("Grain v1 Init parameters must include a key");
        }
        org.bouncycastle.b.k.ba baVar = (org.bouncycastle.b.k.ba) beVar.b();
        this.b = new byte[baVar.a().length];
        this.a = new byte[baVar.a().length];
        this.d = new int[5];
        this.e = new int[5];
        this.c = new byte[2];
        System.arraycopy(bArrA, 0, this.b, 0, bArrA.length);
        System.arraycopy(baVar.a(), 0, this.a, 0, baVar.a().length);
        c();
    }

    @Override // org.bouncycastle.b.ao
    public final int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.h) {
            throw new IllegalStateException("Grain v1 not initialised");
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
            if (this.g > 1) {
                this.f = e();
                this.c[0] = (byte) this.f;
                this.c[1] = (byte) (this.f >> 8);
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
        this.g = 2;
        byte[] bArr = this.a;
        byte[] bArr2 = this.b;
        bArr2[8] = -1;
        bArr2[9] = -1;
        this.a = bArr;
        this.b = bArr2;
        int i = 0;
        for (int i2 = 0; i2 < this.e.length; i2++) {
            this.e[i2] = ((this.a[i + 1] << 8) | (this.a[i] & 255)) & 65535;
            this.d[i2] = ((this.b[i + 1] << 8) | (this.b[i] & 255)) & 65535;
            i += 2;
        }
        for (int i3 = 0; i3 < 10; i3++) {
            this.f = e();
            this.e = a(this.e, (b() ^ this.d[0]) ^ this.f);
            this.d = a(this.d, d() ^ this.f);
        }
        this.h = true;
    }
}
