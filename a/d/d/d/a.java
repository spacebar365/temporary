package a.d.d.d;

/* JADX INFO: compiled from: Trans2FindFirst2.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a.d.d.c.a {
    private int I;
    private String J;
    private int n;
    private int o;
    private int p;
    private int q;

    public a(a.h hVar, String str, String str2, int i, int i2, int i3) {
        super(hVar, (byte) 50, (byte) 1);
        this.q = 0;
        if (!str.equals("\\") && str.charAt(str.length() - 1) != '\\') {
            this.l = str + "\\";
        } else {
            this.l = str;
        }
        this.J = str2;
        this.n = i & 55;
        this.o = 0;
        this.p = 260;
        this.A = 0;
        this.B = 10;
        this.I = i2;
        this.C = i3;
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
        a.d.f.a.a(this.n, bArr, i);
        int i2 = i + 2;
        a.d.f.a.a(this.I, bArr, i2);
        int i3 = i2 + 2;
        a.d.f.a.a(this.o, bArr, i3);
        int i4 = i3 + 2;
        a.d.f.a.a(this.p, bArr, i4);
        int i5 = i4 + 2;
        a.d.f.a.b(this.q, bArr, i5);
        int i6 = i5 + 4;
        return (i6 + a(this.l + this.J, bArr, i6)) - i;
    }

    @Override // a.d.d.c.a
    protected final int l(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c.a, a.d.d.c
    public final String toString() {
        return new String("Trans2FindFirst2[" + super.toString() + ",searchAttributes=0x" + a.i.e.a(this.n, 2) + ",searchCount=" + this.I + ",flags=0x" + a.i.e.a(this.o, 2) + ",informationLevel=0x" + a.i.e.a(this.p, 3) + ",searchStorageType=" + this.q + ",filename=" + this.l + "]");
    }
}
