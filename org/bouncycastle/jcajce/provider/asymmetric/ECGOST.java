package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.p054a.p061f.InterfaceC0619a;
import org.bouncycastle.p054a.p075t.InterfaceC0685a;

/* JADX INFO: loaded from: classes.dex */
public class ECGOST {

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("KeyFactory.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyFactorySpi");
            configurableProvider.mo2853a("Alg.Alias.KeyFactory.GOST-3410-2001", "ECGOST3410");
            configurableProvider.mo2853a("Alg.Alias.KeyFactory.ECGOST-3410", "ECGOST3410");
            m4477a(configurableProvider, InterfaceC0619a.f2205m, "ECGOST3410", new KeyFactorySpi());
            m4477a(configurableProvider, InterfaceC0619a.f2192F, "ECGOST3410", new KeyFactorySpi());
            m4476a(configurableProvider, InterfaceC0619a.f2205m, "ECGOST3410");
            configurableProvider.mo2853a("KeyPairGenerator.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyPairGeneratorSpi");
            configurableProvider.mo2853a("Alg.Alias.KeyPairGenerator.ECGOST-3410", "ECGOST3410");
            configurableProvider.mo2853a("Alg.Alias.KeyPairGenerator.GOST-3410-2001", "ECGOST3410");
            configurableProvider.mo2853a("Signature.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.SignatureSpi");
            configurableProvider.mo2853a("Alg.Alias.Signature.ECGOST-3410", "ECGOST3410");
            configurableProvider.mo2853a("Alg.Alias.Signature.GOST-3410-2001", "ECGOST3410");
            configurableProvider.mo2853a("KeyAgreement.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyAgreementSpi$ECVKO");
            configurableProvider.mo2853a("Alg.Alias.KeyAgreement." + InterfaceC0619a.f2205m, "ECGOST3410");
            configurableProvider.mo2853a("Alg.Alias.KeyAgreement.GOST-3410-2001", "ECGOST3410");
            configurableProvider.mo2853a("Alg.Alias.KeyAgreement." + InterfaceC0619a.f2191E, "ECGOST3410");
            configurableProvider.mo2853a("AlgorithmParameters.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.AlgorithmParametersSpi");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.GOST-3410-2001", "ECGOST3410");
            m4475a(configurableProvider, "GOST3411", "ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.SignatureSpi", InterfaceC0619a.f2207o);
            configurableProvider.mo2853a("KeyFactory.ECGOST3410-2012", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi");
            configurableProvider.mo2853a("Alg.Alias.KeyFactory.GOST-3410-2012", "ECGOST3410-2012");
            configurableProvider.mo2853a("Alg.Alias.KeyFactory.ECGOST-3410-2012", "ECGOST3410-2012");
            m4477a(configurableProvider, InterfaceC0685a.f2807g, "ECGOST3410-2012", new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
            m4477a(configurableProvider, InterfaceC0685a.f2812l, "ECGOST3410-2012", new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
            m4476a(configurableProvider, InterfaceC0685a.f2807g, "ECGOST3410-2012");
            m4477a(configurableProvider, InterfaceC0685a.f2808h, "ECGOST3410-2012", new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
            m4477a(configurableProvider, InterfaceC0685a.f2813m, "ECGOST3410-2012", new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
            m4476a(configurableProvider, InterfaceC0685a.f2808h, "ECGOST3410-2012");
            configurableProvider.mo2853a("KeyPairGenerator.ECGOST3410-2012", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyPairGeneratorSpi");
            configurableProvider.mo2853a("Alg.Alias.KeyPairGenerator.ECGOST3410-2012", "ECGOST3410-2012");
            configurableProvider.mo2853a("Alg.Alias.KeyPairGenerator.GOST-3410-2012", "ECGOST3410-2012");
            configurableProvider.mo2853a("Signature.ECGOST3410-2012-256", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi256");
            configurableProvider.mo2853a("Alg.Alias.Signature.ECGOST3410-2012-256", "ECGOST3410-2012-256");
            configurableProvider.mo2853a("Alg.Alias.Signature.GOST-3410-2012-256", "ECGOST3410-2012-256");
            m4475a(configurableProvider, "GOST3411-2012-256", "ECGOST3410-2012-256", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi256", InterfaceC0685a.f2809i);
            configurableProvider.mo2853a("Signature.ECGOST3410-2012-512", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi512");
            configurableProvider.mo2853a("Alg.Alias.Signature.ECGOST3410-2012-512", "ECGOST3410-2012-512");
            configurableProvider.mo2853a("Alg.Alias.Signature.GOST-3410-2012-512", "ECGOST3410-2012-512");
            m4475a(configurableProvider, "GOST3411-2012-512", "ECGOST3410-2012-512", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi512", InterfaceC0685a.f2810j);
            configurableProvider.mo2853a("KeyAgreement.ECGOST3410-2012-256", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyAgreementSpi$ECVKO256");
            configurableProvider.mo2853a("KeyAgreement.ECGOST3410-2012-512", "org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyAgreementSpi$ECVKO512");
            configurableProvider.mo2853a("Alg.Alias.KeyAgreement." + InterfaceC0685a.f2812l, "ECGOST3410-2012-256");
            configurableProvider.mo2853a("Alg.Alias.KeyAgreement." + InterfaceC0685a.f2813m, "ECGOST3410-2012-512");
            configurableProvider.mo2853a("Alg.Alias.KeyAgreement." + InterfaceC0685a.f2807g, "ECGOST3410-2012-256");
            configurableProvider.mo2853a("Alg.Alias.KeyAgreement." + InterfaceC0685a.f2808h, "ECGOST3410-2012-512");
        }
    }
}
