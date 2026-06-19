package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p089e.C0948y;

/* JADX INFO: loaded from: classes.dex */
public final class Grainv1 {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Grainv1 IV";
        }
    }

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new C0948y(), 8);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Grainv1", 80, new C0987h());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6103a = Grainv1.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Cipher.Grainv1", f6103a + "$Base");
            configurableProvider.mo2853a("KeyGenerator.Grainv1", f6103a + "$KeyGen");
            configurableProvider.mo2853a("AlgorithmParameters.Grainv1", f6103a + "$AlgParams");
        }
    }

    private Grainv1() {
    }
}
