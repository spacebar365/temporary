package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class VMPCKSA3$Mappings extends AlgorithmProvider {
    private static final String a = VMPCKSA3.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Cipher.VMPC-KSA3", a + "$Base");
        configurableProvider.a("KeyGenerator.VMPC-KSA3", a + "$KeyGen");
    }
}
