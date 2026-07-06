package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.a.aa.aj;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.u.a;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.k.ae;
import org.bouncycastle.b.k.b;
import org.bouncycastle.b.k.y;
import org.bouncycastle.b.o.c;
import org.bouncycastle.c.c.e;
import org.bouncycastle.c.c.f;
import org.bouncycastle.c.c.g;
import org.bouncycastle.c.c.q;
import org.bouncycastle.c.c.r;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

/* JADX INFO: loaded from: classes.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi implements AsymmetricKeyInfoConverter {
    String a;
    ProviderConfiguration b;

    KeyFactorySpi(String str, ProviderConfiguration providerConfiguration) {
        this.a = str;
        this.b = providerConfiguration;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey a(p pVar) throws IOException {
        org.bouncycastle.a.p pVarA = pVar.b().a();
        if (pVarA.equals(aj.k)) {
            return new BCECPrivateKey(this.a, pVar, this.b);
        }
        throw new IOException("algorithm identifier " + pVarA + " in key not recognised");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey a(u uVar) throws IOException {
        org.bouncycastle.a.p pVarA = uVar.a().a();
        if (pVarA.equals(aj.k)) {
            return new BCECPublicKey(this.a, uVar, this.b);
        }
        throw new IOException("algorithm identifier " + pVarA + " in key not recognised");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof f) {
            return new BCECPrivateKey(this.a, (f) keySpec, this.b);
        }
        if (keySpec instanceof ECPrivateKeySpec) {
            return new BCECPrivateKey(this.a, (ECPrivateKeySpec) keySpec, this.b);
        }
        if (!(keySpec instanceof q)) {
            return super.engineGeneratePrivate(keySpec);
        }
        a aVarA = a.a(((q) keySpec).getEncoded());
        try {
            return new BCECPrivateKey(this.a, new p(new org.bouncycastle.a.z.a(aj.k, aVarA.c()), aVarA), this.b);
        } catch (IOException e) {
            throw new InvalidKeySpecException("bad encoding: " + e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        try {
            if (keySpec instanceof g) {
                return new BCECPublicKey(this.a, (g) keySpec, this.b);
            }
            if (keySpec instanceof ECPublicKeySpec) {
                return new BCECPublicKey(this.a, (ECPublicKeySpec) keySpec, this.b);
            }
            if (!(keySpec instanceof r)) {
                return super.engineGeneratePublic(keySpec);
            }
            b bVarA = c.a(((r) keySpec).getEncoded());
            if (!(bVarA instanceof ae)) {
                throw new IllegalArgumentException("openssh key is not ec public key");
            }
            y yVarB = ((ae) bVarA).b();
            return engineGeneratePublic(new g(((ae) bVarA).c(), new e(yVarB.a(), yVarB.b(), yVarB.c(), yVarB.d(), yVarB.f())));
        } catch (Exception e) {
            throw new InvalidKeySpecException("invalid KeySpec: " + e.getMessage(), e);
        }
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
        if (cls.isAssignableFrom(f.class) && (key instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey2 = (ECPrivateKey) key;
            if (eCPrivateKey2.getParams() != null) {
                return new f(eCPrivateKey2.getS(), EC5Util.a(eCPrivateKey2.getParams()));
            }
            return new f(eCPrivateKey2.getS(), org.bouncycastle.c.b.a.a.a());
        }
        if (cls.isAssignableFrom(r.class) && (key instanceof ECPublicKey)) {
            if (!(key instanceof BCECPublicKey)) {
                throw new IllegalArgumentException("invalid key type: " + key.getClass().getName());
            }
            BCECPublicKey bCECPublicKey = (BCECPublicKey) key;
            e eVarA3 = bCECPublicKey.a();
            try {
                return new r(c.a(new ae(bCECPublicKey.c(), new y(eVarA3.b(), eVarA3.c(), eVarA3.d(), eVarA3.e(), eVarA3.f()))));
            } catch (IOException e) {
                throw new IllegalArgumentException("unable to produce encoding: " + e.getMessage());
            }
        }
        if (!cls.isAssignableFrom(q.class) || !(key instanceof ECPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        if (!(key instanceof BCECPrivateKey)) {
            throw new IllegalArgumentException("invalid key type: " + key.getClass().getName());
        }
        try {
            return new q(p.a(key.getEncoded()).c().i().k());
        } catch (IOException e2) {
            throw new IllegalArgumentException("cannot encoded key: " + e2.getMessage());
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof ECPublicKey) {
            return new BCECPublicKey((ECPublicKey) key, this.b);
        }
        if (key instanceof ECPrivateKey) {
            return new BCECPrivateKey((ECPrivateKey) key, this.b);
        }
        throw new InvalidKeyException("key type unknown");
    }
}
