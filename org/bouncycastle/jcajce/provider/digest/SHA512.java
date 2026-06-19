package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.p054a.p070o.InterfaceC0652b;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p086b.C0847x;
import org.bouncycastle.p083b.p086b.C0848y;
import org.bouncycastle.p083b.p092h.C0994g;
import org.bouncycastle.p083b.p092h.C0998k;

/* JADX INFO: loaded from: classes.dex */
public class SHA512 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C0847x());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.f5965a = new C0847x((C0847x) this.f5965a);
            return digest;
        }
    }

    public static class DigestT extends BCMessageDigest implements Cloneable {
        public DigestT(int i) {
            super(new C0848y(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            DigestT digestT = (DigestT) super.clone();
            digestT.f5965a = new C0848y((C0848y) this.f5965a);
            return digestT;
        }
    }

    public static class DigestT224 extends DigestT {
        public DigestT224() {
            super(224);
        }
    }

    public static class DigestT256 extends DigestT {
        public DigestT256() {
            super(256);
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0994g(new C0847x()));
        }
    }

    public static class HashMacT224 extends BaseMac {
        public HashMacT224() {
            super(new C0994g(new C0848y(224)));
        }
    }

    public static class HashMacT256 extends BaseMac {
        public HashMacT256() {
            super(new C0994g(new C0848y(256)));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA512", 512, new C0987h());
        }
    }

    public static class KeyGeneratorT224 extends BaseKeyGenerator {
        public KeyGeneratorT224() {
            super("HMACSHA512/224", 224, new C0987h());
        }
    }

    public static class KeyGeneratorT256 extends BaseKeyGenerator {
        public KeyGeneratorT256() {
            super("HMACSHA512/256", 256, new C0987h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f5983a = SHA512.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("MessageDigest.SHA-512", f5983a + "$Digest");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest.SHA512", "SHA-512");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0652b.f2492e, "SHA-512");
            configurableProvider.mo2853a("MessageDigest.SHA-512/224", f5983a + "$DigestT224");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest.SHA512/224", "SHA-512/224");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0652b.f2494g, "SHA-512/224");
            configurableProvider.mo2853a("MessageDigest.SHA-512/256", f5983a + "$DigestT256");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest.SHA512256", "SHA-512/256");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0652b.f2495h, "SHA-512/256");
            configurableProvider.mo2853a("Mac.OLDHMACSHA512", f5983a + "$OldSHA512");
            configurableProvider.mo2853a("Mac.PBEWITHHMACSHA512", f5983a + "$HashMac");
            m4367a(configurableProvider, "SHA512", f5983a + "$HashMac", f5983a + "$KeyGenerator");
            m4368a(configurableProvider, "SHA512", InterfaceC0674n.f2626O);
            m4367a(configurableProvider, "SHA512/224", f5983a + "$HashMacT224", f5983a + "$KeyGeneratorT224");
            m4367a(configurableProvider, "SHA512/256", f5983a + "$HashMacT256", f5983a + "$KeyGeneratorT256");
        }
    }

    public static class OldSHA512 extends BaseMac {
        public OldSHA512() {
            super(new C0998k(new C0847x()));
        }
    }

    private SHA512() {
    }
}
