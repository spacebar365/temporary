package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p086b.C0821ab;
import org.bouncycastle.p083b.p092h.C0994g;
import org.bouncycastle.p083b.p092h.C1001n;

/* JADX INFO: loaded from: classes.dex */
public class Skein {

    public static class DigestSkein1024 extends BCMessageDigest implements Cloneable {
        public DigestSkein1024(int i) {
            super(new C0821ab(1024, i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.f5965a = new C0821ab((C0821ab) this.f5965a);
            return bCMessageDigest;
        }
    }

    public static class DigestSkein256 extends BCMessageDigest implements Cloneable {
        public DigestSkein256(int i) {
            super(new C0821ab(256, i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.f5965a = new C0821ab((C0821ab) this.f5965a);
            return bCMessageDigest;
        }
    }

    public static class DigestSkein512 extends BCMessageDigest implements Cloneable {
        public DigestSkein512(int i) {
            super(new C0821ab(512, i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.f5965a = new C0821ab((C0821ab) this.f5965a);
            return bCMessageDigest;
        }
    }

    public static class Digest_1024_1024 extends DigestSkein1024 {
        public Digest_1024_1024() {
            super(1024);
        }
    }

    public static class Digest_1024_384 extends DigestSkein1024 {
        public Digest_1024_384() {
            super(384);
        }
    }

    public static class Digest_1024_512 extends DigestSkein1024 {
        public Digest_1024_512() {
            super(512);
        }
    }

    public static class Digest_256_128 extends DigestSkein256 {
        public Digest_256_128() {
            super(128);
        }
    }

    public static class Digest_256_160 extends DigestSkein256 {
        public Digest_256_160() {
            super(160);
        }
    }

    public static class Digest_256_224 extends DigestSkein256 {
        public Digest_256_224() {
            super(224);
        }
    }

    public static class Digest_256_256 extends DigestSkein256 {
        public Digest_256_256() {
            super(256);
        }
    }

    public static class Digest_512_128 extends DigestSkein512 {
        public Digest_512_128() {
            super(128);
        }
    }

    public static class Digest_512_160 extends DigestSkein512 {
        public Digest_512_160() {
            super(160);
        }
    }

    public static class Digest_512_224 extends DigestSkein512 {
        public Digest_512_224() {
            super(224);
        }
    }

    public static class Digest_512_256 extends DigestSkein512 {
        public Digest_512_256() {
            super(256);
        }
    }

    public static class Digest_512_384 extends DigestSkein512 {
        public Digest_512_384() {
            super(384);
        }
    }

    public static class Digest_512_512 extends DigestSkein512 {
        public Digest_512_512() {
            super(512);
        }
    }

    public static class HMacKeyGenerator_1024_1024 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_1024() {
            super("HMACSkein-1024-1024", 1024, new C0987h());
        }
    }

    public static class HMacKeyGenerator_1024_384 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_384() {
            super("HMACSkein-1024-384", 384, new C0987h());
        }
    }

    public static class HMacKeyGenerator_1024_512 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_512() {
            super("HMACSkein-1024-512", 512, new C0987h());
        }
    }

    public static class HMacKeyGenerator_256_128 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_128() {
            super("HMACSkein-256-128", 128, new C0987h());
        }
    }

    public static class HMacKeyGenerator_256_160 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_160() {
            super("HMACSkein-256-160", 160, new C0987h());
        }
    }

    public static class HMacKeyGenerator_256_224 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_224() {
            super("HMACSkein-256-224", 224, new C0987h());
        }
    }

    public static class HMacKeyGenerator_256_256 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_256() {
            super("HMACSkein-256-256", 256, new C0987h());
        }
    }

    public static class HMacKeyGenerator_512_128 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_128() {
            super("HMACSkein-512-128", 128, new C0987h());
        }
    }

    public static class HMacKeyGenerator_512_160 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_160() {
            super("HMACSkein-512-160", 160, new C0987h());
        }
    }

    public static class HMacKeyGenerator_512_224 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_224() {
            super("HMACSkein-512-224", 224, new C0987h());
        }
    }

    public static class HMacKeyGenerator_512_256 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_256() {
            super("HMACSkein-512-256", 256, new C0987h());
        }
    }

    public static class HMacKeyGenerator_512_384 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_384() {
            super("HMACSkein-512-384", 384, new C0987h());
        }
    }

    public static class HMacKeyGenerator_512_512 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_512() {
            super("HMACSkein-512-512", 512, new C0987h());
        }
    }

    public static class HashMac_1024_1024 extends BaseMac {
        public HashMac_1024_1024() {
            super(new C0994g(new C0821ab(1024, 1024)));
        }
    }

    public static class HashMac_1024_384 extends BaseMac {
        public HashMac_1024_384() {
            super(new C0994g(new C0821ab(1024, 384)));
        }
    }

    public static class HashMac_1024_512 extends BaseMac {
        public HashMac_1024_512() {
            super(new C0994g(new C0821ab(1024, 512)));
        }
    }

    public static class HashMac_256_128 extends BaseMac {
        public HashMac_256_128() {
            super(new C0994g(new C0821ab(256, 128)));
        }
    }

    public static class HashMac_256_160 extends BaseMac {
        public HashMac_256_160() {
            super(new C0994g(new C0821ab(256, 160)));
        }
    }

    public static class HashMac_256_224 extends BaseMac {
        public HashMac_256_224() {
            super(new C0994g(new C0821ab(256, 224)));
        }
    }

    public static class HashMac_256_256 extends BaseMac {
        public HashMac_256_256() {
            super(new C0994g(new C0821ab(256, 256)));
        }
    }

    public static class HashMac_512_128 extends BaseMac {
        public HashMac_512_128() {
            super(new C0994g(new C0821ab(512, 128)));
        }
    }

    public static class HashMac_512_160 extends BaseMac {
        public HashMac_512_160() {
            super(new C0994g(new C0821ab(512, 160)));
        }
    }

    public static class HashMac_512_224 extends BaseMac {
        public HashMac_512_224() {
            super(new C0994g(new C0821ab(512, 224)));
        }
    }

    public static class HashMac_512_256 extends BaseMac {
        public HashMac_512_256() {
            super(new C0994g(new C0821ab(512, 256)));
        }
    }

    public static class HashMac_512_384 extends BaseMac {
        public HashMac_512_384() {
            super(new C0994g(new C0821ab(512, 384)));
        }
    }

    public static class HashMac_512_512 extends BaseMac {
        public HashMac_512_512() {
            super(new C0994g(new C0821ab(512, 512)));
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f5985a = Skein.class.getName();

        /* JADX INFO: renamed from: a */
        private static void m4369a(ConfigurableProvider configurableProvider, int i, int i2) {
            String str = "Skein-MAC-" + i + "-" + i2;
            String str2 = f5985a + "$SkeinMac_" + i + "_" + i2;
            String str3 = f5985a + "$SkeinMacKeyGenerator_" + i + "_" + i2;
            configurableProvider.mo2853a("Mac.".concat(String.valueOf(str)), str2);
            configurableProvider.mo2853a("Alg.Alias.Mac.Skein-MAC" + i + "/" + i2, str);
            configurableProvider.mo2853a("KeyGenerator.".concat(String.valueOf(str)), str3);
            configurableProvider.mo2853a("Alg.Alias.KeyGenerator.Skein-MAC" + i + "/" + i2, str);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("MessageDigest.Skein-256-128", f5985a + "$Digest_256_128");
            configurableProvider.mo2853a("MessageDigest.Skein-256-160", f5985a + "$Digest_256_160");
            configurableProvider.mo2853a("MessageDigest.Skein-256-224", f5985a + "$Digest_256_224");
            configurableProvider.mo2853a("MessageDigest.Skein-256-256", f5985a + "$Digest_256_256");
            configurableProvider.mo2853a("MessageDigest.Skein-512-128", f5985a + "$Digest_512_128");
            configurableProvider.mo2853a("MessageDigest.Skein-512-160", f5985a + "$Digest_512_160");
            configurableProvider.mo2853a("MessageDigest.Skein-512-224", f5985a + "$Digest_512_224");
            configurableProvider.mo2853a("MessageDigest.Skein-512-256", f5985a + "$Digest_512_256");
            configurableProvider.mo2853a("MessageDigest.Skein-512-384", f5985a + "$Digest_512_384");
            configurableProvider.mo2853a("MessageDigest.Skein-512-512", f5985a + "$Digest_512_512");
            configurableProvider.mo2853a("MessageDigest.Skein-1024-384", f5985a + "$Digest_1024_384");
            configurableProvider.mo2853a("MessageDigest.Skein-1024-512", f5985a + "$Digest_1024_512");
            configurableProvider.mo2853a("MessageDigest.Skein-1024-1024", f5985a + "$Digest_1024_1024");
            m4367a(configurableProvider, "Skein-256-128", f5985a + "$HashMac_256_128", f5985a + "$HMacKeyGenerator_256_128");
            m4367a(configurableProvider, "Skein-256-160", f5985a + "$HashMac_256_160", f5985a + "$HMacKeyGenerator_256_160");
            m4367a(configurableProvider, "Skein-256-224", f5985a + "$HashMac_256_224", f5985a + "$HMacKeyGenerator_256_224");
            m4367a(configurableProvider, "Skein-256-256", f5985a + "$HashMac_256_256", f5985a + "$HMacKeyGenerator_256_256");
            m4367a(configurableProvider, "Skein-512-128", f5985a + "$HashMac_512_128", f5985a + "$HMacKeyGenerator_512_128");
            m4367a(configurableProvider, "Skein-512-160", f5985a + "$HashMac_512_160", f5985a + "$HMacKeyGenerator_512_160");
            m4367a(configurableProvider, "Skein-512-224", f5985a + "$HashMac_512_224", f5985a + "$HMacKeyGenerator_512_224");
            m4367a(configurableProvider, "Skein-512-256", f5985a + "$HashMac_512_256", f5985a + "$HMacKeyGenerator_512_256");
            m4367a(configurableProvider, "Skein-512-384", f5985a + "$HashMac_512_384", f5985a + "$HMacKeyGenerator_512_384");
            m4367a(configurableProvider, "Skein-512-512", f5985a + "$HashMac_512_512", f5985a + "$HMacKeyGenerator_512_512");
            m4367a(configurableProvider, "Skein-1024-384", f5985a + "$HashMac_1024_384", f5985a + "$HMacKeyGenerator_1024_384");
            m4367a(configurableProvider, "Skein-1024-512", f5985a + "$HashMac_1024_512", f5985a + "$HMacKeyGenerator_1024_512");
            m4367a(configurableProvider, "Skein-1024-1024", f5985a + "$HashMac_1024_1024", f5985a + "$HMacKeyGenerator_1024_1024");
            m4369a(configurableProvider, 256, 128);
            m4369a(configurableProvider, 256, 160);
            m4369a(configurableProvider, 256, 224);
            m4369a(configurableProvider, 256, 256);
            m4369a(configurableProvider, 512, 128);
            m4369a(configurableProvider, 512, 160);
            m4369a(configurableProvider, 512, 224);
            m4369a(configurableProvider, 512, 256);
            m4369a(configurableProvider, 512, 384);
            m4369a(configurableProvider, 512, 512);
            m4369a(configurableProvider, 1024, 384);
            m4369a(configurableProvider, 1024, 512);
            m4369a(configurableProvider, 1024, 1024);
        }
    }

    public static class SkeinMacKeyGenerator_1024_1024 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_1024() {
            super("Skein-MAC-1024-1024", 1024, new C0987h());
        }
    }

    public static class SkeinMacKeyGenerator_1024_384 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_384() {
            super("Skein-MAC-1024-384", 384, new C0987h());
        }
    }

    public static class SkeinMacKeyGenerator_1024_512 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_512() {
            super("Skein-MAC-1024-512", 512, new C0987h());
        }
    }

    public static class SkeinMacKeyGenerator_256_128 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_128() {
            super("Skein-MAC-256-128", 128, new C0987h());
        }
    }

    public static class SkeinMacKeyGenerator_256_160 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_160() {
            super("Skein-MAC-256-160", 160, new C0987h());
        }
    }

    public static class SkeinMacKeyGenerator_256_224 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_224() {
            super("Skein-MAC-256-224", 224, new C0987h());
        }
    }

    public static class SkeinMacKeyGenerator_256_256 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_256() {
            super("Skein-MAC-256-256", 256, new C0987h());
        }
    }

    public static class SkeinMacKeyGenerator_512_128 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_128() {
            super("Skein-MAC-512-128", 128, new C0987h());
        }
    }

    public static class SkeinMacKeyGenerator_512_160 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_160() {
            super("Skein-MAC-512-160", 160, new C0987h());
        }
    }

    public static class SkeinMacKeyGenerator_512_224 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_224() {
            super("Skein-MAC-512-224", 224, new C0987h());
        }
    }

    public static class SkeinMacKeyGenerator_512_256 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_256() {
            super("Skein-MAC-512-256", 256, new C0987h());
        }
    }

    public static class SkeinMacKeyGenerator_512_384 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_384() {
            super("Skein-MAC-512-384", 384, new C0987h());
        }
    }

    public static class SkeinMacKeyGenerator_512_512 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_512() {
            super("Skein-MAC-512-512", 512, new C0987h());
        }
    }

    public static class SkeinMac_1024_1024 extends BaseMac {
        public SkeinMac_1024_1024() {
            super(new C1001n(1024, 1024));
        }
    }

    public static class SkeinMac_1024_384 extends BaseMac {
        public SkeinMac_1024_384() {
            super(new C1001n(1024, 384));
        }
    }

    public static class SkeinMac_1024_512 extends BaseMac {
        public SkeinMac_1024_512() {
            super(new C1001n(1024, 512));
        }
    }

    public static class SkeinMac_256_128 extends BaseMac {
        public SkeinMac_256_128() {
            super(new C1001n(256, 128));
        }
    }

    public static class SkeinMac_256_160 extends BaseMac {
        public SkeinMac_256_160() {
            super(new C1001n(256, 160));
        }
    }

    public static class SkeinMac_256_224 extends BaseMac {
        public SkeinMac_256_224() {
            super(new C1001n(256, 224));
        }
    }

    public static class SkeinMac_256_256 extends BaseMac {
        public SkeinMac_256_256() {
            super(new C1001n(256, 256));
        }
    }

    public static class SkeinMac_512_128 extends BaseMac {
        public SkeinMac_512_128() {
            super(new C1001n(512, 128));
        }
    }

    public static class SkeinMac_512_160 extends BaseMac {
        public SkeinMac_512_160() {
            super(new C1001n(512, 160));
        }
    }

    public static class SkeinMac_512_224 extends BaseMac {
        public SkeinMac_512_224() {
            super(new C1001n(512, 224));
        }
    }

    public static class SkeinMac_512_256 extends BaseMac {
        public SkeinMac_512_256() {
            super(new C1001n(512, 256));
        }
    }

    public static class SkeinMac_512_384 extends BaseMac {
        public SkeinMac_512_384() {
            super(new C1001n(512, 384));
        }
    }

    public static class SkeinMac_512_512 extends BaseMac {
        public SkeinMac_512_512() {
            super(new C1001n(512, 512));
        }
    }

    private Skein() {
    }
}
