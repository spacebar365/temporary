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
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.p054a.p078w.InterfaceC0746f;
import org.bouncycastle.p083b.C0950f;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p083b.p089e.C0941r;
import org.bouncycastle.p083b.p089e.C0942s;
import org.bouncycastle.p083b.p092h.C0996i;
import org.bouncycastle.p083b.p093i.C1010b;
import org.bouncycastle.p083b.p093i.C1019d;
import org.bouncycastle.p083b.p093i.C1030o;
import org.bouncycastle.p083b.p093i.C1031p;
import org.bouncycastle.p083b.p093i.C1032q;
import org.bouncycastle.p083b.p093i.C1034s;

/* JADX INFO: loaded from: classes.dex */
public class DSTU7624 {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {

        /* JADX INFO: renamed from: a */
        private final int f6089a;

        public AlgParamGen(int i) {
            this.f6089a = i / 8;
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[this.f6089a];
            if (this.f6157c == null) {
                this.f6157c = C1124l.m2709a();
            }
            this.f6157c.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersA = m4448a("DSTU7624");
                algorithmParametersA.init(new IvParameterSpec(bArr));
                return algorithmParametersA;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSTU7624 parameter generation.");
        }
    }

    public static class AlgParamGen128 extends AlgParamGen {
        AlgParamGen128() {
            super(128);
        }
    }

    public static class AlgParamGen256 extends AlgParamGen {
        AlgParamGen256() {
            super(256);
        }
    }

    public static class AlgParamGen512 extends AlgParamGen {
        AlgParamGen512() {
            super(512);
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "DSTU7624 IV";
        }
    }

    public static class CBC128 extends BaseBlockCipher {
        public CBC128() {
            super(new C1010b(new C0941r(128)), 128);
        }
    }

    public static class CBC256 extends BaseBlockCipher {
        public CBC256() {
            super(new C1010b(new C0941r(256)), 256);
        }
    }

    public static class CBC512 extends BaseBlockCipher {
        public CBC512() {
            super(new C1010b(new C0941r(512)), 512);
        }
    }

    public static class CCM128 extends BaseBlockCipher {
        public CCM128() {
            super(new C1030o(new C0941r(128)));
        }
    }

    public static class CCM256 extends BaseBlockCipher {
        public CCM256() {
            super(new C1030o(new C0941r(256)));
        }
    }

    public static class CCM512 extends BaseBlockCipher {
        public CCM512() {
            super(new C1030o(new C0941r(512)));
        }
    }

    public static class CFB128 extends BaseBlockCipher {
        public CFB128() {
            super(new C0950f(new C1019d(new C0941r(128), 128)), 128);
        }
    }

    public static class CFB256 extends BaseBlockCipher {
        public CFB256() {
            super(new C0950f(new C1019d(new C0941r(256), 256)), 256);
        }
    }

    public static class CFB512 extends BaseBlockCipher {
        public CFB512() {
            super(new C0950f(new C1019d(new C0941r(512), 512)), 512);
        }
    }

    public static class CTR128 extends BaseBlockCipher {
        public CTR128() {
            super(new C0950f(new C1031p(new C0941r(128))), 128);
        }
    }

    public static class CTR256 extends BaseBlockCipher {
        public CTR256() {
            super(new C0950f(new C1031p(new C0941r(256))), 256);
        }
    }

    public static class CTR512 extends BaseBlockCipher {
        public CTR512() {
            super(new C0950f(new C1031p(new C0941r(512))), 512);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.DSTU7624.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                /* JADX INFO: renamed from: a */
                public final InterfaceC0890e mo4430a() {
                    return new C0941r(128);
                }
            });
        }
    }

    public static class ECB128 extends BaseBlockCipher {
        public ECB128() {
            super(new C0941r(128));
        }
    }

    public static class ECB256 extends BaseBlockCipher {
        public ECB256() {
            super(new C0941r(256));
        }
    }

    public static class ECB512 extends BaseBlockCipher {
        public ECB512() {
            super(new C0941r(512));
        }
    }

    public static class ECB_128 extends BaseBlockCipher {
        public ECB_128() {
            super(new C0941r(128));
        }
    }

    public static class ECB_256 extends BaseBlockCipher {
        public ECB_256() {
            super(new C0941r(256));
        }
    }

    public static class ECB_512 extends BaseBlockCipher {
        public ECB_512() {
            super(new C0941r(512));
        }
    }

    public static class GCM128 extends BaseBlockCipher {
        public GCM128() {
            super(new C1032q(new C0941r(128)));
        }
    }

    public static class GCM256 extends BaseBlockCipher {
        public GCM256() {
            super(new C1032q(new C0941r(256)));
        }
    }

    public static class GCM512 extends BaseBlockCipher {
        public GCM512() {
            super(new C1032q(new C0941r(512)));
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new C0996i(new C1032q(new C0941r(128)), 128));
        }
    }

    public static class GMAC128 extends BaseMac {
        public GMAC128() {
            super(new C0996i(new C1032q(new C0941r(128)), 128));
        }
    }

    public static class GMAC256 extends BaseMac {
        public GMAC256() {
            super(new C0996i(new C1032q(new C0941r(256)), 256));
        }
    }

    public static class GMAC512 extends BaseMac {
        public GMAC512() {
            super(new C0996i(new C1032q(new C0941r(512)), 512));
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i) {
            super("DSTU7624", i, new C0987h());
        }
    }

    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public static class KeyGen512 extends KeyGen {
        public KeyGen512() {
            super(512);
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6090a = DSTU7624.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("AlgorithmParameters.DSTU7624", f6090a + "$AlgParams128");
            configurableProvider.mo2855a("AlgorithmParameters", InterfaceC0746f.f3008v, f6090a + "$AlgParams");
            configurableProvider.mo2855a("AlgorithmParameters", InterfaceC0746f.f3009w, f6090a + "$AlgParams");
            configurableProvider.mo2855a("AlgorithmParameters", InterfaceC0746f.f3010x, f6090a + "$AlgParams");
            configurableProvider.mo2853a("AlgorithmParameterGenerator.DSTU7624", f6090a + "$AlgParamGen128");
            configurableProvider.mo2855a("AlgorithmParameterGenerator", InterfaceC0746f.f3008v, f6090a + "$AlgParamGen128");
            configurableProvider.mo2855a("AlgorithmParameterGenerator", InterfaceC0746f.f3009w, f6090a + "$AlgParamGen256");
            configurableProvider.mo2855a("AlgorithmParameterGenerator", InterfaceC0746f.f3010x, f6090a + "$AlgParamGen512");
            configurableProvider.mo2853a("Cipher.DSTU7624", f6090a + "$ECB_128");
            configurableProvider.mo2853a("Cipher.DSTU7624-128", f6090a + "$ECB_128");
            configurableProvider.mo2853a("Cipher.DSTU7624-256", f6090a + "$ECB_256");
            configurableProvider.mo2853a("Cipher.DSTU7624-512", f6090a + "$ECB_512");
            configurableProvider.mo2855a("Cipher", InterfaceC0746f.f2996j, f6090a + "$ECB128");
            configurableProvider.mo2855a("Cipher", InterfaceC0746f.f2997k, f6090a + "$ECB256");
            configurableProvider.mo2855a("Cipher", InterfaceC0746f.f2998l, f6090a + "$ECB512");
            configurableProvider.mo2855a("Cipher", InterfaceC0746f.f3008v, f6090a + "$CBC128");
            configurableProvider.mo2855a("Cipher", InterfaceC0746f.f3009w, f6090a + "$CBC256");
            configurableProvider.mo2855a("Cipher", InterfaceC0746f.f3010x, f6090a + "$CBC512");
            configurableProvider.mo2855a("Cipher", InterfaceC0746f.f3011y, f6090a + "$OFB128");
            configurableProvider.mo2855a("Cipher", InterfaceC0746f.f3012z, f6090a + "$OFB256");
            configurableProvider.mo2855a("Cipher", InterfaceC0746f.f2974A, f6090a + "$OFB512");
            configurableProvider.mo2855a("Cipher", InterfaceC0746f.f3002p, f6090a + "$CFB128");
            configurableProvider.mo2855a("Cipher", InterfaceC0746f.f3003q, f6090a + "$CFB256");
            configurableProvider.mo2855a("Cipher", InterfaceC0746f.f3004r, f6090a + "$CFB512");
            configurableProvider.mo2855a("Cipher", InterfaceC0746f.f2999m, f6090a + "$CTR128");
            configurableProvider.mo2855a("Cipher", InterfaceC0746f.f3000n, f6090a + "$CTR256");
            configurableProvider.mo2855a("Cipher", InterfaceC0746f.f3001o, f6090a + "$CTR512");
            configurableProvider.mo2855a("Cipher", InterfaceC0746f.f2978E, f6090a + "$CCM128");
            configurableProvider.mo2855a("Cipher", InterfaceC0746f.f2979F, f6090a + "$CCM256");
            configurableProvider.mo2855a("Cipher", InterfaceC0746f.f2980G, f6090a + "$CCM512");
            configurableProvider.mo2853a("Cipher.DSTU7624KW", f6090a + "$Wrap");
            configurableProvider.mo2853a("Alg.Alias.Cipher.DSTU7624WRAP", "DSTU7624KW");
            configurableProvider.mo2853a("Cipher.DSTU7624-128KW", f6090a + "$Wrap128");
            configurableProvider.mo2853a("Alg.Alias.Cipher." + InterfaceC0746f.f2984K.m1593b(), "DSTU7624-128KW");
            configurableProvider.mo2853a("Alg.Alias.Cipher.DSTU7624-128WRAP", "DSTU7624-128KW");
            configurableProvider.mo2853a("Cipher.DSTU7624-256KW", f6090a + "$Wrap256");
            configurableProvider.mo2853a("Alg.Alias.Cipher." + InterfaceC0746f.f2985L.m1593b(), "DSTU7624-256KW");
            configurableProvider.mo2853a("Alg.Alias.Cipher.DSTU7624-256WRAP", "DSTU7624-256KW");
            configurableProvider.mo2853a("Cipher.DSTU7624-512KW", f6090a + "$Wrap512");
            configurableProvider.mo2853a("Alg.Alias.Cipher." + InterfaceC0746f.f2986M.m1593b(), "DSTU7624-512KW");
            configurableProvider.mo2853a("Alg.Alias.Cipher.DSTU7624-512WRAP", "DSTU7624-512KW");
            configurableProvider.mo2853a("Mac.DSTU7624GMAC", f6090a + "$GMAC");
            configurableProvider.mo2853a("Mac.DSTU7624-128GMAC", f6090a + "$GMAC128");
            configurableProvider.mo2853a("Alg.Alias.Mac." + InterfaceC0746f.f2975B.m1593b(), "DSTU7624-128GMAC");
            configurableProvider.mo2853a("Mac.DSTU7624-256GMAC", f6090a + "$GMAC256");
            configurableProvider.mo2853a("Alg.Alias.Mac." + InterfaceC0746f.f2976C.m1593b(), "DSTU7624-256GMAC");
            configurableProvider.mo2853a("Mac.DSTU7624-512GMAC", f6090a + "$GMAC512");
            configurableProvider.mo2853a("Alg.Alias.Mac." + InterfaceC0746f.f2977D.m1593b(), "DSTU7624-512GMAC");
            configurableProvider.mo2853a("KeyGenerator.DSTU7624", f6090a + "$KeyGen");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f2984K, f6090a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f2985L, f6090a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f2986M, f6090a + "$KeyGen512");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f2996j, f6090a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f2997k, f6090a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f2998l, f6090a + "$KeyGen512");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f3008v, f6090a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f3009w, f6090a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f3010x, f6090a + "$KeyGen512");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f3011y, f6090a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f3012z, f6090a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f2974A, f6090a + "$KeyGen512");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f3002p, f6090a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f3003q, f6090a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f3004r, f6090a + "$KeyGen512");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f2999m, f6090a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f3000n, f6090a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f3001o, f6090a + "$KeyGen512");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f2978E, f6090a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f2979F, f6090a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f2980G, f6090a + "$KeyGen512");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f2975B, f6090a + "$KeyGen128");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f2976C, f6090a + "$KeyGen256");
            configurableProvider.mo2855a("KeyGenerator", InterfaceC0746f.f2977D, f6090a + "$KeyGen512");
        }
    }

    public static class OFB128 extends BaseBlockCipher {
        public OFB128() {
            super(new C0950f(new C1034s(new C0941r(128), 128)), 128);
        }
    }

    public static class OFB256 extends BaseBlockCipher {
        public OFB256() {
            super(new C0950f(new C1034s(new C0941r(256), 256)), 256);
        }
    }

    public static class OFB512 extends BaseBlockCipher {
        public OFB512() {
            super(new C0950f(new C1034s(new C0941r(512), 512)), 512);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new C0942s(128));
        }
    }

    public static class Wrap128 extends BaseWrapCipher {
        public Wrap128() {
            super(new C0942s(128));
        }
    }

    public static class Wrap256 extends BaseWrapCipher {
        public Wrap256() {
            super(new C0942s(256));
        }
    }

    public static class Wrap512 extends BaseWrapCipher {
        public Wrap512() {
            super(new C0942s(512));
        }
    }

    private DSTU7624() {
    }
}
