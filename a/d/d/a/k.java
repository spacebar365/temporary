package a.d.d.a;

import java.util.Date;

/* JADX INFO: compiled from: SmbComNegotiateResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class k extends a.d.d.c implements a.d.l {
    private static final org.c.b n = org.c.c.a((Class<?>) k.class);
    private int o;
    private b p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private boolean x;

    public k(a.c cVar) {
        super(cVar.a());
        this.w = 0;
        this.p = new b();
        this.v = cVar.a().L();
        this.q = cVar.a().M();
        this.r = cVar.a().R();
        this.s = cVar.a().q();
        this.t = cVar.a().p();
        this.u = cVar.a().af();
        this.x = cVar.a().k();
    }

    @Override // a.d.l
    public final a.m e() {
        return a.m.a;
    }

    @Override // a.d.l
    public final int h_() {
        return this.u;
    }

    @Override // a.d.l
    public final boolean a(a.c cVar) {
        return T().equals(cVar.a());
    }

    public final int q() {
        return this.v;
    }

    public final int W() {
        return this.s;
    }

    public final int X() {
        return this.r;
    }

    public final int Y() {
        return this.w;
    }

    @Override // a.d.l
    public final int i_() {
        return this.t;
    }

    @Override // a.d.l
    public final int j() {
        return this.s;
    }

    public final int Z() {
        return this.q;
    }

    @Override // a.d.l
    public final boolean c(int i) {
        return (this.v & i) == i;
    }

    @Override // a.d.l
    public final boolean h() {
        return !T().d() && c(4096);
    }

    @Override // a.d.l
    public final boolean j_() {
        return (this.q & 4) == 4;
    }

    @Override // a.d.l
    public final void a(a.d.b bVar) {
        if (bVar instanceof a.d.d.c) {
            a.d.d.c cVar = (a.d.d.c) bVar;
            cVar.f(this.q);
            cVar.b(cVar.w() || this.x);
            if (cVar.C()) {
                cVar.f(32768);
            }
            if (cVar instanceof a.d.d.c.a) {
                ((a.d.d.c.a) cVar).j(this.s);
            }
        }
    }

    @Override // a.d.l
    public final void a(a.i.a.e eVar) {
        if (eVar instanceof a.d.d.c) {
            ((a.d.d.c) eVar).b(this.x);
        }
    }

    @Override // a.d.l
    public final boolean k_() {
        return this.p.i || this.p.j;
    }

    @Override // a.d.l
    public final boolean g() {
        return this.p.j;
    }

    public final b aa() {
        return this.p;
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
        this.o = a.d.f.a.a(bArr, i);
        int i2 = i + 2;
        if (this.o > 10) {
            return i2 - i;
        }
        int i3 = i2 + 1;
        this.p.f = bArr[i2] & 255;
        this.p.g = this.p.f & 1;
        this.p.h = (this.p.f & 2) == 2;
        this.p.i = (this.p.f & 4) == 4;
        this.p.j = (this.p.f & 8) == 8;
        this.p.a = a.d.f.a.a(bArr, i3);
        int i4 = i3 + 2;
        this.p.k = a.d.f.a.a(bArr, i4);
        int i5 = i4 + 2;
        this.p.b = a.d.f.a.b(bArr, i5);
        int i6 = i5 + 4;
        this.p.l = a.d.f.a.b(bArr, i6);
        int i7 = i6 + 4;
        this.p.c = a.d.f.a.b(bArr, i7);
        int i8 = i7 + 4;
        this.p.d = a.d.f.a.b(bArr, i8);
        int i9 = i8 + 4;
        this.p.m = a.d.f.a.d(bArr, i9);
        int i10 = i9 + 8;
        int iA = a.d.f.a.a(bArr, i10);
        if (iA > 32767) {
            iA = (65536 - iA) * (-1);
        }
        this.p.n = iA;
        int i11 = i10 + 2;
        int i12 = i11 + 1;
        this.p.o = bArr[i11] & 255;
        return i12 - i;
    }

    @Override // a.d.d.c
    protected final int i(byte[] bArr, int i) {
        int length;
        int iC;
        if ((this.p.d & Integer.MIN_VALUE) == 0) {
            this.p.p = new byte[this.p.o];
            System.arraycopy(bArr, i, this.p.p, 0, this.p.o);
            int i2 = i + this.p.o;
            if (this.j > this.p.o) {
                if ((this.q & 32768) == 32768) {
                    iC = a.i.f.b(bArr, i2, 256);
                    this.p.e = a.i.f.a(bArr, i2, iC);
                } else {
                    iC = a.i.f.c(bArr, i2, 256);
                    this.p.e = a.i.f.a(bArr, i2, iC, T());
                }
                length = iC + i2;
            } else {
                this.p.e = new String();
                length = i2;
            }
        } else {
            this.p.q = new byte[16];
            System.arraycopy(bArr, i, this.p.q, 0, 16);
            length = this.p.q.length + i;
            this.p.e = new String();
            if (this.j > 16) {
                this.p.o = this.j - 16;
                this.p.p = new byte[this.p.o];
                System.arraycopy(bArr, length, this.p.p, 0, this.p.o);
                if (n.c()) {
                    n.b(String.format("Have initial token %s", a.i.e.a(this.p.p, 0, this.p.o)));
                }
            }
        }
        return length - i;
    }

    @Override // a.d.d.c
    public String toString() {
        return new String("SmbComNegotiateResponse[" + super.toString() + ",wordCount=" + this.i + ",dialectIndex=" + this.o + ",securityMode=0x" + a.i.e.a(this.p.f, 1) + ",security=" + (this.p.g == 0 ? "share" : "user") + ",encryptedPasswords=" + this.p.h + ",maxMpxCount=" + this.p.a + ",maxNumberVcs=" + this.p.k + ",maxBufferSize=" + this.p.b + ",maxRawSize=" + this.p.l + ",sessionKey=0x" + a.i.e.a(this.p.c, 8) + ",capabilities=0x" + a.i.e.a(this.p.d, 8) + ",serverTime=" + new Date(this.p.m) + ",serverTimeZone=" + this.p.n + ",encryptionKeyLength=" + this.p.o + ",byteCount=" + this.j + ",oemDomainName=" + this.p.e + "]");
    }

    @Override // a.d.l
    public final int m() {
        return this.r;
    }

    @Override // a.d.l
    public final boolean a(a.c cVar, a.d.k kVar) {
        if (this.o > 10) {
            return false;
        }
        if ((this.p.d & Integer.MIN_VALUE) != Integer.MIN_VALUE && this.p.o != 8 && cVar.a().B() == 0) {
            n.d("Unexpected encryption key length: " + this.p.o);
            return false;
        }
        if (kVar.g_() && !this.p.i) {
            n.e("Signatures are required but the server does not support them");
            return false;
        }
        if (kVar.g_() || this.p.j || (this.p.i && cVar.a().S())) {
            this.q |= 4;
            if (kVar.g_() || this.p.j) {
                this.q |= 16;
            }
        } else {
            this.q &= 65531;
            this.q &= 65519;
        }
        if (n.c()) {
            n.b("Signing " + ((this.q & 4) != 0 ? "enabled " : "not-enabled ") + ((this.q & 16) != 0 ? "required" : "not-required"));
        }
        this.r = Math.min(this.r, this.p.a);
        if (this.r <= 0) {
            this.r = 1;
        }
        this.s = Math.min(this.s, this.p.b);
        this.t = Math.min(this.t, this.p.b);
        this.u = Math.min(this.u, this.p.b);
        this.v &= this.p.d;
        if ((this.p.d & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.v |= Integer.MIN_VALUE;
        }
        if (cVar.a().k() || cVar.a().l()) {
            this.v |= 4;
        }
        if ((this.v & 4) == 0) {
            if (cVar.a().l()) {
                this.v |= 4;
                this.x = true;
            } else {
                this.x = false;
                this.q &= 32767;
            }
        } else {
            this.x = cVar.a().k();
        }
        if (this.x) {
            n.b("Unicode is enabled");
        } else {
            n.b("Unicode is disabled");
        }
        return true;
    }
}
