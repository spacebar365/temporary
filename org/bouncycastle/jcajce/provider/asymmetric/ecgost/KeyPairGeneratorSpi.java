package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import org.bouncycastle.a.f.b;
import org.bouncycastle.b.f.l;
import org.bouncycastle.b.k.aa;
import org.bouncycastle.b.k.ac;
import org.bouncycastle.b.k.ad;
import org.bouncycastle.b.k.ae;
import org.bouncycastle.b.k.y;
import org.bouncycastle.b.k.z;
import org.bouncycastle.c.b.a;
import org.bouncycastle.c.c.d;
import org.bouncycastle.c.c.e;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.spec.GOST3410ParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    Object a;
    l b;
    String c;
    aa d;
    int e;
    SecureRandom f;
    boolean g;

    public KeyPairGeneratorSpi() {
        super("ECGOST3410");
        this.a = null;
        this.b = new l();
        this.c = "ECGOST3410";
        this.e = 239;
        this.f = null;
        this.g = false;
    }

    private void a(GOST3410ParameterSpec gOST3410ParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        y yVarA = b.a(gOST3410ParameterSpec.a());
        if (yVarA == null) {
            throw new InvalidAlgorithmParameterException("unknown curve: " + gOST3410ParameterSpec.a());
        }
        this.a = new d(b.b(gOST3410ParameterSpec.a()), yVarA.a(), yVarA.b(), yVarA.c(), yVarA.d(), yVarA.f());
        this.d = new aa(new z(new ac(gOST3410ParameterSpec.a(), yVarA), gOST3410ParameterSpec.a(), gOST3410ParameterSpec.b(), gOST3410ParameterSpec.c()), secureRandom);
        this.b.a(this.d);
        this.g = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.g) {
            throw new IllegalStateException("EC Key Pair Generator not initialised");
        }
        org.bouncycastle.b.b bVarA = this.b.a();
        ae aeVar = (ae) bVarA.a();
        ad adVar = (ad) bVarA.b();
        if (this.a instanceof e) {
            e eVar = (e) this.a;
            BCECGOST3410PublicKey bCECGOST3410PublicKey = new BCECGOST3410PublicKey(this.c, aeVar, eVar);
            return new KeyPair(bCECGOST3410PublicKey, new BCECGOST3410PrivateKey(this.c, adVar, bCECGOST3410PublicKey, eVar));
        }
        if (this.a == null) {
            return new KeyPair(new BCECGOST3410PublicKey(this.c, aeVar), new BCECGOST3410PrivateKey(this.c, adVar));
        }
        ECParameterSpec eCParameterSpec = (ECParameterSpec) this.a;
        BCECGOST3410PublicKey bCECGOST3410PublicKey2 = new BCECGOST3410PublicKey(this.c, aeVar, eCParameterSpec);
        return new KeyPair(bCECGOST3410PublicKey2, new BCECGOST3410PrivateKey(this.c, adVar, bCECGOST3410PublicKey2, eCParameterSpec));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.e = i;
        this.f = secureRandom;
        if (this.a == null) {
            throw new InvalidParameterException("unknown key size.");
        }
        try {
            initialize((ECGenParameterSpec) this.a, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidParameterException("key size not configurable.");
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof GOST3410ParameterSpec) {
            a((GOST3410ParameterSpec) algorithmParameterSpec, secureRandom);
            return;
        }
        if (algorithmParameterSpec instanceof e) {
            e eVar = (e) algorithmParameterSpec;
            this.a = algorithmParameterSpec;
            this.d = new aa(new y(eVar.b(), eVar.c(), eVar.d(), eVar.e()), secureRandom);
            this.b.a(this.d);
            this.g = true;
            return;
        }
        if (algorithmParameterSpec instanceof ECParameterSpec) {
            ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
            this.a = algorithmParameterSpec;
            org.bouncycastle.d.a.d dVarA = EC5Util.a(eCParameterSpec.getCurve());
            this.d = new aa(new y(dVarA, EC5Util.a(dVarA, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
            this.b.a(this.d);
            this.g = true;
            return;
        }
        if ((algorithmParameterSpec instanceof ECGenParameterSpec) || (algorithmParameterSpec instanceof org.bouncycastle.c.c.b)) {
            a(new GOST3410ParameterSpec(algorithmParameterSpec instanceof ECGenParameterSpec ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : ((org.bouncycastle.c.c.b) algorithmParameterSpec).a()), secureRandom);
            return;
        }
        if (algorithmParameterSpec != null || a.a.a() == null) {
            if (algorithmParameterSpec != null || a.a.a() != null) {
                throw new InvalidAlgorithmParameterException("parameter object not a ECParameterSpec: " + algorithmParameterSpec.getClass().getName());
            }
            throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
        }
        e eVarA = a.a.a();
        this.a = algorithmParameterSpec;
        this.d = new aa(new y(eVarA.b(), eVarA.c(), eVarA.d(), eVarA.e()), secureRandom);
        this.b.a(this.d);
        this.g = true;
    }
}
