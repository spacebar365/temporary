package a.d.e.d;

import a.h;
import a.n;

/* JADX INFO: compiled from: Smb2IoctlRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a.d.e.c<b> implements a.d.e.a {
    private byte[] a;
    private final int b;
    private final byte[] c;
    private int d;
    private int e;
    private int f;
    private n g;
    private n h;

    public a(h hVar, int i) {
        this(hVar, i, a.d.e.e.a);
    }

    public a(h hVar, int i, byte[] bArr) {
        super(hVar, 11);
        this.b = i;
        this.a = bArr;
        this.d = hVar.af() & (-8);
        this.c = null;
    }

    @Override // a.d.e.a
    public final void a(byte[] bArr) {
        this.a = bArr;
    }

    public a(h hVar, byte[] bArr, byte[] bArr2) {
        super(hVar, 11);
        this.b = 1163287;
        this.a = bArr;
        this.c = bArr2;
        this.d = bArr2.length;
    }

    public final void k() {
        this.f = 1;
    }

    public final void k(int i) {
        this.d = i;
    }

    public final void a(n nVar) {
        this.g = nVar;
    }

    @Override // a.d.c
    public final int l_() {
        int iA = 0;
        if (this.g != null) {
            iA = this.g.a() + 0;
        }
        if (this.h != null) {
            iA += this.h.a();
        }
        return i(iA + 120);
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        a.d.f.a.a(57L, bArr, i);
        int i2 = i + 4;
        a.d.f.a.b(this.b, bArr, i2);
        int i3 = i2 + 4;
        System.arraycopy(this.a, 0, bArr, i3, 16);
        int i4 = i3 + 16;
        int i5 = i4 + 4;
        int i6 = i5 + 4;
        a.d.f.a.b(this.e, bArr, i6);
        int i7 = i6 + 4;
        int i8 = i7 + 4;
        int i9 = i8 + 4;
        a.d.f.a.b(this.d, bArr, i9);
        int i10 = i9 + 4;
        a.d.f.a.b(this.f, bArr, i10);
        int i11 = i10 + 4 + 4;
        if (this.g != null) {
            a.d.f.a.b(i11 - M(), bArr, i4);
            int iA = this.g.a(bArr, i11);
            a.d.f.a.b(iA, bArr, i5);
            i11 += iA;
        } else {
            a.d.f.a.b(0L, bArr, i4);
            a.d.f.a.b(0L, bArr, i5);
        }
        if (this.h != null) {
            a.d.f.a.b(i11 - M(), bArr, i7);
            int iA2 = this.h.a(bArr, i11);
            a.d.f.a.b(iA2, bArr, i8);
            i11 += iA2;
        } else {
            a.d.f.a.b(0L, bArr, i7);
            a.d.f.a.b(0L, bArr, i8);
        }
        return i11 - i;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.c
    protected final /* synthetic */ a.d.e.d c(a.c cVar) {
        return new b(cVar.a(), this.c, this.b);
    }
}
