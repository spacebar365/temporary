package org.bouncycastle.jcajce.provider.asymmetric;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.p054a.p064i.InterfaceC0633d;

/* JADX INFO: renamed from: org.bouncycastle.jcajce.provider.asymmetric.GM */
/* JADX INFO: loaded from: classes.dex */
public class C1569GM {

    /* JADX INFO: renamed from: a */
    private static final Map<String, String> f5589a;

    /* JADX INFO: renamed from: org.bouncycastle.jcajce.provider.asymmetric.GM$Mappings */
    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Signature.SM3WITHSM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi$sm3WithSM2");
            configurableProvider.mo2853a("Alg.Alias.Signature." + InterfaceC0633d.f2305ad, "SM3WITHSM2");
            configurableProvider.mo2853a("Cipher.SM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2");
            configurableProvider.mo2853a("Alg.Alias.Cipher.SM2WITHSM3", "SM2");
            configurableProvider.mo2853a("Alg.Alias.Cipher." + InterfaceC0633d.f2287M, "SM2");
            configurableProvider.mo2853a("Cipher.SM2WITHBLAKE2B", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withBlake2b");
            configurableProvider.mo2853a("Alg.Alias.Cipher." + InterfaceC0633d.f2295U, "SM2WITHBLAKE2B");
            configurableProvider.mo2853a("Cipher.SM2WITHBLAKE2S", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withBlake2s");
            configurableProvider.mo2853a("Alg.Alias.Cipher." + InterfaceC0633d.f2296V, "SM2WITHBLAKE2S");
            configurableProvider.mo2853a("Cipher.SM2WITHWHIRLPOOL", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withWhirlpool");
            configurableProvider.mo2853a("Alg.Alias.Cipher." + InterfaceC0633d.f2294T, "SM2WITHWHIRLPOOL");
            configurableProvider.mo2853a("Cipher.SM2WITHMD5", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withMD5");
            configurableProvider.mo2853a("Alg.Alias.Cipher." + InterfaceC0633d.f2297W, "SM2WITHMD5");
            configurableProvider.mo2853a("Cipher.SM2WITHRIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withRMD");
            configurableProvider.mo2853a("Alg.Alias.Cipher." + InterfaceC0633d.f2293S, "SM2WITHRIPEMD160");
            configurableProvider.mo2853a("Cipher.SM2WITHSHA1", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha1");
            configurableProvider.mo2853a("Alg.Alias.Cipher." + InterfaceC0633d.f2288N, "SM2WITHSHA1");
            configurableProvider.mo2853a("Cipher.SM2WITHSHA224", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha224");
            configurableProvider.mo2853a("Alg.Alias.Cipher." + InterfaceC0633d.f2289O, "SM2WITHSHA224");
            configurableProvider.mo2853a("Cipher.SM2WITHSHA256", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha256");
            configurableProvider.mo2853a("Alg.Alias.Cipher." + InterfaceC0633d.f2290P, "SM2WITHSHA256");
            configurableProvider.mo2853a("Cipher.SM2WITHSHA384", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha384");
            configurableProvider.mo2853a("Alg.Alias.Cipher." + InterfaceC0633d.f2291Q, "SM2WITHSHA384");
            configurableProvider.mo2853a("Cipher.SM2WITHSHA512", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha512");
            configurableProvider.mo2853a("Alg.Alias.Cipher." + InterfaceC0633d.f2292R, "SM2WITHSHA512");
        }
    }

    static {
        HashMap map = new HashMap();
        f5589a = map;
        map.put("SupportedKeyClasses", "java.security.interfaces.ECPublicKey|java.security.interfaces.ECPrivateKey");
        f5589a.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
