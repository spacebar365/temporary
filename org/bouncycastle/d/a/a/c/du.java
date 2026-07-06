package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$a;

/* JADX INFO: loaded from: classes.dex */
public final class du extends d$a {
    protected dw i;

    public du() {
        super(571, 2, 5, 10);
        this.i = new dw(this, null, null);
        this.b = a(BigInteger.valueOf(0L));
        this.c = a(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, org.bouncycastle.f.a.f.a("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        this.e = BigInteger.valueOf(4L);
        this.f = 6;
    }

    @Override // org.bouncycastle.d.a.d
    public final int a() {
        return 571;
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.g a(BigInteger bigInteger) {
        return new dt(bigInteger);
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.h a(org.bouncycastle.d.a.j[] jVarArr, int i) {
        long[] jArr = new long[i * 9 * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            org.bouncycastle.d.a.j jVar = jVarArr[i3 + 0];
            org.bouncycastle.d.c.m.a(((dt) jVar.k()).a, jArr, i2);
            int i4 = i2 + 9;
            org.bouncycastle.d.c.m.a(((dt) jVar.l()).a, jArr, i4);
            i2 = i4 + 9;
        }
        return new dv(this, i, jArr);
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.j a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, boolean z) {
        return new dw(this, gVar, gVar2, z);
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.j a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g[] gVarArr, boolean z) {
        return new dw(this, gVar, gVar2, gVarArr, z);
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
        return new du();
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.i d() {
        return new org.bouncycastle.d.a.ad();
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.j e() {
        return this.i;
    }

    @Override // org.bouncycastle.d.a.d$a
    public final boolean o() {
        return true;
    }
}
