package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.bouncycastle.p054a.p056aa.C0512ai;
import org.bouncycastle.p083b.p084a.C0796g;
import org.bouncycastle.p083b.p086b.C0829f;
import org.bouncycastle.p083b.p086b.C0830g;
import org.bouncycastle.p083b.p097k.C1052ad;
import org.bouncycastle.p083b.p097k.C1083bh;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p103c.p104a.InterfaceC1186b;
import org.bouncycastle.p103c.p104a.InterfaceC1187c;

/* JADX INFO: loaded from: classes.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {

    /* JADX INFO: renamed from: d */
    private static final C0512ai f5775d = new C0512ai();

    /* JADX INFO: renamed from: e */
    private String f5776e;

    /* JADX INFO: renamed from: f */
    private C1122y f5777f;

    /* JADX INFO: renamed from: g */
    private C0796g f5778g;

    /* JADX INFO: renamed from: h */
    private byte[] f5779h;

    public static class ECVKO256 extends KeyAgreementSpi {
        public ECVKO256() {
            super("ECGOST3410-2012-256", new C0796g(new C0829f()));
        }
    }

    public static class ECVKO512 extends KeyAgreementSpi {
        public ECVKO512() {
            super("ECGOST3410-2012-512", new C0796g(new C0830g()));
        }
    }

    protected KeyAgreementSpi(String str, C0796g c0796g) {
        super(str, null);
        this.f5776e = str;
        this.f5778g = c0796g;
    }

    /* JADX INFO: renamed from: a */
    private static String m4262a(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    /* JADX INFO: renamed from: a */
    private void m4263a(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException {
        if (!(key instanceof PrivateKey)) {
            throw new InvalidKeyException(this.f5776e + " key agreement requires " + m4262a(InterfaceC1186b.class) + " for initialisation");
        }
        C1052ad c1052ad = (C1052ad) ECUtil.m4328a((PrivateKey) key);
        this.f5777f = c1052ad.m2563b();
        this.f5906c = algorithmParameterSpec instanceof UserKeyingMaterialSpec ? ((UserKeyingMaterialSpec) algorithmParameterSpec).m4517a() : null;
        this.f5778g.m1889a(new C1083bh(c1052ad, this.f5906c));
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    /* JADX INFO: renamed from: a */
    protected final byte[] mo4204a() {
        return this.f5779h;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        m4263a(key, null);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof UserKeyingMaterialSpec)) {
            throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
        }
        m4263a(key, algorithmParameterSpec);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z) throws InvalidKeyException {
        if (this.f5777f == null) {
            throw new IllegalStateException(this.f5776e + " not initialised.");
        }
        if (!z) {
            throw new IllegalStateException(this.f5776e + " can only be between two parties.");
        }
        if (!(key instanceof PublicKey)) {
            throw new InvalidKeyException(this.f5776e + " key agreement requires " + m4262a(InterfaceC1187c.class) + " for doPhase");
        }
        PublicKey publicKey = (PublicKey) key;
        try {
            this.f5779h = this.f5778g.m1890b(publicKey instanceof BCECGOST3410_2012PublicKey ? ((BCECGOST3410_2012PublicKey) publicKey).m4260b() : ECUtil.m4329a(publicKey));
            return null;
        } catch (Exception e) {
            throw new InvalidKeyException("calculation failed: " + e.getMessage()) { // from class: org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyAgreementSpi.1
                @Override // java.lang.Throwable
                public Throwable getCause() {
                    return e;
                }
            };
        }
    }
}
