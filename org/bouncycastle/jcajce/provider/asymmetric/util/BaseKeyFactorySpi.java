package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p082z.C0780u;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseKeyFactorySpi extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    @Override // java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("key spec not recognized");
        }
        try {
            return mo3997a(C0676p.m1656a(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
        } catch (Exception e) {
            throw new InvalidKeySpecException("encoded key spec not recognized: " + e.getMessage());
        }
    }

    @Override // java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException("key spec not recognized");
        }
        try {
            return mo3998a(C0780u.m1843a(((X509EncodedKeySpec) keySpec).getEncoded()));
        } catch (Exception e) {
            throw new InvalidKeySpecException("encoded key spec not recognized: " + e.getMessage());
        }
    }

    @Override // java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(PKCS8EncodedKeySpec.class) && key.getFormat().equals("PKCS#8")) {
            return new PKCS8EncodedKeySpec(key.getEncoded());
        }
        if (cls.isAssignableFrom(X509EncodedKeySpec.class) && key.getFormat().equals("X.509")) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException("not implemented yet " + key + " " + cls);
    }
}
