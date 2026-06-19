package org.bouncycastle.jcajce.provider.asymmetric.p148ec;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p056aa.InterfaceC0513aj;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p076u.C0687a;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p083b.p097k.C1053ae;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p083b.p102o.C1166c;
import org.bouncycastle.p103c.p105b.C1200a;
import org.bouncycastle.p103c.p106c.C1208e;
import org.bouncycastle.p103c.p106c.C1209f;
import org.bouncycastle.p103c.p106c.C1210g;
import org.bouncycastle.p103c.p106c.C1220q;
import org.bouncycastle.p103c.p106c.C1221r;

/* JADX INFO: loaded from: classes.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi implements AsymmetricKeyInfoConverter {

    /* JADX INFO: renamed from: a */
    String f5720a;

    /* JADX INFO: renamed from: b */
    ProviderConfiguration f5721b;

    /* JADX INFO: renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$EC */
    public static class C1575EC extends KeyFactorySpi {
        public C1575EC() {
            super("EC", C1200a.f4677a);
        }
    }

    public static class ECDH extends KeyFactorySpi {
        public ECDH() {
            super("ECDH", C1200a.f4677a);
        }
    }

    public static class ECDHC extends KeyFactorySpi {
        public ECDHC() {
            super("ECDHC", C1200a.f4677a);
        }
    }

    public static class ECDSA extends KeyFactorySpi {
        public ECDSA() {
            super("ECDSA", C1200a.f4677a);
        }
    }

    public static class ECGOST3410 extends KeyFactorySpi {
        public ECGOST3410() {
            super("ECGOST3410", C1200a.f4677a);
        }
    }

    public static class ECGOST3410_2012 extends KeyFactorySpi {
        public ECGOST3410_2012() {
            super("ECGOST3410-2012", C1200a.f4677a);
        }
    }

    public static class ECMQV extends KeyFactorySpi {
        public ECMQV() {
            super("ECMQV", C1200a.f4677a);
        }
    }

    KeyFactorySpi(String str, ProviderConfiguration providerConfiguration) {
        this.f5720a = str;
        this.f5721b = providerConfiguration;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    /* JADX INFO: renamed from: a */
    public final PrivateKey mo3997a(C0676p c0676p) throws IOException {
        C0653p c0653pM1783a = c0676p.m1658b().m1783a();
        if (c0653pM1783a.equals(InterfaceC0513aj.f1952k)) {
            return new BCECPrivateKey(this.f5720a, c0676p, this.f5721b);
        }
        throw new IOException("algorithm identifier " + c0653pM1783a + " in key not recognised");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    /* JADX INFO: renamed from: a */
    public final PublicKey mo3998a(C0780u c0780u) throws IOException {
        C0653p c0653pM1783a = c0780u.m1844a().m1783a();
        if (c0653pM1783a.equals(InterfaceC0513aj.f1952k)) {
            return new BCECPublicKey(this.f5720a, c0780u, this.f5721b);
        }
        throw new IOException("algorithm identifier " + c0653pM1783a + " in key not recognised");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof C1209f) {
            return new BCECPrivateKey(this.f5720a, (C1209f) keySpec, this.f5721b);
        }
        if (keySpec instanceof ECPrivateKeySpec) {
            return new BCECPrivateKey(this.f5720a, (ECPrivateKeySpec) keySpec, this.f5721b);
        }
        if (!(keySpec instanceof C1220q)) {
            return super.engineGeneratePrivate(keySpec);
        }
        C0687a c0687aM1693a = C0687a.m1693a(((C1220q) keySpec).getEncoded());
        try {
            return new BCECPrivateKey(this.f5720a, new C0676p(new C0759a(InterfaceC0513aj.f1952k, c0687aM1693a.m1697c()), c0687aM1693a), this.f5721b);
        } catch (IOException e) {
            throw new InvalidKeySpecException("bad encoding: " + e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        try {
            if (keySpec instanceof C1210g) {
                return new BCECPublicKey(this.f5720a, (C1210g) keySpec, this.f5721b);
            }
            if (keySpec instanceof ECPublicKeySpec) {
                return new BCECPublicKey(this.f5720a, (ECPublicKeySpec) keySpec, this.f5721b);
            }
            if (!(keySpec instanceof C1221r)) {
                return super.engineGeneratePublic(keySpec);
            }
            C1075b c1075bM2791a = C1166c.m2791a(((C1221r) keySpec).getEncoded());
            if (!(c1075bM2791a instanceof C1053ae)) {
                throw new IllegalArgumentException("openssh key is not ec public key");
            }
            C1122y c1122yB = ((C1053ae) c1075bM2791a).m2563b();
            return engineGeneratePublic(new C1210g(((C1053ae) c1075bM2791a).m2566c(), new C1208e(c1122yB.m2699a(), c1122yB.m2700b(), c1122yB.m2701c(), c1122yB.m2702d(), c1122yB.m2704f())));
        } catch (Exception e) {
            throw new InvalidKeySpecException("invalid KeySpec: " + e.getMessage(), e);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(ECPublicKeySpec.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey = (ECPublicKey) key;
            if (eCPublicKey.getParams() != null) {
                return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            C1208e c1208eMo2859a = C1200a.f4677a.mo2859a();
            return new ECPublicKeySpec(eCPublicKey.getW(), EC5Util.m4310a(EC5Util.m4314a(c1208eMo2859a.m2869b()), c1208eMo2859a));
        }
        if (cls.isAssignableFrom(ECPrivateKeySpec.class) && (key instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) key;
            if (eCPrivateKey.getParams() != null) {
                return new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
            }
            C1208e c1208eMo2859a2 = C1200a.f4677a.mo2859a();
            return new ECPrivateKeySpec(eCPrivateKey.getS(), EC5Util.m4310a(EC5Util.m4314a(c1208eMo2859a2.m2869b()), c1208eMo2859a2));
        }
        if (cls.isAssignableFrom(C1210g.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey2 = (ECPublicKey) key;
            if (eCPublicKey2.getParams() != null) {
                return new C1210g(EC5Util.m4319a(eCPublicKey2.getParams(), eCPublicKey2.getW()), EC5Util.m4316a(eCPublicKey2.getParams()));
            }
            return new C1210g(EC5Util.m4319a(eCPublicKey2.getParams(), eCPublicKey2.getW()), C1200a.f4677a.mo2859a());
        }
        if (cls.isAssignableFrom(C1209f.class) && (key instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey2 = (ECPrivateKey) key;
            if (eCPrivateKey2.getParams() != null) {
                return new C1209f(eCPrivateKey2.getS(), EC5Util.m4316a(eCPrivateKey2.getParams()));
            }
            return new C1209f(eCPrivateKey2.getS(), C1200a.f4677a.mo2859a());
        }
        if (cls.isAssignableFrom(C1221r.class) && (key instanceof ECPublicKey)) {
            if (!(key instanceof BCECPublicKey)) {
                throw new IllegalArgumentException("invalid key type: " + key.getClass().getName());
            }
            BCECPublicKey bCECPublicKey = (BCECPublicKey) key;
            C1208e c1208eMo2827a = bCECPublicKey.mo2827a();
            try {
                return new C1221r(C1166c.m2792a(new C1053ae(bCECPublicKey.mo2829c(), new C1122y(c1208eMo2827a.m2869b(), c1208eMo2827a.m2870c(), c1208eMo2827a.m2871d(), c1208eMo2827a.m2872e(), c1208eMo2827a.m2873f()))));
            } catch (IOException e) {
                throw new IllegalArgumentException("unable to produce encoding: " + e.getMessage());
            }
        }
        if (!cls.isAssignableFrom(C1220q.class) || !(key instanceof ECPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        if (!(key instanceof BCECPrivateKey)) {
            throw new IllegalArgumentException("invalid key type: " + key.getClass().getName());
        }
        try {
            return new C1220q(C0676p.m1656a(key.getEncoded()).m1659c().mo1358i().mo1578k());
        } catch (IOException e2) {
            throw new IllegalArgumentException("cannot encoded key: " + e2.getMessage());
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof ECPublicKey) {
            return new BCECPublicKey((ECPublicKey) key, this.f5721b);
        }
        if (key instanceof ECPrivateKey) {
            return new BCECPrivateKey((ECPrivateKey) key, this.f5721b);
        }
        throw new InvalidKeyException("key type unknown");
    }
}
