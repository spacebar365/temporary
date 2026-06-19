package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.p054a.p073r.InterfaceC0659b;

/* JADX INFO: loaded from: classes.dex */
public class ElGamal {

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("AlgorithmParameterGenerator.ELGAMAL", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParameterGeneratorSpi");
            configurableProvider.mo2853a("AlgorithmParameterGenerator.ElGamal", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParameterGeneratorSpi");
            configurableProvider.mo2853a("AlgorithmParameters.ELGAMAL", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParametersSpi");
            configurableProvider.mo2853a("AlgorithmParameters.ElGamal", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParametersSpi");
            configurableProvider.mo2853a("Cipher.ELGAMAL", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi$NoPadding");
            configurableProvider.mo2853a("Cipher.ElGamal", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi$NoPadding");
            configurableProvider.mo2853a("Alg.Alias.Cipher.ELGAMAL/ECB/PKCS1PADDING", "ELGAMAL/PKCS1");
            configurableProvider.mo2853a("Alg.Alias.Cipher.ELGAMAL/NONE/PKCS1PADDING", "ELGAMAL/PKCS1");
            configurableProvider.mo2853a("Alg.Alias.Cipher.ELGAMAL/NONE/NOPADDING", "ELGAMAL");
            configurableProvider.mo2853a("Cipher.ELGAMAL/PKCS1", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi$PKCS1v1_5Padding");
            configurableProvider.mo2853a("KeyFactory.ELGAMAL", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyFactorySpi");
            configurableProvider.mo2853a("KeyFactory.ElGamal", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyFactorySpi");
            configurableProvider.mo2853a("KeyPairGenerator.ELGAMAL", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyPairGeneratorSpi");
            configurableProvider.mo2853a("KeyPairGenerator.ElGamal", "org.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyPairGeneratorSpi");
            m4477a(configurableProvider, InterfaceC0659b.f2578l, "ELGAMAL", new KeyFactorySpi());
            m4478b(configurableProvider, InterfaceC0659b.f2578l, "ELGAMAL");
        }
    }
}
