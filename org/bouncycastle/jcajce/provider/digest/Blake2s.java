package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.p054a.p069n.InterfaceC0645c;
import org.bouncycastle.p083b.p086b.C0825b;

/* JADX INFO: loaded from: classes.dex */
public class Blake2s {

    public static class Blake2s128 extends BCMessageDigest implements Cloneable {
        public Blake2s128() {
            super(new C0825b(128));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2s128 blake2s128 = (Blake2s128) super.clone();
            blake2s128.f5965a = new C0825b((C0825b) this.f5965a);
            return blake2s128;
        }
    }

    public static class Blake2s160 extends BCMessageDigest implements Cloneable {
        public Blake2s160() {
            super(new C0825b(160));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2s160 blake2s160 = (Blake2s160) super.clone();
            blake2s160.f5965a = new C0825b((C0825b) this.f5965a);
            return blake2s160;
        }
    }

    public static class Blake2s224 extends BCMessageDigest implements Cloneable {
        public Blake2s224() {
            super(new C0825b(224));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2s224 blake2s224 = (Blake2s224) super.clone();
            blake2s224.f5965a = new C0825b((C0825b) this.f5965a);
            return blake2s224;
        }
    }

    public static class Blake2s256 extends BCMessageDigest implements Cloneable {
        public Blake2s256() {
            super(new C0825b(256));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2s256 blake2s256 = (Blake2s256) super.clone();
            blake2s256.f5965a = new C0825b((C0825b) this.f5965a);
            return blake2s256;
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f5967a = Blake2s.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("MessageDigest.BLAKE2S-256", f5967a + "$Blake2s256");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0645c.f2418K, "BLAKE2S-256");
            configurableProvider.mo2853a("MessageDigest.BLAKE2S-224", f5967a + "$Blake2s224");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0645c.f2417J, "BLAKE2S-224");
            configurableProvider.mo2853a("MessageDigest.BLAKE2S-160", f5967a + "$Blake2s160");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0645c.f2416I, "BLAKE2S-160");
            configurableProvider.mo2853a("MessageDigest.BLAKE2S-128", f5967a + "$Blake2s128");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0645c.f2415H, "BLAKE2S-128");
        }
    }

    private Blake2s() {
    }
}
