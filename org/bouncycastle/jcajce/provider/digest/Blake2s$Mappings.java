package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.a.n.c;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class Blake2s$Mappings extends DigestAlgorithmProvider {
    private static final String a = Blake2s.class.getName();

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("MessageDigest.BLAKE2S-256", a + "$Blake2s256");
        configurableProvider.a("Alg.Alias.MessageDigest." + c.K, "BLAKE2S-256");
        configurableProvider.a("MessageDigest.BLAKE2S-224", a + "$Blake2s224");
        configurableProvider.a("Alg.Alias.MessageDigest." + c.J, "BLAKE2S-224");
        configurableProvider.a("MessageDigest.BLAKE2S-160", a + "$Blake2s160");
        configurableProvider.a("Alg.Alias.MessageDigest." + c.I, "BLAKE2S-160");
        configurableProvider.a("MessageDigest.BLAKE2S-128", a + "$Blake2s128");
        configurableProvider.a("Alg.Alias.MessageDigest." + c.H, "BLAKE2S-128");
    }
}
