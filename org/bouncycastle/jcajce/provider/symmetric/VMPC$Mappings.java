package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class VMPC$Mappings extends AlgorithmProvider {
    private static final String a = VMPC.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Cipher.VMPC", a + "$Base");
        configurableProvider.a("KeyGenerator.VMPC", a + "$KeyGen");
        configurableProvider.a("Mac.VMPCMAC", a + "$Mac");
        configurableProvider.a("Alg.Alias.Mac.VMPC", "VMPCMAC");
        configurableProvider.a("Alg.Alias.Mac.VMPC-MAC", "VMPCMAC");
    }
}
