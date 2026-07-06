package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.n.c;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class SCRYPT$Mappings extends AlgorithmProvider {
    private static final String a = SCRYPT.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("SecretKeyFactory.SCRYPT", a + "$ScryptWithUTF8");
        configurableProvider.a("SecretKeyFactory", c.L, a + "$ScryptWithUTF8");
    }
}
