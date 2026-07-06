package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.a.r.b;
import org.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class ElGamal$Mappings extends AsymmetricAlgorithmProvider {
    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("AlgorithmParameterGenerator.ELGAMAL", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParameterGeneratorSpi");
        configurableProvider.a("AlgorithmParameterGenerator.ElGamal", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParameterGeneratorSpi");
        configurableProvider.a("AlgorithmParameters.ELGAMAL", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParametersSpi");
        configurableProvider.a("AlgorithmParameters.ElGamal", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParametersSpi");
        configurableProvider.a("Cipher.ELGAMAL", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi$NoPadding");
        configurableProvider.a("Cipher.ElGamal", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi$NoPadding");
        configurableProvider.a("Alg.Alias.Cipher.ELGAMAL/ECB/PKCS1PADDING", "ELGAMAL/PKCS1");
        configurableProvider.a("Alg.Alias.Cipher.ELGAMAL/NONE/PKCS1PADDING", "ELGAMAL/PKCS1");
        configurableProvider.a("Alg.Alias.Cipher.ELGAMAL/NONE/NOPADDING", "ELGAMAL");
        configurableProvider.a("Cipher.ELGAMAL/PKCS1", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi$PKCS1v1_5Padding");
        configurableProvider.a("KeyFactory.ELGAMAL", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyFactorySpi");
        configurableProvider.a("KeyFactory.ElGamal", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyFactorySpi");
        configurableProvider.a("KeyPairGenerator.ELGAMAL", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyPairGeneratorSpi");
        configurableProvider.a("KeyPairGenerator.ElGamal", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyPairGeneratorSpi");
        a(configurableProvider, b.l, "ELGAMAL", new KeyFactorySpi());
        b(configurableProvider, b.l, "ELGAMAL");
    }
}
