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
import org.bouncycastle.jcajce.util.MessageDigestUtils;
import org.bouncycastle.p054a.AbstractC0642n;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p056aa.InterfaceC0513aj;
import org.bouncycastle.p054a.p074s.C0681u;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p082z.C0759a;

/* JADX INFO: loaded from: classes.dex */
class X509SignatureUtil {

    /* JADX INFO: renamed from: a */
    private static final AbstractC0642n f5962a = C0579bc.f2112a;

    X509SignatureUtil() {
    }

    /* JADX INFO: renamed from: a */
    private static String m4363a(C0653p c0653p) {
        String strM4528a = MessageDigestUtils.m4528a(c0653p);
        int iIndexOf = strM4528a.indexOf(45);
        return (iIndexOf <= 0 || strM4528a.startsWith("SHA3")) ? MessageDigestUtils.m4528a(c0653p) : strM4528a.substring(0, iIndexOf) + strM4528a.substring(iIndexOf + 1);
    }

    /* JADX INFO: renamed from: a */
    static String m4364a(C0759a c0759a) {
        String property;
        InterfaceC0618f interfaceC0618fM1784b = c0759a.m1784b();
        if (interfaceC0618fM1784b != null && !f5962a.equals(interfaceC0618fM1784b)) {
            if (c0759a.m1783a().equals(InterfaceC0674n.f2739k)) {
                return m4363a(C0681u.m1680a(interfaceC0618fM1784b).m1681a().m1783a()) + "withRSAandMGF1";
            }
            if (c0759a.m1783a().equals(InterfaceC0513aj.f1953l)) {
                return m4363a((C0653p) AbstractC0723v.m1708a(interfaceC0618fM1784b).mo1482a(0)) + "withECDSA";
            }
        }
        Provider provider = Security.getProvider("BC");
        if (provider != null && (property = provider.getProperty("Alg.Alias.Signature." + c0759a.m1783a().m1593b())) != null) {
            return property;
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            String property2 = providers[i].getProperty("Alg.Alias.Signature." + c0759a.m1783a().m1593b());
            if (property2 != null) {
                return property2;
            }
        }
        return c0759a.m1783a().m1593b();
    }

    /* JADX INFO: renamed from: a */
    static void m4365a(Signature signature, InterfaceC0618f interfaceC0618f) throws NoSuchAlgorithmException, SignatureException {
        if (interfaceC0618f == null || f5962a.equals(interfaceC0618f)) {
            return;
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
        try {
            algorithmParameters.init(interfaceC0618f.mo1358i().mo1578k());
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
