package a.d.d.c;

import java.util.Enumeration;

/* JADX INFO: compiled from: SmbComTransaction.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends a.d.d.c implements Enumeration<a> {
    protected int A;
    protected int B;
    protected int C;
    protected byte D;
    protected int E;
    protected int F;
    protected String G;
    protected int H;
    private boolean I;
    private int J;
    private int K;
    private byte L;
    private byte[] M;
    private int n;
    private int o;
    private int p;
    private boolean q;
    protected int r;
    protected int s;
    protected int t;
    protected int u;
    protected int v;
    protected int w;
    protected int x;
    protected int y;
    protected int z;

    protected abstract int j(byte[] bArr, int i);

    protected abstract int k(byte[] bArr, int i);

    protected abstract int l(byte[] bArr, int i);

    @Override // java.util.Enumeration
    public /* synthetic */ a nextElement() {
        return Z();
    }

    protected a(a.h hVar, byte b, byte b2) {
        super(hVar, b);
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = true;
        this.I = true;
        this.E = 0;
        this.F = 1;
        this.G = "";
        this.L = b2;
        this.C = hVar.af() - 512;
        this.B = 1024;
        this.r = 61;
        this.s = 51;
    }

    public final void j(int i) {
        this.H = i;
    }

    public final void q() {
        this.C = 1024;
    }

    public final void c(byte[] bArr) {
        this.M = bArr;
    }

    public final byte[] W() {
        byte[] bArr = this.M;
        this.M = null;
        return bArr;
    }

    public final byte X() {
        return this.L;
    }

    public final void Y() {
        this.L = (byte) -41;
    }

    @Override // a.d.d.c, a.d.b, a.i.a.e
    public final void e_() {
        super.e_();
        this.q = true;
        this.I = true;
    }

    protected void a(int i, String str) {
        e_();
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.q;
    }

    public final a Z() {
        if (this.I) {
            this.I = false;
            this.u = this.r + (this.F * 2) + 2;
            if (c() != -96) {
                if (c() == 37 && !U()) {
                    this.u += a(this.G, this.u);
                }
            } else if (c() == -96) {
                this.u += 2;
            }
            this.o = this.u % aa();
            this.o = this.o == 0 ? 0 : aa() - this.o;
            this.u += this.o;
            this.z = k(this.M, this.J);
            this.K = this.z;
            int i = this.H - this.u;
            this.t = Math.min(this.z, i);
            int i2 = i - this.t;
            this.x = this.u + this.t;
            this.p = this.x % aa();
            this.p = this.p == 0 ? 0 : aa() - this.p;
            this.x += this.p;
            this.A = l(this.M, this.K);
            this.w = Math.min(this.A, i2);
        } else {
            if (c() != -96) {
                a(38);
            } else {
                a(-95);
            }
            this.u = 51;
            if (this.z - this.v > 0) {
                this.o = this.u % aa();
                this.o = this.o == 0 ? 0 : aa() - this.o;
                this.u += this.o;
            }
            this.v += this.t;
            int i3 = (this.H - this.u) - this.o;
            this.t = Math.min(this.z - this.v, i3);
            int i4 = i3 - this.t;
            this.x = this.u + this.t;
            this.p = this.x % aa();
            this.p = this.p == 0 ? 0 : aa() - this.p;
            this.x += this.p;
            this.y += this.w;
            this.w = Math.min(this.A - this.y, i4 - this.p);
        }
        if (this.v + this.t >= this.z && this.y + this.w >= this.A) {
            this.q = false;
        }
        return this;
    }

    public int aa() {
        return 2;
    }

    @Override // a.d.d.c
    protected int f(byte[] bArr, int i) {
        int iJ;
        a.d.f.a.a(this.z, bArr, i);
        int i2 = i + 2;
        a.d.f.a.a(this.A, bArr, i2);
        int i3 = i2 + 2;
        if (c() != 38) {
            a.d.f.a.a(this.B, bArr, i3);
            int i4 = i3 + 2;
            a.d.f.a.a(this.C, bArr, i4);
            int i5 = i4 + 2;
            int i6 = i5 + 1;
            bArr[i5] = this.D;
            int i7 = i6 + 1;
            bArr[i6] = 0;
            a.d.f.a.a(this.n, bArr, i7);
            int i8 = i7 + 2;
            a.d.f.a.b(this.E, bArr, i8);
            int i9 = i8 + 4;
            int i10 = i9 + 1;
            bArr[i9] = 0;
            i3 = i10 + 1;
            bArr[i10] = 0;
        }
        a.d.f.a.a(this.t, bArr, i3);
        int i11 = i3 + 2;
        a.d.f.a.a(this.u, bArr, i11);
        int i12 = i11 + 2;
        if (c() == 38) {
            a.d.f.a.a(this.v, bArr, i12);
            i12 += 2;
        }
        a.d.f.a.a(this.w, bArr, i12);
        int i13 = i12 + 2;
        a.d.f.a.a(this.w == 0 ? 0 : this.x, bArr, i13);
        int i14 = i13 + 2;
        if (c() == 38) {
            a.d.f.a.a(this.y, bArr, i14);
            iJ = i14 + 2;
        } else {
            int i15 = i14 + 1;
            bArr[i14] = (byte) this.F;
            int i16 = i15 + 1;
            bArr[i15] = 0;
            iJ = i16 + j(bArr, i16);
        }
        return iJ - i;
    }

    @Override // a.d.d.c
    protected final int g(byte[] bArr, int i) {
        int i2 = this.o;
        int iA = (c() != 37 || U()) ? i : a(this.G, bArr, i) + i;
        if (this.t > 0) {
            int i3 = iA;
            while (true) {
                int i4 = i2 - 1;
                if (i2 <= 0) {
                    break;
                }
                bArr[i3] = 0;
                i2 = i4;
                i3++;
            }
            System.arraycopy(this.M, this.J, bArr, i3, this.t);
            iA = this.t + i3;
        }
        if (this.w > 0) {
            int i5 = this.p;
            int i6 = iA;
            while (true) {
                int i7 = i5 - 1;
                if (i5 <= 0) {
                    break;
                }
                bArr[i6] = 0;
                i5 = i7;
                i6++;
            }
            System.arraycopy(this.M, this.K, bArr, i6, this.w);
            this.K += this.w;
            iA = this.w + i6;
        }
        return iA - i;
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
    public String toString() {
        return new String(super.toString() + ",totalParameterCount=" + this.z + ",totalDataCount=" + this.A + ",maxParameterCount=" + this.B + ",maxDataCount=" + this.C + ",maxSetupCount=" + ((int) this.D) + ",flags=0x" + a.i.e.a(this.n, 2) + ",timeout=" + this.E + ",parameterCount=" + this.t + ",parameterOffset=" + this.u + ",parameterDisplacement=" + this.v + ",dataCount=" + this.w + ",dataOffset=" + this.x + ",dataDisplacement=" + this.y + ",setupCount=" + this.F + ",pad=" + this.o + ",pad1=" + this.p);
    }
}
