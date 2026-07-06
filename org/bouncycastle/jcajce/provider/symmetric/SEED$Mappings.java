package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.m.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class SEED$Mappings extends SymmetricAlgorithmProvider {
    private static final String a = SEED.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("AlgorithmParameters.SEED", a + "$AlgParams");
        configurableProvider.a("Alg.Alias.AlgorithmParameters." + a.a, "SEED");
        configurableProvider.a("AlgorithmParameterGenerator.SEED", a + "$AlgParamGen");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator." + a.a, "SEED");
        configurableProvider.a("Cipher.SEED", a + "$ECB");
        configurableProvider.a("Cipher", a.a, a + "$CBC");
        configurableProvider.a("Cipher.SEEDWRAP", a + "$Wrap");
        configurableProvider.a("Alg.Alias.Cipher", a.d, "SEEDWRAP");
        configurableProvider.a("Alg.Alias.Cipher.SEEDKW", "SEEDWRAP");
        configurableProvider.a("KeyGenerator.SEED", a + "$KeyGen");
        configurableProvider.a("KeyGenerator", a.a, a + "$KeyGen");
        configurableProvider.a("KeyGenerator", a.d, a + "$KeyGen");
        configurableProvider.a("SecretKeyFactory.SEED", a + "$KeyFactory");
        configurableProvider.a("Alg.Alias.SecretKeyFactory", a.a, "SEED");
        a(configurableProvider, "SEED", a + "$CMAC", a + "$KeyGen");
        b(configurableProvider, "SEED", a + "$GMAC", a + "$KeyGen");
        c(configurableProvider, "SEED", a + "$Poly1305", a + "$Poly1305KeyGen");
    }
}
