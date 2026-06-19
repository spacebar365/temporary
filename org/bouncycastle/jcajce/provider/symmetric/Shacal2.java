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
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.p089e.C0915ax;
import org.bouncycastle.p083b.p092h.C0990c;
import org.bouncycastle.p083b.p093i.C1010b;

/* JADX INFO: loaded from: classes.dex */
public final class Shacal2 {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[32];
            if (this.f6157c == null) {
                this.f6157c = C1124l.m2709a();
            }
            this.f6157c.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersA = m4448a("Shacal2");
                algorithmParametersA.init(new IvParameterSpec(bArr));
                return algorithmParametersA;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for Shacal2 parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Shacal2 IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new C1010b(new C0915ax()), 256);
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new C0990c(new C0915ax()));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Shacal2.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                /* JADX INFO: renamed from: a */
                public final InterfaceC0890e mo4430a() {
                    return new C0915ax();
                }
            });
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("SHACAL-2", 128, new C0987h());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6135a = Shacal2.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Mac.Shacal-2CMAC", f6135a + "$CMAC");
            configurableProvider.mo2853a("Cipher.Shacal2", f6135a + "$ECB");
            configurableProvider.mo2853a("Cipher.SHACAL-2", f6135a + "$ECB");
            configurableProvider.mo2853a("KeyGenerator.Shacal2", f6135a + "$KeyGen");
            configurableProvider.mo2853a("AlgorithmParameterGenerator.Shacal2", f6135a + "$AlgParamGen");
            configurableProvider.mo2853a("AlgorithmParameters.Shacal2", f6135a + "$AlgParams");
            configurableProvider.mo2853a("KeyGenerator.SHACAL-2", f6135a + "$KeyGen");
            configurableProvider.mo2853a("AlgorithmParameterGenerator.SHACAL-2", f6135a + "$AlgParamGen");
            configurableProvider.mo2853a("AlgorithmParameters.SHACAL-2", f6135a + "$AlgParams");
        }
    }

    private Shacal2() {
    }
}
