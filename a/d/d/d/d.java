package a.d.d.d;

/* JADX INFO: compiled from: Trans2GetDfsReferral.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a.d.d.c.a {
    private int n;
    private final a.d.a.c o;

    public d(a.h hVar, String str) {
        super(hVar, (byte) 50, (byte) 16);
        this.n = 3;
        this.o = new a.d.a.c(str);
        this.A = 0;
        this.B = 0;
        this.C = 4096;
        this.D = (byte) 0;
    }

    @Override // a.d.d.c
    public final boolean w() {
        return true;
    }

    @Override // a.d.d.c.a
    protected final int j(byte[] bArr, int i) {
        bArr[i] = X();
        bArr[i + 1] = 0;
        return 2;
    }

    @Override // a.d.d.c.a
    protected final int k(byte[] bArr, int i) {
        return (this.o.a(bArr, i) + i) - i;
    }

    @Override // a.d.d.c.a
    protected final int l(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c.a, a.d.d.c
    public final String toString() {
        return new String("Trans2GetDfsReferral[" + super.toString() + ",maxReferralLevel=0x" + this.n + ",filename=" + this.l + "]");
    }
}
