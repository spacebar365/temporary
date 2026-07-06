package org.bouncycastle.e.c.b.a;

import java.io.IOException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.z.u;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

/* JADX INFO: loaded from: classes.dex */
public final class f extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey a(p pVar) {
        org.bouncycastle.e.a.c cVarA = org.bouncycastle.e.a.c.a(pVar.c().i());
        return new c(new org.bouncycastle.e.b.a.f(cVarA.a(), cVarA.b(), cVarA.c(), cVarA.d(), cVarA.f(), cVarA.g(), cVarA.e()));
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey a(u uVar) {
        org.bouncycastle.e.a.d dVarA = org.bouncycastle.e.a.d.a(uVar.b());
        return new d(new org.bouncycastle.e.b.a.g(dVarA.a(), dVarA.b(), dVarA.c()));
    }

    @Override // java.security.KeyFactorySpi
    protected final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            p pVarA = p.a(org.bouncycastle.a.u.b(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!org.bouncycastle.e.a.e.m.equals(pVarA.b().a())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                }
                org.bouncycastle.e.a.c cVarA = org.bouncycastle.e.a.c.a(pVarA.c());
                return new c(new org.bouncycastle.e.b.a.f(cVarA.a(), cVarA.b(), cVarA.c(), cVarA.d(), cVarA.f(), cVarA.g(), cVarA.e()));
            } catch (IOException e) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
            }
        } catch (IOException e2) {
            throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: ".concat(String.valueOf(e2)));
        }
    }

    @Override // java.security.KeyFactorySpi
    protected final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            u uVarA = u.a(org.bouncycastle.a.u.b(((X509EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!org.bouncycastle.e.a.e.m.equals(uVarA.a().a())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                }
                org.bouncycastle.e.a.d dVarA = org.bouncycastle.e.a.d.a(uVarA.b());
                return new d(new org.bouncycastle.e.b.a.g(dVarA.a(), dVarA.b(), dVarA.c()));
            } catch (IOException e) {
                throw new InvalidKeySpecException("Unable to decode X509EncodedKeySpec: " + e.getMessage());
            }
        } catch (IOException e2) {
            throw new InvalidKeySpecException(e2.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    protected final KeySpec engineGetKeySpec(Key key, Class cls) {
        return null;
    }

    @Override // java.security.KeyFactorySpi
    protected final Key engineTranslateKey(Key key) {
        return null;
    }
}
