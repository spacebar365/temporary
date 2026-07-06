package a.d.e;

import a.g.ad;
import a.h;

/* JADX INFO: compiled from: ServerMessageBlock2.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements a.d.b {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private byte[] g;
    private f h;
    private h i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private int p;
    private long q;
    private long r;
    private long s;
    private byte t;
    private byte[] u;
    private boolean v;
    private byte[] w;
    private b x;

    protected abstract int d(byte[] bArr, int i);

    protected abstract int e(byte[] bArr, int i);

    @Override // a.d.b
    public /* synthetic */ a.d.d f_() {
        return L();
    }

    protected b(h hVar) {
        this.g = new byte[16];
        this.h = null;
        this.i = hVar;
    }

    protected b(h hVar, int i) {
        this.g = new byte[16];
        this.h = null;
        this.i = hVar;
        this.a = i;
    }

    protected final h q() {
        return this.i;
    }

    @Override // a.d.b, a.i.a.e
    public void e_() {
        this.b = 0;
        this.h = null;
        this.s = 0L;
        this.p = 0;
    }

    @Override // a.d.b
    public final int c() {
        return this.a;
    }

    public final void e(int i) {
        this.n = i;
    }

    public final boolean m_() {
        return this.o;
    }

    @Override // a.d.b
    public final void a(int i) {
        this.a = i;
    }

    public final int r() {
        return this.p;
    }

    public final void f(int i) {
        while (true) {
            this.p = i;
            if (this.x != null) {
                this = this.x;
            } else {
                return;
            }
        }
    }

    public final long u() {
        return this.r;
    }

    public final void c(long j) {
        this.r = j;
    }

    public final int v() {
        return this.l;
    }

    public final void g(int i) {
        this.l = i;
    }

    @Override // a.i.a.b
    public final void R() {
        this.v = true;
    }

    public final boolean w() {
        return this.v;
    }

    public final byte[] x() {
        return this.w;
    }

    public final void b(byte[] bArr) {
        this.w = bArr;
    }

    public final f y() {
        return this.h;
    }

    @Override // a.d.b
    public final void a(a.d.h hVar) {
        while (true) {
            this.h = (f) hVar;
            if (this.x != null) {
                this = this.x;
            } else {
                return;
            }
        }
    }

    public final int A() {
        return this.k;
    }

    public final long B() {
        return this.s;
    }

    @Override // a.d.b
    public final void b(long j) {
        while (true) {
            this.s = j;
            if (this.x != null) {
                this = this.x;
            } else {
                return;
            }
        }
    }

    @Override // a.d.b
    public final void a(boolean z) {
    }

    @Override // a.d.b
    public final void b(int i) {
    }

    public final int C() {
        return this.b;
    }

    public final void h(int i) {
        this.b |= i;
    }

    public final void H() {
        this.b &= -5;
    }

    public final long J() {
        return this.q;
    }

    @Override // a.d.b, a.i.a.e
    public final void a(long j) {
        this.q = j;
    }

    public boolean a(b bVar) {
        if (this.x != null) {
            return this.x.a(bVar);
        }
        bVar.h(4);
        this.x = bVar;
        return true;
    }

    protected b K() {
        return this.x;
    }

    protected final void b(b bVar) {
        this.x = bVar;
    }

    public d L() {
        return null;
    }

    @Override // a.d.b
    public void a(a.d.d dVar) {
    }

    public final int M() {
        return this.d;
    }

    public final int Q() {
        return this.c;
    }

    @Override // a.d.b
    public int b(byte[] bArr, int i) {
        this.d = i;
        System.arraycopy(a.d.f.a.b, 0, bArr, i, a.d.f.a.b.length);
        a.d.f.a.a(this.j, bArr, i + 6);
        a.d.f.a.a(this.a, bArr, i + 12);
        a.d.f.a.a(this.l, bArr, i + 14);
        a.d.f.a.b(this.b, bArr, i + 16);
        a.d.f.a.b(this.m, bArr, i + 20);
        a.d.f.a.c(this.q, bArr, i + 24);
        if (this.o) {
            a.d.f.a.c(this.r, bArr, i + 32);
            a.d.f.a.c(this.s, bArr, i + 40);
        } else {
            a.d.f.a.b(this.p, bArr, i + 36);
            a.d.f.a.c(this.s, bArr, i + 40);
        }
        int i2 = i + 64;
        this.f = d(bArr, i2);
        int i3 = i2 + this.f;
        int iJ = j(i3) + i3;
        this.c = iJ - i;
        int i4 = this.c;
        if (this.x != null) {
            int iB = this.x.b(bArr, iJ) + iJ;
            a.d.f.a.b(iJ - i, bArr, i + 20);
            i4 += iB - iJ;
        }
        if (this.h != null) {
            this.h.a(bArr, this.d, this.c);
        }
        if (this.v) {
            this.w = new byte[i4];
            System.arraycopy(bArr, i, this.w, 0, i4);
        }
        return i4;
    }

    protected static final int i(int i) {
        return a(i, 0);
    }

    protected static final int a(int i, int i2) {
        int i3 = (i % 8) - i2;
        if (i3 != 0) {
            if (i3 < 0) {
                i3 += 8;
            }
            return (i + 8) - i3;
        }
        return i;
    }

    protected final int j(int i) {
        int i2 = (i - this.d) % 8;
        if (i2 == 0) {
            return 0;
        }
        return 8 - i2;
    }

    @Override // a.d.b
    public final int a(byte[] bArr, int i) {
        return a(bArr, i, false);
    }

    public final int a(byte[] bArr, int i, boolean z) throws a.d.g {
        int iE;
        int iJ;
        this.d = i;
        int iF = f(bArr, i) + i;
        if (T()) {
            iE = iF + c(bArr, iF);
        } else {
            iE = iF + e(bArr, iF);
        }
        this.c = iE - i;
        int i2 = this.c;
        if (this.m != 0) {
            iJ = j(iE) + i2;
        } else {
            iJ = (z && this.m == 0 && this.n > 0) ? (this.n - this.c) + i2 : i2;
        }
        a(bArr, i, iJ);
        if (this.m != 0 && this.x != null && this.m % 8 != 0) {
            throw new a.d.g("Chained command is not aligned");
        }
        return iJ;
    }

    protected void a(byte[] bArr, int i, int i2) {
    }

    protected final int c(byte[] bArr, int i) throws a.d.g {
        if (a.d.f.a.a(bArr, i) != 9) {
            throw new a.d.g("Error structureSize should be 9");
        }
        this.t = bArr[i + 2];
        int i2 = i + 4;
        int iB = a.d.f.a.b(bArr, i2);
        int i3 = i2 + 4;
        if (iB > 0) {
            this.u = new byte[iB];
            System.arraycopy(bArr, i3, this.u, 0, iB);
            i3 += iB;
        }
        return i3 - i;
    }

    private int f(byte[] bArr, int i) {
        a.d.f.a.b(bArr, i);
        int i2 = i + 4;
        a.d.f.a.a(bArr, i2);
        this.j = a.d.f.a.a(bArr, i2 + 2);
        int i3 = i2 + 4;
        this.k = a.d.f.a.b(bArr, i3);
        int i4 = i3 + 4;
        this.a = a.d.f.a.a(bArr, i4);
        this.l = a.d.f.a.a(bArr, i4 + 2);
        int i5 = i4 + 4;
        this.b = a.d.f.a.b(bArr, i5);
        int i6 = i5 + 4;
        this.m = a.d.f.a.b(bArr, i6);
        int i7 = i6 + 4;
        this.q = a.d.f.a.c(bArr, i7);
        int i8 = i7 + 8;
        if ((this.b & 2) == 2) {
            this.o = true;
            this.r = a.d.f.a.c(bArr, i8);
            int i9 = i8 + 8;
            this.s = a.d.f.a.c(bArr, i9);
            System.arraycopy(bArr, i9 + 8, this.g, 0, 16);
            return 64;
        }
        this.o = false;
        int i10 = i8 + 4;
        this.p = a.d.f.a.b(bArr, i10);
        int i11 = i10 + 4;
        this.s = a.d.f.a.c(bArr, i11);
        System.arraycopy(bArr, i11 + 8, this.g, 0, 16);
        return 64;
    }

    public int hashCode() {
        return (int) this.q;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).q == this.q;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 0:
                str = "SMB2_NEGOTIATE";
                break;
            case 1:
                str = "SMB2_SESSION_SETUP";
                break;
            case 2:
                str = "SMB2_LOGOFF";
                break;
            case 3:
                str = "SMB2_TREE_CONNECT";
                break;
            case 4:
                str = "SMB2_TREE_DISCONNECT";
                break;
            case 5:
                str = "SMB2_CREATE";
                break;
            case 6:
                str = "SMB2_CLOSE";
                break;
            case 7:
                str = "SMB2_FLUSH";
                break;
            case 8:
                str = "SMB2_READ";
                break;
            case 9:
                str = "SMB2_WRITE";
                break;
            case 10:
                str = "SMB2_LOCK";
                break;
            case 11:
                str = "SMB2_IOCTL";
                break;
            case 12:
                str = "SMB2_CANCEL";
                break;
            case 13:
                str = "SMB2_ECHO";
                break;
            case 14:
                str = "SMB2_QUERY_DIRECTORY";
                break;
            case 15:
                str = "SMB2_CHANGE_NOTIFY";
                break;
            case 16:
                str = "SMB2_QUERY_INFO";
                break;
            case 17:
                str = "SMB2_SET_INFO";
                break;
            case 18:
                str = "SMB2_OPLOCK_BREAK";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        return new String("command=" + str + ",status=" + (this.k == 0 ? "0" : ad.a(this.k)) + ",flags=0x" + a.i.e.a(this.b, 4) + ",mid=" + this.q + ",wordCount=" + this.e + ",byteCount=" + this.f);
    }

    protected boolean T() {
        return this.k != 0;
    }

    @Override // a.d.b
    public final /* bridge */ /* synthetic */ a.d.h a() {
        return this.h;
    }
}
