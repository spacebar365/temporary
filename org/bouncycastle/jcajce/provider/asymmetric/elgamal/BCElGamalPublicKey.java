package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.io.IOException;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.a.m;
import org.bouncycastle.a.r.a;
import org.bouncycastle.a.r.b;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.k.ap;
import org.bouncycastle.c.a.f;
import org.bouncycastle.c.c.i;
import org.bouncycastle.c.c.k;

/* JADX INFO: loaded from: classes.dex */
public class BCElGamalPublicKey implements DHPublicKey, f {
    private BigInteger a;
    private transient i b;

    BCElGamalPublicKey(DHPublicKey dHPublicKey) {
        this.a = dHPublicKey.getY();
        this.b = new i(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    BCElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.a = dHPublicKeySpec.getY();
        this.b = new i(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    BCElGamalPublicKey(u uVar) {
        a aVarA = a.a(uVar.a().b());
        try {
            this.a = ((m) uVar.b()).b();
            this.b = new i(aVarA.a(), aVarA.b());
        } catch (IOException e) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    BCElGamalPublicKey(ap apVar) {
        this.a = apVar.c();
        this.b = new i(apVar.b().a(), apVar.b().b());
    }

    BCElGamalPublicKey(f fVar) {
        this.a = fVar.getY();
        this.b = fVar.a();
    }

    BCElGamalPublicKey(k kVar) {
        this.a = kVar.b();
        this.b = new i(kVar.a().a(), kVar.a().b());
    }

    @Override // org.bouncycastle.c.a.d
    public final i a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey) obj;
        return getY().equals(dHPublicKey.getY()) && getParams().getG().equals(dHPublicKey.getParams().getG()) && getParams().getP().equals(dHPublicKey.getParams().getP()) && getParams().getL() == dHPublicKey.getParams().getL();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ElGamal";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new u(new org.bouncycastle.a.z.a(b.l, new a(this.b.a(), this.b.b())), new m(this.a)).a("DER");
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.b.a(), this.b.b());
    }

    @Override // javax.crypto.interfaces.DHPublicKey, org.bouncycastle.c.a.f
    public BigInteger getY() {
        return this.a;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }
}
