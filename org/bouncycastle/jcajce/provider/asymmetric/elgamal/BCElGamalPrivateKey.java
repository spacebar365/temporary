package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p073r.C0658a;
import org.bouncycastle.p054a.p073r.InterfaceC0659b;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p083b.p097k.C1063ao;
import org.bouncycastle.p103c.p104a.InterfaceC1189e;
import org.bouncycastle.p103c.p104a.InterfaceC1198n;
import org.bouncycastle.p103c.p106c.C1212i;
import org.bouncycastle.p103c.p106c.C1213j;

/* JADX INFO: loaded from: classes.dex */
public class BCElGamalPrivateKey implements DHPrivateKey, InterfaceC1189e, InterfaceC1198n {

    /* JADX INFO: renamed from: a */
    private BigInteger f5818a;

    /* JADX INFO: renamed from: b */
    private transient C1212i f5819b;

    /* JADX INFO: renamed from: c */
    private transient PKCS12BagAttributeCarrierImpl f5820c = new PKCS12BagAttributeCarrierImpl();

    protected BCElGamalPrivateKey() {
    }

    BCElGamalPrivateKey(DHPrivateKey dHPrivateKey) {
        this.f5818a = dHPrivateKey.getX();
        this.f5819b = new C1212i(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
    }

    BCElGamalPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.f5818a = dHPrivateKeySpec.getX();
        this.f5819b = new C1212i(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    BCElGamalPrivateKey(C0676p c0676p) {
        C0658a c0658aM1598a = C0658a.m1598a(c0676p.m1658b().m1784b());
        this.f5818a = C0640m.m1561a(c0676p.m1659c()).m1564b();
        this.f5819b = new C1212i(c0658aM1598a.m1599a(), c0658aM1598a.m1600b());
    }

    BCElGamalPrivateKey(C1063ao c1063ao) {
        this.f5818a = c1063ao.m2582c();
        this.f5819b = new C1212i(c1063ao.m2578b().m2579a(), c1063ao.m2578b().m2580b());
    }

    BCElGamalPrivateKey(InterfaceC1189e interfaceC1189e) {
        this.f5818a = interfaceC1189e.getX();
        this.f5819b = interfaceC1189e.mo2830a();
    }

    BCElGamalPrivateKey(C1213j c1213j) {
        this.f5818a = c1213j.m2879b();
        this.f5819b = new C1212i(c1213j.m2876a().m2877a(), c1213j.m2876a().m2878b());
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: a */
    public final InterfaceC0618f mo2845a(C0653p c0653p) {
        return this.f5820c.mo2845a(c0653p);
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1188d
    /* JADX INFO: renamed from: a */
    public final C1212i mo2830a() {
        return this.f5819b;
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: a */
    public final void mo2846a(C0653p c0653p, InterfaceC0618f interfaceC0618f) {
        this.f5820c.mo2846a(c0653p, interfaceC0618f);
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: b */
    public final Enumeration mo2847b() {
        return this.f5820c.mo2847b();
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
        return "ElGamal";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new C0676p(new C0759a(InterfaceC0659b.f2578l, new C0658a(this.f5819b.m2877a(), this.f5819b.m2878b())), new C0640m(getX())).m1577a("DER");
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.f5819b.m2877a(), this.f5819b.m2878b());
    }

    @Override // javax.crypto.interfaces.DHPrivateKey, org.bouncycastle.p103c.p104a.InterfaceC1189e
    public BigInteger getX() {
        return this.f5818a;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }
}
