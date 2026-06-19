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
import org.bouncycastle.p054a.p072q.InterfaceC0656a;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.p089e.C0902ak;
import org.bouncycastle.p083b.p089e.C0933j;
import org.bouncycastle.p083b.p089e.C0934k;
import org.bouncycastle.p083b.p090f.C0978y;
import org.bouncycastle.p083b.p092h.C0992e;
import org.bouncycastle.p083b.p092h.C0999l;
import org.bouncycastle.p083b.p093i.C1010b;
import org.bouncycastle.p083b.p093i.C1027l;

/* JADX INFO: loaded from: classes.dex */
public final class Camellia {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.f6157c == null) {
                this.f6157c = C1124l.m2709a();
            }
            this.f6157c.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersA = m4448a("Camellia");
                algorithmParametersA.init(new IvParameterSpec(bArr));
                return algorithmParametersA;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for Camellia parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Camellia IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new C1010b(new C0933j()), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Camellia.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                /* JADX INFO: renamed from: a */
                public final InterfaceC0890e mo4430a() {
                    return new C0933j();
                }
            });
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new C0992e(new C1027l(new C0933j())));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("Camellia", null);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i) {
            super("Camellia", i, new C0987h());
        }
    }

    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6079a = Camellia.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("AlgorithmParameters.CAMELLIA", f6079a + "$AlgParams");
            configurableProvider.mo2855a("Alg.Alias.AlgorithmParameters", InterfaceC0656a.f2559a, "CAMELLIA");
            configurableProvider.mo2855a("Alg.Alias.AlgorithmParameters", InterfaceC0656a.f2560b, "CAMELLIA");
            configurableProvider.mo2855a("Alg.Alias.AlgorithmParameters", InterfaceC0656a.f2561c, "CAMELLIA");
            configurableProvider.mo2853a("AlgorithmParameterGenerator.CAMELLIA", f6079a + "$AlgParamGen");
            configurableProvider.mo2855a("Alg.Alias.AlgorithmParameterGenerator", InterfaceC0656a.f2559a, "CAMELLIA");
            configurableProvider.mo2855a("Alg.Alias.AlgorithmParameterGenerator", InterfaceC0656a.f2560b, "CAMELLIA");
            configurableProvider.mo2855a("Alg.Alias.AlgorithmParameterGenerator", InterfaceC0656a.f2561c, "CAMELLIA");
            configurableProvider.mo2853a("Cipher.CAMELLIA", f6079a + "$ECB");
            configurableProvider.mo2855a("Cipher", InterfaceC0656a.f2559a, f6079a + "$CBC");
            configurableProvider.mo2855a("Cipher", InterfaceC0656a.f2560b, f6079a + "$CBC");
            configurableProvider.mo2855a("Cipher", InterfaceC0656a.f2561c, f6079a + "$CBC");
            configurableProvider.mo2853a("Cipher.CAMELLIARFC3211WRAP", f6079a + "$RFC3211Wrap");
            configurableProvider.mo2853a("Cipher.CAMELLIAWRAP", f6079a + "$Wrap");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0656a.f2562d, "CAMELLIAWRAP");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0656a.f2563e, "CAMELLIAWRAP");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0656a.f2564f, "CAMELLIAWRAP");
            configurableProvider.mo2853a("SecretKeyFactory.CAMELLIA", f6079a + "$KeyFactory");
            configurableProvider.mo2855a("Alg.Alias.SecretKeyFactory", InterfaceC0656a.f2559a, "CAMELLIA");
            configurableProvider.mo2855a("Alg.Alias.SecretKeyFactory", InterfaceC0656a.f2560b, "CAMELLIA");
            configurableProvider.mo2855a("Alg.Alias.SecretKeyFactory", InterfaceC0656a.f2561c, "CAMELLIA");
            configurableProvider.mo2853a("KeyGenerator.CAMELLIA", f6079a + "$KeyGen");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0656a.f2562d, f6079a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0656a.f2563e, f6079a + "$KeyGen192");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0656a.f2564f, f6079a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0656a.f2559a, f6079a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0656a.f2560b, f6079a + "$KeyGen192");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0656a.f2561c, f6079a + "$KeyGen256");
            m4443b(configurableProvider, "CAMELLIA", f6079a + "$GMAC", f6079a + "$KeyGen");
            m4444c(configurableProvider, "CAMELLIA", f6079a + "$Poly1305", f6079a + "$Poly1305KeyGen");
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new C0999l(new C0933j()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Camellia", 256, new C0978y());
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new C0902ak(new C0933j()), 16);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new C0934k());
        }
    }

    private Camellia() {
    }
}
