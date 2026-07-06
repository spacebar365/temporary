package org.bouncycastle.d.a.a.c;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$b;

/* JADX INFO: loaded from: classes.dex */
public final class n extends d$b {
    public static final BigInteger i = new BigInteger(1, org.bouncycastle.f.a.f.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));
    protected r j;

    public n() {
        super(i);
        this.j = new r(this, null, null);
        this.b = a(new BigInteger(1, org.bouncycastle.f.a.f.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70")));
        this.c = a(new BigInteger(1, org.bouncycastle.f.a.f.a("B4E134D3FB59EB8BAB57274904664D5AF50388BA")));
        this.d = new BigInteger(1, org.bouncycastle.f.a.f.a("0100000000000000000000351EE786A818F3A1A16B"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // org.bouncycastle.d.a.d
    public final int a() {
        return i.bitLength();
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.g a(BigInteger bigInteger) {
        return new q(bigInteger);
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.h a(org.bouncycastle.d.a.j[] jVarArr, int i2) {
        int[] iArr = new int[i2 * 5 * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            org.bouncycastle.d.a.j jVar = jVarArr[i4 + 0];
            org.bouncycastle.d.c.e.a(((q) jVar.k()).b, iArr, i3);
            int i5 = i3 + 5;
            org.bouncycastle.d.c.e.a(((q) jVar.l()).b, iArr, i5);
            i3 = i5 + 5;
        }
        return new o(this, i2, iArr);
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.j a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, boolean z) {
        return new r(this, gVar, gVar2, z);
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.j a(org.bouncycastle.d.a.g gVar, org.bouncycastle.d.a.g gVar2, org.bouncycastle.d.a.g[] gVarArr, boolean z) {
        return new r(this, gVar, gVar2, gVarArr, z);
    }

    @Override // org.bouncycastle.d.a.d
    public final boolean a(int i2) {
        switch (i2) {
            case 2:
                return true;
            default:
                return false;
        }
    }

    @Override // org.bouncycastle.d.a.d
    protected final org.bouncycastle.d.a.d c() {
        return new n();
    }

    @Override // org.bouncycastle.d.a.d
    public final org.bouncycastle.d.a.j e() {
        return this.j;
    }
}
