package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import org.bouncycastle.a.p;
import org.bouncycastle.a.w.c;
import org.bouncycastle.b.b;
import org.bouncycastle.b.f.k;
import org.bouncycastle.b.f.l;
import org.bouncycastle.b.k.aa;
import org.bouncycastle.b.k.ad;
import org.bouncycastle.b.k.ae;
import org.bouncycastle.b.k.v;
import org.bouncycastle.b.k.y;
import org.bouncycastle.c.b.a;
import org.bouncycastle.c.c.e;
import org.bouncycastle.d.a.d;
import org.bouncycastle.d.a.j;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.spec.DSTU4145ParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    Object a;
    l b;
    String c;
    aa d;
    SecureRandom e;
    boolean f;

    public KeyPairGeneratorSpi() {
        super("DSTU4145");
        this.a = null;
        this.b = new k();
        this.c = "DSTU4145";
        this.e = null;
        this.f = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.f) {
            throw new IllegalStateException("DSTU Key Pair Generator not initialised");
        }
        b bVarA = this.b.a();
        ae aeVar = (ae) bVarA.a();
        ad adVar = (ad) bVarA.b();
        if (this.a instanceof e) {
            e eVar = (e) this.a;
            BCDSTU4145PublicKey bCDSTU4145PublicKey = new BCDSTU4145PublicKey(this.c, aeVar, eVar);
            return new KeyPair(bCDSTU4145PublicKey, new BCDSTU4145PrivateKey(this.c, adVar, bCDSTU4145PublicKey, eVar));
        }
        if (this.a == null) {
            return new KeyPair(new BCDSTU4145PublicKey(this.c, aeVar), new BCDSTU4145PrivateKey(this.c, adVar));
        }
        ECParameterSpec eCParameterSpec = (ECParameterSpec) this.a;
        BCDSTU4145PublicKey bCDSTU4145PublicKey2 = new BCDSTU4145PublicKey(this.c, aeVar, eCParameterSpec);
        return new KeyPair(bCDSTU4145PublicKey2, new BCDSTU4145PrivateKey(this.c, adVar, bCDSTU4145PublicKey2, eCParameterSpec));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.e = secureRandom;
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
        if (algorithmParameterSpec instanceof e) {
            e eVar = (e) algorithmParameterSpec;
            this.a = algorithmParameterSpec;
            this.d = new aa(new y(eVar.b(), eVar.c(), eVar.d(), eVar.e()), secureRandom);
            this.b.a(this.d);
            this.f = true;
            return;
        }
        if (algorithmParameterSpec instanceof ECParameterSpec) {
            ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
            this.a = algorithmParameterSpec;
            d dVarA = EC5Util.a(eCParameterSpec.getCurve());
            j jVarA = EC5Util.a(dVarA, eCParameterSpec.getGenerator());
            if (eCParameterSpec instanceof DSTU4145ParameterSpec) {
                this.d = new aa(new v(new y(dVarA, jVarA, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), ((DSTU4145ParameterSpec) eCParameterSpec).a()), secureRandom);
            } else {
                this.d = new aa(new y(dVarA, jVarA, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
            }
            this.b.a(this.d);
            this.f = true;
            return;
        }
        if ((algorithmParameterSpec instanceof ECGenParameterSpec) || (algorithmParameterSpec instanceof org.bouncycastle.c.c.b)) {
            String name = algorithmParameterSpec instanceof ECGenParameterSpec ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : ((org.bouncycastle.c.c.b) algorithmParameterSpec).a();
            y yVarA = c.a(new p(name));
            if (yVarA == null) {
                throw new InvalidAlgorithmParameterException("unknown curve name: ".concat(String.valueOf(name)));
            }
            this.a = new org.bouncycastle.c.c.d(name, yVarA.a(), yVarA.b(), yVarA.c(), yVarA.d(), yVarA.f());
            ECParameterSpec eCParameterSpec2 = (ECParameterSpec) this.a;
            d dVarA2 = EC5Util.a(eCParameterSpec2.getCurve());
            this.d = new aa(new y(dVarA2, EC5Util.a(dVarA2, eCParameterSpec2.getGenerator()), eCParameterSpec2.getOrder(), BigInteger.valueOf(eCParameterSpec2.getCofactor())), secureRandom);
            this.b.a(this.d);
            this.f = true;
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
        this.f = true;
    }
}
