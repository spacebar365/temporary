package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class OpenSSLPBKDF$Mappings extends AlgorithmProvider {
    private static final String a = OpenSSLPBKDF.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("SecretKeyFactory.PBKDF-OPENSSL", a + "$PBKDF");
    }
}
