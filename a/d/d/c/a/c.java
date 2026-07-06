package a.d.d.c.a;

/* JADX INFO: compiled from: SmbComNtTransaction.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a.d.d.c.a {
    private final int n;

    @Override // a.d.d.c.a, a.d.d.c
    protected final int f(byte[] bArr, int i) {
        int i2;
        int iJ;
        if (c() != -95) {
            i2 = i + 1;
            bArr[i] = this.D;
        } else {
            i2 = i + 1;
            bArr[i] = 0;
        }
        int i3 = i2 + 1;
        bArr[i2] = 0;
        int i4 = i3 + 1;
        bArr[i3] = 0;
        a.d.f.a.b(this.z, bArr, i4);
        int i5 = i4 + 4;
        a.d.f.a.b(this.A, bArr, i5);
        int i6 = i5 + 4;
        if (c() != -95) {
            a.d.f.a.b(this.B, bArr, i6);
            int i7 = i6 + 4;
            a.d.f.a.b(this.C, bArr, i7);
            i6 = i7 + 4;
        }
        a.d.f.a.b(this.t, bArr, i6);
        int i8 = i6 + 4;
        a.d.f.a.b(this.t == 0 ? 0 : this.u, bArr, i8);
        int i9 = i8 + 4;
        if (c() == -95) {
            a.d.f.a.b(this.v, bArr, i9);
            i9 += 4;
        }
        a.d.f.a.b(this.w, bArr, i9);
        int i10 = i9 + 4;
        a.d.f.a.b(this.w == 0 ? 0 : this.x, bArr, i10);
        int i11 = i10 + 4;
        if (c() == -95) {
            a.d.f.a.b(this.y, bArr, i11);
            int i12 = i11 + 4;
            iJ = i12 + 1;
            bArr[i12] = 0;
        } else {
            int i13 = i11 + 1;
            bArr[i11] = (byte) this.F;
            a.d.f.a.a(this.n, bArr, i13);
            int i14 = i13 + 2;
            iJ = i14 + j(bArr, i14);
        }
        return iJ - i;
    }
}
