package org.bouncycastle.jcajce.provider.asymmetric.p147dh;

import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.spec.DHDomainParameterSpec;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p056aa.C0503a;
import org.bouncycastle.p054a.p056aa.C0515c;
import org.bouncycastle.p054a.p056aa.InterfaceC0513aj;
import org.bouncycastle.p054a.p074s.C0664d;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p083b.p097k.C1106i;
import org.bouncycastle.p083b.p097k.C1107j;
import org.bouncycastle.p083b.p097k.C1111n;
import org.bouncycastle.p103c.p104a.InterfaceC1198n;

/* JADX INFO: loaded from: classes.dex */
public class BCDHPrivateKey implements DHPrivateKey, InterfaceC1198n {

    /* JADX INFO: renamed from: a */
    private BigInteger f5595a;

    /* JADX INFO: renamed from: b */
    private transient DHParameterSpec f5596b;

    /* JADX INFO: renamed from: c */
    private transient C0676p f5597c;

    /* JADX INFO: renamed from: d */
    private transient C1107j f5598d;

    /* JADX INFO: renamed from: e */
    private transient PKCS12BagAttributeCarrierImpl f5599e = new PKCS12BagAttributeCarrierImpl();

    protected BCDHPrivateKey() {
    }

    BCDHPrivateKey(DHPrivateKey dHPrivateKey) {
        this.f5595a = dHPrivateKey.getX();
        this.f5596b = dHPrivateKey.getParams();
    }

    BCDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.f5595a = dHPrivateKeySpec.getX();
        this.f5596b = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public BCDHPrivateKey(C0676p c0676p) {
        AbstractC0723v abstractC0723vM1708a = AbstractC0723v.m1708a(c0676p.m1658b().m1784b());
        C0640m c0640m = (C0640m) c0676p.m1659c();
        C0653p c0653pM1783a = c0676p.m1658b().m1783a();
        this.f5597c = c0676p;
        this.f5595a = c0640m.m1564b();
        if (!c0653pM1783a.equals(InterfaceC0674n.f2748s)) {
            if (!c0653pM1783a.equals(InterfaceC0513aj.f1929ab)) {
                throw new IllegalArgumentException("unknown algorithm type: ".concat(String.valueOf(c0653pM1783a)));
            }
            C0503a c0503aM1351a = C0503a.m1351a(abstractC0723vM1708a);
            this.f5596b = new DHDomainParameterSpec(c0503aM1351a.m1353a(), c0503aM1351a.m1355c(), c0503aM1351a.m1354b(), c0503aM1351a.m1356d());
            this.f5598d = new C1107j(this.f5595a, new C1106i(c0503aM1351a.m1353a(), c0503aM1351a.m1354b(), c0503aM1351a.m1355c(), c0503aM1351a.m1356d(), null));
            return;
        }
        C0664d c0664dM1618a = C0664d.m1618a(abstractC0723vM1708a);
        if (c0664dM1618a.m1621c() != null) {
            this.f5596b = new DHParameterSpec(c0664dM1618a.m1619a(), c0664dM1618a.m1620b(), c0664dM1618a.m1621c().intValue());
            this.f5598d = new C1107j(this.f5595a, new C1106i(c0664dM1618a.m1619a(), c0664dM1618a.m1620b(), c0664dM1618a.m1621c().intValue()));
        } else {
            this.f5596b = new DHParameterSpec(c0664dM1618a.m1619a(), c0664dM1618a.m1620b());
            this.f5598d = new C1107j(this.f5595a, new C1106i(c0664dM1618a.m1619a(), c0664dM1618a.m1620b()));
        }
    }

    BCDHPrivateKey(C1107j c1107j) {
        this.f5595a = c1107j.m2671c();
        this.f5596b = new DHDomainParameterSpec(c1107j.m2658b());
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: a */
    public final InterfaceC0618f mo2845a(C0653p c0653p) {
        return this.f5599e.mo2845a(c0653p);
    }

    /* JADX INFO: renamed from: a */
    final C1107j m4196a() {
        return this.f5598d != null ? this.f5598d : this.f5596b instanceof DHDomainParameterSpec ? new C1107j(this.f5595a, ((DHDomainParameterSpec) this.f5596b).m4485b()) : new C1107j(this.f5595a, new C1106i(this.f5596b.getP(), this.f5596b.getG(), this.f5596b.getL()));
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: a */
    public final void mo2846a(C0653p c0653p, InterfaceC0618f interfaceC0618f) {
        this.f5599e.mo2846a(c0653p, interfaceC0618f);
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: b */
    public final Enumeration mo2847b() {
        return this.f5599e.mo2847b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPrivateKey)) {
            return false;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) obj;
        return getX().equals(dHPrivateKey.getX()) && getParams().getG().equals(dHPrivateKey.getParams().getG()) && getParams().getP().equals(dHPrivateKey.getParams().getP()) && getParams().getL() == dHPrivateKey.getParams().getL();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        C0676p c0676p;
        try {
            if (this.f5597c != null) {
                return this.f5597c.m1577a("DER");
            }
            if (!(this.f5596b instanceof DHDomainParameterSpec) || ((DHDomainParameterSpec) this.f5596b).m4484a() == null) {
                c0676p = new C0676p(new C0759a(InterfaceC0674n.f2748s, new C0664d(this.f5596b.getP(), this.f5596b.getG(), this.f5596b.getL()).mo1358i()), new C0640m(getX()));
            } else {
                C1106i c1106iM4485b = ((DHDomainParameterSpec) this.f5596b).m4485b();
                C1111n c1111nM2670g = c1106iM4485b.m2670g();
                c0676p = new C0676p(new C0759a(InterfaceC0513aj.f1929ab, new C0503a(c1106iM4485b.m2664a(), c1106iM4485b.m2665b(), c1106iM4485b.m2666c(), c1106iM4485b.m2667d(), c1111nM2670g != null ? new C0515c(c1111nM2670g.m2678b(), c1111nM2670g.m2677a()) : null).mo1358i()), new C0640m(getX()));
            }
            return c0676p.m1577a("DER");
        } catch (Exception e) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.f5596b;
    }

    @Override // javax.crypto.interfaces.DHPrivateKey
    public BigInteger getX() {
        return this.f5595a;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public String toString() {
        return DHUtil.m4198a("DH", this.f5595a, new C1106i(this.f5596b.getP(), this.f5596b.getG()));
    }
}
