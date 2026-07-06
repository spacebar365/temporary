package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class SipHash$Mappings extends AlgorithmProvider {
    private static final String a = SipHash.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Mac.SIPHASH-2-4", a + "$Mac24");
        configurableProvider.a("Alg.Alias.Mac.SIPHASH", "SIPHASH-2-4");
        configurableProvider.a("Mac.SIPHASH-4-8", a + "$Mac48");
        configurableProvider.a("KeyGenerator.SIPHASH", a + "$KeyGen");
        configurableProvider.a("Alg.Alias.KeyGenerator.SIPHASH-2-4", "SIPHASH");
        configurableProvider.a("Alg.Alias.KeyGenerator.SIPHASH-4-8", "SIPHASH");
    }
}
