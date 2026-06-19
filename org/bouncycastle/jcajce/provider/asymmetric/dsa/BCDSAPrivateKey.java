package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p056aa.InterfaceC0513aj;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0768i;
import org.bouncycastle.p083b.p097k.C1116s;
import org.bouncycastle.p103c.p104a.InterfaceC1198n;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: loaded from: classes.dex */
public class BCDSAPrivateKey implements DSAPrivateKey, InterfaceC1198n {

    /* JADX INFO: renamed from: a */
    private BigInteger f5637a;

    /* JADX INFO: renamed from: b */
    private transient DSAParams f5638b;

    /* JADX INFO: renamed from: c */
    private transient PKCS12BagAttributeCarrierImpl f5639c = new PKCS12BagAttributeCarrierImpl();

    protected BCDSAPrivateKey() {
    }

    BCDSAPrivateKey(DSAPrivateKey dSAPrivateKey) {
        this.f5637a = dSAPrivateKey.getX();
        this.f5638b = dSAPrivateKey.getParams();
    }

    BCDSAPrivateKey(DSAPrivateKeySpec dSAPrivateKeySpec) {
        this.f5637a = dSAPrivateKeySpec.getX();
        this.f5638b = new DSAParameterSpec(dSAPrivateKeySpec.getP(), dSAPrivateKeySpec.getQ(), dSAPrivateKeySpec.getG());
    }

    public BCDSAPrivateKey(C0676p c0676p) {
        C0768i c0768iM1813a = C0768i.m1813a(c0676p.m1658b().m1784b());
        this.f5637a = ((C0640m) c0676p.m1659c()).m1564b();
        this.f5638b = new DSAParameterSpec(c0768iM1813a.m1814a(), c0768iM1813a.m1815b(), c0768iM1813a.m1816c());
    }

    BCDSAPrivateKey(C1116s c1116s) {
        this.f5637a = c1116s.m2690c();
        this.f5638b = new DSAParameterSpec(c1116s.m2680b().m2686a(), c1116s.m2680b().m2687b(), c1116s.m2680b().m2688c());
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: a */
    public final InterfaceC0618f mo2845a(C0653p c0653p) {
        return this.f5639c.mo2845a(c0653p);
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: a */
    public final void mo2846a(C0653p c0653p, InterfaceC0618f interfaceC0618f) {
        this.f5639c.mo2846a(c0653p, interfaceC0618f);
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: b */
    public final Enumeration mo2847b() {
        return this.f5639c.mo2847b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPrivateKey)) {
            return false;
        }
        DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) obj;
        return getX().equals(dSAPrivateKey.getX()) && getParams().getG().equals(dSAPrivateKey.getParams().getG()) && getParams().getP().equals(dSAPrivateKey.getParams().getP()) && getParams().getQ().equals(dSAPrivateKey.getParams().getQ());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.m4341b(new C0759a(InterfaceC0513aj.f1921U, new C0768i(this.f5638b.getP(), this.f5638b.getQ(), this.f5638b.getG()).mo1358i()), new C0640m(getX()));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.DSAKey
    public DSAParams getParams() {
        return this.f5638b;
    }

    @Override // java.security.interfaces.DSAPrivateKey
    public BigInteger getX() {
        return this.f5637a;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strM4158a = C1560k.m4158a();
        BigInteger bigIntegerModPow = getParams().getG().modPow(this.f5637a, getParams().getP());
        stringBuffer.append("DSA Private Key [").append(DSAUtil.m4208a(bigIntegerModPow, getParams())).append("]").append(strM4158a);
        stringBuffer.append("            Y: ").append(bigIntegerModPow.toString(16)).append(strM4158a);
        return stringBuffer.toString();
    }
}
