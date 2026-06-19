package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p083b.C0950f;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.p089e.C0946w;
import org.bouncycastle.p083b.p092h.C0990c;
import org.bouncycastle.p083b.p093i.C1022g;
import org.bouncycastle.p083b.p093i.C1023h;
import org.bouncycastle.p083b.p093i.C1024i;
import org.bouncycastle.p083b.p093i.C1025j;

/* JADX INFO: loaded from: classes.dex */
public class GOST3412_2015 {

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super((InterfaceC0890e) new C1022g(new C0946w()), false, 128);
        }
    }

    public static class CTR extends BaseBlockCipher {
        public CTR() {
            super(new C0950f(new C1024i(new C0946w())), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new C0946w());
        }
    }

    public static class GCFB extends BaseBlockCipher {
        public GCFB() {
            super(new C0950f(new C1023h(new C0946w())), false, 128);
        }
    }

    public static class GCFB8 extends BaseBlockCipher {
        public GCFB8() {
            super(new C0950f(new C1023h(new C0946w(), 8)), false, 128);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this((byte) 0);
        }

        private KeyGen(byte b) {
            super("GOST3412-2015", 256, new C0987h());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new C0990c(new C0946w()));
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6100a = GOST3412_2015.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Cipher.GOST3412-2015", f6100a + "$ECB");
            configurableProvider.mo2853a("Cipher.GOST3412-2015/CFB", f6100a + "$GCFB");
            configurableProvider.mo2853a("Cipher.GOST3412-2015/CFB8", f6100a + "$GCFB8");
            configurableProvider.mo2853a("Cipher.GOST3412-2015/OFB", f6100a + "$OFB");
            configurableProvider.mo2853a("Cipher.GOST3412-2015/CBC", f6100a + "$CBC");
            configurableProvider.mo2853a("Cipher.GOST3412-2015/CTR", f6100a + "$CTR");
            configurableProvider.mo2853a("KeyGenerator.GOST3412-2015", f6100a + "$KeyGen");
            configurableProvider.mo2853a("Mac.GOST3412MAC", f6100a + "$Mac");
            configurableProvider.mo2853a("Alg.Alias.Mac.GOST3412-2015", "GOST3412MAC");
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new C0950f(new C1025j(new C0946w())), false, 128);
        }
    }
}
