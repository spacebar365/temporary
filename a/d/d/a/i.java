package a.d.d.a;

import java.util.Date;

/* JADX INFO: compiled from: SmbComNTCreateAndXResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class i extends a.d.d.a implements a.d.i {
    private boolean A;
    private byte n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private long t;
    private long u;
    private long v;
    private long w;
    private long x;
    private long y;
    private boolean z;

    public i(a.h hVar) {
        super(hVar);
    }

    public final int W() {
        return this.r;
    }

    public final boolean X() {
        return this.A;
    }

    public final void Y() {
        this.A = true;
    }

    public final int Z() {
        return this.o;
    }

    @Override // a.d.i
    public final long e() {
        return this.u;
    }

    @Override // a.d.i
    public final long d() {
        return this.v;
    }

    public final long aa() {
        return this.y;
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
        int i2 = i + 1;
        this.n = bArr[i];
        this.o = a.d.f.a.a(bArr, i2);
        int i3 = i2 + 2;
        this.p = a.d.f.a.b(bArr, i3);
        int i4 = i3 + 4;
        this.t = a.d.f.a.d(bArr, i4);
        int i5 = i4 + 8;
        this.u = a.d.f.a.d(bArr, i5);
        int i6 = i5 + 8;
        this.v = a.d.f.a.d(bArr, i6);
        int i7 = i6 + 8;
        this.w = a.d.f.a.d(bArr, i7);
        int i8 = i7 + 8;
        this.q = a.d.f.a.b(bArr, i8);
        int i9 = i8 + 4;
        this.x = a.d.f.a.c(bArr, i9);
        int i10 = i9 + 8;
        this.y = a.d.f.a.c(bArr, i10);
        int i11 = i10 + 8;
        this.r = a.d.f.a.a(bArr, i11);
        int i12 = i11 + 2;
        this.s = a.d.f.a.a(bArr, i12);
        int i13 = i12 + 2;
        int i14 = i13 + 1;
        this.z = (bArr[i13] & 255) > 0;
        return i14 - i;
    }

    @Override // a.d.d.c
    protected final int i(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.a, a.d.d.c
    public final String toString() {
        return new String("SmbComNTCreateAndXResponse[" + super.toString() + ",oplockLevel=" + ((int) this.n) + ",fid=" + this.o + ",createAction=0x" + a.i.e.a(this.p, 4) + ",creationTime=" + new Date(this.t) + ",lastAccessTime=" + new Date(this.u) + ",lastWriteTime=" + new Date(this.v) + ",changeTime=" + new Date(this.w) + ",extFileAttributes=0x" + a.i.e.a(this.q, 4) + ",allocationSize=" + this.x + ",endOfFile=" + this.y + ",fileType=" + this.r + ",deviceState=" + this.s + ",directory=" + this.z + "]");
    }

    @Override // a.d.i
    public final int b() {
        return this.q;
    }

    @Override // a.d.i
    public final long b_() {
        return this.t;
    }

    @Override // a.d.i
    public final long c_() {
        return this.y;
    }
}
