package a.d.d.a;

/* JADX INFO: compiled from: SmbComNTCreateAndX.java */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a.d.d.a implements a.d.e<i> {
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private long t;
    private byte u;
    private int v;
    private int w;
    private int x;

    public h(a.h hVar, String str, int i, int i2, int i3) {
        super(hVar, (byte) -94, str);
        this.x = i2;
        this.x |= 137;
        this.o = 128;
        this.p = i3;
        if ((i & 64) == 64) {
            if ((i & 16) == 16) {
                this.q = 5;
            } else {
                this.q = 4;
            }
        } else if ((i & 16) == 16) {
            if ((i & 32) == 32) {
                this.q = 2;
            } else {
                this.q = 3;
            }
        } else {
            this.q = 1;
        }
        this.r = 64;
        this.s = 2;
        this.u = (byte) 3;
    }

    public final void W() {
        this.w |= 22;
    }

    @Override // a.d.d.c
    protected final int f(byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = 0;
        this.v = i2;
        int i3 = i2 + 2;
        a.d.f.a.b(this.w, bArr, i3);
        int i4 = i3 + 4;
        a.d.f.a.b(this.n, bArr, i4);
        int i5 = i4 + 4;
        a.d.f.a.b(this.x, bArr, i5);
        int i6 = i5 + 4;
        a.d.f.a.c(this.t, bArr, i6);
        int i7 = i6 + 8;
        a.d.f.a.b(this.o, bArr, i7);
        int i8 = i7 + 4;
        a.d.f.a.b(this.p, bArr, i8);
        int i9 = i8 + 4;
        a.d.f.a.b(this.q, bArr, i9);
        int i10 = i9 + 4;
        a.d.f.a.b(this.r, bArr, i10);
        int i11 = i10 + 4;
        a.d.f.a.b(this.s, bArr, i11);
        int i12 = i11 + 4;
        bArr[i12] = this.u;
        return (i12 + 1) - i;
    }

    @Override // a.d.d.c
    protected final int g(byte[] bArr, int i) {
        int iA = a(this.l, bArr, i);
        a.d.f.a.a(C() ? this.l.length() * 2 : iA, bArr, this.v);
        return iA;
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
        return new String("SmbComNTCreateAndX[" + super.toString() + ",flags=0x" + a.i.e.a(this.w, 2) + ",rootDirectoryFid=" + this.n + ",desiredAccess=0x" + a.i.e.a(this.x, 4) + ",allocationSize=" + this.t + ",extFileAttributes=0x" + a.i.e.a(this.o, 4) + ",shareAccess=0x" + a.i.e.a(this.p, 4) + ",createDisposition=0x" + a.i.e.a(this.q, 4) + ",createOptions=0x" + a.i.e.a(this.r, 8) + ",impersonationLevel=0x" + a.i.e.a(this.s, 4) + ",securityFlags=0x" + a.i.e.a(this.u, 2) + ",name=" + this.l + "]");
    }

    @Override // a.d.d.c
    public final /* bridge */ /* synthetic */ a.d.d.c H() {
        return (i) super.H();
    }

    @Override // a.d.d.c, a.d.b
    public final /* synthetic */ a.d.d f_() {
        return (i) super.H();
    }

    @Override // a.d.d.c, a.i.a.c
    public final /* synthetic */ a.i.a.e V() {
        return (i) super.H();
    }

    @Override // a.d.e
    public final /* synthetic */ a.d.d a(a.c cVar) {
        i iVar = new i(cVar.a());
        a((a.d.d) iVar);
        return iVar;
    }
}
