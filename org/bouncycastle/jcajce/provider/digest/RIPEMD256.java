package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.p054a.p077v.InterfaceC0739p;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p086b.C0840q;
import org.bouncycastle.p083b.p092h.C0994g;

/* JADX INFO: loaded from: classes.dex */
public class RIPEMD256 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C0840q());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.f5965a = new C0840q((C0840q) this.f5965a);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0994g(new C0840q()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACRIPEMD256", 256, new C0987h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f5976a = RIPEMD256.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("MessageDigest.RIPEMD256", f5976a + "$Digest");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0739p.f2932d, "RIPEMD256");
            m4367a(configurableProvider, "RIPEMD256", f5976a + "$HashMac", f5976a + "$KeyGenerator");
        }
    }

    private RIPEMD256() {
    }
}
