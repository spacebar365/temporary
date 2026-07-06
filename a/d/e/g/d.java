package a.d.e.g;

import a.d.g;
import a.h;

/* JADX INFO: compiled from: Smb2SessionSetupResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a.d.e.d {
    private int a;
    private byte[] b;

    public d(h hVar) {
        super(hVar);
    }

    @Override // a.d.e.d, a.d.d
    public final void b(a.d.c cVar) {
        if (D()) {
            cVar.b(B());
        }
        super.b(cVar);
    }

    @Override // a.d.e.b
    protected final boolean T() {
        return A() != -1073741802 && super.T();
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) throws g {
        if (a.d.f.a.a(bArr, i) != 9) {
            throw new g("Structure size != 9");
        }
        this.a = a.d.f.a.a(bArr, i + 2);
        int i2 = i + 4;
        int iA = a.d.f.a.a(bArr, i2);
        int iA2 = a.d.f.a.a(bArr, i2 + 2);
        int i3 = i2 + 4;
        int iM = i3 - (M() + iA);
        this.b = new byte[iA2];
        System.arraycopy(bArr, iA + M(), this.b, 0, iA2);
        return ((i3 + iM) + iA2) - i;
    }

    public final boolean e() {
        return (this.a & 3) != 0;
    }

    public final int f() {
        return this.a;
    }

    public final byte[] g() {
        return this.b;
    }
}
