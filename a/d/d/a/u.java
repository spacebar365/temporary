package a.d.d.a;

/* JADX INFO: compiled from: SmbComSessionSetupAndXResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class u extends a.d.d.a {
    private String n;
    private String o;
    private String p;
    private boolean q;
    private byte[] r;

    public u(a.h hVar, a.d.d.c cVar) {
        super(hVar, cVar);
        this.n = "";
        this.o = "";
        this.p = "";
        this.r = null;
    }

    public final boolean W() {
        return this.q;
    }

    public final byte[] X() {
        return this.r;
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
        this.q = (bArr[i] & 1) == 1;
        int i2 = i + 2;
        if (B()) {
            int iA = a.d.f.a.a(bArr, i2);
            i2 += 2;
            this.r = new byte[iA];
        }
        return i2 - i;
    }

    @Override // a.d.d.c
    protected final int i(byte[] bArr, int i) {
        int length;
        if (B()) {
            System.arraycopy(bArr, i, this.r, 0, this.r.length);
            length = this.r.length + i;
        } else {
            length = i;
        }
        this.n = c(bArr, length);
        int iA = length + a(this.n, length);
        this.o = a(bArr, iA, C());
        int iA2 = iA + a(this.o, iA);
        if (!B()) {
            this.p = a(bArr, iA2, C());
            iA2 += a(this.p, iA2);
        }
        return iA2 - i;
    }

    @Override // a.d.d.a, a.d.d.c
    public final String toString() {
        return new String("SmbComSessionSetupAndXResponse[" + super.toString() + ",isLoggedInAsGuest=" + this.q + ",nativeOs=" + this.n + ",nativeLanMan=" + this.o + ",primaryDomain=" + this.p + "]");
    }
}
