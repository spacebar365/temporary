package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.a.o.b;
import org.bouncycastle.a.s.n;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class SHA224$Mappings extends DigestAlgorithmProvider {
    private static final String a = SHA224.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("MessageDigest.SHA-224", a + "$Digest");
        configurableProvider.a("Alg.Alias.MessageDigest.SHA224", "SHA-224");
        configurableProvider.a("Alg.Alias.MessageDigest." + b.f, "SHA-224");
        configurableProvider.a("Mac.PBEWITHHMACSHA224", a + "$HashMac");
        a(configurableProvider, "SHA224", a + "$HashMac", a + "$KeyGenerator");
        a(configurableProvider, "SHA224", n.L);
    }
}
