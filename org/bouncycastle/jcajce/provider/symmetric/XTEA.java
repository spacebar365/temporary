package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p089e.C0925bg;

/* JADX INFO: loaded from: classes.dex */
public final class XTEA {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "XTEA IV";
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new C0925bg());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("XTEA", 128, new C0987h());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6146a = XTEA.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Cipher.XTEA", f6146a + "$ECB");
            configurableProvider.mo2853a("KeyGenerator.XTEA", f6146a + "$KeyGen");
            configurableProvider.mo2853a("AlgorithmParameters.XTEA", f6146a + "$AlgParams");
        }
    }

    private XTEA() {
    }
}
