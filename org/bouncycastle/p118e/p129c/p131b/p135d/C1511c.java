package org.bouncycastle.p118e.p129c.p131b.p135d;

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
import org.bouncycastle.p118e.p119a.C1432f;
import org.bouncycastle.p118e.p119a.C1433g;
import org.bouncycastle.p118e.p129c.p139c.C1522a;
import org.bouncycastle.p118e.p129c.p139c.C1523b;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.d.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1511c extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    /* JADX INFO: renamed from: a */
    public final PrivateKey mo3997a(C0676p c0676p) {
        C1432f c1432fM3741a = C1432f.m3741a(c0676p.m1659c());
        return new C1509a(c1432fM3741a.m3742a(), c1432fM3741a.m3743b(), c1432fM3741a.m3745d(), c1432fM3741a.m3744c(), c1432fM3741a.m3747f(), c1432fM3741a.m3746e());
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    /* JADX INFO: renamed from: a */
    public final PublicKey mo3998a(C0780u c0780u) {
        C1433g c1433gM3748a = C1433g.m3748a(c0780u.m1845b());
        return new C1510b(c1433gM3748a.m3749a(), c1433gM3748a.m3750b(), c1433gM3748a.m3751c(), c1433gM3748a.m3752d());
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof C1522a) {
            return new C1509a((C1522a) keySpec);
        }
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
        if (keySpec instanceof C1523b) {
            return new C1510b((C1523b) keySpec);
        }
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
        if (key instanceof C1509a) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (C1522a.class.isAssignableFrom(cls)) {
                C1509a c1509a = (C1509a) key;
                return new C1522a(c1509a.m4001a(), c1509a.m4002b(), c1509a.m4004d(), c1509a.m4003c(), c1509a.m4006f(), c1509a.m4005e());
            }
        } else {
            if (!(key instanceof C1510b)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
            if (C1523b.class.isAssignableFrom(cls)) {
                C1510b c1510b = (C1510b) key;
                return new C1523b(c1510b.m4007a(), c1510b.m4008b(), c1510b.m4009c(), c1510b.m4010d());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C1509a) || (key instanceof C1510b)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
