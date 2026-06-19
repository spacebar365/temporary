package org.bouncycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.p074s.C0677q;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.p089e.C0896ae;
import org.bouncycastle.p083b.p089e.C0897af;
import org.bouncycastle.p083b.p092h.C0988a;
import org.bouncycastle.p083b.p092h.C0989b;
import org.bouncycastle.p083b.p093i.C1010b;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: loaded from: classes.dex */
public final class RC2 {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {

        /* JADX INFO: renamed from: a */
        RC2ParameterSpec f6120a = null;

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            if (this.f6120a != null) {
                try {
                    AlgorithmParameters algorithmParametersA = m4448a("RC2");
                    algorithmParametersA.init(this.f6120a);
                    return algorithmParametersA;
                } catch (Exception e) {
                    throw new RuntimeException(e.getMessage());
                }
            }
            byte[] bArr = new byte[8];
            if (this.f6157c == null) {
                this.f6157c = C1124l.m2709a();
            }
            this.f6157c.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersA2 = m4448a("RC2");
                algorithmParametersA2.init(new IvParameterSpec(bArr));
                return algorithmParametersA2;
            } catch (Exception e2) {
                throw new RuntimeException(e2.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (!(algorithmParameterSpec instanceof RC2ParameterSpec)) {
                throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC2 parameter generation.");
            }
            this.f6120a = (RC2ParameterSpec) algorithmParameterSpec;
        }
    }

    public static class AlgParams extends BaseAlgorithmParameters {

        /* JADX INFO: renamed from: a */
        private static final short[] f6121a = {189, 86, 234, 242, 162, 241, 172, 42, 176, 147, 209, 156, 27, 51, 253, 208, 48, 4, 182, 220, 125, 223, 50, 75, 247, 203, 69, 155, 49, 187, 33, 90, 65, 159, 225, 217, 74, 77, 158, 218, 160, 104, 44, 195, 39, 95, 128, 54, 62, 238, 251, 149, 26, 254, 206, 168, 52, 169, 19, 240, 166, 63, 216, 12, 120, 36, 175, 35, 82, 193, 103, 23, 245, 102, 144, 231, 232, 7, 184, 96, 72, 230, 30, 83, 243, 146, 164, 114, 140, 8, 21, 110, 134, 0, 132, 250, 244, 127, 138, 66, 25, 246, 219, 205, 20, 141, 80, 18, 186, 60, 6, 78, 236, 179, 53, 17, 161, 136, 142, 43, 148, 153, 183, 113, 116, 211, 228, 191, 58, 222, 150, 14, 188, 10, 237, 119, 252, 55, 107, 3, 121, 137, 98, 198, 215, 192, 210, 124, 106, 139, 34, 163, 91, 5, 93, 2, 117, 213, 97, 227, 24, 143, 85, 81, 173, 31, 11, 94, 133, 229, 194, 87, 99, 202, 61, 108, 180, 197, 204, 112, 178, 145, 89, 13, 71, 32, 200, 79, 88, 224, 1, 226, 22, 56, 196, 111, 59, 15, 101, 70, 190, 126, 45, 123, 130, 249, 64, 181, 29, 115, 248, 235, 38, 199, 135, 151, 37, 84, 177, 40, 170, 152, 157, 165, 100, 109, 122, 212, 16, 129, 68, 239, 73, 214, 174, 46, 221, 118, 92, 47, 167, 28, 201, 9, 105, 154, 131, 207, 41, 57, 185, 233, 76, 255, 67, 171};

        /* JADX INFO: renamed from: b */
        private static final short[] f6122b = {93, 190, 155, 139, 17, 153, 110, 77, 89, 243, 133, 166, 63, 183, 131, 197, 228, 115, 107, 58, 104, 90, 192, 71, 160, 100, 52, 12, 241, 208, 82, 165, 185, 30, 150, 67, 65, 216, 212, 44, 219, 248, 7, 119, 42, 202, 235, 239, 16, 28, 22, 13, 56, 114, 47, 137, 193, 249, 128, 196, 109, 174, 48, 61, 206, 32, 99, 254, 230, 26, 199, 184, 80, 232, 36, 23, 252, 37, 111, 187, 106, 163, 68, 83, 217, 162, 1, 171, 188, 182, 31, 152, 238, 154, 167, 45, 79, 158, 142, 172, 224, 198, 73, 70, 41, 244, 148, 138, 175, 225, 91, 195, 179, 123, 87, 209, 124, 156, 237, 135, 64, 140, 226, 203, 147, 20, 201, 97, 46, 229, 204, 246, 94, 168, 92, 214, 117, 141, 98, 149, 88, 105, 118, 161, 74, 181, 85, 9, 120, 51, 130, 215, 221, 121, 245, 27, 11, 222, 38, 33, 40, 116, 4, 151, 86, 223, 60, 240, 55, 57, 220, 255, 6, 164, 234, 66, 8, 218, 180, 113, 176, 207, 18, 122, 78, 250, 108, 29, 132, 0, 200, 127, 145, 69, 170, 43, 194, 177, 143, 213, 186, 242, 173, 25, 178, 103, 54, 247, 15, 10, 146, 125, 227, 157, 233, 144, 62, 35, 39, 102, 19, 236, 129, 21, 189, 34, 191, 159, 126, 169, 81, 75, 76, 251, 2, 211, 112, 134, 49, 231, 59, 5, 3, 84, 96, 72, 101, 24, 210, 205, 95, 50, 136, 14, 53, 253};

        /* JADX INFO: renamed from: c */
        private byte[] f6123c;

        /* JADX INFO: renamed from: d */
        private int f6124d = 58;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        /* JADX INFO: renamed from: a */
        protected final AlgorithmParameterSpec mo4277a(Class cls) throws InvalidParameterSpecException {
            if ((cls == RC2ParameterSpec.class || cls == AlgorithmParameterSpec.class) && this.f6124d != -1) {
                return this.f6124d < 256 ? new RC2ParameterSpec(f6122b[this.f6124d], this.f6123c) : new RC2ParameterSpec(this.f6124d, this.f6123c);
            }
            if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new IvParameterSpec(this.f6123c);
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to RC2 parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            return C1535a.m4086b(this.f6123c);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) {
            if (m4449a(str)) {
                return this.f6124d == -1 ? new C0677q(engineGetEncoded()).mo1578k() : new C0677q(this.f6124d, engineGetEncoded()).mo1578k();
            }
            if (str.equals("RAW")) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.f6123c = ((IvParameterSpec) algorithmParameterSpec).getIV();
                return;
            }
            if (!(algorithmParameterSpec instanceof RC2ParameterSpec)) {
                throw new InvalidParameterSpecException("IvParameterSpec or RC2ParameterSpec required to initialise a RC2 parameters algorithm parameters object");
            }
            int effectiveKeyBits = ((RC2ParameterSpec) algorithmParameterSpec).getEffectiveKeyBits();
            if (effectiveKeyBits != -1) {
                if (effectiveKeyBits < 256) {
                    this.f6124d = f6121a[effectiveKeyBits];
                } else {
                    this.f6124d = effectiveKeyBits;
                }
            }
            this.f6123c = ((RC2ParameterSpec) algorithmParameterSpec).getIV();
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) {
            this.f6123c = C1535a.m4086b(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) throws IOException {
            if (!m4449a(str)) {
                if (!str.equals("RAW")) {
                    throw new IOException("Unknown parameters format in IV parameters object");
                }
                engineInit(bArr);
            } else {
                C0677q c0677qM1661a = C0677q.m1661a(AbstractC0686u.m1692b(bArr));
                if (c0677qM1661a.m1662a() != null) {
                    this.f6124d = c0677qM1661a.m1662a().intValue();
                }
                this.f6123c = c0677qM1661a.m1663b();
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "RC2 Parameters";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new C1010b(new C0896ae()), 64);
        }
    }

    public static class CBCMAC extends BaseMac {
        public CBCMAC() {
            super(new C0988a(new C0896ae()));
        }
    }

    public static class CFB8MAC extends BaseMac {
        public CFB8MAC() {
            super(new C0989b(new C0896ae()));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new C0896ae());
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("RC2", 128, new C0987h());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6125a = RC2.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("AlgorithmParameterGenerator.RC2", f6125a + "$AlgParamGen");
            configurableProvider.mo2853a("AlgorithmParameterGenerator.1.2.840.113549.3.2", f6125a + "$AlgParamGen");
            configurableProvider.mo2853a("KeyGenerator.RC2", f6125a + "$KeyGenerator");
            configurableProvider.mo2853a("KeyGenerator.1.2.840.113549.3.2", f6125a + "$KeyGenerator");
            configurableProvider.mo2853a("AlgorithmParameters.RC2", f6125a + "$AlgParams");
            configurableProvider.mo2853a("AlgorithmParameters.1.2.840.113549.3.2", f6125a + "$AlgParams");
            configurableProvider.mo2853a("Cipher.RC2", f6125a + "$ECB");
            configurableProvider.mo2853a("Cipher.RC2WRAP", f6125a + "$Wrap");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0674n.f2701bL, "RC2WRAP");
            configurableProvider.mo2855a("Cipher", InterfaceC0674n.f2616E, f6125a + "$CBC");
            configurableProvider.mo2853a("Mac.RC2MAC", f6125a + "$CBCMAC");
            configurableProvider.mo2853a("Alg.Alias.Mac.RC2", "RC2MAC");
            configurableProvider.mo2853a("Mac.RC2MAC/CFB8", f6125a + "$CFB8MAC");
            configurableProvider.mo2853a("Alg.Alias.Mac.RC2/CFB8", "RC2MAC/CFB8");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDRC2-CBC", "PBEWITHMD2ANDRC2");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDRC2-CBC", "PBEWITHMD5ANDRC2");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDRC2-CBC", "PBEWITHSHA1ANDRC2");
            configurableProvider.mo2855a("Alg.Alias.SecretKeyFactory", InterfaceC0674n.f2751v, "PBEWITHMD2ANDRC2");
            configurableProvider.mo2855a("Alg.Alias.SecretKeyFactory", InterfaceC0674n.f2753x, "PBEWITHMD5ANDRC2");
            configurableProvider.mo2855a("Alg.Alias.SecretKeyFactory", InterfaceC0674n.f2755z, "PBEWITHSHA1ANDRC2");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.5", "PBEWITHSHAAND128BITRC2-CBC");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.6", "PBEWITHSHAAND40BITRC2-CBC");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHMD2ANDRC2", f6125a + "$PBEWithMD2KeyFactory");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHMD5ANDRC2", f6125a + "$PBEWithMD5KeyFactory");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHSHA1ANDRC2", f6125a + "$PBEWithSHA1KeyFactory");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHSHAAND128BITRC2-CBC", f6125a + "$PBEWithSHAAnd128BitKeyFactory");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHSHAAND40BITRC2-CBC", f6125a + "$PBEWithSHAAnd40BitKeyFactory");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0674n.f2751v, "PBEWITHMD2ANDRC2");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0674n.f2753x, "PBEWITHMD5ANDRC2");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0674n.f2755z, "PBEWITHSHA1ANDRC2");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.5", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.6", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWithSHAAnd3KeyTripleDES", "PKCS12PBE");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0674n.f2697bH, "PBEWITHSHAAND128BITRC2-CBC");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0674n.f2698bI, "PBEWITHSHAAND40BITRC2-CBC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC2-CBC", "PBEWITHSHAAND128BITRC2-CBC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC2-CBC", "PBEWITHSHAAND40BITRC2-CBC");
            configurableProvider.mo2853a("Cipher.PBEWITHSHA1ANDRC2", f6125a + "$PBEWithSHA1AndRC2");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHAANDRC2-CBC", "PBEWITHSHA1ANDRC2");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA1ANDRC2-CBC", "PBEWITHSHA1ANDRC2");
            configurableProvider.mo2853a("Cipher.PBEWITHSHAAND128BITRC2-CBC", f6125a + "$PBEWithSHAAnd128BitRC2");
            configurableProvider.mo2853a("Cipher.PBEWITHSHAAND40BITRC2-CBC", f6125a + "$PBEWithSHAAnd40BitRC2");
            configurableProvider.mo2853a("Cipher.PBEWITHMD5ANDRC2", f6125a + "$PBEWithMD5AndRC2");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHMD5ANDRC2-CBC", "PBEWITHMD5ANDRC2");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC2", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2-CBC", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC2-CBC", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC2-CBC", "PKCS12PBE");
        }
    }

    public static class PBEWithMD2KeyFactory extends PBESecretKeyFactory {
        public PBEWithMD2KeyFactory() {
            super("PBEwithMD2andRC2", InterfaceC0674n.f2751v, true, 0, 5, 64, 64);
        }
    }

    public static class PBEWithMD5AndRC2 extends BaseBlockCipher {
        public PBEWithMD5AndRC2() {
            super(new C1010b(new C0896ae()), 0, 0, 64, 8);
        }
    }

    public static class PBEWithMD5KeyFactory extends PBESecretKeyFactory {
        public PBEWithMD5KeyFactory() {
            super("PBEwithMD5andRC2", InterfaceC0674n.f2753x, true, 0, 0, 64, 64);
        }
    }

    public static class PBEWithSHA1AndRC2 extends BaseBlockCipher {
        public PBEWithSHA1AndRC2() {
            super(new C1010b(new C0896ae()), 0, 1, 64, 8);
        }
    }

    public static class PBEWithSHA1KeyFactory extends PBESecretKeyFactory {
        public PBEWithSHA1KeyFactory() {
            super("PBEwithSHA1andRC2", InterfaceC0674n.f2755z, true, 0, 1, 64, 64);
        }
    }

    public static class PBEWithSHAAnd128BitKeyFactory extends PBESecretKeyFactory {
        public PBEWithSHAAnd128BitKeyFactory() {
            super("PBEwithSHAand128BitRC2-CBC", InterfaceC0674n.f2697bH, true, 2, 1, 128, 64);
        }
    }

    public static class PBEWithSHAAnd128BitRC2 extends BaseBlockCipher {
        public PBEWithSHAAnd128BitRC2() {
            super(new C1010b(new C0896ae()), 2, 1, 128, 8);
        }
    }

    public static class PBEWithSHAAnd40BitKeyFactory extends PBESecretKeyFactory {
        public PBEWithSHAAnd40BitKeyFactory() {
            super("PBEwithSHAand40BitRC2-CBC", InterfaceC0674n.f2698bI, true, 2, 1, 40, 64);
        }
    }

    public static class PBEWithSHAAnd40BitRC2 extends BaseBlockCipher {
        public PBEWithSHAAnd40BitRC2() {
            super(new C1010b(new C0896ae()), 2, 1, 40, 8);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new C0897af());
        }
    }

    private RC2() {
    }
}
