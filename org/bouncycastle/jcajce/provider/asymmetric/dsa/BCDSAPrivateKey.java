package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.a.aa.aj;
import org.bouncycastle.a.f;
import org.bouncycastle.a.m;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.z.a;
import org.bouncycastle.a.z.i;
import org.bouncycastle.b.k.s;
import org.bouncycastle.c.a.n;
import org.bouncycastle.f.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;

/* JADX INFO: loaded from: classes.dex */
public class BCDSAPrivateKey implements DSAPrivateKey, n {
    private BigInteger a;
    private transient DSAParams b;
    private transient PKCS12BagAttributeCarrierImpl c = new PKCS12BagAttributeCarrierImpl();

    protected BCDSAPrivateKey() {
    }

    BCDSAPrivateKey(DSAPrivateKey dSAPrivateKey) {
        this.a = dSAPrivateKey.getX();
        this.b = dSAPrivateKey.getParams();
    }

    BCDSAPrivateKey(DSAPrivateKeySpec dSAPrivateKeySpec) {
        this.a = dSAPrivateKeySpec.getX();
        this.b = new DSAParameterSpec(dSAPrivateKeySpec.getP(), dSAPrivateKeySpec.getQ(), dSAPrivateKeySpec.getG());
    }

    public BCDSAPrivateKey(p pVar) {
        i iVarA = i.a(pVar.b().b());
        this.a = ((m) pVar.c()).b();
        this.b = new DSAParameterSpec(iVarA.a(), iVarA.b(), iVarA.c());
    }

    BCDSAPrivateKey(s sVar) {
        this.a = sVar.c();
        this.b = new DSAParameterSpec(sVar.b().a(), sVar.b().b(), sVar.b().c());
    }

    @Override // org.bouncycastle.c.a.n
    public final f a(org.bouncycastle.a.p pVar) {
        return this.c.a(pVar);
    }

    @Override // org.bouncycastle.c.a.n
    public final void a(org.bouncycastle.a.p pVar, f fVar) {
        this.c.a(pVar, fVar);
    }

    @Override // org.bouncycastle.c.a.n
    public final Enumeration b() {
        return this.c.b();
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
        return KeyUtil.b(new a(aj.U, new i(this.b.getP(), this.b.getQ(), this.b.getG()).i()), new m(getX()));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.DSAKey
    public DSAParams getParams() {
        return this.b;
    }

    @Override // java.security.interfaces.DSAPrivateKey
    public BigInteger getX() {
        return this.a;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strA = k.a();
        BigInteger bigIntegerModPow = getParams().getG().modPow(this.a, getParams().getP());
        stringBuffer.append("DSA Private Key [").append(DSAUtil.a(bigIntegerModPow, getParams())).append("]").append(strA);
        stringBuffer.append("            Y: ").append(bigIntegerModPow.toString(16)).append(strA);
        return stringBuffer.toString();
    }
}
