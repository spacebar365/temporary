package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.a.aa.ab;
import org.bouncycastle.a.au;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.be;
import org.bouncycastle.a.f.f;
import org.bouncycastle.a.m;
import org.bouncycastle.a.q;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.v;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.k.ad;
import org.bouncycastle.b.k.y;
import org.bouncycastle.c.a;
import org.bouncycastle.c.a.b;
import org.bouncycastle.c.a.n;
import org.bouncycastle.c.c.c;
import org.bouncycastle.c.c.e;
import org.bouncycastle.d.a.d;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;

/* JADX INFO: loaded from: classes.dex */
public class BCECGOST3410_2012PrivateKey implements ECPrivateKey, b, n {
    private String a;
    private transient f b;
    private transient BigInteger c;
    private transient ECParameterSpec d;
    private transient au e;
    private transient PKCS12BagAttributeCarrierImpl f;

    protected BCECGOST3410_2012PrivateKey() {
        this.a = "ECGOST3410-2012";
        this.f = new PKCS12BagAttributeCarrierImpl();
    }

    public BCECGOST3410_2012PrivateKey(String str, ad adVar) {
        this.a = "ECGOST3410-2012";
        this.f = new PKCS12BagAttributeCarrierImpl();
        this.a = str;
        this.c = adVar.c();
        this.d = null;
    }

    public BCECGOST3410_2012PrivateKey(String str, ad adVar, BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey, ECParameterSpec eCParameterSpec) {
        this.a = "ECGOST3410-2012";
        this.f = new PKCS12BagAttributeCarrierImpl();
        y yVarB = adVar.b();
        this.a = str;
        this.c = adVar.c();
        if (eCParameterSpec == null) {
            d dVarA = yVarB.a();
            yVarB.f();
            this.d = new ECParameterSpec(EC5Util.a(dVarA), EC5Util.a(yVarB.b()), yVarB.c(), yVarB.d().intValue());
        } else {
            this.d = eCParameterSpec;
        }
        this.b = bCECGOST3410_2012PublicKey.d();
        this.e = a(bCECGOST3410_2012PublicKey);
    }

    public BCECGOST3410_2012PrivateKey(String str, ad adVar, BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey, e eVar) {
        this.a = "ECGOST3410-2012";
        this.f = new PKCS12BagAttributeCarrierImpl();
        y yVarB = adVar.b();
        this.a = str;
        this.c = adVar.c();
        if (eVar == null) {
            d dVarA = yVarB.a();
            yVarB.f();
            this.d = new ECParameterSpec(EC5Util.a(dVarA), EC5Util.a(yVarB.b()), yVarB.c(), yVarB.d().intValue());
        } else {
            this.d = new ECParameterSpec(EC5Util.a(eVar.b()), EC5Util.a(eVar.c()), eVar.d(), eVar.e().intValue());
        }
        this.b = bCECGOST3410_2012PublicKey.d();
        this.e = a(bCECGOST3410_2012PublicKey);
    }

    public BCECGOST3410_2012PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.a = "ECGOST3410-2012";
        this.f = new PKCS12BagAttributeCarrierImpl();
        this.c = eCPrivateKeySpec.getS();
        this.d = eCPrivateKeySpec.getParams();
    }

    BCECGOST3410_2012PrivateKey(p pVar) {
        this.a = "ECGOST3410-2012";
        this.f = new PKCS12BagAttributeCarrierImpl();
        a(pVar);
    }

    public BCECGOST3410_2012PrivateKey(org.bouncycastle.c.c.f fVar) {
        this.a = "ECGOST3410-2012";
        this.f = new PKCS12BagAttributeCarrierImpl();
        this.c = fVar.b();
        if (fVar.a() != null) {
            this.d = EC5Util.a(EC5Util.a(fVar.a().b()), fVar.a());
        } else {
            this.d = null;
        }
    }

    private static au a(BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey) {
        return u.a(bCECGOST3410_2012PublicKey.getEncoded()).c();
    }

    private void a(p pVar) {
        org.bouncycastle.a.u uVarI = pVar.b().b().i();
        if ((uVarI instanceof v) && (v.a((Object) uVarI).d() == 2 || v.a((Object) uVarI).d() == 3)) {
            this.b = f.a(pVar.b().b());
            c cVarA = a.a(org.bouncycastle.a.f.b.b(this.b.a()));
            this.d = new org.bouncycastle.c.c.d(org.bouncycastle.a.f.b.b(this.b.a()), EC5Util.a(cVarA.b()), EC5Util.a(cVarA.c()), cVarA.d(), cVarA.e());
            org.bouncycastle.a.f fVarC = pVar.c();
            if (fVarC instanceof m) {
                this.c = m.a(fVarC).c();
                return;
            }
            byte[] bArrC = q.a(fVarC).c();
            byte[] bArr = new byte[bArrC.length];
            for (int i = 0; i != bArrC.length; i++) {
                bArr[i] = bArrC[(bArrC.length - 1) - i];
            }
            this.c = new BigInteger(1, bArr);
            return;
        }
        ab abVarA = ab.a(pVar.b().b());
        if (abVarA.a()) {
            org.bouncycastle.a.p pVarA = org.bouncycastle.a.p.a((Object) abVarA.c());
            org.bouncycastle.a.aa.ad adVarA = ECUtil.a(pVarA);
            if (adVarA == null) {
                y yVarA = org.bouncycastle.a.f.b.a(pVarA);
                d dVarA = yVarA.a();
                yVarA.f();
                this.d = new org.bouncycastle.c.c.d(org.bouncycastle.a.f.b.b(pVarA), EC5Util.a(dVarA), EC5Util.a(yVarA.b()), yVarA.c(), yVarA.d());
            } else {
                d dVarA2 = adVarA.a();
                adVarA.e();
                this.d = new org.bouncycastle.c.c.d(ECUtil.b(pVarA), EC5Util.a(dVarA2), EC5Util.a(adVarA.b()), adVarA.c(), adVarA.d());
            }
        } else if (abVarA.b()) {
            this.d = null;
        } else {
            org.bouncycastle.a.aa.ad adVarA2 = org.bouncycastle.a.aa.ad.a(abVarA.c());
            d dVarA3 = adVarA2.a();
            adVarA2.e();
            this.d = new ECParameterSpec(EC5Util.a(dVarA3), EC5Util.a(adVarA2.b()), adVarA2.c(), adVarA2.d().intValue());
        }
        org.bouncycastle.a.f fVarC2 = pVar.c();
        if (fVarC2 instanceof m) {
            this.c = m.a(fVarC2).b();
            return;
        }
        org.bouncycastle.a.u.a aVarA = org.bouncycastle.a.u.a.a(fVarC2);
        this.c = aVarA.a();
        this.e = aVarA.b();
    }

    private e d() {
        return this.d != null ? EC5Util.a(this.d) : org.bouncycastle.c.b.a.a.a();
    }

    @Override // org.bouncycastle.c.a.n
    public final org.bouncycastle.a.f a(org.bouncycastle.a.p pVar) {
        return this.f.a(pVar);
    }

    @Override // org.bouncycastle.c.a.a
    public final e a() {
        if (this.d == null) {
            return null;
        }
        return EC5Util.a(this.d);
    }

    @Override // org.bouncycastle.c.a.n
    public final void a(org.bouncycastle.a.p pVar, org.bouncycastle.a.f fVar) {
        this.f.a(pVar, fVar);
    }

    @Override // org.bouncycastle.c.a.n
    public final Enumeration b() {
        return this.f.b();
    }

    @Override // org.bouncycastle.c.a.b
    public final BigInteger c() {
        return this.c;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.a;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.d;
    }

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        return this.c;
    }

    public String toString() {
        return ECUtil.a(this.a, this.c, d());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        int iA;
        ab abVar;
        byte[] bArr;
        boolean z = this.c.bitLength() > 256;
        org.bouncycastle.a.p pVar = z ? org.bouncycastle.a.t.a.h : org.bouncycastle.a.t.a.g;
        int i = z ? 64 : 32;
        if (this.b != null) {
            byte[] bArr2 = new byte[i];
            byte[] byteArray = getS().toByteArray();
            if (byteArray.length < i) {
                bArr = new byte[i];
                System.arraycopy(byteArray, 0, bArr, bArr.length - byteArray.length, byteArray.length);
            } else {
                bArr = byteArray;
            }
            for (int i2 = 0; i2 != i; i2++) {
                bArr2[i2 + 0] = bArr[(bArr.length - 1) - i2];
            }
            try {
                return new p(new org.bouncycastle.a.z.a(pVar, this.b), new be(bArr2)).a("DER");
            } catch (IOException e) {
                return null;
            }
        }
        if (this.d instanceof org.bouncycastle.c.c.d) {
            org.bouncycastle.a.p pVarA = ECUtil.a(((org.bouncycastle.c.c.d) this.d).a());
            if (pVarA == null) {
                pVarA = new org.bouncycastle.a.p(((org.bouncycastle.c.c.d) this.d).a());
            }
            ab abVar2 = new ab(pVarA);
            iA = ECUtil.a(org.bouncycastle.c.b.a.a, this.d.getOrder(), getS());
            abVar = abVar2;
        } else if (this.d == null) {
            abVar = new ab((org.bouncycastle.a.n) bc.a);
            iA = ECUtil.a(org.bouncycastle.c.b.a.a, (BigInteger) null, getS());
        } else {
            d dVarA = EC5Util.a(this.d.getCurve());
            ab abVar3 = new ab(new org.bouncycastle.a.aa.ad(dVarA, EC5Util.a(dVarA, this.d.getGenerator()), this.d.getOrder(), BigInteger.valueOf(this.d.getCofactor()), this.d.getCurve().getSeed()));
            iA = ECUtil.a(org.bouncycastle.c.b.a.a, this.d.getOrder(), getS());
            abVar = abVar3;
        }
        try {
            return new p(new org.bouncycastle.a.z.a(pVar, abVar.i()), (this.e != null ? new org.bouncycastle.a.u.a(iA, getS(), this.e, abVar) : new org.bouncycastle.a.u.a(iA, getS(), abVar)).i()).a("DER");
        } catch (IOException e2) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410_2012PrivateKey)) {
            return false;
        }
        BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey = (BCECGOST3410_2012PrivateKey) obj;
        return this.c.equals(bCECGOST3410_2012PrivateKey.c) && d().equals(bCECGOST3410_2012PrivateKey.d());
    }

    public int hashCode() {
        return this.c.hashCode() ^ d().hashCode();
    }
}
