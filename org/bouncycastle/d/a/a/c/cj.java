package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$a;

/* JADX INFO: loaded from: classes.dex */
public final class cj extends d$a {
    protected cl i;

    public cj() {
        super(193, 15, 0, 0);
        this.i = new cl(this, null, null);
        this.b = a(new BigInteger(1, org.bouncycastle.f.a.f.a("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01")));
        this.c = a(new BigInteger(1, org.bouncycastle.f.a.f.a("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814")));
        this.d = new BigInteger(1, org.bouncycastle.f.a.f.a("01000000000000000000000000C7F34A778F443ACC920EBA49"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // org.bouncycastle.d.a.d
    public final int a() {
        return 193;
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.g a(BigInteger bigInteger) {
        return new ci(bigInteger);
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.h a(org.bouncycastle.d.a.j[] jVarArr, int i) {
        long[] jArr = new long[i * 4 * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            org.bouncycastle.d.a.j jVar = jVarArr[i3 + 0];
            org.bouncycastle.d.c.h.a(((ci) jVar.k()).a, jArr, i2);
            int i4 = i2 + 4;
            org.bouncycastle.d.c.h.a(((ci) jVar.l()).a, jArr, i4);
            i2 = i4 + 4;
        }
        return new ck(this, i, jArr);
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.j a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, boolean z) {
        return new cl(this, gVar, gVar2, z);
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.j a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g[] gVarArr, boolean z) {
        return new cl(this, gVar, gVar2, gVarArr, z);
    }

    @Override // org.bouncycastle.d.a.d
    public final boolean a(int i) {
        switch (i) {
            case 6:
                return true;
            default:
                return false;
        }
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.d c() {
        return new cj();
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.j e() {
        return this.i;
    }

    @Override // org.bouncycastle.d.a.d$a
    public final boolean o() {
        return false;
    }
}
