package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import org.bouncycastle.b.b;
import org.bouncycastle.b.f.z;
import org.bouncycastle.b.k.bl;
import org.bouncycastle.b.k.bm;
import org.bouncycastle.b.k.bn;
import org.bouncycastle.b.l;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    static final BigInteger a = BigInteger.valueOf(65537);
    bl b;
    z c;

    public KeyPairGeneratorSpi() {
        super("RSA");
        this.c = new z();
        this.b = new bl(a, l.a(), 2048, PrimeCertaintyCalculator.a(2048));
        this.c.a(this.b);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        b bVarA = this.c.a();
        return new KeyPair(new BCRSAPublicKey((bm) bVarA.a()), new BCRSAPrivateCrtKey((bn) bVarA.b()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.b = new bl(a, secureRandom, i, PrimeCertaintyCalculator.a(i));
        this.c.a(this.b);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof RSAKeyGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a RSAKeyGenParameterSpec");
        }
        RSAKeyGenParameterSpec rSAKeyGenParameterSpec = (RSAKeyGenParameterSpec) algorithmParameterSpec;
        this.b = new bl(rSAKeyGenParameterSpec.getPublicExponent(), secureRandom, rSAKeyGenParameterSpec.getKeysize(), PrimeCertaintyCalculator.a(2048));
        this.c.a(this.b);
    }
}
