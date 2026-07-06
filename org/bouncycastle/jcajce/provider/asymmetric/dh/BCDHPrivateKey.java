package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.bouncycastle.a.aa.a;
import org.bouncycastle.a.aa.aj;
import org.bouncycastle.a.aa.c;
import org.bouncycastle.a.f;
import org.bouncycastle.a.m;
import org.bouncycastle.a.s.d;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.v;
import org.bouncycastle.b.k.i;
import org.bouncycastle.b.k.j;
import org.bouncycastle.c.a.n;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.spec.DHDomainParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class BCDHPrivateKey implements DHPrivateKey, n {
    private BigInteger a;
    private transient DHParameterSpec b;
    private transient p c;
    private transient j d;
    private transient PKCS12BagAttributeCarrierImpl e = new PKCS12BagAttributeCarrierImpl();

    protected BCDHPrivateKey() {
    }

    BCDHPrivateKey(DHPrivateKey dHPrivateKey) {
        this.a = dHPrivateKey.getX();
        this.b = dHPrivateKey.getParams();
    }

    BCDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.a = dHPrivateKeySpec.getX();
        this.b = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public BCDHPrivateKey(p pVar) {
        v vVarA = v.a(pVar.b().b());
        m mVar = (m) pVar.c();
        org.bouncycastle.a.p pVarA = pVar.b().a();
        this.c = pVar;
        this.a = mVar.b();
        if (!pVarA.equals(org.bouncycastle.a.s.n.s)) {
            if (!pVarA.equals(aj.ab)) {
                throw new IllegalArgumentException("unknown algorithm type: ".concat(String.valueOf(pVarA)));
            }
            a aVarA = a.a(vVarA);
            this.b = new DHDomainParameterSpec(aVarA.a(), aVarA.c(), aVarA.b(), aVarA.d());
            this.d = new j(this.a, new i(aVarA.a(), aVarA.b(), aVarA.c(), aVarA.d(), null));
            return;
        }
        d dVarA = d.a(vVarA);
        if (dVarA.c() != null) {
            this.b = new DHParameterSpec(dVarA.a(), dVarA.b(), dVarA.c().intValue());
            this.d = new j(this.a, new i(dVarA.a(), dVarA.b(), dVarA.c().intValue()));
        } else {
            this.b = new DHParameterSpec(dVarA.a(), dVarA.b());
            this.d = new j(this.a, new i(dVarA.a(), dVarA.b()));
        }
    }

    BCDHPrivateKey(j jVar) {
        this.a = jVar.c();
        this.b = new DHDomainParameterSpec(jVar.b());
    }

    @Override // org.bouncycastle.c.a.n
    public final f a(org.bouncycastle.a.p pVar) {
        return this.e.a(pVar);
    }

    final j a() {
        return this.d != null ? this.d : this.b instanceof DHDomainParameterSpec ? new j(this.a, ((DHDomainParameterSpec) this.b).b()) : new j(this.a, new i(this.b.getP(), this.b.getG(), this.b.getL()));
    }

    @Override // org.bouncycastle.c.a.n
    public final void a(org.bouncycastle.a.p pVar, f fVar) {
        this.e.a(pVar, fVar);
    }

    @Override // org.bouncycastle.c.a.n
    public final Enumeration b() {
        return this.e.b();
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
        return "DH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        p pVar;
        try {
            if (this.c != null) {
                return this.c.a("DER");
            }
            if (!(this.b instanceof DHDomainParameterSpec) || ((DHDomainParameterSpec) this.b).a() == null) {
                pVar = new p(new org.bouncycastle.a.z.a(org.bouncycastle.a.s.n.s, new d(this.b.getP(), this.b.getG(), this.b.getL()).i()), new m(getX()));
            } else {
                i iVarB = ((DHDomainParameterSpec) this.b).b();
                org.bouncycastle.b.k.n nVarG = iVarB.g();
                pVar = new p(new org.bouncycastle.a.z.a(aj.ab, new a(iVarB.a(), iVarB.b(), iVarB.c(), iVarB.d(), nVarG != null ? new c(nVarG.b(), nVarG.a()) : null).i()), new m(getX()));
            }
            return pVar.a("DER");
        } catch (Exception e) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.b;
    }

    @Override // javax.crypto.interfaces.DHPrivateKey
    public BigInteger getX() {
        return this.a;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public String toString() {
        return DHUtil.a("DH", this.a, new i(this.b.getP(), this.b.getG()));
    }
}
