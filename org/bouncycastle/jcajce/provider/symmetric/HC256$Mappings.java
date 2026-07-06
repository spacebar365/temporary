package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class HC256$Mappings extends AlgorithmProvider {
    private static final String a = HC256.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Cipher.HC256", a + "$Base");
        configurableProvider.a("KeyGenerator.HC256", a + "$KeyGen");
        configurableProvider.a("AlgorithmParameters.HC256", a + "$AlgParams");
    }
}
