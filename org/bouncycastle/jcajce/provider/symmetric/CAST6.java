package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.p089e.C0932i;
import org.bouncycastle.p083b.p090f.C0978y;
import org.bouncycastle.p083b.p092h.C0992e;
import org.bouncycastle.p083b.p092h.C0999l;
import org.bouncycastle.p083b.p093i.C1027l;

/* JADX INFO: loaded from: classes.dex */
public final class CAST6 {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "CAST6 IV";
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.CAST6.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                /* JADX INFO: renamed from: a */
                public final InterfaceC0890e mo4430a() {
                    return new C0932i();
                }
            });
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new C0992e(new C1027l(new C0932i())));
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("CAST6", 256, new C0987h());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6078a = CAST6.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Cipher.CAST6", f6078a + "$ECB");
            configurableProvider.mo2853a("KeyGenerator.CAST6", f6078a + "$KeyGen");
            configurableProvider.mo2853a("AlgorithmParameters.CAST6", f6078a + "$AlgParams");
            m4443b(configurableProvider, "CAST6", f6078a + "$GMAC", f6078a + "$KeyGen");
            m4444c(configurableProvider, "CAST6", f6078a + "$Poly1305", f6078a + "$Poly1305KeyGen");
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new C0999l(new C0932i()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-CAST6", 256, new C0978y());
        }
    }

    private CAST6() {
    }
}
