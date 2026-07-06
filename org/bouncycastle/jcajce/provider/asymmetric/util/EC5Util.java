package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.a.aa.ab;
import org.bouncycastle.a.aa.ad;
import org.bouncycastle.a.aa.b;
import org.bouncycastle.a.p;
import org.bouncycastle.b.c.a;
import org.bouncycastle.b.k.y;
import org.bouncycastle.c.c.c;
import org.bouncycastle.c.c.e;
import org.bouncycastle.d.a.d;
import org.bouncycastle.d.a.d$d;
import org.bouncycastle.d.a.d$e;
import org.bouncycastle.d.a.j;
import org.bouncycastle.d.b.f;
import org.bouncycastle.d.b.g;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class EC5Util {
    private static Map a = new HashMap();

    static {
        Enumeration enumerationA = a.a();
        while (enumerationA.hasMoreElements()) {
            String str = (String) enumerationA.nextElement();
            ad adVarA = b.a(str);
            if (adVarA != null) {
                a.put(adVarA.a(), a.a(str).a());
            }
        }
        d dVarA = a.a("Curve25519").a();
        a.put(new d$e(dVarA.f().a(), dVarA.g().a(), dVarA.h().a(), dVarA.i(), dVarA.j()), dVarA);
    }

    private static ECField a(org.bouncycastle.d.b.b bVar) {
        if (org.bouncycastle.d.a.b.b(bVar)) {
            return new ECFieldFp(bVar.a());
        }
        f fVarC = ((g) bVar).c();
        return new ECFieldF2m(fVarC.a(), org.bouncycastle.f.a.d(org.bouncycastle.f.a.b(fVarC.b(), r0.length - 1)));
    }

    public static ECParameterSpec a(EllipticCurve ellipticCurve, e eVar) {
        return eVar instanceof c ? new org.bouncycastle.c.c.d(((c) eVar).a(), ellipticCurve, a(eVar.c()), eVar.d(), eVar.e()) : new ECParameterSpec(ellipticCurve, a(eVar.c()), eVar.d(), eVar.e().intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.security.spec.ECParameterSpec a(org.bouncycastle.a.aa.ab r6, org.bouncycastle.d.a.d r7) {
        /*
            boolean r0 = r6.a()
            if (r0 == 0) goto L47
            org.bouncycastle.a.u r0 = r6.c()
            r1 = r0
            org.bouncycastle.a.p r1 = (org.bouncycastle.a.p) r1
            org.bouncycastle.a.aa.ad r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.a(r1)
            if (r0 != 0) goto L91
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r2 = org.bouncycastle.c.b.a.a
            java.util.Map r2 = r2.c()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L91
            java.lang.Object r0 = r2.get(r1)
            org.bouncycastle.a.aa.ad r0 = (org.bouncycastle.a.aa.ad) r0
            r5 = r0
        L26:
            r5.e()
            java.security.spec.EllipticCurve r2 = a(r7)
            org.bouncycastle.c.c.d r0 = new org.bouncycastle.c.c.d
            java.lang.String r1 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.b(r1)
            org.bouncycastle.d.a.j r3 = r5.b()
            java.security.spec.ECPoint r3 = a(r3)
            java.math.BigInteger r4 = r5.c()
            java.math.BigInteger r5 = r5.d()
            r0.<init>(r1, r2, r3, r4, r5)
        L46:
            return r0
        L47:
            boolean r0 = r6.b()
            if (r0 == 0) goto L4f
            r0 = 0
            goto L46
        L4f:
            org.bouncycastle.a.u r0 = r6.c()
            org.bouncycastle.a.aa.ad r1 = org.bouncycastle.a.aa.ad.a(r0)
            r1.e()
            java.security.spec.EllipticCurve r2 = a(r7)
            java.math.BigInteger r0 = r1.d()
            if (r0 == 0) goto L7e
            java.security.spec.ECParameterSpec r0 = new java.security.spec.ECParameterSpec
            org.bouncycastle.d.a.j r3 = r1.b()
            java.security.spec.ECPoint r3 = a(r3)
            java.math.BigInteger r4 = r1.c()
            java.math.BigInteger r1 = r1.d()
            int r1 = r1.intValue()
            r0.<init>(r2, r3, r4, r1)
            goto L46
        L7e:
            java.security.spec.ECParameterSpec r0 = new java.security.spec.ECParameterSpec
            org.bouncycastle.d.a.j r3 = r1.b()
            java.security.spec.ECPoint r3 = a(r3)
            java.math.BigInteger r1 = r1.c()
            r4 = 1
            r0.<init>(r2, r3, r1, r4)
            goto L46
        L91:
            r5 = r0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.a(org.bouncycastle.a.aa.ab, org.bouncycastle.d.a.d):java.security.spec.ECParameterSpec");
    }

    public static ECParameterSpec a(ad adVar) {
        return new ECParameterSpec(a(adVar.a()), a(adVar.b()), adVar.c(), adVar.d().intValue());
    }

    public static ECPoint a(j jVar) {
        j jVarO = jVar.o();
        return new ECPoint(jVarO.g().a(), jVarO.h().a());
    }

    public static EllipticCurve a(d dVar) {
        return new EllipticCurve(a(dVar.f()), dVar.g().a(), dVar.h().a(), null);
    }

    public static y a(ProviderConfiguration providerConfiguration, ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec != null) {
            return ECUtil.a(providerConfiguration, a(eCParameterSpec));
        }
        e eVarA = providerConfiguration.a();
        return new y(eVarA.b(), eVarA.c(), eVarA.d(), eVarA.e(), eVarA.f());
    }

    public static e a(ECParameterSpec eCParameterSpec) {
        d dVarA = a(eCParameterSpec.getCurve());
        return eCParameterSpec instanceof org.bouncycastle.c.c.d ? new c(((org.bouncycastle.c.c.d) eCParameterSpec).a(), dVarA, a(dVarA, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed()) : new e(dVarA, a(dVarA, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed());
    }

    public static d a(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        BigInteger a2 = ellipticCurve.getA();
        BigInteger b = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            d$e d_e = new d$e(((ECFieldFp) field).getP(), a2, b);
            return a.containsKey(d_e) ? (d) a.get(d_e) : d_e;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m = eCFieldF2m.getM();
        int[] iArrA = ECUtil.a(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new d$d(m, iArrA[0], iArrA[1], iArrA[2], a2, b);
    }

    public static d a(ProviderConfiguration providerConfiguration, ab abVar) {
        Set setB = providerConfiguration.b();
        if (!abVar.a()) {
            if (abVar.b()) {
                return providerConfiguration.a().b();
            }
            if (setB.isEmpty()) {
                return ad.a(abVar.c()).a();
            }
            throw new IllegalStateException("encoded parameters not acceptable");
        }
        p pVarA = p.a((Object) abVar.c());
        if (!setB.isEmpty() && !setB.contains(pVarA)) {
            throw new IllegalStateException("named curve not acceptable");
        }
        ad adVarA = ECUtil.a(pVarA);
        if (adVarA == null) {
            adVarA = (ad) providerConfiguration.c().get(pVarA);
        }
        return adVarA.a();
    }

    public static j a(ECParameterSpec eCParameterSpec, ECPoint eCPoint) {
        return a(a(eCParameterSpec.getCurve()), eCPoint);
    }

    public static j a(d dVar, ECPoint eCPoint) {
        return dVar.a(eCPoint.getAffineX(), eCPoint.getAffineY(), false);
    }
}
