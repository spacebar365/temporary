package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.a.f.a;
import org.bouncycastle.jcajce.provider.asymmetric.gost.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class GOST$Mappings extends AsymmetricAlgorithmProvider {
    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("KeyPairGenerator.GOST3410", "org.bouncycastle.jcajce.provider.asymmetric.gost.KeyPairGeneratorSpi");
        configurableProvider.a("Alg.Alias.KeyPairGenerator.GOST-3410", "GOST3410");
        configurableProvider.a("Alg.Alias.KeyPairGenerator.GOST-3410-94", "GOST3410");
        configurableProvider.a("KeyFactory.GOST3410", "org.bouncycastle.jcajce.provider.asymmetric.gost.KeyFactorySpi");
        configurableProvider.a("Alg.Alias.KeyFactory.GOST-3410", "GOST3410");
        configurableProvider.a("Alg.Alias.KeyFactory.GOST-3410-94", "GOST3410");
        configurableProvider.a("AlgorithmParameters.GOST3410", "org.bouncycastle.jcajce.provider.asymmetric.gost.AlgorithmParametersSpi");
        configurableProvider.a("AlgorithmParameterGenerator.GOST3410", "org.bouncycastle.jcajce.provider.asymmetric.gost.AlgorithmParameterGeneratorSpi");
        a(configurableProvider, a.l, "GOST3410", new KeyFactorySpi());
        b(configurableProvider, a.l, "GOST3410");
        configurableProvider.a("Signature.GOST3410", "org.bouncycastle.jcajce.provider.asymmetric.gost.SignatureSpi");
        configurableProvider.a("Alg.Alias.Signature.GOST-3410", "GOST3410");
        configurableProvider.a("Alg.Alias.Signature.GOST-3410-94", "GOST3410");
        configurableProvider.a("Alg.Alias.Signature.GOST3411withGOST3410", "GOST3410");
        configurableProvider.a("Alg.Alias.Signature.GOST3411WITHGOST3410", "GOST3410");
        configurableProvider.a("Alg.Alias.Signature.GOST3411WithGOST3410", "GOST3410");
        configurableProvider.a("Alg.Alias.Signature." + a.n, "GOST3410");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator.GOST-3410", "GOST3410");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.GOST-3410", "GOST3410");
    }
}
