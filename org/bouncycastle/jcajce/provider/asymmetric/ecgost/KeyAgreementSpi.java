package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.a.aa.ai;
import org.bouncycastle.b.a.g;
import org.bouncycastle.b.k.ad;
import org.bouncycastle.b.k.bh;
import org.bouncycastle.b.k.y;
import org.bouncycastle.c.a.b;
import org.bouncycastle.c.a.c;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;

/* JADX INFO: loaded from: classes.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private static final ai d = new ai();
    private String e;
    private y f;
    private g g;
    private byte[] h;

    protected KeyAgreementSpi(String str, g gVar) {
        super(str, null);
        this.e = str;
        this.g = gVar;
    }

    private static String a(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    private void a(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException {
        if (!(key instanceof PrivateKey)) {
            throw new InvalidKeyException(this.e + " key agreement requires " + a(b.class) + " for initialisation");
        }
        ad adVar = (ad) ECUtil.a((PrivateKey) key);
        this.f = adVar.b();
        this.c = algorithmParameterSpec instanceof UserKeyingMaterialSpec ? ((UserKeyingMaterialSpec) algorithmParameterSpec).a() : null;
        this.g.a(new bh(adVar, this.c));
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected final byte[] a() {
        return this.h;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        a(key, null);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof UserKeyingMaterialSpec)) {
            throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
        }
        a(key, algorithmParameterSpec);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z) throws InvalidKeyException {
        if (this.f == null) {
            throw new IllegalStateException(this.e + " not initialised.");
        }
        if (!z) {
            throw new IllegalStateException(this.e + " can only be between two parties.");
        }
        if (!(key instanceof PublicKey)) {
            throw new InvalidKeyException(this.e + " key agreement requires " + a(c.class) + " for doPhase");
        }
        PublicKey publicKey = (PublicKey) key;
        try {
            this.h = this.g.b(publicKey instanceof BCECPublicKey ? ((BCECGOST3410PublicKey) publicKey).b() : ECUtil.a(publicKey));
            return null;
        } catch (Exception e) {
            throw new KeyAgreementSpi$1(this, "calculation failed: " + e.getMessage(), e);
        }
    }
}
