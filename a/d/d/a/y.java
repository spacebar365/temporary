package a.d.d.a;

/* JADX INFO: compiled from: SmbComWrite.java */
/* JADX INFO: loaded from: classes.dex */
public final class y extends a.d.d.c {
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private byte[] s;

    public y(a.h hVar) {
        super(hVar, (byte) 11);
    }

    public final void a(int i, long j, int i2, byte[] bArr, int i3, int i4) {
        this.n = i;
        this.p = (int) (4294967295L & j);
        this.q = i2;
        this.s = bArr;
        this.r = i3;
        this.o = i4;
        this.m = null;
    }

    @Override // a.d.d.c
    protected final int f(byte[] bArr, int i) {
        a.d.f.a.a(this.n, bArr, i);
        int i2 = i + 2;
        a.d.f.a.a(this.o, bArr, i2);
        int i3 = i2 + 2;
        a.d.f.a.b(this.p, bArr, i3);
        int i4 = i3 + 4;
        a.d.f.a.a(this.q, bArr, i4);
        return (i4 + 2) - i;
    }

    @Override // a.d.d.c
    protected final int g(byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = 1;
        a.d.f.a.a(this.o, bArr, i2);
        int i3 = i2 + 2;
        System.arraycopy(this.s, this.r, bArr, i3, this.o);
        return (i3 + this.o) - i;
    }

    @Override // a.d.d.c
    protected final int h(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    protected final int i(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    public final String toString() {
        return new String("SmbComWrite[" + super.toString() + ",fid=" + this.n + ",count=" + this.o + ",offset=" + this.p + ",remaining=" + this.q + "]");
    }
}
