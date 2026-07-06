package a.d.d;

import a.d.d;
import a.d.f;
import a.d.g;
import a.g.ad;
import a.h;
import a.i.a.e;

/* JADX INFO: compiled from: ServerMessageBlock.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements a.d.c, d, f {
    private static final org.c.b n = org.c.c.a((Class<?>) c.class);
    private boolean A;
    private byte[] B;
    private boolean C;
    private String D;
    private String E;
    private String F;
    private Integer G;
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected String l;
    protected b m;
    private byte o;
    private byte p;
    private boolean q;
    private boolean r;
    private boolean s;
    private volatile boolean t;
    private int u;
    private boolean v;
    private c w;
    private h x;
    private Long y;
    private Exception z;

    protected abstract int f(byte[] bArr, int i);

    protected abstract int g(byte[] bArr, int i);

    protected abstract int h(byte[] bArr, int i);

    protected abstract int i(byte[] bArr, int i);

    public /* synthetic */ e V() {
        return H();
    }

    @Override // a.d.c
    public /* synthetic */ a.d.c f() {
        return r();
    }

    @Override // a.d.b
    public /* synthetic */ d f_() {
        return H();
    }

    public /* synthetic */ a.i.a.c s() {
        return r();
    }

    protected c(h hVar) {
        this(hVar, (byte) 0);
    }

    protected c(h hVar, byte b) {
        this(hVar, b, null);
    }

    protected c(h hVar, byte b, String str) {
        this.k = 65535;
        this.m = null;
        this.x = hVar;
        this.o = b;
        this.l = str;
        this.p = (byte) 24;
        this.f = hVar.Q();
        this.c = 0;
    }

    @Override // a.d.c
    public final int l_() {
        return 0;
    }

    @Override // a.d.d
    public final boolean m_() {
        return false;
    }

    @Override // a.d.c
    public final boolean a_() {
        return false;
    }

    @Override // a.d.c
    public final Integer i() {
        return this.G;
    }

    public c r() {
        return null;
    }

    @Override // a.d.c
    public final boolean a(a.d.c cVar) {
        return false;
    }

    @Override // a.d.c
    public final a.d.c n_() {
        return null;
    }

    public d k() {
        return null;
    }

    @Override // a.d.d
    public final void b(a.d.c cVar) {
    }

    @Override // a.i.a.e
    public final int t() {
        return 1;
    }

    @Override // a.i.a.c
    public final void d(int i) {
    }

    @Override // a.d.b
    public final int c() {
        return this.o;
    }

    @Override // a.d.b
    public final void a(int i) {
        this.o = (byte) i;
    }

    public final int u() {
        return this.j;
    }

    public final int v() {
        return this.b;
    }

    public boolean w() {
        return this.r;
    }

    public final byte x() {
        return this.p;
    }

    public final void a(byte b) {
        this.p = b;
    }

    public final int y() {
        return this.e;
    }

    public final void e(int i) {
        this.e = i;
    }

    public final void f(int i) {
        this.e |= i;
    }

    @Override // a.d.f
    public final void p() {
        f(4096);
    }

    @Override // a.i.a.e
    public final int z() {
        return this.d;
    }

    public final void g(int i) {
        this.d = i;
    }

    @Override // a.d.f
    public final String l() {
        return this.l;
    }

    @Override // a.d.f
    public final String o() {
        return this.D;
    }

    @Override // a.d.f
    public final String n() {
        return this.F;
    }

    @Override // a.d.f
    public final String o_() {
        return this.E;
    }

    @Override // a.d.f
    public final void a(String str, String str2, String str3) {
        this.F = str;
        this.E = str2;
        this.D = str3;
    }

    @Override // a.d.f
    public final void a(String str) {
        this.l = str;
    }

    public final b A() {
        return this.m;
    }

    @Override // a.d.b
    public final void a(a.d.h hVar) {
        this.m = (b) hVar;
    }

    public final boolean B() {
        return this.s;
    }

    @Override // a.d.b
    public final void b(long j) {
    }

    @Override // a.d.b
    public final void a(boolean z) {
        this.s = z;
    }

    public final boolean C() {
        return this.q;
    }

    public final void b(boolean z) {
        this.q = z;
    }

    @Override // a.i.a.e
    public final boolean D() {
        return this.t;
    }

    @Override // a.i.a.e
    public final void E() {
        this.t = false;
    }

    @Override // a.i.a.e
    public final void F() {
        this.t = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // a.i.a.e
    public final void a(Exception exc) {
        this.z = exc;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // a.i.a.e
    public final void G() {
        this.A = true;
        synchronized (this) {
            notifyAll();
        }
    }

    public c H() {
        return this.w;
    }

    @Override // a.d.b
    public final void a(d dVar) {
        if (!(dVar instanceof c)) {
            throw new IllegalArgumentException();
        }
        this.w = (c) dVar;
    }

    @Override // a.i.a.c
    public boolean I() {
        return false;
    }

    @Override // a.i.a.e
    public final long J() {
        return this.h;
    }

    @Override // a.d.b, a.i.a.e
    public final void a(long j) {
        this.h = (int) j;
    }

    public final int d_() {
        return this.k;
    }

    @Override // a.d.c
    public final void a_(int i) {
        this.k = i;
    }

    public final int K() {
        return this.f;
    }

    public final void h(int i) {
        this.f = i;
    }

    public final int L() {
        return this.g;
    }

    @Override // a.d.b
    public final void b(int i) {
        this.g = i;
    }

    public final int M() {
        return this.u;
    }

    public final void i(int i) {
        this.u = i;
    }

    @Override // a.i.a.e
    public final boolean N() {
        return this.v;
    }

    @Override // a.i.a.e
    public final Exception O() {
        return this.z;
    }

    @Override // a.i.a.e
    public final boolean P() {
        return this.A;
    }

    public final void a(byte[] bArr) {
        this.B = bArr;
    }

    public final boolean Q() {
        return this.C;
    }

    @Override // a.i.a.b
    public final void R() {
        this.C = true;
    }

    @Override // a.i.a.e
    public final Long S() {
        return this.y;
    }

    @Override // a.i.a.e
    public final void a(Long l) {
        this.y = l;
    }

    protected final h T() {
        return this.x;
    }

    @Override // a.d.b, a.i.a.e
    public void e_() {
        this.p = (byte) 24;
        this.e = 0;
        this.d = 0;
        this.t = false;
        this.m = null;
        this.g = 0;
        this.k = 65535;
    }

    public final boolean b(byte[] bArr) {
        if (this.m == null || this.d != 0) {
            return true;
        }
        boolean zA = this.m.a(bArr, this);
        this.v = zA;
        return !zA;
    }

    protected final int a(String str, byte[] bArr, int i) {
        return a(str, bArr, i, this.q);
    }

    protected final int a(String str, byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        if (z) {
            if ((i - this.a) % 2 != 0) {
                i3 = i + 1;
                bArr[i] = 0;
            } else {
                i3 = i;
            }
            System.arraycopy(a.i.f.a(str), 0, bArr, i3, str.length() * 2);
            int length = i3 + (str.length() * 2);
            int i4 = length + 1;
            bArr[length] = 0;
            i2 = i4 + 1;
            bArr[i4] = 0;
        } else {
            byte[] bArrA = a.i.f.a(str, this.x);
            System.arraycopy(bArrA, 0, bArr, i, bArrA.length);
            int length2 = i + bArrA.length;
            i2 = length2 + 1;
            bArr[length2] = 0;
        }
        return i2 - i;
    }

    public final String c(byte[] bArr, int i) {
        return a(bArr, i, 255, this.q);
    }

    public final String a(byte[] bArr, int i, int i2, boolean z) {
        if (z) {
            if ((i - this.a) % 2 != 0) {
                i++;
            }
            return a.i.f.a(bArr, i, a.i.f.b(bArr, i, i2));
        }
        return a.i.f.a(bArr, i, a.i.f.c(bArr, i, i2), this.x);
    }

    public final String a(byte[] bArr, int i, boolean z) {
        if (z) {
            if ((i - this.a) % 2 != 0) {
                i++;
            }
            return a.i.f.a(bArr, i, a.i.f.b(bArr, i, 255));
        }
        return a.i.f.a(bArr, i, a.i.f.c(bArr, i, 255), this.x);
    }

    public final int a(String str, int i) {
        int length = str.length() + 1;
        if (this.q) {
            int length2 = (str.length() * 2) + 2;
            return i % 2 != 0 ? length2 + 1 : length2;
        }
        return length;
    }

    @Override // a.d.b
    public int b(byte[] bArr, int i) {
        this.a = i;
        int iD = d(bArr, i) + i;
        this.i = f(bArr, iD + 1);
        bArr[iD] = (byte) ((this.i / 2) & 255);
        int i2 = this.i + iD + 1;
        this.i /= 2;
        this.j = g(bArr, i2 + 2);
        int i3 = i2 + 1;
        bArr[i2] = (byte) (this.j & 255);
        bArr[i3] = (byte) ((this.j >> 8) & 255);
        this.b = ((i3 + 1) + this.j) - i;
        if (this.m != null) {
            this.m.a(bArr, this.a, this.b, this, this.w);
        }
        return this.b;
    }

    @Override // a.d.b
    public int a(byte[] bArr, int i) throws g {
        this.a = i;
        int iE = i + e(bArr, i);
        int i2 = iE + 1;
        this.i = bArr[iE];
        if (this.i != 0) {
            int iH = h(bArr, i2);
            if (iH != this.i * 2 && n.b()) {
                n.a("wordCount * 2=" + (this.i * 2) + " but readParameterWordsWireFormat returned " + iH);
            }
            i2 += this.i * 2;
        }
        this.j = a.d.f.a.a(bArr, i2);
        int i3 = i2 + 2;
        if (this.j != 0) {
            int i4 = i(bArr, i3);
            if (i4 != this.j && n.b()) {
                n.a("byteCount=" + this.j + " but readBytesWireFormat returned " + i4);
            }
            i3 += this.j;
        }
        int i5 = i3 - i;
        this.b = i5;
        if (this.C) {
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, 4, bArr2, 0, i5);
            this.B = bArr2;
        }
        if (!b(bArr)) {
            throw new g("Signature verification failed for " + getClass().getName());
        }
        return i5;
    }

    protected final int d(byte[] bArr, int i) {
        System.arraycopy(a.d.f.a.a, 0, bArr, i, a.d.f.a.a.length);
        bArr[i + 4] = this.o;
        bArr[i + 9] = this.p;
        a.d.f.a.a(this.e, bArr, i + 9 + 1);
        int i2 = i + 24;
        a.d.f.a.a(this.k, bArr, i2);
        a.d.f.a.a(this.f, bArr, i2 + 2);
        a.d.f.a.a(this.g, bArr, i2 + 4);
        a.d.f.a.a(this.h, bArr, i2 + 6);
        return 32;
    }

    protected final int e(byte[] bArr, int i) {
        this.o = bArr[i + 4];
        this.d = a.d.f.a.b(bArr, i + 5);
        this.p = bArr[i + 9];
        this.e = a.d.f.a.a(bArr, i + 9 + 1);
        this.k = a.d.f.a.a(bArr, i + 24);
        this.f = a.d.f.a.a(bArr, i + 24 + 2);
        this.g = a.d.f.a.a(bArr, i + 24 + 4);
        this.h = a.d.f.a.a(bArr, i + 24 + 6);
        return 32;
    }

    protected final boolean U() {
        return (this.p & 128) == 128;
    }

    public int hashCode() {
        return this.h;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).h == this.h;
    }

    public String toString() {
        String str;
        switch (this.o) {
            case -96:
                str = "SMB_COM_NT_TRANSACT";
                break;
            case -95:
                str = "SMB_COM_NT_TRANSACT_SECONDARY";
                break;
            case -94:
                str = "SMB_COM_NT_CREATE_ANDX";
                break;
            case 0:
                str = "SMB_COM_CREATE_DIRECTORY";
                break;
            case 1:
                str = "SMB_COM_DELETE_DIRECTORY";
                break;
            case 4:
                str = "SMB_COM_CLOSE";
                break;
            case 6:
                str = "SMB_COM_DELETE";
                break;
            case 7:
                str = "SMB_COM_RENAME";
                break;
            case 8:
                str = "SMB_COM_QUERY_INFORMATION";
                break;
            case 16:
                str = "SMB_COM_CHECK_DIRECTORY";
                break;
            case 36:
                str = "SMB_COM_LOCKING_ANDX";
                break;
            case 37:
                str = "SMB_COM_TRANSACTION";
                break;
            case 38:
                str = "SMB_COM_TRANSACTION_SECONDARY";
                break;
            case 42:
                str = "SMB_COM_MOVE";
                break;
            case 43:
                str = "SMB_COM_ECHO";
                break;
            case 45:
                str = "SMB_COM_OPEN_ANDX";
                break;
            case 46:
                str = "SMB_COM_READ_ANDX";
                break;
            case 47:
                str = "SMB_COM_WRITE_ANDX";
                break;
            case 50:
                str = "SMB_COM_TRANSACTION2";
                break;
            case 52:
                str = "SMB_COM_FIND_CLOSE2";
                break;
            case 113:
                str = "SMB_COM_TREE_DISCONNECT";
                break;
            case 114:
                str = "SMB_COM_NEGOTIATE";
                break;
            case 115:
                str = "SMB_COM_SESSION_SETUP_ANDX";
                break;
            case 116:
                str = "SMB_COM_LOGOFF_ANDX";
                break;
            case 117:
                str = "SMB_COM_TREE_CONNECT_ANDX";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        return new String("command=" + str + ",received=" + this.t + ",errorCode=" + (this.d == 0 ? "0" : ad.a(this.d)) + ",flags=0x" + a.i.e.a(this.p & 255, 4) + ",flags2=0x" + a.i.e.a(this.e, 4) + ",signSeq=" + this.u + ",tid=" + this.k + ",pid=" + this.f + ",uid=" + this.g + ",mid=" + this.h + ",wordCount=" + this.i + ",byteCount=" + this.j);
    }

    @Override // a.d.b
    public final /* bridge */ /* synthetic */ a.d.h a() {
        return this.m;
    }
}
