package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class Noekeon$Mappings extends SymmetricAlgorithmProvider {
    private static final String a = Noekeon.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("AlgorithmParameters.NOEKEON", a + "$AlgParams");
        configurableProvider.a("AlgorithmParameterGenerator.NOEKEON", a + "$AlgParamGen");
        configurableProvider.a("Cipher.NOEKEON", a + "$ECB");
        configurableProvider.a("KeyGenerator.NOEKEON", a + "$KeyGen");
        b(configurableProvider, "NOEKEON", a + "$GMAC", a + "$KeyGen");
        c(configurableProvider, "NOEKEON", a + "$Poly1305", a + "$Poly1305KeyGen");
    }
}
