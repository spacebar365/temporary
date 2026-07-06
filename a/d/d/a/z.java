package a.d.d.a;

/* JADX INFO: compiled from: SmbComWriteAndX.java */
/* JADX INFO: loaded from: classes.dex */
public final class z extends a.d.d.a {
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private byte[] s;
    private long t;
    private int u;
    private int v;

    public z(a.h hVar) {
        super(hVar, (byte) 47, (a.d.d.c) null);
    }

    public final void a(int i, long j, int i2, byte[] bArr, int i3, int i4) {
        this.n = i;
        this.t = j;
        this.o = i2;
        this.s = bArr;
        this.r = i3;
        this.p = i4;
        this.m = null;
    }

    public final void j(int i) {
        this.v = i;
    }

    @Override // a.d.d.a
    protected final int a(a.h hVar, byte b) {
        if (b == 46) {
            return hVar.a("WriteAndX.ReadAndX");
        }
        if (b == 4) {
            return hVar.a("WriteAndX.Close");
        }
        return 0;
    }

    @Override // a.d.d.c
    protected final int f(byte[] bArr, int i) {
        this.q = (i - this.a) + 26;
        this.u = (this.q - this.a) % 4;
        this.u = this.u == 0 ? 0 : 4 - this.u;
        this.q += this.u;
        a.d.f.a.a(this.n, bArr, i);
        int i2 = i + 2;
        a.d.f.a.b(this.t, bArr, i2);
        int i3 = i2 + 4;
        int i4 = 0;
        while (i4 < 4) {
            bArr[i3] = -1;
            i4++;
            i3++;
        }
        a.d.f.a.a(this.v, bArr, i3);
        int i5 = i3 + 2;
        a.d.f.a.a(this.o, bArr, i5);
        int i6 = i5 + 2;
        int i7 = i6 + 1;
        bArr[i6] = 0;
        int i8 = i7 + 1;
        bArr[i7] = 0;
        a.d.f.a.a(this.p, bArr, i8);
        int i9 = i8 + 2;
        a.d.f.a.a(this.q, bArr, i9);
        int i10 = i9 + 2;
        a.d.f.a.b(this.t >> 32, bArr, i10);
        return (i10 + 4) - i;
    }

    @Override // a.d.d.c
    protected final int g(byte[] bArr, int i) {
        int i2 = i;
        while (true) {
            int i3 = this.u;
            this.u = i3 - 1;
            if (i3 > 0) {
                bArr[i2] = -18;
                i2++;
            } else {
                System.arraycopy(this.s, this.r, bArr, i2, this.p);
                return (i2 + this.p) - i;
            }
        }
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
        return new String("SmbComWriteAndX[" + super.toString() + ",fid=" + this.n + ",offset=" + this.t + ",writeMode=" + this.v + ",remaining=" + this.o + ",dataLength=" + this.p + ",dataOffset=" + this.q + "]");
    }
}
