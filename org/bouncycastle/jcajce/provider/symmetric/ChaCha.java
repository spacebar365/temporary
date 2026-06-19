package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p089e.C0935l;
import org.bouncycastle.p083b.p089e.C0936m;

/* JADX INFO: loaded from: classes.dex */
public final class ChaCha {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "ChaCha7539 IV";
        }
    }

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new C0936m(), 8);
        }
    }

    public static class Base7539 extends BaseStreamCipher {
        public Base7539() {
            super(new C0935l(), 12);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("ChaCha", 128, new C0987h());
        }
    }

    public static class KeyGen7539 extends BaseKeyGenerator {
        public KeyGen7539() {
            super("ChaCha7539", 256, new C0987h());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6080a = ChaCha.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Cipher.CHACHA", f6080a + "$Base");
            configurableProvider.mo2853a("KeyGenerator.CHACHA", f6080a + "$KeyGen");
            configurableProvider.mo2853a("Cipher.CHACHA7539", f6080a + "$Base7539");
            configurableProvider.mo2853a("KeyGenerator.CHACHA7539", f6080a + "$KeyGen7539");
            configurableProvider.mo2853a("AlgorithmParameters.CHACHA7539", f6080a + "$AlgParams");
            configurableProvider.mo2853a("Alg.Alias.Cipher.CHACHA20", "CHACHA7539");
            configurableProvider.mo2853a("Alg.Alias.KeyGenerator.CHACHA20", "CHACHA7539");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.CHACHA20", "CHACHA7539");
        }
    }

    private ChaCha() {
    }
}
