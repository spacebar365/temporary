package org.bouncycastle.c.c;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ECParameterSpec {
    private String a;

    public d(String str, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        super(ellipticCurve, eCPoint, bigInteger, bigInteger2.intValue());
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public d(String str, org.bouncycastle.d.a.d dVar, org.bouncycastle.d.a.j jVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        ECField eCFieldF2m;
        org.bouncycastle.d.b.b bVarF = dVar.f();
        if (org.bouncycastle.d.a.b.b(bVarF)) {
            eCFieldF2m = new ECFieldFp(bVarF.a());
        } else {
            org.bouncycastle.d.b.f fVarC = ((org.bouncycastle.d.b.g) bVarF).c();
            eCFieldF2m = new ECFieldF2m(fVarC.a(), org.bouncycastle.f.a.d(org.bouncycastle.f.a.b(fVarC.b(), r0.length - 1)));
        }
        super(new EllipticCurve(eCFieldF2m, dVar.g().a(), dVar.h().a(), bArr), EC5Util.a(jVar), bigInteger, bigInteger2.intValue());
        this.a = str;
    }
}
