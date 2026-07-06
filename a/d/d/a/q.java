package a.d.d.a;

/* JADX INFO: compiled from: SmbComReadAndXResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class q extends a.d.d.a {
    private byte[] n;
    private int o;
    private int p;
    private int q;
    private int r;

    public q(a.h hVar, byte[] bArr, int i) {
        super(hVar);
        this.n = bArr;
        this.o = i;
    }

    public final byte[] W() {
        return this.n;
    }

    public final int X() {
        return this.o;
    }

    public final void j(int i) {
        this.o += i;
    }

    public final int Y() {
        return this.q;
    }

    public final int Z() {
        return this.r;
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
        int i2 = i + 2;
        this.p = a.d.f.a.a(bArr, i2);
        int i3 = i2 + 4;
        this.q = a.d.f.a.a(bArr, i3);
        int i4 = i3 + 2;
        this.r = a.d.f.a.a(bArr, i4);
        return (i4 + 12) - i;
    }

    @Override // a.d.d.c
    protected final int i(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.a, a.d.d.c
    public final String toString() {
        return new String("SmbComReadAndXResponse[" + super.toString() + ",dataCompactionMode=" + this.p + ",dataLength=" + this.q + ",dataOffset=" + this.r + "]");
    }
}
