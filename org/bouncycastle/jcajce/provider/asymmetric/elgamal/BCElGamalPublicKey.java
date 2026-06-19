package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.io.IOException;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.p073r.C0658a;
import org.bouncycastle.p054a.p073r.InterfaceC0659b;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p083b.p097k.C1064ap;
import org.bouncycastle.p103c.p104a.InterfaceC1190f;
import org.bouncycastle.p103c.p106c.C1212i;
import org.bouncycastle.p103c.p106c.C1214k;

/* JADX INFO: loaded from: classes.dex */
public class BCElGamalPublicKey implements DHPublicKey, InterfaceC1190f {

    /* JADX INFO: renamed from: a */
    private BigInteger f5821a;

    /* JADX INFO: renamed from: b */
    private transient C1212i f5822b;

    BCElGamalPublicKey(DHPublicKey dHPublicKey) {
        this.f5821a = dHPublicKey.getY();
        this.f5822b = new C1212i(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    BCElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.f5821a = dHPublicKeySpec.getY();
        this.f5822b = new C1212i(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    BCElGamalPublicKey(C0780u c0780u) {
        C0658a c0658aM1598a = C0658a.m1598a(c0780u.m1844a().m1784b());
        try {
            this.f5821a = ((C0640m) c0780u.m1845b()).m1564b();
            this.f5822b = new C1212i(c0658aM1598a.m1599a(), c0658aM1598a.m1600b());
        } catch (IOException e) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    BCElGamalPublicKey(C1064ap c1064ap) {
        this.f5821a = c1064ap.m2583c();
        this.f5822b = new C1212i(c1064ap.m2578b().m2579a(), c1064ap.m2578b().m2580b());
    }

    BCElGamalPublicKey(InterfaceC1190f interfaceC1190f) {
        this.f5821a = interfaceC1190f.getY();
        this.f5822b = interfaceC1190f.mo2830a();
    }

    BCElGamalPublicKey(C1214k c1214k) {
        this.f5821a = c1214k.m2880b();
        this.f5822b = new C1212i(c1214k.m2876a().m2877a(), c1214k.m2876a().m2878b());
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1188d
    /* JADX INFO: renamed from: a */
    public final C1212i mo2830a() {
        return this.f5822b;
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
            return new C0780u(new C0759a(InterfaceC0659b.f2578l, new C0658a(this.f5822b.m2877a(), this.f5822b.m2878b())), new C0640m(this.f5821a)).m1577a("DER");
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
        return new DHParameterSpec(this.f5822b.m2877a(), this.f5822b.m2878b());
    }

    @Override // javax.crypto.interfaces.DHPublicKey, org.bouncycastle.p103c.p104a.InterfaceC1190f
    public BigInteger getY() {
        return this.f5821a;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }
}
