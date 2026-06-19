package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.p074s.C0680t;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p083b.p097k.C1088bm;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: loaded from: classes.dex */
public class BCRSAPublicKey implements RSAPublicKey {

    /* JADX INFO: renamed from: a */
    private static final C0759a f5862a = new C0759a(InterfaceC0674n.f2733f_, C0579bc.f2112a);

    /* JADX INFO: renamed from: b */
    private BigInteger f5863b;

    /* JADX INFO: renamed from: c */
    private BigInteger f5864c;

    /* JADX INFO: renamed from: d */
    private transient C0759a f5865d;

    BCRSAPublicKey(RSAPublicKey rSAPublicKey) {
        this.f5865d = f5862a;
        this.f5863b = rSAPublicKey.getModulus();
        this.f5864c = rSAPublicKey.getPublicExponent();
    }

    BCRSAPublicKey(RSAPublicKeySpec rSAPublicKeySpec) {
        this.f5865d = f5862a;
        this.f5863b = rSAPublicKeySpec.getModulus();
        this.f5864c = rSAPublicKeySpec.getPublicExponent();
    }

    BCRSAPublicKey(C1088bm c1088bm) {
        this.f5865d = f5862a;
        this.f5863b = c1088bm.m2625b();
        this.f5864c = c1088bm.m2626c();
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
        return KeyUtil.m4339a(this.f5865d, new C0680t(getModulus(), getPublicExponent()));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        return this.f5863b;
    }

    @Override // java.security.interfaces.RSAPublicKey
    public BigInteger getPublicExponent() {
        return this.f5864c;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPublicExponent().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strM4158a = C1560k.m4158a();
        stringBuffer.append("RSA Public Key [").append(RSAUtil.m4296a(getModulus())).append("],[").append(RSAUtil.m4300b(getPublicExponent())).append("]").append(strM4158a);
        stringBuffer.append("        modulus: ").append(getModulus().toString(16)).append(strM4158a);
        stringBuffer.append("public exponent: ").append(getPublicExponent().toString(16)).append(strM4158a);
        return stringBuffer.toString();
    }

    BCRSAPublicKey(C0780u c0780u) {
        try {
            C0680t c0680tM1677a = C0680t.m1677a(c0780u.m1845b());
            this.f5865d = c0780u.m1844a();
            this.f5863b = c0680tM1677a.m1678a();
            this.f5864c = c0680tM1677a.m1679b();
        } catch (IOException e) {
            throw new IllegalArgumentException("invalid info structure in RSA public key");
        }
    }
}
