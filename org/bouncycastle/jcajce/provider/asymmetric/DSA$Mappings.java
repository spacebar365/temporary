package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.a.o.b;
import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSAUtil;
import org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class DSA$Mappings extends AsymmetricAlgorithmProvider {
    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("AlgorithmParameters.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.AlgorithmParametersSpi");
        configurableProvider.a("AlgorithmParameterGenerator.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.AlgorithmParameterGeneratorSpi");
        configurableProvider.a("KeyPairGenerator.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyPairGeneratorSpi");
        configurableProvider.a("KeyFactory.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyFactorySpi");
        configurableProvider.a("Signature.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$stdDSA");
        configurableProvider.a("Signature.NONEWITHDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$noneDSA");
        configurableProvider.a("Alg.Alias.Signature.RAWDSA", "NONEWITHDSA");
        configurableProvider.a("Signature.DETDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA");
        configurableProvider.a("Signature.SHA1WITHDETDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA");
        configurableProvider.a("Signature.SHA224WITHDETDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA224");
        configurableProvider.a("Signature.SHA256WITHDETDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA256");
        configurableProvider.a("Signature.SHA384WITHDETDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA384");
        configurableProvider.a("Signature.SHA512WITHDETDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA512");
        configurableProvider.a("Signature.DDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA");
        configurableProvider.a("Signature.SHA1WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA");
        configurableProvider.a("Signature.SHA224WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA224");
        configurableProvider.a("Signature.SHA256WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA256");
        configurableProvider.a("Signature.SHA384WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA384");
        configurableProvider.a("Signature.SHA512WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA512");
        configurableProvider.a("Signature.SHA3-224WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSASha3_224");
        configurableProvider.a("Signature.SHA3-256WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSASha3_256");
        configurableProvider.a("Signature.SHA3-384WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSASha3_384");
        configurableProvider.a("Signature.SHA3-512WITHDDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSASha3_512");
        a(configurableProvider, "SHA224", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa224", b.T);
        a(configurableProvider, "SHA256", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa256", b.U);
        a(configurableProvider, "SHA384", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa384", b.V);
        a(configurableProvider, "SHA512", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa512", b.W);
        a(configurableProvider, "SHA3-224", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsaSha3_224", b.X);
        a(configurableProvider, "SHA3-256", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsaSha3_256", b.Y);
        a(configurableProvider, "SHA3-384", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsaSha3_384", b.Z);
        a(configurableProvider, "SHA3-512", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsaSha3_512", b.aa);
        configurableProvider.a("Alg.Alias.Signature.SHA/DSA", "DSA");
        configurableProvider.a("Alg.Alias.Signature.SHA1withDSA", "DSA");
        configurableProvider.a("Alg.Alias.Signature.SHA1WITHDSA", "DSA");
        configurableProvider.a("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.10040.4.1", "DSA");
        configurableProvider.a("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.10040.4.3", "DSA");
        configurableProvider.a("Alg.Alias.Signature.DSAwithSHA1", "DSA");
        configurableProvider.a("Alg.Alias.Signature.DSAWITHSHA1", "DSA");
        configurableProvider.a("Alg.Alias.Signature.SHA1WithDSA", "DSA");
        configurableProvider.a("Alg.Alias.Signature.DSAWithSHA1", "DSA");
        KeyFactorySpi keyFactorySpi = new KeyFactorySpi();
        for (int i = 0; i != DSAUtil.a.length; i++) {
            configurableProvider.a("Alg.Alias.Signature." + DSAUtil.a[i], "DSA");
            a(configurableProvider, DSAUtil.a[i], "DSA", keyFactorySpi);
            b(configurableProvider, DSAUtil.a[i], "DSA");
        }
    }
}
