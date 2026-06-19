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
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p061f.InterfaceC0619a;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p103c.p105b.C1200a;
import org.bouncycastle.p103c.p106c.C1208e;
import org.bouncycastle.p103c.p106c.C1209f;
import org.bouncycastle.p103c.p106c.C1210g;

/* JADX INFO: loaded from: classes.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    /* JADX INFO: renamed from: a */
    public final PrivateKey mo3997a(C0676p c0676p) throws IOException {
        C0653p c0653pM1783a = c0676p.m1658b().m1783a();
        if (!c0653pM1783a.equals(InterfaceC0619a.f2205m) && !c0653pM1783a.equals(InterfaceC0619a.f2192F) && !c0653pM1783a.equals(InterfaceC0619a.f2191E)) {
            throw new IOException("algorithm identifier " + c0653pM1783a + " in key not recognised");
        }
        return new BCECGOST3410PrivateKey(c0676p);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    /* JADX INFO: renamed from: a */
    public final PublicKey mo3998a(C0780u c0780u) throws IOException {
        C0653p c0653pM1783a = c0780u.m1844a().m1783a();
        if (!c0653pM1783a.equals(InterfaceC0619a.f2205m) && !c0653pM1783a.equals(InterfaceC0619a.f2192F) && !c0653pM1783a.equals(InterfaceC0619a.f2191E)) {
            throw new IOException("algorithm identifier " + c0653pM1783a + " in key not recognised");
        }
        return new BCECGOST3410PublicKey(c0780u);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        return keySpec instanceof C1209f ? new BCECGOST3410PrivateKey((C1209f) keySpec) : keySpec instanceof ECPrivateKeySpec ? new BCECGOST3410PrivateKey((ECPrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) {
        return keySpec instanceof C1210g ? new BCECGOST3410PublicKey((C1210g) keySpec, C1200a.f4677a) : keySpec instanceof ECPublicKeySpec ? new BCECGOST3410PublicKey((ECPublicKeySpec) keySpec) : super.engineGeneratePublic(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(ECPublicKeySpec.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey = (ECPublicKey) key;
            if (eCPublicKey.getParams() != null) {
                return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            C1208e c1208eMo2859a = C1200a.f4677a.mo2859a();
            return new ECPublicKeySpec(eCPublicKey.getW(), EC5Util.m4310a(EC5Util.m4314a(c1208eMo2859a.m2869b()), c1208eMo2859a));
        }
        if (cls.isAssignableFrom(ECPrivateKeySpec.class) && (key instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) key;
            if (eCPrivateKey.getParams() != null) {
                return new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
            }
            C1208e c1208eMo2859a2 = C1200a.f4677a.mo2859a();
            return new ECPrivateKeySpec(eCPrivateKey.getS(), EC5Util.m4310a(EC5Util.m4314a(c1208eMo2859a2.m2869b()), c1208eMo2859a2));
        }
        if (cls.isAssignableFrom(C1210g.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey2 = (ECPublicKey) key;
            if (eCPublicKey2.getParams() != null) {
                return new C1210g(EC5Util.m4319a(eCPublicKey2.getParams(), eCPublicKey2.getW()), EC5Util.m4316a(eCPublicKey2.getParams()));
            }
            return new C1210g(EC5Util.m4319a(eCPublicKey2.getParams(), eCPublicKey2.getW()), C1200a.f4677a.mo2859a());
        }
        if (!cls.isAssignableFrom(C1209f.class) || !(key instanceof ECPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        ECPrivateKey eCPrivateKey2 = (ECPrivateKey) key;
        if (eCPrivateKey2.getParams() != null) {
            return new C1209f(eCPrivateKey2.getS(), EC5Util.m4316a(eCPrivateKey2.getParams()));
        }
        return new C1209f(eCPrivateKey2.getS(), C1200a.f4677a.mo2859a());
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException("key type unknown");
    }
}
