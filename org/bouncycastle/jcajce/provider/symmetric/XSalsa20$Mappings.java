package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class XSalsa20$Mappings extends AlgorithmProvider {
    private static final String a = XSalsa20.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("Cipher.XSALSA20", a + "$Base");
        configurableProvider.a("KeyGenerator.XSALSA20", a + "$KeyGen");
        configurableProvider.a("AlgorithmParameters.XSALSA20", a + "$AlgParams");
    }
}
