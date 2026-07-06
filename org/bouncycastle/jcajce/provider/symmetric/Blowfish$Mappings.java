package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.n.c;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class Blowfish$Mappings extends AlgorithmProvider {
    private static final String a = Blowfish.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Mac.BLOWFISHCMAC", a + "$CMAC");
        configurableProvider.a("Cipher.BLOWFISH", a + "$ECB");
        configurableProvider.a("Cipher", c.z, a + "$CBC");
        configurableProvider.a("KeyGenerator.BLOWFISH", a + "$KeyGen");
        configurableProvider.a("Alg.Alias.KeyGenerator", c.z, "BLOWFISH");
        configurableProvider.a("AlgorithmParameters.BLOWFISH", a + "$AlgParams");
        configurableProvider.a("Alg.Alias.AlgorithmParameters", c.z, "BLOWFISH");
    }
}
