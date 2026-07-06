package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.a.l;
import org.bouncycastle.a.p;
import org.bouncycastle.a.u;
import org.bouncycastle.a.x.a;
import org.bouncycastle.a.y.c;
import org.bouncycastle.a.z.d;
import org.bouncycastle.a.z.e;
import org.bouncycastle.a.z.g;
import org.bouncycastle.a.z.h;
import org.bouncycastle.a.z.m;
import org.bouncycastle.a.z.n;
import org.bouncycastle.a.z.q;
import org.bouncycastle.a.z.v$a;
import org.bouncycastle.c.b;
import org.bouncycastle.f.a.f;
import org.bouncycastle.f.k;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* JADX INFO: loaded from: classes.dex */
class X509CRLObject extends X509CRL {
    private JcaJceHelper a;
    private h b;
    private String c;
    private byte[] d;
    private boolean e;
    private boolean f = false;
    private int g;

    protected X509CRLObject(JcaJceHelper jcaJceHelper, h hVar) throws CRLException {
        this.a = jcaJceHelper;
        this.b = hVar;
        try {
            this.c = X509SignatureUtil.a(hVar.c());
            if (hVar.c().b() != null) {
                this.d = hVar.c().b().i().a("DER");
            } else {
                this.d = null;
            }
            this.e = a(this);
        } catch (Exception e) {
            throw new CRLException("CRL contents invalid: ".concat(String.valueOf(e)));
        }
    }

    private Set a(boolean z) {
        n nVarB;
        if (getVersion() != 2 || (nVarB = this.b.a().b()) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumerationA = nVarB.a();
        while (enumerationA.hasMoreElements()) {
            p pVar = (p) enumerationA.nextElement();
            if (z == nVarB.a(pVar).b()) {
                hashSet.add(pVar.b());
            }
        }
        return hashSet;
    }

    private void a(PublicKey publicKey, Signature signature) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException {
        if (!this.b.c().equals(this.b.a().a())) {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
        if (this.d != null) {
            try {
                X509SignatureUtil.a(signature, u.b(this.d));
            } catch (IOException e) {
                throw new SignatureException("cannot decode signature parameters: " + e.getMessage());
            }
        }
        signature.initVerify(publicKey);
        signature.update(getTBSCertList());
        if (!signature.verify(getSignature())) {
            throw new SignatureException("CRL does not verify with supplied public key.");
        }
    }

    private static boolean a(X509CRL x509crl) throws ExtCRLException {
        try {
            byte[] extensionValue = x509crl.getExtensionValue(m.m.b());
            if (extensionValue != null) {
                if (q.a(org.bouncycastle.a.q.a(extensionValue).c()).a()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            throw new ExtCRLException("Exception reading IssuingDistributionPoint", e);
        }
    }

    @Override // java.security.cert.X509CRL
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509CRL)) {
            return false;
        }
        if (!(obj instanceof X509CRLObject)) {
            return super.equals(obj);
        }
        X509CRLObject x509CRLObject = (X509CRLObject) obj;
        if (this.f && x509CRLObject.f && x509CRLObject.g != this.g) {
            return false;
        }
        return this.b.equals(x509CRLObject.b);
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return a(true);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() throws CRLException {
        try {
            return this.b.a("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        m mVarA;
        n nVarB = this.b.a().b();
        if (nVarB == null || (mVarA = nVarB.a(new p(str))) == null) {
            return null;
        }
        try {
            return mVarA.c().k();
        } catch (Exception e) {
            throw new IllegalStateException("error parsing " + e.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public Principal getIssuerDN() {
        return new b(c.a(this.b.f().i()));
    }

    @Override // java.security.cert.X509CRL
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.b.f().k());
        } catch (IOException e) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getNextUpdate() {
        if (this.b.h() != null) {
            return this.b.h().b();
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return a(false);
    }

    @Override // java.security.cert.X509CRL
    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        m mVarA;
        Enumeration enumerationB = this.b.b();
        c cVarA = null;
        while (enumerationB.hasMoreElements()) {
            v$a v_a = (v$a) enumerationB.nextElement();
            if (bigInteger.equals(v_a.a().b())) {
                return new X509CRLEntryObject(v_a, this.e, cVarA);
            }
            cVarA = (this.e && v_a.d() && (mVarA = v_a.c().a(m.n)) != null) ? c.a(org.bouncycastle.a.z.p.a(mVarA.d()).a()[0].b()) : cVarA;
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgName() {
        return this.c;
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgOID() {
        return this.b.c().a().b();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSigAlgParams() {
        if (this.d == null) {
            return null;
        }
        byte[] bArr = new byte[this.d.length];
        System.arraycopy(this.d, 0, bArr, 0, bArr.length);
        return bArr;
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSignature() {
        return this.b.d().c();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getTBSCertList() throws CRLException {
        try {
            return this.b.a().a("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getThisUpdate() {
        return this.b.g().b();
    }

    @Override // java.security.cert.X509CRL
    public int getVersion() {
        return this.b.e();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(m.m.b());
        criticalExtensionOIDs.remove(m.l.b());
        return !criticalExtensionOIDs.isEmpty();
    }

    @Override // java.security.cert.X509CRL
    public int hashCode() {
        if (!this.f) {
            this.f = true;
            this.g = super.hashCode();
        }
        return this.g;
    }

    @Override // java.security.cert.CRL
    public boolean isRevoked(Certificate certificate) {
        c cVarD;
        m mVarA;
        if (!certificate.getType().equals("X.509")) {
            throw new IllegalArgumentException("X.509 CRL used with non X.509 Cert");
        }
        Enumeration enumerationB = this.b.b();
        c cVarF = this.b.f();
        if (enumerationB.hasMoreElements()) {
            BigInteger serialNumber = ((X509Certificate) certificate).getSerialNumber();
            c cVarA = cVarF;
            while (enumerationB.hasMoreElements()) {
                v$a v_aA = v$a.a(enumerationB.nextElement());
                if (this.e && v_aA.d() && (mVarA = v_aA.c().a(m.n)) != null) {
                    cVarA = c.a(org.bouncycastle.a.z.p.a(mVarA.d()).a()[0].b());
                }
                if (v_aA.a().b().equals(serialNumber)) {
                    if (certificate instanceof X509Certificate) {
                        cVarD = c.a(((X509Certificate) certificate).getIssuerX500Principal().getEncoded());
                    } else {
                        try {
                            cVarD = g.a(certificate.getEncoded()).d();
                        } catch (CertificateEncodingException e) {
                            throw new IllegalArgumentException("Cannot process certificate: " + e.getMessage());
                        }
                    }
                    return cVarA.equals(cVarD);
                }
            }
        }
        return false;
    }

    @Override // java.security.cert.CRL
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strA = k.a();
        stringBuffer.append("              Version: ").append(getVersion()).append(strA);
        stringBuffer.append("             IssuerDN: ").append(getIssuerDN()).append(strA);
        stringBuffer.append("          This update: ").append(getThisUpdate()).append(strA);
        stringBuffer.append("          Next update: ").append(getNextUpdate()).append(strA);
        stringBuffer.append("  Signature Algorithm: ").append(getSigAlgName()).append(strA);
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ").append(new String(f.a(signature, 0, 20))).append(strA);
        for (int i = 20; i < signature.length; i += 20) {
            if (i < signature.length - 20) {
                stringBuffer.append("                       ").append(new String(f.a(signature, i, 20))).append(strA);
            } else {
                stringBuffer.append("                       ").append(new String(f.a(signature, i, signature.length - i))).append(strA);
            }
        }
        n nVarB = this.b.a().b();
        if (nVarB != null) {
            Enumeration enumerationA = nVarB.a();
            if (enumerationA.hasMoreElements()) {
                stringBuffer.append("           Extensions: ").append(strA);
            }
            while (enumerationA.hasMoreElements()) {
                p pVar = (p) enumerationA.nextElement();
                m mVarA = nVarB.a(pVar);
                if (mVarA.c() != null) {
                    l lVar = new l(mVarA.c().c());
                    stringBuffer.append("                       critical(").append(mVarA.b()).append(") ");
                    try {
                        if (pVar.equals(m.h)) {
                            stringBuffer.append(new e(org.bouncycastle.a.m.a((Object) lVar.b()).c())).append(strA);
                        } else if (pVar.equals(m.l)) {
                            stringBuffer.append("Base CRL: " + new e(org.bouncycastle.a.m.a((Object) lVar.b()).c())).append(strA);
                        } else if (pVar.equals(m.m)) {
                            stringBuffer.append(q.a(lVar.b())).append(strA);
                        } else if (pVar.equals(m.p)) {
                            stringBuffer.append(d.a(lVar.b())).append(strA);
                        } else if (pVar.equals(m.v)) {
                            stringBuffer.append(d.a(lVar.b())).append(strA);
                        } else {
                            stringBuffer.append(pVar.b());
                            stringBuffer.append(" value = ").append(a.a(lVar.b())).append(strA);
                        }
                    } catch (Exception e) {
                        stringBuffer.append(pVar.b());
                        stringBuffer.append(" value = *****").append(strA);
                    }
                } else {
                    stringBuffer.append(strA);
                }
            }
        }
        Set revokedCertificates = getRevokedCertificates();
        if (revokedCertificates != null) {
            Iterator it = revokedCertificates.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next());
                stringBuffer.append(strA);
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException {
        Signature signature;
        try {
            signature = this.a.f(getSigAlgName());
        } catch (Exception e) {
            signature = Signature.getInstance(getSigAlgName());
        }
        a(publicKey, signature);
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, String str) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException {
        a(publicKey, str != null ? Signature.getInstance(getSigAlgName(), str) : Signature.getInstance(getSigAlgName()));
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, Provider provider) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException {
        a(publicKey, provider != null ? Signature.getInstance(getSigAlgName(), provider) : Signature.getInstance(getSigAlgName()));
    }

    @Override // java.security.cert.X509CRL
    public Set getRevokedCertificates() {
        m mVarA;
        HashSet hashSet = new HashSet();
        Enumeration enumerationB = this.b.b();
        c cVarA = null;
        while (enumerationB.hasMoreElements()) {
            v$a v_a = (v$a) enumerationB.nextElement();
            hashSet.add(new X509CRLEntryObject(v_a, this.e, cVarA));
            cVarA = (this.e && v_a.d() && (mVarA = v_a.c().a(m.n)) != null) ? c.a(org.bouncycastle.a.z.p.a(mVarA.d()).a()[0].b()) : cVarA;
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
