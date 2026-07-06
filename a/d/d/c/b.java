package a.d.d.c;

import java.util.Enumeration;

/* JADX INFO: compiled from: SmbComTransactionResponse.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends a.d.d.c implements Enumeration<b> {
    volatile boolean A;
    byte[] B;
    private int C;
    private int D;
    private boolean E;
    private boolean F;
    private int G;
    private int H;
    private a.g.j[] I;
    protected int n;
    protected int o;
    protected int p;
    protected int q;
    protected int r;
    protected int s;
    protected int t;
    protected int u;
    protected int v;
    protected int w;
    int x;
    byte y;
    volatile boolean z;

    protected abstract int a(byte[] bArr, int i, int i2);

    protected abstract int j(byte[] bArr, int i);

    @Override // java.util.Enumeration
    public /* synthetic */ b nextElement() {
        return q();
    }

    protected b(a.h hVar) {
        super(hVar);
        this.z = true;
        this.A = true;
    }

    protected b(a.h hVar, byte b) {
        super(hVar, (byte) 50);
        this.z = true;
        this.A = true;
        this.y = (byte) 1;
    }

    protected final int W() {
        return this.x;
    }

    public final void c(byte[] bArr) {
        this.B = bArr;
    }

    public final byte[] X() {
        byte[] bArr = this.B;
        this.B = null;
        return bArr;
    }

    public final byte Y() {
        return this.y;
    }

    public final void b(byte b) {
        this.y = b;
    }

    public final int Z() {
        return this.G;
    }

    protected final void j(int i) {
        this.G = i;
    }

    public final int aa() {
        return this.H;
    }

    protected final void k(int i) {
        this.H = i;
    }

    public final a.g.j[] ab() {
        return this.I;
    }

    protected final void a(a.g.j[] jVarArr) {
        this.I = jVarArr;
    }

    @Override // a.d.d.c, a.d.b, a.i.a.e
    public final void e_() {
        super.e_();
        this.w = 0;
        this.z = true;
        this.A = true;
        this.F = false;
        this.E = false;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.d == 0 && this.z;
    }

    private b q() {
        if (this.A) {
            this.A = false;
        }
        return this;
    }

    @Override // a.d.d.c
    protected final int f(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    protected final int g(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c, a.d.b
    public final int a(byte[] bArr, int i) throws a.d.g {
        int iA = super.a(bArr, i);
        if (this.j == 0) {
            i(bArr, iA + i);
        }
        q();
        return iA;
    }

    @Override // a.d.d.c
    protected final int h(byte[] bArr, int i) {
        this.n = a.d.f.a.a(bArr, i);
        if (this.w == 0) {
            this.w = this.n;
        }
        int i2 = i + 2;
        this.o = a.d.f.a.a(bArr, i2);
        int i3 = i2 + 4;
        this.p = a.d.f.a.a(bArr, i3);
        int i4 = i3 + 2;
        this.q = a.d.f.a.a(bArr, i4);
        int i5 = i4 + 2;
        this.r = a.d.f.a.a(bArr, i5);
        int i6 = i5 + 2;
        this.x = a.d.f.a.a(bArr, i6);
        int i7 = i6 + 2;
        this.s = a.d.f.a.a(bArr, i7);
        int i8 = i7 + 2;
        this.t = a.d.f.a.a(bArr, i8);
        int i9 = i8 + 2;
        this.u = bArr[i9] & 255;
        return (i9 + 2) - i;
    }

    @Override // a.d.d.c
    protected final int i(byte[] bArr, int i) {
        this.D = 0;
        this.C = 0;
        if (this.p > 0) {
            int i2 = this.q - (i - this.a);
            this.C = i2;
            int i3 = i2 + i;
            System.arraycopy(bArr, i3, this.B, this.v + this.r, this.p);
            i = i3 + this.p;
        }
        if (this.x > 0) {
            int i4 = this.s - (i - this.a);
            this.D = i4;
            System.arraycopy(bArr, i4 + i, this.B, this.w + this.t, this.x);
        }
        if (!this.E && this.r + this.p == this.n) {
            this.E = true;
        }
        if (!this.F && this.t + this.x == this.o) {
            this.F = true;
        }
        if (this.E && this.F) {
            j(this.B, this.v);
            a(this.B, this.w, this.o);
            this.z = false;
        }
        return this.C + this.p + this.D + this.x;
    }

    @Override // a.d.d.c
    public String toString() {
        return new String(super.toString() + ",totalParameterCount=" + this.n + ",totalDataCount=" + this.o + ",parameterCount=" + this.p + ",parameterOffset=" + this.q + ",parameterDisplacement=" + this.r + ",dataCount=" + this.x + ",dataOffset=" + this.s + ",dataDisplacement=" + this.t + ",setupCount=" + this.u + ",pad=" + this.C + ",pad1=" + this.D);
    }
}
