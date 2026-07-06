package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.KeySpec;
import org.bouncycastle.a.f.a;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.z.u;
import org.bouncycastle.c.c.e;
import org.bouncycastle.c.c.f;
import org.bouncycastle.c.c.g;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;

/* JADX INFO: loaded from: classes.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey a(p pVar) throws IOException {
        org.bouncycastle.a.p pVarA = pVar.b().a();
        if (!pVarA.equals(a.m) && !pVarA.equals(a.F) && !pVarA.equals(a.E)) {
            throw new IOException("algorithm identifier " + pVarA + " in key not recognised");
        }
        return new BCECGOST3410PrivateKey(pVar);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey a(u uVar) throws IOException {
        org.bouncycastle.a.p pVarA = uVar.a().a();
        if (!pVarA.equals(a.m) && !pVarA.equals(a.F) && !pVarA.equals(a.E)) {
            throw new IOException("algorithm identifier " + pVarA + " in key not recognised");
        }
        return new BCECGOST3410PublicKey(uVar);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        return keySpec instanceof f ? new BCECGOST3410PrivateKey((f) keySpec) : keySpec instanceof ECPrivateKeySpec ? new BCECGOST3410PrivateKey((ECPrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) {
        return keySpec instanceof g ? new BCECGOST3410PublicKey((g) keySpec, org.bouncycastle.c.b.a.a) : keySpec instanceof ECPublicKeySpec ? new BCECGOST3410PublicKey((ECPublicKeySpec) keySpec) : super.engineGeneratePublic(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(ECPublicKeySpec.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey = (ECPublicKey) key;
            if (eCPublicKey.getParams() != null) {
                return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            e eVarA = org.bouncycastle.c.b.a.a.a();
            return new ECPublicKeySpec(eCPublicKey.getW(), EC5Util.a(EC5Util.a(eVarA.b()), eVarA));
        }
        if (cls.isAssignableFrom(ECPrivateKeySpec.class) && (key instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) key;
            if (eCPrivateKey.getParams() != null) {
                return new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
            }
            e eVarA2 = org.bouncycastle.c.b.a.a.a();
            return new ECPrivateKeySpec(eCPrivateKey.getS(), EC5Util.a(EC5Util.a(eVarA2.b()), eVarA2));
        }
        if (cls.isAssignableFrom(g.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey2 = (ECPublicKey) key;
            if (eCPublicKey2.getParams() != null) {
                return new g(EC5Util.a(eCPublicKey2.getParams(), eCPublicKey2.getW()), EC5Util.a(eCPublicKey2.getParams()));
            }
            return new g(EC5Util.a(eCPublicKey2.getParams(), eCPublicKey2.getW()), org.bouncycastle.c.b.a.a.a());
        }
        if (!cls.isAssignableFrom(f.class) || !(key instanceof ECPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        ECPrivateKey eCPrivateKey2 = (ECPrivateKey) key;
        if (eCPrivateKey2.getParams() != null) {
            return new f(eCPrivateKey2.getS(), EC5Util.a(eCPrivateKey2.getParams()));
        }
        return new f(eCPrivateKey2.getS(), org.bouncycastle.c.b.a.a.a());
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException("key type unknown");
    }
}
