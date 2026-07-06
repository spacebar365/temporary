package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.n.c;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class CAST5$Mappings extends AlgorithmProvider {
    private static final String a = CAST5.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("AlgorithmParameters.CAST5", a + "$AlgParams");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.1.2.840.113533.7.66.10", "CAST5");
        configurableProvider.a("AlgorithmParameterGenerator.CAST5", a + "$AlgParamGen");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator.1.2.840.113533.7.66.10", "CAST5");
        configurableProvider.a("Cipher.CAST5", a + "$ECB");
        configurableProvider.a("Cipher", c.u, a + "$CBC");
        configurableProvider.a("KeyGenerator.CAST5", a + "$KeyGen");
        configurableProvider.a("Alg.Alias.KeyGenerator", c.u, "CAST5");
    }
}
