package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.p089e.C0924bf;

/* JADX INFO: loaded from: classes.dex */
public final class XSalsa20 {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "XSalsa20 IV";
        }
    }

    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new C0924bf(), 24);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("XSalsa20", 256, new C0987h());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6145a = XSalsa20.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Cipher.XSALSA20", f6145a + "$Base");
            configurableProvider.mo2853a("KeyGenerator.XSALSA20", f6145a + "$KeyGen");
            configurableProvider.mo2853a("AlgorithmParameters.XSALSA20", f6145a + "$AlgParams");
        }
    }

    private XSalsa20() {
    }
}
