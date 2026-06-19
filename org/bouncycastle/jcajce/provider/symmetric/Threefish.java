package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p089e.C0919ba;
import org.bouncycastle.p083b.p092h.C0990c;

/* JADX INFO: loaded from: classes.dex */
public final class Threefish {

    public static class AlgParams_1024 extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Threefish-1024 IV";
        }
    }

    public static class AlgParams_256 extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Threefish-256 IV";
        }
    }

    public static class AlgParams_512 extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Threefish-512 IV";
        }
    }

    public static class CMAC_1024 extends BaseMac {
        public CMAC_1024() {
            super(new C0990c(new C0919ba(1024)));
        }
    }

    public static class CMAC_256 extends BaseMac {
        public CMAC_256() {
            super(new C0990c(new C0919ba(256)));
        }
    }

    public static class CMAC_512 extends BaseMac {
        public CMAC_512() {
            super(new C0990c(new C0919ba(512)));
        }
    }

    public static class ECB_1024 extends BaseBlockCipher {
        public ECB_1024() {
            super(new C0919ba(1024));
        }
    }

    public static class ECB_256 extends BaseBlockCipher {
        public ECB_256() {
            super(new C0919ba(256));
        }
    }

    public static class ECB_512 extends BaseBlockCipher {
        public ECB_512() {
            super(new C0919ba(512));
        }
    }

    public static class KeyGen_1024 extends BaseKeyGenerator {
        public KeyGen_1024() {
            super("Threefish-1024", 1024, new C0987h());
        }
    }

    public static class KeyGen_256 extends BaseKeyGenerator {
        public KeyGen_256() {
            super("Threefish-256", 256, new C0987h());
        }
    }

    public static class KeyGen_512 extends BaseKeyGenerator {
        public KeyGen_512() {
            super("Threefish-512", 512, new C0987h());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6141a = Threefish.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Mac.Threefish-256CMAC", f6141a + "$CMAC_256");
            configurableProvider.mo2853a("Mac.Threefish-512CMAC", f6141a + "$CMAC_512");
            configurableProvider.mo2853a("Mac.Threefish-1024CMAC", f6141a + "$CMAC_1024");
            configurableProvider.mo2853a("Cipher.Threefish-256", f6141a + "$ECB_256");
            configurableProvider.mo2853a("Cipher.Threefish-512", f6141a + "$ECB_512");
            configurableProvider.mo2853a("Cipher.Threefish-1024", f6141a + "$ECB_1024");
            configurableProvider.mo2853a("KeyGenerator.Threefish-256", f6141a + "$KeyGen_256");
            configurableProvider.mo2853a("KeyGenerator.Threefish-512", f6141a + "$KeyGen_512");
            configurableProvider.mo2853a("KeyGenerator.Threefish-1024", f6141a + "$KeyGen_1024");
            configurableProvider.mo2853a("AlgorithmParameters.Threefish-256", f6141a + "$AlgParams_256");
            configurableProvider.mo2853a("AlgorithmParameters.Threefish-512", f6141a + "$AlgParams_512");
            configurableProvider.mo2853a("AlgorithmParameters.Threefish-1024", f6141a + "$AlgParams_1024");
        }
    }

    private Threefish() {
    }
}
