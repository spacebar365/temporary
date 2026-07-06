package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.bk;
import org.bouncycastle.a.f;
import org.bouncycastle.a.g;
import org.bouncycastle.a.l;
import org.bouncycastle.a.m;
import org.bouncycastle.a.s.n;
import org.bouncycastle.a.s.w;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;
import org.bouncycastle.f.b.a.c;
import org.bouncycastle.f.b.a.e;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* JADX INFO: loaded from: classes.dex */
public class PKIXCertPath extends CertPath {
    static final List a;
    private final JcaJceHelper b;
    private List c;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        arrayList.add("PKCS7");
        a = Collections.unmodifiableList(arrayList);
    }

    PKIXCertPath(InputStream inputStream, String str) throws CertificateException {
        super("X.509");
        this.b = new BCJcaJceHelper();
        try {
            if (str.equalsIgnoreCase("PkiPath")) {
                u uVarB = new l(inputStream).b();
                if (!(uVarB instanceof v)) {
                    throw new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
                }
                Enumeration enumerationC = ((v) uVarB).c();
                this.c = new ArrayList();
                java.security.cert.CertificateFactory certificateFactoryG = this.b.g("X.509");
                while (enumerationC.hasMoreElements()) {
                    this.c.add(0, certificateFactoryG.generateCertificate(new ByteArrayInputStream(((f) enumerationC.nextElement()).i().a("DER"))));
                }
            } else {
                if (!str.equalsIgnoreCase("PKCS7") && !str.equalsIgnoreCase("PEM")) {
                    throw new CertificateException("unsupported encoding: ".concat(String.valueOf(str)));
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.c = new ArrayList();
                java.security.cert.CertificateFactory certificateFactoryG2 = this.b.g("X.509");
                while (true) {
                    Certificate certificateGenerateCertificate = certificateFactoryG2.generateCertificate(bufferedInputStream);
                    if (certificateGenerateCertificate == null) {
                        break;
                    } else {
                        this.c.add(certificateGenerateCertificate);
                    }
                }
            }
            this.c = a(this.c);
        } catch (IOException e) {
            throw new CertificateException("IOException throw while decoding CertPath:\n" + e.toString());
        } catch (NoSuchProviderException e2) {
            throw new CertificateException("BouncyCastle provider not found while trying to get a CertificateFactory:\n" + e2.toString());
        }
    }

    PKIXCertPath(List list) {
        super("X.509");
        this.b = new BCJcaJceHelper();
        this.c = a(new ArrayList(list));
    }

    private static List a(List list) {
        boolean z;
        boolean z2;
        if (list.size() < 2) {
            return list;
        }
        int i = 1;
        X500Principal issuerX500Principal = ((X509Certificate) list.get(0)).getIssuerX500Principal();
        while (true) {
            if (i == list.size()) {
                z = true;
                break;
            }
            if (!issuerX500Principal.equals(((X509Certificate) list.get(i)).getSubjectX500Principal())) {
                z = false;
                break;
            }
            issuerX500Principal = ((X509Certificate) list.get(i)).getIssuerX500Principal();
            i++;
        }
        if (z) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list);
        for (int i2 = 0; i2 < list.size(); i2++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i2);
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            int i3 = 0;
            while (true) {
                if (i3 == list.size()) {
                    z2 = false;
                    break;
                }
                if (((X509Certificate) list.get(i3)).getIssuerX500Principal().equals(subjectX500Principal)) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            if (!z2) {
                arrayList.add(x509Certificate);
                list.remove(i2);
            }
        }
        if (arrayList.size() > 1) {
            return arrayList2;
        }
        for (int i4 = 0; i4 != arrayList.size(); i4++) {
            X500Principal issuerX500Principal2 = ((X509Certificate) arrayList.get(i4)).getIssuerX500Principal();
            int i5 = 0;
            while (true) {
                if (i5 < list.size()) {
                    X509Certificate x509Certificate2 = (X509Certificate) list.get(i5);
                    if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                        arrayList.add(x509Certificate2);
                        list.remove(i5);
                        break;
                    }
                    i5++;
                }
            }
        }
        return list.size() > 0 ? arrayList2 : arrayList;
    }

    private static u a(X509Certificate x509Certificate) throws CertificateEncodingException {
        try {
            return new l(x509Certificate.getEncoded()).b();
        } catch (Exception e) {
            throw new CertificateEncodingException("Exception while encoding certificate: " + e.toString());
        }
    }

    private static byte[] a(f fVar) throws CertificateEncodingException {
        try {
            return fVar.i().a("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException("Exception thrown: ".concat(String.valueOf(e)));
        }
    }

    @Override // java.security.cert.CertPath
    public List getCertificates() {
        return Collections.unmodifiableList(new ArrayList(this.c));
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded() {
        Iterator encodings = getEncodings();
        if (encodings.hasNext()) {
            Object next = encodings.next();
            if (next instanceof String) {
                return getEncoded((String) next);
            }
        }
        return null;
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded(String str) throws CertificateEncodingException {
        int i = 0;
        if (str.equalsIgnoreCase("PkiPath")) {
            g gVar = new g();
            ListIterator listIterator = this.c.listIterator(this.c.size());
            while (listIterator.hasPrevious()) {
                gVar.a(a((X509Certificate) listIterator.previous()));
            }
            return a(new bi(gVar));
        }
        if (!str.equalsIgnoreCase("PKCS7")) {
            if (!str.equalsIgnoreCase("PEM")) {
                throw new CertificateEncodingException("unsupported encoding: ".concat(String.valueOf(str)));
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            e eVar = new e(new OutputStreamWriter(byteArrayOutputStream));
            for (int i2 = 0; i2 != this.c.size(); i2++) {
                try {
                    eVar.a(new c("CERTIFICATE", ((X509Certificate) this.c.get(i2)).getEncoded()));
                } catch (Exception e) {
                    throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
                }
            }
            eVar.close();
            return byteArrayOutputStream.toByteArray();
        }
        org.bouncycastle.a.s.c cVar = new org.bouncycastle.a.s.c(n.Q, null);
        g gVar2 = new g();
        while (true) {
            int i3 = i;
            if (i3 == this.c.size()) {
                return a(new org.bouncycastle.a.s.c(n.R, new w(new m(1L), new bk(), cVar, new bk(gVar2), new bk())));
            }
            gVar2.a(a((X509Certificate) this.c.get(i3)));
            i = i3 + 1;
        }
    }

    @Override // java.security.cert.CertPath
    public Iterator getEncodings() {
        return a.iterator();
    }
}
