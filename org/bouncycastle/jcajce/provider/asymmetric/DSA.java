package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSAUtil;
import org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.p054a.p070o.InterfaceC0652b;

/* JADX INFO: loaded from: classes.dex */
public class DSA {

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("AlgorithmParameters.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.AlgorithmParametersSpi");
            configurableProvider.mo2853a("AlgorithmParameterGenerator.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.AlgorithmParameterGeneratorSpi");
            configurableProvider.mo2853a("KeyPairGenerator.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyPairGeneratorSpi");
            configurableProvider.mo2853a("KeyFactory.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyFactorySpi");
            configurableProvider.mo2853a("Signature.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$stdDSA");
            configurableProvider.mo2853a("Signature.NONEWITHDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$noneDSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.RAWDSA", "NONEWITHDSA");
            configurableProvider.mo2853a("Signature.DETDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA");
            configurableProvider.mo2853a("Signature.SHA1WITHDETDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA");
            configurableProvider.mo2853a("Signature.SHA224WITHDETDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA224");
            configurableProvider.mo2853a("Signature.SHA256WITHDETDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA256");
            configurableProvider.mo2853a("Signature.SHA384WITHDETDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA384");
            configurableProvider.mo2853a("Signature.SHA512WITHDETDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA512");
            configurableProvider.mo2853a("Signature.DDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA");
            configurableProvider.mo2853a("Signature.SHA1WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA");
            configurableProvider.mo2853a("Signature.SHA224WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA224");
            configurableProvider.mo2853a("Signature.SHA256WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA256");
            configurableProvider.mo2853a("Signature.SHA384WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA384");
            configurableProvider.mo2853a("Signature.SHA512WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA512");
            configurableProvider.mo2853a("Signature.SHA3-224WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSASha3_224");
            configurableProvider.mo2853a("Signature.SHA3-256WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSASha3_256");
            configurableProvider.mo2853a("Signature.SHA3-384WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSASha3_384");
            configurableProvider.mo2853a("Signature.SHA3-512WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSASha3_512");
            m4475a(configurableProvider, "SHA224", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa224", InterfaceC0652b.f2472T);
            m4475a(configurableProvider, "SHA256", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa256", InterfaceC0652b.f2473U);
            m4475a(configurableProvider, "SHA384", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa384", InterfaceC0652b.f2474V);
            m4475a(configurableProvider, "SHA512", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa512", InterfaceC0652b.f2475W);
            m4475a(configurableProvider, "SHA3-224", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsaSha3_224", InterfaceC0652b.f2476X);
            m4475a(configurableProvider, "SHA3-256", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsaSha3_256", InterfaceC0652b.f2477Y);
            m4475a(configurableProvider, "SHA3-384", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsaSha3_384", InterfaceC0652b.f2478Z);
            m4475a(configurableProvider, "SHA3-512", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsaSha3_512", InterfaceC0652b.f2480aa);
            configurableProvider.mo2853a("Alg.Alias.Signature.SHA/DSA", "DSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.SHA1withDSA", "DSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.SHA1WITHDSA", "DSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.10040.4.1", "DSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.10040.4.3", "DSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.DSAwithSHA1", "DSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.DSAWITHSHA1", "DSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.SHA1WithDSA", "DSA");
            configurableProvider.mo2853a("Alg.Alias.Signature.DSAWithSHA1", "DSA");
            KeyFactorySpi keyFactorySpi = new KeyFactorySpi();
            for (int i = 0; i != DSAUtil.f5648a.length; i++) {
                configurableProvider.mo2853a("Alg.Alias.Signature." + DSAUtil.f5648a[i], "DSA");
                m4477a(configurableProvider, DSAUtil.f5648a[i], "DSA", keyFactorySpi);
                m4478b(configurableProvider, DSAUtil.f5648a[i], "DSA");
            }
        }
    }
}
