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
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p054a.C0638l;
import org.bouncycastle.p054a.p069n.C0643a;
import org.bouncycastle.p054a.p069n.InterfaceC0645c;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.p089e.C0931h;
import org.bouncycastle.p083b.p093i.C1010b;

/* JADX INFO: loaded from: classes.dex */
public final class CAST5 {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.f6157c == null) {
                this.f6157c = C1124l.m2709a();
            }
            this.f6157c.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersA = m4448a("CAST5");
                algorithmParametersA.init(new IvParameterSpec(bArr));
                return algorithmParametersA;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for CAST5 parameter generation.");
        }
    }

    public static class AlgParams extends BaseAlgorithmParameters {

        /* JADX INFO: renamed from: a */
        private byte[] f6075a;

        /* JADX INFO: renamed from: b */
        private int f6076b = 128;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        /* JADX INFO: renamed from: a */
        protected final AlgorithmParameterSpec mo4277a(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f6075a);
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to CAST5 parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            byte[] bArr = new byte[this.f6075a.length];
            System.arraycopy(this.f6075a, 0, bArr, 0, this.f6075a.length);
            return bArr;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) {
            if (m4449a(str)) {
                return new C0643a(engineGetEncoded(), this.f6076b).mo1578k();
            }
            if (str.equals("RAW")) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
                throw new InvalidParameterSpecException("IvParameterSpec required to initialise a CAST5 parameters algorithm parameters object");
            }
            this.f6075a = ((IvParameterSpec) algorithmParameterSpec).getIV();
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) {
            this.f6075a = new byte[bArr.length];
            System.arraycopy(bArr, 0, this.f6075a, 0, this.f6075a.length);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) throws IOException {
            if (m4449a(str)) {
                C0643a c0643aM1566a = C0643a.m1566a(new C0638l(bArr).m1560b());
                this.f6076b = c0643aM1566a.m1568b();
                this.f6075a = c0643aM1566a.m1567a();
            } else {
                if (!str.equals("RAW")) {
                    throw new IOException("Unknown parameters format in IV parameters object");
                }
                engineInit(bArr);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "CAST5 Parameters";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new C1010b(new C0931h()), 64);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new C0931h());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("CAST5", 128, new C0987h());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6077a = CAST5.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("AlgorithmParameters.CAST5", f6077a + "$AlgParams");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.1.2.840.113533.7.66.10", "CAST5");
            configurableProvider.mo2853a("AlgorithmParameterGenerator.CAST5", f6077a + "$AlgParamGen");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator.1.2.840.113533.7.66.10", "CAST5");
            configurableProvider.mo2853a("Cipher.CAST5", f6077a + "$ECB");
            configurableProvider.mo2855a("Cipher", InterfaceC0645c.f2440u, f6077a + "$CBC");
            configurableProvider.mo2853a("KeyGenerator.CAST5", f6077a + "$KeyGen");
            configurableProvider.mo2855a("Alg.Alias.KeyGenerator", InterfaceC0645c.f2440u, "CAST5");
        }
    }

    private CAST5() {
    }
}
