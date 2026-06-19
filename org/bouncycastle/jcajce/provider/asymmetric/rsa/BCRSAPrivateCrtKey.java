package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p074s.C0679s;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p083b.p097k.C1089bn;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: loaded from: classes.dex */
public class BCRSAPrivateCrtKey extends BCRSAPrivateKey implements RSAPrivateCrtKey {

    /* JADX INFO: renamed from: c */
    private BigInteger f5852c;

    /* JADX INFO: renamed from: d */
    private BigInteger f5853d;

    /* JADX INFO: renamed from: e */
    private BigInteger f5854e;

    /* JADX INFO: renamed from: f */
    private BigInteger f5855f;

    /* JADX INFO: renamed from: g */
    private BigInteger f5856g;

    /* JADX INFO: renamed from: h */
    private BigInteger f5857h;

    BCRSAPrivateCrtKey(RSAPrivateCrtKey rSAPrivateCrtKey) {
        this.f5859a = rSAPrivateCrtKey.getModulus();
        this.f5852c = rSAPrivateCrtKey.getPublicExponent();
        this.f5860b = rSAPrivateCrtKey.getPrivateExponent();
        this.f5853d = rSAPrivateCrtKey.getPrimeP();
        this.f5854e = rSAPrivateCrtKey.getPrimeQ();
        this.f5855f = rSAPrivateCrtKey.getPrimeExponentP();
        this.f5856g = rSAPrivateCrtKey.getPrimeExponentQ();
        this.f5857h = rSAPrivateCrtKey.getCrtCoefficient();
    }

    BCRSAPrivateCrtKey(RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec) {
        this.f5859a = rSAPrivateCrtKeySpec.getModulus();
        this.f5852c = rSAPrivateCrtKeySpec.getPublicExponent();
        this.f5860b = rSAPrivateCrtKeySpec.getPrivateExponent();
        this.f5853d = rSAPrivateCrtKeySpec.getPrimeP();
        this.f5854e = rSAPrivateCrtKeySpec.getPrimeQ();
        this.f5855f = rSAPrivateCrtKeySpec.getPrimeExponentP();
        this.f5856g = rSAPrivateCrtKeySpec.getPrimeExponentQ();
        this.f5857h = rSAPrivateCrtKeySpec.getCrtCoefficient();
    }

    BCRSAPrivateCrtKey(C0676p c0676p) {
        this(C0679s.m1668a(c0676p.m1659c()));
    }

    BCRSAPrivateCrtKey(C0679s c0679s) {
        this.f5859a = c0679s.m1669a();
        this.f5852c = c0679s.m1670b();
        this.f5860b = c0679s.m1671c();
        this.f5853d = c0679s.m1672d();
        this.f5854e = c0679s.m1673e();
        this.f5855f = c0679s.m1674f();
        this.f5856g = c0679s.m1675g();
        this.f5857h = c0679s.m1676h();
    }

    BCRSAPrivateCrtKey(C1089bn c1089bn) {
        super(c1089bn);
        this.f5852c = c1089bn.m2627d();
        this.f5853d = c1089bn.m2628e();
        this.f5854e = c1089bn.m2629f();
        this.f5855f = c1089bn.m2630g();
        this.f5856g = c1089bn.m2631h();
        this.f5857h = c1089bn.m2632i();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RSAPrivateCrtKey)) {
            return false;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) obj;
        return getModulus().equals(rSAPrivateCrtKey.getModulus()) && getPublicExponent().equals(rSAPrivateCrtKey.getPublicExponent()) && getPrivateExponent().equals(rSAPrivateCrtKey.getPrivateExponent()) && getPrimeP().equals(rSAPrivateCrtKey.getPrimeP()) && getPrimeQ().equals(rSAPrivateCrtKey.getPrimeQ()) && getPrimeExponentP().equals(rSAPrivateCrtKey.getPrimeExponentP()) && getPrimeExponentQ().equals(rSAPrivateCrtKey.getPrimeExponentQ()) && getCrtCoefficient().equals(rSAPrivateCrtKey.getCrtCoefficient());
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getCrtCoefficient() {
        return this.f5857h;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey, java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.m4341b(new C0759a(InterfaceC0674n.f2733f_, C0579bc.f2112a), new C0679s(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient()));
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey, java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeExponentP() {
        return this.f5855f;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeExponentQ() {
        return this.f5856g;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeP() {
        return this.f5853d;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeQ() {
        return this.f5854e;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPublicExponent() {
        return this.f5852c;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey
    public int hashCode() {
        return (getModulus().hashCode() ^ getPublicExponent().hashCode()) ^ getPrivateExponent().hashCode();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strM4158a = C1560k.m4158a();
        stringBuffer.append("RSA Private CRT Key [").append(RSAUtil.m4296a(getModulus())).append("],[").append(RSAUtil.m4300b(getPublicExponent())).append("]").append(strM4158a);
        stringBuffer.append("             modulus: ").append(getModulus().toString(16)).append(strM4158a);
        stringBuffer.append("     public exponent: ").append(getPublicExponent().toString(16)).append(strM4158a);
        return stringBuffer.toString();
    }
}
