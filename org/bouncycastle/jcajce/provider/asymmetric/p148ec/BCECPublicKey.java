package org.bouncycastle.jcajce.provider.asymmetric.p148ec;

import java.io.IOException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.p056aa.C0505ab;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p054a.p056aa.C0512ai;
import org.bouncycastle.p054a.p056aa.InterfaceC0513aj;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p083b.p097k.C1053ae;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p103c.p104a.InterfaceC1187c;
import org.bouncycastle.p103c.p106c.C1208e;
import org.bouncycastle.p103c.p106c.C1210g;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1389j;

/* JADX INFO: loaded from: classes.dex */
public class BCECPublicKey implements ECPublicKey, InterfaceC1187c {

    /* JADX INFO: renamed from: a */
    private String f5683a;

    /* JADX INFO: renamed from: b */
    private boolean f5684b;

    /* JADX INFO: renamed from: c */
    private transient C1053ae f5685c;

    /* JADX INFO: renamed from: d */
    private transient ECParameterSpec f5686d;

    /* JADX INFO: renamed from: e */
    private transient ProviderConfiguration f5687e;

    public BCECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec, ProviderConfiguration providerConfiguration) {
        this.f5683a = "EC";
        this.f5683a = str;
        this.f5686d = eCPublicKeySpec.getParams();
        this.f5685c = new C1053ae(EC5Util.m4319a(this.f5686d, eCPublicKeySpec.getW()), EC5Util.m4315a(providerConfiguration, eCPublicKeySpec.getParams()));
        this.f5687e = providerConfiguration;
    }

    public BCECPublicKey(String str, C1053ae c1053ae, ECParameterSpec eCParameterSpec, ProviderConfiguration providerConfiguration) {
        this.f5683a = "EC";
        C1122y c1122yB = c1053ae.m2563b();
        this.f5683a = str;
        this.f5685c = c1053ae;
        if (eCParameterSpec == null) {
            AbstractC1381d abstractC1381dM2699a = c1122yB.m2699a();
            c1122yB.m2704f();
            this.f5686d = m4226a(EC5Util.m4314a(abstractC1381dM2699a), c1122yB);
        } else {
            this.f5686d = eCParameterSpec;
        }
        this.f5687e = providerConfiguration;
    }

    public BCECPublicKey(String str, C1053ae c1053ae, C1208e c1208e, ProviderConfiguration providerConfiguration) {
        this.f5683a = "EC";
        C1122y c1122yB = c1053ae.m2563b();
        this.f5683a = str;
        if (c1208e == null) {
            AbstractC1381d abstractC1381dM2699a = c1122yB.m2699a();
            c1122yB.m2704f();
            this.f5686d = m4226a(EC5Util.m4314a(abstractC1381dM2699a), c1122yB);
        } else {
            this.f5686d = EC5Util.m4310a(EC5Util.m4314a(c1208e.m2869b()), c1208e);
        }
        this.f5685c = c1053ae;
        this.f5687e = providerConfiguration;
    }

    public BCECPublicKey(String str, C1053ae c1053ae, ProviderConfiguration providerConfiguration) {
        this.f5683a = "EC";
        this.f5683a = str;
        this.f5685c = c1053ae;
        this.f5686d = null;
        this.f5687e = providerConfiguration;
    }

    public BCECPublicKey(ECPublicKey eCPublicKey, ProviderConfiguration providerConfiguration) {
        this.f5683a = "EC";
        this.f5683a = eCPublicKey.getAlgorithm();
        this.f5686d = eCPublicKey.getParams();
        this.f5685c = new C1053ae(EC5Util.m4319a(this.f5686d, eCPublicKey.getW()), EC5Util.m4315a(providerConfiguration, eCPublicKey.getParams()));
    }

    /* JADX INFO: renamed from: a */
    private static ECParameterSpec m4226a(EllipticCurve ellipticCurve, C1122y c1122y) {
        return new ECParameterSpec(ellipticCurve, EC5Util.m4313a(c1122y.m2700b()), c1122y.m2701c(), c1122y.m2702d().intValue());
    }

    /* JADX INFO: renamed from: d */
    private C1208e m4227d() {
        return this.f5686d != null ? EC5Util.m4316a(this.f5686d) : this.f5687e.mo2859a();
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1185a
    /* JADX INFO: renamed from: a */
    public final C1208e mo2827a() {
        if (this.f5686d == null) {
            return null;
        }
        return EC5Util.m4316a(this.f5686d);
    }

    /* JADX INFO: renamed from: b */
    final C1053ae m4228b() {
        return this.f5685c;
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1187c
    /* JADX INFO: renamed from: c */
    public final AbstractC1389j mo2829c() {
        AbstractC1389j abstractC1389jM2566c = this.f5685c.m2566c();
        return this.f5686d == null ? abstractC1389jM2566c.m3456c() : abstractC1389jM2566c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECPublicKey)) {
            return false;
        }
        BCECPublicKey bCECPublicKey = (BCECPublicKey) obj;
        return this.f5685c.m2566c().m3450a(bCECPublicKey.f5685c.m2566c()) && m4227d().equals(bCECPublicKey.m4227d());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f5683a;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.m4340a(new C0780u(new C0759a(InterfaceC0513aj.f1952k, ECUtils.m4229a(this.f5686d)), AbstractC0655q.m1596a((Object) new C0509af(this.f5685c.m2566c(), this.f5684b).mo1358i()).mo1410c()));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.f5686d;
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return EC5Util.m4313a(this.f5685c.m2566c());
    }

    public int hashCode() {
        return this.f5685c.m2566c().hashCode() ^ m4227d().hashCode();
    }

    public String toString() {
        return ECUtil.m4323a("EC", this.f5685c.m2566c(), m4227d());
    }

    public BCECPublicKey(String str, C1210g c1210g, ProviderConfiguration providerConfiguration) {
        this.f5683a = "EC";
        this.f5683a = str;
        if (c1210g.m2865a() != null) {
            EllipticCurve ellipticCurveM4314a = EC5Util.m4314a(c1210g.m2865a().m2869b());
            this.f5685c = new C1053ae(c1210g.m2875b(), ECUtil.m4331a(providerConfiguration, c1210g.m2865a()));
            this.f5686d = EC5Util.m4310a(ellipticCurveM4314a, c1210g.m2865a());
        } else {
            this.f5685c = new C1053ae(providerConfiguration.mo2859a().m2869b().mo3355a(c1210g.m2875b().m3461g().mo2928a(), c1210g.m2875b().m3462h().mo2928a(), false), EC5Util.m4315a(providerConfiguration, (ECParameterSpec) null));
            this.f5686d = null;
        }
        this.f5687e = providerConfiguration;
    }

    BCECPublicKey(String str, C0780u c0780u, ProviderConfiguration providerConfiguration) {
        this.f5683a = "EC";
        this.f5683a = str;
        this.f5687e = providerConfiguration;
        C0505ab c0505abM1359a = C0505ab.m1359a(c0780u.m1844a().m1784b());
        AbstractC1381d abstractC1381dM4318a = EC5Util.m4318a(this.f5687e, c0505abM1359a);
        this.f5686d = EC5Util.m4311a(c0505abM1359a, abstractC1381dM4318a);
        byte[] bArrD = c0780u.m1846c().m1474d();
        AbstractC0655q c0581be = new C0581be(bArrD);
        if (bArrD[0] == 4 && bArrD[1] == bArrD.length - 2 && (bArrD[2] == 2 || bArrD[2] == 3)) {
            new C0512ai();
            if (C0512ai.m1376a(abstractC1381dM4318a) >= bArrD.length - 3) {
                try {
                    c0581be = (AbstractC0655q) AbstractC0686u.m1692b(bArrD);
                } catch (IOException e) {
                    throw new IllegalArgumentException("error recovering public key");
                }
            }
        }
        this.f5685c = new C1053ae(new C0509af(abstractC1381dM4318a, c0581be).m1372a(), ECUtil.m4330a(this.f5687e, c0505abM1359a));
    }
}
