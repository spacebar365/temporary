package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$a;

/* JADX INFO: loaded from: classes.dex */
public final class bi extends d$a {
    protected bk i;

    public bi() {
        super(113, 9, 0, 0);
        this.i = new bk(this, null, null);
        this.b = a(new BigInteger(1, org.bouncycastle.f.a.f.a("003088250CA6E7C7FE649CE85820F7")));
        this.c = a(new BigInteger(1, org.bouncycastle.f.a.f.a("00E8BEE4D3E2260744188BE0E9C723")));
        this.d = new BigInteger(1, org.bouncycastle.f.a.f.a("0100000000000000D9CCEC8A39E56F"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // org.bouncycastle.d.a.d
    public final int a() {
        return 113;
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.g a(BigInteger bigInteger) {
        return new bh(bigInteger);
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.h a(org.bouncycastle.d.a.j[] jVarArr, int i) {
        long[] jArr = new long[i * 2 * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            org.bouncycastle.d.a.j jVar = jVarArr[i3 + 0];
            org.bouncycastle.d.c.d.a(((bh) jVar.k()).a, jArr, i2);
            int i4 = i2 + 2;
            org.bouncycastle.d.c.d.a(((bh) jVar.l()).a, jArr, i4);
            i2 = i4 + 2;
        }
        return new bj(this, i, jArr);
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.j a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, boolean z) {
        return new bk(this, gVar, gVar2, z);
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.j a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g[] gVarArr, boolean z) {
        return new bk(this, gVar, gVar2, gVarArr, z);
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
        return new bi();
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
