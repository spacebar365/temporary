package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.a.o.b;
import org.bouncycastle.a.s.n;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class SHA384$Mappings extends DigestAlgorithmProvider {
    private static final String a = SHA384.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("MessageDigest.SHA-384", a + "$Digest");
        configurableProvider.a("Alg.Alias.MessageDigest.SHA384", "SHA-384");
        configurableProvider.a("Alg.Alias.MessageDigest." + b.d, "SHA-384");
        configurableProvider.a("Mac.OLDHMACSHA384", a + "$OldSHA384");
        configurableProvider.a("Mac.PBEWITHHMACSHA384", a + "$HashMac");
        a(configurableProvider, "SHA384", a + "$HashMac", a + "$KeyGenerator");
        a(configurableProvider, "SHA384", n.N);
    }
}
