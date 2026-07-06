package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.a.o.b;
import org.bouncycastle.a.s.n;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class SHA512$Mappings extends DigestAlgorithmProvider {
    private static final String a = SHA512.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("MessageDigest.SHA-512", a + "$Digest");
        configurableProvider.a("Alg.Alias.MessageDigest.SHA512", "SHA-512");
        configurableProvider.a("Alg.Alias.MessageDigest." + b.e, "SHA-512");
        configurableProvider.a("MessageDigest.SHA-512/224", a + "$DigestT224");
        configurableProvider.a("Alg.Alias.MessageDigest.SHA512/224", "SHA-512/224");
        configurableProvider.a("Alg.Alias.MessageDigest." + b.g, "SHA-512/224");
        configurableProvider.a("MessageDigest.SHA-512/256", a + "$DigestT256");
        configurableProvider.a("Alg.Alias.MessageDigest.SHA512256", "SHA-512/256");
        configurableProvider.a("Alg.Alias.MessageDigest." + b.h, "SHA-512/256");
        configurableProvider.a("Mac.OLDHMACSHA512", a + "$OldSHA512");
        configurableProvider.a("Mac.PBEWITHHMACSHA512", a + "$HashMac");
        a(configurableProvider, "SHA512", a + "$HashMac", a + "$KeyGenerator");
        a(configurableProvider, "SHA512", n.O);
        a(configurableProvider, "SHA512/224", a + "$HashMacT224", a + "$KeyGeneratorT224");
        a(configurableProvider, "SHA512/256", a + "$HashMacT256", a + "$KeyGeneratorT256");
    }
}
