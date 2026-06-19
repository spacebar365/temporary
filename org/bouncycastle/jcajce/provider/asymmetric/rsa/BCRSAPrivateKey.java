package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p074s.C0679s;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p083b.p097k.C1088bm;
import org.bouncycastle.p103c.p104a.InterfaceC1198n;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: loaded from: classes.dex */
public class BCRSAPrivateKey implements RSAPrivateKey, InterfaceC1198n {

    /* JADX INFO: renamed from: c */
    private static BigInteger f5858c = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: a */
    protected BigInteger f5859a;

    /* JADX INFO: renamed from: b */
    protected BigInteger f5860b;

    /* JADX INFO: renamed from: d */
    private transient PKCS12BagAttributeCarrierImpl f5861d = new PKCS12BagAttributeCarrierImpl();

    protected BCRSAPrivateKey() {
    }

    BCRSAPrivateKey(RSAPrivateKey rSAPrivateKey) {
        this.f5859a = rSAPrivateKey.getModulus();
        this.f5860b = rSAPrivateKey.getPrivateExponent();
    }

    BCRSAPrivateKey(RSAPrivateKeySpec rSAPrivateKeySpec) {
        this.f5859a = rSAPrivateKeySpec.getModulus();
        this.f5860b = rSAPrivateKeySpec.getPrivateExponent();
    }

    BCRSAPrivateKey(C0679s c0679s) {
        this.f5859a = c0679s.m1669a();
        this.f5860b = c0679s.m1671c();
    }

    BCRSAPrivateKey(C1088bm c1088bm) {
        this.f5859a = c1088bm.m2625b();
        this.f5860b = c1088bm.m2626c();
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: a */
    public final InterfaceC0618f mo2845a(C0653p c0653p) {
        return this.f5861d.mo2845a(c0653p);
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: a */
    public final void mo2846a(C0653p c0653p, InterfaceC0618f interfaceC0618f) {
        this.f5861d.mo2846a(c0653p, interfaceC0618f);
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: b */
    public final Enumeration mo2847b() {
        return this.f5861d.mo2847b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RSAPrivateKey)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) obj;
        return getModulus().equals(rSAPrivateKey.getModulus()) && getPrivateExponent().equals(rSAPrivateKey.getPrivateExponent());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "RSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        C0759a c0759a = new C0759a(InterfaceC0674n.f2733f_, C0579bc.f2112a);
        BigInteger modulus = getModulus();
        BigInteger bigInteger = f5858c;
        BigInteger privateExponent = getPrivateExponent();
        BigInteger bigInteger2 = f5858c;
        BigInteger bigInteger3 = f5858c;
        return KeyUtil.m4341b(c0759a, new C0679s(modulus, bigInteger, privateExponent, bigInteger2, bigInteger2, bigInteger3, bigInteger3, f5858c));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        return this.f5859a;
    }

    @Override // java.security.interfaces.RSAPrivateKey
    public BigInteger getPrivateExponent() {
        return this.f5860b;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPrivateExponent().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strM4158a = C1560k.m4158a();
        stringBuffer.append("RSA Private Key [").append(RSAUtil.m4296a(getModulus())).append("],[]").append(strM4158a);
        stringBuffer.append("            modulus: ").append(getModulus().toString(16)).append(strM4158a);
        return stringBuffer.toString();
    }
}
