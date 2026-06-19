package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.p089e.C0907ap;

/* JADX INFO: loaded from: classes.dex */
public final class Rijndael {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Rijndael IV";
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Rijndael.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                /* JADX INFO: renamed from: a */
                public final InterfaceC0890e mo4430a() {
                    return new C0907ap();
                }
            });
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Rijndael", 192, new C0987h());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6128a = Rijndael.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Cipher.RIJNDAEL", f6128a + "$ECB");
            configurableProvider.mo2853a("KeyGenerator.RIJNDAEL", f6128a + "$KeyGen");
            configurableProvider.mo2853a("AlgorithmParameters.RIJNDAEL", f6128a + "$AlgParams");
        }
    }

    private Rijndael() {
    }
}
