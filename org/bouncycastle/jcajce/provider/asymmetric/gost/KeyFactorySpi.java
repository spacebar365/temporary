package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import org.bouncycastle.a.f.a;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.z.u;
import org.bouncycastle.c.a.i;
import org.bouncycastle.c.a.j;
import org.bouncycastle.c.c.m;
import org.bouncycastle.c.c.n;
import org.bouncycastle.c.c.o;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;

/* JADX INFO: loaded from: classes.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey a(p pVar) throws IOException {
        org.bouncycastle.a.p pVarA = pVar.b().a();
        if (pVarA.equals(a.l)) {
            return new BCGOST3410PrivateKey(pVar);
        }
        throw new IOException("algorithm identifier " + pVarA + " in key not recognised");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey a(u uVar) throws IOException {
        org.bouncycastle.a.p pVarA = uVar.a().a();
        if (pVarA.equals(a.l)) {
            return new BCGOST3410PublicKey(uVar);
        }
        throw new IOException("algorithm identifier " + pVarA + " in key not recognised");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        return keySpec instanceof m ? new BCGOST3410PrivateKey((m) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) {
        return keySpec instanceof o ? new BCGOST3410PublicKey((o) keySpec) : super.engineGeneratePublic(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(o.class) && (key instanceof j)) {
            j jVar = (j) key;
            n nVarD = jVar.a().d();
            return new o(jVar.b(), nVarD.a(), nVarD.b(), nVarD.c());
        }
        if (!cls.isAssignableFrom(m.class) || !(key instanceof i)) {
            return super.engineGetKeySpec(key, cls);
        }
        i iVar = (i) key;
        n nVarD2 = iVar.a().d();
        return new m(iVar.c(), nVarD2.a(), nVarD2.b(), nVarD2.c());
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof j) {
            return new BCGOST3410PublicKey((j) key);
        }
        if (key instanceof i) {
            return new BCGOST3410PrivateKey((i) key);
        }
        throw new InvalidKeyException("key type unknown");
    }
}
