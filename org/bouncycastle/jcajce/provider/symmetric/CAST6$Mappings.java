package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class CAST6$Mappings extends SymmetricAlgorithmProvider {
    private static final String a = CAST6.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Cipher.CAST6", a + "$ECB");
        configurableProvider.a("KeyGenerator.CAST6", a + "$KeyGen");
        configurableProvider.a("AlgorithmParameters.CAST6", a + "$AlgParams");
        b(configurableProvider, "CAST6", a + "$GMAC", a + "$KeyGen");
        c(configurableProvider, "CAST6", a + "$Poly1305", a + "$Poly1305KeyGen");
    }
}
