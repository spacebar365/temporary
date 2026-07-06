package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class Skipjack$Mappings extends AlgorithmProvider {
    private static final String a = Skipjack.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Cipher.SKIPJACK", a + "$ECB");
        configurableProvider.a("KeyGenerator.SKIPJACK", a + "$KeyGen");
        configurableProvider.a("AlgorithmParameters.SKIPJACK", a + "$AlgParams");
        configurableProvider.a("Mac.SKIPJACKMAC", a + "$Mac");
        configurableProvider.a("Alg.Alias.Mac.SKIPJACK", "SKIPJACKMAC");
        configurableProvider.a("Mac.SKIPJACKMAC/CFB8", a + "$MacCFB8");
        configurableProvider.a("Alg.Alias.Mac.SKIPJACK/CFB8", "SKIPJACKMAC/CFB8");
    }
}
