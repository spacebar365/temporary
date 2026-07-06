package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.a.aa;
import org.bouncycastle.a.au;
import org.bouncycastle.a.bb;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.be;
import org.bouncycastle.a.f;
import org.bouncycastle.a.l;
import org.bouncycastle.a.n.d;
import org.bouncycastle.a.n.e;
import org.bouncycastle.a.p;
import org.bouncycastle.a.s;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;
import org.bouncycastle.a.z.a;
import org.bouncycastle.a.z.c;
import org.bouncycastle.a.z.g;
import org.bouncycastle.a.z.m;
import org.bouncycastle.a.z.o;
import org.bouncycastle.a.z.r;
import org.bouncycastle.c.a.n;
import org.bouncycastle.c.b;
import org.bouncycastle.f.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* JADX INFO: loaded from: classes.dex */
class X509CertificateObject extends X509Certificate implements n {
    private JcaJceHelper a;
    private g b;
    private c c;
    private boolean[] d;
    private boolean e;
    private int f;
    private n g = new PKCS12BagAttributeCarrierImpl();

    public X509CertificateObject(JcaJceHelper jcaJceHelper, g gVar) throws CertificateParsingException {
        this.a = jcaJceHelper;
        this.b = gVar;
        try {
            byte[] bArrA = a("2.5.29.19");
            if (bArrA != null) {
                this.c = c.a(u.b(bArrA));
            }
            try {
                byte[] bArrA2 = a("2.5.29.15");
                if (bArrA2 == null) {
                    this.d = null;
                    return;
                }
                au auVarA = au.a((Object) u.b(bArrA2));
                byte[] bArrD = auVarA.d();
                int length = (bArrD.length * 8) - auVarA.f();
                this.d = new boolean[length >= 9 ? length : 9];
                for (int i = 0; i != length; i++) {
                    this.d[i] = (bArrD[i / 8] & (128 >>> (i % 8))) != 0;
                }
            } catch (Exception e) {
                throw new CertificateParsingException("cannot construct KeyUsage: ".concat(String.valueOf(e)));
            }
        } catch (Exception e2) {
            throw new CertificateParsingException("cannot construct BasicConstraints: ".concat(String.valueOf(e2)));
        }
    }

    private void a(PublicKey publicKey, Signature signature) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        if (!a(this.b.j(), this.b.a().a())) {
            throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
        }
        X509SignatureUtil.a(signature, this.b.j().b());
        signature.initVerify(publicKey);
        signature.update(getTBSCertificate());
        if (!signature.verify(getSignature())) {
            throw new SignatureException("certificate does not verify with supplied key");
        }
    }

    private static boolean a(a aVar, a aVar2) {
        if (aVar.a().equals(aVar2.a())) {
            return aVar.b() == null ? aVar2.b() == null || aVar2.b().equals(bc.a) : aVar2.b() == null ? aVar.b() == null || aVar.b().equals(bc.a) : aVar.b().equals(aVar2.b());
        }
        return false;
    }

    private byte[] a(String str) {
        m mVarA;
        org.bouncycastle.a.z.n nVarD = this.b.a().d();
        if (nVarD == null || (mVarA = nVarD.a(new p(str))) == null) {
            return null;
        }
        return mVarA.c().c();
    }

    @Override // org.bouncycastle.c.a.n
    public final f a(p pVar) {
        return this.g.a(pVar);
    }

    @Override // org.bouncycastle.c.a.n
    public final void a(p pVar, f fVar) {
        this.g.a(pVar, fVar);
    }

    @Override // org.bouncycastle.c.a.n
    public final Enumeration b() {
        return this.g.b();
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        checkValidity(new Date());
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        if (date.getTime() > getNotAfter().getTime()) {
            throw new CertificateExpiredException("certificate expired on " + this.b.f().a());
        }
        if (date.getTime() < getNotBefore().getTime()) {
            throw new CertificateNotYetValidException("certificate not valid till " + this.b.e().a());
        }
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X509CertificateObject)) {
            return super.equals(obj);
        }
        X509CertificateObject x509CertificateObject = (X509CertificateObject) obj;
        if (this.e && x509CertificateObject.e && this.f != x509CertificateObject.f) {
            return false;
        }
        return this.b.equals(x509CertificateObject.b);
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        if (this.c == null || !this.c.a()) {
            return -1;
        }
        if (this.c.b() == null) {
            return Integer.MAX_VALUE;
        }
        return this.c.b().intValue();
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet hashSet = new HashSet();
            org.bouncycastle.a.z.n nVarD = this.b.a().d();
            if (nVarD != null) {
                Enumeration enumerationA = nVarD.a();
                while (enumerationA.hasMoreElements()) {
                    p pVar = (p) enumerationA.nextElement();
                    if (nVarD.a(pVar).b()) {
                        hashSet.add(pVar.b());
                    }
                }
                return hashSet;
            }
        }
        return null;
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws CertificateEncodingException {
        try {
            return this.b.a("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public List getExtendedKeyUsage() throws CertificateParsingException {
        byte[] bArrA = a("2.5.29.37");
        if (bArrA == null) {
            return null;
        }
        try {
            v vVar = (v) new l(bArrA).b();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != vVar.d(); i++) {
                arrayList.add(((p) vVar.a(i)).b());
            }
            return Collections.unmodifiableList(arrayList);
        } catch (Exception e) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        m mVarA;
        org.bouncycastle.a.z.n nVarD = this.b.a().d();
        if (nVarD == null || (mVarA = nVarD.a(new p(str))) == null) {
            return null;
        }
        try {
            return mVarA.c().k();
        } catch (Exception e) {
            throw new IllegalStateException("error parsing " + e.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public Collection getIssuerAlternativeNames() {
        return a(a(m.f.b()));
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        try {
            return new b(org.bouncycastle.a.y.c.a(this.b.d().k()));
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        au auVarB = this.b.a().b();
        if (auVarB == null) {
            return null;
        }
        byte[] bArrD = auVarB.d();
        boolean[] zArr = new boolean[(bArrD.length * 8) - auVarB.f()];
        for (int i = 0; i != zArr.length; i++) {
            zArr[i] = (bArrD[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new s(byteArrayOutputStream).a(this.b.d());
            return new X500Principal(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        return this.d;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet hashSet = new HashSet();
            org.bouncycastle.a.z.n nVarD = this.b.a().d();
            if (nVarD != null) {
                Enumeration enumerationA = nVarD.a();
                while (enumerationA.hasMoreElements()) {
                    p pVar = (p) enumerationA.nextElement();
                    if (!nVarD.a(pVar).b()) {
                        hashSet.add(pVar.b());
                    }
                }
                return hashSet;
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
        return this.b.f().b();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        return this.b.e().b();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        try {
            return org.bouncycastle.c.b.a.a(this.b.h());
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return this.b.c().b();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        return X509SignatureUtil.a(this.b.j());
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return this.b.j().a().b();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        if (this.b.j().b() == null) {
            return null;
        }
        try {
            return this.b.j().b().i().a("DER");
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return this.b.l().c();
    }

    @Override // java.security.cert.X509Certificate
    public Collection getSubjectAlternativeNames() {
        return a(a(m.e.b()));
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return new b(org.bouncycastle.a.y.c.a(this.b.g().i()));
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        au auVarC = this.b.a().c();
        if (auVarC == null) {
            return null;
        }
        byte[] bArrD = auVarC.d();
        boolean[] zArr = new boolean[(bArrD.length * 8) - auVarC.f()];
        for (int i = 0; i != zArr.length; i++) {
            zArr[i] = (bArrD[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new s(byteArrayOutputStream).a(this.b.g());
            return new X500Principal(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws CertificateEncodingException {
        try {
            return this.b.a().a("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return this.b.b();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        org.bouncycastle.a.z.n nVarD;
        if (getVersion() == 3 && (nVarD = this.b.a().d()) != null) {
            Enumeration enumerationA = nVarD.a();
            while (enumerationA.hasMoreElements()) {
                p pVar = (p) enumerationA.nextElement();
                if (!pVar.equals(m.c) && !pVar.equals(m.q) && !pVar.equals(m.r) && !pVar.equals(m.w) && !pVar.equals(m.p) && !pVar.equals(m.m) && !pVar.equals(m.l) && !pVar.equals(m.t) && !pVar.equals(m.g) && !pVar.equals(m.e) && !pVar.equals(m.o) && nVarD.a(pVar).b()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.security.cert.Certificate
    public synchronized int hashCode() {
        if (!this.e) {
            this.f = super.hashCode();
            this.e = true;
        }
        return this.f;
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strA = k.a();
        stringBuffer.append("  [0]         Version: ").append(getVersion()).append(strA);
        stringBuffer.append("         SerialNumber: ").append(getSerialNumber()).append(strA);
        stringBuffer.append("             IssuerDN: ").append(getIssuerDN()).append(strA);
        stringBuffer.append("           Start Date: ").append(getNotBefore()).append(strA);
        stringBuffer.append("           Final Date: ").append(getNotAfter()).append(strA);
        stringBuffer.append("            SubjectDN: ").append(getSubjectDN()).append(strA);
        stringBuffer.append("           Public Key: ").append(getPublicKey()).append(strA);
        stringBuffer.append("  Signature Algorithm: ").append(getSigAlgName()).append(strA);
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ").append(new String(org.bouncycastle.f.a.f.a(signature, 0, 20))).append(strA);
        for (int i = 20; i < signature.length; i += 20) {
            if (i < signature.length - 20) {
                stringBuffer.append("                       ").append(new String(org.bouncycastle.f.a.f.a(signature, i, 20))).append(strA);
            } else {
                stringBuffer.append("                       ").append(new String(org.bouncycastle.f.a.f.a(signature, i, signature.length - i))).append(strA);
            }
        }
        org.bouncycastle.a.z.n nVarD = this.b.a().d();
        if (nVarD != null) {
            Enumeration enumerationA = nVarD.a();
            if (enumerationA.hasMoreElements()) {
                stringBuffer.append("       Extensions: \n");
            }
            while (enumerationA.hasMoreElements()) {
                p pVar = (p) enumerationA.nextElement();
                m mVarA = nVarD.a(pVar);
                if (mVarA.c() != null) {
                    l lVar = new l(mVarA.c().c());
                    stringBuffer.append("                       critical(").append(mVarA.b()).append(") ");
                    try {
                        if (pVar.equals(m.g)) {
                            stringBuffer.append(c.a(lVar.b())).append(strA);
                        } else if (pVar.equals(m.c)) {
                            stringBuffer.append(r.a(lVar.b())).append(strA);
                        } else if (pVar.equals(org.bouncycastle.a.n.c.b)) {
                            stringBuffer.append(new d((au) lVar.b())).append(strA);
                        } else if (pVar.equals(org.bouncycastle.a.n.c.d)) {
                            stringBuffer.append(new e((bb) lVar.b())).append(strA);
                        } else if (pVar.equals(org.bouncycastle.a.n.c.k)) {
                            stringBuffer.append(new org.bouncycastle.a.n.g((bb) lVar.b())).append(strA);
                        } else {
                            stringBuffer.append(pVar.b());
                            stringBuffer.append(" value = ").append(org.bouncycastle.a.x.a.a(lVar.b())).append(strA);
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
        return stringBuffer.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        Signature signature;
        String strA = X509SignatureUtil.a(this.b.j());
        try {
            signature = this.a.f(strA);
        } catch (Exception e) {
            signature = Signature.getInstance(strA);
        }
        a(publicKey, signature);
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        String strA = X509SignatureUtil.a(this.b.j());
        a(publicKey, str != null ? Signature.getInstance(strA, str) : Signature.getInstance(strA));
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        String strA = X509SignatureUtil.a(this.b.j());
        a(publicKey, provider != null ? Signature.getInstance(strA, provider) : Signature.getInstance(strA));
    }

    private static Collection a(byte[] bArr) throws CertificateParsingException {
        if (bArr == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration enumerationC = v.a(bArr).c();
            while (enumerationC.hasMoreElements()) {
                o oVarA = o.a(enumerationC.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(oVarA.a()));
                switch (oVarA.a()) {
                    case 0:
                    case 3:
                    case 5:
                        arrayList2.add(oVarA.k());
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    case 1:
                    case 2:
                    case 6:
                        arrayList2.add(((aa) oVarA.b()).b());
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    case 4:
                        arrayList2.add(org.bouncycastle.a.y.c.a(org.bouncycastle.a.y.a.d.R, oVarA.b()).toString());
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    case 7:
                        try {
                            arrayList2.add(InetAddress.getByAddress(be.a(oVarA.b()).c()).getHostAddress());
                            arrayList.add(Collections.unmodifiableList(arrayList2));
                        } catch (UnknownHostException e) {
                        }
                        break;
                    case 8:
                        arrayList2.add(p.a(oVarA.b()).b());
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    default:
                        throw new IOException("Bad tag number: " + oVarA.a());
                }
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return Collections.unmodifiableCollection(arrayList);
        } catch (Exception e2) {
            throw new CertificateParsingException(e2.getMessage());
        }
    }
}
