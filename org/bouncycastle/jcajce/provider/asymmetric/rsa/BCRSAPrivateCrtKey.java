package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.s.n;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.s.s;
import org.bouncycastle.a.z.a;
import org.bouncycastle.b.k.bn;
import org.bouncycastle.f.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;

/* JADX INFO: loaded from: classes.dex */
public class BCRSAPrivateCrtKey extends BCRSAPrivateKey implements RSAPrivateCrtKey {
    private BigInteger c;
    private BigInteger d;
    private BigInteger e;
    private BigInteger f;
    private BigInteger g;
    private BigInteger h;

    BCRSAPrivateCrtKey(RSAPrivateCrtKey rSAPrivateCrtKey) {
        this.a = rSAPrivateCrtKey.getModulus();
        this.c = rSAPrivateCrtKey.getPublicExponent();
        this.b = rSAPrivateCrtKey.getPrivateExponent();
        this.d = rSAPrivateCrtKey.getPrimeP();
        this.e = rSAPrivateCrtKey.getPrimeQ();
        this.f = rSAPrivateCrtKey.getPrimeExponentP();
        this.g = rSAPrivateCrtKey.getPrimeExponentQ();
        this.h = rSAPrivateCrtKey.getCrtCoefficient();
    }

    BCRSAPrivateCrtKey(RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec) {
        this.a = rSAPrivateCrtKeySpec.getModulus();
        this.c = rSAPrivateCrtKeySpec.getPublicExponent();
        this.b = rSAPrivateCrtKeySpec.getPrivateExponent();
        this.d = rSAPrivateCrtKeySpec.getPrimeP();
        this.e = rSAPrivateCrtKeySpec.getPrimeQ();
        this.f = rSAPrivateCrtKeySpec.getPrimeExponentP();
        this.g = rSAPrivateCrtKeySpec.getPrimeExponentQ();
        this.h = rSAPrivateCrtKeySpec.getCrtCoefficient();
    }

    BCRSAPrivateCrtKey(p pVar) {
        this(s.a(pVar.c()));
    }

    BCRSAPrivateCrtKey(s sVar) {
        this.a = sVar.a();
        this.c = sVar.b();
        this.b = sVar.c();
        this.d = sVar.d();
        this.e = sVar.e();
        this.f = sVar.f();
        this.g = sVar.g();
        this.h = sVar.h();
    }

    BCRSAPrivateCrtKey(bn bnVar) {
        super(bnVar);
        this.c = bnVar.d();
        this.d = bnVar.e();
        this.e = bnVar.f();
        this.f = bnVar.g();
        this.g = bnVar.h();
        this.h = bnVar.i();
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
        return this.h;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey, java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.b(new a(n.f_, bc.a), new s(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient()));
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey, java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeExponentP() {
        return this.f;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeExponentQ() {
        return this.g;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeP() {
        return this.d;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeQ() {
        return this.e;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPublicExponent() {
        return this.c;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey
    public int hashCode() {
        return (getModulus().hashCode() ^ getPublicExponent().hashCode()) ^ getPrivateExponent().hashCode();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strA = k.a();
        stringBuffer.append("RSA Private CRT Key [").append(RSAUtil.a(getModulus())).append("],[").append(RSAUtil.b(getPublicExponent())).append("]").append(strA);
        stringBuffer.append("             modulus: ").append(getModulus().toString(16)).append(strA);
        stringBuffer.append("     public exponent: ").append(getPublicExponent().toString(16)).append(strA);
        return stringBuffer.toString();
    }
}
