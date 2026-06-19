package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.p054a.C0627h;
import org.bouncycastle.p054a.C0638l;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p079x.C0748a;
import org.bouncycastle.p054a.p080y.C0756c;
import org.bouncycastle.p054a.p082z.C0765f;
import org.bouncycastle.p054a.p082z.C0772m;
import org.bouncycastle.p054a.p082z.C0773n;
import org.bouncycastle.p054a.p082z.C0774o;
import org.bouncycastle.p054a.p082z.C0775p;
import org.bouncycastle.p054a.p082z.C0781v;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: loaded from: classes.dex */
class X509CRLEntryObject extends X509CRLEntry {

    /* JADX INFO: renamed from: a */
    private C0781v.a f5944a;

    /* JADX INFO: renamed from: b */
    private C0756c f5945b;

    /* JADX INFO: renamed from: c */
    private int f5946c;

    /* JADX INFO: renamed from: d */
    private boolean f5947d;

    protected X509CRLEntryObject(C0781v.a aVar, boolean z, C0756c c0756c) {
        this.f5944a = aVar;
        this.f5945b = m4354a(z, c0756c);
    }

    /* JADX INFO: renamed from: a */
    private Set m4353a(boolean z) {
        C0773n c0773nM1852c = this.f5944a.m1852c();
        if (c0773nM1852c == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumerationM1829a = c0773nM1852c.m1829a();
        while (enumerationM1829a.hasMoreElements()) {
            C0653p c0653p = (C0653p) enumerationM1829a.nextElement();
            if (z == c0773nM1852c.m1830a(c0653p).m1825b()) {
                hashSet.add(c0653p.m1593b());
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    private C0756c m4354a(boolean z, C0756c c0756c) {
        if (!z) {
            return null;
        }
        C0772m c0772mM4355a = m4355a(C0772m.f3186n);
        if (c0772mM4355a == null) {
            return c0756c;
        }
        try {
            C0774o[] c0774oArrM1836a = C0775p.m1834a(c0772mM4355a.m1827d()).m1836a();
            for (int i = 0; i < c0774oArrM1836a.length; i++) {
                if (c0774oArrM1836a[i].m1832a() == 4) {
                    return C0756c.m1774a(c0774oArrM1836a[i].m1833b());
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private C0772m m4355a(C0653p c0653p) {
        C0773n c0773nM1852c = this.f5944a.m1852c();
        if (c0773nM1852c != null) {
            return c0773nM1852c.m1830a(c0653p);
        }
        return null;
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof X509CRLEntryObject ? this.f5944a.equals(((X509CRLEntryObject) obj).f5944a) : super.equals(this);
    }

    @Override // java.security.cert.X509CRLEntry
    public X500Principal getCertificateIssuer() {
        if (this.f5945b == null) {
            return null;
        }
        try {
            return new X500Principal(this.f5945b.mo1578k());
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return m4353a(true);
    }

    @Override // java.security.cert.X509CRLEntry
    public byte[] getEncoded() throws CRLException {
        try {
            return this.f5944a.m1577a("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        C0772m c0772mM4355a = m4355a(new C0653p(str));
        if (c0772mM4355a == null) {
            return null;
        }
        try {
            return c0772mM4355a.m1826c().mo1578k();
        } catch (Exception e) {
            throw new IllegalStateException("Exception encoding: " + e.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return m4353a(false);
    }

    @Override // java.security.cert.X509CRLEntry
    public Date getRevocationDate() {
        return this.f5944a.m1851b().m1861b();
    }

    @Override // java.security.cert.X509CRLEntry
    public BigInteger getSerialNumber() {
        return this.f5944a.m1850a().m1564b();
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean hasExtensions() {
        return this.f5944a.m1852c() != null;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return (criticalExtensionOIDs == null || criticalExtensionOIDs.isEmpty()) ? false : true;
    }

    @Override // java.security.cert.X509CRLEntry
    public int hashCode() {
        if (!this.f5947d) {
            this.f5946c = super.hashCode();
            this.f5947d = true;
        }
        return this.f5946c;
    }

    @Override // java.security.cert.X509CRLEntry
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strM4158a = C1560k.m4158a();
        stringBuffer.append("      userCertificate: ").append(getSerialNumber()).append(strM4158a);
        stringBuffer.append("       revocationDate: ").append(getRevocationDate()).append(strM4158a);
        stringBuffer.append("       certificateIssuer: ").append(getCertificateIssuer()).append(strM4158a);
        C0773n c0773nM1852c = this.f5944a.m1852c();
        if (c0773nM1852c != null) {
            Enumeration enumerationM1829a = c0773nM1852c.m1829a();
            if (enumerationM1829a.hasMoreElements()) {
                stringBuffer.append("   crlEntryExtensions:").append(strM4158a);
                while (enumerationM1829a.hasMoreElements()) {
                    C0653p c0653p = (C0653p) enumerationM1829a.nextElement();
                    C0772m c0772mM1830a = c0773nM1852c.m1830a(c0653p);
                    if (c0772mM1830a.m1826c() != null) {
                        C0638l c0638l = new C0638l(c0772mM1830a.m1826c().mo1410c());
                        stringBuffer.append("                       critical(").append(c0772mM1830a.m1825b()).append(") ");
                        try {
                            if (c0653p.equals(C0772m.f3181i)) {
                                stringBuffer.append(C0765f.m1792a(C0627h.m1522a((Object) c0638l.m1560b()))).append(strM4158a);
                            } else if (c0653p.equals(C0772m.f3186n)) {
                                stringBuffer.append("Certificate issuer: ").append(C0775p.m1834a(c0638l.m1560b())).append(strM4158a);
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
        }
        return stringBuffer.toString();
    }
}
