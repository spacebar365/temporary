package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.a.aa.aj;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.f;
import org.bouncycastle.a.n;
import org.bouncycastle.a.p;
import org.bouncycastle.a.s.u;
import org.bouncycastle.a.v;
import org.bouncycastle.a.z.a;
import org.bouncycastle.jcajce.util.MessageDigestUtils;

/* JADX INFO: loaded from: classes.dex */
class X509SignatureUtil {
    private static final n a = bc.a;

    X509SignatureUtil() {
    }

    private static String a(p pVar) {
        String strA = MessageDigestUtils.a(pVar);
        int iIndexOf = strA.indexOf(45);
        return (iIndexOf <= 0 || strA.startsWith("SHA3")) ? MessageDigestUtils.a(pVar) : strA.substring(0, iIndexOf) + strA.substring(iIndexOf + 1);
    }

    static String a(a aVar) {
        String property;
        f fVarB = aVar.b();
        if (fVarB != null && !a.equals(fVarB)) {
            if (aVar.a().equals(org.bouncycastle.a.s.n.k)) {
                return a(u.a(fVarB).a().a()) + "withRSAandMGF1";
            }
            if (aVar.a().equals(aj.l)) {
                return a((p) v.a(fVarB).a(0)) + "withECDSA";
            }
        }
        Provider provider = Security.getProvider("BC");
        if (provider != null && (property = provider.getProperty("Alg.Alias.Signature." + aVar.a().b())) != null) {
            return property;
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            String property2 = providers[i].getProperty("Alg.Alias.Signature." + aVar.a().b());
            if (property2 != null) {
                return property2;
            }
        }
        return aVar.a().b();
    }

    static void a(Signature signature, f fVar) throws NoSuchAlgorithmException, SignatureException {
        if (fVar == null || a.equals(fVar)) {
            return;
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
        try {
            algorithmParameters.init(fVar.i().k());
            if (signature.getAlgorithm().endsWith("MGF1")) {
                try {
                    signature.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                } catch (GeneralSecurityException e) {
                    throw new SignatureException("Exception extracting parameters: " + e.getMessage());
                }
            }
        } catch (IOException e2) {
            throw new SignatureException("IOException decoding parameters: " + e2.getMessage());
        }
    }
}
