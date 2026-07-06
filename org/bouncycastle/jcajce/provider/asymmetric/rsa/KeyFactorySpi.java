package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.s.s;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.k.b;
import org.bouncycastle.b.k.bm;
import org.bouncycastle.b.k.bn;
import org.bouncycastle.b.o.c;
import org.bouncycastle.c.c.q;
import org.bouncycastle.c.c.r;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ExtendedInvalidKeySpecException;

/* JADX INFO: loaded from: classes.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey a(p pVar) throws IOException {
        org.bouncycastle.a.p pVarA = pVar.b().a();
        if (!RSAUtil.a(pVarA)) {
            throw new IOException("algorithm identifier " + pVarA + " in key not recognised");
        }
        s sVarA = s.a(pVar.c());
        return sVarA.h().intValue() == 0 ? new BCRSAPrivateKey(sVarA) : new BCRSAPrivateCrtKey(pVar);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey a(u uVar) throws IOException {
        org.bouncycastle.a.p pVarA = uVar.a().a();
        if (RSAUtil.a(pVarA)) {
            return new BCRSAPublicKey(uVar);
        }
        throw new IOException("algorithm identifier " + pVarA + " in key not recognised");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return a(p.a(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                try {
                    return new BCRSAPrivateCrtKey(s.a(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e2) {
                    throw new ExtendedInvalidKeySpecException("unable to process key spec: " + e.toString(), e);
                }
            }
        }
        if (keySpec instanceof RSAPrivateCrtKeySpec) {
            return new BCRSAPrivateCrtKey((RSAPrivateCrtKeySpec) keySpec);
        }
        if (keySpec instanceof RSAPrivateKeySpec) {
            return new BCRSAPrivateKey((RSAPrivateKeySpec) keySpec);
        }
        if (!(keySpec instanceof q)) {
            throw new InvalidKeySpecException("unknown KeySpec type: " + keySpec.getClass().getName());
        }
        b bVarA = org.bouncycastle.b.o.b.a(((q) keySpec).getEncoded());
        if (bVarA instanceof bn) {
            return new BCRSAPrivateCrtKey((bn) bVarA);
        }
        throw new InvalidKeySpecException("open SSH public key is not RSA private key");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof RSAPublicKeySpec) {
            return new BCRSAPublicKey((RSAPublicKeySpec) keySpec);
        }
        if (!(keySpec instanceof r)) {
            return super.engineGeneratePublic(keySpec);
        }
        b bVarA = c.a(((r) keySpec).getEncoded());
        if (bVarA instanceof bm) {
            return new BCRSAPublicKey((bm) bVarA);
        }
        throw new InvalidKeySpecException("Open SSH public key is not RSA public key");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(RSAPublicKeySpec.class) && (key instanceof RSAPublicKey)) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) key;
            return new RSAPublicKeySpec(rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
        }
        if (cls.isAssignableFrom(RSAPrivateKeySpec.class) && (key instanceof RSAPrivateKey)) {
            RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) key;
            return new RSAPrivateKeySpec(rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
        }
        if (cls.isAssignableFrom(RSAPrivateCrtKeySpec.class) && (key instanceof RSAPrivateCrtKey)) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) key;
            return new RSAPrivateCrtKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
        }
        if (cls.isAssignableFrom(r.class) && (key instanceof RSAPublicKey)) {
            try {
                return new r(c.a(new bm(false, ((RSAPublicKey) key).getModulus(), ((RSAPublicKey) key).getPublicExponent())));
            } catch (IOException e) {
                throw new IllegalArgumentException("unable to produce encoding: " + e.getMessage());
            }
        }
        if (!cls.isAssignableFrom(q.class) || !(key instanceof RSAPrivateCrtKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        try {
            return new q(org.bouncycastle.b.o.b.a(new bn(((RSAPrivateCrtKey) key).getModulus(), ((RSAPrivateCrtKey) key).getPublicExponent(), ((RSAPrivateCrtKey) key).getPrivateExponent(), ((RSAPrivateCrtKey) key).getPrimeP(), ((RSAPrivateCrtKey) key).getPrimeQ(), ((RSAPrivateCrtKey) key).getPrimeExponentP(), ((RSAPrivateCrtKey) key).getPrimeExponentQ(), ((RSAPrivateCrtKey) key).getCrtCoefficient())));
        } catch (IOException e2) {
            throw new IllegalArgumentException("unable to produce encoding: " + e2.getMessage());
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof RSAPublicKey) {
            return new BCRSAPublicKey((RSAPublicKey) key);
        }
        if (key instanceof RSAPrivateCrtKey) {
            return new BCRSAPrivateCrtKey((RSAPrivateCrtKey) key);
        }
        if (key instanceof RSAPrivateKey) {
            return new BCRSAPrivateKey((RSAPrivateKey) key);
        }
        throw new InvalidKeyException("key type unknown");
    }
}
