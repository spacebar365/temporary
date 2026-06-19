package org.bouncycastle.p118e.p129c.p131b.p133b;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p082z.C0780u;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1505c extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    /* JADX INFO: renamed from: a */
    public final PrivateKey mo3997a(C0676p c0676p) {
        return new C1503a(c0676p);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    /* JADX INFO: renamed from: a */
    public final PublicKey mo3998a(C0780u c0780u) {
        return new C1504b(c0780u);
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            return mo3997a(C0676p.m1656a(AbstractC0686u.m1692b(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
        } catch (Exception e) {
            throw new InvalidKeySpecException(e.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
        }
        try {
            return mo3998a(C0780u.m1843a(((X509EncodedKeySpec) keySpec).getEncoded()));
        } catch (Exception e) {
            throw new InvalidKeySpecException(e.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C1503a) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof C1504b)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C1503a) || (key instanceof C1504b)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
