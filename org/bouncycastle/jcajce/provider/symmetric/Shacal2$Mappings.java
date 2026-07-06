package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class Shacal2$Mappings extends SymmetricAlgorithmProvider {
    private static final String a = Shacal2.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Mac.Shacal-2CMAC", a + "$CMAC");
        configurableProvider.a("Cipher.Shacal2", a + "$ECB");
        configurableProvider.a("Cipher.SHACAL-2", a + "$ECB");
        configurableProvider.a("KeyGenerator.Shacal2", a + "$KeyGen");
        configurableProvider.a("AlgorithmParameterGenerator.Shacal2", a + "$AlgParamGen");
        configurableProvider.a("AlgorithmParameters.Shacal2", a + "$AlgParams");
        configurableProvider.a("KeyGenerator.SHACAL-2", a + "$KeyGen");
        configurableProvider.a("AlgorithmParameterGenerator.SHACAL-2", a + "$AlgParamGen");
        configurableProvider.a("AlgorithmParameters.SHACAL-2", a + "$AlgParams");
    }
}
