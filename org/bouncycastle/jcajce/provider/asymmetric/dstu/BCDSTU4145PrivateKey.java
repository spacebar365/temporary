package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.a.aa.ab;
import org.bouncycastle.a.aa.aj;
import org.bouncycastle.a.au;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.m;
import org.bouncycastle.a.p;
import org.bouncycastle.a.v;
import org.bouncycastle.a.w.c;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.k.ad;
import org.bouncycastle.b.k.y;
import org.bouncycastle.c.a.b;
import org.bouncycastle.c.a.n;
import org.bouncycastle.c.b.a;
import org.bouncycastle.c.c.e;
import org.bouncycastle.c.c.f;
import org.bouncycastle.d.a.d;
import org.bouncycastle.d.a.d$d;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;

/* JADX INFO: loaded from: classes.dex */
public class BCDSTU4145PrivateKey implements ECPrivateKey, b, n {
    private String a;
    private transient BigInteger b;
    private transient ECParameterSpec c;
    private transient au d;
    private transient PKCS12BagAttributeCarrierImpl e;

    protected BCDSTU4145PrivateKey() {
        this.a = "DSTU4145";
        this.e = new PKCS12BagAttributeCarrierImpl();
    }

    public BCDSTU4145PrivateKey(String str, ad adVar) {
        this.a = "DSTU4145";
        this.e = new PKCS12BagAttributeCarrierImpl();
        this.a = str;
        this.b = adVar.c();
        this.c = null;
    }

    public BCDSTU4145PrivateKey(String str, ad adVar, BCDSTU4145PublicKey bCDSTU4145PublicKey, ECParameterSpec eCParameterSpec) {
        this.a = "DSTU4145";
        this.e = new PKCS12BagAttributeCarrierImpl();
        y yVarB = adVar.b();
        this.a = str;
        this.b = adVar.c();
        if (eCParameterSpec == null) {
            d dVarA = yVarB.a();
            yVarB.f();
            this.c = new ECParameterSpec(EC5Util.a(dVarA), EC5Util.a(yVarB.b()), yVarB.c(), yVarB.d().intValue());
        } else {
            this.c = eCParameterSpec;
        }
        this.d = a(bCDSTU4145PublicKey);
    }

    public BCDSTU4145PrivateKey(String str, ad adVar, BCDSTU4145PublicKey bCDSTU4145PublicKey, e eVar) {
        this.a = "DSTU4145";
        this.e = new PKCS12BagAttributeCarrierImpl();
        y yVarB = adVar.b();
        this.a = str;
        this.b = adVar.c();
        if (eVar == null) {
            d dVarA = yVarB.a();
            yVarB.f();
            this.c = new ECParameterSpec(EC5Util.a(dVarA), EC5Util.a(yVarB.b()), yVarB.c(), yVarB.d().intValue());
        } else {
            this.c = new ECParameterSpec(EC5Util.a(eVar.b()), EC5Util.a(eVar.c()), eVar.d(), eVar.e().intValue());
        }
        this.d = a(bCDSTU4145PublicKey);
    }

    public BCDSTU4145PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.a = "DSTU4145";
        this.e = new PKCS12BagAttributeCarrierImpl();
        this.b = eCPrivateKeySpec.getS();
        this.c = eCPrivateKeySpec.getParams();
    }

    public BCDSTU4145PrivateKey(f fVar) {
        this.a = "DSTU4145";
        this.e = new PKCS12BagAttributeCarrierImpl();
        this.b = fVar.b();
        if (fVar.a() != null) {
            this.c = EC5Util.a(EC5Util.a(fVar.a().b()), fVar.a());
        } else {
            this.c = null;
        }
    }

    private static au a(BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        try {
            return u.a(org.bouncycastle.a.u.b(bCDSTU4145PublicKey.getEncoded())).c();
        } catch (IOException e) {
            return null;
        }
    }

    private static void a(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }

    private e d() {
        return this.c != null ? EC5Util.a(this.c) : a.a.a();
    }

    @Override // org.bouncycastle.c.a.n
    public final org.bouncycastle.a.f a(p pVar) {
        return this.e.a(pVar);
    }

    @Override // org.bouncycastle.c.a.a
    public final e a() {
        if (this.c == null) {
            return null;
        }
        return EC5Util.a(this.c);
    }

    @Override // org.bouncycastle.c.a.n
    public final void a(p pVar, org.bouncycastle.a.f fVar) {
        this.e.a(pVar, fVar);
    }

    @Override // org.bouncycastle.c.a.n
    public final Enumeration b() {
        return this.e.b();
    }

    @Override // org.bouncycastle.c.a.b
    public final BigInteger c() {
        return this.b;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.a;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        ab abVar;
        int iA;
        if (this.c instanceof org.bouncycastle.c.c.d) {
            p pVarA = ECUtil.a(((org.bouncycastle.c.c.d) this.c).a());
            if (pVarA == null) {
                pVarA = new p(((org.bouncycastle.c.c.d) this.c).a());
            }
            abVar = new ab(pVarA);
            iA = ECUtil.a(a.a, this.c.getOrder(), getS());
        } else if (this.c == null) {
            abVar = new ab((org.bouncycastle.a.n) bc.a);
            iA = ECUtil.a(a.a, (BigInteger) null, getS());
        } else {
            d dVarA = EC5Util.a(this.c.getCurve());
            abVar = new ab(new org.bouncycastle.a.aa.ad(dVarA, EC5Util.a(dVarA, this.c.getGenerator()), this.c.getOrder(), BigInteger.valueOf(this.c.getCofactor()), this.c.getCurve().getSeed()));
            iA = ECUtil.a(a.a, this.c.getOrder(), getS());
        }
        org.bouncycastle.a.u.a aVar = this.d != null ? new org.bouncycastle.a.u.a(iA, getS(), this.d, abVar) : new org.bouncycastle.a.u.a(iA, getS(), abVar);
        try {
            return (this.a.equals("DSTU4145") ? new org.bouncycastle.a.s.p(new org.bouncycastle.a.z.a(org.bouncycastle.a.w.f.c, abVar.i()), aVar.i()) : new org.bouncycastle.a.s.p(new org.bouncycastle.a.z.a(aj.k, abVar.i()), aVar.i())).a("DER");
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.c;
    }

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        return this.b;
    }

    public String toString() {
        return ECUtil.a(this.a, this.b, d());
    }

    BCDSTU4145PrivateKey(org.bouncycastle.a.s.p pVar) {
        e eVar;
        this.a = "DSTU4145";
        this.e = new PKCS12BagAttributeCarrierImpl();
        ab abVarA = ab.a(pVar.b().b());
        if (abVarA.a()) {
            p pVarA = p.a((Object) abVarA.c());
            org.bouncycastle.a.aa.ad adVarA = ECUtil.a(pVarA);
            if (adVarA == null) {
                y yVarA = c.a(pVarA);
                d dVarA = yVarA.a();
                yVarA.f();
                this.c = new org.bouncycastle.c.c.d(pVarA.b(), EC5Util.a(dVarA), EC5Util.a(yVarA.b()), yVarA.c(), yVarA.d());
            } else {
                d dVarA2 = adVarA.a();
                adVarA.e();
                this.c = new org.bouncycastle.c.c.d(ECUtil.b(pVarA), EC5Util.a(dVarA2), EC5Util.a(adVarA.b()), adVarA.c(), adVarA.d());
            }
        } else if (abVarA.b()) {
            this.c = null;
        } else {
            v vVarA = v.a((Object) abVarA.c());
            if (vVarA.a(0) instanceof m) {
                org.bouncycastle.a.aa.ad adVarA2 = org.bouncycastle.a.aa.ad.a(abVarA.c());
                d dVarA3 = adVarA2.a();
                adVarA2.e();
                this.c = new ECParameterSpec(EC5Util.a(dVarA3), EC5Util.a(adVarA2.b()), adVarA2.c(), adVarA2.d().intValue());
            } else {
                org.bouncycastle.a.w.d dVarA4 = org.bouncycastle.a.w.d.a(vVarA);
                if (dVarA4.a()) {
                    p pVarE = dVarA4.e();
                    y yVarA2 = c.a(pVarE);
                    eVar = new org.bouncycastle.c.c.c(pVarE.b(), yVarA2.a(), yVarA2.b(), yVarA2.c(), yVarA2.d(), yVarA2.f());
                } else {
                    org.bouncycastle.a.w.b bVarB = dVarA4.b();
                    byte[] bArrC = bVarB.c();
                    if (pVar.b().a().equals(org.bouncycastle.a.w.f.b)) {
                        a(bArrC);
                    }
                    org.bouncycastle.a.w.a aVarA = bVarB.a();
                    d$d d_d = new d$d(aVarA.a(), aVarA.b(), aVarA.c(), aVarA.d(), bVarB.b(), new BigInteger(1, bArrC));
                    byte[] bArrE = bVarB.e();
                    if (pVar.b().a().equals(org.bouncycastle.a.w.f.b)) {
                        a(bArrE);
                    }
                    eVar = new e(d_d, org.bouncycastle.a.w.e.a(d_d, bArrE), bVarB.d());
                }
                this.c = new ECParameterSpec(EC5Util.a(eVar.b()), EC5Util.a(eVar.c()), eVar.d(), eVar.e().intValue());
            }
        }
        org.bouncycastle.a.f fVarC = pVar.c();
        if (fVarC instanceof m) {
            this.b = m.a(fVarC).b();
            return;
        }
        org.bouncycastle.a.u.a aVarA2 = org.bouncycastle.a.u.a.a(fVarC);
        this.b = aVarA2.a();
        this.d = aVarA2.b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCDSTU4145PrivateKey)) {
            return false;
        }
        BCDSTU4145PrivateKey bCDSTU4145PrivateKey = (BCDSTU4145PrivateKey) obj;
        return this.b.equals(bCDSTU4145PrivateKey.b) && d().equals(bCDSTU4145PrivateKey.d());
    }

    public int hashCode() {
        return this.b.hashCode() ^ d().hashCode();
    }
}
