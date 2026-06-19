package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.p054a.p078w.InterfaceC0746f;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p086b.C0826c;
import org.bouncycastle.p083b.p092h.C0991d;

/* JADX INFO: loaded from: classes.dex */
public class DSTU7564 {

    public static class Digest256 extends DigestDSTU7564 {
        public Digest256() {
            super(256);
        }
    }

    public static class Digest384 extends DigestDSTU7564 {
        public Digest384() {
            super(384);
        }
    }

    public static class Digest512 extends DigestDSTU7564 {
        public Digest512() {
            super(512);
        }
    }

    public static class DigestDSTU7564 extends BCMessageDigest implements Cloneable {
        public DigestDSTU7564(int i) {
            super(new C0826c(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.f5965a = new C0826c((C0826c) this.f5965a);
            return bCMessageDigest;
        }
    }

    public static class HashMac256 extends BaseMac {
        public HashMac256() {
            super(new C0991d(256));
        }
    }

    public static class HashMac384 extends BaseMac {
        public HashMac384() {
            super(new C0991d(384));
        }
    }

    public static class HashMac512 extends BaseMac {
        public HashMac512() {
            super(new C0991d(512));
        }
    }

    public static class KeyGenerator256 extends BaseKeyGenerator {
        public KeyGenerator256() {
            super("HMACDSTU7564-256", 256, new C0987h());
        }
    }

    public static class KeyGenerator384 extends BaseKeyGenerator {
        public KeyGenerator384() {
            super("HMACDSTU7564-384", 384, new C0987h());
        }
    }

    public static class KeyGenerator512 extends BaseKeyGenerator {
        public KeyGenerator512() {
            super("HMACDSTU7564-512", 512, new C0987h());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f5968a = DSTU7564.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("MessageDigest.DSTU7564-256", f5968a + "$Digest256");
            configurableProvider.mo2853a("MessageDigest.DSTU7564-384", f5968a + "$Digest384");
            configurableProvider.mo2853a("MessageDigest.DSTU7564-512", f5968a + "$Digest512");
            configurableProvider.mo2855a("MessageDigest", InterfaceC0746f.f2990d, f5968a + "$Digest256");
            configurableProvider.mo2855a("MessageDigest", InterfaceC0746f.f2991e, f5968a + "$Digest384");
            configurableProvider.mo2855a("MessageDigest", InterfaceC0746f.f2992f, f5968a + "$Digest512");
            m4367a(configurableProvider, "DSTU7564-256", f5968a + "$HashMac256", f5968a + "$KeyGenerator256");
            m4367a(configurableProvider, "DSTU7564-384", f5968a + "$HashMac384", f5968a + "$KeyGenerator384");
            m4367a(configurableProvider, "DSTU7564-512", f5968a + "$HashMac512", f5968a + "$KeyGenerator512");
            m4368a(configurableProvider, "DSTU7564-256", InterfaceC0746f.f2993g);
            m4368a(configurableProvider, "DSTU7564-384", InterfaceC0746f.f2994h);
            m4368a(configurableProvider, "DSTU7564-512", InterfaceC0746f.f2995i);
        }
    }

    private DSTU7564() {
    }
}
