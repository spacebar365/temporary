package org.bouncycastle.jcajce.provider.asymmetric.p148ec;

import java.math.BigInteger;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.p054a.AbstractC0642n;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p056aa.C0505ab;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p103c.p106c.C1207d;
import org.bouncycastle.p107d.p108a.AbstractC1381d;

/* JADX INFO: loaded from: classes.dex */
class ECUtils {
    ECUtils() {
    }

    /* JADX INFO: renamed from: a */
    static C0505ab m4229a(ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec instanceof C1207d) {
            C0653p c0653pM4326a = ECUtil.m4326a(((C1207d) eCParameterSpec).m2868a());
            if (c0653pM4326a == null) {
                c0653pM4326a = new C0653p(((C1207d) eCParameterSpec).m2868a());
            }
            return new C0505ab(c0653pM4326a);
        }
        if (eCParameterSpec == null) {
            return new C0505ab((AbstractC0642n) C0579bc.f2112a);
        }
        AbstractC1381d abstractC1381dM4317a = EC5Util.m4317a(eCParameterSpec.getCurve());
        return new C0505ab(new C0507ad(abstractC1381dM4317a, EC5Util.m4320a(abstractC1381dM4317a, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed()));
    }

    /* JADX INFO: renamed from: a */
    static C0507ad m4230a(String str) {
        C0507ad c0507adM4334b;
        try {
            if (str.charAt(0) >= '0' && str.charAt(0) <= '2') {
                c0507adM4334b = ECUtil.m4325a(new C0653p(str));
            } else if (str.indexOf(32) > 0) {
                str = str.substring(str.indexOf(32) + 1);
                c0507adM4334b = ECUtil.m4334b(str);
            } else {
                c0507adM4334b = ECUtil.m4334b(str);
            }
            return c0507adM4334b;
        } catch (IllegalArgumentException e) {
            return ECUtil.m4334b(str);
        }
    }

    /* JADX INFO: renamed from: a */
    static C0507ad m4231a(ECGenParameterSpec eCGenParameterSpec) {
        return m4230a(eCGenParameterSpec.getName());
    }

    /* JADX INFO: renamed from: a */
    static C1075b m4232a(PublicKey publicKey) {
        return publicKey instanceof BCECPublicKey ? ((BCECPublicKey) publicKey).m4228b() : ECUtil.m4329a(publicKey);
    }
}
