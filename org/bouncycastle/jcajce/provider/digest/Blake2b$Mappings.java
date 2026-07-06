package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.a.n.c;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class Blake2b$Mappings extends DigestAlgorithmProvider {
    private static final String a = Blake2b.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("MessageDigest.BLAKE2B-512", a + "$Blake2b512");
        configurableProvider.a("Alg.Alias.MessageDigest." + c.G, "BLAKE2B-512");
        configurableProvider.a("MessageDigest.BLAKE2B-384", a + "$Blake2b384");
        configurableProvider.a("Alg.Alias.MessageDigest." + c.F, "BLAKE2B-384");
        configurableProvider.a("MessageDigest.BLAKE2B-256", a + "$Blake2b256");
        configurableProvider.a("Alg.Alias.MessageDigest." + c.E, "BLAKE2B-256");
        configurableProvider.a("MessageDigest.BLAKE2B-160", a + "$Blake2b160");
        configurableProvider.a("Alg.Alias.MessageDigest." + c.D, "BLAKE2B-160");
    }
}
