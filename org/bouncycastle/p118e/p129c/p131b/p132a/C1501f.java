package org.bouncycastle.p118e.p129c.p131b.p132a;

import java.io.IOException;
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
import org.bouncycastle.p118e.p119a.C1429c;
import org.bouncycastle.p118e.p119a.C1430d;
import org.bouncycastle.p118e.p119a.InterfaceC1431e;
import org.bouncycastle.p118e.p120b.p121a.C1446f;
import org.bouncycastle.p118e.p120b.p121a.C1447g;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.a.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1501f extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    /* JADX INFO: renamed from: a */
    public final PrivateKey mo3997a(C0676p c0676p) {
        C1429c c1429cM3729a = C1429c.m3729a(c0676p.m1659c().mo1358i());
        return new C1498c(new C1446f(c1429cM3729a.m3730a(), c1429cM3729a.m3731b(), c1429cM3729a.m3732c(), c1429cM3729a.m3733d(), c1429cM3729a.m3735f(), c1429cM3729a.m3736g(), c1429cM3729a.m3734e()));
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    /* JADX INFO: renamed from: a */
    public final PublicKey mo3998a(C0780u c0780u) {
        C1430d c1430dM3737a = C1430d.m3737a(c0780u.m1845b());
        return new C1499d(new C1447g(c1430dM3737a.m3738a(), c1430dM3737a.m3739b(), c1430dM3737a.m3740c()));
    }

    @Override // java.security.KeyFactorySpi
    protected final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            C0676p c0676pM1656a = C0676p.m1656a(AbstractC0686u.m1692b(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!InterfaceC1431e.f5182m.equals(c0676pM1656a.m1658b().m1783a())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                }
                C1429c c1429cM3729a = C1429c.m3729a(c0676pM1656a.m1659c());
                return new C1498c(new C1446f(c1429cM3729a.m3730a(), c1429cM3729a.m3731b(), c1429cM3729a.m3732c(), c1429cM3729a.m3733d(), c1429cM3729a.m3735f(), c1429cM3729a.m3736g(), c1429cM3729a.m3734e()));
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
            C0780u c0780uM1843a = C0780u.m1843a(AbstractC0686u.m1692b(((X509EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!InterfaceC1431e.f5182m.equals(c0780uM1843a.m1844a().m1783a())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                }
                C1430d c1430dM3737a = C1430d.m3737a(c0780uM1843a.m1845b());
                return new C1499d(new C1447g(c1430dM3737a.m3738a(), c1430dM3737a.m3739b(), c1430dM3737a.m3740c()));
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
