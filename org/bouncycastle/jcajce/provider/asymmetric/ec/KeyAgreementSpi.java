package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.a.aa.ai;
import org.bouncycastle.b.a.e;
import org.bouncycastle.b.a.f;
import org.bouncycastle.b.d;
import org.bouncycastle.b.i;
import org.bouncycastle.b.k.ad;
import org.bouncycastle.b.k.ae;
import org.bouncycastle.b.k.bb;
import org.bouncycastle.b.k.bc;
import org.bouncycastle.b.k.w;
import org.bouncycastle.b.k.x;
import org.bouncycastle.b.k.y;
import org.bouncycastle.b.p;
import org.bouncycastle.c.a.b;
import org.bouncycastle.c.a.c;
import org.bouncycastle.c.a.l;
import org.bouncycastle.c.a.m;
import org.bouncycastle.f.a;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.spec.DHUParameterSpec;
import org.bouncycastle.jcajce.spec.MQVParameterSpec;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;

/* JADX INFO: loaded from: classes.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private static final ai d = new ai();
    private String e;
    private y f;
    private Object g;
    private MQVParameterSpec h;
    private DHUParameterSpec i;
    private byte[] j;

    protected KeyAgreementSpi(String str, e eVar, p pVar) {
        super(str, pVar);
        this.e = str;
        this.g = eVar;
    }

    protected KeyAgreementSpi(String str, d dVar, p pVar) {
        super(str, pVar);
        this.e = str;
        this.g = dVar;
    }

    private static String a(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    private void a(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        ad adVar;
        ad adVar2;
        ae aeVar = null;
        if (this.g instanceof f) {
            this.h = null;
            if (!(key instanceof l) && !(algorithmParameterSpec instanceof MQVParameterSpec)) {
                throw new InvalidAlgorithmParameterException(this.e + " key agreement requires " + a(MQVParameterSpec.class) + " for initialisation");
            }
            if (key instanceof l) {
                l lVar = (l) key;
                adVar = (ad) ECUtil.a(lVar.a());
                adVar2 = (ad) ECUtil.a(lVar.b());
                if (lVar.c() != null) {
                    aeVar = (ae) ECUtils.a(lVar.c());
                }
            } else {
                MQVParameterSpec mQVParameterSpec = (MQVParameterSpec) algorithmParameterSpec;
                adVar = (ad) ECUtil.a((PrivateKey) key);
                adVar2 = (ad) ECUtil.a(mQVParameterSpec.a());
                aeVar = mQVParameterSpec.b() != null ? (ae) ECUtils.a(mQVParameterSpec.b()) : null;
                this.h = mQVParameterSpec;
                this.c = mQVParameterSpec.d();
            }
            bb bbVar = new bb(adVar, adVar2, aeVar);
            this.f = adVar.b();
            ((f) this.g).a(bbVar);
            return;
        }
        if (!(algorithmParameterSpec instanceof DHUParameterSpec)) {
            if (!(key instanceof PrivateKey)) {
                throw new InvalidKeyException(this.e + " key agreement requires " + a(b.class) + " for initialisation");
            }
            if (this.b == null && (algorithmParameterSpec instanceof UserKeyingMaterialSpec)) {
                throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
            }
            ad adVar3 = (ad) ECUtil.a((PrivateKey) key);
            this.f = adVar3.b();
            this.c = algorithmParameterSpec instanceof UserKeyingMaterialSpec ? ((UserKeyingMaterialSpec) algorithmParameterSpec).a() : null;
            ((d) this.g).a(adVar3);
            return;
        }
        if (!(this.g instanceof e)) {
            throw new InvalidAlgorithmParameterException(this.e + " key agreement cannot be used with " + a(DHUParameterSpec.class));
        }
        DHUParameterSpec dHUParameterSpec = (DHUParameterSpec) algorithmParameterSpec;
        ad adVar4 = (ad) ECUtil.a((PrivateKey) key);
        ad adVar5 = (ad) ECUtil.a(dHUParameterSpec.a());
        ae aeVar2 = dHUParameterSpec.b() != null ? (ae) ECUtils.a(dHUParameterSpec.b()) : null;
        this.i = dHUParameterSpec;
        this.c = dHUParameterSpec.d();
        w wVar = new w(adVar4, adVar5, aeVar2);
        this.f = adVar4.b();
        ((e) this.g).a(wVar);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected final byte[] a() {
        return a.b(this.j);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            a(key, null);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof MQVParameterSpec) && !(algorithmParameterSpec instanceof UserKeyingMaterialSpec) && !(algorithmParameterSpec instanceof DHUParameterSpec)) {
            throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
        }
        a(key, algorithmParameterSpec);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z) throws InvalidKeyException {
        i iVarA;
        if (this.f == null) {
            throw new IllegalStateException(this.e + " not initialised.");
        }
        if (!z) {
            throw new IllegalStateException(this.e + " can only be between two parties.");
        }
        if (this.g instanceof f) {
            if (key instanceof m) {
                m mVar = (m) key;
                iVarA = new bc((ae) ECUtils.a(mVar.a()), (ae) ECUtils.a(mVar.b()));
            } else {
                iVarA = new bc((ae) ECUtils.a((PublicKey) key), (ae) ECUtils.a(this.h.c()));
            }
        } else if (this.g instanceof e) {
            iVarA = new x((ae) ECUtils.a((PublicKey) key), (ae) ECUtils.a(this.i.c()));
        } else {
            if (!(key instanceof PublicKey)) {
                throw new InvalidKeyException(this.e + " key agreement requires " + a(c.class) + " for doPhase");
            }
            iVarA = ECUtils.a((PublicKey) key);
        }
        try {
            if (this.g instanceof d) {
                this.j = ai.a(((d) this.g).b(iVarA), ai.a(this.f.a()));
                return null;
            }
            this.j = ((e) this.g).b(iVarA);
            return null;
        } catch (Exception e) {
            throw new KeyAgreementSpi$1(this, "calculation failed: " + e.getMessage(), e);
        }
    }
}
