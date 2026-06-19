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
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.spec.DSTU4145ParameterSpec;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p078w.C0743c;
import org.bouncycastle.p083b.C0818b;
import org.bouncycastle.p083b.p090f.C0964k;
import org.bouncycastle.p083b.p090f.C0965l;
import org.bouncycastle.p083b.p097k.C1049aa;
import org.bouncycastle.p083b.p097k.C1052ad;
import org.bouncycastle.p083b.p097k.C1053ae;
import org.bouncycastle.p083b.p097k.C1119v;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p103c.p105b.C1200a;
import org.bouncycastle.p103c.p106c.C1205b;
import org.bouncycastle.p103c.p106c.C1207d;
import org.bouncycastle.p103c.p106c.C1208e;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1389j;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {

    /* JADX INFO: renamed from: a */
    Object f5667a;

    /* JADX INFO: renamed from: b */
    C0965l f5668b;

    /* JADX INFO: renamed from: c */
    String f5669c;

    /* JADX INFO: renamed from: d */
    C1049aa f5670d;

    /* JADX INFO: renamed from: e */
    SecureRandom f5671e;

    /* JADX INFO: renamed from: f */
    boolean f5672f;

    public KeyPairGeneratorSpi() {
        super("DSTU4145");
        this.f5667a = null;
        this.f5668b = new C0964k();
        this.f5669c = "DSTU4145";
        this.f5671e = null;
        this.f5672f = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.f5672f) {
            throw new IllegalStateException("DSTU Key Pair Generator not initialised");
        }
        C0818b c0818bMo2108a = this.f5668b.mo2108a();
        C1053ae c1053ae = (C1053ae) c0818bMo2108a.m1919a();
        C1052ad c1052ad = (C1052ad) c0818bMo2108a.m1920b();
        if (this.f5667a instanceof C1208e) {
            C1208e c1208e = (C1208e) this.f5667a;
            BCDSTU4145PublicKey bCDSTU4145PublicKey = new BCDSTU4145PublicKey(this.f5669c, c1053ae, c1208e);
            return new KeyPair(bCDSTU4145PublicKey, new BCDSTU4145PrivateKey(this.f5669c, c1052ad, bCDSTU4145PublicKey, c1208e));
        }
        if (this.f5667a == null) {
            return new KeyPair(new BCDSTU4145PublicKey(this.f5669c, c1053ae), new BCDSTU4145PrivateKey(this.f5669c, c1052ad));
        }
        ECParameterSpec eCParameterSpec = (ECParameterSpec) this.f5667a;
        BCDSTU4145PublicKey bCDSTU4145PublicKey2 = new BCDSTU4145PublicKey(this.f5669c, c1053ae, eCParameterSpec);
        return new KeyPair(bCDSTU4145PublicKey2, new BCDSTU4145PrivateKey(this.f5669c, c1052ad, bCDSTU4145PublicKey2, eCParameterSpec));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.f5671e = secureRandom;
        if (this.f5667a == null) {
            throw new InvalidParameterException("unknown key size.");
        }
        try {
            initialize((ECGenParameterSpec) this.f5667a, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidParameterException("key size not configurable.");
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof C1208e) {
            C1208e c1208e = (C1208e) algorithmParameterSpec;
            this.f5667a = algorithmParameterSpec;
            this.f5670d = new C1049aa(new C1122y(c1208e.m2869b(), c1208e.m2870c(), c1208e.m2871d(), c1208e.m2872e()), secureRandom);
            this.f5668b.mo2109a(this.f5670d);
            this.f5672f = true;
            return;
        }
        if (algorithmParameterSpec instanceof ECParameterSpec) {
            ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
            this.f5667a = algorithmParameterSpec;
            AbstractC1381d abstractC1381dM4317a = EC5Util.m4317a(eCParameterSpec.getCurve());
            AbstractC1389j abstractC1389jM4320a = EC5Util.m4320a(abstractC1381dM4317a, eCParameterSpec.getGenerator());
            if (eCParameterSpec instanceof DSTU4145ParameterSpec) {
                this.f5670d = new C1049aa(new C1119v(new C1122y(abstractC1381dM4317a, abstractC1389jM4320a, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), ((DSTU4145ParameterSpec) eCParameterSpec).m4490a()), secureRandom);
            } else {
                this.f5670d = new C1049aa(new C1122y(abstractC1381dM4317a, abstractC1389jM4320a, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
            }
            this.f5668b.mo2109a(this.f5670d);
            this.f5672f = true;
            return;
        }
        if ((algorithmParameterSpec instanceof ECGenParameterSpec) || (algorithmParameterSpec instanceof C1205b)) {
            String name = algorithmParameterSpec instanceof ECGenParameterSpec ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : ((C1205b) algorithmParameterSpec).m2866a();
            C1122y c1122yM1729a = C0743c.m1729a(new C0653p(name));
            if (c1122yM1729a == null) {
                throw new InvalidAlgorithmParameterException("unknown curve name: ".concat(String.valueOf(name)));
            }
            this.f5667a = new C1207d(name, c1122yM1729a.m2699a(), c1122yM1729a.m2700b(), c1122yM1729a.m2701c(), c1122yM1729a.m2702d(), c1122yM1729a.m2704f());
            ECParameterSpec eCParameterSpec2 = (ECParameterSpec) this.f5667a;
            AbstractC1381d abstractC1381dM4317a2 = EC5Util.m4317a(eCParameterSpec2.getCurve());
            this.f5670d = new C1049aa(new C1122y(abstractC1381dM4317a2, EC5Util.m4320a(abstractC1381dM4317a2, eCParameterSpec2.getGenerator()), eCParameterSpec2.getOrder(), BigInteger.valueOf(eCParameterSpec2.getCofactor())), secureRandom);
            this.f5668b.mo2109a(this.f5670d);
            this.f5672f = true;
            return;
        }
        if (algorithmParameterSpec != null || C1200a.f4677a.mo2859a() == null) {
            if (algorithmParameterSpec != null || C1200a.f4677a.mo2859a() != null) {
                throw new InvalidAlgorithmParameterException("parameter object not a ECParameterSpec: " + algorithmParameterSpec.getClass().getName());
            }
            throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
        }
        C1208e c1208eMo2859a = C1200a.f4677a.mo2859a();
        this.f5667a = algorithmParameterSpec;
        this.f5670d = new C1049aa(new C1122y(c1208eMo2859a.m2869b(), c1208eMo2859a.m2870c(), c1208eMo2859a.m2871d(), c1208eMo2859a.m2872e()), secureRandom);
        this.f5668b.mo2109a(this.f5670d);
        this.f5672f = true;
    }
}
