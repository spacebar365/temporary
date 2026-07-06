package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.a.ab;
import org.bouncycastle.a.f;
import org.bouncycastle.a.l;
import org.bouncycastle.a.p;
import org.bouncycastle.a.s.n;
import org.bouncycastle.a.s.w;
import org.bouncycastle.a.v;
import org.bouncycastle.a.x;
import org.bouncycastle.a.z.g;
import org.bouncycastle.a.z.h;
import org.bouncycastle.f.b.a;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* JADX INFO: loaded from: classes.dex */
public class CertificateFactory extends CertificateFactorySpi {
    private static final PEMUtil b = new PEMUtil("CERTIFICATE");
    private static final PEMUtil c = new PEMUtil("CRL");
    private static final PEMUtil d = new PEMUtil("PKCS7");
    private final JcaJceHelper a = new BCJcaJceHelper();
    private x e = null;
    private int f = 0;
    private InputStream g = null;
    private x h = null;
    private int i = 0;
    private InputStream j = null;

    private CRL a(h hVar) {
        return new X509CRLObject(this.a, hVar);
    }

    private Certificate a() {
        if (this.e != null) {
            while (this.f < this.e.c()) {
                x xVar = this.e;
                int i = this.f;
                this.f = i + 1;
                f fVarA = xVar.a(i);
                if (fVarA instanceof v) {
                    return new X509CertificateObject(this.a, g.a(fVarA));
                }
            }
        }
        return null;
    }

    private Certificate a(v vVar) {
        if (vVar == null) {
            return null;
        }
        if (vVar.d() <= 1 || !(vVar.a(0) instanceof p) || !vVar.a(0).equals(n.R)) {
            return new X509CertificateObject(this.a, g.a(vVar));
        }
        this.e = w.a(v.a((ab) vVar.a(1), true)).a();
        return a();
    }

    private CRL b() {
        if (this.h == null || this.i >= this.h.c()) {
            return null;
        }
        x xVar = this.h;
        int i = this.i;
        this.i = i + 1;
        return a(h.a(xVar.a(i)));
    }

    private CRL b(v vVar) {
        if (vVar == null) {
            return null;
        }
        if (vVar.d() <= 1 || !(vVar.a(0) instanceof p) || !vVar.a(0).equals(n.R)) {
            return a(h.a(vVar));
        }
        this.h = w.a(v.a((ab) vVar.a(1), true)).b();
        return b();
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection engineGenerateCRLs(InputStream inputStream) throws CRLException {
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            CRL crlEngineGenerateCRL = engineGenerateCRL(bufferedInputStream);
            if (crlEngineGenerateCRL == null) {
                return arrayList;
            }
            arrayList.add(crlEngineGenerateCRL);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream) {
        return engineGenerateCertPath(inputStream, "PkiPath");
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream, String str) {
        return new PKIXCertPath(inputStream, str);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(List list) throws CertificateException {
        for (Object obj : list) {
            if (obj != null && !(obj instanceof X509Certificate)) {
                throw new CertificateException("list contains non X509Certificate object while creating CertPath\n" + obj.toString());
            }
        }
        return new PKIXCertPath(list);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection engineGenerateCertificates(InputStream inputStream) throws CertificateFactory$ExCertificateException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ArrayList arrayList = new ArrayList();
        while (true) {
            Certificate certificateEngineGenerateCertificate = engineGenerateCertificate(bufferedInputStream);
            if (certificateEngineGenerateCertificate == null) {
                return arrayList;
            }
            arrayList.add(certificateEngineGenerateCertificate);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Iterator engineGetCertPathEncodings() {
        return PKIXCertPath.a.iterator();
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Certificate engineGenerateCertificate(InputStream inputStream) throws CertificateFactory$ExCertificateException {
        if (this.g == null || this.g != inputStream) {
            this.g = inputStream;
            this.e = null;
            this.f = 0;
        }
        try {
            if (this.e != null) {
                if (this.f != this.e.c()) {
                    return a();
                }
                this.e = null;
                this.f = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(a.a(inputStream));
            }
            inputStream.mark(1);
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            inputStream.reset();
            return i != 48 ? a(b.a(inputStream)) : a(v.a((Object) new l(inputStream).b()));
        } catch (Exception e) {
            throw new CertificateFactory$ExCertificateException(this, "parsing issue: " + e.getMessage(), e);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CRL engineGenerateCRL(InputStream inputStream) throws CRLException {
        if (this.j == null || this.j != inputStream) {
            this.j = inputStream;
            this.h = null;
            this.i = 0;
        }
        try {
            if (this.h != null) {
                if (this.i != this.h.c()) {
                    return b();
                }
                this.h = null;
                this.i = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(a.a(inputStream));
            }
            inputStream.mark(1);
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            inputStream.reset();
            return i != 48 ? b(c.a(inputStream)) : b(v.a((Object) new l(inputStream, (byte) 0).b()));
        } catch (CRLException e) {
            throw e;
        } catch (Exception e2) {
            throw new CRLException(e2.toString());
        }
    }
}
