package a.d.d.a;

/* JADX INFO: compiled from: SmbComSeek.java */
/* JADX INFO: loaded from: classes.dex */
public final class r extends a.d.d.c {
    private int n;
    private int o;
    private long p;

    public r(a.h hVar) {
        super(hVar, (byte) 18);
        this.n = 0;
    }

    public final void j(int i) {
        this.n = i;
    }

    public final void q() {
        this.o = 2;
    }

    @Override // a.d.d.c
    protected final int f(byte[] bArr, int i) {
        a.d.f.a.a(this.n, bArr, i);
        int i2 = i + 2;
        a.d.f.a.a(this.o, bArr, i2);
        int i3 = i2 + 2;
        a.d.f.a.b(this.p, bArr, i3);
        return (i3 + 4) - i;
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
}
