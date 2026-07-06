package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.n.c;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class IDEA$Mappings extends AlgorithmProvider {
    private static final String a = IDEA.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("AlgorithmParameterGenerator.IDEA", a + "$AlgParamGen");
        configurableProvider.a("AlgorithmParameterGenerator.1.3.6.1.4.1.188.7.1.1.2", a + "$AlgParamGen");
        configurableProvider.a("AlgorithmParameters.IDEA", a + "$AlgParams");
        configurableProvider.a("AlgorithmParameters.1.3.6.1.4.1.188.7.1.1.2", a + "$AlgParams");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA", "PKCS12PBE");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA-CBC", "PKCS12PBE");
        configurableProvider.a("Cipher.IDEA", a + "$ECB");
        configurableProvider.a("Cipher", c.v, a + "$CBC");
        configurableProvider.a("Cipher.PBEWITHSHAANDIDEA-CBC", a + "$PBEWithSHAAndIDEA");
        configurableProvider.a("KeyGenerator.IDEA", a + "$KeyGen");
        configurableProvider.a("KeyGenerator", c.v, a + "$KeyGen");
        configurableProvider.a("SecretKeyFactory.PBEWITHSHAANDIDEA-CBC", a + "$PBEWithSHAAndIDEAKeyGen");
        configurableProvider.a("Mac.IDEAMAC", a + "$Mac");
        configurableProvider.a("Alg.Alias.Mac.IDEA", "IDEAMAC");
        configurableProvider.a("Mac.IDEAMAC/CFB8", a + "$CFB8Mac");
        configurableProvider.a("Alg.Alias.Mac.IDEA/CFB8", "IDEAMAC/CFB8");
    }
}
