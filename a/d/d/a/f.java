package a.d.d.a;

/* JADX INFO: compiled from: SmbComLockingAndX.java */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a.d.d.a {
    private int n;
    private byte o;
    private byte p;
    private long q;
    private a[] r;
    private a[] s;
    private boolean t;

    public f(a.h hVar) {
        super(hVar);
    }

    @Override // a.d.d.c
    protected final int f(byte[] bArr, int i) {
        a.d.f.a.a(this.n, bArr, i);
        int i2 = i + 2;
        bArr[i2] = this.o;
        bArr[i2 + 1] = this.p;
        int i3 = i2 + 2;
        a.d.f.a.b(this.q, bArr, i3);
        int i4 = i3 + 4;
        a.d.f.a.a(this.s != null ? this.s.length : 0L, bArr, i4);
        int i5 = i4 + 2;
        a.d.f.a.a(this.r != null ? this.r.length : 0L, bArr, i5);
        return i - (i5 + 2);
    }

    @Override // a.d.d.c
    protected final int h(byte[] bArr, int i) {
        this.n = a.d.f.a.a(bArr, i);
        int i2 = i + 2;
        this.o = bArr[i2];
        if ((this.o & 16) == 16) {
            this.t = true;
        }
        this.p = bArr[i2 + 1];
        this.q = a.d.f.a.b(bArr, r0);
        int i3 = i2 + 2 + 4;
        this.s = new a[a.d.f.a.a(bArr, i3)];
        int i4 = i3 + 2;
        this.r = new a[a.d.f.a.a(bArr, i4)];
        return i - (i4 + 2);
    }

    @Override // a.d.d.c
    protected final int g(byte[] bArr, int i) {
        int iA;
        if (this.s != null) {
            iA = i;
            for (a aVar : this.s) {
                iA += aVar.a(bArr, iA);
            }
        } else {
            iA = i;
        }
        if (this.r != null) {
            for (a aVar2 : this.r) {
                iA += aVar2.a(bArr, iA);
            }
        }
        return i - iA;
    }

    @Override // a.d.d.c
    protected final int i(byte[] bArr, int i) {
        int iA = i;
        for (int i2 = 0; i2 < this.s.length; i2++) {
            this.s[i2] = W();
            iA += this.s[i2].a(bArr, iA, bArr.length);
        }
        for (int i3 = 0; i3 < this.r.length; i3++) {
            this.r[i3] = W();
            iA += this.r[i3].a(bArr, iA, bArr.length);
        }
        return i - iA;
    }

    private a W() {
        return new a(this.t);
    }

    @Override // a.d.d.a, a.d.d.c
    public final String toString() {
        return new String("SmbComLockingAndX[" + super.toString() + ",fid=" + this.n + ",typeOfLock=" + ((int) this.o) + ",newOplockLevel=" + ((int) this.p) + "]");
    }
}
