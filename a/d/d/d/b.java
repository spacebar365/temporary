package a.d.d.d;

import a.g.j;

/* JADX INFO: compiled from: Trans2FindFirst2Response.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a.d.d.c.b {
    private int C;
    private boolean D;
    private int E;
    private int F;
    private int G;
    private String H;
    private int I;

    public b(a.h hVar) {
        super(hVar, (byte) 0);
    }

    public final int q() {
        return this.C;
    }

    public final boolean ac() {
        return this.D;
    }

    public final String ad() {
        return this.H;
    }

    public final int ae() {
        return this.I;
    }

    @Override // a.d.d.c.b
    protected final int j(byte[] bArr, int i) {
        int i2;
        if (Y() == 1) {
            this.C = a.d.f.a.a(bArr, i);
            i2 = i + 2;
        } else {
            i2 = i;
        }
        k(a.d.f.a.a(bArr, i2));
        int i3 = i2 + 2;
        this.D = (bArr[i3] & 1) == 1;
        int i4 = i3 + 2;
        this.E = a.d.f.a.a(bArr, i4);
        int i5 = i4 + 2;
        this.F = a.d.f.a.a(bArr, i5);
        return (i5 + 2) - i;
    }

    @Override // a.d.d.c.b
    protected final int a(byte[] bArr, int i, int i2) {
        this.G = this.F + i;
        j[] jVarArr = new a.d.c.c[aa()];
        for (int i3 = 0; i3 < aa(); i3++) {
            a.d.c.c cVar = new a.d.c.c(T(), C());
            jVarArr[i3] = cVar;
            cVar.a(bArr, i, i2);
            if (this.G >= i && (cVar.j() == 0 || this.G < cVar.j() + i)) {
                this.H = cVar.d();
                this.I = cVar.c();
            }
            i += cVar.j();
        }
        a(jVarArr);
        return W();
    }

    @Override // a.d.d.c.b, a.d.d.c
    public final String toString() {
        String str;
        if (Y() == 1) {
            str = "Trans2FindFirst2Response[";
        } else {
            str = "Trans2FindNext2Response[";
        }
        return new String(str + super.toString() + ",sid=" + this.C + ",searchCount=" + aa() + ",isEndOfSearch=" + this.D + ",eaErrorOffset=" + this.E + ",lastNameOffset=" + this.F + ",lastName=" + this.H + "]");
    }
}
