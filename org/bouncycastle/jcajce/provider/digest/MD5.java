package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.p054a.p066k.InterfaceC0637a;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p086b.C0836m;
import org.bouncycastle.p083b.p092h.C0994g;

/* JADX INFO: loaded from: classes.dex */
public class MD5 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C0836m());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.f5965a = new C0836m((C0836m) this.f5965a);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0994g(new C0836m()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACMD5", 128, new C0987h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f5973a = MD5.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("MessageDigest.MD5", f5973a + "$Digest");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0674n.f2621J, "MD5");
            m4367a(configurableProvider, "MD5", f5973a + "$HashMac", f5973a + "$KeyGenerator");
            m4368a(configurableProvider, "MD5", InterfaceC0637a.f2384n);
        }
    }

    private MD5() {
    }
}
