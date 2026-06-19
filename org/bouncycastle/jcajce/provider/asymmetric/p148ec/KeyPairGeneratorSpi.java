package org.bouncycastle.jcajce.provider.asymmetric.p148ec;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.Hashtable;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0514b;
import org.bouncycastle.p083b.C0818b;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.p090f.C0965l;
import org.bouncycastle.p083b.p097k.C1049aa;
import org.bouncycastle.p083b.p097k.C1052ad;
import org.bouncycastle.p083b.p097k.C1053ae;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p103c.p105b.C1200a;
import org.bouncycastle.p103c.p106c.C1205b;
import org.bouncycastle.p103c.p106c.C1207d;
import org.bouncycastle.p103c.p106c.C1208e;
import org.bouncycastle.p107d.p108a.AbstractC1381d;

/* JADX INFO: loaded from: classes.dex */
public abstract class KeyPairGeneratorSpi extends KeyPairGenerator {

    public static class ECDH extends C1576EC {
        public ECDH() {
            super("ECDH", C1200a.f4677a);
        }
    }

    public static class ECDHC extends C1576EC {
        public ECDHC() {
            super("ECDHC", C1200a.f4677a);
        }
    }

    public static class ECDSA extends C1576EC {
        public ECDSA() {
            super("ECDSA", C1200a.f4677a);
        }
    }

    public static class ECMQV extends C1576EC {
        public ECMQV() {
            super("ECMQV", C1200a.f4677a);
        }
    }

    public KeyPairGeneratorSpi(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$EC */
    public static class C1576EC extends KeyPairGeneratorSpi {

        /* JADX INFO: renamed from: i */
        private static Hashtable f5722i;

        /* JADX INFO: renamed from: a */
        C1049aa f5723a;

        /* JADX INFO: renamed from: b */
        C0965l f5724b;

        /* JADX INFO: renamed from: c */
        Object f5725c;

        /* JADX INFO: renamed from: d */
        int f5726d;

        /* JADX INFO: renamed from: e */
        SecureRandom f5727e;

        /* JADX INFO: renamed from: f */
        boolean f5728f;

        /* JADX INFO: renamed from: g */
        String f5729g;

        /* JADX INFO: renamed from: h */
        ProviderConfiguration f5730h;

        public C1576EC() {
            super("EC");
            this.f5724b = new C0965l();
            this.f5725c = null;
            this.f5726d = 239;
            this.f5727e = C1124l.m2709a();
            this.f5728f = false;
            this.f5729g = "EC";
            this.f5730h = C1200a.f4677a;
        }

        public C1576EC(String str, ProviderConfiguration providerConfiguration) {
            super(str);
            this.f5724b = new C0965l();
            this.f5725c = null;
            this.f5726d = 239;
            this.f5727e = C1124l.m2709a();
            this.f5728f = false;
            this.f5729g = str;
            this.f5730h = providerConfiguration;
        }

        /* JADX INFO: renamed from: a */
        private static C1049aa m4237a(ECParameterSpec eCParameterSpec, SecureRandom secureRandom) {
            AbstractC1381d abstractC1381dM4317a = EC5Util.m4317a(eCParameterSpec.getCurve());
            return new C1049aa(new C1122y(abstractC1381dM4317a, EC5Util.m4320a(abstractC1381dM4317a, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
        }

        /* JADX INFO: renamed from: a */
        private static C1049aa m4238a(C1208e c1208e, SecureRandom secureRandom) {
            return new C1049aa(new C1122y(c1208e.m2869b(), c1208e.m2870c(), c1208e.m2871d(), c1208e.m2872e()), secureRandom);
        }

        /* JADX INFO: renamed from: a */
        private C1207d m4239a(String str) throws InvalidAlgorithmParameterException {
            C0507ad c0507ad;
            C0507ad c0507adM4230a = ECUtils.m4230a(str);
            if (c0507adM4230a == null) {
                try {
                    C0507ad c0507adM1383b = C0514b.m1383b(new C0653p(str));
                    if (c0507adM1383b == null && (c0507adM1383b = (C0507ad) this.f5730h.mo2862c().get(new C0653p(str))) == null) {
                        throw new InvalidAlgorithmParameterException("unknown curve OID: ".concat(String.valueOf(str)));
                    }
                    c0507ad = c0507adM1383b;
                } catch (IllegalArgumentException e) {
                    throw new InvalidAlgorithmParameterException("unknown curve name: ".concat(String.valueOf(str)));
                }
            } else {
                c0507ad = c0507adM4230a;
            }
            return new C1207d(str, c0507ad.m1366a(), c0507ad.m1367b(), c0507ad.m1368c(), c0507ad.m1369d(), null);
        }

        /* JADX INFO: renamed from: a */
        private void m4240a(String str, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            C1207d c1207dM4239a = m4239a(str);
            this.f5725c = c1207dM4239a;
            this.f5723a = m4237a(c1207dM4239a, secureRandom);
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public KeyPair generateKeyPair() {
            if (!this.f5728f) {
                initialize(this.f5726d, new SecureRandom());
            }
            C0818b c0818bMo2108a = this.f5724b.mo2108a();
            C1053ae c1053ae = (C1053ae) c0818bMo2108a.m1919a();
            C1052ad c1052ad = (C1052ad) c0818bMo2108a.m1920b();
            if (this.f5725c instanceof C1208e) {
                C1208e c1208e = (C1208e) this.f5725c;
                BCECPublicKey bCECPublicKey = new BCECPublicKey(this.f5729g, c1053ae, c1208e, this.f5730h);
                return new KeyPair(bCECPublicKey, new BCECPrivateKey(this.f5729g, c1052ad, bCECPublicKey, c1208e, this.f5730h));
            }
            if (this.f5725c == null) {
                return new KeyPair(new BCECPublicKey(this.f5729g, c1053ae, this.f5730h), new BCECPrivateKey(this.f5729g, c1052ad, this.f5730h));
            }
            ECParameterSpec eCParameterSpec = (ECParameterSpec) this.f5725c;
            BCECPublicKey bCECPublicKey2 = new BCECPublicKey(this.f5729g, c1053ae, eCParameterSpec, this.f5730h);
            return new KeyPair(bCECPublicKey2, new BCECPrivateKey(this.f5729g, c1052ad, bCECPublicKey2, eCParameterSpec, this.f5730h));
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec == null) {
                C1208e c1208eMo2859a = this.f5730h.mo2859a();
                if (c1208eMo2859a == null) {
                    throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
                }
                this.f5725c = null;
                this.f5723a = m4238a(c1208eMo2859a, secureRandom);
            } else if (algorithmParameterSpec instanceof C1208e) {
                this.f5725c = algorithmParameterSpec;
                this.f5723a = m4238a((C1208e) algorithmParameterSpec, secureRandom);
            } else if (algorithmParameterSpec instanceof ECParameterSpec) {
                this.f5725c = algorithmParameterSpec;
                this.f5723a = m4237a((ECParameterSpec) algorithmParameterSpec, secureRandom);
            } else if (algorithmParameterSpec instanceof ECGenParameterSpec) {
                m4240a(((ECGenParameterSpec) algorithmParameterSpec).getName(), secureRandom);
            } else {
                if (!(algorithmParameterSpec instanceof C1205b)) {
                    throw new InvalidAlgorithmParameterException("parameter object not a ECParameterSpec");
                }
                m4240a(((C1205b) algorithmParameterSpec).m2866a(), secureRandom);
            }
            this.f5724b.mo2109a(this.f5723a);
            this.f5728f = true;
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(int i, SecureRandom secureRandom) {
            this.f5726d = i;
            this.f5727e = secureRandom;
            ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) f5722i.get(Integer.valueOf(i));
            if (eCGenParameterSpec == null) {
                throw new InvalidParameterException("unknown key size.");
            }
            try {
                initialize(eCGenParameterSpec, secureRandom);
            } catch (InvalidAlgorithmParameterException e) {
                throw new InvalidParameterException("key size not configurable.");
            }
        }

        static {
            Hashtable hashtable = new Hashtable();
            f5722i = hashtable;
            hashtable.put(192, new ECGenParameterSpec("prime192v1"));
            f5722i.put(239, new ECGenParameterSpec("prime239v1"));
            f5722i.put(256, new ECGenParameterSpec("prime256v1"));
            f5722i.put(224, new ECGenParameterSpec("P-224"));
            f5722i.put(384, new ECGenParameterSpec("P-384"));
            f5722i.put(521, new ECGenParameterSpec("P-521"));
        }
    }
}
