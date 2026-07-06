package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.math.BigInteger;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import org.bouncycastle.a.aa.ab;
import org.bouncycastle.a.aa.ad;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.n;
import org.bouncycastle.a.p;
import org.bouncycastle.b.k.b;
import org.bouncycastle.c.c.d;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;

/* JADX INFO: loaded from: classes.dex */
class ECUtils {
    ECUtils() {
    }

    static ab a(ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec instanceof d) {
            p pVarA = ECUtil.a(((d) eCParameterSpec).a());
            if (pVarA == null) {
                pVarA = new p(((d) eCParameterSpec).a());
            }
            return new ab(pVarA);
        }
        if (eCParameterSpec == null) {
            return new ab((n) bc.a);
        }
        org.bouncycastle.d.a.d dVarA = EC5Util.a(eCParameterSpec.getCurve());
        return new ab(new ad(dVarA, EC5Util.a(dVarA, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed()));
    }

    static ad a(String str) {
        ad adVarB;
        try {
            if (str.charAt(0) >= '0' && str.charAt(0) <= '2') {
                adVarB = ECUtil.a(new p(str));
            } else if (str.indexOf(32) > 0) {
                str = str.substring(str.indexOf(32) + 1);
                adVarB = ECUtil.b(str);
            } else {
                adVarB = ECUtil.b(str);
            }
            return adVarB;
        } catch (IllegalArgumentException e) {
            return ECUtil.b(str);
        }
    }

    static ad a(ECGenParameterSpec eCGenParameterSpec) {
        return a(eCGenParameterSpec.getName());
    }

    static b a(PublicKey publicKey) {
        return publicKey instanceof BCECPublicKey ? ((BCECPublicKey) publicKey).b() : ECUtil.a(publicKey);
    }
}
