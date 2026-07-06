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
import org.bouncycastle.a.h;
import org.bouncycastle.a.l;
import org.bouncycastle.a.p;
import org.bouncycastle.a.x.a;
import org.bouncycastle.a.y.c;
import org.bouncycastle.a.z.f;
import org.bouncycastle.a.z.m;
import org.bouncycastle.a.z.n;
import org.bouncycastle.a.z.o;
import org.bouncycastle.a.z.v$a;
import org.bouncycastle.f.k;

/* JADX INFO: loaded from: classes.dex */
class X509CRLEntryObject extends X509CRLEntry {
    private v$a a;
    private c b;
    private int c;
    private boolean d;

    protected X509CRLEntryObject(v$a v_a, boolean z, c cVar) {
        this.a = v_a;
        this.b = a(z, cVar);
    }

    private Set a(boolean z) {
        n nVarC = this.a.c();
        if (nVarC == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumerationA = nVarC.a();
        while (enumerationA.hasMoreElements()) {
            p pVar = (p) enumerationA.nextElement();
            if (z == nVarC.a(pVar).b()) {
                hashSet.add(pVar.b());
            }
        }
        return hashSet;
    }

    private c a(boolean z, c cVar) {
        if (!z) {
            return null;
        }
        m mVarA = a(m.n);
        if (mVarA == null) {
            return cVar;
        }
        try {
            o[] oVarArrA = org.bouncycastle.a.z.p.a(mVarA.d()).a();
            for (int i = 0; i < oVarArrA.length; i++) {
                if (oVarArrA[i].a() == 4) {
                    return c.a(oVarArrA[i].b());
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    private m a(p pVar) {
        n nVarC = this.a.c();
        if (nVarC != null) {
            return nVarC.a(pVar);
        }
        return null;
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof X509CRLEntryObject ? this.a.equals(((X509CRLEntryObject) obj).a) : super.equals(this);
    }

    @Override // java.security.cert.X509CRLEntry
    public X500Principal getCertificateIssuer() {
        if (this.b == null) {
            return null;
        }
        try {
            return new X500Principal(this.b.k());
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return a(true);
    }

    @Override // java.security.cert.X509CRLEntry
    public byte[] getEncoded() throws CRLException {
        try {
            return this.a.a("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        m mVarA = a(new p(str));
        if (mVarA == null) {
            return null;
        }
        try {
            return mVarA.c().k();
        } catch (Exception e) {
            throw new IllegalStateException("Exception encoding: " + e.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return a(false);
    }

    @Override // java.security.cert.X509CRLEntry
    public Date getRevocationDate() {
        return this.a.b().b();
    }

    @Override // java.security.cert.X509CRLEntry
    public BigInteger getSerialNumber() {
        return this.a.a().b();
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean hasExtensions() {
        return this.a.c() != null;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return (criticalExtensionOIDs == null || criticalExtensionOIDs.isEmpty()) ? false : true;
    }

    @Override // java.security.cert.X509CRLEntry
    public int hashCode() {
        if (!this.d) {
            this.c = super.hashCode();
            this.d = true;
        }
        return this.c;
    }

    @Override // java.security.cert.X509CRLEntry
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strA = k.a();
        stringBuffer.append("      userCertificate: ").append(getSerialNumber()).append(strA);
        stringBuffer.append("       revocationDate: ").append(getRevocationDate()).append(strA);
        stringBuffer.append("       certificateIssuer: ").append(getCertificateIssuer()).append(strA);
        n nVarC = this.a.c();
        if (nVarC != null) {
            Enumeration enumerationA = nVarC.a();
            if (enumerationA.hasMoreElements()) {
                stringBuffer.append("   crlEntryExtensions:").append(strA);
                while (enumerationA.hasMoreElements()) {
                    p pVar = (p) enumerationA.nextElement();
                    m mVarA = nVarC.a(pVar);
                    if (mVarA.c() != null) {
                        l lVar = new l(mVarA.c().c());
                        stringBuffer.append("                       critical(").append(mVarA.b()).append(") ");
                        try {
                            if (pVar.equals(m.i)) {
                                stringBuffer.append(f.a(h.a((Object) lVar.b()))).append(strA);
                            } else if (pVar.equals(m.n)) {
                                stringBuffer.append("Certificate issuer: ").append(org.bouncycastle.a.z.p.a(lVar.b())).append(strA);
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
        }
        return stringBuffer.toString();
    }
}
