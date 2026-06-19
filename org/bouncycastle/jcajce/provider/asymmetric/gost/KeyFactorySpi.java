package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p061f.InterfaceC0619a;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p103c.p104a.InterfaceC1193i;
import org.bouncycastle.p103c.p104a.InterfaceC1194j;
import org.bouncycastle.p103c.p106c.C1216m;
import org.bouncycastle.p103c.p106c.C1217n;
import org.bouncycastle.p103c.p106c.C1218o;

/* JADX INFO: loaded from: classes.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    /* JADX INFO: renamed from: a */
    public final PrivateKey mo3997a(C0676p c0676p) throws IOException {
        C0653p c0653pM1783a = c0676p.m1658b().m1783a();
        if (c0653pM1783a.equals(InterfaceC0619a.f2204l)) {
            return new BCGOST3410PrivateKey(c0676p);
        }
        throw new IOException("algorithm identifier " + c0653pM1783a + " in key not recognised");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    /* JADX INFO: renamed from: a */
    public final PublicKey mo3998a(C0780u c0780u) throws IOException {
        C0653p c0653pM1783a = c0780u.m1844a().m1783a();
        if (c0653pM1783a.equals(InterfaceC0619a.f2204l)) {
            return new BCGOST3410PublicKey(c0780u);
        }
        throw new IOException("algorithm identifier " + c0653pM1783a + " in key not recognised");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        return keySpec instanceof C1216m ? new BCGOST3410PrivateKey((C1216m) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) {
        return keySpec instanceof C1218o ? new BCGOST3410PublicKey((C1218o) keySpec) : super.engineGeneratePublic(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(C1218o.class) && (key instanceof InterfaceC1194j)) {
            InterfaceC1194j interfaceC1194j = (InterfaceC1194j) key;
            C1217n c1217nMo2835d = interfaceC1194j.mo2831a().mo2835d();
            return new C1218o(interfaceC1194j.mo2837b(), c1217nMo2835d.m2886a(), c1217nMo2835d.m2887b(), c1217nMo2835d.m2888c());
        }
        if (!cls.isAssignableFrom(C1216m.class) || !(key instanceof InterfaceC1193i)) {
            return super.engineGetKeySpec(key, cls);
        }
        InterfaceC1193i interfaceC1193i = (InterfaceC1193i) key;
        C1217n c1217nMo2835d2 = interfaceC1193i.mo2831a().mo2835d();
        return new C1216m(interfaceC1193i.mo2836c(), c1217nMo2835d2.m2886a(), c1217nMo2835d2.m2887b(), c1217nMo2835d2.m2888c());
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof InterfaceC1194j) {
            return new BCGOST3410PublicKey((InterfaceC1194j) key);
        }
        if (key instanceof InterfaceC1193i) {
            return new BCGOST3410PrivateKey((InterfaceC1193i) key);
        }
        throw new InvalidKeyException("key type unknown");
    }
}
