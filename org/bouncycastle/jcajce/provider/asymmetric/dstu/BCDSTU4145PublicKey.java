package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.a.aa.ab;
import org.bouncycastle.a.aa.ad;
import org.bouncycastle.a.au;
import org.bouncycastle.a.be;
import org.bouncycastle.a.f;
import org.bouncycastle.a.m;
import org.bouncycastle.a.p;
import org.bouncycastle.a.q;
import org.bouncycastle.a.v;
import org.bouncycastle.a.w.b;
import org.bouncycastle.a.w.d;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.k.ae;
import org.bouncycastle.b.k.y;
import org.bouncycastle.c.a.c;
import org.bouncycastle.c.b.a;
import org.bouncycastle.c.c.e;
import org.bouncycastle.c.c.g;
import org.bouncycastle.d.a.d$d;
import org.bouncycastle.d.a.j;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class BCDSTU4145PublicKey implements ECPublicKey, c {
    private String a;
    private transient ae b;
    private transient ECParameterSpec c;
    private transient d d;

    public BCDSTU4145PublicKey(String str, ae aeVar) {
        this.a = "DSTU4145";
        this.a = str;
        this.b = aeVar;
        this.c = null;
    }

    public BCDSTU4145PublicKey(String str, ae aeVar, ECParameterSpec eCParameterSpec) {
        this.a = "DSTU4145";
        y yVarB = aeVar.b();
        this.a = str;
        this.b = aeVar;
        if (eCParameterSpec != null) {
            this.c = eCParameterSpec;
            return;
        }
        org.bouncycastle.d.a.d dVarA = yVarB.a();
        yVarB.f();
        this.c = a(EC5Util.a(dVarA), yVarB);
    }

    public BCDSTU4145PublicKey(String str, ae aeVar, e eVar) {
        this.a = "DSTU4145";
        y yVarB = aeVar.b();
        this.a = str;
        if (eVar == null) {
            org.bouncycastle.d.a.d dVarA = yVarB.a();
            yVarB.f();
            this.c = a(EC5Util.a(dVarA), yVarB);
        } else {
            this.c = EC5Util.a(EC5Util.a(eVar.b()), eVar);
        }
        this.b = aeVar;
    }

    public BCDSTU4145PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.a = "DSTU4145";
        this.c = eCPublicKeySpec.getParams();
        this.b = new ae(EC5Util.a(this.c, eCPublicKeySpec.getW()), EC5Util.a((ProviderConfiguration) null, this.c));
    }

    private static ECParameterSpec a(EllipticCurve ellipticCurve, y yVar) {
        return new ECParameterSpec(ellipticCurve, EC5Util.a(yVar.b()), yVar.c(), yVar.d().intValue());
    }

    private static void a(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }

    private e e() {
        return this.c != null ? EC5Util.a(this.c) : a.a.a();
    }

    @Override // org.bouncycastle.c.a.a
    public final e a() {
        if (this.c == null) {
            return null;
        }
        return EC5Util.a(this.c);
    }

    public final byte[] b() {
        return this.d != null ? this.d.c() : d.d();
    }

    @Override // org.bouncycastle.c.a.c
    public final j c() {
        j jVarC = this.b.c();
        return this.c == null ? jVarC.c() : jVarC;
    }

    final ae d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCDSTU4145PublicKey)) {
            return false;
        }
        BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) obj;
        return this.b.c().a(bCDSTU4145PublicKey.b.c()) && e().equals(bCDSTU4145PublicKey.e());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.a;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        f abVar;
        if (this.d != null) {
            abVar = this.d;
        } else if (this.c instanceof org.bouncycastle.c.c.d) {
            abVar = new d(new p(((org.bouncycastle.c.c.d) this.c).a()));
        } else {
            org.bouncycastle.d.a.d dVarA = EC5Util.a(this.c.getCurve());
            abVar = new ab(new ad(dVarA, EC5Util.a(dVarA, this.c.getGenerator()), this.c.getOrder(), BigInteger.valueOf(this.c.getCofactor()), this.c.getCurve().getSeed()));
        }
        try {
            return KeyUtil.a(new u(new org.bouncycastle.a.z.a(org.bouncycastle.a.w.f.c, abVar), new be(org.bouncycastle.a.w.e.a(this.b.c()))));
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.c;
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return EC5Util.a(this.b.c());
    }

    public int hashCode() {
        return this.b.c().hashCode() ^ e().hashCode();
    }

    public String toString() {
        return ECUtil.a(this.a, this.b.c(), e());
    }

    public BCDSTU4145PublicKey(g gVar, ProviderConfiguration providerConfiguration) {
        this.a = "DSTU4145";
        if (gVar.a() == null) {
            this.b = new ae(providerConfiguration.a().b().a(gVar.b().g().a(), gVar.b().h().a(), false), EC5Util.a(providerConfiguration, (ECParameterSpec) null));
            this.c = null;
        } else {
            EllipticCurve ellipticCurveA = EC5Util.a(gVar.a().b());
            this.b = new ae(gVar.b(), ECUtil.a(providerConfiguration, gVar.a()));
            this.c = EC5Util.a(ellipticCurveA, gVar.a());
        }
    }

    BCDSTU4145PublicKey(u uVar) {
        ad adVar;
        e eVar;
        this.a = "DSTU4145";
        au auVarC = uVar.c();
        this.a = "DSTU4145";
        try {
            byte[] bArrC = ((q) org.bouncycastle.a.u.b(auVarC.d())).c();
            if (uVar.a().a().equals(org.bouncycastle.a.w.f.b)) {
                a(bArrC);
            }
            v vVarA = v.a(uVar.a().b());
            if (vVarA.a(0) instanceof m) {
                ad adVarA = ad.a(vVarA);
                adVar = adVarA;
                eVar = new e(adVarA.a(), adVarA.b(), adVarA.c(), adVarA.d(), adVarA.e());
            } else {
                this.d = d.a(vVarA);
                if (this.d.a()) {
                    p pVarE = this.d.e();
                    y yVarA = org.bouncycastle.a.w.c.a(pVarE);
                    org.bouncycastle.c.c.c cVar = new org.bouncycastle.c.c.c(pVarE.b(), yVarA.a(), yVarA.b(), yVarA.c(), yVarA.d(), yVarA.f());
                    adVar = null;
                    eVar = cVar;
                } else {
                    b bVarB = this.d.b();
                    byte[] bArrC2 = bVarB.c();
                    if (uVar.a().a().equals(org.bouncycastle.a.w.f.b)) {
                        a(bArrC2);
                    }
                    org.bouncycastle.a.w.a aVarA = bVarB.a();
                    d$d d_d = new d$d(aVarA.a(), aVarA.b(), aVarA.c(), aVarA.d(), bVarB.b(), new BigInteger(1, bArrC2));
                    byte[] bArrE = bVarB.e();
                    if (uVar.a().a().equals(org.bouncycastle.a.w.f.b)) {
                        a(bArrE);
                    }
                    e eVar2 = new e(d_d, org.bouncycastle.a.w.e.a(d_d, bArrE), bVarB.d());
                    adVar = null;
                    eVar = eVar2;
                }
            }
            org.bouncycastle.d.a.d dVarB = eVar.b();
            EllipticCurve ellipticCurveA = EC5Util.a(dVarB);
            if (this.d == null) {
                this.c = EC5Util.a(adVar);
            } else if (this.d.a()) {
                this.c = new org.bouncycastle.c.c.d(this.d.e().b(), ellipticCurveA, EC5Util.a(eVar.c()), eVar.d(), eVar.e());
            } else {
                this.c = new ECParameterSpec(ellipticCurveA, EC5Util.a(eVar.c()), eVar.d(), eVar.e().intValue());
            }
            this.b = new ae(org.bouncycastle.a.w.e.a(dVarB, bArrC), EC5Util.a((ProviderConfiguration) null, this.c));
        } catch (IOException e) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }
}
