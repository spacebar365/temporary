package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.DES;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p054a.p073r.InterfaceC0659b;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.C1181x;
import org.bouncycastle.p083b.p089e.C0902ak;
import org.bouncycastle.p083b.p089e.C0939p;
import org.bouncycastle.p083b.p089e.C0940q;
import org.bouncycastle.p083b.p090f.C0956c;
import org.bouncycastle.p083b.p092h.C0988a;
import org.bouncycastle.p083b.p092h.C0989b;
import org.bouncycastle.p083b.p092h.C0990c;
import org.bouncycastle.p083b.p093i.C1010b;
import org.bouncycastle.p083b.p096j.C1041c;

/* JADX INFO: loaded from: classes.dex */
public final class DESede {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.f6157c == null) {
                this.f6157c = C1124l.m2709a();
            }
            this.f6157c.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersA = m4448a("DES");
                algorithmParametersA.init(new IvParameterSpec(bArr));
                return algorithmParametersA;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DES parameter generation.");
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new C1010b(new C0939p()), 64);
        }
    }

    public static class CBCMAC extends BaseMac {
        public CBCMAC() {
            super(new C0988a(new C0939p()));
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new C0990c(new C0939p()));
        }
    }

    public static class DESede64 extends BaseMac {
        public DESede64() {
            super(new C0988a(new C0939p(), 64));
        }
    }

    public static class DESede64with7816d4 extends BaseMac {
        public DESede64with7816d4() {
            super(new C0988a(new C0939p(), 64, new C1041c()));
        }
    }

    public static class DESedeCFB8 extends BaseMac {
        public DESedeCFB8() {
            super(new C0989b(new C0939p()));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new C0939p());
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("DESede", null);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        protected SecretKey engineGenerateSecret(KeySpec keySpec) {
            return keySpec instanceof DESedeKeySpec ? new SecretKeySpec(((DESedeKeySpec) keySpec).getKey(), "DESede") : super.engineGenerateSecret(keySpec);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        protected KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
            DESedeKeySpec dESedeKeySpec;
            if (cls == null) {
                throw new InvalidKeySpecException("keySpec parameter is null");
            }
            if (secretKey == null) {
                throw new InvalidKeySpecException("key parameter is null");
            }
            if (SecretKeySpec.class.isAssignableFrom(cls)) {
                return new SecretKeySpec(secretKey.getEncoded(), this.f6188a);
            }
            if (!DESedeKeySpec.class.isAssignableFrom(cls)) {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
            byte[] encoded = secretKey.getEncoded();
            try {
                if (encoded.length == 16) {
                    byte[] bArr = new byte[24];
                    System.arraycopy(encoded, 0, bArr, 0, 16);
                    System.arraycopy(encoded, 0, bArr, 16, 8);
                    dESedeKeySpec = new DESedeKeySpec(bArr);
                } else {
                    dESedeKeySpec = new DESedeKeySpec(encoded);
                }
                return dESedeKeySpec;
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {

        /* JADX INFO: renamed from: f */
        private boolean f6087f;

        public KeyGenerator() {
            super("DESede", 192, new C0956c());
            this.f6087f = false;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        protected SecretKey engineGenerateKey() {
            if (this.f6182e) {
                this.f6181d.mo2415a(new C1181x(C1124l.m2709a(), this.f6180c));
                this.f6182e = false;
            }
            if (this.f6087f) {
                return new SecretKeySpec(this.f6181d.mo2416a(), this.f6178a);
            }
            byte[] bArrMo2416a = this.f6181d.mo2416a();
            System.arraycopy(bArrMo2416a, 0, bArrMo2416a, 16, 8);
            return new SecretKeySpec(bArrMo2416a, this.f6178a);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        protected void engineInit(int i, SecureRandom secureRandom) {
            super.engineInit(i, secureRandom);
            this.f6087f = true;
        }
    }

    public static class KeyGenerator3 extends BaseKeyGenerator {
        public KeyGenerator3() {
            super("DESede3", 192, new C0956c());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6088a = DESede.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Cipher.DESEDE", f6088a + "$ECB");
            configurableProvider.mo2855a("Cipher", InterfaceC0674n.f2615D, f6088a + "$CBC");
            configurableProvider.mo2853a("Cipher.DESEDEWRAP", f6088a + "$Wrap");
            configurableProvider.mo2855a("Cipher", InterfaceC0674n.f2700bK, f6088a + "$Wrap");
            configurableProvider.mo2853a("Cipher.DESEDERFC3211WRAP", f6088a + "$RFC3211");
            configurableProvider.mo2853a("Alg.Alias.Cipher.DESEDERFC3217WRAP", "DESEDEWRAP");
            configurableProvider.mo2853a("Alg.Alias.Cipher.TDEA", "DESEDE");
            configurableProvider.mo2853a("Alg.Alias.Cipher.TDEAWRAP", "DESEDEWRAP");
            configurableProvider.mo2853a("Alg.Alias.KeyGenerator.TDEA", "DESEDE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.TDEA", "DESEDE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator.TDEA", "DESEDE");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.TDEA", "DESEDE");
            if (configurableProvider.mo2857b("MessageDigest", "SHA-1")) {
                configurableProvider.mo2853a("Cipher.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", f6088a + "$PBEWithSHAAndDES3Key");
                configurableProvider.mo2853a("Cipher.BROKENPBEWITHSHAAND3-KEYTRIPLEDES-CBC", f6088a + "$BrokePBEWithSHAAndDES3Key");
                configurableProvider.mo2853a("Cipher.OLDPBEWITHSHAAND3-KEYTRIPLEDES-CBC", f6088a + "$OldPBEWithSHAAndDES3Key");
                configurableProvider.mo2853a("Cipher.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", f6088a + "$PBEWithSHAAndDES2Key");
                configurableProvider.mo2853a("Cipher.BROKENPBEWITHSHAAND2-KEYTRIPLEDES-CBC", f6088a + "$BrokePBEWithSHAAndDES2Key");
                configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0674n.f2695bF, "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0674n.f2696bG, "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA1ANDDESEDE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA1AND3-KEYTRIPLEDES-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA1AND2-KEYTRIPLEDES-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHAAND3-KEYDESEDE-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHAAND2-KEYDESEDE-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA1AND3-KEYDESEDE-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA1AND2-KEYDESEDE-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA1ANDDESEDE-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            }
            configurableProvider.mo2853a("KeyGenerator.DESEDE", f6088a + "$KeyGenerator");
            configurableProvider.mo2853a("KeyGenerator." + InterfaceC0674n.f2615D, f6088a + "$KeyGenerator3");
            configurableProvider.mo2853a("KeyGenerator.DESEDEWRAP", f6088a + "$KeyGenerator");
            configurableProvider.mo2853a("SecretKeyFactory.DESEDE", f6088a + "$KeyFactory");
            configurableProvider.mo2855a("SecretKeyFactory", InterfaceC0659b.f2574h, f6088a + "$KeyFactory");
            configurableProvider.mo2853a("Mac.DESEDECMAC", f6088a + "$CMAC");
            configurableProvider.mo2853a("Mac.DESEDEMAC", f6088a + "$CBCMAC");
            configurableProvider.mo2853a("Alg.Alias.Mac.DESEDE", "DESEDEMAC");
            configurableProvider.mo2853a("Mac.DESEDEMAC/CFB8", f6088a + "$DESedeCFB8");
            configurableProvider.mo2853a("Alg.Alias.Mac.DESEDE/CFB8", "DESEDEMAC/CFB8");
            configurableProvider.mo2853a("Mac.DESEDEMAC64", f6088a + "$DESede64");
            configurableProvider.mo2853a("Alg.Alias.Mac.DESEDE64", "DESEDEMAC64");
            configurableProvider.mo2853a("Mac.DESEDEMAC64WITHISO7816-4PADDING", f6088a + "$DESede64with7816d4");
            configurableProvider.mo2853a("Alg.Alias.Mac.DESEDE64WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            configurableProvider.mo2853a("Alg.Alias.Mac.DESEDEISO9797ALG1MACWITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            configurableProvider.mo2853a("Alg.Alias.Mac.DESEDEISO9797ALG1WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            configurableProvider.mo2853a("AlgorithmParameters.DESEDE", "org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0674n.f2615D, "DESEDE");
            configurableProvider.mo2853a("AlgorithmParameterGenerator.DESEDE", f6088a + "$AlgParamGen");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator." + InterfaceC0674n.f2615D, "DESEDE");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", f6088a + "$PBEWithSHAAndDES3KeyFactory");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", f6088a + "$PBEWithSHAAndDES2KeyFactory");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDDESEDE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES3KEY-CBC", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES2KEY-CBC", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.3", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.4", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.3", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.4", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        }
    }

    public static class PBEWithSHAAndDES2Key extends BaseBlockCipher {
        public PBEWithSHAAndDES2Key() {
            super(new C1010b(new C0939p()), 2, 1, 128, 8);
        }
    }

    public static class PBEWithSHAAndDES2KeyFactory extends DES.DESPBEKeyFactory {
        public PBEWithSHAAndDES2KeyFactory() {
            super("PBEwithSHAandDES2Key-CBC", InterfaceC0674n.f2696bG, 2, 1, 128);
        }
    }

    public static class PBEWithSHAAndDES3Key extends BaseBlockCipher {
        public PBEWithSHAAndDES3Key() {
            super(new C1010b(new C0939p()), 2, 1, 192, 8);
        }
    }

    public static class PBEWithSHAAndDES3KeyFactory extends DES.DESPBEKeyFactory {
        public PBEWithSHAAndDES3KeyFactory() {
            super("PBEwithSHAandDES3Key-CBC", InterfaceC0674n.f2695bF, 2, 1, 192);
        }
    }

    public static class RFC3211 extends BaseWrapCipher {
        public RFC3211() {
            super(new C0902ak(new C0939p()), 8);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new C0940q());
        }
    }

    private DESede() {
    }
}
