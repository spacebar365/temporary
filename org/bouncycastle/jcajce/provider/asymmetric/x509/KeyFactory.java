package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p103c.p105b.C1200a;

/* JADX INFO: loaded from: classes.dex */
public class KeyFactory extends KeyFactorySpi {
    @Override // java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unknown KeySpec type: " + keySpec.getClass().getName());
        }
        try {
            C0676p c0676pM1656a = C0676p.m1656a(((PKCS8EncodedKeySpec) keySpec).getEncoded());
            PrivateKey privateKeyM2848a = C1200a.m2848a(c0676pM1656a);
            if (privateKeyM2848a != null) {
                return privateKeyM2848a;
            }
            throw new InvalidKeySpecException("no factory found for OID: " + c0676pM1656a.m1658b().m1783a());
        } catch (Exception e) {
            throw new InvalidKeySpecException(e.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unknown KeySpec type: " + keySpec.getClass().getName());
        }
        try {
            C0780u c0780uM1843a = C0780u.m1843a(((X509EncodedKeySpec) keySpec).getEncoded());
            PublicKey publicKeyM2849a = C1200a.m2849a(c0780uM1843a);
            if (publicKeyM2849a != null) {
                return publicKeyM2849a;
            }
            throw new InvalidKeySpecException("no factory found for OID: " + c0780uM1843a.m1844a().m1783a());
        } catch (Exception e) {
            throw new InvalidKeySpecException(e.toString());
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

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException("not implemented yet ".concat(String.valueOf(key)));
    }
}
