package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.a.k.a;
import org.bouncycastle.a.r.b;
import org.bouncycastle.a.s.n;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class SHA1$Mappings extends DigestAlgorithmProvider {
    private static final String a = SHA1.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("MessageDigest.SHA-1", a + "$Digest");
        configurableProvider.a("Alg.Alias.MessageDigest.SHA1", "SHA-1");
        configurableProvider.a("Alg.Alias.MessageDigest.SHA", "SHA-1");
        configurableProvider.a("Alg.Alias.MessageDigest." + b.i, "SHA-1");
        a(configurableProvider, "SHA1", a + "$HashMac", a + "$KeyGenerator");
        a(configurableProvider, "SHA1", n.K);
        a(configurableProvider, "SHA1", a.o);
        configurableProvider.a("Mac.PBEWITHHMACSHA", a + "$SHA1Mac");
        configurableProvider.a("Mac.PBEWITHHMACSHA1", a + "$SHA1Mac");
        configurableProvider.a("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA", "PBEWITHHMACSHA1");
        configurableProvider.a("Alg.Alias.SecretKeyFactory." + b.i, "PBEWITHHMACSHA1");
        configurableProvider.a("Alg.Alias.Mac." + b.i, "PBEWITHHMACSHA");
        configurableProvider.a("SecretKeyFactory.PBEWITHHMACSHA1", a + "$PBEWithMacKeyFactory");
    }
}
