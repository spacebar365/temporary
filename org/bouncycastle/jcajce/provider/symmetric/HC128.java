package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p089e.C0949z;

/* JADX INFO: loaded from: classes.dex */
public final class HC128 {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "HC128 IV";
        }
    }

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new C0949z(), 16);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("HC128", 128, new C0987h());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6104a = HC128.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Cipher.HC128", f6104a + "$Base");
            configurableProvider.mo2853a("KeyGenerator.HC128", f6104a + "$KeyGen");
            configurableProvider.mo2853a("AlgorithmParameters.HC128", f6104a + "$AlgParams");
        }
    }

    private HC128() {
    }
}
