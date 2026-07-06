package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class Skein$Mappings extends DigestAlgorithmProvider {
    private static final String a = Skein.class.getName();

    private static void a(ConfigurableProvider configurableProvider, int i, int i2) {
        String str = "Skein-MAC-" + i + "-" + i2;
        String str2 = a + "$SkeinMac_" + i + "_" + i2;
        String str3 = a + "$SkeinMacKeyGenerator_" + i + "_" + i2;
        configurableProvider.a("Mac.".concat(String.valueOf(str)), str2);
        configurableProvider.a("Alg.Alias.Mac.Skein-MAC" + i + "/" + i2, str);
        configurableProvider.a("KeyGenerator.".concat(String.valueOf(str)), str3);
        configurableProvider.a("Alg.Alias.KeyGenerator.Skein-MAC" + i + "/" + i2, str);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public final void a(ConfigurableProvider configurableProvider) {
        configurableProvider.a("MessageDigest.Skein-256-128", a + "$Digest_256_128");
        configurableProvider.a("MessageDigest.Skein-256-160", a + "$Digest_256_160");
        configurableProvider.a("MessageDigest.Skein-256-224", a + "$Digest_256_224");
        configurableProvider.a("MessageDigest.Skein-256-256", a + "$Digest_256_256");
        configurableProvider.a("MessageDigest.Skein-512-128", a + "$Digest_512_128");
        configurableProvider.a("MessageDigest.Skein-512-160", a + "$Digest_512_160");
        configurableProvider.a("MessageDigest.Skein-512-224", a + "$Digest_512_224");
        configurableProvider.a("MessageDigest.Skein-512-256", a + "$Digest_512_256");
        configurableProvider.a("MessageDigest.Skein-512-384", a + "$Digest_512_384");
        configurableProvider.a("MessageDigest.Skein-512-512", a + "$Digest_512_512");
        configurableProvider.a("MessageDigest.Skein-1024-384", a + "$Digest_1024_384");
        configurableProvider.a("MessageDigest.Skein-1024-512", a + "$Digest_1024_512");
        configurableProvider.a("MessageDigest.Skein-1024-1024", a + "$Digest_1024_1024");
        a(configurableProvider, "Skein-256-128", a + "$HashMac_256_128", a + "$HMacKeyGenerator_256_128");
        a(configurableProvider, "Skein-256-160", a + "$HashMac_256_160", a + "$HMacKeyGenerator_256_160");
        a(configurableProvider, "Skein-256-224", a + "$HashMac_256_224", a + "$HMacKeyGenerator_256_224");
        a(configurableProvider, "Skein-256-256", a + "$HashMac_256_256", a + "$HMacKeyGenerator_256_256");
        a(configurableProvider, "Skein-512-128", a + "$HashMac_512_128", a + "$HMacKeyGenerator_512_128");
        a(configurableProvider, "Skein-512-160", a + "$HashMac_512_160", a + "$HMacKeyGenerator_512_160");
        a(configurableProvider, "Skein-512-224", a + "$HashMac_512_224", a + "$HMacKeyGenerator_512_224");
        a(configurableProvider, "Skein-512-256", a + "$HashMac_512_256", a + "$HMacKeyGenerator_512_256");
        a(configurableProvider, "Skein-512-384", a + "$HashMac_512_384", a + "$HMacKeyGenerator_512_384");
        a(configurableProvider, "Skein-512-512", a + "$HashMac_512_512", a + "$HMacKeyGenerator_512_512");
        a(configurableProvider, "Skein-1024-384", a + "$HashMac_1024_384", a + "$HMacKeyGenerator_1024_384");
        a(configurableProvider, "Skein-1024-512", a + "$HashMac_1024_512", a + "$HMacKeyGenerator_1024_512");
        a(configurableProvider, "Skein-1024-1024", a + "$HashMac_1024_1024", a + "$HMacKeyGenerator_1024_1024");
        a(configurableProvider, 256, 128);
        a(configurableProvider, 256, 160);
        a(configurableProvider, 256, 224);
        a(configurableProvider, 256, 256);
        a(configurableProvider, 512, 128);
        a(configurableProvider, 512, 160);
        a(configurableProvider, 512, 224);
        a(configurableProvider, 512, 256);
        a(configurableProvider, 512, 384);
        a(configurableProvider, 512, 512);
        a(configurableProvider, 1024, 384);
        a(configurableProvider, 1024, 512);
        a(configurableProvider, 1024, 1024);
    }
}
