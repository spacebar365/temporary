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
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.C0638l;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p079x.C0748a;
import org.bouncycastle.p054a.p080y.C0756c;
import org.bouncycastle.p054a.p082z.C0763d;
import org.bouncycastle.p054a.p082z.C0764e;
import org.bouncycastle.p054a.p082z.C0766g;
import org.bouncycastle.p054a.p082z.C0767h;
import org.bouncycastle.p054a.p082z.C0772m;
import org.bouncycastle.p054a.p082z.C0773n;
import org.bouncycastle.p054a.p082z.C0775p;
import org.bouncycastle.p054a.p082z.C0776q;
import org.bouncycastle.p054a.p082z.C0781v;
import org.bouncycastle.p103c.C1199b;
import org.bouncycastle.p142f.C1560k;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: loaded from: classes.dex */
class X509CRLObject extends X509CRL {

    /* JADX INFO: renamed from: a */
    private JcaJceHelper f5948a;

    /* JADX INFO: renamed from: b */
    private C0767h f5949b;

    /* JADX INFO: renamed from: c */
    private String f5950c;

    /* JADX INFO: renamed from: d */
    private byte[] f5951d;

    /* JADX INFO: renamed from: e */
    private boolean f5952e;

    /* JADX INFO: renamed from: f */
    private boolean f5953f = false;

    /* JADX INFO: renamed from: g */
    private int f5954g;

    protected X509CRLObject(JcaJceHelper jcaJceHelper, C0767h c0767h) throws CRLException {
        this.f5948a = jcaJceHelper;
        this.f5949b = c0767h;
        try {
            this.f5950c = X509SignatureUtil.m4364a(c0767h.m1807c());
            if (c0767h.m1807c().m1784b() != null) {
                this.f5951d = c0767h.m1807c().m1784b().mo1358i().m1577a("DER");
            } else {
                this.f5951d = null;
            }
            this.f5952e = m4358a(this);
        } catch (Exception e) {
            throw new CRLException("CRL contents invalid: ".concat(String.valueOf(e)));
        }
    }

    /* JADX INFO: renamed from: a */
    private Set m4356a(boolean z) {
        C0773n c0773nM1848b;
        if (getVersion() != 2 || (c0773nM1848b = this.f5949b.m1805a().m1848b()) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumerationM1829a = c0773nM1848b.m1829a();
        while (enumerationM1829a.hasMoreElements()) {
            C0653p c0653p = (C0653p) enumerationM1829a.nextElement();
            if (z == c0773nM1848b.m1830a(c0653p).m1825b()) {
                hashSet.add(c0653p.m1593b());
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    private void m4357a(PublicKey publicKey, Signature signature) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException {
        if (!this.f5949b.m1807c().equals(this.f5949b.m1805a().m1847a())) {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
        if (this.f5951d != null) {
            try {
                X509SignatureUtil.m4365a(signature, AbstractC0686u.m1692b(this.f5951d));
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

    /* JADX INFO: renamed from: a */
    private static boolean m4358a(X509CRL x509crl) throws ExtCRLException {
        try {
            byte[] extensionValue = x509crl.getExtensionValue(C0772m.f3185m.m1593b());
            if (extensionValue != null) {
                if (C0776q.m1838a(AbstractC0655q.m1596a(extensionValue).mo1410c()).m1840a()) {
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
        if (this.f5953f && x509CRLObject.f5953f && x509CRLObject.f5954g != this.f5954g) {
            return false;
        }
        return this.f5949b.equals(x509CRLObject.f5949b);
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return m4356a(true);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() throws CRLException {
        try {
            return this.f5949b.m1577a("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        C0772m c0772mM1830a;
        C0773n c0773nM1848b = this.f5949b.m1805a().m1848b();
        if (c0773nM1848b == null || (c0772mM1830a = c0773nM1848b.m1830a(new C0653p(str))) == null) {
            return null;
        }
        try {
            return c0772mM1830a.m1826c().mo1578k();
        } catch (Exception e) {
            throw new IllegalStateException("error parsing " + e.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public Principal getIssuerDN() {
        return new C1199b(C0756c.m1774a(this.f5949b.m1810f().mo1358i()));
    }

    @Override // java.security.cert.X509CRL
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.f5949b.m1810f().mo1578k());
        } catch (IOException e) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getNextUpdate() {
        if (this.f5949b.m1812h() != null) {
            return this.f5949b.m1812h().m1861b();
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return m4356a(false);
    }

    @Override // java.security.cert.X509CRL
    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        C0772m c0772mM1830a;
        Enumeration enumerationM1806b = this.f5949b.m1806b();
        C0756c c0756cM1774a = null;
        while (enumerationM1806b.hasMoreElements()) {
            C0781v.a aVar = (C0781v.a) enumerationM1806b.nextElement();
            if (bigInteger.equals(aVar.m1850a().m1564b())) {
                return new X509CRLEntryObject(aVar, this.f5952e, c0756cM1774a);
            }
            c0756cM1774a = (this.f5952e && aVar.m1853d() && (c0772mM1830a = aVar.m1852c().m1830a(C0772m.f3186n)) != null) ? C0756c.m1774a(C0775p.m1834a(c0772mM1830a.m1827d()).m1836a()[0].m1833b()) : c0756cM1774a;
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgName() {
        return this.f5950c;
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgOID() {
        return this.f5949b.m1807c().m1783a().m1593b();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSigAlgParams() {
        if (this.f5951d == null) {
            return null;
        }
        byte[] bArr = new byte[this.f5951d.length];
        System.arraycopy(this.f5951d, 0, bArr, 0, bArr.length);
        return bArr;
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSignature() {
        return this.f5949b.m1808d().m1473c();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getTBSCertList() throws CRLException {
        try {
            return this.f5949b.m1805a().m1577a("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getThisUpdate() {
        return this.f5949b.m1811g().m1861b();
    }

    @Override // java.security.cert.X509CRL
    public int getVersion() {
        return this.f5949b.m1809e();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(C0772m.f3185m.m1593b());
        criticalExtensionOIDs.remove(C0772m.f3184l.m1593b());
        return !criticalExtensionOIDs.isEmpty();
    }

    @Override // java.security.cert.X509CRL
    public int hashCode() {
        if (!this.f5953f) {
            this.f5953f = true;
            this.f5954g = super.hashCode();
        }
        return this.f5954g;
    }

    @Override // java.security.cert.CRL
    public boolean isRevoked(Certificate certificate) {
        C0756c c0756cM1797d;
        C0772m c0772mM1830a;
        if (!certificate.getType().equals("X.509")) {
            throw new IllegalArgumentException("X.509 CRL used with non X.509 Cert");
        }
        Enumeration enumerationM1806b = this.f5949b.m1806b();
        C0756c c0756cM1810f = this.f5949b.m1810f();
        if (enumerationM1806b.hasMoreElements()) {
            BigInteger serialNumber = ((X509Certificate) certificate).getSerialNumber();
            C0756c c0756cM1774a = c0756cM1810f;
            while (enumerationM1806b.hasMoreElements()) {
                C0781v.a aVarM1849a = C0781v.a.m1849a(enumerationM1806b.nextElement());
                if (this.f5952e && aVarM1849a.m1853d() && (c0772mM1830a = aVarM1849a.m1852c().m1830a(C0772m.f3186n)) != null) {
                    c0756cM1774a = C0756c.m1774a(C0775p.m1834a(c0772mM1830a.m1827d()).m1836a()[0].m1833b());
                }
                if (aVarM1849a.m1850a().m1564b().equals(serialNumber)) {
                    if (certificate instanceof X509Certificate) {
                        c0756cM1797d = C0756c.m1774a(((X509Certificate) certificate).getIssuerX500Principal().getEncoded());
                    } else {
                        try {
                            c0756cM1797d = C0766g.m1793a(certificate.getEncoded()).m1797d();
                        } catch (CertificateEncodingException e) {
                            throw new IllegalArgumentException("Cannot process certificate: " + e.getMessage());
                        }
                    }
                    return c0756cM1774a.equals(c0756cM1797d);
                }
            }
        }
        return false;
    }

    @Override // java.security.cert.CRL
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strM4158a = C1560k.m4158a();
        stringBuffer.append("              Version: ").append(getVersion()).append(strM4158a);
        stringBuffer.append("             IssuerDN: ").append(getIssuerDN()).append(strM4158a);
        stringBuffer.append("          This update: ").append(getThisUpdate()).append(strM4158a);
        stringBuffer.append("          Next update: ").append(getNextUpdate()).append(strM4158a);
        stringBuffer.append("  Signature Algorithm: ").append(getSigAlgName()).append(strM4158a);
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ").append(new String(C1541f.m4107a(signature, 0, 20))).append(strM4158a);
        for (int i = 20; i < signature.length; i += 20) {
            if (i < signature.length - 20) {
                stringBuffer.append("                       ").append(new String(C1541f.m4107a(signature, i, 20))).append(strM4158a);
            } else {
                stringBuffer.append("                       ").append(new String(C1541f.m4107a(signature, i, signature.length - i))).append(strM4158a);
            }
        }
        C0773n c0773nM1848b = this.f5949b.m1805a().m1848b();
        if (c0773nM1848b != null) {
            Enumeration enumerationM1829a = c0773nM1848b.m1829a();
            if (enumerationM1829a.hasMoreElements()) {
                stringBuffer.append("           Extensions: ").append(strM4158a);
            }
            while (enumerationM1829a.hasMoreElements()) {
                C0653p c0653p = (C0653p) enumerationM1829a.nextElement();
                C0772m c0772mM1830a = c0773nM1848b.m1830a(c0653p);
                if (c0772mM1830a.m1826c() != null) {
                    C0638l c0638l = new C0638l(c0772mM1830a.m1826c().mo1410c());
                    stringBuffer.append("                       critical(").append(c0772mM1830a.m1825b()).append(") ");
                    try {
                        if (c0653p.equals(C0772m.f3180h)) {
                            stringBuffer.append(new C0764e(C0640m.m1561a((Object) c0638l.m1560b()).m1565c())).append(strM4158a);
                        } else if (c0653p.equals(C0772m.f3184l)) {
                            stringBuffer.append("Base CRL: " + new C0764e(C0640m.m1561a((Object) c0638l.m1560b()).m1565c())).append(strM4158a);
                        } else if (c0653p.equals(C0772m.f3185m)) {
                            stringBuffer.append(C0776q.m1838a(c0638l.m1560b())).append(strM4158a);
                        } else if (c0653p.equals(C0772m.f3188p)) {
                            stringBuffer.append(C0763d.m1790a(c0638l.m1560b())).append(strM4158a);
                        } else if (c0653p.equals(C0772m.f3194v)) {
                            stringBuffer.append(C0763d.m1790a(c0638l.m1560b())).append(strM4158a);
                        } else {
                            stringBuffer.append(c0653p.m1593b());
                            stringBuffer.append(" value = ").append(C0748a.m1749a(c0638l.m1560b())).append(strM4158a);
                        }
                    } catch (Exception e) {
                        stringBuffer.append(c0653p.m1593b());
                        stringBuffer.append(" value = *****").append(strM4158a);
                    }
                } else {
                    stringBuffer.append(strM4158a);
                }
            }
        }
        Set revokedCertificates = getRevokedCertificates();
        if (revokedCertificates != null) {
            Iterator it = revokedCertificates.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next());
                stringBuffer.append(strM4158a);
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException {
        Signature signature;
        try {
            signature = this.f5948a.mo4525f(getSigAlgName());
        } catch (Exception e) {
            signature = Signature.getInstance(getSigAlgName());
        }
        m4357a(publicKey, signature);
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, String str) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException {
        m4357a(publicKey, str != null ? Signature.getInstance(getSigAlgName(), str) : Signature.getInstance(getSigAlgName()));
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, Provider provider) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CRLException {
        m4357a(publicKey, provider != null ? Signature.getInstance(getSigAlgName(), provider) : Signature.getInstance(getSigAlgName()));
    }

    @Override // java.security.cert.X509CRL
    public Set getRevokedCertificates() {
        C0772m c0772mM1830a;
        HashSet hashSet = new HashSet();
        Enumeration enumerationM1806b = this.f5949b.m1806b();
        C0756c c0756cM1774a = null;
        while (enumerationM1806b.hasMoreElements()) {
            C0781v.a aVar = (C0781v.a) enumerationM1806b.nextElement();
            hashSet.add(new X509CRLEntryObject(aVar, this.f5952e, c0756cM1774a));
            c0756cM1774a = (this.f5952e && aVar.m1853d() && (c0772mM1830a = aVar.m1852c().m1830a(C0772m.f3186n)) != null) ? C0756c.m1774a(C0775p.m1834a(c0772mM1830a.m1827d()).m1836a()[0].m1833b()) : c0756cM1774a;
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
