package org.bouncycastle.b.f;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.b.k.ad;
import org.bouncycastle.b.k.ae;

/* JADX INFO: loaded from: classes.dex */
public class l implements org.bouncycastle.b.c, org.bouncycastle.d.a.c {
    org.bouncycastle.b.k.y a;
    SecureRandom b;

    @Override // org.bouncycastle.b.c
    public final void a(org.bouncycastle.b.x xVar) {
        org.bouncycastle.b.k.aa aaVar = (org.bouncycastle.b.k.aa) xVar;
        this.b = aaVar.a();
        this.a = aaVar.c();
        if (this.b == null) {
            this.b = org.bouncycastle.b.l.a();
        }
    }

    @Override // org.bouncycastle.b.c
    public org.bouncycastle.b.b a() {
        BigInteger bigIntegerC = this.a.c();
        int iBitLength = bigIntegerC.bitLength();
        int i = iBitLength >>> 2;
        while (true) {
            BigInteger bigIntegerA = org.bouncycastle.f.b.a(iBitLength, this.b);
            if (bigIntegerA.compareTo(e) >= 0 && bigIntegerA.compareTo(bigIntegerC) < 0 && org.bouncycastle.d.a.aa.a(bigIntegerA) >= i) {
                return new org.bouncycastle.b.b(new ae(new org.bouncycastle.d.a.m().a(this.a.b(), bigIntegerA), this.a), new ad(bigIntegerA, this.a));
            }
        }
    }
}
