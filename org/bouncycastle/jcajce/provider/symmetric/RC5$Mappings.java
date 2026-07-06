package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class RC5$Mappings extends AlgorithmProvider {
    private static final String a = RC5.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Cipher.RC5", a + "$ECB32");
        configurableProvider.a("Alg.Alias.Cipher.RC5-32", "RC5");
        configurableProvider.a("Cipher.RC5-64", a + "$ECB64");
        configurableProvider.a("KeyGenerator.RC5", a + "$KeyGen32");
        configurableProvider.a("Alg.Alias.KeyGenerator.RC5-32", "RC5");
        configurableProvider.a("KeyGenerator.RC5-64", a + "$KeyGen64");
        configurableProvider.a("AlgorithmParameters.RC5", a + "$AlgParams");
        configurableProvider.a("AlgorithmParameters.RC5-64", a + "$AlgParams");
        configurableProvider.a("Mac.RC5MAC", a + "$Mac32");
        configurableProvider.a("Alg.Alias.Mac.RC5", "RC5MAC");
        configurableProvider.a("Mac.RC5MAC/CFB8", a + "$CFB8Mac32");
        configurableProvider.a("Alg.Alias.Mac.RC5/CFB8", "RC5MAC/CFB8");
    }
}
