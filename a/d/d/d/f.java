package a.d.d.d;

/* JADX INFO: compiled from: Trans2QueryFSInformation.java */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a.d.d.c.a {
    private int n;

    public f(a.h hVar, int i) {
        super(hVar, (byte) 50, (byte) 3);
        this.n = i;
        this.z = 2;
        this.A = 0;
        this.B = 0;
        this.C = 800;
        this.D = (byte) 0;
    }

    @Override // a.d.d.c.a
    protected final int j(byte[] bArr, int i) {
        bArr[i] = X();
        bArr[i + 1] = 0;
        return 2;
    }

    @Override // a.d.d.c.a
    protected final int k(byte[] bArr, int i) {
        int i2;
        switch (this.n) {
            case -1:
                i2 = 1;
                break;
            case 3:
                i2 = 259;
                break;
            default:
                throw new IllegalArgumentException("Unhandled information level");
        }
        a.d.f.a.a(i2, bArr, i);
        return (i + 2) - i;
    }

    @Override // a.d.d.c.a
    protected final int l(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c.a, a.d.d.c
    public final String toString() {
        return new String("Trans2QueryFSInformation[" + super.toString() + ",informationLevel=0x" + a.i.e.a(this.n, 3) + "]");
    }
}
