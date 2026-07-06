package a.d.d.d;

/* JADX INFO: compiled from: Trans2FindNext2.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a.d.d.c.a {
    private String I;
    private long J;
    private int n;
    private int o;
    private int p;
    private int q;

    public c(a.h hVar, int i, int i2, String str, int i3, int i4) {
        super(hVar, (byte) 50, (byte) 2);
        this.n = i;
        this.p = i2;
        this.I = str;
        this.o = 260;
        this.q = 0;
        this.B = 8;
        this.J = i3;
        this.C = i4;
        this.D = (byte) 0;
    }

    @Override // a.d.d.c.a
    public final void a(int i, String str) {
        super.e_();
        this.p = i;
        this.I = str;
        this.e = 0;
    }

    @Override // a.d.d.c.a
    protected final int j(byte[] bArr, int i) {
        bArr[i] = X();
        bArr[i + 1] = 0;
        return 2;
    }

    @Override // a.d.d.c.a
    protected final int k(byte[] bArr, int i) {
        a.d.f.a.a(this.n, bArr, i);
        int i2 = i + 2;
        a.d.f.a.a(this.J, bArr, i2);
        int i3 = i2 + 2;
        a.d.f.a.a(this.o, bArr, i3);
        int i4 = i3 + 2;
        a.d.f.a.b(this.p, bArr, i4);
        int i5 = i4 + 4;
        a.d.f.a.a(this.q, bArr, i5);
        int i6 = i5 + 2;
        return (i6 + a(this.I, bArr, i6)) - i;
    }

    @Override // a.d.d.c.a
    protected final int l(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c.a, a.d.d.c
    public final String toString() {
        return new String("Trans2FindNext2[" + super.toString() + ",sid=" + this.n + ",searchCount=" + T().ai() + ",informationLevel=0x" + a.i.e.a(this.o, 3) + ",resumeKey=0x" + a.i.e.a(this.p, 4) + ",flags=0x" + a.i.e.a(this.q, 2) + ",filename=" + this.I + "]");
    }
}
