package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.a.f.a;
import org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class ECGOST$Mappings extends AsymmetricAlgorithmProvider {
    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("KeyFactory.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyFactorySpi");
        configurableProvider.a("Alg.Alias.KeyFactory.GOST-3410-2001", "ECGOST3410");
        configurableProvider.a("Alg.Alias.KeyFactory.ECGOST-3410", "ECGOST3410");
        a(configurableProvider, a.m, "ECGOST3410", new KeyFactorySpi());
        a(configurableProvider, a.F, "ECGOST3410", new KeyFactorySpi());
        a(configurableProvider, a.m, "ECGOST3410");
        configurableProvider.a("KeyPairGenerator.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyPairGeneratorSpi");
        configurableProvider.a("Alg.Alias.KeyPairGenerator.ECGOST-3410", "ECGOST3410");
        configurableProvider.a("Alg.Alias.KeyPairGenerator.GOST-3410-2001", "ECGOST3410");
        configurableProvider.a("Signature.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.SignatureSpi");
        configurableProvider.a("Alg.Alias.Signature.ECGOST-3410", "ECGOST3410");
        configurableProvider.a("Alg.Alias.Signature.GOST-3410-2001", "ECGOST3410");
        configurableProvider.a("KeyAgreement.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyAgreementSpi$ECVKO");
        configurableProvider.a("Alg.Alias.KeyAgreement." + a.m, "ECGOST3410");
        configurableProvider.a("Alg.Alias.KeyAgreement.GOST-3410-2001", "ECGOST3410");
        configurableProvider.a("Alg.Alias.KeyAgreement." + a.E, "ECGOST3410");
        configurableProvider.a("AlgorithmParameters.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.AlgorithmParametersSpi");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.GOST-3410-2001", "ECGOST3410");
        a(configurableProvider, "GOST3411", "ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.SignatureSpi", a.o);
        configurableProvider.a("KeyFactory.ECGOST3410-2012", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi");
        configurableProvider.a("Alg.Alias.KeyFactory.GOST-3410-2012", "ECGOST3410-2012");
        configurableProvider.a("Alg.Alias.KeyFactory.ECGOST-3410-2012", "ECGOST3410-2012");
        a(configurableProvider, org.bouncycastle.a.t.a.g, "ECGOST3410-2012", new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
        a(configurableProvider, org.bouncycastle.a.t.a.l, "ECGOST3410-2012", new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
        a(configurableProvider, org.bouncycastle.a.t.a.g, "ECGOST3410-2012");
        a(configurableProvider, org.bouncycastle.a.t.a.h, "ECGOST3410-2012", new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
        a(configurableProvider, org.bouncycastle.a.t.a.m, "ECGOST3410-2012", new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
        a(configurableProvider, org.bouncycastle.a.t.a.h, "ECGOST3410-2012");
        configurableProvider.a("KeyPairGenerator.ECGOST3410-2012", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyPairGeneratorSpi");
        configurableProvider.a("Alg.Alias.KeyPairGenerator.ECGOST3410-2012", "ECGOST3410-2012");
        configurableProvider.a("Alg.Alias.KeyPairGenerator.GOST-3410-2012", "ECGOST3410-2012");
        configurableProvider.a("Signature.ECGOST3410-2012-256", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi256");
        configurableProvider.a("Alg.Alias.Signature.ECGOST3410-2012-256", "ECGOST3410-2012-256");
        configurableProvider.a("Alg.Alias.Signature.GOST-3410-2012-256", "ECGOST3410-2012-256");
        a(configurableProvider, "GOST3411-2012-256", "ECGOST3410-2012-256", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi256", org.bouncycastle.a.t.a.i);
        configurableProvider.a("Signature.ECGOST3410-2012-512", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi512");
        configurableProvider.a("Alg.Alias.Signature.ECGOST3410-2012-512", "ECGOST3410-2012-512");
        configurableProvider.a("Alg.Alias.Signature.GOST-3410-2012-512", "ECGOST3410-2012-512");
        a(configurableProvider, "GOST3411-2012-512", "ECGOST3410-2012-512", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi512", org.bouncycastle.a.t.a.j);
        configurableProvider.a("KeyAgreement.ECGOST3410-2012-256", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyAgreementSpi$ECVKO256");
        configurableProvider.a("KeyAgreement.ECGOST3410-2012-512", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyAgreementSpi$ECVKO512");
        configurableProvider.a("Alg.Alias.KeyAgreement." + org.bouncycastle.a.t.a.l, "ECGOST3410-2012-256");
        configurableProvider.a("Alg.Alias.KeyAgreement." + org.bouncycastle.a.t.a.m, "ECGOST3410-2012-512");
        configurableProvider.a("Alg.Alias.KeyAgreement." + org.bouncycastle.a.t.a.g, "ECGOST3410-2012-256");
        configurableProvider.a("Alg.Alias.KeyAgreement." + org.bouncycastle.a.t.a.h, "ECGOST3410-2012-512");
    }
}
