package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.p054a.p070o.InterfaceC0652b;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p086b.C0846w;
import org.bouncycastle.p083b.p092h.C0994g;

/* JADX INFO: loaded from: classes.dex */
public class SHA3 {

    public static class Digest224 extends DigestSHA3 {
        public Digest224() {
            super(224);
        }
    }

    public static class Digest256 extends DigestSHA3 {
        public Digest256() {
            super(256);
        }
    }

    public static class Digest384 extends DigestSHA3 {
        public Digest384() {
            super(384);
        }
    }

    public static class Digest512 extends DigestSHA3 {
        public Digest512() {
            super(512);
        }
    }

    public static class DigestSHA3 extends BCMessageDigest implements Cloneable {
        public DigestSHA3(int i) {
            super(new C0846w(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.f5965a = new C0846w((C0846w) this.f5965a);
            return bCMessageDigest;
        }
    }

    public static class HashMac224 extends HashMacSHA3 {
        public HashMac224() {
            super(224);
        }
    }

    public static class HashMac256 extends HashMacSHA3 {
        public HashMac256() {
            super(256);
        }
    }

    public static class HashMac384 extends HashMacSHA3 {
        public HashMac384() {
            super(384);
        }
    }

    public static class HashMac512 extends HashMacSHA3 {
        public HashMac512() {
            super(512);
        }
    }

    public static class HashMacSHA3 extends BaseMac {
        public HashMacSHA3(int i) {
            super(new C0994g(new C0846w(i)));
        }
    }

    public static class KeyGenerator224 extends KeyGeneratorSHA3 {
        public KeyGenerator224() {
            super(224);
        }
    }

    public static class KeyGenerator256 extends KeyGeneratorSHA3 {
        public KeyGenerator256() {
            super(256);
        }
    }

    public static class KeyGenerator384 extends KeyGeneratorSHA3 {
        public KeyGenerator384() {
            super(384);
        }
    }

    public static class KeyGenerator512 extends KeyGeneratorSHA3 {
        public KeyGenerator512() {
            super(512);
        }
    }

    public static class KeyGeneratorSHA3 extends BaseKeyGenerator {
        public KeyGeneratorSHA3(int i) {
            super("HMACSHA3-".concat(String.valueOf(i)), i, new C0987h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f5981a = SHA3.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("MessageDigest.SHA3-224", f5981a + "$Digest224");
            configurableProvider.mo2853a("MessageDigest.SHA3-256", f5981a + "$Digest256");
            configurableProvider.mo2853a("MessageDigest.SHA3-384", f5981a + "$Digest384");
            configurableProvider.mo2853a("MessageDigest.SHA3-512", f5981a + "$Digest512");
            configurableProvider.mo2855a("MessageDigest", InterfaceC0652b.f2496i, f5981a + "$Digest224");
            configurableProvider.mo2855a("MessageDigest", InterfaceC0652b.f2497j, f5981a + "$Digest256");
            configurableProvider.mo2855a("MessageDigest", InterfaceC0652b.f2498k, f5981a + "$Digest384");
            configurableProvider.mo2855a("MessageDigest", InterfaceC0652b.f2499l, f5981a + "$Digest512");
            m4367a(configurableProvider, "SHA3-224", f5981a + "$HashMac224", f5981a + "$KeyGenerator224");
            m4368a(configurableProvider, "SHA3-224", InterfaceC0652b.f2502o);
            m4367a(configurableProvider, "SHA3-256", f5981a + "$HashMac256", f5981a + "$KeyGenerator256");
            m4368a(configurableProvider, "SHA3-256", InterfaceC0652b.f2503p);
            m4367a(configurableProvider, "SHA3-384", f5981a + "$HashMac384", f5981a + "$KeyGenerator384");
            m4368a(configurableProvider, "SHA3-384", InterfaceC0652b.f2504q);
            m4367a(configurableProvider, "SHA3-512", f5981a + "$HashMac512", f5981a + "$KeyGenerator512");
            m4368a(configurableProvider, "SHA3-512", InterfaceC0652b.f2505r);
        }
    }

    private SHA3() {
    }
}
