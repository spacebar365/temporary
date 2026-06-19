package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.p054a.p068m.InterfaceC0641a;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.p089e.C0908aq;
import org.bouncycastle.p083b.p089e.C0909ar;
import org.bouncycastle.p083b.p090f.C0978y;
import org.bouncycastle.p083b.p092h.C0990c;
import org.bouncycastle.p083b.p092h.C0992e;
import org.bouncycastle.p083b.p092h.C0999l;
import org.bouncycastle.p083b.p093i.C1010b;
import org.bouncycastle.p083b.p093i.C1027l;

/* JADX INFO: loaded from: classes.dex */
public final class SEED {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.f6157c == null) {
                this.f6157c = C1124l.m2709a();
            }
            this.f6157c.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersA = m4448a("SEED");
                algorithmParametersA.init(new IvParameterSpec(bArr));
                return algorithmParametersA;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for SEED parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "SEED IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new C1010b(new C0908aq()), 128);
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new C0990c(new C0908aq()));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.SEED.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                /* JADX INFO: renamed from: a */
                public final InterfaceC0890e mo4430a() {
                    return new C0908aq();
                }
            });
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new C0992e(new C1027l(new C0908aq())));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("SEED", null);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("SEED", 128, new C0987h());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6131a = SEED.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("AlgorithmParameters.SEED", f6131a + "$AlgParams");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0641a.f2400a, "SEED");
            configurableProvider.mo2853a("AlgorithmParameterGenerator.SEED", f6131a + "$AlgParamGen");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator." + InterfaceC0641a.f2400a, "SEED");
            configurableProvider.mo2853a("Cipher.SEED", f6131a + "$ECB");
            configurableProvider.mo2855a("Cipher", InterfaceC0641a.f2400a, f6131a + "$CBC");
            configurableProvider.mo2853a("Cipher.SEEDWRAP", f6131a + "$Wrap");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0641a.f2403d, "SEEDWRAP");
            configurableProvider.mo2853a("Alg.Alias.Cipher.SEEDKW", "SEEDWRAP");
            configurableProvider.mo2853a("KeyGenerator.SEED", f6131a + "$KeyGen");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0641a.f2400a, f6131a + "$KeyGen");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0641a.f2403d, f6131a + "$KeyGen");
            configurableProvider.mo2853a("SecretKeyFactory.SEED", f6131a + "$KeyFactory");
            configurableProvider.mo2855a("Alg.Alias.SecretKeyFactory", InterfaceC0641a.f2400a, "SEED");
            m4442a(configurableProvider, "SEED", f6131a + "$CMAC", f6131a + "$KeyGen");
            m4443b(configurableProvider, "SEED", f6131a + "$GMAC", f6131a + "$KeyGen");
            m4444c(configurableProvider, "SEED", f6131a + "$Poly1305", f6131a + "$Poly1305KeyGen");
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new C0999l(new C0908aq()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-SEED", 256, new C0978y());
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new C0909ar());
        }
    }

    private SEED() {
    }
}
