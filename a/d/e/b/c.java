package a.d.e.b;

import a.h;
import a.n;

/* JADX INFO: compiled from: Smb2QueryInfoRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a.d.e.c<d> implements a.d.e.a {
    private byte a;
    private byte b;
    private int c;
    private int d;
    private int e;
    private byte[] f;
    private n g;

    public c(h hVar) {
        this(hVar, a.d.e.e.a);
    }

    private c(h hVar, byte[] bArr) {
        super(hVar, 16);
        this.c = hVar.ai();
        this.f = bArr;
    }

    @Override // a.d.e.a
    public final void a(byte[] bArr) {
        this.f = bArr;
    }

    @Override // a.d.c
    public final int l_() {
        int iA = 104;
        if (this.g != null) {
            iA = this.g.a() + 104;
        }
        return i(iA);
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        a.d.f.a.a(41L, bArr, i);
        bArr[i + 2] = this.a;
        bArr[i + 3] = this.b;
        int i2 = i + 4;
        a.d.f.a.b(this.c, bArr, i2);
        int i3 = i2 + 4;
        int i4 = i3 + 4;
        int i5 = i4 + 4;
        a.d.f.a.b(this.d, bArr, i5);
        int i6 = i5 + 4;
        a.d.f.a.b(this.e, bArr, i6);
        int i7 = i6 + 4;
        System.arraycopy(this.f, 0, bArr, i7, 16);
        int i8 = i7 + 16;
        if (this.g == null) {
            a.d.f.a.a(0L, bArr, i3);
            a.d.f.a.b(0L, bArr, i4);
        } else {
            a.d.f.a.a(i8 - M(), bArr, i3);
            int iA = this.g.a(bArr, i8);
            a.d.f.a.b(iA, bArr, i4);
            i8 += iA;
        }
        return i8 - i;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) {
        return 0;
    }

    public final void a(byte b) {
        this.a = (byte) 2;
        this.b = b;
    }

    @Override // a.d.e.c
    protected final /* synthetic */ a.d.e.d c(a.c cVar) {
        return new d(cVar.a(), this.a, this.b);
    }
}
