package a.d.e.c;

import a.h;

/* JADX INFO: compiled from: Smb2WriteRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a.d.e.c<d> implements a.d.e.a {
    private byte[] a;
    private int b;
    private int c;
    private byte[] d;
    private long e;
    private int f;
    private int g;
    private int h;

    public c(h hVar, byte[] bArr) {
        super(hVar, 9);
        this.d = bArr;
    }

    @Override // a.d.e.a
    public final void a(byte[] bArr) {
        this.d = bArr;
    }

    public final void b(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
    }

    public final void d(long j) {
        this.e = j;
    }

    @Override // a.d.c
    public final int l_() {
        return i(this.c + 112);
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        a.d.f.a.a(49L, bArr, i);
        int i2 = i + 4;
        a.d.f.a.b(this.c, bArr, i2);
        int i3 = i2 + 4;
        a.d.f.a.c(this.e, bArr, i3);
        int i4 = i3 + 8;
        System.arraycopy(this.d, 0, bArr, i4, 16);
        int i5 = i4 + 16;
        a.d.f.a.b(this.f, bArr, i5);
        int i6 = i5 + 4;
        a.d.f.a.b(this.g, bArr, i6);
        int i7 = i6 + 4;
        a.d.f.a.a(0L, bArr, i7);
        a.d.f.a.a(0L, bArr, i7 + 2);
        int i8 = i7 + 4;
        a.d.f.a.b(this.h, bArr, i8);
        int i9 = i8 + 4;
        a.d.f.a.a(i9 - M(), bArr, i + 2);
        if (this.c + i9 > bArr.length) {
            throw new IllegalArgumentException(String.format("Data exceeds buffer size ( remain buffer: %d data length: %d)", Integer.valueOf(bArr.length - i9), Integer.valueOf(this.c)));
        }
        System.arraycopy(this.a, this.b, bArr, i9, this.c);
        return (this.c + i9) - i;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.c
    protected final /* synthetic */ a.d.e.d c(a.c cVar) {
        return new d(cVar.a());
    }
}
