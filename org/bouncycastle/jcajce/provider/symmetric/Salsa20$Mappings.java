package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class Salsa20$Mappings extends AlgorithmProvider {
    private static final String a = Salsa20.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Cipher.SALSA20", a + "$Base");
        configurableProvider.a("KeyGenerator.SALSA20", a + "$KeyGen");
        configurableProvider.a("AlgorithmParameters.SALSA20", a + "$AlgParams");
    }
}
