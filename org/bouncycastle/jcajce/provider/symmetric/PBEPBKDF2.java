package org.bouncycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.KeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.jcajce.PBKDF2Key;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.spec.PBKDF2KeySpec;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p061f.InterfaceC0619a;
import org.bouncycastle.p054a.p070o.InterfaceC0652b;
import org.bouncycastle.p054a.p074s.C0672l;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p083b.EnumC0805ae;

/* JADX INFO: loaded from: classes.dex */
public class PBEPBKDF2 {

    /* JADX INFO: renamed from: a */
    private static final Map f6112a;

    public static class AlgParams extends BaseAlgorithmParameters {

        /* JADX INFO: renamed from: a */
        C0672l f6113a;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        /* JADX INFO: renamed from: a */
        protected final AlgorithmParameterSpec mo4277a(Class cls) throws InvalidParameterSpecException {
            if (cls == PBEParameterSpec.class) {
                return new PBEParameterSpec(this.f6113a.m1645a(), this.f6113a.m1646b().intValue());
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to PBKDF2 PBE parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            try {
                return this.f6113a.m1577a("DER");
            } catch (IOException e) {
                throw new RuntimeException("Oooops! " + e.toString());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) {
            if (m4449a(str)) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PBKDF2 PBE parameters algorithm parameters object");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            this.f6113a = new C0672l(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) {
            this.f6113a = C0672l.m1644a(AbstractC0686u.m1692b(bArr));
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) throws IOException {
            if (!m4449a(str)) {
                throw new IOException("Unknown parameters format in PBKDF2 parameters object");
            }
            engineInit(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "PBKDF2 Parameters";
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6116a = PBEPBKDF2.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("AlgorithmParameters.PBKDF2", f6116a + "$AlgParams");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0674n.f2613B, "PBKDF2");
            configurableProvider.mo2853a("SecretKeyFactory.PBKDF2", f6116a + "$PBKDF2withUTF8");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1", "PBKDF2");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1ANDUTF8", "PBKDF2");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory." + InterfaceC0674n.f2613B, "PBKDF2");
            configurableProvider.mo2853a("SecretKeyFactory.PBKDF2WITHASCII", f6116a + "$PBKDF2with8BIT");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBKDF2WITH8BIT", "PBKDF2WITHASCII");
            configurableProvider.mo2853a("Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1AND8BIT", "PBKDF2WITHASCII");
            configurableProvider.mo2853a("SecretKeyFactory.PBKDF2WITHHMACSHA224", f6116a + "$PBKDF2withSHA224");
            configurableProvider.mo2853a("SecretKeyFactory.PBKDF2WITHHMACSHA256", f6116a + "$PBKDF2withSHA256");
            configurableProvider.mo2853a("SecretKeyFactory.PBKDF2WITHHMACSHA384", f6116a + "$PBKDF2withSHA384");
            configurableProvider.mo2853a("SecretKeyFactory.PBKDF2WITHHMACSHA512", f6116a + "$PBKDF2withSHA512");
            configurableProvider.mo2853a("SecretKeyFactory.PBKDF2WITHHMACSHA3-224", f6116a + "$PBKDF2withSHA3_224");
            configurableProvider.mo2853a("SecretKeyFactory.PBKDF2WITHHMACSHA3-256", f6116a + "$PBKDF2withSHA3_256");
            configurableProvider.mo2853a("SecretKeyFactory.PBKDF2WITHHMACSHA3-384", f6116a + "$PBKDF2withSHA3_384");
            configurableProvider.mo2853a("SecretKeyFactory.PBKDF2WITHHMACSHA3-512", f6116a + "$PBKDF2withSHA3_512");
            configurableProvider.mo2853a("SecretKeyFactory.PBKDF2WITHHMACGOST3411", f6116a + "$PBKDF2withGOST3411");
        }
    }

    public static class PBKDF2with8BIT extends BasePBKDF2 {
        public PBKDF2with8BIT() {
            super("PBKDF2", 1);
        }
    }

    public static class PBKDF2withGOST3411 extends BasePBKDF2 {
        public PBKDF2withGOST3411() {
            super("PBKDF2", 5, 6);
        }
    }

    public static class PBKDF2withSHA224 extends BasePBKDF2 {
        public PBKDF2withSHA224() {
            super("PBKDF2", 5, 7);
        }
    }

    public static class PBKDF2withSHA256 extends BasePBKDF2 {
        public PBKDF2withSHA256() {
            super("PBKDF2", 5, 4);
        }
    }

    public static class PBKDF2withSHA384 extends BasePBKDF2 {
        public PBKDF2withSHA384() {
            super("PBKDF2", 5, 8);
        }
    }

    public static class PBKDF2withSHA3_224 extends BasePBKDF2 {
        public PBKDF2withSHA3_224() {
            super("PBKDF2", 5, 10);
        }
    }

    public static class PBKDF2withSHA3_256 extends BasePBKDF2 {
        public PBKDF2withSHA3_256() {
            super("PBKDF2", 5, 11);
        }
    }

    public static class PBKDF2withSHA3_384 extends BasePBKDF2 {
        public PBKDF2withSHA3_384() {
            super("PBKDF2", 5, 12);
        }
    }

    public static class PBKDF2withSHA3_512 extends BasePBKDF2 {
        public PBKDF2withSHA3_512() {
            super("PBKDF2", 5, 13);
        }
    }

    public static class PBKDF2withSHA512 extends BasePBKDF2 {
        public PBKDF2withSHA512() {
            super("PBKDF2", 5, 9);
        }
    }

    public static class PBKDF2withUTF8 extends BasePBKDF2 {
        public PBKDF2withUTF8() {
            super("PBKDF2", 5);
        }
    }

    private PBEPBKDF2() {
    }

    public static class BasePBKDF2 extends BaseSecretKeyFactory {

        /* JADX INFO: renamed from: c */
        private int f6114c;

        /* JADX INFO: renamed from: d */
        private int f6115d;

        public BasePBKDF2(String str, int i) {
            this(str, i, 1);
        }

        public BasePBKDF2(String str, int i, int i2) {
            super(str, InterfaceC0674n.f2613B);
            this.f6114c = i;
            this.f6115d = i2;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        protected SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof PBEKeySpec)) {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
            PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
            if (pBEKeySpec.getSalt() == null) {
                return new PBKDF2Key(((PBEKeySpec) keySpec).getPassword(), this.f6114c == 1 ? EnumC0805ae.f3327a : EnumC0805ae.f3328b);
            }
            if (pBEKeySpec.getIterationCount() <= 0) {
                throw new InvalidKeySpecException("positive iteration count required: " + pBEKeySpec.getIterationCount());
            }
            if (pBEKeySpec.getKeyLength() <= 0) {
                throw new InvalidKeySpecException("positive key length required: " + pBEKeySpec.getKeyLength());
            }
            if (pBEKeySpec.getPassword().length == 0) {
                throw new IllegalArgumentException("password empty");
            }
            if (!(pBEKeySpec instanceof PBKDF2KeySpec)) {
                int i = this.f6115d;
                int keyLength = pBEKeySpec.getKeyLength();
                return new BCPBEKey(this.f6188a, this.f6189b, this.f6114c, i, keyLength, -1, pBEKeySpec, PBE.Util.m4469a(pBEKeySpec, this.f6114c, i, keyLength));
            }
            C0653p c0653pM1783a = ((PBKDF2KeySpec) pBEKeySpec).m4504a().m1783a();
            Integer num = (Integer) PBEPBKDF2.f6112a.get(c0653pM1783a);
            if (num == null) {
                throw new InvalidKeySpecException("Invalid KeySpec: unknown PRF algorithm ".concat(String.valueOf(c0653pM1783a)));
            }
            int iIntValue = num.intValue();
            int keyLength2 = pBEKeySpec.getKeyLength();
            return new BCPBEKey(this.f6188a, this.f6189b, this.f6114c, iIntValue, keyLength2, -1, pBEKeySpec, PBE.Util.m4469a(pBEKeySpec, this.f6114c, iIntValue, keyLength2));
        }
    }

    static {
        HashMap map = new HashMap();
        f6112a = map;
        map.put(InterfaceC0619a.f2195c, 6);
        f6112a.put(InterfaceC0674n.f2622K, 1);
        f6112a.put(InterfaceC0674n.f2624M, 4);
        f6112a.put(InterfaceC0674n.f2623L, 7);
        f6112a.put(InterfaceC0674n.f2625N, 8);
        f6112a.put(InterfaceC0674n.f2626O, 9);
        f6112a.put(InterfaceC0652b.f2503p, 11);
        f6112a.put(InterfaceC0652b.f2502o, 10);
        f6112a.put(InterfaceC0652b.f2504q, 12);
        f6112a.put(InterfaceC0652b.f2505r, 13);
    }
}
