package org.bouncycastle.jcajce.provider.asymmetric.p148ec;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.C0558au;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p056aa.C0505ab;
import org.bouncycastle.p054a.p056aa.InterfaceC0513aj;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p076u.C0687a;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p083b.p097k.C1052ad;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p103c.p104a.InterfaceC1186b;
import org.bouncycastle.p103c.p104a.InterfaceC1198n;
import org.bouncycastle.p103c.p106c.C1208e;
import org.bouncycastle.p103c.p106c.C1209f;
import org.bouncycastle.p107d.p108a.AbstractC1381d;

/* JADX INFO: loaded from: classes.dex */
public class BCECPrivateKey implements ECPrivateKey, InterfaceC1186b, InterfaceC1198n {

    /* JADX INFO: renamed from: a */
    private String f5677a;

    /* JADX INFO: renamed from: b */
    private transient BigInteger f5678b;

    /* JADX INFO: renamed from: c */
    private transient ECParameterSpec f5679c;

    /* JADX INFO: renamed from: d */
    private transient ProviderConfiguration f5680d;

    /* JADX INFO: renamed from: e */
    private transient C0558au f5681e;

    /* JADX INFO: renamed from: f */
    private transient PKCS12BagAttributeCarrierImpl f5682f;

    protected BCECPrivateKey() {
        this.f5677a = "EC";
        this.f5682f = new PKCS12BagAttributeCarrierImpl();
    }

    public BCECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec, ProviderConfiguration providerConfiguration) {
        this.f5677a = "EC";
        this.f5682f = new PKCS12BagAttributeCarrierImpl();
        this.f5677a = str;
        this.f5678b = eCPrivateKeySpec.getS();
        this.f5679c = eCPrivateKeySpec.getParams();
        this.f5680d = providerConfiguration;
    }

    public BCECPrivateKey(String str, C1052ad c1052ad, BCECPublicKey bCECPublicKey, ECParameterSpec eCParameterSpec, ProviderConfiguration providerConfiguration) {
        this.f5677a = "EC";
        this.f5682f = new PKCS12BagAttributeCarrierImpl();
        this.f5677a = str;
        this.f5678b = c1052ad.m2565c();
        this.f5680d = providerConfiguration;
        if (eCParameterSpec == null) {
            C1122y c1122yB = c1052ad.m2563b();
            AbstractC1381d abstractC1381dM2699a = c1122yB.m2699a();
            c1122yB.m2704f();
            this.f5679c = new ECParameterSpec(EC5Util.m4314a(abstractC1381dM2699a), EC5Util.m4313a(c1122yB.m2700b()), c1122yB.m2701c(), c1122yB.m2702d().intValue());
        } else {
            this.f5679c = eCParameterSpec;
        }
        this.f5681e = m4224a(bCECPublicKey);
    }

    public BCECPrivateKey(String str, C1052ad c1052ad, BCECPublicKey bCECPublicKey, C1208e c1208e, ProviderConfiguration providerConfiguration) {
        this.f5677a = "EC";
        this.f5682f = new PKCS12BagAttributeCarrierImpl();
        this.f5677a = str;
        this.f5678b = c1052ad.m2565c();
        this.f5680d = providerConfiguration;
        if (c1208e == null) {
            C1122y c1122yB = c1052ad.m2563b();
            AbstractC1381d abstractC1381dM2699a = c1122yB.m2699a();
            c1122yB.m2704f();
            this.f5679c = new ECParameterSpec(EC5Util.m4314a(abstractC1381dM2699a), EC5Util.m4313a(c1122yB.m2700b()), c1122yB.m2701c(), c1122yB.m2702d().intValue());
        } else {
            this.f5679c = EC5Util.m4310a(EC5Util.m4314a(c1208e.m2869b()), c1208e);
        }
        try {
            this.f5681e = m4224a(bCECPublicKey);
        } catch (Exception e) {
            this.f5681e = null;
        }
    }

    public BCECPrivateKey(String str, C1052ad c1052ad, ProviderConfiguration providerConfiguration) {
        this.f5677a = "EC";
        this.f5682f = new PKCS12BagAttributeCarrierImpl();
        this.f5677a = str;
        this.f5678b = c1052ad.m2565c();
        this.f5679c = null;
        this.f5680d = providerConfiguration;
    }

    public BCECPrivateKey(String str, C1209f c1209f, ProviderConfiguration providerConfiguration) {
        this.f5677a = "EC";
        this.f5682f = new PKCS12BagAttributeCarrierImpl();
        this.f5677a = str;
        this.f5678b = c1209f.m2874b();
        if (c1209f.m2865a() != null) {
            this.f5679c = EC5Util.m4310a(EC5Util.m4314a(c1209f.m2865a().m2869b()), c1209f.m2865a());
        } else {
            this.f5679c = null;
        }
        this.f5680d = providerConfiguration;
    }

    public BCECPrivateKey(ECPrivateKey eCPrivateKey, ProviderConfiguration providerConfiguration) {
        this.f5677a = "EC";
        this.f5682f = new PKCS12BagAttributeCarrierImpl();
        this.f5678b = eCPrivateKey.getS();
        this.f5677a = eCPrivateKey.getAlgorithm();
        this.f5679c = eCPrivateKey.getParams();
        this.f5680d = providerConfiguration;
    }

    /* JADX INFO: renamed from: a */
    private static C0558au m4224a(BCECPublicKey bCECPublicKey) {
        try {
            return C0780u.m1843a(AbstractC0686u.m1692b(bCECPublicKey.getEncoded())).m1846c();
        } catch (IOException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private C1208e m4225d() {
        return this.f5679c != null ? EC5Util.m4316a(this.f5679c) : this.f5680d.mo2859a();
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: a */
    public final InterfaceC0618f mo2845a(C0653p c0653p) {
        return this.f5682f.mo2845a(c0653p);
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1185a
    /* JADX INFO: renamed from: a */
    public final C1208e mo2827a() {
        if (this.f5679c == null) {
            return null;
        }
        return EC5Util.m4316a(this.f5679c);
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: a */
    public final void mo2846a(C0653p c0653p, InterfaceC0618f interfaceC0618f) {
        this.f5682f.mo2846a(c0653p, interfaceC0618f);
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: b */
    public final Enumeration mo2847b() {
        return this.f5682f.mo2847b();
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1186b
    /* JADX INFO: renamed from: c */
    public final BigInteger mo2828c() {
        return this.f5678b;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f5677a;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        C0505ab c0505abM4229a = ECUtils.m4229a(this.f5679c);
        int iM4321a = this.f5679c == null ? ECUtil.m4321a(this.f5680d, (BigInteger) null, getS()) : ECUtil.m4321a(this.f5680d, this.f5679c.getOrder(), getS());
        try {
            return new C0676p(new C0759a(InterfaceC0513aj.f1952k, c0505abM4229a), this.f5681e != null ? new C0687a(iM4321a, getS(), this.f5681e, c0505abM4229a) : new C0687a(iM4321a, getS(), c0505abM4229a)).m1577a("DER");
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.f5679c;
    }

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        return this.f5678b;
    }

    public String toString() {
        return ECUtil.m4322a("EC", this.f5678b, m4225d());
    }

    BCECPrivateKey(String str, C0676p c0676p, ProviderConfiguration providerConfiguration) {
        this.f5677a = "EC";
        this.f5682f = new PKCS12BagAttributeCarrierImpl();
        this.f5677a = str;
        this.f5680d = providerConfiguration;
        C0505ab c0505abM1359a = C0505ab.m1359a(c0676p.m1658b().m1784b());
        this.f5679c = EC5Util.m4311a(c0505abM1359a, EC5Util.m4318a(this.f5680d, c0505abM1359a));
        InterfaceC0618f interfaceC0618fM1659c = c0676p.m1659c();
        if (interfaceC0618fM1659c instanceof C0640m) {
            this.f5678b = C0640m.m1561a(interfaceC0618fM1659c).m1564b();
            return;
        }
        C0687a c0687aM1693a = C0687a.m1693a(interfaceC0618fM1659c);
        this.f5678b = c0687aM1693a.m1695a();
        this.f5681e = c0687aM1693a.m1696b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECPrivateKey)) {
            return false;
        }
        BCECPrivateKey bCECPrivateKey = (BCECPrivateKey) obj;
        return this.f5678b.equals(bCECPrivateKey.f5678b) && m4225d().equals(bCECPrivateKey.m4225d());
    }

    public int hashCode() {
        return this.f5678b.hashCode() ^ m4225d().hashCode();
    }
}
