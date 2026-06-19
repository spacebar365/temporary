package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1115r;
import org.bouncycastle.p083b.p097k.C1116s;
import org.bouncycastle.p083b.p097k.C1117t;
import org.bouncycastle.p083b.p102o.C1165b;
import org.bouncycastle.p083b.p102o.C1166c;
import org.bouncycastle.p103c.p106c.C1220q;
import org.bouncycastle.p103c.p106c.C1221r;

/* JADX INFO: loaded from: classes.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    /* JADX INFO: renamed from: a */
    public final PrivateKey mo3997a(C0676p c0676p) throws IOException {
        C0653p c0653pM1783a = c0676p.m1658b().m1783a();
        if (DSAUtil.m4212a(c0653pM1783a)) {
            return new BCDSAPrivateKey(c0676p);
        }
        throw new IOException("algorithm identifier " + c0653pM1783a + " in key not recognised");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    /* JADX INFO: renamed from: a */
    public final PublicKey mo3998a(C0780u c0780u) throws IOException {
        C0653p c0653pM1783a = c0780u.m1844a().m1783a();
        if (DSAUtil.m4212a(c0653pM1783a)) {
            return new BCDSAPublicKey(c0780u);
        }
        throw new IOException("algorithm identifier " + c0653pM1783a + " in key not recognised");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof DSAPrivateKeySpec) {
            return new BCDSAPrivateKey((DSAPrivateKeySpec) keySpec);
        }
        if (!(keySpec instanceof C1220q)) {
            return super.engineGeneratePrivate(keySpec);
        }
        C1075b c1075bM2788a = C1165b.m2788a(((C1220q) keySpec).getEncoded());
        if (c1075bM2788a instanceof C1116s) {
            return engineGeneratePrivate(new DSAPrivateKeySpec(((C1116s) c1075bM2788a).m2690c(), ((C1116s) c1075bM2788a).m2680b().m2686a(), ((C1116s) c1075bM2788a).m2680b().m2687b(), ((C1116s) c1075bM2788a).m2680b().m2688c()));
        }
        throw new IllegalArgumentException("openssh private key is not dsa privare key");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof DSAPublicKeySpec) {
            try {
                return new BCDSAPublicKey((DSAPublicKeySpec) keySpec);
            } catch (Exception e) {
                throw new InvalidKeySpecException("invalid KeySpec: " + e.getMessage()) { // from class: org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyFactorySpi.1
                    @Override // java.lang.Throwable
                    public Throwable getCause() {
                        return e;
                    }
                };
            }
        }
        if (!(keySpec instanceof C1221r)) {
            return super.engineGeneratePublic(keySpec);
        }
        C1075b c1075bM2791a = C1166c.m2791a(((C1221r) keySpec).getEncoded());
        if (c1075bM2791a instanceof C1117t) {
            return engineGeneratePublic(new DSAPublicKeySpec(((C1117t) c1075bM2791a).m2691c(), ((C1117t) c1075bM2791a).m2680b().m2686a(), ((C1117t) c1075bM2791a).m2680b().m2687b(), ((C1117t) c1075bM2791a).m2680b().m2688c()));
        }
        throw new IllegalArgumentException("openssh public key is not dsa public key");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(DSAPublicKeySpec.class) && (key instanceof DSAPublicKey)) {
            DSAPublicKey dSAPublicKey = (DSAPublicKey) key;
            return new DSAPublicKeySpec(dSAPublicKey.getY(), dSAPublicKey.getParams().getP(), dSAPublicKey.getParams().getQ(), dSAPublicKey.getParams().getG());
        }
        if (cls.isAssignableFrom(DSAPrivateKeySpec.class) && (key instanceof DSAPrivateKey)) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) key;
            return new DSAPrivateKeySpec(dSAPrivateKey.getX(), dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG());
        }
        if (cls.isAssignableFrom(C1221r.class) && (key instanceof DSAPublicKey)) {
            DSAPublicKey dSAPublicKey2 = (DSAPublicKey) key;
            try {
                return new C1221r(C1166c.m2792a(new C1117t(dSAPublicKey2.getY(), new C1115r(dSAPublicKey2.getParams().getP(), dSAPublicKey2.getParams().getQ(), dSAPublicKey2.getParams().getG()))));
            } catch (IOException e) {
                throw new IllegalArgumentException("unable to produce encoding: " + e.getMessage());
            }
        }
        if (!cls.isAssignableFrom(C1220q.class) || !(key instanceof DSAPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        DSAPrivateKey dSAPrivateKey2 = (DSAPrivateKey) key;
        try {
            return new C1220q(C1165b.m2790a(new C1116s(dSAPrivateKey2.getX(), new C1115r(dSAPrivateKey2.getParams().getP(), dSAPrivateKey2.getParams().getQ(), dSAPrivateKey2.getParams().getG()))));
        } catch (IOException e2) {
            throw new IllegalArgumentException("unable to produce encoding: " + e2.getMessage());
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof DSAPublicKey) {
            return new BCDSAPublicKey((DSAPublicKey) key);
        }
        if (key instanceof DSAPrivateKey) {
            return new BCDSAPrivateKey((DSAPrivateKey) key);
        }
        throw new InvalidKeyException("key type unknown");
    }
}
