package org.bouncycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p054a.p069n.C0644b;
import org.bouncycastle.p054a.p069n.InterfaceC0645c;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.p089e.C0893ab;
import org.bouncycastle.p083b.p092h.C0988a;
import org.bouncycastle.p083b.p092h.C0989b;
import org.bouncycastle.p083b.p093i.C1010b;

/* JADX INFO: loaded from: classes.dex */
public final class IDEA {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.f6157c == null) {
                this.f6157c = C1124l.m2709a();
            }
            this.f6157c.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersA = m4448a("IDEA");
                algorithmParametersA.init(new IvParameterSpec(bArr));
                return algorithmParametersA;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for IDEA parameter generation.");
        }
    }

    public static class AlgParams extends BaseAlgorithmParameters {

        /* JADX INFO: renamed from: a */
        private byte[] f6106a;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        /* JADX INFO: renamed from: a */
        protected final AlgorithmParameterSpec mo4277a(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f6106a);
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to IV parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            return engineGetEncoded("ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) {
            if (m4449a(str)) {
                return new C0644b(engineGetEncoded("RAW")).mo1578k();
            }
            if (!str.equals("RAW")) {
                return null;
            }
            byte[] bArr = new byte[this.f6106a.length];
            System.arraycopy(this.f6106a, 0, bArr, 0, this.f6106a.length);
            return bArr;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
                throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
            }
            this.f6106a = ((IvParameterSpec) algorithmParameterSpec).getIV();
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) {
            this.f6106a = new byte[bArr.length];
            System.arraycopy(bArr, 0, this.f6106a, 0, this.f6106a.length);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) throws IOException {
            if (str.equals("RAW")) {
                engineInit(bArr);
            } else {
                if (!str.equals("ASN.1")) {
                    throw new IOException("Unknown parameters format in IV parameters object");
                }
                engineInit(C0644b.m1569a(bArr).m1570a());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "IDEA Parameters";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new C1010b(new C0893ab()), 64);
        }
    }

    public static class CFB8Mac extends BaseMac {
        public CFB8Mac() {
            super(new C0989b(new C0893ab()));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new C0893ab());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("IDEA", 128, new C0987h());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new C0988a(new C0893ab()));
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6107a = IDEA.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("AlgorithmParameterGenerator.IDEA", f6107a + "$AlgParamGen");
            configurableProvider.mo2853a("AlgorithmParameterGenerator.1.3.6.1.4.1.188.7.1.1.2", f6107a + "$AlgParamGen");
            configurableProvider.mo2853a("AlgorithmParameters.IDEA", f6107a + "$AlgParams");
            configurableProvider.mo2853a("AlgorithmParameters.1.3.6.1.4.1.188.7.1.1.2", f6107a + "$AlgParams");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA-CBC", "PKCS12PBE");
            configurableProvider.mo2853a("Cipher.IDEA", f6107a + "$ECB");
            configurableProvider.mo2855a("Cipher", InterfaceC0645c.f2441v, f6107a + "$CBC");
            configurableProvider.mo2853a("Cipher.PBEWITHSHAANDIDEA-CBC", f6107a + "$PBEWithSHAAndIDEA");
            configurableProvider.mo2853a("KeyGenerator.IDEA", f6107a + "$KeyGen");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0645c.f2441v, f6107a + "$KeyGen");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHSHAANDIDEA-CBC", f6107a + "$PBEWithSHAAndIDEAKeyGen");
            configurableProvider.mo2853a("Mac.IDEAMAC", f6107a + "$Mac");
            configurableProvider.mo2853a("Alg.Alias.Mac.IDEA", "IDEAMAC");
            configurableProvider.mo2853a("Mac.IDEAMAC/CFB8", f6107a + "$CFB8Mac");
            configurableProvider.mo2853a("Alg.Alias.Mac.IDEA/CFB8", "IDEAMAC/CFB8");
        }
    }

    public static class PBEWithSHAAndIDEA extends BaseBlockCipher {
        public PBEWithSHAAndIDEA() {
            super(new C1010b(new C0893ab()));
        }
    }

    public static class PBEWithSHAAndIDEAKeyGen extends PBESecretKeyFactory {
        public PBEWithSHAAndIDEAKeyGen() {
            super("PBEwithSHAandIDEA-CBC", null, true, 2, 1, 128, 64);
        }
    }

    private IDEA() {
    }
}
