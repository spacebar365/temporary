package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class GOST3412_2015$Mappings extends AlgorithmProvider {
    private static final String a = GOST3412_2015.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Cipher.GOST3412-2015", a + "$ECB");
        configurableProvider.a("Cipher.GOST3412-2015/CFB", a + "$GCFB");
        configurableProvider.a("Cipher.GOST3412-2015/CFB8", a + "$GCFB8");
        configurableProvider.a("Cipher.GOST3412-2015/OFB", a + "$OFB");
        configurableProvider.a("Cipher.GOST3412-2015/CBC", a + "$CBC");
        configurableProvider.a("Cipher.GOST3412-2015/CTR", a + "$CTR");
        configurableProvider.a("KeyGenerator.GOST3412-2015", a + "$KeyGen");
        configurableProvider.a("Mac.GOST3412MAC", a + "$Mac");
        configurableProvider.a("Alg.Alias.Mac.GOST3412-2015", "GOST3412MAC");
    }
}
