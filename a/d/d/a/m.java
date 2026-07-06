package a.d.d.a;

/* JADX INFO: compiled from: SmbComOpenAndXResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class m extends a.d.d.a implements a.d.i {
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private long v;

    public m(a.h hVar) {
        super(hVar);
    }

    public final int W() {
        return this.n;
    }

    public final int X() {
        return this.p;
    }

    public final int Y() {
        return this.r;
    }

    @Override // a.d.i
    public final long d() {
        return this.v;
    }

    @Override // a.d.i
    public final long b_() {
        return 0L;
    }

    @Override // a.d.i
    public final long e() {
        return 0L;
    }

    @Override // a.d.d.c
    protected final int f(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    protected final int g(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    protected final int h(byte[] bArr, int i) {
        this.n = a.d.f.a.a(bArr, i);
        int i2 = i + 2;
        this.o = a.d.f.a.a(bArr, i2);
        int i3 = i2 + 2;
        this.v = a.d.f.a.e(bArr, i3);
        int i4 = i3 + 4;
        this.p = a.d.f.a.b(bArr, i4);
        int i5 = i4 + 4;
        this.q = a.d.f.a.a(bArr, i5);
        int i6 = i5 + 2;
        this.r = a.d.f.a.a(bArr, i6);
        int i7 = i6 + 2;
        this.s = a.d.f.a.a(bArr, i7);
        int i8 = i7 + 2;
        this.t = a.d.f.a.a(bArr, i8);
        int i9 = i8 + 2;
        this.u = a.d.f.a.b(bArr, i9);
        return (i9 + 6) - i;
    }

    @Override // a.d.d.c
    protected final int i(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.a, a.d.d.c
    public final String toString() {
        return new String("SmbComOpenAndXResponse[" + super.toString() + ",fid=" + this.n + ",fileAttributes=" + this.o + ",lastWriteTime=" + this.v + ",dataSize=" + this.p + ",grantedAccess=" + this.q + ",fileType=" + this.r + ",deviceState=" + this.s + ",action=" + this.t + ",serverFid=" + this.u + "]");
    }

    @Override // a.d.i
    public final long c_() {
        return this.p;
    }

    @Override // a.d.i
    public final int b() {
        return this.o;
    }
}
