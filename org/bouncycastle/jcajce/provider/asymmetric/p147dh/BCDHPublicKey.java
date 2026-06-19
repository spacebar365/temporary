package org.bouncycastle.jcajce.provider.asymmetric.p147dh;

import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.spec.DHDomainParameterSpec;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.p056aa.C0503a;
import org.bouncycastle.p054a.p056aa.C0515c;
import org.bouncycastle.p054a.p056aa.InterfaceC0513aj;
import org.bouncycastle.p054a.p074s.C0664d;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p083b.p097k.C1106i;
import org.bouncycastle.p083b.p097k.C1108k;
import org.bouncycastle.p083b.p097k.C1111n;

/* JADX INFO: loaded from: classes.dex */
public class BCDHPublicKey implements DHPublicKey {

    /* JADX INFO: renamed from: a */
    private BigInteger f5600a;

    /* JADX INFO: renamed from: b */
    private transient C1108k f5601b;

    /* JADX INFO: renamed from: c */
    private transient DHParameterSpec f5602c;

    /* JADX INFO: renamed from: d */
    private transient C0780u f5603d;

    BCDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.f5600a = bigInteger;
        this.f5602c = dHParameterSpec;
        if (dHParameterSpec instanceof DHDomainParameterSpec) {
            this.f5601b = new C1108k(bigInteger, ((DHDomainParameterSpec) dHParameterSpec).m4485b());
        } else {
            this.f5601b = new C1108k(bigInteger, new C1106i(dHParameterSpec.getP(), dHParameterSpec.getG()));
        }
    }

    BCDHPublicKey(DHPublicKey dHPublicKey) {
        this.f5600a = dHPublicKey.getY();
        this.f5602c = dHPublicKey.getParams();
        this.f5601b = new C1108k(this.f5600a, new C1106i(this.f5602c.getP(), this.f5602c.getG()));
    }

    BCDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.f5600a = dHPublicKeySpec.getY();
        this.f5602c = new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
        this.f5601b = new C1108k(this.f5600a, new C1106i(dHPublicKeySpec.getP(), dHPublicKeySpec.getG()));
    }

    BCDHPublicKey(C1108k c1108k) {
        this.f5600a = c1108k.m2672c();
        this.f5602c = new DHDomainParameterSpec(c1108k.m2658b());
        this.f5601b = c1108k;
    }

    /* JADX INFO: renamed from: a */
    public final C1108k m4197a() {
        return this.f5601b;
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
        if (this.f5603d != null) {
            return KeyUtil.m4340a(this.f5603d);
        }
        if (!(this.f5602c instanceof DHDomainParameterSpec) || ((DHDomainParameterSpec) this.f5602c).m4484a() == null) {
            return KeyUtil.m4339a(new C0759a(InterfaceC0674n.f2748s, new C0664d(this.f5602c.getP(), this.f5602c.getG(), this.f5602c.getL()).mo1358i()), new C0640m(this.f5600a));
        }
        C1106i c1106iM4485b = ((DHDomainParameterSpec) this.f5602c).m4485b();
        C1111n c1111nM2670g = c1106iM4485b.m2670g();
        return KeyUtil.m4339a(new C0759a(InterfaceC0513aj.f1929ab, new C0503a(c1106iM4485b.m2664a(), c1106iM4485b.m2665b(), c1106iM4485b.m2666c(), c1106iM4485b.m2667d(), c1111nM2670g != null ? new C0515c(c1111nM2670g.m2678b(), c1111nM2670g.m2677a()) : null).mo1358i()), new C0640m(this.f5600a));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.f5602c;
    }

    @Override // javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return this.f5600a;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public String toString() {
        return DHUtil.m4200b("DH", this.f5600a, new C1106i(this.f5602c.getP(), this.f5602c.getG()));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BCDHPublicKey(org.bouncycastle.p054a.p082z.C0780u r11) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.p147dh.BCDHPublicKey.<init>(org.bouncycastle.a.z.u):void");
    }
}
