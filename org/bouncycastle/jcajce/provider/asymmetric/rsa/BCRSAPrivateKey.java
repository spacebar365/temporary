package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.f;
import org.bouncycastle.a.p;
import org.bouncycastle.a.s.s;
import org.bouncycastle.a.z.a;
import org.bouncycastle.b.k.bm;
import org.bouncycastle.c.a.n;
import org.bouncycastle.f.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;

/* JADX INFO: loaded from: classes.dex */
public class BCRSAPrivateKey implements RSAPrivateKey, n {
    private static BigInteger c = BigInteger.valueOf(0);
    protected BigInteger a;
    protected BigInteger b;
    private transient PKCS12BagAttributeCarrierImpl d = new PKCS12BagAttributeCarrierImpl();

    protected BCRSAPrivateKey() {
    }

    BCRSAPrivateKey(RSAPrivateKey rSAPrivateKey) {
        this.a = rSAPrivateKey.getModulus();
        this.b = rSAPrivateKey.getPrivateExponent();
    }

    BCRSAPrivateKey(RSAPrivateKeySpec rSAPrivateKeySpec) {
        this.a = rSAPrivateKeySpec.getModulus();
        this.b = rSAPrivateKeySpec.getPrivateExponent();
    }

    BCRSAPrivateKey(s sVar) {
        this.a = sVar.a();
        this.b = sVar.c();
    }

    BCRSAPrivateKey(bm bmVar) {
        this.a = bmVar.b();
        this.b = bmVar.c();
    }

    @Override // org.bouncycastle.c.a.n
    public final f a(p pVar) {
        return this.d.a(pVar);
    }

    @Override // org.bouncycastle.c.a.n
    public final void a(p pVar, f fVar) {
        this.d.a(pVar, fVar);
    }

    @Override // org.bouncycastle.c.a.n
    public final Enumeration b() {
        return this.d.b();
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
        a aVar = new a(org.bouncycastle.a.s.n.f_, bc.a);
        BigInteger modulus = getModulus();
        BigInteger bigInteger = c;
        BigInteger privateExponent = getPrivateExponent();
        BigInteger bigInteger2 = c;
        BigInteger bigInteger3 = c;
        return KeyUtil.b(aVar, new s(modulus, bigInteger, privateExponent, bigInteger2, bigInteger2, bigInteger3, bigInteger3, c));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        return this.a;
    }

    @Override // java.security.interfaces.RSAPrivateKey
    public BigInteger getPrivateExponent() {
        return this.b;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPrivateExponent().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strA = k.a();
        stringBuffer.append("RSA Private Key [").append(RSAUtil.a(getModulus())).append("],[]").append(strA);
        stringBuffer.append("            modulus: ").append(getModulus().toString(16)).append(strA);
        return stringBuffer.toString();
    }
}
