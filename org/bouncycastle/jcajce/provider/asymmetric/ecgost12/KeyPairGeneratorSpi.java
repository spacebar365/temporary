package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

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
import org.bouncycastle.jcajce.spec.GOST3410ParameterSpec;
import org.bouncycastle.p054a.p061f.C0620b;
import org.bouncycastle.p083b.C0818b;
import org.bouncycastle.p083b.p090f.C0965l;
import org.bouncycastle.p083b.p097k.C1049aa;
import org.bouncycastle.p083b.p097k.C1051ac;
import org.bouncycastle.p083b.p097k.C1052ad;
import org.bouncycastle.p083b.p097k.C1053ae;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p083b.p097k.C1123z;
import org.bouncycastle.p103c.p105b.C1200a;
import org.bouncycastle.p103c.p106c.C1205b;
import org.bouncycastle.p103c.p106c.C1207d;
import org.bouncycastle.p103c.p106c.C1208e;
import org.bouncycastle.p107d.p108a.AbstractC1381d;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {

    /* JADX INFO: renamed from: a */
    Object f5782a;

    /* JADX INFO: renamed from: b */
    C0965l f5783b;

    /* JADX INFO: renamed from: c */
    String f5784c;

    /* JADX INFO: renamed from: d */
    C1049aa f5785d;

    /* JADX INFO: renamed from: e */
    int f5786e;

    /* JADX INFO: renamed from: f */
    SecureRandom f5787f;

    /* JADX INFO: renamed from: g */
    boolean f5788g;

    public KeyPairGeneratorSpi() {
        super("ECGOST3410-2012");
        this.f5782a = null;
        this.f5783b = new C0965l();
        this.f5784c = "ECGOST3410-2012";
        this.f5786e = 239;
        this.f5787f = null;
        this.f5788g = false;
    }

    /* JADX INFO: renamed from: a */
    private void m4265a(GOST3410ParameterSpec gOST3410ParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        C1122y c1122yM1504a = C0620b.m1504a(gOST3410ParameterSpec.m4497a());
        if (c1122yM1504a == null) {
            throw new InvalidAlgorithmParameterException("unknown curve: " + gOST3410ParameterSpec.m4497a());
        }
        this.f5782a = new C1207d(C0620b.m1505b(gOST3410ParameterSpec.m4497a()), c1122yM1504a.m2699a(), c1122yM1504a.m2700b(), c1122yM1504a.m2701c(), c1122yM1504a.m2702d(), c1122yM1504a.m2704f());
        this.f5785d = new C1049aa(new C1123z(new C1051ac(gOST3410ParameterSpec.m4497a(), c1122yM1504a), gOST3410ParameterSpec.m4497a(), gOST3410ParameterSpec.m4498b(), gOST3410ParameterSpec.m4499c()), secureRandom);
        this.f5783b.mo2109a(this.f5785d);
        this.f5788g = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.f5788g) {
            throw new IllegalStateException("EC Key Pair Generator not initialised");
        }
        C0818b c0818bMo2108a = this.f5783b.mo2108a();
        C1053ae c1053ae = (C1053ae) c0818bMo2108a.m1919a();
        C1052ad c1052ad = (C1052ad) c0818bMo2108a.m1920b();
        if (this.f5782a instanceof C1208e) {
            C1208e c1208e = (C1208e) this.f5782a;
            BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey = new BCECGOST3410_2012PublicKey(this.f5784c, c1053ae, c1208e);
            return new KeyPair(bCECGOST3410_2012PublicKey, new BCECGOST3410_2012PrivateKey(this.f5784c, c1052ad, bCECGOST3410_2012PublicKey, c1208e));
        }
        if (this.f5782a == null) {
            return new KeyPair(new BCECGOST3410_2012PublicKey(this.f5784c, c1053ae), new BCECGOST3410_2012PrivateKey(this.f5784c, c1052ad));
        }
        ECParameterSpec eCParameterSpec = (ECParameterSpec) this.f5782a;
        BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey2 = new BCECGOST3410_2012PublicKey(this.f5784c, c1053ae, eCParameterSpec);
        return new KeyPair(bCECGOST3410_2012PublicKey2, new BCECGOST3410_2012PrivateKey(this.f5784c, c1052ad, bCECGOST3410_2012PublicKey2, eCParameterSpec));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.f5786e = i;
        this.f5787f = secureRandom;
        if (this.f5782a == null) {
            throw new InvalidParameterException("unknown key size.");
        }
        try {
            initialize((ECGenParameterSpec) this.f5782a, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidParameterException("key size not configurable.");
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof GOST3410ParameterSpec) {
            m4265a((GOST3410ParameterSpec) algorithmParameterSpec, secureRandom);
            return;
        }
        if (algorithmParameterSpec instanceof C1208e) {
            C1208e c1208e = (C1208e) algorithmParameterSpec;
            this.f5782a = algorithmParameterSpec;
            this.f5785d = new C1049aa(new C1122y(c1208e.m2869b(), c1208e.m2870c(), c1208e.m2871d(), c1208e.m2872e()), secureRandom);
            this.f5783b.mo2109a(this.f5785d);
            this.f5788g = true;
            return;
        }
        if (algorithmParameterSpec instanceof ECParameterSpec) {
            ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
            this.f5782a = algorithmParameterSpec;
            AbstractC1381d abstractC1381dM4317a = EC5Util.m4317a(eCParameterSpec.getCurve());
            this.f5785d = new C1049aa(new C1122y(abstractC1381dM4317a, EC5Util.m4320a(abstractC1381dM4317a, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
            this.f5783b.mo2109a(this.f5785d);
            this.f5788g = true;
            return;
        }
        if ((algorithmParameterSpec instanceof ECGenParameterSpec) || (algorithmParameterSpec instanceof C1205b)) {
            m4265a(new GOST3410ParameterSpec(algorithmParameterSpec instanceof ECGenParameterSpec ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : ((C1205b) algorithmParameterSpec).m2866a()), secureRandom);
            return;
        }
        if (algorithmParameterSpec != null || C1200a.f4677a.mo2859a() == null) {
            if (algorithmParameterSpec != null || C1200a.f4677a.mo2859a() != null) {
                throw new InvalidAlgorithmParameterException("parameter object not a ECParameterSpec: " + algorithmParameterSpec.getClass().getName());
            }
            throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
        }
        C1208e c1208eMo2859a = C1200a.f4677a.mo2859a();
        this.f5782a = algorithmParameterSpec;
        this.f5785d = new C1049aa(new C1122y(c1208eMo2859a.m2869b(), c1208eMo2859a.m2870c(), c1208eMo2859a.m2871d(), c1208eMo2859a.m2872e()), secureRandom);
        this.f5783b.mo2109a(this.f5785d);
        this.f5788g = true;
    }
}
