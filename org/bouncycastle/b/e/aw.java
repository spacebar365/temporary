package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class aw implements org.bouncycastle.b.e {
    protected boolean a;
    protected int[] b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;

    aw() {
    }

    protected static int a(int i, int i2) {
        return (i << i2) | (i >>> (-i2));
    }

    private static int b(int i, int i2) {
        return (i >>> i2) | (i << (-i2));
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.b == null) {
            throw new IllegalStateException(a() + " not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new org.bouncycastle.b.o("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new org.bouncycastle.b.ac("output buffer too short");
        }
        if (this.a) {
            b(bArr, i, bArr2, i2);
            return 16;
        }
        c(bArr, i, bArr2, i2);
        return 16;
    }

    @Override // org.bouncycastle.b.e
    public String a() {
        return "Serpent";
    }

    protected final void a(int i, int i2, int i3, int i4) {
        int i5 = i ^ i4;
        int i6 = i3 ^ i5;
        int i7 = i2 ^ i6;
        this.f = (i & i4) ^ i7;
        int i8 = (i5 & i2) ^ i;
        this.e = i7 ^ (i3 | i8);
        int i9 = this.f & (i6 ^ i8);
        this.d = (i6 ^ (-1)) ^ i9;
        this.c = (i8 ^ (-1)) ^ i9;
    }

    @Override // org.bouncycastle.b.e
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        if (!(iVar instanceof org.bouncycastle.b.k.ba)) {
            throw new IllegalArgumentException("invalid parameter passed to " + a() + " init - " + iVar.getClass().getName());
        }
        this.a = z;
        this.b = a(((org.bouncycastle.b.k.ba) iVar).a());
    }

    protected abstract int[] a(byte[] bArr);

    @Override // org.bouncycastle.b.e
    public final int b() {
        return 16;
    }

    protected final void b(int i, int i2, int i3, int i4) {
        int i5 = i ^ (-1);
        int i6 = i ^ i2;
        int i7 = (i5 | i6) ^ i4;
        int i8 = i3 ^ i7;
        this.e = i6 ^ i8;
        int i9 = i5 ^ (i6 & i4);
        this.d = (this.e & i9) ^ i7;
        this.f = (i & i7) ^ (this.d | i8);
        this.c = (i9 ^ i8) ^ this.f;
    }

    protected abstract void b(byte[] bArr, int i, byte[] bArr2, int i2);

    @Override // org.bouncycastle.b.e
    public final void c() {
    }

    protected final void c(int i, int i2, int i3, int i4) {
        int i5 = (i ^ (-1)) ^ i2;
        int i6 = (i | i5) ^ i3;
        this.e = i4 ^ i6;
        int i7 = (i4 | i5) ^ i2;
        int i8 = i5 ^ this.e;
        this.f = (i6 & i7) ^ i8;
        int i9 = i7 ^ i6;
        this.d = this.f ^ i9;
        this.c = (i8 & i9) ^ i6;
    }

    protected abstract void c(byte[] bArr, int i, byte[] bArr2, int i2);

    protected final void d() {
        int iA = a(this.c, 13);
        int iA2 = a(this.e, 3);
        int i = (this.d ^ iA) ^ iA2;
        int i2 = (this.f ^ iA2) ^ (iA << 3);
        this.d = a(i, 1);
        this.f = a(i2, 7);
        this.c = a((iA ^ this.d) ^ this.f, 5);
        this.e = a((this.f ^ iA2) ^ (this.d << 7), 22);
    }

    protected final void d(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i4;
        int i6 = (i2 & i5) ^ i;
        int i7 = i5 ^ i6;
        this.f = i3 ^ i7;
        int i8 = (i5 & i6) ^ i2;
        this.d = i6 ^ (this.f | i8);
        int i9 = this.d ^ (-1);
        int i10 = i8 ^ this.f;
        this.c = i9 ^ i10;
        this.e = (i10 | i9) ^ i7;
    }

    protected final void e() {
        int iB = (b(this.e, 22) ^ this.f) ^ (this.d << 7);
        int iB2 = (b(this.c, 5) ^ this.d) ^ this.f;
        int iB3 = b(this.f, 7);
        int iB4 = b(this.d, 1);
        this.f = (iB3 ^ iB) ^ (iB2 << 3);
        this.d = (iB4 ^ iB2) ^ iB;
        this.e = b(iB, 3);
        this.c = b(iB2, 13);
    }

    protected final void e(int i, int i2, int i3, int i4) {
        int i5 = i ^ (-1);
        int i6 = i2 ^ i4;
        this.c = (i3 & i5) ^ i6;
        int i7 = i3 ^ i5;
        int i8 = (this.c ^ i3) & i2;
        this.f = i7 ^ i8;
        this.e = ((i7 | this.c) & (i8 | i4)) ^ i;
        this.d = ((i5 | i4) ^ this.e) ^ (i6 ^ this.f);
    }

    protected final void f(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i4;
        int i6 = i ^ i3;
        int i7 = i3 ^ i5;
        this.c = (i2 & i7) ^ i6;
        this.f = i5 ^ ((((i5 ^ (-1)) | i) ^ i4) | i6);
        int i8 = i7 ^ (-1);
        int i9 = this.c | this.f;
        this.d = i8 ^ i9;
        this.e = (i8 & i4) ^ (i9 ^ i6);
    }

    protected final void g(int i, int i2, int i3, int i4) {
        int i5 = i ^ i2;
        int i6 = i | i4;
        int i7 = i3 ^ i4;
        int i8 = (i & i3) | (i5 & i6);
        this.e = i7 ^ i8;
        int i9 = i8 ^ (i6 ^ i2);
        this.c = i5 ^ (i7 & i9);
        int i10 = this.e & this.c;
        this.d = i9 ^ i10;
        this.f = (i10 ^ i7) ^ (i2 | i4);
    }

    protected final void h(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i3;
        int i6 = (i2 & i5) ^ i;
        int i7 = i4 | i6;
        this.c = i5 ^ i7;
        int i8 = (i5 | i7) ^ i4;
        this.e = (i3 ^ i6) ^ i8;
        int i9 = (i | i2) ^ i8;
        this.f = (this.c & i9) ^ i6;
        this.d = (i9 ^ this.c) ^ this.f;
    }

    protected final void i(int i, int i2, int i3, int i4) {
        int i5 = i ^ i4;
        int i6 = (i4 & i5) ^ i3;
        int i7 = i2 | i6;
        this.f = i5 ^ i7;
        int i8 = i2 ^ (-1);
        this.c = (i5 | i8) ^ i6;
        int i9 = i5 ^ i8;
        this.e = (i7 & i9) ^ (this.c & i);
        this.d = (i9 & this.e) ^ (i6 ^ i);
    }

    protected final void j(int i, int i2, int i3, int i4) {
        int i5 = ((i3 | i4) & i) ^ i2;
        int i6 = (i & i5) ^ i3;
        this.d = i4 ^ i6;
        int i7 = i ^ (-1);
        this.f = (i6 & this.d) ^ i5;
        int i8 = (this.d | i7) ^ i4;
        this.c = this.f ^ i8;
        this.e = (i5 & i8) ^ (this.d ^ i7);
    }

    protected final void k(int i, int i2, int i3, int i4) {
        int i5 = i ^ (-1);
        int i6 = i ^ i2;
        int i7 = i ^ i4;
        this.c = (i3 ^ i5) ^ (i6 | i7);
        int i8 = this.c & i4;
        this.d = (this.c ^ i6) ^ i8;
        int i9 = (i5 | this.c) ^ i7;
        this.e = (i6 | i8) ^ i9;
        this.f = (i9 & this.d) ^ (i2 ^ i8);
    }

    protected final void l(int i, int i2, int i3, int i4) {
        int i5 = i3 ^ (-1);
        int i6 = (i2 & i5) ^ i4;
        int i7 = i & i6;
        this.f = (i2 ^ i5) ^ i7;
        int i8 = this.f | i2;
        this.d = i6 ^ (i & i8);
        int i9 = i | i4;
        this.c = (i5 ^ i8) ^ i9;
        this.e = (i2 & i9) ^ ((i ^ i3) | i7);
    }

    protected final void m(int i, int i2, int i3, int i4) {
        int i5 = i ^ i4;
        int i6 = i2 ^ i5;
        int i7 = ((i ^ (-1)) | i5) ^ i3;
        this.d = i2 ^ i7;
        int i8 = (i5 | this.d) ^ i4;
        this.e = (i7 & i8) ^ i6;
        int i9 = i8 ^ i7;
        this.c = this.e ^ i9;
        this.f = (i7 ^ (-1)) ^ (i9 & i6);
    }

    protected final void n(int i, int i2, int i3, int i4) {
        int i5 = i ^ (-1);
        int i6 = i ^ i2;
        int i7 = i3 ^ i6;
        int i8 = (i3 | i5) ^ i4;
        this.d = i7 ^ i8;
        int i9 = i6 ^ (i7 & i8);
        this.f = i8 ^ (i2 | i9);
        int i10 = this.f | i2;
        this.c = i9 ^ i10;
        this.e = (i5 & i4) ^ (i7 ^ i10);
    }

    protected final void o(int i, int i2, int i3, int i4) {
        int i5 = i2 ^ i3;
        int i6 = (i3 & i5) ^ i4;
        int i7 = i ^ i6;
        this.d = ((i4 | i5) & i7) ^ i2;
        int i8 = this.d | i6;
        this.f = i5 ^ (i & i7);
        int i9 = i7 ^ i8;
        this.e = i6 ^ (this.f & i9);
        this.c = (i9 ^ (-1)) ^ (this.f & this.e);
    }

    protected final void p(int i, int i2, int i3, int i4) {
        int i5 = (i & i2) | i3;
        int i6 = (i | i2) & i4;
        this.f = i5 ^ i6;
        int i7 = i6 ^ i2;
        this.d = (((i4 ^ (-1)) ^ this.f) | i7) ^ i;
        this.c = (i7 ^ i3) ^ (this.d | i4);
        this.e = (i5 ^ this.d) ^ (this.c ^ (this.f & i));
    }
}
