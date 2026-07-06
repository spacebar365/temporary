package a.d.e.c;

import a.h;

/* JADX INFO: compiled from: Smb2ReadRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a.d.e.c<b> implements a.d.e.a {
    public static byte a = 1;
    public static int b = 0;
    public static int c = 1;
    public static int d = 2;
    private byte[] e;
    private final byte[] f;
    private final int g;
    private byte h;
    private byte i;
    private int j;
    private long k;
    private int l;
    private int m;
    private int n;

    public a(h hVar, byte[] bArr, byte[] bArr2, int i) {
        super(hVar, 8);
        this.e = bArr;
        this.f = bArr2;
        this.g = i;
    }

    @Override // a.d.e.a
    public final void a(byte[] bArr) {
        this.e = bArr;
    }

    public final void k(int i) {
        this.j = i;
    }

    public final void d(long j) {
        this.k = j;
    }

    public final void l(int i) {
        this.n = i;
    }

    @Override // a.d.c
    public final int l_() {
        return i(113);
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        a.d.f.a.a(49L, bArr, i);
        bArr[i + 2] = this.h;
        bArr[i + 3] = this.i;
        int i2 = i + 4;
        a.d.f.a.b(this.j, bArr, i2);
        int i3 = i2 + 4;
        a.d.f.a.c(this.k, bArr, i3);
        int i4 = i3 + 8;
        System.arraycopy(this.e, 0, bArr, i4, 16);
        int i5 = i4 + 16;
        a.d.f.a.b(this.l, bArr, i5);
        int i6 = i5 + 4;
        a.d.f.a.b(this.m, bArr, i6);
        int i7 = i6 + 4;
        a.d.f.a.b(this.n, bArr, i7);
        int i8 = i7 + 4;
        a.d.f.a.a(0L, bArr, i8);
        a.d.f.a.a(0L, bArr, i8 + 2);
        int i9 = i8 + 4;
        bArr[i9] = 0;
        return (i9 + 1) - i;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.c
    protected final /* synthetic */ a.d.e.d c(a.c cVar) {
        return new b(cVar.a(), this.f, this.g);
    }
}
