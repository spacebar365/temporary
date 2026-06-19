package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.jcajce.provider.asymmetric.dstu.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.p054a.p078w.InterfaceC0746f;

/* JADX INFO: loaded from: classes.dex */
public class DSTU4145 {

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("KeyFactory.DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu.KeyFactorySpi");
            configurableProvider.mo2853a("Alg.Alias.KeyFactory.DSTU-4145-2002", "DSTU4145");
            configurableProvider.mo2853a("Alg.Alias.KeyFactory.DSTU4145-3410", "DSTU4145");
            m4477a(configurableProvider, InterfaceC0746f.f2988b, "DSTU4145", new KeyFactorySpi());
            m4476a(configurableProvider, InterfaceC0746f.f2988b, "DSTU4145");
            m4477a(configurableProvider, InterfaceC0746f.f2989c, "DSTU4145", new KeyFactorySpi());
            m4476a(configurableProvider, InterfaceC0746f.f2989c, "DSTU4145");
            configurableProvider.mo2853a("KeyPairGenerator.DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu.KeyPairGeneratorSpi");
            configurableProvider.mo2853a("Alg.Alias.KeyPairGenerator.DSTU-4145", "DSTU4145");
            configurableProvider.mo2853a("Alg.Alias.KeyPairGenerator.DSTU-4145-2002", "DSTU4145");
            configurableProvider.mo2853a("Signature.DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi");
            configurableProvider.mo2853a("Alg.Alias.Signature.DSTU-4145", "DSTU4145");
            configurableProvider.mo2853a("Alg.Alias.Signature.DSTU-4145-2002", "DSTU4145");
            m4475a(configurableProvider, "GOST3411", "DSTU4145LE", "org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpiLe", InterfaceC0746f.f2988b);
            m4475a(configurableProvider, "GOST3411", "DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi", InterfaceC0746f.f2989c);
        }
    }
}
