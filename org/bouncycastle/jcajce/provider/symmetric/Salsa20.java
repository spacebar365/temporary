package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p089e.C0912au;

/* JADX INFO: loaded from: classes.dex */
public final class Salsa20 {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Salsa20 IV";
        }
    }

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new C0912au(), 8);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Salsa20", 128, new C0987h());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6133a = Salsa20.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Cipher.SALSA20", f6133a + "$Base");
            configurableProvider.mo2853a("KeyGenerator.SALSA20", f6133a + "$KeyGen");
            configurableProvider.mo2853a("AlgorithmParameters.SALSA20", f6133a + "$AlgParams");
        }
    }

    private Salsa20() {
    }
}
