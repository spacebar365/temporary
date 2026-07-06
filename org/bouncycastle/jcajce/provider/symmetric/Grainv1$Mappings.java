package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class Grainv1$Mappings extends AlgorithmProvider {
    private static final String a = Grainv1.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Cipher.Grainv1", a + "$Base");
        configurableProvider.a("KeyGenerator.Grainv1", a + "$KeyGen");
        configurableProvider.a("AlgorithmParameters.Grainv1", a + "$AlgParams");
    }
}
