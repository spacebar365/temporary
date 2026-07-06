package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.q.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class Camellia$Mappings extends SymmetricAlgorithmProvider {
    private static final String a = Camellia.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("AlgorithmParameters.CAMELLIA", a + "$AlgParams");
        configurableProvider.a("Alg.Alias.AlgorithmParameters", a.a, "CAMELLIA");
        configurableProvider.a("Alg.Alias.AlgorithmParameters", a.b, "CAMELLIA");
        configurableProvider.a("Alg.Alias.AlgorithmParameters", a.c, "CAMELLIA");
        configurableProvider.a("AlgorithmParameterGenerator.CAMELLIA", a + "$AlgParamGen");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator", a.a, "CAMELLIA");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator", a.b, "CAMELLIA");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator", a.c, "CAMELLIA");
        configurableProvider.a("Cipher.CAMELLIA", a + "$ECB");
        configurableProvider.a("Cipher", a.a, a + "$CBC");
        configurableProvider.a("Cipher", a.b, a + "$CBC");
        configurableProvider.a("Cipher", a.c, a + "$CBC");
        configurableProvider.a("Cipher.CAMELLIARFC3211WRAP", a + "$RFC3211Wrap");
        configurableProvider.a("Cipher.CAMELLIAWRAP", a + "$Wrap");
        configurableProvider.a("Alg.Alias.Cipher", a.d, "CAMELLIAWRAP");
        configurableProvider.a("Alg.Alias.Cipher", a.e, "CAMELLIAWRAP");
        configurableProvider.a("Alg.Alias.Cipher", a.f, "CAMELLIAWRAP");
        configurableProvider.a("SecretKeyFactory.CAMELLIA", a + "$KeyFactory");
        configurableProvider.a("Alg.Alias.SecretKeyFactory", a.a, "CAMELLIA");
        configurableProvider.a("Alg.Alias.SecretKeyFactory", a.b, "CAMELLIA");
        configurableProvider.a("Alg.Alias.SecretKeyFactory", a.c, "CAMELLIA");
        configurableProvider.a("KeyGenerator.CAMELLIA", a + "$KeyGen");
        configurableProvider.a("KeyGenerator", a.d, a + "$KeyGen128");
        configurableProvider.a("KeyGenerator", a.e, a + "$KeyGen192");
        configurableProvider.a("KeyGenerator", a.f, a + "$KeyGen256");
        configurableProvider.a("KeyGenerator", a.a, a + "$KeyGen128");
        configurableProvider.a("KeyGenerator", a.b, a + "$KeyGen192");
        configurableProvider.a("KeyGenerator", a.c, a + "$KeyGen256");
        b(configurableProvider, "CAMELLIA", a + "$GMAC", a + "$KeyGen");
        c(configurableProvider, "CAMELLIA", a + "$Poly1305", a + "$Poly1305KeyGen");
    }
}
