package org.bouncycastle.b.a;

import java.math.BigInteger;
import org.bouncycastle.b.k.ad;
import org.bouncycastle.b.k.ae;
import org.bouncycastle.b.k.y;

/* JADX INFO: loaded from: classes.dex */
public final class c implements org.bouncycastle.b.d {
    private ad a;

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
            throw new IllegalStateException("ECDH public key has wrong domain parameters");
        }
        BigInteger bigIntegerC = this.a.c();
        org.bouncycastle.d.a.j jVarB = org.bouncycastle.d.a.b.b(yVarB.a(), aeVar.c());
        if (jVarB.p()) {
            throw new IllegalStateException("Infinity is not a valid public key for ECDH");
        }
        BigInteger bigIntegerD = yVarB.d();
        if (!bigIntegerD.equals(org.bouncycastle.d.a.c.d)) {
            bigIntegerC = yVarB.e().multiply(bigIntegerC).mod(yVarB.c());
            jVarB = org.bouncycastle.d.a.b.a(jVarB, bigIntegerD);
        }
        org.bouncycastle.d.a.j jVarO = jVarB.a(bigIntegerC).o();
        if (jVarO.p()) {
            throw new IllegalStateException("Infinity is not a valid agreement value for ECDH");
        }
        return jVarO.g().a();
    }
}
