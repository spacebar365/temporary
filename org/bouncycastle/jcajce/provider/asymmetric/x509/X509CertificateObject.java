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
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0558au;
import org.bouncycastle.p054a.C0578bb;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0638l;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.C0660s;
import org.bouncycastle.p054a.InterfaceC0502aa;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p069n.C0646d;
import org.bouncycastle.p054a.p069n.C0647e;
import org.bouncycastle.p054a.p069n.C0649g;
import org.bouncycastle.p054a.p069n.InterfaceC0645c;
import org.bouncycastle.p054a.p079x.C0748a;
import org.bouncycastle.p054a.p080y.C0756c;
import org.bouncycastle.p054a.p080y.p081a.C0754d;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0762c;
import org.bouncycastle.p054a.p082z.C0766g;
import org.bouncycastle.p054a.p082z.C0772m;
import org.bouncycastle.p054a.p082z.C0773n;
import org.bouncycastle.p054a.p082z.C0774o;
import org.bouncycastle.p054a.p082z.C0777r;
import org.bouncycastle.p103c.C1199b;
import org.bouncycastle.p103c.p104a.InterfaceC1198n;
import org.bouncycastle.p103c.p105b.C1200a;
import org.bouncycastle.p142f.C1560k;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: loaded from: classes.dex */
class X509CertificateObject extends X509Certificate implements InterfaceC1198n {

    /* JADX INFO: renamed from: a */
    private JcaJceHelper f5955a;

    /* JADX INFO: renamed from: b */
    private C0766g f5956b;

    /* JADX INFO: renamed from: c */
    private C0762c f5957c;

    /* JADX INFO: renamed from: d */
    private boolean[] f5958d;

    /* JADX INFO: renamed from: e */
    private boolean f5959e;

    /* JADX INFO: renamed from: f */
    private int f5960f;

    /* JADX INFO: renamed from: g */
    private InterfaceC1198n f5961g = new PKCS12BagAttributeCarrierImpl();

    public X509CertificateObject(JcaJceHelper jcaJceHelper, C0766g c0766g) throws CertificateParsingException {
        this.f5955a = jcaJceHelper;
        this.f5956b = c0766g;
        try {
            byte[] bArrM4362a = m4362a("2.5.29.19");
            if (bArrM4362a != null) {
                this.f5957c = C0762c.m1787a(AbstractC0686u.m1692b(bArrM4362a));
            }
            try {
                byte[] bArrM4362a2 = m4362a("2.5.29.15");
                if (bArrM4362a2 == null) {
                    this.f5958d = null;
                    return;
                }
                C0558au c0558auM1414a = C0558au.m1414a((Object) AbstractC0686u.m1692b(bArrM4362a2));
                byte[] bArrM1474d = c0558auM1414a.m1474d();
                int length = (bArrM1474d.length * 8) - c0558auM1414a.m1475f();
                this.f5958d = new boolean[length >= 9 ? length : 9];
                for (int i = 0; i != length; i++) {
                    this.f5958d[i] = (bArrM1474d[i / 8] & (128 >>> (i % 8))) != 0;
                }
            } catch (Exception e) {
                throw new CertificateParsingException("cannot construct KeyUsage: ".concat(String.valueOf(e)));
            }
        } catch (Exception e2) {
            throw new CertificateParsingException("cannot construct BasicConstraints: ".concat(String.valueOf(e2)));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4360a(PublicKey publicKey, Signature signature) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        if (!m4361a(this.f5956b.m1802j(), this.f5956b.m1794a().m1855a())) {
            throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
        }
        X509SignatureUtil.m4365a(signature, this.f5956b.m1802j().m1784b());
        signature.initVerify(publicKey);
        signature.update(getTBSCertificate());
        if (!signature.verify(getSignature())) {
            throw new SignatureException("certificate does not verify with supplied key");
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4361a(C0759a c0759a, C0759a c0759a2) {
        if (c0759a.m1783a().equals(c0759a2.m1783a())) {
            return c0759a.m1784b() == null ? c0759a2.m1784b() == null || c0759a2.m1784b().equals(C0579bc.f2112a) : c0759a2.m1784b() == null ? c0759a.m1784b() == null || c0759a.m1784b().equals(C0579bc.f2112a) : c0759a.m1784b().equals(c0759a2.m1784b());
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private byte[] m4362a(String str) {
        C0772m c0772mM1830a;
        C0773n c0773nM1858d = this.f5956b.m1794a().m1858d();
        if (c0773nM1858d == null || (c0772mM1830a = c0773nM1858d.m1830a(new C0653p(str))) == null) {
            return null;
        }
        return c0772mM1830a.m1826c().mo1410c();
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: a */
    public final InterfaceC0618f mo2845a(C0653p c0653p) {
        return this.f5961g.mo2845a(c0653p);
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: a */
    public final void mo2846a(C0653p c0653p, InterfaceC0618f interfaceC0618f) {
        this.f5961g.mo2846a(c0653p, interfaceC0618f);
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: b */
    public final Enumeration mo2847b() {
        return this.f5961g.mo2847b();
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        checkValidity(new Date());
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        if (date.getTime() > getNotAfter().getTime()) {
            throw new CertificateExpiredException("certificate expired on " + this.f5956b.m1799f().m1860a());
        }
        if (date.getTime() < getNotBefore().getTime()) {
            throw new CertificateNotYetValidException("certificate not valid till " + this.f5956b.m1798e().m1860a());
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
        if (this.f5959e && x509CertificateObject.f5959e && this.f5960f != x509CertificateObject.f5960f) {
            return false;
        }
        return this.f5956b.equals(x509CertificateObject.f5956b);
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        if (this.f5957c == null || !this.f5957c.m1788a()) {
            return -1;
        }
        if (this.f5957c.m1789b() == null) {
            return Integer.MAX_VALUE;
        }
        return this.f5957c.m1789b().intValue();
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet hashSet = new HashSet();
            C0773n c0773nM1858d = this.f5956b.m1794a().m1858d();
            if (c0773nM1858d != null) {
                Enumeration enumerationM1829a = c0773nM1858d.m1829a();
                while (enumerationM1829a.hasMoreElements()) {
                    C0653p c0653p = (C0653p) enumerationM1829a.nextElement();
                    if (c0773nM1858d.m1830a(c0653p).m1825b()) {
                        hashSet.add(c0653p.m1593b());
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
            return this.f5956b.m1577a("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public List getExtendedKeyUsage() throws CertificateParsingException {
        byte[] bArrM4362a = m4362a("2.5.29.37");
        if (bArrM4362a == null) {
            return null;
        }
        try {
            AbstractC0723v abstractC0723v = (AbstractC0723v) new C0638l(bArrM4362a).m1560b();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != abstractC0723v.mo1484d(); i++) {
                arrayList.add(((C0653p) abstractC0723v.mo1482a(i)).m1593b());
            }
            return Collections.unmodifiableList(arrayList);
        } catch (Exception e) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        C0772m c0772mM1830a;
        C0773n c0773nM1858d = this.f5956b.m1794a().m1858d();
        if (c0773nM1858d == null || (c0772mM1830a = c0773nM1858d.m1830a(new C0653p(str))) == null) {
            return null;
        }
        try {
            return c0772mM1830a.m1826c().mo1578k();
        } catch (Exception e) {
            throw new IllegalStateException("error parsing " + e.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public Collection getIssuerAlternativeNames() {
        return m4359a(m4362a(C0772m.f3178f.m1593b()));
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        try {
            return new C1199b(C0756c.m1774a(this.f5956b.m1797d().mo1578k()));
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        C0558au c0558auM1856b = this.f5956b.m1794a().m1856b();
        if (c0558auM1856b == null) {
            return null;
        }
        byte[] bArrD = c0558auM1856b.m1474d();
        boolean[] zArr = new boolean[(bArrD.length * 8) - c0558auM1856b.m1475f()];
        for (int i = 0; i != zArr.length; i++) {
            zArr[i] = (bArrD[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new C0660s(byteArrayOutputStream).mo1459a(this.f5956b.m1797d());
            return new X500Principal(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        return this.f5958d;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet hashSet = new HashSet();
            C0773n c0773nM1858d = this.f5956b.m1794a().m1858d();
            if (c0773nM1858d != null) {
                Enumeration enumerationM1829a = c0773nM1858d.m1829a();
                while (enumerationM1829a.hasMoreElements()) {
                    C0653p c0653p = (C0653p) enumerationM1829a.nextElement();
                    if (!c0773nM1858d.m1830a(c0653p).m1825b()) {
                        hashSet.add(c0653p.m1593b());
                    }
                }
                return hashSet;
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
        return this.f5956b.m1799f().m1861b();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        return this.f5956b.m1798e().m1861b();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        try {
            return C1200a.m2849a(this.f5956b.m1801h());
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return this.f5956b.m1796c().m1564b();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        return X509SignatureUtil.m4364a(this.f5956b.m1802j());
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return this.f5956b.m1802j().m1783a().m1593b();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        if (this.f5956b.m1802j().m1784b() == null) {
            return null;
        }
        try {
            return this.f5956b.m1802j().m1784b().mo1358i().m1577a("DER");
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return this.f5956b.m1803l().m1473c();
    }

    @Override // java.security.cert.X509Certificate
    public Collection getSubjectAlternativeNames() {
        return m4359a(m4362a(C0772m.f3177e.m1593b()));
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return new C1199b(C0756c.m1774a(this.f5956b.m1800g().mo1358i()));
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        C0558au c0558auM1857c = this.f5956b.m1794a().m1857c();
        if (c0558auM1857c == null) {
            return null;
        }
        byte[] bArrD = c0558auM1857c.m1474d();
        boolean[] zArr = new boolean[(bArrD.length * 8) - c0558auM1857c.m1475f()];
        for (int i = 0; i != zArr.length; i++) {
            zArr[i] = (bArrD[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new C0660s(byteArrayOutputStream).mo1459a(this.f5956b.m1800g());
            return new X500Principal(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws CertificateEncodingException {
        try {
            return this.f5956b.m1794a().m1577a("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return this.f5956b.m1795b();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        C0773n c0773nM1858d;
        if (getVersion() == 3 && (c0773nM1858d = this.f5956b.m1794a().m1858d()) != null) {
            Enumeration enumerationM1829a = c0773nM1858d.m1829a();
            while (enumerationM1829a.hasMoreElements()) {
                C0653p c0653p = (C0653p) enumerationM1829a.nextElement();
                if (!c0653p.equals(C0772m.f3175c) && !c0653p.equals(C0772m.f3189q) && !c0653p.equals(C0772m.f3190r) && !c0653p.equals(C0772m.f3195w) && !c0653p.equals(C0772m.f3188p) && !c0653p.equals(C0772m.f3185m) && !c0653p.equals(C0772m.f3184l) && !c0653p.equals(C0772m.f3192t) && !c0653p.equals(C0772m.f3179g) && !c0653p.equals(C0772m.f3177e) && !c0653p.equals(C0772m.f3187o) && c0773nM1858d.m1830a(c0653p).m1825b()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.security.cert.Certificate
    public synchronized int hashCode() {
        if (!this.f5959e) {
            this.f5960f = super.hashCode();
            this.f5959e = true;
        }
        return this.f5960f;
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strM4158a = C1560k.m4158a();
        stringBuffer.append("  [0]         Version: ").append(getVersion()).append(strM4158a);
        stringBuffer.append("         SerialNumber: ").append(getSerialNumber()).append(strM4158a);
        stringBuffer.append("             IssuerDN: ").append(getIssuerDN()).append(strM4158a);
        stringBuffer.append("           Start Date: ").append(getNotBefore()).append(strM4158a);
        stringBuffer.append("           Final Date: ").append(getNotAfter()).append(strM4158a);
        stringBuffer.append("            SubjectDN: ").append(getSubjectDN()).append(strM4158a);
        stringBuffer.append("           Public Key: ").append(getPublicKey()).append(strM4158a);
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
        C0773n c0773nM1858d = this.f5956b.m1794a().m1858d();
        if (c0773nM1858d != null) {
            Enumeration enumerationM1829a = c0773nM1858d.m1829a();
            if (enumerationM1829a.hasMoreElements()) {
                stringBuffer.append("       Extensions: \n");
            }
            while (enumerationM1829a.hasMoreElements()) {
                C0653p c0653p = (C0653p) enumerationM1829a.nextElement();
                C0772m c0772mM1830a = c0773nM1858d.m1830a(c0653p);
                if (c0772mM1830a.m1826c() != null) {
                    C0638l c0638l = new C0638l(c0772mM1830a.m1826c().mo1410c());
                    stringBuffer.append("                       critical(").append(c0772mM1830a.m1825b()).append(") ");
                    try {
                        if (c0653p.equals(C0772m.f3179g)) {
                            stringBuffer.append(C0762c.m1787a(c0638l.m1560b())).append(strM4158a);
                        } else if (c0653p.equals(C0772m.f3175c)) {
                            stringBuffer.append(C0777r.m1841a(c0638l.m1560b())).append(strM4158a);
                        } else if (c0653p.equals(InterfaceC0645c.f2421b)) {
                            stringBuffer.append(new C0646d((C0558au) c0638l.m1560b())).append(strM4158a);
                        } else if (c0653p.equals(InterfaceC0645c.f2423d)) {
                            stringBuffer.append(new C0647e((C0578bb) c0638l.m1560b())).append(strM4158a);
                        } else if (c0653p.equals(InterfaceC0645c.f2430k)) {
                            stringBuffer.append(new C0649g((C0578bb) c0638l.m1560b())).append(strM4158a);
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
        return stringBuffer.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        Signature signature;
        String strM4364a = X509SignatureUtil.m4364a(this.f5956b.m1802j());
        try {
            signature = this.f5955a.mo4525f(strM4364a);
        } catch (Exception e) {
            signature = Signature.getInstance(strM4364a);
        }
        m4360a(publicKey, signature);
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        String strM4364a = X509SignatureUtil.m4364a(this.f5956b.m1802j());
        m4360a(publicKey, str != null ? Signature.getInstance(strM4364a, str) : Signature.getInstance(strM4364a));
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        String strM4364a = X509SignatureUtil.m4364a(this.f5956b.m1802j());
        m4360a(publicKey, provider != null ? Signature.getInstance(strM4364a, provider) : Signature.getInstance(strM4364a));
    }

    /* JADX INFO: renamed from: a */
    private static Collection m4359a(byte[] bArr) throws CertificateParsingException {
        if (bArr == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration enumerationMo1483c = AbstractC0723v.m1708a(bArr).mo1483c();
            while (enumerationMo1483c.hasMoreElements()) {
                C0774o c0774oM1831a = C0774o.m1831a(enumerationMo1483c.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(c0774oM1831a.m1832a()));
                switch (c0774oM1831a.m1832a()) {
                    case 0:
                    case 3:
                    case 5:
                        arrayList2.add(c0774oM1831a.mo1578k());
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    case 1:
                    case 2:
                    case 6:
                        arrayList2.add(((InterfaceC0502aa) c0774oM1831a.m1833b()).mo1350b());
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    case 4:
                        arrayList2.add(C0756c.m1776a(C0754d.f3075R, c0774oM1831a.m1833b()).toString());
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    case 7:
                        try {
                            arrayList2.add(InetAddress.getByAddress(C0581be.m1596a(c0774oM1831a.m1833b()).mo1410c()).getHostAddress());
                            arrayList.add(Collections.unmodifiableList(arrayList2));
                        } catch (UnknownHostException e) {
                        }
                        break;
                    case 8:
                        arrayList2.add(C0653p.m1584a(c0774oM1831a.m1833b()).m1593b());
                        arrayList.add(Collections.unmodifiableList(arrayList2));
                        break;
                    default:
                        throw new IOException("Bad tag number: " + c0774oM1831a.m1832a());
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
