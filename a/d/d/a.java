package a.d.d;

import a.d.d;
import a.d.d.a.i;
import a.d.g;
import a.h;
import a.i.e;
import a.u;

/* JADX INFO: compiled from: AndXServerMessageBlock.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends c {
    private static final org.c.b n = org.c.c.a((Class<?>) a.class);
    private byte o;
    private int p;
    private c q;

    protected a(h hVar, byte b, String str) {
        super(hVar, b, str);
        this.o = (byte) -1;
        this.p = 0;
        this.q = null;
    }

    protected a(h hVar, byte b, c cVar) {
        super(hVar, b);
        this.o = (byte) -1;
        this.p = 0;
        this.q = cVar;
        if (cVar != null) {
            this.o = (byte) cVar.c();
        }
    }

    protected a(h hVar) {
        this(hVar, null);
    }

    protected a(h hVar, c cVar) {
        super(hVar);
        this.o = (byte) -1;
        this.p = 0;
        this.q = cVar;
        if (cVar != null) {
            this.o = (byte) cVar.c();
        }
    }

    public final c q() {
        return this.q;
    }

    @Override // a.d.d.c
    public final c r() {
        return this.q;
    }

    protected int a(h hVar, byte b) {
        return 0;
    }

    @Override // a.d.d.c, a.d.b
    public final int b(byte[] bArr, int i) {
        this.a = i;
        int iD = d(bArr, i) + i;
        this.b = (iD + j(bArr, iD)) - i;
        if (this.m != null) {
            this.m.a(bArr, this.a, this.b, this, H());
        }
        return this.b;
    }

    @Override // a.d.d.c, a.d.b
    public final int a(byte[] bArr, int i) throws g {
        this.a = i;
        int iE = e(bArr, i) + i;
        int iK = (iE + k(bArr, iE)) - i;
        this.b = iK;
        if (Q()) {
            byte[] bArr2 = new byte[iK];
            System.arraycopy(bArr, 4, bArr2, 0, iK);
            a(bArr2);
        }
        if (!b(bArr)) {
            throw new g("Signature verification failed for " + getClass().getName());
        }
        return iK;
    }

    private int j(byte[] bArr, int i) {
        int iJ;
        this.i = f(bArr, i + 3 + 2);
        this.i += 4;
        int i2 = this.i + 1 + i;
        this.i /= 2;
        bArr[i] = (byte) (this.i & 255);
        this.j = g(bArr, i2 + 2);
        int i3 = i2 + 1;
        bArr[i2] = (byte) (this.j & 255);
        bArr[i3] = (byte) ((this.j >> 8) & 255);
        int i4 = this.j + i3 + 1;
        if (this.q == null || T().m() || this.c >= a(T(), (byte) this.q.c())) {
            this.o = (byte) -1;
            this.q = null;
            bArr[i + 1] = -1;
            bArr[i + 2] = 0;
            bArr[i + 3] = -34;
            bArr[i + 3 + 1] = -34;
            return i4 - i;
        }
        this.q.c = this.c + 1;
        bArr[i + 1] = this.o;
        bArr[i + 2] = 0;
        this.p = i4 - this.a;
        a.d.f.a.a(this.p, bArr, i + 3);
        this.q.b(C());
        if (this.q instanceof a) {
            this.q.g = this.g;
            iJ = ((a) this.q).j(bArr, i4) + i4;
        } else {
            this.q.i = this.q.f(bArr, i4);
            int i5 = this.q.i + 1 + i4;
            this.q.i /= 2;
            bArr[i4] = (byte) (this.q.i & 255);
            this.q.j = this.q.g(bArr, i5 + 2);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (this.q.j & 255);
            bArr[i6] = (byte) ((this.q.j >> 8) & 255);
            iJ = i6 + 1 + this.q.j;
        }
        return iJ - i;
    }

    private int k(byte[] bArr, int i) {
        int i2 = i + 1;
        this.i = bArr[i];
        if (this.i != 0) {
            this.o = bArr[i2];
            this.p = a.d.f.a.a(bArr, i2 + 2);
            if (this.p == 0) {
                this.o = (byte) -1;
            }
            if (this.i > 2) {
                h(bArr, i2 + 4);
                if (c() == -94 && ((i) this).X() && ((i) this).W() != 1) {
                    this.i += 8;
                }
            }
            i2 = i + 1 + (this.i * 2);
        }
        this.j = a.d.f.a.a(bArr, i2);
        int iK = i2 + 2;
        if (this.j != 0) {
            int i3 = i(bArr, iK);
            if (i3 != this.j && n.b()) {
                n.a("Short read, have " + i3 + ", want " + this.j);
            }
            iK += this.j;
        }
        if (this.d != 0 || this.o == -1) {
            this.o = (byte) -1;
            this.q = null;
        } else {
            if (this.q == null) {
                this.o = (byte) -1;
                throw new u("no andx command supplied with response");
            }
            int i4 = this.p + this.a;
            this.q.a = this.a;
            this.q.a((int) this.o);
            this.q.g(z());
            this.q.a(x());
            this.q.e(y());
            this.q.a_(d_());
            this.q.h(K());
            this.q.b(L());
            this.q.a(J());
            this.q.b(C());
            if (this.q instanceof a) {
                iK = ((a) this.q).k(bArr, i4) + i4;
            } else {
                int iH = i4 + 1;
                bArr[i4] = (byte) (this.q.i & 255);
                if (this.q.i != 0 && this.q.i > 2) {
                    iH += this.q.h(bArr, iH);
                }
                this.q.j = a.d.f.a.a(bArr, iH);
                iK = iH + 2;
                if (this.q.j != 0) {
                    this.q.i(bArr, iK);
                    iK += this.q.j;
                }
            }
            this.q.F();
        }
        return iK - i;
    }

    @Override // a.d.d.c
    public String toString() {
        return new String(super.toString() + ",andxCommand=0x" + e.a(this.o, 2) + ",andxOffset=" + this.p);
    }

    @Override // a.d.d.c, a.d.d
    public final /* bridge */ /* synthetic */ d k() {
        return this.q;
    }

    @Override // a.d.d.c, a.d.c
    public final /* bridge */ /* synthetic */ a.d.c f() {
        return this.q;
    }

    @Override // a.d.d.c, a.i.a.c
    public final /* bridge */ /* synthetic */ a.i.a.c s() {
        return this.q;
    }
}
