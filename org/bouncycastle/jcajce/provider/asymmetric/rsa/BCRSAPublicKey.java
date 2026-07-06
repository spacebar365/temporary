package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.s.n;
import org.bouncycastle.a.s.t;
import org.bouncycastle.a.z.a;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.k.bm;
import org.bouncycastle.f.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;

/* JADX INFO: loaded from: classes.dex */
public class BCRSAPublicKey implements RSAPublicKey {
    private static final a a = new a(n.f_, bc.a);
    private BigInteger b;
    private BigInteger c;
    private transient a d;

    BCRSAPublicKey(RSAPublicKey rSAPublicKey) {
        this.d = a;
        this.b = rSAPublicKey.getModulus();
        this.c = rSAPublicKey.getPublicExponent();
    }

    BCRSAPublicKey(RSAPublicKeySpec rSAPublicKeySpec) {
        this.d = a;
        this.b = rSAPublicKeySpec.getModulus();
        this.c = rSAPublicKeySpec.getPublicExponent();
    }

    BCRSAPublicKey(bm bmVar) {
        this.d = a;
        this.b = bmVar.b();
        this.c = bmVar.c();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RSAPublicKey)) {
            return false;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) obj;
        return getModulus().equals(rSAPublicKey.getModulus()) && getPublicExponent().equals(rSAPublicKey.getPublicExponent());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "RSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.a(this.d, new t(getModulus(), getPublicExponent()));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        return this.b;
    }

    @Override // java.security.interfaces.RSAPublicKey
    public BigInteger getPublicExponent() {
        return this.c;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPublicExponent().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strA = k.a();
        stringBuffer.append("RSA Public Key [").append(RSAUtil.a(getModulus())).append("],[").append(RSAUtil.b(getPublicExponent())).append("]").append(strA);
        stringBuffer.append("        modulus: ").append(getModulus().toString(16)).append(strA);
        stringBuffer.append("public exponent: ").append(getPublicExponent().toString(16)).append(strA);
        return stringBuffer.toString();
    }

    BCRSAPublicKey(u uVar) {
        try {
            t tVarA = t.a(uVar.b());
            this.d = uVar.a();
            this.b = tVarA.a();
            this.c = tVarA.b();
        } catch (IOException e) {
            throw new IllegalArgumentException("invalid info structure in RSA public key");
        }
    }
}
