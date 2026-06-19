package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p086b.C0841r;
import org.bouncycastle.p083b.p092h.C0994g;

/* JADX INFO: loaded from: classes.dex */
public class RIPEMD320 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C0841r());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.f5965a = new C0841r((C0841r) this.f5965a);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0994g(new C0841r()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACRIPEMD320", 320, new C0987h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f5977a = RIPEMD320.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("MessageDigest.RIPEMD320", f5977a + "$Digest");
            m4367a(configurableProvider, "RIPEMD320", f5977a + "$HashMac", f5977a + "$KeyGenerator");
        }
    }

    private RIPEMD320() {
    }
}
