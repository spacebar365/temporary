package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.KeySpec;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.k.b;
import org.bouncycastle.b.k.s;
import org.bouncycastle.b.k.t;
import org.bouncycastle.b.o.c;
import org.bouncycastle.c.c.q;
import org.bouncycastle.c.c.r;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;

/* JADX INFO: loaded from: classes.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey a(p pVar) throws IOException {
        org.bouncycastle.a.p pVarA = pVar.b().a();
        if (DSAUtil.a(pVarA)) {
            return new BCDSAPrivateKey(pVar);
        }
        throw new IOException("algorithm identifier " + pVarA + " in key not recognised");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey a(u uVar) throws IOException {
        org.bouncycastle.a.p pVarA = uVar.a().a();
        if (DSAUtil.a(pVarA)) {
            return new BCDSAPublicKey(uVar);
        }
        throw new IOException("algorithm identifier " + pVarA + " in key not recognised");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof DSAPrivateKeySpec) {
            return new BCDSAPrivateKey((DSAPrivateKeySpec) keySpec);
        }
        if (!(keySpec instanceof q)) {
            return super.engineGeneratePrivate(keySpec);
        }
        b bVarA = org.bouncycastle.b.o.b.a(((q) keySpec).getEncoded());
        if (bVarA instanceof s) {
            return engineGeneratePrivate(new DSAPrivateKeySpec(((s) bVarA).c(), ((s) bVarA).b().a(), ((s) bVarA).b().b(), ((s) bVarA).b().c()));
        }
        throw new IllegalArgumentException("openssh private key is not dsa privare key");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) throws KeyFactorySpi$1 {
        if (keySpec instanceof DSAPublicKeySpec) {
            try {
                return new BCDSAPublicKey((DSAPublicKeySpec) keySpec);
            } catch (Exception e) {
                throw new KeyFactorySpi$1(this, "invalid KeySpec: " + e.getMessage(), e);
            }
        }
        if (!(keySpec instanceof r)) {
            return super.engineGeneratePublic(keySpec);
        }
        b bVarA = c.a(((r) keySpec).getEncoded());
        if (bVarA instanceof t) {
            return engineGeneratePublic(new DSAPublicKeySpec(((t) bVarA).c(), ((t) bVarA).b().a(), ((t) bVarA).b().b(), ((t) bVarA).b().c()));
        }
        throw new IllegalArgumentException("openssh public key is not dsa public key");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(DSAPublicKeySpec.class) && (key instanceof DSAPublicKey)) {
            DSAPublicKey dSAPublicKey = (DSAPublicKey) key;
            return new DSAPublicKeySpec(dSAPublicKey.getY(), dSAPublicKey.getParams().getP(), dSAPublicKey.getParams().getQ(), dSAPublicKey.getParams().getG());
        }
        if (cls.isAssignableFrom(DSAPrivateKeySpec.class) && (key instanceof DSAPrivateKey)) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) key;
            return new DSAPrivateKeySpec(dSAPrivateKey.getX(), dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG());
        }
        if (cls.isAssignableFrom(r.class) && (key instanceof DSAPublicKey)) {
            DSAPublicKey dSAPublicKey2 = (DSAPublicKey) key;
            try {
                return new r(c.a(new t(dSAPublicKey2.getY(), new org.bouncycastle.b.k.r(dSAPublicKey2.getParams().getP(), dSAPublicKey2.getParams().getQ(), dSAPublicKey2.getParams().getG()))));
            } catch (IOException e) {
                throw new IllegalArgumentException("unable to produce encoding: " + e.getMessage());
            }
        }
        if (!cls.isAssignableFrom(q.class) || !(key instanceof DSAPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        DSAPrivateKey dSAPrivateKey2 = (DSAPrivateKey) key;
        try {
            return new q(org.bouncycastle.b.o.b.a(new s(dSAPrivateKey2.getX(), new org.bouncycastle.b.k.r(dSAPrivateKey2.getParams().getP(), dSAPrivateKey2.getParams().getQ(), dSAPrivateKey2.getParams().getG()))));
        } catch (IOException e2) {
            throw new IllegalArgumentException("unable to produce encoding: " + e2.getMessage());
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof DSAPublicKey) {
            return new BCDSAPublicKey((DSAPublicKey) key);
        }
        if (key instanceof DSAPrivateKey) {
            return new BCDSAPrivateKey((DSAPrivateKey) key);
        }
        throw new InvalidKeyException("key type unknown");
    }
}
