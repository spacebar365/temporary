package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.a.aa.aj;
import org.bouncycastle.a.r.b;
import org.bouncycastle.a.s.n;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.z.u;
import org.bouncycastle.c.a.e;
import org.bouncycastle.c.a.f;
import org.bouncycastle.c.c.j;
import org.bouncycastle.c.c.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;

/* JADX INFO: loaded from: classes.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey a(p pVar) throws IOException {
        org.bouncycastle.a.p pVarA = pVar.b().a();
        if (!pVarA.equals(n.s) && !pVarA.equals(aj.ab) && !pVarA.equals(b.l)) {
            throw new IOException("algorithm identifier " + pVarA + " in key not recognised");
        }
        return new BCElGamalPrivateKey(pVar);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey a(u uVar) throws IOException {
        org.bouncycastle.a.p pVarA = uVar.a().a();
        if (!pVarA.equals(n.s) && !pVarA.equals(aj.ab) && !pVarA.equals(b.l)) {
            throw new IOException("algorithm identifier " + pVarA + " in key not recognised");
        }
        return new BCElGamalPublicKey(uVar);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        return keySpec instanceof j ? new BCElGamalPrivateKey((j) keySpec) : keySpec instanceof DHPrivateKeySpec ? new BCElGamalPrivateKey((DHPrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) {
        return keySpec instanceof k ? new BCElGamalPublicKey((k) keySpec) : keySpec instanceof DHPublicKeySpec ? new BCElGamalPublicKey((DHPublicKeySpec) keySpec) : super.engineGeneratePublic(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(DHPrivateKeySpec.class) && (key instanceof DHPrivateKey)) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            return new DHPrivateKeySpec(dHPrivateKey.getX(), dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
        }
        if (!cls.isAssignableFrom(DHPublicKeySpec.class) || !(key instanceof DHPublicKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        DHPublicKey dHPublicKey = (DHPublicKey) key;
        return new DHPublicKeySpec(dHPublicKey.getY(), dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof DHPublicKey) {
            return new BCElGamalPublicKey((DHPublicKey) key);
        }
        if (key instanceof DHPrivateKey) {
            return new BCElGamalPrivateKey((DHPrivateKey) key);
        }
        if (key instanceof f) {
            return new BCElGamalPublicKey((f) key);
        }
        if (key instanceof e) {
            return new BCElGamalPrivateKey((e) key);
        }
        throw new InvalidKeyException("key type unknown");
    }
}
