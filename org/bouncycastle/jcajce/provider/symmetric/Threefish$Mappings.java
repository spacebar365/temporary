package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class Threefish$Mappings extends AlgorithmProvider {
    private static final String a = Threefish.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Mac.Threefish-256CMAC", a + "$CMAC_256");
        configurableProvider.a("Mac.Threefish-512CMAC", a + "$CMAC_512");
        configurableProvider.a("Mac.Threefish-1024CMAC", a + "$CMAC_1024");
        configurableProvider.a("Cipher.Threefish-256", a + "$ECB_256");
        configurableProvider.a("Cipher.Threefish-512", a + "$ECB_512");
        configurableProvider.a("Cipher.Threefish-1024", a + "$ECB_1024");
        configurableProvider.a("KeyGenerator.Threefish-256", a + "$KeyGen_256");
        configurableProvider.a("KeyGenerator.Threefish-512", a + "$KeyGen_512");
        configurableProvider.a("KeyGenerator.Threefish-1024", a + "$KeyGen_1024");
        configurableProvider.a("AlgorithmParameters.Threefish-256", a + "$AlgParams_256");
        configurableProvider.a("AlgorithmParameters.Threefish-512", a + "$AlgParams_512");
        configurableProvider.a("AlgorithmParameters.Threefish-1024", a + "$AlgParams_1024");
    }
}
