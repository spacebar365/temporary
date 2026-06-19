package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.p054a.p066k.InterfaceC0637a;
import org.bouncycastle.p054a.p077v.InterfaceC0739p;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p086b.C0839p;
import org.bouncycastle.p083b.p092h.C0994g;

/* JADX INFO: loaded from: classes.dex */
public class RIPEMD160 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C0839p());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.f5965a = new C0839p((C0839p) this.f5965a);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0994g(new C0839p()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACRIPEMD160", 160, new C0987h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f5975a = RIPEMD160.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("MessageDigest.RIPEMD160", f5975a + "$Digest");
            configurableProvider.mo2853a("Alg.Alias.MessageDigest." + InterfaceC0739p.f2930b, "RIPEMD160");
            m4367a(configurableProvider, "RIPEMD160", f5975a + "$HashMac", f5975a + "$KeyGenerator");
            m4368a(configurableProvider, "RIPEMD160", InterfaceC0637a.f2387q);
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHHMACRIPEMD160", f5975a + "$PBEWithHmacKeyFactory");
            configurableProvider.mo2853a("Mac.PBEWITHHMACRIPEMD160", f5975a + "$PBEWithHmac");
        }
    }

    public static class PBEWithHmac extends BaseMac {
        public PBEWithHmac() {
            super(new C0994g(new C0839p()), 2, 160);
        }
    }

    public static class PBEWithHmacKeyFactory extends PBESecretKeyFactory {
        public PBEWithHmacKeyFactory() {
            super("PBEwithHmacRIPEMD160", null, false, 2, 2, 160, 0);
        }
    }

    private RIPEMD160() {
    }
}
