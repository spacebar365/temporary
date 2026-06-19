package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.p083b.C0818b;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.p090f.C0979z;
import org.bouncycastle.p083b.p097k.C1087bl;
import org.bouncycastle.p083b.p097k.C1088bm;
import org.bouncycastle.p083b.p097k.C1089bn;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {

    /* JADX INFO: renamed from: a */
    static final BigInteger f5877a = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: b */
    C1087bl f5878b;

    /* JADX INFO: renamed from: c */
    C0979z f5879c;

    public KeyPairGeneratorSpi() {
        super("RSA");
        this.f5879c = new C0979z();
        this.f5878b = new C1087bl(f5877a, C1124l.m2709a(), 2048, PrimeCertaintyCalculator.m4342a(2048));
        this.f5879c.mo2109a(this.f5878b);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        C0818b c0818bMo2108a = this.f5879c.mo2108a();
        return new KeyPair(new BCRSAPublicKey((C1088bm) c0818bMo2108a.m1919a()), new BCRSAPrivateCrtKey((C1089bn) c0818bMo2108a.m1920b()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.f5878b = new C1087bl(f5877a, secureRandom, i, PrimeCertaintyCalculator.m4342a(i));
        this.f5879c.mo2109a(this.f5878b);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof RSAKeyGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a RSAKeyGenParameterSpec");
        }
        RSAKeyGenParameterSpec rSAKeyGenParameterSpec = (RSAKeyGenParameterSpec) algorithmParameterSpec;
        this.f5878b = new C1087bl(rSAKeyGenParameterSpec.getPublicExponent(), secureRandom, rSAKeyGenParameterSpec.getKeysize(), PrimeCertaintyCalculator.m4342a(2048));
        this.f5879c.mo2109a(this.f5878b);
    }
}
