package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.jcajce.provider.asymmetric.gost.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.p054a.p061f.InterfaceC0619a;

/* JADX INFO: loaded from: classes.dex */
public class GOST {

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("KeyPairGenerator.GOST3410", "org.bouncycastle.jcajce.provider.asymmetric.gost.KeyPairGeneratorSpi");
            configurableProvider.mo2853a("Alg.Alias.KeyPairGenerator.GOST-3410", "GOST3410");
            configurableProvider.mo2853a("Alg.Alias.KeyPairGenerator.GOST-3410-94", "GOST3410");
            configurableProvider.mo2853a("KeyFactory.GOST3410", "org.bouncycastle.jcajce.provider.asymmetric.gost.KeyFactorySpi");
            configurableProvider.mo2853a("Alg.Alias.KeyFactory.GOST-3410", "GOST3410");
            configurableProvider.mo2853a("Alg.Alias.KeyFactory.GOST-3410-94", "GOST3410");
            configurableProvider.mo2853a("AlgorithmParameters.GOST3410", "org.bouncycastle.jcajce.provider.asymmetric.gost.AlgorithmParametersSpi");
            configurableProvider.mo2853a("AlgorithmParameterGenerator.GOST3410", "org.bouncycastle.jcajce.provider.asymmetric.gost.AlgorithmParameterGeneratorSpi");
            m4477a(configurableProvider, InterfaceC0619a.f2204l, "GOST3410", new KeyFactorySpi());
            m4478b(configurableProvider, InterfaceC0619a.f2204l, "GOST3410");
            configurableProvider.mo2853a("Signature.GOST3410", "org.bouncycastle.jcajce.provider.asymmetric.gost.SignatureSpi");
            configurableProvider.mo2853a("Alg.Alias.Signature.GOST-3410", "GOST3410");
            configurableProvider.mo2853a("Alg.Alias.Signature.GOST-3410-94", "GOST3410");
            configurableProvider.mo2853a("Alg.Alias.Signature.GOST3411withGOST3410", "GOST3410");
            configurableProvider.mo2853a("Alg.Alias.Signature.GOST3411WITHGOST3410", "GOST3410");
            configurableProvider.mo2853a("Alg.Alias.Signature.GOST3411WithGOST3410", "GOST3410");
            configurableProvider.mo2853a("Alg.Alias.Signature." + InterfaceC0619a.f2206n, "GOST3410");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator.GOST-3410", "GOST3410");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.GOST-3410", "GOST3410");
        }
    }
}
