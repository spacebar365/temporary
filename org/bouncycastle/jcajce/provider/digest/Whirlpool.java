package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.p054a.p067l.InterfaceC0639a;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p086b.C0824ae;
import org.bouncycastle.p083b.p092h.C0994g;

/* JADX INFO: loaded from: classes.dex */
public class Whirlpool {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C0824ae());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.f5965a = new C0824ae((C0824ae) this.f5965a);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0994g(new C0824ae()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACWHIRLPOOL", 512, new C0987h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f5987a = Whirlpool.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("MessageDigest.WHIRLPOOL", f5987a + "$Digest");
            configurableProvider.mo2855a("MessageDigest", InterfaceC0639a.f2395e, f5987a + "$Digest");
            m4367a(configurableProvider, "WHIRLPOOL", f5987a + "$HashMac", f5987a + "$KeyGenerator");
        }
    }

    private Whirlpool() {
    }
}
