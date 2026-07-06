package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.a.w.f;
import org.bouncycastle.jcajce.provider.asymmetric.dstu.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class DSTU4145$Mappings extends AsymmetricAlgorithmProvider {
    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("KeyFactory.DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu.KeyFactorySpi");
        configurableProvider.a("Alg.Alias.KeyFactory.DSTU-4145-2002", "DSTU4145");
        configurableProvider.a("Alg.Alias.KeyFactory.DSTU4145-3410", "DSTU4145");
        a(configurableProvider, f.b, "DSTU4145", new KeyFactorySpi());
        a(configurableProvider, f.b, "DSTU4145");
        a(configurableProvider, f.c, "DSTU4145", new KeyFactorySpi());
        a(configurableProvider, f.c, "DSTU4145");
        configurableProvider.a("KeyPairGenerator.DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu.KeyPairGeneratorSpi");
        configurableProvider.a("Alg.Alias.KeyPairGenerator.DSTU-4145", "DSTU4145");
        configurableProvider.a("Alg.Alias.KeyPairGenerator.DSTU-4145-2002", "DSTU4145");
        configurableProvider.a("Signature.DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi");
        configurableProvider.a("Alg.Alias.Signature.DSTU-4145", "DSTU4145");
        configurableProvider.a("Alg.Alias.Signature.DSTU-4145-2002", "DSTU4145");
        a(configurableProvider, "GOST3411", "DSTU4145LE", "org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpiLe", f.b);
        a(configurableProvider, "GOST3411", "DSTU4145", "org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi", f.c);
    }
}
