package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class TLSKDF$Mappings extends AlgorithmProvider {
    private static final String a = TLSKDF.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("SecretKeyFactory.TLS10KDF", a + "$TLS10");
        configurableProvider.a("SecretKeyFactory.TLS11KDF", a + "$TLS11");
        configurableProvider.a("SecretKeyFactory.TLS12WITHSHA256KDF", a + "$TLS12withSHA256");
        configurableProvider.a("SecretKeyFactory.TLS12WITHSHA384KDF", a + "$TLS12withSHA384");
        configurableProvider.a("SecretKeyFactory.TLS12WITHSHA512KDF", a + "$TLS12withSHA512");
    }
}
