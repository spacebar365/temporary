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
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p061f.C0621c;
import org.bouncycastle.p054a.p061f.InterfaceC0619a;
import org.bouncycastle.p054a.p075t.InterfaceC0685a;
import org.bouncycastle.p083b.C0950f;
import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.p089e.C0937n;
import org.bouncycastle.p083b.p089e.C0944u;
import org.bouncycastle.p083b.p089e.C0945v;
import org.bouncycastle.p083b.p092h.C0993f;
import org.bouncycastle.p083b.p093i.C1010b;
import org.bouncycastle.p083b.p093i.C1026k;

/* JADX INFO: loaded from: classes.dex */
public final class GOST28147 {

    /* JADX INFO: renamed from: a */
    private static Map<C0653p, String> f6091a = new HashMap();

    /* JADX INFO: renamed from: b */
    private static Map<String, C0653p> f6092b = new HashMap();

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {

        /* JADX INFO: renamed from: a */
        byte[] f6093a = new byte[8];

        /* JADX INFO: renamed from: b */
        byte[] f6094b = C0944u.m2377a("E-A");

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            if (this.f6157c == null) {
                this.f6157c = C1124l.m2709a();
            }
            this.f6157c.nextBytes(this.f6093a);
            try {
                AlgorithmParameters algorithmParametersA = m4448a("GOST28147");
                algorithmParametersA.init(new GOST28147ParameterSpec(this.f6094b, this.f6093a));
                return algorithmParametersA;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (!(algorithmParameterSpec instanceof GOST28147ParameterSpec)) {
                throw new InvalidAlgorithmParameterException("parameter spec not supported");
            }
            this.f6094b = ((GOST28147ParameterSpec) algorithmParameterSpec).m4493b();
        }
    }

    public static class AlgParams extends BaseAlgParams {

        /* JADX INFO: renamed from: a */
        private C0653p f6095a = InterfaceC0619a.f2200h;

        /* JADX INFO: renamed from: b */
        private byte[] f6096b;

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams, org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        /* JADX INFO: renamed from: a */
        protected final AlgorithmParameterSpec mo4277a(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f6096b);
            }
            if (cls == GOST28147ParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new GOST28147ParameterSpec(this.f6095a, this.f6096b);
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams
        /* JADX INFO: renamed from: a */
        protected final void mo4432a(byte[] bArr) throws IOException {
            AbstractC0686u abstractC0686uM1692b = AbstractC0686u.m1692b(bArr);
            if (abstractC0686uM1692b instanceof AbstractC0655q) {
                this.f6096b = AbstractC0655q.m1596a((Object) abstractC0686uM1692b).mo1410c();
            } else {
                if (!(abstractC0686uM1692b instanceof AbstractC0723v)) {
                    throw new IOException("Unable to recognize parameters");
                }
                C0621c c0621cM1507a = C0621c.m1507a(abstractC0686uM1692b);
                this.f6095a = c0621cM1507a.m1508a();
                this.f6096b = c0621cM1507a.m1509b();
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams
        /* JADX INFO: renamed from: a */
        protected final byte[] mo4433a() {
            return new C0621c(this.f6096b, this.f6095a).mo1578k();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams, java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.f6096b = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else {
                if (!(algorithmParameterSpec instanceof GOST28147ParameterSpec)) {
                    throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
                }
                this.f6096b = ((GOST28147ParameterSpec) algorithmParameterSpec).m4494c();
                try {
                    this.f6095a = m4435b(((GOST28147ParameterSpec) algorithmParameterSpec).m4493b());
                } catch (IllegalArgumentException e) {
                    throw new InvalidParameterSpecException(e.getMessage());
                }
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "GOST 28147 IV Parameters";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new C1010b(new C0944u()), 64);
        }
    }

    public static class CryptoProWrap extends BaseWrapCipher {
        public CryptoProWrap() {
            super(new C0937n());
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new C0944u());
        }
    }

    public static class GCFB extends BaseBlockCipher {
        public GCFB() {
            super(new C0950f(new C1026k(new C0944u())), 64);
        }
    }

    public static class GostWrap extends BaseWrapCipher {
        public GostWrap() {
            super(new C0945v());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this((byte) 0);
        }

        private KeyGen(byte b) {
            super("GOST28147", 256, new C0987h());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new C0993f());
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6099a = GOST28147.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("Cipher.GOST28147", f6099a + "$ECB");
            configurableProvider.mo2853a("Alg.Alias.Cipher.GOST", "GOST28147");
            configurableProvider.mo2853a("Alg.Alias.Cipher.GOST-28147", "GOST28147");
            configurableProvider.mo2853a("Cipher." + InterfaceC0619a.f2198f, f6099a + "$GCFB");
            configurableProvider.mo2853a("KeyGenerator.GOST28147", f6099a + "$KeyGen");
            configurableProvider.mo2853a("Alg.Alias.KeyGenerator.GOST", "GOST28147");
            configurableProvider.mo2853a("Alg.Alias.KeyGenerator.GOST-28147", "GOST28147");
            configurableProvider.mo2853a("Alg.Alias.KeyGenerator." + InterfaceC0619a.f2198f, "GOST28147");
            configurableProvider.mo2853a("AlgorithmParameters.GOST28147", f6099a + "$AlgParams");
            configurableProvider.mo2853a("AlgorithmParameterGenerator.GOST28147", f6099a + "$AlgParamGen");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0619a.f2198f, "GOST28147");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameterGenerator." + InterfaceC0619a.f2198f, "GOST28147");
            configurableProvider.mo2853a("Cipher." + InterfaceC0619a.f2197e, f6099a + "$CryptoProWrap");
            configurableProvider.mo2853a("Cipher." + InterfaceC0619a.f2196d, f6099a + "$GostWrap");
            configurableProvider.mo2853a("Mac.GOST28147MAC", f6099a + "$Mac");
            configurableProvider.mo2853a("Alg.Alias.Mac.GOST28147", "GOST28147MAC");
        }
    }

    static {
        f6091a.put(InterfaceC0619a.f2199g, "E-TEST");
        f6091a.put(InterfaceC0619a.f2200h, "E-A");
        f6091a.put(InterfaceC0619a.f2201i, "E-B");
        f6091a.put(InterfaceC0619a.f2202j, "E-C");
        f6091a.put(InterfaceC0619a.f2203k, "E-D");
        f6091a.put(InterfaceC0685a.f2820t, "Param-Z");
        f6092b.put("E-A", InterfaceC0619a.f2200h);
        f6092b.put("E-B", InterfaceC0619a.f2201i);
        f6092b.put("E-C", InterfaceC0619a.f2202j);
        f6092b.put("E-D", InterfaceC0619a.f2203k);
        f6092b.put("Param-Z", InterfaceC0685a.f2820t);
    }

    private GOST28147() {
    }

    public static abstract class BaseAlgParams extends BaseAlgorithmParameters {

        /* JADX INFO: renamed from: a */
        private C0653p f6097a = InterfaceC0619a.f2200h;

        /* JADX INFO: renamed from: b */
        private byte[] f6098b;

        /* JADX INFO: renamed from: b */
        private static C0653p m4434b(String str) {
            C0653p c0653p = (C0653p) GOST28147.f6092b.get(str);
            if (c0653p == null) {
                throw new IllegalArgumentException("Unknown SBOX name: ".concat(String.valueOf(str)));
            }
            return c0653p;
        }

        /* JADX INFO: renamed from: b */
        protected static C0653p m4435b(byte[] bArr) {
            return m4434b(C0944u.m2373a(bArr));
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        /* JADX INFO: renamed from: a */
        protected AlgorithmParameterSpec mo4277a(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f6098b);
            }
            if (cls == GOST28147ParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new GOST28147ParameterSpec(this.f6097a, this.f6098b);
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
        }

        /* JADX INFO: renamed from: a */
        abstract void mo4432a(byte[] bArr);

        /* JADX INFO: renamed from: a */
        protected byte[] mo4433a() {
            return new C0621c(this.f6098b, this.f6097a).mo1578k();
        }

        @Override // java.security.AlgorithmParametersSpi
        protected final byte[] engineGetEncoded() {
            return engineGetEncoded("ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected final byte[] engineGetEncoded(String str) throws IOException {
            if (m4449a(str)) {
                return mo4433a();
            }
            throw new IOException("Unknown parameter format: ".concat(String.valueOf(str)));
        }

        @Override // java.security.AlgorithmParametersSpi
        protected final void engineInit(byte[] bArr) throws IOException {
            engineInit(bArr, "ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected final void engineInit(byte[] bArr, String str) throws IOException {
            if (bArr == null) {
                throw new NullPointerException("Encoded parameters cannot be null");
            }
            if (!m4449a(str)) {
                throw new IOException("Unknown parameter format: ".concat(String.valueOf(str)));
            }
            try {
                mo4432a(bArr);
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException("Parameter parsing failed: " + e2.getMessage());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.f6098b = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else {
                if (!(algorithmParameterSpec instanceof GOST28147ParameterSpec)) {
                    throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
                }
                this.f6098b = ((GOST28147ParameterSpec) algorithmParameterSpec).m4494c();
                try {
                    this.f6097a = m4434b(C0944u.m2373a(((GOST28147ParameterSpec) algorithmParameterSpec).m4493b()));
                } catch (IllegalArgumentException e) {
                    throw new InvalidParameterSpecException(e.getMessage());
                }
            }
        }
    }
}
