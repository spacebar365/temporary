package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.io.IOException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.a.aa.ab;
import org.bouncycastle.a.aa.af;
import org.bouncycastle.a.aa.ai;
import org.bouncycastle.a.aa.aj;
import org.bouncycastle.a.be;
import org.bouncycastle.a.q;
import org.bouncycastle.a.z.a;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.k.ae;
import org.bouncycastle.b.k.y;
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
public class BCECPublicKey implements ECPublicKey, c {
    private String a;
    private boolean b;
    private transient ae c;
    private transient ECParameterSpec d;
    private transient ProviderConfiguration e;

    public BCECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec, ProviderConfiguration providerConfiguration) {
        this.a = "EC";
        this.a = str;
        this.d = eCPublicKeySpec.getParams();
        this.c = new ae(EC5Util.a(this.d, eCPublicKeySpec.getW()), EC5Util.a(providerConfiguration, eCPublicKeySpec.getParams()));
        this.e = providerConfiguration;
    }

    public BCECPublicKey(String str, ae aeVar, ECParameterSpec eCParameterSpec, ProviderConfiguration providerConfiguration) {
        this.a = "EC";
        y yVarB = aeVar.b();
        this.a = str;
        this.c = aeVar;
        if (eCParameterSpec == null) {
            d dVarA = yVarB.a();
            yVarB.f();
            this.d = a(EC5Util.a(dVarA), yVarB);
        } else {
            this.d = eCParameterSpec;
        }
        this.e = providerConfiguration;
    }

    public BCECPublicKey(String str, ae aeVar, e eVar, ProviderConfiguration providerConfiguration) {
        this.a = "EC";
        y yVarB = aeVar.b();
        this.a = str;
        if (eVar == null) {
            d dVarA = yVarB.a();
            yVarB.f();
            this.d = a(EC5Util.a(dVarA), yVarB);
        } else {
            this.d = EC5Util.a(EC5Util.a(eVar.b()), eVar);
        }
        this.c = aeVar;
        this.e = providerConfiguration;
    }

    public BCECPublicKey(String str, ae aeVar, ProviderConfiguration providerConfiguration) {
        this.a = "EC";
        this.a = str;
        this.c = aeVar;
        this.d = null;
        this.e = providerConfiguration;
    }

    public BCECPublicKey(ECPublicKey eCPublicKey, ProviderConfiguration providerConfiguration) {
        this.a = "EC";
        this.a = eCPublicKey.getAlgorithm();
        this.d = eCPublicKey.getParams();
        this.c = new ae(EC5Util.a(this.d, eCPublicKey.getW()), EC5Util.a(providerConfiguration, eCPublicKey.getParams()));
    }

    private static ECParameterSpec a(EllipticCurve ellipticCurve, y yVar) {
        return new ECParameterSpec(ellipticCurve, EC5Util.a(yVar.b()), yVar.c(), yVar.d().intValue());
    }

    private e d() {
        return this.d != null ? EC5Util.a(this.d) : this.e.a();
    }

    @Override // org.bouncycastle.c.a.a
    public final e a() {
        if (this.d == null) {
            return null;
        }
        return EC5Util.a(this.d);
    }

    final ae b() {
        return this.c;
    }

    @Override // org.bouncycastle.c.a.c
    public final j c() {
        j jVarC = this.c.c();
        return this.d == null ? jVarC.c() : jVarC;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECPublicKey)) {
            return false;
        }
        BCECPublicKey bCECPublicKey = (BCECPublicKey) obj;
        return this.c.c().a(bCECPublicKey.c.c()) && d().equals(bCECPublicKey.d());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.a;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.a(new u(new a(aj.k, ECUtils.a(this.d)), q.a((Object) new af(this.c.c(), this.b).i()).c()));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.d;
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return EC5Util.a(this.c.c());
    }

    public int hashCode() {
        return this.c.c().hashCode() ^ d().hashCode();
    }

    public String toString() {
        return ECUtil.a("EC", this.c.c(), d());
    }

    public BCECPublicKey(String str, g gVar, ProviderConfiguration providerConfiguration) {
        this.a = "EC";
        this.a = str;
        if (gVar.a() != null) {
            EllipticCurve ellipticCurveA = EC5Util.a(gVar.a().b());
            this.c = new ae(gVar.b(), ECUtil.a(providerConfiguration, gVar.a()));
            this.d = EC5Util.a(ellipticCurveA, gVar.a());
        } else {
            this.c = new ae(providerConfiguration.a().b().a(gVar.b().g().a(), gVar.b().h().a(), false), EC5Util.a(providerConfiguration, (ECParameterSpec) null));
            this.d = null;
        }
        this.e = providerConfiguration;
    }

    BCECPublicKey(String str, u uVar, ProviderConfiguration providerConfiguration) {
        this.a = "EC";
        this.a = str;
        this.e = providerConfiguration;
        ab abVarA = ab.a(uVar.a().b());
        d dVarA = EC5Util.a(this.e, abVarA);
        this.d = EC5Util.a(abVarA, dVarA);
        byte[] bArrD = uVar.c().d();
        q beVar = new be(bArrD);
        if (bArrD[0] == 4 && bArrD[1] == bArrD.length - 2 && (bArrD[2] == 2 || bArrD[2] == 3)) {
            new ai();
            if (ai.a(dVarA) >= bArrD.length - 3) {
                try {
                    beVar = (q) org.bouncycastle.a.u.b(bArrD);
                } catch (IOException e) {
                    throw new IllegalArgumentException("error recovering public key");
                }
            }
        }
        this.c = new ae(new af(dVarA, beVar).a(), ECUtil.a(this.e, abVarA));
    }
}
