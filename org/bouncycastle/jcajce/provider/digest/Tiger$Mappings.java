package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.a.k.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class Tiger$Mappings extends DigestAlgorithmProvider {
    private static final String a = Tiger.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("MessageDigest.TIGER", a + "$Digest");
        configurableProvider.a("MessageDigest.Tiger", a + "$Digest");
        a(configurableProvider, "TIGER", a + "$HashMac", a + "$KeyGenerator");
        a(configurableProvider, "TIGER", a.p);
        configurableProvider.a("SecretKeyFactory.PBEWITHHMACTIGER", a + "$PBEWithMacKeyFactory");
    }
}
