package org.bouncycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import org.bouncycastle.p054a.p057b.InterfaceC0565a;
import org.bouncycastle.p054a.p059d.C0614a;
import org.bouncycastle.p054a.p059d.C0615b;
import org.bouncycastle.p054a.p070o.InterfaceC0652b;
import org.bouncycastle.p083b.C0950f;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.C1179v;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p089e.C0891a;
import org.bouncycastle.p083b.p089e.C0902ak;
import org.bouncycastle.p083b.p089e.C0904am;
import org.bouncycastle.p083b.p089e.C0918b;
import org.bouncycastle.p083b.p089e.C0926c;
import org.bouncycastle.p083b.p090f.C0978y;
import org.bouncycastle.p083b.p092h.C0990c;
import org.bouncycastle.p083b.p092h.C0992e;
import org.bouncycastle.p083b.p092h.C0999l;
import org.bouncycastle.p083b.p093i.C1010b;
import org.bouncycastle.p083b.p093i.C1018c;
import org.bouncycastle.p083b.p093i.C1019d;
import org.bouncycastle.p083b.p093i.C1027l;
import org.bouncycastle.p083b.p093i.C1034s;

/* JADX INFO: loaded from: classes.dex */
public final class AES {

    /* JADX INFO: renamed from: a */
    private static final Map<String, String> f6064a;

    public static class AESCCMMAC extends BaseMac {

        private static class CCMMac implements InterfaceC1183z {

            /* JADX INFO: renamed from: a */
            private final C1018c f6065a;

            /* JADX INFO: renamed from: b */
            private int f6066b;

            private CCMMac() {
                this.f6065a = new C1018c(new C0891a());
                this.f6066b = 8;
            }

            /* synthetic */ CCMMac(byte b) {
                this();
            }

            @Override // org.bouncycastle.p083b.InterfaceC1183z
            /* JADX INFO: renamed from: a */
            public final int mo2446a(byte[] bArr, int i) {
                try {
                    return this.f6065a.mo2473a(bArr, 0);
                } catch (C1179v e) {
                    throw new IllegalStateException("exception on doFinal(): " + e.toString());
                }
            }

            @Override // org.bouncycastle.p083b.InterfaceC1183z
            /* JADX INFO: renamed from: a */
            public final String mo2447a() {
                return this.f6065a.m2504c() + "Mac";
            }

            @Override // org.bouncycastle.p083b.InterfaceC1183z
            /* JADX INFO: renamed from: a */
            public final void mo2448a(byte b) {
                this.f6065a.m2503a(b);
            }

            @Override // org.bouncycastle.p083b.InterfaceC1183z
            /* JADX INFO: renamed from: a */
            public final void mo2449a(InterfaceC1003i interfaceC1003i) {
                this.f6065a.mo2476a(true, interfaceC1003i);
                this.f6066b = this.f6065a.mo2479b().length;
            }

            @Override // org.bouncycastle.p083b.InterfaceC1183z
            /* JADX INFO: renamed from: a */
            public final void mo2450a(byte[] bArr, int i, int i2) {
                this.f6065a.mo2477a(bArr, i, i2);
            }

            @Override // org.bouncycastle.p083b.InterfaceC1183z
            /* JADX INFO: renamed from: b */
            public final int mo2451b() {
                return this.f6066b;
            }

            @Override // org.bouncycastle.p083b.InterfaceC1183z
            /* JADX INFO: renamed from: c */
            public final void mo2452c() {
                this.f6065a.m2505d();
            }
        }

        public AESCCMMAC() {
            super(new CCMMac((byte) 0));
        }
    }

    public static class AESCMAC extends BaseMac {
        public AESCMAC() {
            super(new C0990c(new C0891a()));
        }
    }

    public static class AESGMAC extends BaseMac {
        public AESGMAC() {
            super(new C0992e(new C1027l(new C0891a())));
        }
    }

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.f6157c == null) {
                this.f6157c = new SecureRandom();
            }
            this.f6157c.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersA = m4448a("AES");
                algorithmParametersA.init(new IvParameterSpec(bArr));
                return algorithmParametersA;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public static class AlgParamGenCCM extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (this.f6157c == null) {
                this.f6157c = new SecureRandom();
            }
            this.f6157c.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersA = m4448a("CCM");
                algorithmParametersA.init(new C0614a(bArr, 12).mo1578k());
                return algorithmParametersA;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public static class AlgParamGenGCM extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (this.f6157c == null) {
                this.f6157c = new SecureRandom();
            }
            this.f6157c.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersA = m4448a("GCM");
                algorithmParametersA.init(new C0615b(bArr, 16).mo1578k());
                return algorithmParametersA;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "AES IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new C1010b(new C0891a()), 128);
        }
    }

    public static class CCM extends BaseBlockCipher {
        public CCM() {
            super(new C1018c(new C0891a()), (byte) 0);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new C0950f(new C1019d(new C0891a(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.AES.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                /* JADX INFO: renamed from: a */
                public final InterfaceC0890e mo4430a() {
                    return new C0891a();
                }
            });
        }
    }

    public static class GCM extends BaseBlockCipher {
        public GCM() {
            super(new C1027l(new C0891a()));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("AES", null);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(192);
        }

        public KeyGen(int i) {
            super("AES", i, new C0987h());
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
        private static final String f6069a = AES.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("AlgorithmParameters.AES", f6069a + "$AlgParams");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", "AES");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0652b.f2508u, "AES");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0652b.f2455C, "AES");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0652b.f2463K, "AES");
            configurableProvider.mo2853a("AlgorithmParameters.GCM", f6069a + "$AlgParamsGCM");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0652b.f2512y, "GCM");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0652b.f2459G, "GCM");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0652b.f2467O, "GCM");
            configurableProvider.mo2853a("AlgorithmParameters.CCM", f6069a + "$AlgParamsCCM");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0652b.f2513z, "CCM");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0652b.f2460H, "CCM");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0652b.f2468P, "CCM");
            configurableProvider.mo2853a("AlgorithmParameterGenerator.AES", f6069a + "$AlgParamGen");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", "AES");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator." + InterfaceC0652b.f2508u, "AES");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator." + InterfaceC0652b.f2455C, "AES");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator." + InterfaceC0652b.f2463K, "AES");
            configurableProvider.mo2854a("Cipher.AES", AES.f6064a);
            configurableProvider.mo2853a("Cipher.AES", f6069a + "$ECB");
            configurableProvider.mo2853a("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.mo2853a("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.mo2853a("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", "AES");
            configurableProvider.mo2855a("Cipher", InterfaceC0652b.f2507t, f6069a + "$ECB");
            configurableProvider.mo2855a("Cipher", InterfaceC0652b.f2454B, f6069a + "$ECB");
            configurableProvider.mo2855a("Cipher", InterfaceC0652b.f2462J, f6069a + "$ECB");
            configurableProvider.mo2855a("Cipher", InterfaceC0652b.f2508u, f6069a + "$CBC");
            configurableProvider.mo2855a("Cipher", InterfaceC0652b.f2455C, f6069a + "$CBC");
            configurableProvider.mo2855a("Cipher", InterfaceC0652b.f2463K, f6069a + "$CBC");
            configurableProvider.mo2855a("Cipher", InterfaceC0652b.f2509v, f6069a + "$OFB");
            configurableProvider.mo2855a("Cipher", InterfaceC0652b.f2456D, f6069a + "$OFB");
            configurableProvider.mo2855a("Cipher", InterfaceC0652b.f2464L, f6069a + "$OFB");
            configurableProvider.mo2855a("Cipher", InterfaceC0652b.f2510w, f6069a + "$CFB");
            configurableProvider.mo2855a("Cipher", InterfaceC0652b.f2457E, f6069a + "$CFB");
            configurableProvider.mo2855a("Cipher", InterfaceC0652b.f2465M, f6069a + "$CFB");
            configurableProvider.mo2854a("Cipher.AESWRAP", AES.f6064a);
            configurableProvider.mo2853a("Cipher.AESWRAP", f6069a + "$Wrap");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0652b.f2511x, "AESWRAP");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0652b.f2458F, "AESWRAP");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0652b.f2466N, "AESWRAP");
            configurableProvider.mo2853a("Alg.Alias.Cipher.AESKW", "AESWRAP");
            configurableProvider.mo2854a("Cipher.AESWRAPPAD", AES.f6064a);
            configurableProvider.mo2853a("Cipher.AESWRAPPAD", f6069a + "$WrapPad");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0652b.f2453A, "AESWRAPPAD");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0652b.f2461I, "AESWRAPPAD");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0652b.f2469Q, "AESWRAPPAD");
            configurableProvider.mo2853a("Alg.Alias.Cipher.AESKWP", "AESWRAPPAD");
            configurableProvider.mo2853a("Cipher.AESRFC3211WRAP", f6069a + "$RFC3211Wrap");
            configurableProvider.mo2853a("Cipher.AESRFC5649WRAP", f6069a + "$RFC5649Wrap");
            configurableProvider.mo2853a("AlgorithmParameterGenerator.CCM", f6069a + "$AlgParamGenCCM");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator." + InterfaceC0652b.f2513z, "CCM");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator." + InterfaceC0652b.f2460H, "CCM");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator." + InterfaceC0652b.f2468P, "CCM");
            configurableProvider.mo2854a("Cipher.CCM", AES.f6064a);
            configurableProvider.mo2853a("Cipher.CCM", f6069a + "$CCM");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0652b.f2513z, "CCM");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0652b.f2460H, "CCM");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0652b.f2468P, "CCM");
            configurableProvider.mo2853a("AlgorithmParameterGenerator.GCM", f6069a + "$AlgParamGenGCM");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator." + InterfaceC0652b.f2512y, "GCM");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator." + InterfaceC0652b.f2459G, "GCM");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator." + InterfaceC0652b.f2467O, "GCM");
            configurableProvider.mo2854a("Cipher.GCM", AES.f6064a);
            configurableProvider.mo2853a("Cipher.GCM", f6069a + "$GCM");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0652b.f2512y, "GCM");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0652b.f2459G, "GCM");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0652b.f2467O, "GCM");
            configurableProvider.mo2853a("KeyGenerator.AES", f6069a + "$KeyGen");
            configurableProvider.mo2853a("KeyGenerator.2.16.840.1.101.3.4.2", f6069a + "$KeyGen128");
            configurableProvider.mo2853a("KeyGenerator.2.16.840.1.101.3.4.22", f6069a + "$KeyGen192");
            configurableProvider.mo2853a("KeyGenerator.2.16.840.1.101.3.4.42", f6069a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2507t, f6069a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2508u, f6069a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2509v, f6069a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2510w, f6069a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2454B, f6069a + "$KeyGen192");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2455C, f6069a + "$KeyGen192");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2456D, f6069a + "$KeyGen192");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2457E, f6069a + "$KeyGen192");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2462J, f6069a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2463K, f6069a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2464L, f6069a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2465M, f6069a + "$KeyGen256");
            configurableProvider.mo2853a("KeyGenerator.AESWRAP", f6069a + "$KeyGen");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2511x, f6069a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2458F, f6069a + "$KeyGen192");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2466N, f6069a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2512y, f6069a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2459G, f6069a + "$KeyGen192");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2467O, f6069a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2513z, f6069a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2460H, f6069a + "$KeyGen192");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2468P, f6069a + "$KeyGen256");
            configurableProvider.mo2853a("KeyGenerator.AESWRAPPAD", f6069a + "$KeyGen");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2453A, f6069a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2461I, f6069a + "$KeyGen192");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0652b.f2469Q, f6069a + "$KeyGen256");
            configurableProvider.mo2853a("Mac.AESCMAC", f6069a + "$AESCMAC");
            configurableProvider.mo2853a("Mac.AESCCMMAC", f6069a + "$AESCCMMAC");
            configurableProvider.mo2853a("Alg.Alias.Mac." + InterfaceC0652b.f2513z.m1593b(), "AESCCMMAC");
            configurableProvider.mo2853a("Alg.Alias.Mac." + InterfaceC0652b.f2460H.m1593b(), "AESCCMMAC");
            configurableProvider.mo2853a("Alg.Alias.Mac." + InterfaceC0652b.f2468P.m1593b(), "AESCCMMAC");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0565a.f2064l, "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0565a.f2065m, "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0565a.f2066n, "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0565a.f2067o, "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0565a.f2068p, "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0565a.f2069q, "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.mo2853a("Cipher.PBEWITHSHAAND128BITAES-CBC-BC", f6069a + "$PBEWithSHA1AESCBC128");
            configurableProvider.mo2853a("Cipher.PBEWITHSHAAND192BITAES-CBC-BC", f6069a + "$PBEWithSHA1AESCBC192");
            configurableProvider.mo2853a("Cipher.PBEWITHSHAAND256BITAES-CBC-BC", f6069a + "$PBEWithSHA1AESCBC256");
            configurableProvider.mo2853a("Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", f6069a + "$PBEWithSHA256AESCBC128");
            configurableProvider.mo2853a("Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", f6069a + "$PBEWithSHA256AESCBC192");
            configurableProvider.mo2853a("Cipher.PBEWITHSHA256AND256BITAES-CBC-BC", f6069a + "$PBEWithSHA256AESCBC256");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHAAND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHAAND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHAAND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.mo2853a("Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL", f6069a + "$PBEWithAESCBC");
            configurableProvider.mo2853a("Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL", f6069a + "$PBEWithAESCBC");
            configurableProvider.mo2853a("Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL", f6069a + "$PBEWithAESCBC");
            configurableProvider.mo2853a("SecretKeyFactory.AES", f6069a + "$KeyFactory");
            configurableProvider.mo2855a("SecretKeyFactory", InterfaceC0652b.f2506s, f6069a + "$KeyFactory");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL", f6069a + "$PBEWithMD5And128BitAESCBCOpenSSL");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL", f6069a + "$PBEWithMD5And192BitAESCBCOpenSSL");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL", f6069a + "$PBEWithMD5And256BitAESCBCOpenSSL");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC", f6069a + "$PBEWithSHAAnd128BitAESBC");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC", f6069a + "$PBEWithSHAAnd192BitAESBC");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC", f6069a + "$PBEWithSHAAnd256BitAESBC");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC", f6069a + "$PBEWithSHA256And128BitAESBC");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC", f6069a + "$PBEWithSHA256And192BitAESBC");
            configurableProvider.mo2853a("SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC", f6069a + "$PBEWithSHA256And256BitAESBC");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.mo2855a("Alg.Alias.SecretKeyFactory", InterfaceC0565a.f2064l, "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.mo2855a("Alg.Alias.SecretKeyFactory", InterfaceC0565a.f2065m, "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.mo2855a("Alg.Alias.SecretKeyFactory", InterfaceC0565a.f2066n, "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.mo2855a("Alg.Alias.SecretKeyFactory", InterfaceC0565a.f2067o, "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.mo2855a("Alg.Alias.SecretKeyFactory", InterfaceC0565a.f2068p, "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.mo2855a("Alg.Alias.SecretKeyFactory", InterfaceC0565a.f2069q, "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0565a.f2064l.m1593b(), "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0565a.f2065m.m1593b(), "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0565a.f2066n.m1593b(), "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0565a.f2067o.m1593b(), "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0565a.f2068p.m1593b(), "PKCS12PBE");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0565a.f2069q.m1593b(), "PKCS12PBE");
            m4443b(configurableProvider, "AES", f6069a + "$AESGMAC", f6069a + "$KeyGen128");
            m4444c(configurableProvider, "AES", f6069a + "$Poly1305", f6069a + "$Poly1305KeyGen");
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new C0950f(new C1034s(new C0891a(), 128)), 128);
        }
    }

    public static class PBEWithAESCBC extends BaseBlockCipher {
        public PBEWithAESCBC() {
            super(new C1010b(new C0891a()));
        }
    }

    public static class PBEWithMD5And128BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And128BitAESCBCOpenSSL() {
            super("PBEWithMD5And128BitAES-CBC-OpenSSL", null, true, 3, 0, 128, 128);
        }
    }

    public static class PBEWithMD5And192BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And192BitAESCBCOpenSSL() {
            super("PBEWithMD5And192BitAES-CBC-OpenSSL", null, true, 3, 0, 192, 128);
        }
    }

    public static class PBEWithMD5And256BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And256BitAESCBCOpenSSL() {
            super("PBEWithMD5And256BitAES-CBC-OpenSSL", null, true, 3, 0, 256, 128);
        }
    }

    public static class PBEWithSHA1AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC128() {
            super(new C1010b(new C0891a()), 2, 1, 128, 16);
        }
    }

    public static class PBEWithSHA1AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC192() {
            super(new C1010b(new C0891a()), 2, 1, 192, 16);
        }
    }

    public static class PBEWithSHA1AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC256() {
            super(new C1010b(new C0891a()), 2, 1, 256, 16);
        }
    }

    public static class PBEWithSHA256AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC128() {
            super(new C1010b(new C0891a()), 2, 4, 128, 16);
        }
    }

    public static class PBEWithSHA256AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC192() {
            super(new C1010b(new C0891a()), 2, 4, 192, 16);
        }
    }

    public static class PBEWithSHA256AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC256() {
            super(new C1010b(new C0891a()), 2, 4, 256, 16);
        }
    }

    public static class PBEWithSHA256And128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And128BitAESBC() {
            super("PBEWithSHA256And128BitAES-CBC-BC", null, true, 2, 4, 128, 128);
        }
    }

    public static class PBEWithSHA256And192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And192BitAESBC() {
            super("PBEWithSHA256And192BitAES-CBC-BC", null, true, 2, 4, 192, 128);
        }
    }

    public static class PBEWithSHA256And256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And256BitAESBC() {
            super("PBEWithSHA256And256BitAES-CBC-BC", null, true, 2, 4, 256, 128);
        }
    }

    public static class PBEWithSHAAnd128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd128BitAESBC() {
            super("PBEWithSHA1And128BitAES-CBC-BC", null, true, 2, 1, 128, 128);
        }
    }

    public static class PBEWithSHAAnd192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd192BitAESBC() {
            super("PBEWithSHA1And192BitAES-CBC-BC", null, true, 2, 1, 192, 128);
        }
    }

    public static class PBEWithSHAAnd256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd256BitAESBC() {
            super("PBEWithSHA1And256BitAES-CBC-BC", null, true, 2, 1, 256, 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new C0999l(new C0891a()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-AES", 256, new C0978y());
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new C0902ak(new C0891a()), 16);
        }
    }

    public static class RFC5649Wrap extends BaseWrapCipher {
        public RFC5649Wrap() {
            super(new C0904am(new C0891a()));
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new C0918b());
        }
    }

    public static class WrapPad extends BaseWrapCipher {
        public WrapPad() {
            super(new C0926c());
        }
    }

    static {
        HashMap map = new HashMap();
        f6064a = map;
        map.put("SupportedKeyClasses", "javax.crypto.SecretKey");
        f6064a.put("SupportedKeyFormats", "RAW");
    }

    private AES() {
    }

    public static class AlgParamsCCM extends BaseAlgorithmParameters {

        /* JADX INFO: renamed from: a */
        private C0614a f6067a;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        /* JADX INFO: renamed from: a */
        protected final AlgorithmParameterSpec mo4277a(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.m4438a(cls)) {
                return GcmSpecUtil.m4437a() ? GcmSpecUtil.m4436a(this.f6067a.mo1358i()) : new AEADParameterSpec(this.f6067a.m1497a(), this.f6067a.m1498b() * 8);
            }
            if (cls == AEADParameterSpec.class) {
                return new AEADParameterSpec(this.f6067a.m1497a(), this.f6067a.m1498b() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f6067a.m1497a());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            return this.f6067a.mo1578k();
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) throws IOException {
            if (m4449a(str)) {
                return this.f6067a.mo1578k();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) {
            this.f6067a = C0614a.m1496a(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) throws IOException {
            if (!m4449a(str)) {
                throw new IOException("unknown format specified");
            }
            this.f6067a = C0614a.m1496a(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "CCM";
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (GcmSpecUtil.m4439a(algorithmParameterSpec)) {
                this.f6067a = C0614a.m1496a(GcmSpecUtil.m4440b(algorithmParameterSpec));
            } else {
                if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                    throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
                }
                this.f6067a = new C0614a(((AEADParameterSpec) algorithmParameterSpec).getIV(), ((AEADParameterSpec) algorithmParameterSpec).m4482a() / 8);
            }
        }
    }

    public static class AlgParamsGCM extends BaseAlgorithmParameters {

        /* JADX INFO: renamed from: a */
        private C0615b f6068a;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        /* JADX INFO: renamed from: a */
        protected final AlgorithmParameterSpec mo4277a(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.m4438a(cls)) {
                return GcmSpecUtil.m4437a() ? GcmSpecUtil.m4436a(this.f6068a.mo1358i()) : new AEADParameterSpec(this.f6068a.m1500a(), this.f6068a.m1501b() * 8);
            }
            if (cls == AEADParameterSpec.class) {
                return new AEADParameterSpec(this.f6068a.m1500a(), this.f6068a.m1501b() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f6068a.m1500a());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            return this.f6068a.mo1578k();
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) throws IOException {
            if (m4449a(str)) {
                return this.f6068a.mo1578k();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) {
            this.f6068a = C0615b.m1499a(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) throws IOException {
            if (!m4449a(str)) {
                throw new IOException("unknown format specified");
            }
            this.f6068a = C0615b.m1499a(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "GCM";
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (GcmSpecUtil.m4439a(algorithmParameterSpec)) {
                this.f6068a = GcmSpecUtil.m4440b(algorithmParameterSpec);
            } else {
                if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                    throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
                }
                this.f6068a = new C0615b(((AEADParameterSpec) algorithmParameterSpec).getIV(), ((AEADParameterSpec) algorithmParameterSpec).m4482a() / 8);
            }
        }
    }
}
