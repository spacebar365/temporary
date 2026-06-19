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
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.p089e.C0899ah;
import org.bouncycastle.p083b.p089e.C0900ai;
import org.bouncycastle.p083b.p092h.C0988a;
import org.bouncycastle.p083b.p092h.C0989b;
import org.bouncycastle.p083b.p093i.C1010b;

/* JADX INFO: loaded from: classes.dex */
public final class RC5 {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.f6157c == null) {
                this.f6157c = C1124l.m2709a();
            }
            this.f6157c.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersA = m4448a("RC5");
                algorithmParametersA.init(new IvParameterSpec(bArr));
                return algorithmParametersA;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC5 parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "RC5 IV";
        }
    }

    public static class CBC32 extends BaseBlockCipher {
        public CBC32() {
            super(new C1010b(new C0899ah()), 64);
        }
    }

    public static class CFB8Mac32 extends BaseMac {
        public CFB8Mac32() {
            super(new C0989b(new C0899ah()));
        }
    }

    public static class ECB32 extends BaseBlockCipher {
        public ECB32() {
            super(new C0899ah());
        }
    }

    public static class ECB64 extends BaseBlockCipher {
        public ECB64() {
            super(new C0900ai());
        }
    }

    public static class KeyGen32 extends BaseKeyGenerator {
        public KeyGen32() {
            super("RC5", 128, new C0987h());
        }
    }

    public static class KeyGen64 extends BaseKeyGenerator {
        public KeyGen64() {
            super("RC5-64", 256, new C0987h());
        }
    }

    public static class Mac32 extends BaseMac {
        public Mac32() {
            super(new C0988a(new C0899ah()));
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6126a = RC5.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Cipher.RC5", f6126a + "$ECB32");
            configurableProvider.mo2853a("Alg.Alias.Cipher.RC5-32", "RC5");
            configurableProvider.mo2853a("Cipher.RC5-64", f6126a + "$ECB64");
            configurableProvider.mo2853a("KeyGenerator.RC5", f6126a + "$KeyGen32");
            configurableProvider.mo2853a("Alg.Alias.KeyGenerator.RC5-32", "RC5");
            configurableProvider.mo2853a("KeyGenerator.RC5-64", f6126a + "$KeyGen64");
            configurableProvider.mo2853a("AlgorithmParameters.RC5", f6126a + "$AlgParams");
            configurableProvider.mo2853a("AlgorithmParameters.RC5-64", f6126a + "$AlgParams");
            configurableProvider.mo2853a("Mac.RC5MAC", f6126a + "$Mac32");
            configurableProvider.mo2853a("Alg.Alias.Mac.RC5", "RC5MAC");
            configurableProvider.mo2853a("Mac.RC5MAC/CFB8", f6126a + "$CFB8Mac32");
            configurableProvider.mo2853a("Alg.Alias.Mac.RC5/CFB8", "RC5MAC/CFB8");
        }
    }

    private RC5() {
    }
}
