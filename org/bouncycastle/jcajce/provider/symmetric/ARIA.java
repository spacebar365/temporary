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
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import org.bouncycastle.p054a.p059d.C0614a;
import org.bouncycastle.p054a.p059d.C0615b;
import org.bouncycastle.p054a.p071p.InterfaceC0654a;
import org.bouncycastle.p083b.C0950f;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.p089e.C0902ak;
import org.bouncycastle.p083b.p089e.C0927d;
import org.bouncycastle.p083b.p089e.C0928e;
import org.bouncycastle.p083b.p089e.C0929f;
import org.bouncycastle.p083b.p090f.C0978y;
import org.bouncycastle.p083b.p092h.C0992e;
import org.bouncycastle.p083b.p092h.C0999l;
import org.bouncycastle.p083b.p093i.C1010b;
import org.bouncycastle.p083b.p093i.C1019d;
import org.bouncycastle.p083b.p093i.C1027l;
import org.bouncycastle.p083b.p093i.C1034s;

/* JADX INFO: loaded from: classes.dex */
public final class ARIA {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.f6157c == null) {
                this.f6157c = C1124l.m2709a();
            }
            this.f6157c.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersA = m4448a("ARIA");
                algorithmParametersA.init(new IvParameterSpec(bArr));
                return algorithmParametersA;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for ARIA parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "ARIA IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new C1010b(new C0927d()), 128);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new C0950f(new C1019d(new C0927d(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.ARIA.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                /* JADX INFO: renamed from: a */
                public final InterfaceC0890e mo4430a() {
                    return new C0927d();
                }
            });
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new C0992e(new C1027l(new C0927d())));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("ARIA", null);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i) {
            super("ARIA", i, new C0987h());
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
        private static final String f6073a = ARIA.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("AlgorithmParameters.ARIA", f6073a + "$AlgParams");
            configurableProvider.mo2855a("Alg.Alias.AlgorithmParameters", InterfaceC0654a.f2539h, "ARIA");
            configurableProvider.mo2855a("Alg.Alias.AlgorithmParameters", InterfaceC0654a.f2544m, "ARIA");
            configurableProvider.mo2855a("Alg.Alias.AlgorithmParameters", InterfaceC0654a.f2549r, "ARIA");
            configurableProvider.mo2853a("AlgorithmParameterGenerator.ARIA", f6073a + "$AlgParamGen");
            configurableProvider.mo2855a("Alg.Alias.AlgorithmParameterGenerator", InterfaceC0654a.f2539h, "ARIA");
            configurableProvider.mo2855a("Alg.Alias.AlgorithmParameterGenerator", InterfaceC0654a.f2544m, "ARIA");
            configurableProvider.mo2855a("Alg.Alias.AlgorithmParameterGenerator", InterfaceC0654a.f2549r, "ARIA");
            configurableProvider.mo2855a("Alg.Alias.AlgorithmParameterGenerator", InterfaceC0654a.f2541j, "ARIA");
            configurableProvider.mo2855a("Alg.Alias.AlgorithmParameterGenerator", InterfaceC0654a.f2546o, "ARIA");
            configurableProvider.mo2855a("Alg.Alias.AlgorithmParameterGenerator", InterfaceC0654a.f2551t, "ARIA");
            configurableProvider.mo2855a("Alg.Alias.AlgorithmParameterGenerator", InterfaceC0654a.f2540i, "ARIA");
            configurableProvider.mo2855a("Alg.Alias.AlgorithmParameterGenerator", InterfaceC0654a.f2545n, "ARIA");
            configurableProvider.mo2855a("Alg.Alias.AlgorithmParameterGenerator", InterfaceC0654a.f2550s, "ARIA");
            configurableProvider.mo2853a("Cipher.ARIA", f6073a + "$ECB");
            configurableProvider.mo2855a("Cipher", InterfaceC0654a.f2538g, f6073a + "$ECB");
            configurableProvider.mo2855a("Cipher", InterfaceC0654a.f2543l, f6073a + "$ECB");
            configurableProvider.mo2855a("Cipher", InterfaceC0654a.f2548q, f6073a + "$ECB");
            configurableProvider.mo2855a("Cipher", InterfaceC0654a.f2539h, f6073a + "$CBC");
            configurableProvider.mo2855a("Cipher", InterfaceC0654a.f2544m, f6073a + "$CBC");
            configurableProvider.mo2855a("Cipher", InterfaceC0654a.f2549r, f6073a + "$CBC");
            configurableProvider.mo2855a("Cipher", InterfaceC0654a.f2540i, f6073a + "$CFB");
            configurableProvider.mo2855a("Cipher", InterfaceC0654a.f2545n, f6073a + "$CFB");
            configurableProvider.mo2855a("Cipher", InterfaceC0654a.f2550s, f6073a + "$CFB");
            configurableProvider.mo2855a("Cipher", InterfaceC0654a.f2541j, f6073a + "$OFB");
            configurableProvider.mo2855a("Cipher", InterfaceC0654a.f2546o, f6073a + "$OFB");
            configurableProvider.mo2855a("Cipher", InterfaceC0654a.f2551t, f6073a + "$OFB");
            configurableProvider.mo2853a("Cipher.ARIARFC3211WRAP", f6073a + "$RFC3211Wrap");
            configurableProvider.mo2853a("Cipher.ARIAWRAP", f6073a + "$Wrap");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0654a.f2526H, "ARIAWRAP");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0654a.f2527I, "ARIAWRAP");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0654a.f2528J, "ARIAWRAP");
            configurableProvider.mo2853a("Alg.Alias.Cipher.ARIAKW", "ARIAWRAP");
            configurableProvider.mo2853a("Cipher.ARIAWRAPPAD", f6073a + "$WrapPad");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0654a.f2529K, "ARIAWRAPPAD");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0654a.f2530L, "ARIAWRAPPAD");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0654a.f2531M, "ARIAWRAPPAD");
            configurableProvider.mo2853a("Alg.Alias.Cipher.ARIAKWP", "ARIAWRAPPAD");
            configurableProvider.mo2853a("KeyGenerator.ARIA", f6073a + "$KeyGen");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2526H, f6073a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2527I, f6073a + "$KeyGen192");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2528J, f6073a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2529K, f6073a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2530L, f6073a + "$KeyGen192");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2531M, f6073a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2538g, f6073a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2543l, f6073a + "$KeyGen192");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2548q, f6073a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2539h, f6073a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2544m, f6073a + "$KeyGen192");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2549r, f6073a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2540i, f6073a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2545n, f6073a + "$KeyGen192");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2550s, f6073a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2541j, f6073a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2546o, f6073a + "$KeyGen192");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2551t, f6073a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2523E, f6073a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2524F, f6073a + "$KeyGen192");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2525G, f6073a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2520B, f6073a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2521C, f6073a + "$KeyGen192");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0654a.f2522D, f6073a + "$KeyGen256");
            configurableProvider.mo2853a("SecretKeyFactory.ARIA", f6073a + "$KeyFactory");
            configurableProvider.mo2855a("Alg.Alias.SecretKeyFactory", InterfaceC0654a.f2539h, "ARIA");
            configurableProvider.mo2855a("Alg.Alias.SecretKeyFactory", InterfaceC0654a.f2544m, "ARIA");
            configurableProvider.mo2855a("Alg.Alias.SecretKeyFactory", InterfaceC0654a.f2549r, "ARIA");
            configurableProvider.mo2853a("AlgorithmParameterGenerator.ARIACCM", f6073a + "$AlgParamGenCCM");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator." + InterfaceC0654a.f2523E, "CCM");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator." + InterfaceC0654a.f2524F, "CCM");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator." + InterfaceC0654a.f2525G, "CCM");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0654a.f2523E, "CCM");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0654a.f2524F, "CCM");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0654a.f2525G, "CCM");
            configurableProvider.mo2853a("AlgorithmParameterGenerator.ARIAGCM", f6073a + "$AlgParamGenGCM");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator." + InterfaceC0654a.f2520B, "GCM");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator." + InterfaceC0654a.f2521C, "GCM");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator." + InterfaceC0654a.f2522D, "GCM");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0654a.f2520B, "GCM");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0654a.f2521C, "GCM");
            configurableProvider.mo2855a("Alg.Alias.Cipher", InterfaceC0654a.f2522D, "GCM");
            m4443b(configurableProvider, "ARIA", f6073a + "$GMAC", f6073a + "$KeyGen");
            m4444c(configurableProvider, "ARIA", f6073a + "$Poly1305", f6073a + "$Poly1305KeyGen");
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new C0950f(new C1034s(new C0927d(), 128)), 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new C0999l(new C0927d()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-ARIA", 256, new C0978y());
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new C0902ak(new C0927d()), 16);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new C0928e());
        }
    }

    public static class WrapPad extends BaseWrapCipher {
        public WrapPad() {
            super(new C0929f());
        }
    }

    private ARIA() {
    }

    public static class AlgParamsCCM extends BaseAlgorithmParameters {

        /* JADX INFO: renamed from: a */
        private C0614a f6071a;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        /* JADX INFO: renamed from: a */
        protected final AlgorithmParameterSpec mo4277a(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.m4438a(cls)) {
                return GcmSpecUtil.m4437a() ? GcmSpecUtil.m4436a(this.f6071a.mo1358i()) : new AEADParameterSpec(this.f6071a.m1497a(), this.f6071a.m1498b() * 8);
            }
            if (cls == AEADParameterSpec.class) {
                return new AEADParameterSpec(this.f6071a.m1497a(), this.f6071a.m1498b() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f6071a.m1497a());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            return this.f6071a.mo1578k();
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) throws IOException {
            if (m4449a(str)) {
                return this.f6071a.mo1578k();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) {
            this.f6071a = C0614a.m1496a(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) throws IOException {
            if (!m4449a(str)) {
                throw new IOException("unknown format specified");
            }
            this.f6071a = C0614a.m1496a(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "CCM";
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (GcmSpecUtil.m4439a(algorithmParameterSpec)) {
                this.f6071a = C0614a.m1496a(GcmSpecUtil.m4440b(algorithmParameterSpec));
            } else {
                if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                    throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
                }
                this.f6071a = new C0614a(((AEADParameterSpec) algorithmParameterSpec).getIV(), ((AEADParameterSpec) algorithmParameterSpec).m4482a() / 8);
            }
        }
    }

    public static class AlgParamsGCM extends BaseAlgorithmParameters {

        /* JADX INFO: renamed from: a */
        private C0615b f6072a;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        /* JADX INFO: renamed from: a */
        protected final AlgorithmParameterSpec mo4277a(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.m4438a(cls)) {
                return GcmSpecUtil.m4437a() ? GcmSpecUtil.m4436a(this.f6072a.mo1358i()) : new AEADParameterSpec(this.f6072a.m1500a(), this.f6072a.m1501b() * 8);
            }
            if (cls == AEADParameterSpec.class) {
                return new AEADParameterSpec(this.f6072a.m1500a(), this.f6072a.m1501b() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f6072a.m1500a());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            return this.f6072a.mo1578k();
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) throws IOException {
            if (m4449a(str)) {
                return this.f6072a.mo1578k();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) {
            this.f6072a = C0615b.m1499a(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) throws IOException {
            if (!m4449a(str)) {
                throw new IOException("unknown format specified");
            }
            this.f6072a = C0615b.m1499a(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "GCM";
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (GcmSpecUtil.m4439a(algorithmParameterSpec)) {
                this.f6072a = GcmSpecUtil.m4440b(algorithmParameterSpec);
            } else {
                if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                    throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
                }
                this.f6072a = new C0615b(((AEADParameterSpec) algorithmParameterSpec).getIV(), ((AEADParameterSpec) algorithmParameterSpec).m4482a() / 8);
            }
        }
    }
}
