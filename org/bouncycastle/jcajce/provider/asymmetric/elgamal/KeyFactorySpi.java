package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p056aa.InterfaceC0513aj;
import org.bouncycastle.p054a.p073r.InterfaceC0659b;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p103c.p104a.InterfaceC1189e;
import org.bouncycastle.p103c.p104a.InterfaceC1190f;
import org.bouncycastle.p103c.p106c.C1213j;
import org.bouncycastle.p103c.p106c.C1214k;

/* JADX INFO: loaded from: classes.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    /* JADX INFO: renamed from: a */
    public final PrivateKey mo3997a(C0676p c0676p) throws IOException {
        C0653p c0653pM1783a = c0676p.m1658b().m1783a();
        if (!c0653pM1783a.equals(InterfaceC0674n.f2748s) && !c0653pM1783a.equals(InterfaceC0513aj.f1929ab) && !c0653pM1783a.equals(InterfaceC0659b.f2578l)) {
            throw new IOException("algorithm identifier " + c0653pM1783a + " in key not recognised");
        }
        return new BCElGamalPrivateKey(c0676p);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    /* JADX INFO: renamed from: a */
    public final PublicKey mo3998a(C0780u c0780u) throws IOException {
        C0653p c0653pM1783a = c0780u.m1844a().m1783a();
        if (!c0653pM1783a.equals(InterfaceC0674n.f2748s) && !c0653pM1783a.equals(InterfaceC0513aj.f1929ab) && !c0653pM1783a.equals(InterfaceC0659b.f2578l)) {
            throw new IOException("algorithm identifier " + c0653pM1783a + " in key not recognised");
        }
        return new BCElGamalPublicKey(c0780u);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        return keySpec instanceof C1213j ? new BCElGamalPrivateKey((C1213j) keySpec) : keySpec instanceof DHPrivateKeySpec ? new BCElGamalPrivateKey((DHPrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) {
        return keySpec instanceof C1214k ? new BCElGamalPublicKey((C1214k) keySpec) : keySpec instanceof DHPublicKeySpec ? new BCElGamalPublicKey((DHPublicKeySpec) keySpec) : super.engineGeneratePublic(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(DHPrivateKeySpec.class) && (key instanceof DHPrivateKey)) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            return new DHPrivateKeySpec(dHPrivateKey.getX(), dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
        }
        if (!cls.isAssignableFrom(DHPublicKeySpec.class) || !(key instanceof DHPublicKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        DHPublicKey dHPublicKey = (DHPublicKey) key;
        return new DHPublicKeySpec(dHPublicKey.getY(), dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof DHPublicKey) {
            return new BCElGamalPublicKey((DHPublicKey) key);
        }
        if (key instanceof DHPrivateKey) {
            return new BCElGamalPrivateKey((DHPrivateKey) key);
        }
        if (key instanceof InterfaceC1190f) {
            return new BCElGamalPublicKey((InterfaceC1190f) key);
        }
        if (key instanceof InterfaceC1189e) {
            return new BCElGamalPrivateKey((InterfaceC1189e) key);
        }
        throw new InvalidKeyException("key type unknown");
    }
}
