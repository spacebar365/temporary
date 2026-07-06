package a.d.e.h;

import a.d.g;
import a.d.m;
import a.h;

/* JADX INFO: compiled from: Smb2TreeConnectResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a.d.e.d implements m {
    private byte a;
    private int b;
    private int c;
    private int d;

    public b(h hVar) {
        super(hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.d.e.d, a.d.d
    public final void b(a.d.c cVar) {
        if (D()) {
            ((a.d.e.b) cVar).f(r());
        }
        super.b(cVar);
    }

    @Override // a.d.m
    public final int d_() {
        return r();
    }

    @Override // a.d.m
    public final boolean h() {
        return r() != 0;
    }

    @Override // a.d.m
    public final String p_() {
        return null;
    }

    @Override // a.d.m
    public final boolean g() {
        return (this.b & 3) != 0 || (this.c & 8) == 8;
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) throws g {
        if (a.d.f.a.a(bArr, i) != 16) {
            throw new g("Structure size is not 16");
        }
        this.a = bArr[i + 2];
        int i2 = i + 4;
        this.b = a.d.f.a.b(bArr, i2);
        int i3 = i2 + 4;
        this.c = a.d.f.a.b(bArr, i3);
        int i4 = i3 + 4;
        this.d = a.d.f.a.b(bArr, i4);
        return (i4 + 4) - i;
    }
}
