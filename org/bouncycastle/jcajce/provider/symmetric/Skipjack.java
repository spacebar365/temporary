package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p089e.C0916ay;
import org.bouncycastle.p083b.p092h.C0988a;
import org.bouncycastle.p083b.p092h.C0989b;

/* JADX INFO: loaded from: classes.dex */
public final class Skipjack {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Skipjack IV";
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new C0916ay());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Skipjack", 80, new C0987h());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new C0988a(new C0916ay()));
        }
    }

    public static class MacCFB8 extends BaseMac {
        public MacCFB8() {
            super(new C0989b(new C0916ay()));
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6137a = Skipjack.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Cipher.SKIPJACK", f6137a + "$ECB");
            configurableProvider.mo2853a("KeyGenerator.SKIPJACK", f6137a + "$KeyGen");
            configurableProvider.mo2853a("AlgorithmParameters.SKIPJACK", f6137a + "$AlgParams");
            configurableProvider.mo2853a("Mac.SKIPJACKMAC", f6137a + "$Mac");
            configurableProvider.mo2853a("Alg.Alias.Mac.SKIPJACK", "SKIPJACKMAC");
            configurableProvider.mo2853a("Mac.SKIPJACKMAC/CFB8", f6137a + "$MacCFB8");
            configurableProvider.mo2853a("Alg.Alias.Mac.SKIPJACK/CFB8", "SKIPJACKMAC/CFB8");
        }
    }

    private Skipjack() {
    }
}
