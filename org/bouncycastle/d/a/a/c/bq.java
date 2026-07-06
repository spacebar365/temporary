package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$a;

/* JADX INFO: loaded from: classes.dex */
public final class bq extends d$a {
    protected bs i;

    public bq() {
        super(131, 2, 3, 8);
        this.i = new bs(this, null, null);
        this.b = a(new BigInteger(1, org.bouncycastle.f.a.f.a("07A11B09A76B562144418FF3FF8C2570B8")));
        this.c = a(new BigInteger(1, org.bouncycastle.f.a.f.a("0217C05610884B63B9C6C7291678F9D341")));
        this.d = new BigInteger(1, org.bouncycastle.f.a.f.a("0400000000000000023123953A9464B54D"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // org.bouncycastle.d.a.d
    public final int a() {
        return 131;
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.g a(BigInteger bigInteger) {
        return new bp(bigInteger);
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.h a(org.bouncycastle.d.a.j[] jVarArr, int i) {
        long[] jArr = new long[i * 3 * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            org.bouncycastle.d.a.j jVar = jVarArr[i3 + 0];
            org.bouncycastle.d.c.f.a(((bp) jVar.k()).a, jArr, i2);
            int i4 = i2 + 3;
            org.bouncycastle.d.c.f.a(((bp) jVar.l()).a, jArr, i4);
            i2 = i4 + 3;
        }
        return new br(this, i, jArr);
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.j a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, boolean z) {
        return new bs(this, gVar, gVar2, z);
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.j a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g[] gVarArr, boolean z) {
        return new bs(this, gVar, gVar2, gVarArr, z);
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
        return new bq();
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
