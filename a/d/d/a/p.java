package a.d.d.a;

/* JADX INFO: compiled from: SmbComReadAndX.java */
/* JADX INFO: loaded from: classes.dex */
public final class p extends a.d.d.a {
    int n;
    int o;
    int p;
    int q;
    private long r;
    private int s;

    public p(a.h hVar, int i, long j, int i2) {
        super(hVar, (byte) 46, (a.d.d.c) null);
        this.s = i;
        this.r = j;
        this.p = i2;
        this.o = i2;
        this.n = -1;
    }

    public final void j(int i) {
        this.o = i;
    }

    public final void W() {
        this.p = 1024;
    }

    public final void k(int i) {
        this.n = i;
    }

    public final void X() {
        this.q = 1024;
    }

    @Override // a.d.d.a
    protected final int a(a.h hVar, byte b) {
        if (b == 4) {
            return hVar.a("ReadAndX.Close");
        }
        return 0;
    }

    @Override // a.d.d.c
    protected final int f(byte[] bArr, int i) {
        a.d.f.a.a(this.s, bArr, i);
        int i2 = i + 2;
        a.d.f.a.b(this.r, bArr, i2);
        int i3 = i2 + 4;
        a.d.f.a.a(this.o, bArr, i3);
        int i4 = i3 + 2;
        a.d.f.a.a(this.p, bArr, i4);
        int i5 = i4 + 2;
        a.d.f.a.b(this.n, bArr, i5);
        int i6 = i5 + 4;
        a.d.f.a.a(this.q, bArr, i6);
        int i7 = i6 + 2;
        a.d.f.a.b(this.r >> 32, bArr, i7);
        return (i7 + 4) - i;
    }

    @Override // a.d.d.c
    protected final int g(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    protected final int h(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    protected final int i(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.a, a.d.d.c
    public final String toString() {
        return new String("SmbComReadAndX[" + super.toString() + ",fid=" + this.s + ",offset=" + this.r + ",maxCount=" + this.o + ",minCount=" + this.p + ",openTimeout=" + this.n + ",remaining=" + this.q + ",offset=" + this.r + "]");
    }
}
