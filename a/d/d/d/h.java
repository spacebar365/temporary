package a.d.d.d;

/* JADX INFO: compiled from: Trans2QueryPathInformation.java */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a.d.d.c.a {
    private final int n;

    public h(a.h hVar, String str, int i) {
        super(hVar, (byte) 50, (byte) 5);
        this.l = str;
        this.n = i;
        this.A = 0;
        this.B = 2;
        this.C = 40;
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
        long j;
        int i2 = this.n;
        switch (i2) {
            case 4:
                j = 257;
                break;
            case 5:
                j = 258;
                break;
            case 20:
                j = 260;
                break;
            default:
                throw new IllegalArgumentException("Unsupported information level ".concat(String.valueOf(i2)));
        }
        a.d.f.a.a(j, bArr, i);
        int i3 = i + 2;
        int i4 = i3 + 1;
        bArr[i3] = 0;
        int i5 = i4 + 1;
        bArr[i4] = 0;
        int i6 = i5 + 1;
        bArr[i5] = 0;
        int i7 = i6 + 1;
        bArr[i6] = 0;
        return (i7 + a(this.l, bArr, i7)) - i;
    }

    @Override // a.d.d.c.a
    protected final int l(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c.a, a.d.d.c
    public final String toString() {
        return new String("Trans2QueryPathInformation[" + super.toString() + ",informationLevel=0x" + a.i.e.a(this.n, 3) + ",filename=" + this.l + "]");
    }
}
