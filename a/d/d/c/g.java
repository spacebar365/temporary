package a.d.d.c;

/* JADX INFO: compiled from: TransTransactNamedPipe.java */
/* JADX INFO: loaded from: classes.dex */
public class g extends a {
    private static final org.c.b n = org.c.c.a((Class<?>) g.class);
    private int I;
    private byte[] o;
    private int p;
    private int q;

    public g(a.h hVar, int i, byte[] bArr, int i2, int i3) {
        super(hVar, (byte) 37, (byte) 38);
        this.p = i;
        this.o = bArr;
        this.q = i2;
        this.I = i3;
        this.B = 0;
        this.C = 65535;
        this.D = (byte) 0;
        this.F = 2;
        this.G = "\\PIPE\\";
    }

    @Override // a.d.d.c.a
    protected final int j(byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = X();
        bArr[i2] = 0;
        a.d.f.a.a(this.p, bArr, i2 + 1);
        return 4;
    }

    @Override // a.d.d.c.a
    protected final int k(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c.a
    protected final int l(byte[] bArr, int i) {
        if (bArr.length - i < this.I) {
            n.b("TransTransactNamedPipe data too long for buffer");
            return 0;
        }
        System.arraycopy(this.o, this.q, bArr, i, this.I);
        return this.I;
    }

    @Override // a.d.d.c.a, a.d.d.c
    public String toString() {
        return new String("TransTransactNamedPipe[" + super.toString() + ",pipeFid=" + this.p + "]");
    }
}
