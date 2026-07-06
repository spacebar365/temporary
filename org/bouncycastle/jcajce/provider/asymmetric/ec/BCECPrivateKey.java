package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.a.aa.ab;
import org.bouncycastle.a.aa.aj;
import org.bouncycastle.a.au;
import org.bouncycastle.a.m;
import org.bouncycastle.a.p;
import org.bouncycastle.a.z.a;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.k.ad;
import org.bouncycastle.b.k.y;
import org.bouncycastle.c.a.b;
import org.bouncycastle.c.a.n;
import org.bouncycastle.c.c.e;
import org.bouncycastle.c.c.f;
import org.bouncycastle.d.a.d;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class BCECPrivateKey implements ECPrivateKey, b, n {
    private String a;
    private transient BigInteger b;
    private transient ECParameterSpec c;
    private transient ProviderConfiguration d;
    private transient au e;
    private transient PKCS12BagAttributeCarrierImpl f;

    protected BCECPrivateKey() {
        this.a = "EC";
        this.f = new PKCS12BagAttributeCarrierImpl();
    }

    public BCECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec, ProviderConfiguration providerConfiguration) {
        this.a = "EC";
        this.f = new PKCS12BagAttributeCarrierImpl();
        this.a = str;
        this.b = eCPrivateKeySpec.getS();
        this.c = eCPrivateKeySpec.getParams();
        this.d = providerConfiguration;
    }

    public BCECPrivateKey(String str, ad adVar, BCECPublicKey bCECPublicKey, ECParameterSpec eCParameterSpec, ProviderConfiguration providerConfiguration) {
        this.a = "EC";
        this.f = new PKCS12BagAttributeCarrierImpl();
        this.a = str;
        this.b = adVar.c();
        this.d = providerConfiguration;
        if (eCParameterSpec == null) {
            y yVarB = adVar.b();
            d dVarA = yVarB.a();
            yVarB.f();
            this.c = new ECParameterSpec(EC5Util.a(dVarA), EC5Util.a(yVarB.b()), yVarB.c(), yVarB.d().intValue());
        } else {
            this.c = eCParameterSpec;
        }
        this.e = a(bCECPublicKey);
    }

    public BCECPrivateKey(String str, ad adVar, BCECPublicKey bCECPublicKey, e eVar, ProviderConfiguration providerConfiguration) {
        this.a = "EC";
        this.f = new PKCS12BagAttributeCarrierImpl();
        this.a = str;
        this.b = adVar.c();
        this.d = providerConfiguration;
        if (eVar == null) {
            y yVarB = adVar.b();
            d dVarA = yVarB.a();
            yVarB.f();
            this.c = new ECParameterSpec(EC5Util.a(dVarA), EC5Util.a(yVarB.b()), yVarB.c(), yVarB.d().intValue());
        } else {
            this.c = EC5Util.a(EC5Util.a(eVar.b()), eVar);
        }
        try {
            this.e = a(bCECPublicKey);
        } catch (Exception e) {
            this.e = null;
        }
    }

    public BCECPrivateKey(String str, ad adVar, ProviderConfiguration providerConfiguration) {
        this.a = "EC";
        this.f = new PKCS12BagAttributeCarrierImpl();
        this.a = str;
        this.b = adVar.c();
        this.c = null;
        this.d = providerConfiguration;
    }

    public BCECPrivateKey(String str, f fVar, ProviderConfiguration providerConfiguration) {
        this.a = "EC";
        this.f = new PKCS12BagAttributeCarrierImpl();
        this.a = str;
        this.b = fVar.b();
        if (fVar.a() != null) {
            this.c = EC5Util.a(EC5Util.a(fVar.a().b()), fVar.a());
        } else {
            this.c = null;
        }
        this.d = providerConfiguration;
    }

    public BCECPrivateKey(ECPrivateKey eCPrivateKey, ProviderConfiguration providerConfiguration) {
        this.a = "EC";
        this.f = new PKCS12BagAttributeCarrierImpl();
        this.b = eCPrivateKey.getS();
        this.a = eCPrivateKey.getAlgorithm();
        this.c = eCPrivateKey.getParams();
        this.d = providerConfiguration;
    }

    private static au a(BCECPublicKey bCECPublicKey) {
        try {
            return u.a(org.bouncycastle.a.u.b(bCECPublicKey.getEncoded())).c();
        } catch (IOException e) {
            return null;
        }
    }

    private e d() {
        return this.c != null ? EC5Util.a(this.c) : this.d.a();
    }

    @Override // org.bouncycastle.c.a.n
    public final org.bouncycastle.a.f a(p pVar) {
        return this.f.a(pVar);
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
        this.f.a(pVar, fVar);
    }

    @Override // org.bouncycastle.c.a.n
    public final Enumeration b() {
        return this.f.b();
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
        ab abVarA = ECUtils.a(this.c);
        int iA = this.c == null ? ECUtil.a(this.d, (BigInteger) null, getS()) : ECUtil.a(this.d, this.c.getOrder(), getS());
        try {
            return new org.bouncycastle.a.s.p(new a(aj.k, abVarA), this.e != null ? new org.bouncycastle.a.u.a(iA, getS(), this.e, abVarA) : new org.bouncycastle.a.u.a(iA, getS(), abVarA)).a("DER");
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
        return ECUtil.a("EC", this.b, d());
    }

    BCECPrivateKey(String str, org.bouncycastle.a.s.p pVar, ProviderConfiguration providerConfiguration) {
        this.a = "EC";
        this.f = new PKCS12BagAttributeCarrierImpl();
        this.a = str;
        this.d = providerConfiguration;
        ab abVarA = ab.a(pVar.b().b());
        this.c = EC5Util.a(abVarA, EC5Util.a(this.d, abVarA));
        org.bouncycastle.a.f fVarC = pVar.c();
        if (fVarC instanceof m) {
            this.b = m.a(fVarC).b();
            return;
        }
        org.bouncycastle.a.u.a aVarA = org.bouncycastle.a.u.a.a(fVarC);
        this.b = aVarA.a();
        this.e = aVarA.b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECPrivateKey)) {
            return false;
        }
        BCECPrivateKey bCECPrivateKey = (BCECPrivateKey) obj;
        return this.b.equals(bCECPrivateKey.b) && d().equals(bCECPrivateKey.d());
    }

    public int hashCode() {
        return this.b.hashCode() ^ d().hashCode();
    }
}
