package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.a.aa.aj;
import org.bouncycastle.a.aa.c;
import org.bouncycastle.a.m;
import org.bouncycastle.a.s.d;
import org.bouncycastle.a.s.n;
import org.bouncycastle.a.z.a;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.k.i;
import org.bouncycastle.b.k.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.spec.DHDomainParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class BCDHPublicKey implements DHPublicKey {
    private BigInteger a;
    private transient k b;
    private transient DHParameterSpec c;
    private transient u d;

    BCDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.a = bigInteger;
        this.c = dHParameterSpec;
        if (dHParameterSpec instanceof DHDomainParameterSpec) {
            this.b = new k(bigInteger, ((DHDomainParameterSpec) dHParameterSpec).b());
        } else {
            this.b = new k(bigInteger, new i(dHParameterSpec.getP(), dHParameterSpec.getG()));
        }
    }

    BCDHPublicKey(DHPublicKey dHPublicKey) {
        this.a = dHPublicKey.getY();
        this.c = dHPublicKey.getParams();
        this.b = new k(this.a, new i(this.c.getP(), this.c.getG()));
    }

    BCDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.a = dHPublicKeySpec.getY();
        this.c = new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
        this.b = new k(this.a, new i(dHPublicKeySpec.getP(), dHPublicKeySpec.getG()));
    }

    BCDHPublicKey(k kVar) {
        this.a = kVar.c();
        this.c = new DHDomainParameterSpec(kVar.b());
        this.b = kVar;
    }

    public final k a() {
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
        return "DH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.d != null) {
            return KeyUtil.a(this.d);
        }
        if (!(this.c instanceof DHDomainParameterSpec) || ((DHDomainParameterSpec) this.c).a() == null) {
            return KeyUtil.a(new a(n.s, new d(this.c.getP(), this.c.getG(), this.c.getL()).i()), new m(this.a));
        }
        i iVarB = ((DHDomainParameterSpec) this.c).b();
        org.bouncycastle.b.k.n nVarG = iVarB.g();
        return KeyUtil.a(new a(aj.ab, new org.bouncycastle.a.aa.a(iVarB.a(), iVarB.b(), iVarB.c(), iVarB.d(), nVarG != null ? new c(nVarG.b(), nVarG.a()) : null).i()), new m(this.a));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.c;
    }

    @Override // javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return this.a;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public String toString() {
        return DHUtil.b("DH", this.a, new i(this.c.getP(), this.c.getG()));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BCDHPublicKey(org.bouncycastle.a.z.u r11) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.dh.BCDHPublicKey.<init>(org.bouncycastle.a.z.u):void");
    }
}
