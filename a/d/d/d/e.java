package a.d.d.d;

/* JADX INFO: compiled from: Trans2GetDfsReferralResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a.d.d.c.b {
    private final a.d.a.d C;

    public e(a.h hVar) {
        super(hVar);
        this.C = new a.d.a.d();
        b((byte) 16);
    }

    public final a.d.a.d q() {
        return this.C;
    }

    @Override // a.d.d.c
    public final boolean w() {
        return true;
    }

    @Override // a.d.d.c.b
    protected final int j(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c.b
    protected final int a(byte[] bArr, int i, int i2) {
        return (this.C.a(bArr, i, i2) + i) - i;
    }

    @Override // a.d.d.c.b, a.d.d.c
    public final String toString() {
        return new String("Trans2GetDfsReferralResponse[" + super.toString() + ",buffer=" + this.C + "]");
    }
}
