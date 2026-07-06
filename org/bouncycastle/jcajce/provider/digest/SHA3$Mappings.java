package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.a.o.b;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class SHA3$Mappings extends DigestAlgorithmProvider {
    private static final String a = SHA3.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("MessageDigest.SHA3-224", a + "$Digest224");
        configurableProvider.a("MessageDigest.SHA3-256", a + "$Digest256");
        configurableProvider.a("MessageDigest.SHA3-384", a + "$Digest384");
        configurableProvider.a("MessageDigest.SHA3-512", a + "$Digest512");
        configurableProvider.a("MessageDigest", b.i, a + "$Digest224");
        configurableProvider.a("MessageDigest", b.j, a + "$Digest256");
        configurableProvider.a("MessageDigest", b.k, a + "$Digest384");
        configurableProvider.a("MessageDigest", b.l, a + "$Digest512");
        a(configurableProvider, "SHA3-224", a + "$HashMac224", a + "$KeyGenerator224");
        a(configurableProvider, "SHA3-224", b.o);
        a(configurableProvider, "SHA3-256", a + "$HashMac256", a + "$KeyGenerator256");
        a(configurableProvider, "SHA3-256", b.p);
        a(configurableProvider, "SHA3-384", a + "$HashMac384", a + "$KeyGenerator384");
        a(configurableProvider, "SHA3-384", b.q);
        a(configurableProvider, "SHA3-512", a + "$HashMac512", a + "$KeyGenerator512");
        a(configurableProvider, "SHA3-512", b.r);
    }
}
