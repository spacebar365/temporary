package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.a.o.b;
import org.bouncycastle.a.s.n;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class SHA256$Mappings extends DigestAlgorithmProvider {
    private static final String a = SHA256.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("MessageDigest.SHA-256", a + "$Digest");
        configurableProvider.a("Alg.Alias.MessageDigest.SHA256", "SHA-256");
        configurableProvider.a("Alg.Alias.MessageDigest." + b.c, "SHA-256");
        configurableProvider.a("SecretKeyFactory.PBEWITHHMACSHA256", a + "$PBEWithMacKeyFactory");
        configurableProvider.a("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA-256", "PBEWITHHMACSHA256");
        configurableProvider.a("Alg.Alias.SecretKeyFactory." + b.c, "PBEWITHHMACSHA256");
        configurableProvider.a("Mac.PBEWITHHMACSHA256", a + "$HashMac");
        a(configurableProvider, "SHA256", a + "$HashMac", a + "$KeyGenerator");
        a(configurableProvider, "SHA256", n.M);
        a(configurableProvider, "SHA256", b.c);
    }
}
