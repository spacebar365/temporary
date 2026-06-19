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
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0587bk;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0638l;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p074s.C0663c;
import org.bouncycastle.p054a.p074s.C0683w;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p142f.p144b.p145a.C1548c;
import org.bouncycastle.p142f.p144b.p145a.C1550e;

/* JADX INFO: loaded from: classes.dex */
public class PKIXCertPath extends CertPath {

    /* JADX INFO: renamed from: a */
    static final List f5941a;

    /* JADX INFO: renamed from: b */
    private final JcaJceHelper f5942b;

    /* JADX INFO: renamed from: c */
    private List f5943c;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        arrayList.add("PKCS7");
        f5941a = Collections.unmodifiableList(arrayList);
    }

    PKIXCertPath(InputStream inputStream, String str) throws CertificateException {
        super("X.509");
        this.f5942b = new BCJcaJceHelper();
        try {
            if (str.equalsIgnoreCase("PkiPath")) {
                AbstractC0686u abstractC0686uM1560b = new C0638l(inputStream).m1560b();
                if (!(abstractC0686uM1560b instanceof AbstractC0723v)) {
                    throw new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
                }
                Enumeration enumerationMo1483c = ((AbstractC0723v) abstractC0686uM1560b).mo1483c();
                this.f5943c = new ArrayList();
                java.security.cert.CertificateFactory certificateFactoryMo4526g = this.f5942b.mo4526g("X.509");
                while (enumerationMo1483c.hasMoreElements()) {
                    this.f5943c.add(0, certificateFactoryMo4526g.generateCertificate(new ByteArrayInputStream(((InterfaceC0618f) enumerationMo1483c.nextElement()).mo1358i().m1577a("DER"))));
                }
            } else {
                if (!str.equalsIgnoreCase("PKCS7") && !str.equalsIgnoreCase("PEM")) {
                    throw new CertificateException("unsupported encoding: ".concat(String.valueOf(str)));
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.f5943c = new ArrayList();
                java.security.cert.CertificateFactory certificateFactoryMo4526g2 = this.f5942b.mo4526g("X.509");
                while (true) {
                    Certificate certificateGenerateCertificate = certificateFactoryMo4526g2.generateCertificate(bufferedInputStream);
                    if (certificateGenerateCertificate == null) {
                        break;
                    } else {
                        this.f5943c.add(certificateGenerateCertificate);
                    }
                }
            }
            this.f5943c = m4350a(this.f5943c);
        } catch (IOException e) {
            throw new CertificateException("IOException throw while decoding CertPath:\n" + e.toString());
        } catch (NoSuchProviderException e2) {
            throw new CertificateException("BouncyCastle provider not found while trying to get a CertificateFactory:\n" + e2.toString());
        }
    }

    PKIXCertPath(List list) {
        super("X.509");
        this.f5942b = new BCJcaJceHelper();
        this.f5943c = m4350a(new ArrayList(list));
    }

    /* JADX INFO: renamed from: a */
    private static List m4350a(List list) {
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

    /* JADX INFO: renamed from: a */
    private static AbstractC0686u m4351a(X509Certificate x509Certificate) throws CertificateEncodingException {
        try {
            return new C0638l(x509Certificate.getEncoded()).m1560b();
        } catch (Exception e) {
            throw new CertificateEncodingException("Exception while encoding certificate: " + e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m4352a(InterfaceC0618f interfaceC0618f) throws CertificateEncodingException {
        try {
            return interfaceC0618f.mo1358i().m1577a("DER");
        } catch (IOException e) {
            throw new CertificateEncodingException("Exception thrown: ".concat(String.valueOf(e)));
        }
    }

    @Override // java.security.cert.CertPath
    public List getCertificates() {
        return Collections.unmodifiableList(new ArrayList(this.f5943c));
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
            C0625g c0625g = new C0625g();
            ListIterator listIterator = this.f5943c.listIterator(this.f5943c.size());
            while (listIterator.hasPrevious()) {
                c0625g.m1521a(m4351a((X509Certificate) listIterator.previous()));
            }
            return m4352a(new C0585bi(c0625g));
        }
        if (!str.equalsIgnoreCase("PKCS7")) {
            if (!str.equalsIgnoreCase("PEM")) {
                throw new CertificateEncodingException("unsupported encoding: ".concat(String.valueOf(str)));
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C1550e c1550e = new C1550e(new OutputStreamWriter(byteArrayOutputStream));
            for (int i2 = 0; i2 != this.f5943c.size(); i2++) {
                try {
                    c1550e.m4134a(new C1548c("CERTIFICATE", ((X509Certificate) this.f5943c.get(i2)).getEncoded()));
                } catch (Exception e) {
                    throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
                }
            }
            c1550e.close();
            return byteArrayOutputStream.toByteArray();
        }
        C0663c c0663c = new C0663c(InterfaceC0674n.f2628Q, null);
        C0625g c0625g2 = new C0625g();
        while (true) {
            int i3 = i;
            if (i3 == this.f5943c.size()) {
                return m4352a(new C0663c(InterfaceC0674n.f2629R, new C0683w(new C0640m(1L), new C0587bk(), c0663c, new C0587bk(c0625g2), new C0587bk())));
            }
            c0625g2.m1521a(m4351a((X509Certificate) this.f5943c.get(i3)));
            i = i3 + 1;
        }
    }

    @Override // java.security.cert.CertPath
    public Iterator getEncodings() {
        return f5941a.iterator();
    }
}
