package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class XTEA$Mappings extends AlgorithmProvider {
    private static final String a = XTEA.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Cipher.XTEA", a + "$ECB");
        configurableProvider.a("KeyGenerator.XTEA", a + "$KeyGen");
        configurableProvider.a("AlgorithmParameters.XTEA", a + "$AlgParams");
    }
}
