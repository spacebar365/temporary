package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p086b.C0832i;
import org.bouncycastle.p083b.p092h.C0994g;

/* JADX INFO: loaded from: classes.dex */
public class Keccak {

    public static class Digest224 extends DigestKeccak {
        public Digest224() {
            super(224);
        }
    }

    public static class Digest256 extends DigestKeccak {
        public Digest256() {
            super(256);
        }
    }

    public static class Digest288 extends DigestKeccak {
        public Digest288() {
            super(288);
        }
    }

    public static class Digest384 extends DigestKeccak {
        public Digest384() {
            super(384);
        }
    }

    public static class Digest512 extends DigestKeccak {
        public Digest512() {
            super(512);
        }
    }

    public static class DigestKeccak extends BCMessageDigest implements Cloneable {
        public DigestKeccak(int i) {
            super(new C0832i(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.f5965a = new C0832i((C0832i) this.f5965a);
            return bCMessageDigest;
        }
    }

    public static class HashMac224 extends BaseMac {
        public HashMac224() {
            super(new C0994g(new C0832i(224)));
        }
    }

    public static class HashMac256 extends BaseMac {
        public HashMac256() {
            super(new C0994g(new C0832i(256)));
        }
    }

    public static class HashMac288 extends BaseMac {
        public HashMac288() {
            super(new C0994g(new C0832i(288)));
        }
    }

    public static class HashMac384 extends BaseMac {
        public HashMac384() {
            super(new C0994g(new C0832i(384)));
        }
    }

    public static class HashMac512 extends BaseMac {
        public HashMac512() {
            super(new C0994g(new C0832i(512)));
        }
    }

    public static class KeyGenerator224 extends BaseKeyGenerator {
        public KeyGenerator224() {
            super("HMACKECCAK224", 224, new C0987h());
        }
    }

    public static class KeyGenerator256 extends BaseKeyGenerator {
        public KeyGenerator256() {
            super("HMACKECCAK256", 256, new C0987h());
        }
    }

    public static class KeyGenerator288 extends BaseKeyGenerator {
        public KeyGenerator288() {
            super("HMACKECCAK288", 288, new C0987h());
        }
    }

    public static class KeyGenerator384 extends BaseKeyGenerator {
        public KeyGenerator384() {
            super("HMACKECCAK384", 384, new C0987h());
        }
    }

    public static class KeyGenerator512 extends BaseKeyGenerator {
        public KeyGenerator512() {
            super("HMACKECCAK512", 512, new C0987h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f5970a = Keccak.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("MessageDigest.KECCAK-224", f5970a + "$Digest224");
            configurableProvider.mo2853a("MessageDigest.KECCAK-288", f5970a + "$Digest288");
            configurableProvider.mo2853a("MessageDigest.KECCAK-256", f5970a + "$Digest256");
            configurableProvider.mo2853a("MessageDigest.KECCAK-384", f5970a + "$Digest384");
            configurableProvider.mo2853a("MessageDigest.KECCAK-512", f5970a + "$Digest512");
            m4367a(configurableProvider, "KECCAK224", f5970a + "$HashMac224", f5970a + "$KeyGenerator224");
            m4367a(configurableProvider, "KECCAK256", f5970a + "$HashMac256", f5970a + "$KeyGenerator256");
            m4367a(configurableProvider, "KECCAK288", f5970a + "$HashMac288", f5970a + "$KeyGenerator288");
            m4367a(configurableProvider, "KECCAK384", f5970a + "$HashMac384", f5970a + "$KeyGenerator384");
            m4367a(configurableProvider, "KECCAK512", f5970a + "$HashMac512", f5970a + "$KeyGenerator512");
        }
    }

    private Keccak() {
    }
}
