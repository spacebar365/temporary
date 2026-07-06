package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class Grain128$Mappings extends AlgorithmProvider {
    private static final String a = Grain128.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Cipher.Grain128", a + "$Base");
        configurableProvider.a("KeyGenerator.Grain128", a + "$KeyGen");
    }
}
