package a.e;

/* JADX INFO: compiled from: NodeStatusResponse.java */
/* JADX INFO: loaded from: classes.dex */
final class k extends g {
    h[] A;
    private h B;
    private int C;
    private byte[] D;
    private byte[] E;

    k(a.h hVar, h hVar2) {
        super(hVar);
        this.B = hVar2;
        this.r = new b(hVar);
        this.D = new byte[6];
    }

    @Override // a.e.g
    final int a(byte[] bArr) {
        return 0;
    }

    @Override // a.e.g
    final int b(byte[] bArr) {
        return d(bArr, 12);
    }

    @Override // a.e.g
    final int a(byte[] bArr, int i) {
        boolean z;
        this.C = bArr[i] & 255;
        int i2 = this.C * 18;
        int i3 = (this.x - i2) - 1;
        int i4 = i + 1;
        this.C = bArr[i] & 255;
        System.arraycopy(bArr, i2 + i4, this.D, 0, 6);
        this.A = new h[this.C];
        String str = this.B.b.b;
        int i5 = 0;
        boolean z2 = false;
        int i6 = i4;
        while (i5 < this.C) {
            int i7 = i6 + 14;
            while (bArr[i7] == 32) {
                i7--;
            }
            String strA = a.i.f.a(bArr, i6, (i7 - i6) + 1, this.z);
            int i8 = bArr[i6 + 15] & 255;
            boolean z3 = (bArr[i6 + 16] & 128) == 128;
            int i9 = (bArr[i6 + 16] & 96) >> 5;
            boolean z4 = (bArr[i6 + 16] & 16) == 16;
            boolean z5 = (bArr[i6 + 16] & 8) == 8;
            boolean z6 = (bArr[i6 + 16] & 4) == 4;
            boolean z7 = (bArr[i6 + 16] & 2) == 2;
            if (!z2 && this.B.b.c == i8 && (this.B.b.d() || this.B.b.a.equals(strA))) {
                if (this.B.b.d()) {
                    this.B.b = new b(this.z, strA, i8, str);
                }
                this.B.e = z3;
                this.B.d = i9;
                this.B.f = z4;
                this.B.g = z5;
                this.B.h = z6;
                this.B.i = z7;
                this.B.k = this.D;
                this.B.j = true;
                z = true;
                this.A[i5] = this.B;
            } else {
                this.A[i5] = new h(new b(this.z, strA, i8, str), this.B.c, z3, i9, z4, z5, z6, z7, this.D);
                z = z2;
            }
            i5++;
            z2 = z;
            i6 += 18;
        }
        int i10 = (i6 - i4) + i4;
        this.E = new byte[i3];
        System.arraycopy(bArr, i10, this.E, 0, i3);
        return (i10 + i3) - i;
    }

    @Override // a.e.g
    public final String toString() {
        return new String("NodeStatusResponse[" + super.toString() + "]");
    }
}
