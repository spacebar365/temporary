package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.PBKDF1Key;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p073r.InterfaceC0659b;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.C1181x;
import org.bouncycastle.p083b.EnumC0805ae;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p089e.C0902ak;
import org.bouncycastle.p083b.p089e.C0938o;
import org.bouncycastle.p083b.p090f.C0955b;
import org.bouncycastle.p083b.p092h.C0988a;
import org.bouncycastle.p083b.p092h.C0989b;
import org.bouncycastle.p083b.p092h.C0990c;
import org.bouncycastle.p083b.p092h.C0995h;
import org.bouncycastle.p083b.p093i.C1010b;
import org.bouncycastle.p083b.p096j.C1041c;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p083b.p097k.C1100c;

/* JADX INFO: loaded from: classes.dex */
public final class DES {

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
            super(new C1010b(new C0938o()), 64);
        }
    }

    public static class CBCMAC extends BaseMac {
        public CBCMAC() {
            super(new C0988a(new C0938o()));
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new C0990c(new C0938o()));
        }
    }

    public static class DES64 extends BaseMac {
        public DES64() {
            super(new C0988a(new C0938o(), 64));
        }
    }

    public static class DES64with7816d4 extends BaseMac {
        public DES64with7816d4() {
            super(new C0988a(new C0938o(), 64, new C1041c()));
        }
    }

    public static class DES9797Alg3 extends BaseMac {
        public DES9797Alg3() {
            super(new C0995h(new C0938o()));
        }
    }

    public static class DES9797Alg3with7816d4 extends BaseMac {
        public DES9797Alg3with7816d4() {
            super(new C0995h(new C0938o(), new C1041c()));
        }
    }

    public static class DESCFB8 extends BaseMac {
        public DESCFB8() {
            super(new C0989b(new C0938o()));
        }
    }

    public static class DESPBEKeyFactory extends BaseSecretKeyFactory {

        /* JADX INFO: renamed from: c */
        private boolean f6081c;

        /* JADX INFO: renamed from: d */
        private int f6082d;

        /* JADX INFO: renamed from: e */
        private int f6083e;

        /* JADX INFO: renamed from: f */
        private int f6084f;

        /* JADX INFO: renamed from: g */
        private int f6085g;

        public DESPBEKeyFactory(String str, C0653p c0653p, int i, int i2, int i3) {
            super(str, c0653p);
            this.f6081c = true;
            this.f6082d = i;
            this.f6083e = i2;
            this.f6084f = i3;
            this.f6085g = 64;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        protected SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof PBEKeySpec)) {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
            PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
            if (pBEKeySpec.getSalt() != null) {
                InterfaceC1003i interfaceC1003iM4470a = this.f6081c ? PBE.Util.m4470a(pBEKeySpec, this.f6082d, this.f6083e, this.f6084f, this.f6085g) : PBE.Util.m4469a(pBEKeySpec, this.f6082d, this.f6083e, this.f6084f);
                C1100c.m2653a((interfaceC1003iM4470a instanceof C1080be ? (C1076ba) ((C1080be) interfaceC1003iM4470a).m2612b() : (C1076ba) interfaceC1003iM4470a).m2603a());
                return new BCPBEKey(this.f6188a, this.f6189b, this.f6082d, this.f6083e, this.f6084f, this.f6085g, pBEKeySpec, interfaceC1003iM4470a);
            }
            if (this.f6082d == 0 || this.f6082d == 4) {
                return new PBKDF1Key(pBEKeySpec.getPassword(), this.f6082d == 0 ? EnumC0805ae.f3327a : EnumC0805ae.f3328b);
            }
            return new BCPBEKey(this.f6188a, this.f6189b, this.f6082d, this.f6083e, this.f6084f, this.f6085g, pBEKeySpec, null);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new C0938o());
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("DES", null);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        protected SecretKey engineGenerateSecret(KeySpec keySpec) {
            return keySpec instanceof DESKeySpec ? new SecretKeySpec(((DESKeySpec) keySpec).getKey(), "DES") : super.engineGenerateSecret(keySpec);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        protected KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
            if (cls == null) {
                throw new InvalidKeySpecException("keySpec parameter is null");
            }
            if (secretKey == null) {
                throw new InvalidKeySpecException("key parameter is null");
            }
            if (SecretKeySpec.class.isAssignableFrom(cls)) {
                return new SecretKeySpec(secretKey.getEncoded(), this.f6188a);
            }
            if (!DESKeySpec.class.isAssignableFrom(cls)) {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
            try {
                return new DESKeySpec(secretKey.getEncoded());
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("DES", 64, new C0955b());
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        protected SecretKey engineGenerateKey() {
            if (this.f6182e) {
                this.f6181d.mo2415a(new C1181x(C1124l.m2709a(), this.f6180c));
                this.f6182e = false;
            }
            return new SecretKeySpec(this.f6181d.mo2416a(), this.f6178a);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        protected void engineInit(int i, SecureRandom secureRandom) {
            super.engineInit(i, secureRandom);
        }
    }

    public static class PBEWithMD2 extends BaseBlockCipher {
        public PBEWithMD2() {
            super(new C1010b(new C0938o()), 0, 5, 64, 8);
        }
    }

    public static class PBEWithMD2KeyFactory extends DESPBEKeyFactory {
        public PBEWithMD2KeyFactory() {
            super("PBEwithMD2andDES", InterfaceC0674n.f2750t_, 0, 5, 64);
        }
    }

    public static class PBEWithMD5 extends BaseBlockCipher {
        public PBEWithMD5() {
            super(new C1010b(new C0938o()), 0, 0, 64, 8);
        }
    }

    public static class PBEWithMD5KeyFactory extends DESPBEKeyFactory {
        public PBEWithMD5KeyFactory() {
            super("PBEwithMD5andDES", InterfaceC0674n.f2752w, 0, 0, 64);
        }
    }

    public static class PBEWithSHA1 extends BaseBlockCipher {
        public PBEWithSHA1() {
            super(new C1010b(new C0938o()), 0, 1, 64, 8);
        }
    }

    public static class PBEWithSHA1KeyFactory extends DESPBEKeyFactory {
        public PBEWithSHA1KeyFactory() {
            super("PBEwithSHA1andDES", InterfaceC0674n.f2754y, 0, 1, 64);
        }
    }

    public static class RFC3211 extends BaseWrapCipher {
        public RFC3211() {
            super(new C0902ak(new C0938o()), 8);
        }
    }

    private DES() {
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6086a = DES.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Cipher.DES", f6086a + "$ECB");
            configurableProvider.mo2855a("Cipher", InterfaceC0659b.f2571e, f6086a + "$CBC");
            C0653p c0653p = InterfaceC0659b.f2571e;
            configurableProvider.mo2853a("Alg.Alias.KeyGenerator." + c0653p.m1593b(), "DES");
            configurableProvider.mo2853a("Alg.Alias.KeyFactory." + c0653p.m1593b(), "DES");
            configurableProvider.mo2853a("Cipher.DESRFC3211WRAP", f6086a + "$RFC3211");
            configurableProvider.mo2853a("KeyGenerator.DES", f6086a + "$KeyGenerator");
            configurableProvider.mo2853a("SecretKeyFactory.DES", f6086a + "$KeyFactory");
            configurableProvider.mo2853a("Mac.DESCMAC", f6086a + "$CMAC");
            configurableProvider.mo2853a("Mac.DESMAC", f6086a + "$CBCMAC");
            configurableProvider.mo2853a("Alg.Alias.Mac.DES", "DESMAC");
            configurableProvider.mo2853a("Mac.DESMAC/CFB8", f6086a + "$DESCFB8");
            configurableProvider.mo2853a("Alg.Alias.Mac.DES/CFB8", "DESMAC/CFB8");
            configurableProvider.mo2853a("Mac.DESMAC64", f6086a + "$DES64");
            configurableProvider.mo2853a("Alg.Alias.Mac.DES64", "DESMAC64");
            configurableProvider.mo2853a("Mac.DESMAC64WITHISO7816-4PADDING", f6086a + "$DES64with7816d4");
            configurableProvider.mo2853a("Alg.Alias.Mac.DES64WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
            configurableProvider.mo2853a("Alg.Alias.Mac.DESISO9797ALG1MACWITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
            configurableProvider.mo2853a("Alg.Alias.Mac.DESISO9797ALG1WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
            configurableProvider.mo2853a("Mac.DESWITHISO9797", f6086a + "$DES9797Alg3");
            configurableProvider.mo2853a("Alg.Alias.Mac.DESISO9797MAC", "DESWITHISO9797");
            configurableProvider.mo2853a("Mac.ISO9797ALG3MAC", f6086a + "$DES9797Alg3");
            configurableProvider.mo2853a("Alg.Alias.Mac.ISO9797ALG3", "ISO9797ALG3MAC");
            configurableProvider.mo2853a("Mac.ISO9797ALG3WITHISO7816-4PADDING", f6086a + "$DES9797Alg3with7816d4");
            configurableProvider.mo2853a("Alg.Alias.Mac.ISO9797ALG3MACWITHISO7816-4PADDING", "ISO9797ALG3WITHISO7816-4PADDING");
            configurableProvider.mo2853a("AlgorithmParameters.DES", "org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
            configurableProvider.mo2855a("Alg.Alias.AlgorithmParameters", InterfaceC0659b.f2571e, "DES");
            configurableProvider.mo2853a("AlgorithmParameterGenerator.DES", f6086a + "$AlgParamGen");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator." + InterfaceC0659b.f2571e, "DES");
            configurableProvider.mo2853a("Cipher.PBEWITHMD2ANDDES", f6086a + "$PBEWithMD2");
            configurableProvider.mo2853a("Cipher.PBEWITHMD5ANDDES", f6086a + "$PBEWithMD5");
            configurableProvider.mo2853a("Cipher.PBEWITHSHA1ANDDES", f6086a + "$PBEWithSHA1");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0674n.f2750t_, "PBEWITHMD2ANDDES");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0674n.f2752w, "PBEWITHMD5ANDDES");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0674n.f2754y, "PBEWITHSHA1ANDDES");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHMD2ANDDES", f6086a + "$PBEWithMD2KeyFactory");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHMD5ANDDES", f6086a + "$PBEWithMD5KeyFactory");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHSHA1ANDDES", f6086a + "$PBEWithSHA1KeyFactory");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory." + InterfaceC0674n.f2750t_, "PBEWITHMD2ANDDES");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory." + InterfaceC0674n.f2752w, "PBEWITHMD5ANDDES");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory." + InterfaceC0674n.f2754y, "PBEWITHSHA1ANDDES");
        }
    }
}
