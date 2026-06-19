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
import org.bouncycastle.p118e.p119a.C1427a;
import org.bouncycastle.p118e.p119a.C1428b;
import org.bouncycastle.p118e.p119a.InterfaceC1431e;
import org.bouncycastle.p118e.p120b.p121a.C1442b;
import org.bouncycastle.p118e.p120b.p121a.C1443c;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1500e extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    /* JADX INFO: renamed from: a */
    public final PrivateKey mo3997a(C0676p c0676p) {
        C1427a c1427aM3717a = C1427a.m3717a(c0676p.m1659c().mo1358i());
        return new C1496a(new C1442b(c1427aM3717a.m3718a(), c1427aM3717a.m3719b(), c1427aM3717a.m3720c(), c1427aM3717a.m3721d(), c1427aM3717a.m3722e(), null));
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    /* JADX INFO: renamed from: a */
    public final PublicKey mo3998a(C0780u c0780u) {
        C1428b c1428bM3724a = C1428b.m3724a(c0780u.m1845b());
        return new C1497b(new C1443c(c1428bM3724a.m3725a(), c1428bM3724a.m3726b(), c1428bM3724a.m3727c(), C1502g.m4000a(c1428bM3724a.m3728d()).mo1927a()));
    }

    @Override // java.security.KeyFactorySpi
    protected final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            C0676p c0676pM1656a = C0676p.m1656a(AbstractC0686u.m1692b(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!InterfaceC1431e.f5183n.equals(c0676pM1656a.m1658b().m1783a())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                }
                C1427a c1427aM3717a = C1427a.m3717a(c0676pM1656a.m1659c());
                return new C1496a(new C1442b(c1427aM3717a.m3718a(), c1427aM3717a.m3719b(), c1427aM3717a.m3720c(), c1427aM3717a.m3721d(), c1427aM3717a.m3722e(), C1502g.m4000a(c1427aM3717a.m3723f()).mo1927a()));
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
                if (!InterfaceC1431e.f5183n.equals(c0780uM1843a.m1844a().m1783a())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                }
                C1428b c1428bM3724a = C1428b.m3724a(c0780uM1843a.m1845b());
                return new C1497b(new C1443c(c1428bM3724a.m3725a(), c1428bM3724a.m3726b(), c1428bM3724a.m3727c(), C1502g.m4000a(c1428bM3724a.m3728d()).mo1927a()));
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
