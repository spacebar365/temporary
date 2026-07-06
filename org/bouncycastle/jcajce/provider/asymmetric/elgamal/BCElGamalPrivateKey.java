package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.bouncycastle.a.f;
import org.bouncycastle.a.m;
import org.bouncycastle.a.r.a;
import org.bouncycastle.a.r.b;
import org.bouncycastle.a.s.p;
import org.bouncycastle.b.k.ao;
import org.bouncycastle.c.a.e;
import org.bouncycastle.c.a.n;
import org.bouncycastle.c.c.i;
import org.bouncycastle.c.c.j;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;

/* JADX INFO: loaded from: classes.dex */
public class BCElGamalPrivateKey implements DHPrivateKey, e, n {
    private BigInteger a;
    private transient i b;
    private transient PKCS12BagAttributeCarrierImpl c = new PKCS12BagAttributeCarrierImpl();

    protected BCElGamalPrivateKey() {
    }

    BCElGamalPrivateKey(DHPrivateKey dHPrivateKey) {
        this.a = dHPrivateKey.getX();
        this.b = new i(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
    }

    BCElGamalPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.a = dHPrivateKeySpec.getX();
        this.b = new i(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    BCElGamalPrivateKey(p pVar) {
        a aVarA = a.a(pVar.b().b());
        this.a = m.a(pVar.c()).b();
        this.b = new i(aVarA.a(), aVarA.b());
    }

    BCElGamalPrivateKey(ao aoVar) {
        this.a = aoVar.c();
        this.b = new i(aoVar.b().a(), aoVar.b().b());
    }

    BCElGamalPrivateKey(e eVar) {
        this.a = eVar.getX();
        this.b = eVar.a();
    }

    BCElGamalPrivateKey(j jVar) {
        this.a = jVar.b();
        this.b = new i(jVar.a().a(), jVar.a().b());
    }

    @Override // org.bouncycastle.c.a.n
    public final f a(org.bouncycastle.a.p pVar) {
        return this.c.a(pVar);
    }

    @Override // org.bouncycastle.c.a.d
    public final i a() {
        return this.b;
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
            return new p(new org.bouncycastle.a.z.a(b.l, new a(this.b.a(), this.b.b())), new m(getX())).a("DER");
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
        return new DHParameterSpec(this.b.a(), this.b.b());
    }

    @Override // javax.crypto.interfaces.DHPrivateKey, org.bouncycastle.c.a.e
    public BigInteger getX() {
        return this.a;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }
}
