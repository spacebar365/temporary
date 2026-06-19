package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.p054a.p066k.InterfaceC0637a;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p086b.C0823ad;
import org.bouncycastle.p083b.p092h.C0994g;

/* JADX INFO: loaded from: classes.dex */
public class Tiger {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new C0823ad());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.f5965a = new C0823ad((C0823ad) this.f5965a);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new C0994g(new C0823ad()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACTIGER", 192, new C0987h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f5986a = Tiger.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("MessageDigest.TIGER", f5986a + "$Digest");
            configurableProvider.mo2853a("MessageDigest.Tiger", f5986a + "$Digest");
            m4367a(configurableProvider, "TIGER", f5986a + "$HashMac", f5986a + "$KeyGenerator");
            m4368a(configurableProvider, "TIGER", InterfaceC0637a.f2386p);
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHHMACTIGER", f5986a + "$PBEWithMacKeyFactory");
        }
    }

    public static class PBEWithHashMac extends BaseMac {
        public PBEWithHashMac() {
            super(new C0994g(new C0823ad()), 3, 192);
        }
    }

    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacTiger", null, false, 2, 3, 192, 0);
        }
    }

    public static class TigerHmac extends BaseMac {
        public TigerHmac() {
            super(new C0994g(new C0823ad()));
        }
    }

    private Tiger() {
    }
}
