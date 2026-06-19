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
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.AbstractC0747x;
import org.bouncycastle.p054a.C0638l;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p074s.C0683w;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p082z.C0766g;
import org.bouncycastle.p054a.p082z.C0767h;
import org.bouncycastle.p142f.p144b.C1545a;

/* JADX INFO: loaded from: classes.dex */
public class CertificateFactory extends CertificateFactorySpi {

    /* JADX INFO: renamed from: b */
    private static final PEMUtil f5922b = new PEMUtil("CERTIFICATE");

    /* JADX INFO: renamed from: c */
    private static final PEMUtil f5923c = new PEMUtil("CRL");

    /* JADX INFO: renamed from: d */
    private static final PEMUtil f5924d = new PEMUtil("PKCS7");

    /* JADX INFO: renamed from: a */
    private final JcaJceHelper f5925a = new BCJcaJceHelper();

    /* JADX INFO: renamed from: e */
    private AbstractC0747x f5926e = null;

    /* JADX INFO: renamed from: f */
    private int f5927f = 0;

    /* JADX INFO: renamed from: g */
    private InputStream f5928g = null;

    /* JADX INFO: renamed from: h */
    private AbstractC0747x f5929h = null;

    /* JADX INFO: renamed from: i */
    private int f5930i = 0;

    /* JADX INFO: renamed from: j */
    private InputStream f5931j = null;

    private class ExCertificateException extends CertificateException {

        /* JADX INFO: renamed from: b */
        private Throwable f5933b;

        public ExCertificateException(String str, Throwable th) {
            super(str);
            this.f5933b = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f5933b;
        }
    }

    /* JADX INFO: renamed from: a */
    private CRL m4343a(C0767h c0767h) {
        return new X509CRLObject(this.f5925a, c0767h);
    }

    /* JADX INFO: renamed from: a */
    private Certificate m4344a() {
        if (this.f5926e != null) {
            while (this.f5927f < this.f5926e.m1748c()) {
                AbstractC0747x abstractC0747x = this.f5926e;
                int i = this.f5927f;
                this.f5927f = i + 1;
                InterfaceC0618f interfaceC0618fM1746a = abstractC0747x.m1746a(i);
                if (interfaceC0618fM1746a instanceof AbstractC0723v) {
                    return new X509CertificateObject(this.f5925a, C0766g.m1793a(interfaceC0618fM1746a));
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private Certificate m4345a(AbstractC0723v abstractC0723v) {
        if (abstractC0723v == null) {
            return null;
        }
        if (abstractC0723v.mo1484d() <= 1 || !(abstractC0723v.mo1482a(0) instanceof C0653p) || !abstractC0723v.mo1482a(0).equals(InterfaceC0674n.f2629R)) {
            return new X509CertificateObject(this.f5925a, C0766g.m1793a(abstractC0723v));
        }
        this.f5926e = C0683w.m1689a(AbstractC0723v.m1709a((AbstractC0539ab) abstractC0723v.mo1482a(1), true)).m1690a();
        return m4344a();
    }

    /* JADX INFO: renamed from: b */
    private CRL m4346b() {
        if (this.f5929h == null || this.f5930i >= this.f5929h.m1748c()) {
            return null;
        }
        AbstractC0747x abstractC0747x = this.f5929h;
        int i = this.f5930i;
        this.f5930i = i + 1;
        return m4343a(C0767h.m1804a(abstractC0747x.m1746a(i)));
    }

    /* JADX INFO: renamed from: b */
    private CRL m4347b(AbstractC0723v abstractC0723v) {
        if (abstractC0723v == null) {
            return null;
        }
        if (abstractC0723v.mo1484d() <= 1 || !(abstractC0723v.mo1482a(0) instanceof C0653p) || !abstractC0723v.mo1482a(0).equals(InterfaceC0674n.f2629R)) {
            return m4343a(C0767h.m1804a(abstractC0723v));
        }
        this.f5929h = C0683w.m1689a(AbstractC0723v.m1709a((AbstractC0539ab) abstractC0723v.mo1482a(1), true)).m1691b();
        return m4346b();
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
    public Collection engineGenerateCertificates(InputStream inputStream) throws ExCertificateException {
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
        return PKIXCertPath.f5941a.iterator();
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Certificate engineGenerateCertificate(InputStream inputStream) throws ExCertificateException {
        if (this.f5928g == null || this.f5928g != inputStream) {
            this.f5928g = inputStream;
            this.f5926e = null;
            this.f5927f = 0;
        }
        try {
            if (this.f5926e != null) {
                if (this.f5927f != this.f5926e.m1748c()) {
                    return m4344a();
                }
                this.f5926e = null;
                this.f5927f = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(C1545a.m4124a(inputStream));
            }
            inputStream.mark(1);
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            inputStream.reset();
            return i != 48 ? m4345a(f5922b.m4349a(inputStream)) : m4345a(AbstractC0723v.m1708a((Object) new C0638l(inputStream).m1560b()));
        } catch (Exception e) {
            throw new ExCertificateException("parsing issue: " + e.getMessage(), e);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CRL engineGenerateCRL(InputStream inputStream) throws CRLException {
        if (this.f5931j == null || this.f5931j != inputStream) {
            this.f5931j = inputStream;
            this.f5929h = null;
            this.f5930i = 0;
        }
        try {
            if (this.f5929h != null) {
                if (this.f5930i != this.f5929h.m1748c()) {
                    return m4346b();
                }
                this.f5929h = null;
                this.f5930i = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(C1545a.m4124a(inputStream));
            }
            inputStream.mark(1);
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            inputStream.reset();
            return i != 48 ? m4347b(f5923c.m4349a(inputStream)) : m4347b(AbstractC0723v.m1708a((Object) new C0638l(inputStream, (byte) 0).m1560b()));
        } catch (CRLException e) {
            throw e;
        } catch (Exception e2) {
            throw new CRLException(e2.toString());
        }
    }
}
