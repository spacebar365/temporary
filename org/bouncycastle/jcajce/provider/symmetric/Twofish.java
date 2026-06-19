package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.p089e.C0921bc;
import org.bouncycastle.p083b.p090f.C0978y;
import org.bouncycastle.p083b.p092h.C0992e;
import org.bouncycastle.p083b.p092h.C0999l;
import org.bouncycastle.p083b.p093i.C1010b;
import org.bouncycastle.p083b.p093i.C1027l;

/* JADX INFO: loaded from: classes.dex */
public final class Twofish {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Twofish IV";
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Twofish.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                /* JADX INFO: renamed from: a */
                public final InterfaceC0890e mo4430a() {
                    return new C0921bc();
                }
            });
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new C0992e(new C1027l(new C0921bc())));
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Twofish", 256, new C0987h());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6142a = Twofish.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Cipher.Twofish", f6142a + "$ECB");
            configurableProvider.mo2853a("KeyGenerator.Twofish", f6142a + "$KeyGen");
            configurableProvider.mo2853a("AlgorithmParameters.Twofish", f6142a + "$AlgParams");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH-CBC", "PKCS12PBE");
            configurableProvider.mo2853a("Cipher.PBEWITHSHAANDTWOFISH-CBC", f6142a + "$PBEWithSHA");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHSHAANDTWOFISH-CBC", f6142a + "$PBEWithSHAKeyFactory");
            m4443b(configurableProvider, "Twofish", f6142a + "$GMAC", f6142a + "$KeyGen");
            m4444c(configurableProvider, "Twofish", f6142a + "$Poly1305", f6142a + "$Poly1305KeyGen");
        }
    }

    public static class PBEWithSHA extends BaseBlockCipher {
        public PBEWithSHA() {
            super(new C1010b(new C0921bc()), 2, 1, 256, 16);
        }
    }

    public static class PBEWithSHAKeyFactory extends PBESecretKeyFactory {
        public PBEWithSHAKeyFactory() {
            super("PBEwithSHAandTwofish-CBC", null, true, 2, 1, 256, 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new C0999l(new C0921bc()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Twofish", 256, new C0978y());
        }
    }

    private Twofish() {
    }
}
