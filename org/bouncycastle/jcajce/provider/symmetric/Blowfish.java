package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p054a.p069n.InterfaceC0645c;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p089e.C0930g;
import org.bouncycastle.p083b.p092h.C0990c;
import org.bouncycastle.p083b.p093i.C1010b;

/* JADX INFO: loaded from: classes.dex */
public final class Blowfish {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Blowfish IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new C1010b(new C0930g()), 64);
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new C0990c(new C0930g()));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new C0930g());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Blowfish", 128, new C0987h());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6074a = Blowfish.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Mac.BLOWFISHCMAC", f6074a + "$CMAC");
            configurableProvider.mo2853a("Cipher.BLOWFISH", f6074a + "$ECB");
            configurableProvider.mo2855a("Cipher", InterfaceC0645c.f2445z, f6074a + "$CBC");
            configurableProvider.mo2853a("KeyGenerator.BLOWFISH", f6074a + "$KeyGen");
            configurableProvider.mo2855a("Alg.Alias.KeyGenerator", InterfaceC0645c.f2445z, "BLOWFISH");
            configurableProvider.mo2853a("AlgorithmParameters.BLOWFISH", f6074a + "$AlgParams");
            configurableProvider.mo2855a("Alg.Alias.AlgorithmParameters", InterfaceC0645c.f2445z, "BLOWFISH");
        }
    }

    private Blowfish() {
    }
}
