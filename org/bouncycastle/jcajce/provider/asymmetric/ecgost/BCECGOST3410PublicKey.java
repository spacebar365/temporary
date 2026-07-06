package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

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
import org.bouncycastle.a.f.b;
import org.bouncycastle.a.p;
import org.bouncycastle.a.q;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.k.ae;
import org.bouncycastle.b.k.y;
import org.bouncycastle.b.k.z;
import org.bouncycastle.c.a;
import org.bouncycastle.c.a.c;
import org.bouncycastle.c.c.e;
import org.bouncycastle.c.c.g;
import org.bouncycastle.d.a.d;
import org.bouncycastle.d.a.j;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class BCECGOST3410PublicKey implements ECPublicKey, c {
    private String a;
    private transient ae b;
    private transient ECParameterSpec c;
    private transient f d;

    public BCECGOST3410PublicKey(String str, ae aeVar) {
        this.a = "ECGOST3410";
        this.a = str;
        this.b = aeVar;
        this.c = null;
    }

    public BCECGOST3410PublicKey(String str, ae aeVar, ECParameterSpec eCParameterSpec) {
        this.a = "ECGOST3410";
        y yVarB = aeVar.b();
        if (yVarB instanceof z) {
            z zVar = (z) yVarB;
            this.d = new org.bouncycastle.a.f.f(zVar.g(), zVar.h(), zVar.i());
        }
        this.a = str;
        this.b = aeVar;
        if (eCParameterSpec != null) {
            this.c = eCParameterSpec;
            return;
        }
        d dVarA = yVarB.a();
        yVarB.f();
        this.c = a(EC5Util.a(dVarA), yVarB);
    }

    public BCECGOST3410PublicKey(String str, ae aeVar, e eVar) {
        this.a = "ECGOST3410";
        y yVarB = aeVar.b();
        this.a = str;
        this.b = aeVar;
        if (eVar != null) {
            this.c = EC5Util.a(EC5Util.a(eVar.b()), eVar);
            return;
        }
        d dVarA = yVarB.a();
        yVarB.f();
        this.c = a(EC5Util.a(dVarA), yVarB);
    }

    public BCECGOST3410PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.a = "ECGOST3410";
        this.c = eCPublicKeySpec.getParams();
        this.b = new ae(EC5Util.a(this.c, eCPublicKeySpec.getW()), EC5Util.a((ProviderConfiguration) null, eCPublicKeySpec.getParams()));
    }

    BCECGOST3410PublicKey(u uVar) {
        this.a = "ECGOST3410";
        a(uVar);
    }

    private static ECParameterSpec a(EllipticCurve ellipticCurve, y yVar) {
        return new ECParameterSpec(ellipticCurve, EC5Util.a(yVar.b()), yVar.c(), yVar.d().intValue());
    }

    private void a(u uVar) {
        p pVarA;
        au auVarC = uVar.c();
        this.a = "ECGOST3410";
        try {
            byte[] bArrC = ((q) org.bouncycastle.a.u.b(auVarC.d())).c();
            byte[] bArr = new byte[65];
            bArr[0] = 4;
            for (int i = 1; i <= 32; i++) {
                bArr[i] = bArrC[32 - i];
                bArr[i + 32] = bArrC[64 - i];
            }
            if (uVar.a().b() instanceof p) {
                p pVarA2 = p.a(uVar.a().b());
                this.d = pVarA2;
                pVarA = pVarA2;
            } else {
                org.bouncycastle.a.f.f fVarA = org.bouncycastle.a.f.f.a(uVar.a().b());
                this.d = fVarA;
                pVarA = fVarA.a();
            }
            org.bouncycastle.c.c.c cVarA = a.a(b.b(pVarA));
            d dVarB = cVarA.b();
            EllipticCurve ellipticCurveA = EC5Util.a(dVarB);
            this.b = new ae(dVarB.a(bArr), ECUtil.a((ProviderConfiguration) null, cVarA));
            this.c = new org.bouncycastle.c.c.d(b.b(pVarA), ellipticCurveA, EC5Util.a(cVarA.c()), cVarA.d(), cVarA.e());
        } catch (IOException e) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    private static void a(byte[] bArr, int i, BigInteger bigInteger) {
        byte[] bArr2;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < 32) {
            bArr2 = new byte[32];
            System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
        } else {
            bArr2 = byteArray;
        }
        for (int i2 = 0; i2 != 32; i2++) {
            bArr[i + i2] = bArr2[(bArr2.length - 1) - i2];
        }
    }

    private e e() {
        return this.c != null ? EC5Util.a(this.c) : org.bouncycastle.c.b.a.a.a();
    }

    @Override // org.bouncycastle.c.a.a
    public final e a() {
        if (this.c == null) {
            return null;
        }
        return EC5Util.a(this.c);
    }

    final ae b() {
        return this.b;
    }

    @Override // org.bouncycastle.c.a.c
    public final j c() {
        return this.c == null ? this.b.c().c() : this.b.c();
    }

    final f d() {
        if (this.d == null && (this.c instanceof org.bouncycastle.c.c.d)) {
            this.d = new org.bouncycastle.a.f.f(b.b(((org.bouncycastle.c.c.d) this.c).a()), org.bouncycastle.a.f.a.p);
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410PublicKey)) {
            return false;
        }
        BCECGOST3410PublicKey bCECGOST3410PublicKey = (BCECGOST3410PublicKey) obj;
        return this.b.c().a(bCECGOST3410PublicKey.b.c()) && e().equals(bCECGOST3410PublicKey.e());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.a;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        f fVarD = d();
        if (fVarD == null) {
            if (this.c instanceof org.bouncycastle.c.c.d) {
                fVarD = new org.bouncycastle.a.f.f(b.b(((org.bouncycastle.c.c.d) this.c).a()), org.bouncycastle.a.f.a.p);
            } else {
                d dVarA = EC5Util.a(this.c.getCurve());
                fVarD = new ab(new ad(dVarA, EC5Util.a(dVarA, this.c.getGenerator()), this.c.getOrder(), BigInteger.valueOf(this.c.getCofactor()), this.c.getCurve().getSeed()));
            }
        }
        BigInteger bigIntegerA = this.b.c().g().a();
        BigInteger bigIntegerA2 = this.b.c().h().a();
        byte[] bArr = new byte[64];
        a(bArr, 0, bigIntegerA);
        a(bArr, 32, bigIntegerA2);
        try {
            return KeyUtil.a(new u(new org.bouncycastle.a.z.a(org.bouncycastle.a.f.a.m, fVarD), new be(bArr)));
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

    public BCECGOST3410PublicKey(g gVar, ProviderConfiguration providerConfiguration) {
        this.a = "ECGOST3410";
        if (gVar.a() == null) {
            this.b = new ae(providerConfiguration.a().b().a(gVar.b().g().a(), gVar.b().h().a(), false), EC5Util.a(providerConfiguration, (ECParameterSpec) null));
            this.c = null;
        } else {
            EllipticCurve ellipticCurveA = EC5Util.a(gVar.a().b());
            this.b = new ae(gVar.b(), ECUtil.a(providerConfiguration, gVar.a()));
            this.c = EC5Util.a(ellipticCurveA, gVar.a());
        }
    }
}
