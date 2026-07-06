package a.d.e.b;

import a.d.c.g;
import a.h;
import a.n;

/* JADX INFO: compiled from: Smb2SetInfoRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a.d.e.c<f> implements a.d.e.a {
    private byte[] a;
    private byte b;
    private byte c;
    private int d;
    private n e;

    public e(h hVar, byte[] bArr) {
        super(hVar, 17);
        this.a = bArr;
    }

    @Override // a.d.e.a
    public final void a(byte[] bArr) {
        this.a = bArr;
    }

    @Override // a.d.c
    public final int l_() {
        return i(this.e.a() + 96);
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        a.d.f.a.a(33L, bArr, i);
        bArr[i + 2] = this.b;
        bArr[i + 3] = this.c;
        int i2 = i + 4;
        int i3 = i2 + 4;
        int i4 = i3 + 4;
        a.d.f.a.b(this.d, bArr, i4);
        int i5 = i4 + 4;
        System.arraycopy(this.a, 0, bArr, i5, 16);
        int i6 = i5 + 16;
        a.d.f.a.a(i6 - M(), bArr, i3);
        int iA = this.e.a(bArr, i6);
        a.d.f.a.b(iA, bArr, i2);
        return (i6 + iA) - i;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) {
        return 0;
    }

    public final <T extends g & n> void a(T t) {
        this.b = (byte) 1;
        this.c = t.g();
        this.e = t;
    }

    @Override // a.d.e.c
    protected final /* synthetic */ a.d.e.d c(a.c cVar) {
        return new f(cVar.a());
    }
}
