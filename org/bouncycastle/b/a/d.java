package org.bouncycastle.b.a;

import java.math.BigInteger;
import org.bouncycastle.b.k.ad;
import org.bouncycastle.b.k.ae;
import org.bouncycastle.b.k.y;

/* JADX INFO: loaded from: classes.dex */
public final class d implements org.bouncycastle.b.d {
    ad a;

    @Override // org.bouncycastle.b.d
    public final int a() {
        return (this.a.b().a().a() + 7) / 8;
    }

    @Override // org.bouncycastle.b.d
    public final void a(org.bouncycastle.b.i iVar) {
        this.a = (ad) iVar;
    }

    @Override // org.bouncycastle.b.d
    public final BigInteger b(org.bouncycastle.b.i iVar) {
        ae aeVar = (ae) iVar;
        y yVarB = this.a.b();
        if (!yVarB.equals(aeVar.b())) {
            throw new IllegalStateException("ECDHC public key has wrong domain parameters");
        }
        BigInteger bigIntegerMod = yVarB.d().multiply(this.a.c()).mod(yVarB.c());
        org.bouncycastle.d.a.j jVarB = org.bouncycastle.d.a.b.b(yVarB.a(), aeVar.c());
        if (jVarB.p()) {
            throw new IllegalStateException("Infinity is not a valid public key for ECDHC");
        }
        org.bouncycastle.d.a.j jVarO = jVarB.a(bigIntegerMod).o();
        if (jVarO.p()) {
            throw new IllegalStateException("Infinity is not a valid agreement value for ECDHC");
        }
        return jVarO.g().a();
    }
}
