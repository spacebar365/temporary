package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.f.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class GOST28147$Mappings extends AlgorithmProvider {
    private static final String a = GOST28147.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Cipher.GOST28147", a + "$ECB");
        configurableProvider.a("Alg.Alias.Cipher.GOST", "GOST28147");
        configurableProvider.a("Alg.Alias.Cipher.GOST-28147", "GOST28147");
        configurableProvider.a("Cipher." + a.f, a + "$GCFB");
        configurableProvider.a("KeyGenerator.GOST28147", a + "$KeyGen");
        configurableProvider.a("Alg.Alias.KeyGenerator.GOST", "GOST28147");
        configurableProvider.a("Alg.Alias.KeyGenerator.GOST-28147", "GOST28147");
        configurableProvider.a("Alg.Alias.KeyGenerator." + a.f, "GOST28147");
        configurableProvider.a("AlgorithmParameters.GOST28147", a + "$AlgParams");
        configurableProvider.a("AlgorithmParameterGenerator.GOST28147", a + "$AlgParamGen");
        configurableProvider.a("Alg.Alias.AlgorithmParameters." + a.f, "GOST28147");
        configurableProvider.a("Alg.Alias.AlgorithmParameterGenerator." + a.f, "GOST28147");
        configurableProvider.a("Cipher." + a.e, a + "$CryptoProWrap");
        configurableProvider.a("Cipher." + a.d, a + "$GostWrap");
        configurableProvider.a("Mac.GOST28147MAC", a + "$Mac");
        configurableProvider.a("Alg.Alias.Mac.GOST28147", "GOST28147MAC");
    }
}
