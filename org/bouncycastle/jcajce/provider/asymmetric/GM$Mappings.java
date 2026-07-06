package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.a.i.d;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class GM$Mappings extends AsymmetricAlgorithmProvider {
    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Signature.SM3WITHSM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi$sm3WithSM2");
        configurableProvider.a("Alg.Alias.Signature." + d.ad, "SM3WITHSM2");
        configurableProvider.a("Cipher.SM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2");
        configurableProvider.a("Alg.Alias.Cipher.SM2WITHSM3", "SM2");
        configurableProvider.a("Alg.Alias.Cipher." + d.M, "SM2");
        configurableProvider.a("Cipher.SM2WITHBLAKE2B", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withBlake2b");
        configurableProvider.a("Alg.Alias.Cipher." + d.U, "SM2WITHBLAKE2B");
        configurableProvider.a("Cipher.SM2WITHBLAKE2S", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withBlake2s");
        configurableProvider.a("Alg.Alias.Cipher." + d.V, "SM2WITHBLAKE2S");
        configurableProvider.a("Cipher.SM2WITHWHIRLPOOL", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withWhirlpool");
        configurableProvider.a("Alg.Alias.Cipher." + d.T, "SM2WITHWHIRLPOOL");
        configurableProvider.a("Cipher.SM2WITHMD5", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withMD5");
        configurableProvider.a("Alg.Alias.Cipher." + d.W, "SM2WITHMD5");
        configurableProvider.a("Cipher.SM2WITHRIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withRMD");
        configurableProvider.a("Alg.Alias.Cipher." + d.S, "SM2WITHRIPEMD160");
        configurableProvider.a("Cipher.SM2WITHSHA1", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha1");
        configurableProvider.a("Alg.Alias.Cipher." + d.N, "SM2WITHSHA1");
        configurableProvider.a("Cipher.SM2WITHSHA224", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha224");
        configurableProvider.a("Alg.Alias.Cipher." + d.O, "SM2WITHSHA224");
        configurableProvider.a("Cipher.SM2WITHSHA256", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha256");
        configurableProvider.a("Alg.Alias.Cipher." + d.P, "SM2WITHSHA256");
        configurableProvider.a("Cipher.SM2WITHSHA384", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha384");
        configurableProvider.a("Alg.Alias.Cipher." + d.Q, "SM2WITHSHA384");
        configurableProvider.a("Cipher.SM2WITHSHA512", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha512");
        configurableProvider.a("Alg.Alias.Cipher." + d.R, "SM2WITHSHA512");
    }
}
