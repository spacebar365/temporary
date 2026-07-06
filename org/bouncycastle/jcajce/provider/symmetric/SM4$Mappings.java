package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class SM4$Mappings extends SymmetricAlgorithmProvider {
    private static final String a = SM4.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("AlgorithmParameters.SM4", a + "$AlgParams");
        configurableProvider.a("AlgorithmParameterGenerator.SM4", a + "$AlgParamGen");
        configurableProvider.a("Cipher.SM4", a + "$ECB");
        configurableProvider.a("KeyGenerator.SM4", a + "$KeyGen");
        a(configurableProvider, "SM4", a + "$CMAC", a + "$KeyGen");
        b(configurableProvider, "SM4", a + "$GMAC", a + "$KeyGen");
        c(configurableProvider, "SM4", a + "$Poly1305", a + "$Poly1305KeyGen");
    }
}
