package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.a.f.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class GOST3411$Mappings extends DigestAlgorithmProvider {
    private static final String a = GOST3411.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("MessageDigest.GOST3411", a + "$Digest");
        configurableProvider.a("Alg.Alias.MessageDigest.GOST", "GOST3411");
        configurableProvider.a("Alg.Alias.MessageDigest.GOST-3411", "GOST3411");
        configurableProvider.a("Alg.Alias.MessageDigest." + a.b, "GOST3411");
        a(configurableProvider, "GOST3411", a + "$HashMac", a + "$KeyGenerator");
        a(configurableProvider, "GOST3411", a.b);
        configurableProvider.a("MessageDigest.GOST3411-2012-256", a + "$Digest2012_256");
        configurableProvider.a("Alg.Alias.MessageDigest.GOST-2012-256", "GOST3411-2012-256");
        configurableProvider.a("Alg.Alias.MessageDigest.GOST-3411-2012-256", "GOST3411-2012-256");
        configurableProvider.a("Alg.Alias.MessageDigest." + org.bouncycastle.a.t.a.c, "GOST3411-2012-256");
        a(configurableProvider, "GOST3411-2012-256", a + "$HashMac2012_256", a + "$KeyGenerator2012_256");
        a(configurableProvider, "GOST3411-2012-256", org.bouncycastle.a.t.a.e);
        configurableProvider.a("MessageDigest.GOST3411-2012-512", a + "$Digest2012_512");
        configurableProvider.a("Alg.Alias.MessageDigest.GOST-2012-512", "GOST3411-2012-512");
        configurableProvider.a("Alg.Alias.MessageDigest.GOST-3411-2012-512", "GOST3411-2012-512");
        configurableProvider.a("Alg.Alias.MessageDigest." + org.bouncycastle.a.t.a.d, "GOST3411-2012-512");
        a(configurableProvider, "GOST3411-2012-512", a + "$HashMac2012_512", a + "$KeyGenerator2012_512");
        a(configurableProvider, "GOST3411-2012-512", org.bouncycastle.a.t.a.f);
        configurableProvider.a("SecretKeyFactory.PBEWITHHMACGOST3411", a + "$PBEWithMacKeyFactory");
        configurableProvider.a("Alg.Alias.SecretKeyFactory." + a.b, "PBEWITHHMACGOST3411");
    }
}
