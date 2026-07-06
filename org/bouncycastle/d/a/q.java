package org.bouncycastle.d.a;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class q extends a {
    protected final d a;
    protected final org.bouncycastle.d.a.b.b b;

    public q(d dVar, org.bouncycastle.d.a.b.b bVar) {
        if (dVar.i() == null) {
            throw new IllegalArgumentException("Need curve with known group order");
        }
        this.a = dVar;
        this.b = bVar;
    }

    @Override // org.bouncycastle.d.a.a
    protected final j b(j jVar, BigInteger bigInteger) {
        if (!this.a.a(jVar.d())) {
            throw new IllegalStateException();
        }
        BigInteger[] bigIntegerArrA = this.b.a(bigInteger.mod(jVar.d().i()));
        return b.a(jVar, bigIntegerArrA[0], this.b.a(), bigIntegerArrA[1]);
    }
}
