package org.bouncycastle.b.i;

import org.bouncycastle.b.an;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.b.k.be;
import org.bouncycastle.b.k.bf;
import org.bouncycastle.b.k.bg;

/* JADX INFO: loaded from: classes.dex */
public final class k extends an {
    private static final byte[] a = {105, 0, 114, 34, 100, -55, 4, 35, -115, 58, -37, -106, 70, -23, 42, -60, 24, -2, -84, -108, 0, -19, 7, 18, -64, -122, -36, -62, -17, 76, -87, 43};
    private final d b;
    private ba c;
    private long d;
    private boolean e;

    public k(org.bouncycastle.b.e eVar) {
        super(eVar);
        this.d = 0L;
        this.b = new d(eVar, eVar.b() * 8);
    }

    @Override // org.bouncycastle.b.an
    protected final byte a(byte b) {
        if (this.d > 0 && this.d % 1024 == 0) {
            org.bouncycastle.b.e eVarD = this.b.d();
            eVarD.a(false, this.c);
            byte[] bArr = new byte[32];
            eVarD.a(a, 0, bArr, 0);
            eVarD.a(a, 8, bArr, 8);
            eVarD.a(a, 16, bArr, 16);
            eVarD.a(a, 24, bArr, 24);
            this.c = new ba(bArr);
            eVarD.a(true, this.c);
            byte[] bArrE = this.b.e();
            eVarD.a(bArrE, 0, bArrE, 0);
            this.b.a(this.e, new be(this.c, bArrE));
        }
        this.d++;
        return this.b.a(b);
    }

    @Override // org.bouncycastle.b.e
    public final int a(byte[] bArr, int i, byte[] bArr2, int i2) {
        a(bArr, i, this.b.b(), bArr2, i2);
        return this.b.b();
    }

    @Override // org.bouncycastle.b.ao
    public final String a() {
        String strA = this.b.a();
        return strA.substring(0, strA.indexOf(47)) + "/G" + strA.substring(strA.indexOf(47) + 1);
    }

    @Override // org.bouncycastle.b.ao
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        this.d = 0L;
        this.b.a(z, iVar);
        this.e = z;
        org.bouncycastle.b.i iVarB = iVar instanceof be ? ((be) iVar).b() : iVar;
        if (iVarB instanceof bf) {
            iVarB = ((bf) iVarB).b();
        }
        if (iVarB instanceof bg) {
            iVarB = ((bg) iVarB).b();
        }
        this.c = (ba) iVarB;
    }

    @Override // org.bouncycastle.b.e
    public final int b() {
        return this.b.b();
    }

    @Override // org.bouncycastle.b.ao
    public final void c() {
        this.d = 0L;
        this.b.c();
    }
}
