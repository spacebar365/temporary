package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class Keccak$Mappings extends DigestAlgorithmProvider {
    private static final String a = Keccak.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("MessageDigest.KECCAK-224", a + "$Digest224");
        configurableProvider.a("MessageDigest.KECCAK-288", a + "$Digest288");
        configurableProvider.a("MessageDigest.KECCAK-256", a + "$Digest256");
        configurableProvider.a("MessageDigest.KECCAK-384", a + "$Digest384");
        configurableProvider.a("MessageDigest.KECCAK-512", a + "$Digest512");
        a(configurableProvider, "KECCAK224", a + "$HashMac224", a + "$KeyGenerator224");
        a(configurableProvider, "KECCAK256", a + "$HashMac256", a + "$KeyGenerator256");
        a(configurableProvider, "KECCAK288", a + "$HashMac288", a + "$KeyGenerator288");
        a(configurableProvider, "KECCAK384", a + "$HashMac384", a + "$KeyGenerator384");
        a(configurableProvider, "KECCAK512", a + "$HashMac512", a + "$KeyGenerator512");
    }
}
