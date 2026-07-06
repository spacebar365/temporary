package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class ChaCha$Mappings extends AlgorithmProvider {
    private static final String a = ChaCha.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Cipher.CHACHA", a + "$Base");
        configurableProvider.a("KeyGenerator.CHACHA", a + "$KeyGen");
        configurableProvider.a("Cipher.CHACHA7539", a + "$Base7539");
        configurableProvider.a("KeyGenerator.CHACHA7539", a + "$KeyGen7539");
        configurableProvider.a("AlgorithmParameters.CHACHA7539", a + "$AlgParams");
        configurableProvider.a("Alg.Alias.Cipher.CHACHA20", "CHACHA7539");
        configurableProvider.a("Alg.Alias.KeyGenerator.CHACHA20", "CHACHA7539");
        configurableProvider.a("Alg.Alias.AlgorithmParameters.CHACHA20", "CHACHA7539");
    }
}
