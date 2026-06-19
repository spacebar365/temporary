package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.p054a.p061f.InterfaceC0619a;
import org.bouncycastle.p054a.p075t.InterfaceC0685a;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p086b.C0827d;
import org.bouncycastle.p083b.p086b.C0829f;
import org.bouncycastle.p083b.p086b.C0830g;
import org.bouncycastle.p083b.p092h.C0994g;

/* JADX INFO: loaded from: classes.dex */
public class GOST3411 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C0827d());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.f5965a = new C0827d((C0827d) this.f5965a);
            return digest;
        }
    }

    public static class Digest2012_256 extends BCMessageDigest implements Cloneable {
        public Digest2012_256() {
            super(new C0829f());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest2012_256 digest2012_256 = (Digest2012_256) super.clone();
            digest2012_256.f5965a = new C0829f((C0829f) this.f5965a);
            return digest2012_256;
        }
    }

    public static class Digest2012_512 extends BCMessageDigest implements Cloneable {
        public Digest2012_512() {
            super(new C0830g());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest2012_512 digest2012_512 = (Digest2012_512) super.clone();
            digest2012_512.f5965a = new C0830g((C0830g) this.f5965a);
            return digest2012_512;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0994g(new C0827d()));
        }
    }

    public static class HashMac2012_256 extends BaseMac {
        public HashMac2012_256() {
            super(new C0994g(new C0829f()));
        }
    }

    public static class HashMac2012_512 extends BaseMac {
        public HashMac2012_512() {
            super(new C0994g(new C0830g()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACGOST3411", 256, new C0987h());
        }
    }

    public static class KeyGenerator2012_256 extends BaseKeyGenerator {
        public KeyGenerator2012_256() {
            super("HMACGOST3411", 256, new C0987h());
        }
    }

    public static class KeyGenerator2012_512 extends BaseKeyGenerator {
        public KeyGenerator2012_512() {
            super("HMACGOST3411", 512, new C0987h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f5969a = GOST3411.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("MessageDigest.GOST3411", f5969a + "$Digest");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest.GOST", "GOST3411");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest.GOST-3411", "GOST3411");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0619a.f2194b, "GOST3411");
            m4367a(configurableProvider, "GOST3411", f5969a + "$HashMac", f5969a + "$KeyGenerator");
            m4368a(configurableProvider, "GOST3411", InterfaceC0619a.f2194b);
            configurableProvider.mo2853a("MessageDigest.GOST3411-2012-256", f5969a + "$Digest2012_256");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest.GOST-2012-256", "GOST3411-2012-256");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest.GOST-3411-2012-256", "GOST3411-2012-256");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0685a.f2803c, "GOST3411-2012-256");
            m4367a(configurableProvider, "GOST3411-2012-256", f5969a + "$HashMac2012_256", f5969a + "$KeyGenerator2012_256");
            m4368a(configurableProvider, "GOST3411-2012-256", InterfaceC0685a.f2805e);
            configurableProvider.mo2853a("MessageDigest.GOST3411-2012-512", f5969a + "$Digest2012_512");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest.GOST-2012-512", "GOST3411-2012-512");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest.GOST-3411-2012-512", "GOST3411-2012-512");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0685a.f2804d, "GOST3411-2012-512");
            m4367a(configurableProvider, "GOST3411-2012-512", f5969a + "$HashMac2012_512", f5969a + "$KeyGenerator2012_512");
            m4368a(configurableProvider, "GOST3411-2012-512", InterfaceC0685a.f2806f);
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHHMACGOST3411", f5969a + "$PBEWithMacKeyFactory");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory." + InterfaceC0619a.f2194b, "PBEWITHHMACGOST3411");
        }
    }

    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacGOST3411", null, false, 2, 6, 256, 0);
        }
    }

    private GOST3411() {
    }
}
