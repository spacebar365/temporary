package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class RC6$Mappings extends SymmetricAlgorithmProvider {
    private static final String a = RC6.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Cipher.RC6", a + "$ECB");
        configurableProvider.a("KeyGenerator.RC6", a + "$KeyGen");
        configurableProvider.a("AlgorithmParameters.RC6", a + "$AlgParams");
        b(configurableProvider, "RC6", a + "$GMAC", a + "$KeyGen");
        c(configurableProvider, "RC6", a + "$Poly1305", a + "$Poly1305KeyGen");
    }
}
