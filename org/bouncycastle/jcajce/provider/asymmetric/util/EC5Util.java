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
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p056aa.C0505ab;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0514b;
import org.bouncycastle.p083b.p087c.C0851a;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p103c.p106c.C1206c;
import org.bouncycastle.p103c.p106c.C1207d;
import org.bouncycastle.p103c.p106c.C1208e;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.C1371b;
import org.bouncycastle.p107d.p116b.InterfaceC1407b;
import org.bouncycastle.p107d.p116b.InterfaceC1411f;
import org.bouncycastle.p107d.p116b.InterfaceC1412g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: loaded from: classes.dex */
public class EC5Util {

    /* JADX INFO: renamed from: a */
    private static Map f5918a = new HashMap();

    static {
        Enumeration enumerationM2110a = C0851a.m2110a();
        while (enumerationM2110a.hasMoreElements()) {
            String str = (String) enumerationM2110a.nextElement();
            C0507ad c0507adM1380a = C0514b.m1380a(str);
            if (c0507adM1380a != null) {
                f5918a.put(c0507adM1380a.m1366a(), C0851a.m2111a(str).m1366a());
            }
        }
        AbstractC1381d abstractC1381dM1366a = C0851a.m2111a("Curve25519").m1366a();
        f5918a.put(new AbstractC1381d.e(abstractC1381dM1366a.m3365f().mo3552a(), abstractC1381dM1366a.m3366g().mo2928a(), abstractC1381dM1366a.m3367h().mo2928a(), abstractC1381dM1366a.m3368i(), abstractC1381dM1366a.m3369j()), abstractC1381dM1366a);
    }

    /* JADX INFO: renamed from: a */
    private static ECField m4309a(InterfaceC1407b interfaceC1407b) {
        if (C1371b.m3280b(interfaceC1407b)) {
            return new ECFieldFp(interfaceC1407b.mo3552a());
        }
        InterfaceC1411f interfaceC1411fMo3558c = ((InterfaceC1412g) interfaceC1407b).mo3558c();
        return new ECFieldF2m(interfaceC1411fMo3558c.mo3556a(), C1535a.m4096d(C1535a.m4087b(interfaceC1411fMo3558c.mo3557b(), r0.length - 1)));
    }

    /* JADX INFO: renamed from: a */
    public static ECParameterSpec m4310a(EllipticCurve ellipticCurve, C1208e c1208e) {
        return c1208e instanceof C1206c ? new C1207d(((C1206c) c1208e).m2867a(), ellipticCurve, m4313a(c1208e.m2870c()), c1208e.m2871d(), c1208e.m2872e()) : new ECParameterSpec(ellipticCurve, m4313a(c1208e.m2870c()), c1208e.m2871d(), c1208e.m2872e().intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.security.spec.ECParameterSpec m4311a(org.bouncycastle.p054a.p056aa.C0505ab r6, org.bouncycastle.p107d.p108a.AbstractC1381d r7) {
        /*
            boolean r0 = r6.m1360a()
            if (r0 == 0) goto L47
            org.bouncycastle.a.u r0 = r6.m1362c()
            r1 = r0
            org.bouncycastle.a.p r1 = (org.bouncycastle.p054a.C0653p) r1
            org.bouncycastle.a.aa.ad r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.m4325a(r1)
            if (r0 != 0) goto L91
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r2 = org.bouncycastle.p103c.p105b.C1200a.f4677a
            java.util.Map r2 = r2.mo2862c()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L91
            java.lang.Object r0 = r2.get(r1)
            org.bouncycastle.a.aa.ad r0 = (org.bouncycastle.p054a.p056aa.C0507ad) r0
            r5 = r0
        L26:
            r5.m1370e()
            java.security.spec.EllipticCurve r2 = m4314a(r7)
            org.bouncycastle.c.c.d r0 = new org.bouncycastle.c.c.d
            java.lang.String r1 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.m4333b(r1)
            org.bouncycastle.d.a.j r3 = r5.m1367b()
            java.security.spec.ECPoint r3 = m4313a(r3)
            java.math.BigInteger r4 = r5.m1368c()
            java.math.BigInteger r5 = r5.m1369d()
            r0.<init>(r1, r2, r3, r4, r5)
        L46:
            return r0
        L47:
            boolean r0 = r6.m1361b()
            if (r0 == 0) goto L4f
            r0 = 0
            goto L46
        L4f:
            org.bouncycastle.a.u r0 = r6.m1362c()
            org.bouncycastle.a.aa.ad r1 = org.bouncycastle.p054a.p056aa.C0507ad.m1365a(r0)
            r1.m1370e()
            java.security.spec.EllipticCurve r2 = m4314a(r7)
            java.math.BigInteger r0 = r1.m1369d()
            if (r0 == 0) goto L7e
            java.security.spec.ECParameterSpec r0 = new java.security.spec.ECParameterSpec
            org.bouncycastle.d.a.j r3 = r1.m1367b()
            java.security.spec.ECPoint r3 = m4313a(r3)
            java.math.BigInteger r4 = r1.m1368c()
            java.math.BigInteger r1 = r1.m1369d()
            int r1 = r1.intValue()
            r0.<init>(r2, r3, r4, r1)
            goto L46
        L7e:
            java.security.spec.ECParameterSpec r0 = new java.security.spec.ECParameterSpec
            org.bouncycastle.d.a.j r3 = r1.m1367b()
            java.security.spec.ECPoint r3 = m4313a(r3)
            java.math.BigInteger r1 = r1.m1368c()
            r4 = 1
            r0.<init>(r2, r3, r1, r4)
            goto L46
        L91:
            r5 = r0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.m4311a(org.bouncycastle.a.aa.ab, org.bouncycastle.d.a.d):java.security.spec.ECParameterSpec");
    }

    /* JADX INFO: renamed from: a */
    public static ECParameterSpec m4312a(C0507ad c0507ad) {
        return new ECParameterSpec(m4314a(c0507ad.m1366a()), m4313a(c0507ad.m1367b()), c0507ad.m1368c(), c0507ad.m1369d().intValue());
    }

    /* JADX INFO: renamed from: a */
    public static ECPoint m4313a(AbstractC1389j abstractC1389j) {
        AbstractC1389j abstractC1389jM3468o = abstractC1389j.m3468o();
        return new ECPoint(abstractC1389jM3468o.m3461g().mo2928a(), abstractC1389jM3468o.m3462h().mo2928a());
    }

    /* JADX INFO: renamed from: a */
    public static EllipticCurve m4314a(AbstractC1381d abstractC1381d) {
        return new EllipticCurve(m4309a(abstractC1381d.m3365f()), abstractC1381d.m3366g().mo2928a(), abstractC1381d.m3367h().mo2928a(), null);
    }

    /* JADX INFO: renamed from: a */
    public static C1122y m4315a(ProviderConfiguration providerConfiguration, ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec != null) {
            return ECUtil.m4331a(providerConfiguration, m4316a(eCParameterSpec));
        }
        C1208e c1208eMo2859a = providerConfiguration.mo2859a();
        return new C1122y(c1208eMo2859a.m2869b(), c1208eMo2859a.m2870c(), c1208eMo2859a.m2871d(), c1208eMo2859a.m2872e(), c1208eMo2859a.m2873f());
    }

    /* JADX INFO: renamed from: a */
    public static C1208e m4316a(ECParameterSpec eCParameterSpec) {
        AbstractC1381d abstractC1381dM4317a = m4317a(eCParameterSpec.getCurve());
        return eCParameterSpec instanceof C1207d ? new C1206c(((C1207d) eCParameterSpec).m2868a(), abstractC1381dM4317a, m4320a(abstractC1381dM4317a, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed()) : new C1208e(abstractC1381dM4317a, m4320a(abstractC1381dM4317a, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed());
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1381d m4317a(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        BigInteger a2 = ellipticCurve.getA();
        BigInteger b = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            AbstractC1381d.e eVar = new AbstractC1381d.e(((ECFieldFp) field).getP(), a2, b);
            return f5918a.containsKey(eVar) ? (AbstractC1381d) f5918a.get(eVar) : eVar;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m = eCFieldF2m.getM();
        int[] iArrM4332a = ECUtil.m4332a(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new AbstractC1381d.d(m, iArrM4332a[0], iArrM4332a[1], iArrM4332a[2], a2, b);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1381d m4318a(ProviderConfiguration providerConfiguration, C0505ab c0505ab) {
        Set setMo2861b = providerConfiguration.mo2861b();
        if (!c0505ab.m1360a()) {
            if (c0505ab.m1361b()) {
                return providerConfiguration.mo2859a().m2869b();
            }
            if (setMo2861b.isEmpty()) {
                return C0507ad.m1365a(c0505ab.m1362c()).m1366a();
            }
            throw new IllegalStateException("encoded parameters not acceptable");
        }
        C0653p c0653pM1584a = C0653p.m1584a((Object) c0505ab.m1362c());
        if (!setMo2861b.isEmpty() && !setMo2861b.contains(c0653pM1584a)) {
            throw new IllegalStateException("named curve not acceptable");
        }
        C0507ad c0507adM4325a = ECUtil.m4325a(c0653pM1584a);
        if (c0507adM4325a == null) {
            c0507adM4325a = (C0507ad) providerConfiguration.mo2862c().get(c0653pM1584a);
        }
        return c0507adM4325a.m1366a();
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1389j m4319a(ECParameterSpec eCParameterSpec, ECPoint eCPoint) {
        return m4320a(m4317a(eCParameterSpec.getCurve()), eCPoint);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1389j m4320a(AbstractC1381d abstractC1381d, ECPoint eCPoint) {
        return abstractC1381d.mo3355a(eCPoint.getAffineX(), eCPoint.getAffineY(), false);
    }
}
