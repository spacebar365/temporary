package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.Hashtable;
import org.bouncycastle.a.aa.ad;
import org.bouncycastle.a.aa.b;
import org.bouncycastle.a.p;
import org.bouncycastle.b.f.l;
import org.bouncycastle.b.k.aa;
import org.bouncycastle.b.k.ae;
import org.bouncycastle.b.k.y;
import org.bouncycastle.c.b.a;
import org.bouncycastle.c.c.e;
import org.bouncycastle.d.a.d;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairGeneratorSpi$EC extends KeyPairGeneratorSpi {
    private static Hashtable i;
    aa a;
    l b;
    Object c;
    int d;
    SecureRandom e;
    boolean f;
    String g;
    ProviderConfiguration h;

    public KeyPairGeneratorSpi$EC() {
        super("EC");
        this.b = new l();
        this.c = null;
        this.d = 239;
        this.e = org.bouncycastle.b.l.a();
        this.f = false;
        this.g = "EC";
        this.h = a.a;
    }

    public KeyPairGeneratorSpi$EC(String str, ProviderConfiguration providerConfiguration) {
        super(str);
        this.b = new l();
        this.c = null;
        this.d = 239;
        this.e = org.bouncycastle.b.l.a();
        this.f = false;
        this.g = str;
        this.h = providerConfiguration;
    }

    private static aa a(ECParameterSpec eCParameterSpec, SecureRandom secureRandom) {
        d dVarA = EC5Util.a(eCParameterSpec.getCurve());
        return new aa(new y(dVarA, EC5Util.a(dVarA, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
    }

    private static aa a(e eVar, SecureRandom secureRandom) {
        return new aa(new y(eVar.b(), eVar.c(), eVar.d(), eVar.e()), secureRandom);
    }

    private org.bouncycastle.c.c.d a(String str) throws InvalidAlgorithmParameterException {
        ad adVar;
        ad adVarA = ECUtils.a(str);
        if (adVarA == null) {
            try {
                ad adVarB = b.b(new p(str));
                if (adVarB == null && (adVarB = (ad) this.h.c().get(new p(str))) == null) {
                    throw new InvalidAlgorithmParameterException("unknown curve OID: ".concat(String.valueOf(str)));
                }
                adVar = adVarB;
            } catch (IllegalArgumentException e) {
                throw new InvalidAlgorithmParameterException("unknown curve name: ".concat(String.valueOf(str)));
            }
        } else {
            adVar = adVarA;
        }
        return new org.bouncycastle.c.c.d(str, adVar.a(), adVar.b(), adVar.c(), adVar.d(), null);
    }

    private void a(String str, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        org.bouncycastle.c.c.d dVarA = a(str);
        this.c = dVarA;
        this.a = a(dVarA, secureRandom);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.f) {
            initialize(this.d, new SecureRandom());
        }
        org.bouncycastle.b.b bVarA = this.b.a();
        ae aeVar = (ae) bVarA.a();
        org.bouncycastle.b.k.ad adVar = (org.bouncycastle.b.k.ad) bVarA.b();
        if (this.c instanceof e) {
            e eVar = (e) this.c;
            BCECPublicKey bCECPublicKey = new BCECPublicKey(this.g, aeVar, eVar, this.h);
            return new KeyPair(bCECPublicKey, new BCECPrivateKey(this.g, adVar, bCECPublicKey, eVar, this.h));
        }
        if (this.c == null) {
            return new KeyPair(new BCECPublicKey(this.g, aeVar, this.h), new BCECPrivateKey(this.g, adVar, this.h));
        }
        ECParameterSpec eCParameterSpec = (ECParameterSpec) this.c;
        BCECPublicKey bCECPublicKey2 = new BCECPublicKey(this.g, aeVar, eCParameterSpec, this.h);
        return new KeyPair(bCECPublicKey2, new BCECPrivateKey(this.g, adVar, bCECPublicKey2, eCParameterSpec, this.h));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null) {
            e eVarA = this.h.a();
            if (eVarA == null) {
                throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
            }
            this.c = null;
            this.a = a(eVarA, secureRandom);
        } else if (algorithmParameterSpec instanceof e) {
            this.c = algorithmParameterSpec;
            this.a = a((e) algorithmParameterSpec, secureRandom);
        } else if (algorithmParameterSpec instanceof ECParameterSpec) {
            this.c = algorithmParameterSpec;
            this.a = a((ECParameterSpec) algorithmParameterSpec, secureRandom);
        } else if (algorithmParameterSpec instanceof ECGenParameterSpec) {
            a(((ECGenParameterSpec) algorithmParameterSpec).getName(), secureRandom);
        } else {
            if (!(algorithmParameterSpec instanceof org.bouncycastle.c.c.b)) {
                throw new InvalidAlgorithmParameterException("parameter object not a ECParameterSpec");
            }
            a(((org.bouncycastle.c.c.b) algorithmParameterSpec).a(), secureRandom);
        }
        this.b.a(this.a);
        this.f = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i2, SecureRandom secureRandom) {
        this.d = i2;
        this.e = secureRandom;
        ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) i.get(Integer.valueOf(i2));
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
        i = hashtable;
        hashtable.put(192, new ECGenParameterSpec("prime192v1"));
        i.put(239, new ECGenParameterSpec("prime239v1"));
        i.put(256, new ECGenParameterSpec("prime256v1"));
        i.put(224, new ECGenParameterSpec("P-224"));
        i.put(384, new ECGenParameterSpec("P-384"));
        i.put(521, new ECGenParameterSpec("P-521"));
    }
}
