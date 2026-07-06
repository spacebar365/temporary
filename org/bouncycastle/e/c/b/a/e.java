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
public final class e extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PrivateKey a(p pVar) {
        org.bouncycastle.e.a.a aVarA = org.bouncycastle.e.a.a.a(pVar.c().i());
        return new a(new org.bouncycastle.e.b.a.b(aVarA.a(), aVarA.b(), aVarA.c(), aVarA.d(), aVarA.e(), null));
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public final PublicKey a(u uVar) {
        org.bouncycastle.e.a.b bVarA = org.bouncycastle.e.a.b.a(uVar.b());
        return new b(new org.bouncycastle.e.b.a.c(bVarA.a(), bVarA.b(), bVarA.c(), g.a(bVarA.d()).a()));
    }

    @Override // java.security.KeyFactorySpi
    protected final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            p pVarA = p.a(org.bouncycastle.a.u.b(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!org.bouncycastle.e.a.e.n.equals(pVarA.b().a())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                }
                org.bouncycastle.e.a.a aVarA = org.bouncycastle.e.a.a.a(pVarA.c());
                return new a(new org.bouncycastle.e.b.a.b(aVarA.a(), aVarA.b(), aVarA.c(), aVarA.d(), aVarA.e(), g.a(aVarA.f()).a()));
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
                if (!org.bouncycastle.e.a.e.n.equals(uVarA.a().a())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                }
                org.bouncycastle.e.a.b bVarA = org.bouncycastle.e.a.b.a(uVarA.b());
                return new b(new org.bouncycastle.e.b.a.c(bVarA.a(), bVarA.b(), bVarA.c(), g.a(bVarA.d()).a()));
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
