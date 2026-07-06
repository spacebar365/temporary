package org.bouncycastle.b.k;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class ac extends y {
    private org.bouncycastle.a.p a;

    public ac(org.bouncycastle.a.p pVar, y yVar) {
        super(yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.f());
        this.a = pVar;
    }

    public ac(org.bouncycastle.a.p pVar, org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.j jVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        super(dVar, jVar, bigInteger, bigInteger2, bArr);
        this.a = pVar;
    }

    public final org.bouncycastle.a.p j() {
        return this.a;
    }
}
