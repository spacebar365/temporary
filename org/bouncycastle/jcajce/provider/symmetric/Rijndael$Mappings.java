package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class Rijndael$Mappings extends AlgorithmProvider {
    private static final String a = Rijndael.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Cipher.RIJNDAEL", a + "$ECB");
        configurableProvider.a("KeyGenerator.RIJNDAEL", a + "$KeyGen");
        configurableProvider.a("AlgorithmParameters.RIJNDAEL", a + "$AlgParams");
    }
}
