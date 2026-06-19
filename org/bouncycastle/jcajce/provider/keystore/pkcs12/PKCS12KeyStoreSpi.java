package org.bouncycastle.jcajce.provider.keystore.pkcs12;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.PKCS12StoreParameter;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.jcajce.spec.PBKDF2KeySpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.AbstractC0747x;
import org.bouncycastle.p054a.C0545ah;
import org.bouncycastle.p054a.C0548ak;
import org.bouncycastle.p054a.C0557at;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0583bg;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0587bk;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0638l;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p061f.C0621c;
import org.bouncycastle.p054a.p061f.InterfaceC0619a;
import org.bouncycastle.p054a.p070o.InterfaceC0652b;
import org.bouncycastle.p054a.p072q.InterfaceC0656a;
import org.bouncycastle.p054a.p073r.InterfaceC0659b;
import org.bouncycastle.p054a.p074s.C0661a;
import org.bouncycastle.p054a.p074s.C0662b;
import org.bouncycastle.p054a.p074s.C0663c;
import org.bouncycastle.p054a.p074s.C0665e;
import org.bouncycastle.p054a.p074s.C0666f;
import org.bouncycastle.p054a.p074s.C0669i;
import org.bouncycastle.p054a.p074s.C0671k;
import org.bouncycastle.p054a.p074s.C0672l;
import org.bouncycastle.p054a.p074s.C0673m;
import org.bouncycastle.p054a.p074s.C0675o;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p074s.C0682v;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p079x.C0748a;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0769j;
import org.bouncycastle.p054a.p082z.C0779t;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p054a.p082z.InterfaceC0760aa;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.p086b.C0842s;
import org.bouncycastle.p103c.p104a.InterfaceC1198n;
import org.bouncycastle.p103c.p105b.C1200a;
import org.bouncycastle.p103c.p105b.C1203d;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1557h;
import org.bouncycastle.p142f.C1560k;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: loaded from: classes.dex */
public class PKCS12KeyStoreSpi extends KeyStoreSpi implements InterfaceC0674n, InterfaceC0760aa {

    /* JADX INFO: renamed from: bQ */
    private static final DefaultSecretKeyProvider f6045bQ = new DefaultSecretKeyProvider();

    /* JADX INFO: renamed from: bR */
    private IgnoresCaseHashtable f6048bR;

    /* JADX INFO: renamed from: bT */
    private IgnoresCaseHashtable f6050bT;

    /* JADX INFO: renamed from: bW */
    private CertificateFactory f6053bW;

    /* JADX INFO: renamed from: bX */
    private C0653p f6054bX;

    /* JADX INFO: renamed from: bY */
    private C0653p f6055bY;

    /* JADX INFO: renamed from: bP */
    private final JcaJceHelper f6047bP = new BCJcaJceHelper();

    /* JADX INFO: renamed from: bS */
    private Hashtable f6049bS = new Hashtable();

    /* JADX INFO: renamed from: bU */
    private Hashtable f6051bU = new Hashtable();

    /* JADX INFO: renamed from: bV */
    private Hashtable f6052bV = new Hashtable();

    /* JADX INFO: renamed from: bO */
    protected SecureRandom f6046bO = C1124l.m2709a();

    /* JADX INFO: renamed from: bZ */
    private C0759a f6056bZ = new C0759a(InterfaceC0659b.f2575i, C0579bc.f2112a);

    /* JADX INFO: renamed from: ca */
    private int f6057ca = 102400;

    /* JADX INFO: renamed from: cb */
    private int f6058cb = 20;

    public static class BCPKCS12KeyStore extends PKCS12KeyStoreSpi {
        public BCPKCS12KeyStore() {
            super(new BCJcaJceHelper(), f2695bF, f2698bI);
        }
    }

    public static class BCPKCS12KeyStore3DES extends PKCS12KeyStoreSpi {
        public BCPKCS12KeyStore3DES() {
            BCJcaJceHelper bCJcaJceHelper = new BCJcaJceHelper();
            C0653p c0653p = f2695bF;
            super(bCJcaJceHelper, c0653p, c0653p);
        }
    }

    private class CertId {

        /* JADX INFO: renamed from: a */
        byte[] f6059a;

        CertId(PublicKey publicKey) {
            this.f6059a = PKCS12KeyStoreSpi.m4422b(publicKey).m1842a();
        }

        CertId(byte[] bArr) {
            this.f6059a = bArr;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CertId) {
                return C1535a.m4076a(this.f6059a, ((CertId) obj).f6059a);
            }
            return false;
        }

        public int hashCode() {
            return C1535a.m4066a(this.f6059a);
        }
    }

    public static class DefPKCS12KeyStore extends PKCS12KeyStoreSpi {
        public DefPKCS12KeyStore() {
            super(new DefaultJcaJceHelper(), f2695bF, f2698bI);
        }
    }

    public static class DefPKCS12KeyStore3DES extends PKCS12KeyStoreSpi {
        public DefPKCS12KeyStore3DES() {
            DefaultJcaJceHelper defaultJcaJceHelper = new DefaultJcaJceHelper();
            C0653p c0653p = f2695bF;
            super(defaultJcaJceHelper, c0653p, c0653p);
        }
    }

    private static class IgnoresCaseHashtable {

        /* JADX INFO: renamed from: a */
        private Hashtable f6062a;

        /* JADX INFO: renamed from: b */
        private Hashtable f6063b;

        private IgnoresCaseHashtable() {
            this.f6062a = new Hashtable();
            this.f6063b = new Hashtable();
        }

        /* synthetic */ IgnoresCaseHashtable(byte b) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Object m4424a(String str) {
            String str2 = (String) this.f6063b.remove(str == null ? null : C1560k.m4166c(str));
            if (str2 == null) {
                return null;
            }
            return this.f6062a.remove(str2);
        }

        /* JADX INFO: renamed from: a */
        public final Enumeration m4425a() {
            return this.f6062a.keys();
        }

        /* JADX INFO: renamed from: a */
        public final void m4426a(String str, Object obj) {
            String strM4166c = str == null ? null : C1560k.m4166c(str);
            String str2 = (String) this.f6063b.get(strM4166c);
            if (str2 != null) {
                this.f6062a.remove(str2);
            }
            this.f6063b.put(strM4166c, str);
            this.f6062a.put(str, obj);
        }

        /* JADX INFO: renamed from: b */
        public final Object m4427b(String str) {
            String str2 = (String) this.f6063b.get(str == null ? null : C1560k.m4166c(str));
            if (str2 == null) {
                return null;
            }
            return this.f6062a.get(str2);
        }

        /* JADX INFO: renamed from: b */
        public final Enumeration m4428b() {
            return this.f6062a.elements();
        }
    }

    public PKCS12KeyStoreSpi(JcaJceHelper jcaJceHelper, C0653p c0653p, C0653p c0653p2) {
        byte b = 0;
        this.f6048bR = new IgnoresCaseHashtable(b);
        this.f6050bT = new IgnoresCaseHashtable(b);
        this.f6054bX = c0653p;
        this.f6055bY = c0653p2;
        try {
            this.f6053bW = jcaJceHelper.mo4526g("X.509");
        } catch (Exception e) {
            throw new IllegalArgumentException("can't create cert factory - " + e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m4413a(BigInteger bigInteger) {
        int iIntValue = bigInteger.intValue();
        if (iIntValue < 0) {
            throw new IllegalStateException("negative iteration count found");
        }
        BigInteger bigIntegerM4156b = C1557h.m4156b("org.bouncycastle.pkcs12.max_it_count");
        if (bigIntegerM4156b == null || bigIntegerM4156b.intValue() >= iIntValue) {
            return iIntValue;
        }
        throw new IllegalStateException("iteration count " + iIntValue + " greater than " + bigIntegerM4156b.intValue());
    }

    /* JADX INFO: renamed from: a */
    private PrivateKey m4414a(C0759a c0759a, byte[] bArr, char[] cArr, boolean z) throws IOException {
        C0653p c0653pM1783a = c0759a.m1783a();
        try {
            if (!c0653pM1783a.m1592a(InterfaceC0674n.f2692bC)) {
                if (c0653pM1783a.equals(InterfaceC0674n.f2612A)) {
                    return (PrivateKey) m4416a(4, cArr, c0759a).unwrap(bArr, "", 2);
                }
                throw new IOException("exception unwrapping private key - cannot recognise: ".concat(String.valueOf(c0653pM1783a)));
            }
            C0673m c0673mM1650a = C0673m.m1650a(c0759a.m1784b());
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(c0673mM1650a.m1652b(), m4413a(c0673mM1650a.m1651a()));
            Cipher cipherMo4520a = this.f6047bP.mo4520a(c0653pM1783a.m1593b());
            cipherMo4520a.init(4, new PKCS12Key(cArr, z), pBEParameterSpec);
            return (PrivateKey) cipherMo4520a.unwrap(bArr, "", 2);
        } catch (Exception e) {
            throw new IOException("exception unwrapping private key - " + e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private Set m4415a() {
        HashSet hashSet = new HashSet();
        Enumeration enumerationM4425a = this.f6048bR.m4425a();
        while (enumerationM4425a.hasMoreElements()) {
            Certificate[] certificateArrEngineGetCertificateChain = engineGetCertificateChain((String) enumerationM4425a.nextElement());
            for (int i = 0; i != certificateArrEngineGetCertificateChain.length; i++) {
                hashSet.add(certificateArrEngineGetCertificateChain[i]);
            }
        }
        Enumeration enumerationM4425a2 = this.f6050bT.m4425a();
        while (enumerationM4425a2.hasMoreElements()) {
            hashSet.add(engineGetCertificate((String) enumerationM4425a2.nextElement()));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    private Cipher m4416a(int i, char[] cArr, C0759a c0759a) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        C0671k c0671kM1641a = C0671k.m1641a(c0759a.m1784b());
        C0672l c0672lM1644a = C0672l.m1644a(c0671kM1641a.m1642a().m1633b());
        C0759a c0759aM1781a = C0759a.m1781a(c0671kM1641a.m1643b());
        SecretKeyFactory secretKeyFactoryMo4524e = this.f6047bP.mo4524e(c0671kM1641a.m1642a().m1632a().m1593b());
        SecretKey secretKeyGenerateSecret = c0672lM1644a.m1648d() ? secretKeyFactoryMo4524e.generateSecret(new PBEKeySpec(cArr, c0672lM1644a.m1645a(), m4413a(c0672lM1644a.m1646b()), f6045bQ.m4423a(c0759aM1781a))) : secretKeyFactoryMo4524e.generateSecret(new PBKDF2KeySpec(cArr, c0672lM1644a.m1645a(), m4413a(c0672lM1644a.m1646b()), f6045bQ.m4423a(c0759aM1781a), c0672lM1644a.m1649e()));
        Cipher cipher = Cipher.getInstance(c0671kM1641a.m1643b().m1629a().m1593b());
        InterfaceC0618f interfaceC0618fM1630b = c0671kM1641a.m1643b().m1630b();
        if (interfaceC0618fM1630b instanceof AbstractC0655q) {
            cipher.init(i, secretKeyGenerateSecret, new IvParameterSpec(AbstractC0655q.m1596a(interfaceC0618fM1630b).mo1410c()));
        } else {
            C0621c c0621cM1507a = C0621c.m1507a(interfaceC0618fM1630b);
            cipher.init(i, secretKeyGenerateSecret, new GOST28147ParameterSpec(c0621cM1507a.m1508a(), c0621cM1507a.m1509b()));
        }
        return cipher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private void m4418a(OutputStream outputStream, char[] cArr, boolean z) throws IOException {
        boolean z2;
        boolean z3;
        if (cArr == null) {
            throw new NullPointerException("No password supplied for PKCS#12 KeyStore.");
        }
        C0625g c0625g = new C0625g();
        Enumeration enumerationM4425a = this.f6048bR.m4425a();
        while (enumerationM4425a.hasMoreElements()) {
            byte[] bArr = new byte[20];
            this.f6046bO.nextBytes(bArr);
            String str = (String) enumerationM4425a.nextElement();
            PrivateKey privateKey = (PrivateKey) this.f6048bR.m4427b(str);
            C0673m c0673m = new C0673m(bArr, 51200);
            C0666f c0666f = new C0666f(new C0759a(this.f6054bX, c0673m.mo1358i()), m4419a(this.f6054bX.m1593b(), privateKey, c0673m, cArr));
            C0625g c0625g2 = new C0625g();
            if (privateKey instanceof InterfaceC1198n) {
                InterfaceC1198n interfaceC1198n = (InterfaceC1198n) privateKey;
                C0557at c0557at = (C0557at) interfaceC1198n.mo2845a(f2674ak);
                if (c0557at == null || !c0557at.mo1350b().equals(str)) {
                    interfaceC1198n.mo2846a(f2674ak, new C0557at(str));
                }
                if (interfaceC1198n.mo2845a(f2675al) == null) {
                    interfaceC1198n.mo2846a(f2675al, m4422b(engineGetCertificate(str).getPublicKey()));
                }
                Enumeration enumerationMo2847b = interfaceC1198n.mo2847b();
                z3 = false;
                while (enumerationMo2847b.hasMoreElements()) {
                    C0653p c0653p = (C0653p) enumerationMo2847b.nextElement();
                    C0625g c0625g3 = new C0625g();
                    c0625g3.m1521a(c0653p);
                    c0625g3.m1521a(new C0587bk(interfaceC1198n.mo2845a(c0653p)));
                    z3 = true;
                    c0625g2.m1521a(new C0585bi(c0625g3));
                }
            } else {
                z3 = false;
            }
            if (!z3) {
                C0625g c0625g4 = new C0625g();
                Certificate certificateEngineGetCertificate = engineGetCertificate(str);
                c0625g4.m1521a(f2675al);
                c0625g4.m1521a(new C0587bk(m4422b(certificateEngineGetCertificate.getPublicKey())));
                c0625g2.m1521a(new C0585bi(c0625g4));
                C0625g c0625g5 = new C0625g();
                c0625g5.m1521a(f2674ak);
                c0625g5.m1521a(new C0587bk(new C0557at(str)));
                c0625g2.m1521a(new C0585bi(c0625g5));
            }
            c0625g.m1521a(new C0682v(f2727bx, c0666f.mo1358i(), new C0587bk(c0625g2)));
        }
        C0545ah c0545ah = new C0545ah(new C0585bi(c0625g).m1577a("DER"));
        byte[] bArr2 = new byte[20];
        this.f6046bO.nextBytes(bArr2);
        C0625g c0625g6 = new C0625g();
        C0759a c0759a = new C0759a(this.f6055bY, new C0673m(bArr2, 51200).mo1358i());
        Hashtable hashtable = new Hashtable();
        Enumeration enumerationM4425a2 = this.f6048bR.m4425a();
        while (enumerationM4425a2.hasMoreElements()) {
            try {
                String str2 = (String) enumerationM4425a2.nextElement();
                Certificate certificateEngineGetCertificate2 = engineGetCertificate(str2);
                C0662b c0662b = new C0662b(f2678ao, new C0581be(certificateEngineGetCertificate2.getEncoded()));
                C0625g c0625g7 = new C0625g();
                if (certificateEngineGetCertificate2 instanceof InterfaceC1198n) {
                    InterfaceC1198n interfaceC1198n2 = (InterfaceC1198n) certificateEngineGetCertificate2;
                    C0557at c0557at2 = (C0557at) interfaceC1198n2.mo2845a(f2674ak);
                    if (c0557at2 == null || !c0557at2.mo1350b().equals(str2)) {
                        interfaceC1198n2.mo2846a(f2674ak, new C0557at(str2));
                    }
                    if (interfaceC1198n2.mo2845a(f2675al) == null) {
                        interfaceC1198n2.mo2846a(f2675al, m4422b(certificateEngineGetCertificate2.getPublicKey()));
                    }
                    Enumeration enumerationMo2847b2 = interfaceC1198n2.mo2847b();
                    z2 = false;
                    while (enumerationMo2847b2.hasMoreElements()) {
                        C0653p c0653p2 = (C0653p) enumerationMo2847b2.nextElement();
                        C0625g c0625g8 = new C0625g();
                        c0625g8.m1521a(c0653p2);
                        c0625g8.m1521a(new C0587bk(interfaceC1198n2.mo2845a(c0653p2)));
                        c0625g7.m1521a(new C0585bi(c0625g8));
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
                if (!z2) {
                    C0625g c0625g9 = new C0625g();
                    c0625g9.m1521a(f2675al);
                    c0625g9.m1521a(new C0587bk(m4422b(certificateEngineGetCertificate2.getPublicKey())));
                    c0625g7.m1521a(new C0585bi(c0625g9));
                    C0625g c0625g10 = new C0625g();
                    c0625g10.m1521a(f2674ak);
                    c0625g10.m1521a(new C0587bk(new C0557at(str2)));
                    c0625g7.m1521a(new C0585bi(c0625g10));
                }
                c0625g6.m1521a(new C0682v(f2728by, c0662b.mo1358i(), new C0587bk(c0625g7)));
                hashtable.put(certificateEngineGetCertificate2, certificateEngineGetCertificate2);
            } catch (CertificateEncodingException e) {
                throw new IOException("Error encoding certificate: " + e.toString());
            }
        }
        Enumeration enumerationM4425a3 = this.f6050bT.m4425a();
        while (enumerationM4425a3.hasMoreElements()) {
            try {
                String str3 = (String) enumerationM4425a3.nextElement();
                Certificate certificate = (Certificate) this.f6050bT.m4427b(str3);
                boolean z4 = false;
                if (this.f6048bR.m4427b(str3) == null) {
                    C0662b c0662b2 = new C0662b(f2678ao, new C0581be(certificate.getEncoded()));
                    C0625g c0625g11 = new C0625g();
                    if (certificate instanceof InterfaceC1198n) {
                        InterfaceC1198n interfaceC1198n3 = (InterfaceC1198n) certificate;
                        C0557at c0557at3 = (C0557at) interfaceC1198n3.mo2845a(f2674ak);
                        if (c0557at3 == null || !c0557at3.mo1350b().equals(str3)) {
                            interfaceC1198n3.mo2846a(f2674ak, new C0557at(str3));
                        }
                        Enumeration enumerationMo2847b3 = interfaceC1198n3.mo2847b();
                        while (enumerationMo2847b3.hasMoreElements()) {
                            C0653p c0653p3 = (C0653p) enumerationMo2847b3.nextElement();
                            if (!c0653p3.equals(InterfaceC0674n.f2675al)) {
                                C0625g c0625g12 = new C0625g();
                                c0625g12.m1521a(c0653p3);
                                c0625g12.m1521a(new C0587bk(interfaceC1198n3.mo2845a(c0653p3)));
                                c0625g11.m1521a(new C0585bi(c0625g12));
                                z4 = true;
                            }
                        }
                    }
                    if (!z4) {
                        C0625g c0625g13 = new C0625g();
                        c0625g13.m1521a(f2674ak);
                        c0625g13.m1521a(new C0587bk(new C0557at(str3)));
                        c0625g11.m1521a(new C0585bi(c0625g13));
                    }
                    c0625g6.m1521a(new C0682v(f2728by, c0662b2.mo1358i(), new C0587bk(c0625g11)));
                    hashtable.put(certificate, certificate);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException("Error encoding certificate: " + e2.toString());
            }
        }
        Set setM4415a = m4415a();
        Enumeration enumerationKeys = this.f6051bU.keys();
        while (enumerationKeys.hasMoreElements()) {
            try {
                Certificate certificate2 = (Certificate) this.f6051bU.get((CertId) enumerationKeys.nextElement());
                if (setM4415a.contains(certificate2) && hashtable.get(certificate2) == null) {
                    C0662b c0662b3 = new C0662b(f2678ao, new C0581be(certificate2.getEncoded()));
                    C0625g c0625g14 = new C0625g();
                    if (certificate2 instanceof InterfaceC1198n) {
                        InterfaceC1198n interfaceC1198n4 = (InterfaceC1198n) certificate2;
                        Enumeration enumerationMo2847b4 = interfaceC1198n4.mo2847b();
                        while (enumerationMo2847b4.hasMoreElements()) {
                            C0653p c0653p4 = (C0653p) enumerationMo2847b4.nextElement();
                            if (!c0653p4.equals(InterfaceC0674n.f2675al)) {
                                C0625g c0625g15 = new C0625g();
                                c0625g15.m1521a(c0653p4);
                                c0625g15.m1521a(new C0587bk(interfaceC1198n4.mo2845a(c0653p4)));
                                c0625g14.m1521a(new C0585bi(c0625g15));
                            }
                        }
                    }
                    c0625g6.m1521a(new C0682v(f2728by, c0662b3.mo1358i(), new C0587bk(c0625g14)));
                }
            } catch (CertificateEncodingException e3) {
                throw new IOException("Error encoding certificate: " + e3.toString());
            }
        }
        C0661a c0661a = new C0661a(new C0663c[]{new C0663c(f2628Q, c0545ah), new C0663c(f2633V, new C0665e(f2628Q, c0759a, new C0545ah(m4421a(true, c0759a, cArr, false, new C0585bi(c0625g6).m1577a("DER")))).mo1358i())});
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        (z ? new C0583bg(byteArrayOutputStream) : new C0548ak(byteArrayOutputStream)).mo1459a(c0661a);
        C0663c c0663c = new C0663c(f2628Q, new C0545ah(byteArrayOutputStream.toByteArray()));
        byte[] bArr3 = new byte[this.f6058cb];
        this.f6046bO.nextBytes(bArr3);
        try {
            (z ? new C0583bg(outputStream) : new C0548ak(outputStream)).mo1459a(new C0675o(c0663c, new C0669i(new C0769j(this.f6056bZ, m4420a(this.f6056bZ.m1783a(), bArr3, this.f6057ca, cArr, false, ((AbstractC0655q) c0663c.m1617b()).mo1410c())), bArr3, this.f6057ca)));
        } catch (Exception e4) {
            throw new IOException("error constructing MAC: " + e4.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private byte[] m4419a(String str, Key key, C0673m c0673m, char[] cArr) throws IOException {
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
        try {
            SecretKeyFactory secretKeyFactoryMo4524e = this.f6047bP.mo4524e(str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(c0673m.m1652b(), c0673m.m1651a().intValue());
            Cipher cipherMo4520a = this.f6047bP.mo4520a(str);
            cipherMo4520a.init(3, secretKeyFactoryMo4524e.generateSecret(pBEKeySpec), pBEParameterSpec);
            return cipherMo4520a.wrap(key);
        } catch (Exception e) {
            throw new IOException("exception encrypting data - " + e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private byte[] m4420a(C0653p c0653p, byte[] bArr, int i, char[] cArr, boolean z, byte[] bArr2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i);
        Mac macMo4521b = this.f6047bP.mo4521b(c0653p.m1593b());
        macMo4521b.init(new PKCS12Key(cArr, z), pBEParameterSpec);
        macMo4521b.update(bArr2);
        return macMo4521b.doFinal();
    }

    /* JADX INFO: renamed from: a */
    private byte[] m4421a(boolean z, C0759a c0759a, char[] cArr, boolean z2, byte[] bArr) throws IOException {
        C0653p c0653pM1783a = c0759a.m1783a();
        int i = z ? 1 : 2;
        if (!c0653pM1783a.m1592a(InterfaceC0674n.f2692bC)) {
            if (!c0653pM1783a.equals(InterfaceC0674n.f2612A)) {
                throw new IOException("unknown PBE algorithm: ".concat(String.valueOf(c0653pM1783a)));
            }
            try {
                return m4416a(i, cArr, c0759a).doFinal(bArr);
            } catch (Exception e) {
                throw new IOException("exception decrypting data - " + e.toString());
            }
        }
        C0673m c0673mM1650a = C0673m.m1650a(c0759a.m1784b());
        try {
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(c0673mM1650a.m1652b(), c0673mM1650a.m1651a().intValue());
            PKCS12Key pKCS12Key = new PKCS12Key(cArr, z2);
            Cipher cipherMo4520a = this.f6047bP.mo4520a(c0653pM1783a.m1593b());
            cipherMo4520a.init(i, pKCS12Key, pBEParameterSpec);
            return cipherMo4520a.doFinal(bArr);
        } catch (Exception e2) {
            throw new IOException("exception decrypting data - " + e2.toString());
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        Hashtable hashtable = new Hashtable();
        Enumeration enumerationM4425a = this.f6050bT.m4425a();
        while (enumerationM4425a.hasMoreElements()) {
            hashtable.put(enumerationM4425a.nextElement(), "cert");
        }
        Enumeration enumerationM4425a2 = this.f6048bR.m4425a();
        while (enumerationM4425a2.hasMoreElements()) {
            String str = (String) enumerationM4425a2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.keys();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        return (this.f6050bT.m4427b(str) == null && this.f6048bR.m4427b(str) == null) ? false : true;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) {
        Key key = (Key) this.f6048bR.m4424a(str);
        Certificate certificate = (Certificate) this.f6050bT.m4424a(str);
        if (certificate != null) {
            this.f6051bU.remove(new CertId(certificate.getPublicKey()));
        }
        if (key != null) {
            String str2 = (String) this.f6049bS.remove(str);
            Certificate certificate2 = str2 != null ? (Certificate) this.f6052bV.remove(str2) : certificate;
            if (certificate2 != null) {
                this.f6051bU.remove(new CertId(certificate2.getPublicKey()));
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null alias passed to getCertificate.");
        }
        Certificate certificate = (Certificate) this.f6050bT.m4427b(str);
        if (certificate != null) {
            return certificate;
        }
        String str2 = (String) this.f6049bS.get(str);
        return str2 != null ? (Certificate) this.f6052bV.get(str2) : (Certificate) this.f6052bV.get(str);
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        Enumeration enumerationM4428b = this.f6050bT.m4428b();
        Enumeration enumerationM4425a = this.f6050bT.m4425a();
        while (enumerationM4428b.hasMoreElements()) {
            Certificate certificate2 = (Certificate) enumerationM4428b.nextElement();
            String str = (String) enumerationM4425a.nextElement();
            if (certificate2.equals(certificate)) {
                return str;
            }
        }
        Enumeration enumerationElements = this.f6052bV.elements();
        Enumeration enumerationKeys = this.f6052bV.keys();
        while (enumerationElements.hasMoreElements()) {
            Certificate certificate3 = (Certificate) enumerationElements.nextElement();
            String str2 = (String) enumerationKeys.nextElement();
            if (certificate3.equals(certificate)) {
                return str2;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.security.cert.Certificate] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.security.cert.X509Certificate] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Vector] */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.security.cert.Certificate[] engineGetCertificateChain(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.engineGetCertificateChain(java.lang.String):java.security.cert.Certificate[]");
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        if (str == null) {
            throw new NullPointerException("alias == null");
        }
        if (this.f6048bR.m4427b(str) == null && this.f6050bT.m4427b(str) == null) {
            return null;
        }
        return new Date();
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) {
        if (str == null) {
            throw new IllegalArgumentException("null alias passed to getKey.");
        }
        return (Key) this.f6048bR.m4427b(str);
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        return this.f6050bT.m4427b(str) != null && this.f6048bR.m4427b(str) == null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        return this.f6048bR.m4427b(str) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
        boolean z;
        String strMo1350b;
        AbstractC0655q abstractC0655q;
        boolean z2;
        AbstractC0655q abstractC0655q2;
        AbstractC0686u abstractC0686u;
        boolean z3;
        String str;
        AbstractC0686u abstractC0686u2;
        boolean z4;
        if (inputStream == null) {
            return;
        }
        if (cArr == null) {
            throw new NullPointerException("No password supplied for PKCS#12 KeyStore.");
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        bufferedInputStream.mark(10);
        if (bufferedInputStream.read() != 48) {
            throw new IOException("stream does not represent a PKCS12 key store");
        }
        bufferedInputStream.reset();
        try {
            C0675o c0675oM1653a = C0675o.m1653a(new C0638l(bufferedInputStream).m1560b());
            C0663c c0663cM1654a = c0675oM1653a.m1654a();
            Vector vector = new Vector();
            boolean z5 = false;
            if (c0675oM1653a.m1655b() != null) {
                C0669i c0669iM1655b = c0675oM1653a.m1655b();
                C0769j c0769jM1635a = c0669iM1655b.m1635a();
                this.f6056bZ = c0769jM1635a.m1817a();
                byte[] bArrM1636b = c0669iM1655b.m1636b();
                this.f6057ca = m4413a(c0669iM1655b.m1637c());
                this.f6058cb = bArrM1636b.length;
                byte[] bArrMo1410c = ((AbstractC0655q) c0663cM1654a.m1617b()).mo1410c();
                try {
                    byte[] bArrM4420a = m4420a(this.f6056bZ.m1783a(), bArrM1636b, this.f6057ca, cArr, false, bArrMo1410c);
                    byte[] bArrM1818b = c0769jM1635a.m1818b();
                    if (C1535a.m4085b(bArrM4420a, bArrM1818b)) {
                        z4 = false;
                    } else {
                        if (cArr.length > 0) {
                            throw new IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
                        }
                        if (!C1535a.m4085b(m4420a(this.f6056bZ.m1783a(), bArrM1636b, this.f6057ca, cArr, true, bArrMo1410c), bArrM1818b)) {
                            throw new IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
                        }
                        z4 = true;
                    }
                    z = z4;
                } catch (IOException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new IOException("error constructing MAC: " + e2.toString());
                }
            } else {
                z = false;
            }
            this.f6048bR = new IgnoresCaseHashtable((byte) 0);
            this.f6049bS = new Hashtable();
            if (c0663cM1654a.m1616a().equals(f2628Q)) {
                C0663c[] c0663cArrM1611a = C0661a.m1609a(new C0638l(((AbstractC0655q) c0663cM1654a.m1617b()).mo1410c()).m1560b()).m1611a();
                int i = 0;
                while (i != c0663cArrM1611a.length) {
                    if (c0663cArrM1611a[i].m1616a().equals(f2628Q)) {
                        AbstractC0723v abstractC0723v = (AbstractC0723v) new C0638l(((AbstractC0655q) c0663cArrM1611a[i].m1617b()).mo1410c()).m1560b();
                        int i2 = 0;
                        z2 = z5;
                        while (i2 != abstractC0723v.mo1484d()) {
                            C0682v c0682vM1685a = C0682v.m1685a(abstractC0723v.mo1482a(i2));
                            if (c0682vM1685a.m1686a().equals(f2727bx)) {
                                C0666f c0666fM1625a = C0666f.m1625a(c0682vM1685a.m1687b());
                                PrivateKey privateKeyM4414a = m4414a(c0666fM1625a.m1626a(), c0666fM1625a.m1627b(), cArr, z);
                                AbstractC0655q abstractC0655q3 = null;
                                if (c0682vM1685a.m1688c() != null) {
                                    Enumeration enumerationM1747b = c0682vM1685a.m1688c().m1747b();
                                    str = null;
                                    while (enumerationM1747b.hasMoreElements()) {
                                        AbstractC0723v abstractC0723v2 = (AbstractC0723v) enumerationM1747b.nextElement();
                                        C0653p c0653p = (C0653p) abstractC0723v2.mo1482a(0);
                                        AbstractC0747x abstractC0747x = (AbstractC0747x) abstractC0723v2.mo1482a(1);
                                        if (abstractC0747x.m1748c() > 0) {
                                            abstractC0686u2 = (AbstractC0686u) abstractC0747x.m1746a(0);
                                            if (privateKeyM4414a instanceof InterfaceC1198n) {
                                                InterfaceC1198n interfaceC1198n = (InterfaceC1198n) privateKeyM4414a;
                                                InterfaceC0618f interfaceC0618fMo2845a = interfaceC1198n.mo2845a(c0653p);
                                                if (interfaceC0618fMo2845a == null) {
                                                    interfaceC1198n.mo2846a(c0653p, abstractC0686u2);
                                                } else if (!interfaceC0618fMo2845a.mo1358i().equals(abstractC0686u2)) {
                                                    throw new IOException("attempt to add existing attribute with different value");
                                                }
                                            }
                                        } else {
                                            abstractC0686u2 = null;
                                        }
                                        if (c0653p.equals(f2674ak)) {
                                            String strMo1350b2 = ((C0557at) abstractC0686u2).mo1350b();
                                            this.f6048bR.m4426a(strMo1350b2, privateKeyM4414a);
                                            str = strMo1350b2;
                                        } else {
                                            abstractC0655q3 = c0653p.equals(f2675al) ? (AbstractC0655q) abstractC0686u2 : abstractC0655q3;
                                        }
                                    }
                                } else {
                                    str = null;
                                }
                                if (abstractC0655q3 != null) {
                                    String str2 = new String(C1541f.m4108b(abstractC0655q3.mo1410c()));
                                    if (str == null) {
                                        this.f6048bR.m4426a(str2, privateKeyM4414a);
                                        z3 = z2;
                                    } else {
                                        this.f6049bS.put(str, str2);
                                        z3 = z2;
                                    }
                                } else {
                                    z3 = true;
                                    this.f6048bR.m4426a("unmarked", privateKeyM4414a);
                                }
                            } else if (c0682vM1685a.m1686a().equals(f2728by)) {
                                vector.addElement(c0682vM1685a);
                                z3 = z2;
                            } else {
                                System.out.println("extra in data " + c0682vM1685a.m1686a());
                                System.out.println(C0748a.m1749a(c0682vM1685a));
                                z3 = z2;
                            }
                            i2++;
                            z2 = z3;
                        }
                    } else if (c0663cArrM1611a[i].m1616a().equals(f2633V)) {
                        C0665e c0665eM1622a = C0665e.m1622a(c0663cArrM1611a[i].m1617b());
                        AbstractC0723v abstractC0723v3 = (AbstractC0723v) AbstractC0686u.m1692b(m4421a(false, c0665eM1622a.m1623a(), cArr, z, c0665eM1622a.m1624b().mo1410c()));
                        int i3 = 0;
                        while (true) {
                            int i4 = i3;
                            if (i4 == abstractC0723v3.mo1484d()) {
                                z2 = z5;
                                break;
                            }
                            C0682v c0682vM1685a2 = C0682v.m1685a(abstractC0723v3.mo1482a(i4));
                            if (c0682vM1685a2.m1686a().equals(f2728by)) {
                                vector.addElement(c0682vM1685a2);
                            } else if (c0682vM1685a2.m1686a().equals(f2727bx)) {
                                C0666f c0666fM1625a2 = C0666f.m1625a(c0682vM1685a2.m1687b());
                                PrivateKey privateKeyM4414a2 = m4414a(c0666fM1625a2.m1626a(), c0666fM1625a2.m1627b(), cArr, z);
                                InterfaceC1198n interfaceC1198n2 = (InterfaceC1198n) privateKeyM4414a2;
                                AbstractC0655q abstractC0655q4 = null;
                                Enumeration enumerationM1747b2 = c0682vM1685a2.m1688c().m1747b();
                                String str3 = null;
                                while (enumerationM1747b2.hasMoreElements()) {
                                    AbstractC0723v abstractC0723v4 = (AbstractC0723v) enumerationM1747b2.nextElement();
                                    C0653p c0653p2 = (C0653p) abstractC0723v4.mo1482a(0);
                                    AbstractC0747x abstractC0747x2 = (AbstractC0747x) abstractC0723v4.mo1482a(1);
                                    if (abstractC0747x2.m1748c() > 0) {
                                        abstractC0686u = (AbstractC0686u) abstractC0747x2.m1746a(0);
                                        InterfaceC0618f interfaceC0618fMo2845a2 = interfaceC1198n2.mo2845a(c0653p2);
                                        if (interfaceC0618fMo2845a2 == null) {
                                            interfaceC1198n2.mo2846a(c0653p2, abstractC0686u);
                                        } else if (!interfaceC0618fMo2845a2.mo1358i().equals(abstractC0686u)) {
                                            throw new IOException("attempt to add existing attribute with different value");
                                        }
                                    } else {
                                        abstractC0686u = null;
                                    }
                                    if (c0653p2.equals(f2674ak)) {
                                        String strMo1350b3 = ((C0557at) abstractC0686u).mo1350b();
                                        this.f6048bR.m4426a(strMo1350b3, privateKeyM4414a2);
                                        str3 = strMo1350b3;
                                    } else {
                                        abstractC0655q4 = c0653p2.equals(f2675al) ? (AbstractC0655q) abstractC0686u : abstractC0655q4;
                                    }
                                }
                                String str4 = new String(C1541f.m4108b(abstractC0655q4.mo1410c()));
                                if (str3 == null) {
                                    this.f6048bR.m4426a(str4, privateKeyM4414a2);
                                } else {
                                    this.f6049bS.put(str3, str4);
                                }
                            } else if (c0682vM1685a2.m1686a().equals(f2726bw)) {
                                PrivateKey privateKeyM2848a = C1200a.m2848a(C0676p.m1656a(c0682vM1685a2.m1687b()));
                                InterfaceC1198n interfaceC1198n3 = (InterfaceC1198n) privateKeyM2848a;
                                AbstractC0655q abstractC0655q5 = null;
                                Enumeration enumerationM1747b3 = c0682vM1685a2.m1688c().m1747b();
                                String str5 = null;
                                while (enumerationM1747b3.hasMoreElements()) {
                                    AbstractC0723v abstractC0723vM1708a = AbstractC0723v.m1708a(enumerationM1747b3.nextElement());
                                    C0653p c0653pM1584a = C0653p.m1584a(abstractC0723vM1708a.mo1482a(0));
                                    AbstractC0747x abstractC0747xM1741a = AbstractC0747x.m1741a((Object) abstractC0723vM1708a.mo1482a(1));
                                    if (abstractC0747xM1741a.m1748c() > 0) {
                                        AbstractC0686u abstractC0686u3 = (AbstractC0686u) abstractC0747xM1741a.m1746a(0);
                                        InterfaceC0618f interfaceC0618fMo2845a3 = interfaceC1198n3.mo2845a(c0653pM1584a);
                                        if (interfaceC0618fMo2845a3 == null) {
                                            interfaceC1198n3.mo2846a(c0653pM1584a, abstractC0686u3);
                                        } else if (!interfaceC0618fMo2845a3.mo1358i().equals(abstractC0686u3)) {
                                            throw new IOException("attempt to add existing attribute with different value");
                                        }
                                        if (c0653pM1584a.equals(f2674ak)) {
                                            String strMo1350b4 = ((C0557at) abstractC0686u3).mo1350b();
                                            this.f6048bR.m4426a(strMo1350b4, privateKeyM2848a);
                                            str5 = strMo1350b4;
                                        } else {
                                            if (c0653pM1584a.equals(f2675al)) {
                                                abstractC0655q2 = (AbstractC0655q) abstractC0686u3;
                                            }
                                            abstractC0655q5 = abstractC0655q2;
                                        }
                                    }
                                    abstractC0655q2 = abstractC0655q5;
                                    abstractC0655q5 = abstractC0655q2;
                                }
                                String str6 = new String(C1541f.m4108b(abstractC0655q5.mo1410c()));
                                if (str5 == null) {
                                    this.f6048bR.m4426a(str6, privateKeyM2848a);
                                } else {
                                    this.f6049bS.put(str5, str6);
                                }
                            } else {
                                System.out.println("extra in encryptedData " + c0682vM1685a2.m1686a());
                                System.out.println(C0748a.m1749a(c0682vM1685a2));
                            }
                            i3 = i4 + 1;
                        }
                    } else {
                        System.out.println("extra " + c0663cArrM1611a[i].m1616a().m1593b());
                        System.out.println("extra " + C0748a.m1749a(c0663cArrM1611a[i].m1617b()));
                        z2 = z5;
                    }
                    i++;
                    z5 = z2;
                }
            }
            this.f6050bT = new IgnoresCaseHashtable((byte) 0);
            this.f6051bU = new Hashtable();
            this.f6052bV = new Hashtable();
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 == vector.size()) {
                    return;
                }
                C0682v c0682v = (C0682v) vector.elementAt(i6);
                C0662b c0662bM1612a = C0662b.m1612a(c0682v.m1687b());
                if (!c0662bM1612a.m1613a().equals(f2678ao)) {
                    throw new RuntimeException("Unsupported certificate type: " + c0662bM1612a.m1613a());
                }
                try {
                    Certificate certificateGenerateCertificate = this.f6053bW.generateCertificate(new ByteArrayInputStream(((AbstractC0655q) c0662bM1612a.m1614b()).mo1410c()));
                    AbstractC0655q abstractC0655q6 = null;
                    if (c0682v.m1688c() != null) {
                        Enumeration enumerationM1747b4 = c0682v.m1688c().m1747b();
                        strMo1350b = null;
                        while (enumerationM1747b4.hasMoreElements()) {
                            AbstractC0723v abstractC0723vM1708a2 = AbstractC0723v.m1708a(enumerationM1747b4.nextElement());
                            C0653p c0653pM1584a2 = C0653p.m1584a(abstractC0723vM1708a2.mo1482a(0));
                            AbstractC0747x abstractC0747xM1741a2 = AbstractC0747x.m1741a((Object) abstractC0723vM1708a2.mo1482a(1));
                            if (abstractC0747xM1741a2.m1748c() > 0) {
                                AbstractC0686u abstractC0686u4 = (AbstractC0686u) abstractC0747xM1741a2.m1746a(0);
                                if (certificateGenerateCertificate instanceof InterfaceC1198n) {
                                    InterfaceC1198n interfaceC1198n4 = (InterfaceC1198n) certificateGenerateCertificate;
                                    InterfaceC0618f interfaceC0618fMo2845a4 = interfaceC1198n4.mo2845a(c0653pM1584a2);
                                    if (interfaceC0618fMo2845a4 == null) {
                                        interfaceC1198n4.mo2846a(c0653pM1584a2, abstractC0686u4);
                                    } else if (!interfaceC0618fMo2845a4.mo1358i().equals(abstractC0686u4)) {
                                        throw new IOException("attempt to add existing attribute with different value");
                                    }
                                }
                                if (c0653pM1584a2.equals(f2674ak)) {
                                    strMo1350b = ((C0557at) abstractC0686u4).mo1350b();
                                } else {
                                    if (c0653pM1584a2.equals(f2675al)) {
                                        abstractC0655q = (AbstractC0655q) abstractC0686u4;
                                    }
                                    abstractC0655q6 = abstractC0655q;
                                }
                            }
                            abstractC0655q = abstractC0655q6;
                            abstractC0655q6 = abstractC0655q;
                        }
                    } else {
                        strMo1350b = null;
                    }
                    this.f6051bU.put(new CertId(certificateGenerateCertificate.getPublicKey()), certificateGenerateCertificate);
                    if (!z5) {
                        if (abstractC0655q6 != null) {
                            this.f6052bV.put(new String(C1541f.m4108b(abstractC0655q6.mo1410c())), certificateGenerateCertificate);
                        }
                        if (strMo1350b != null) {
                            this.f6050bT.m4426a(strMo1350b, certificateGenerateCertificate);
                        }
                    } else if (this.f6052bV.isEmpty()) {
                        String str7 = new String(C1541f.m4108b(m4422b(certificateGenerateCertificate.getPublicKey()).m1842a()));
                        this.f6052bV.put(str7, certificateGenerateCertificate);
                        this.f6048bR.m4426a(str7, this.f6048bR.m4424a("unmarked"));
                    }
                    i5 = i6 + 1;
                } catch (Exception e3) {
                    throw new RuntimeException(e3.toString());
                }
            }
        } catch (Exception e4) {
            throw new IOException(e4.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        if (this.f6048bR.m4427b(str) != null) {
            throw new KeyStoreException("There is a key entry with the name " + str + ".");
        }
        this.f6050bT.m4426a(str, certificate);
        this.f6051bU.put(new CertId(certificate.getPublicKey()), certificate);
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        if (!(key instanceof PrivateKey)) {
            throw new KeyStoreException("PKCS12 does not support non-PrivateKeys");
        }
        if ((key instanceof PrivateKey) && certificateArr == null) {
            throw new KeyStoreException("no certificate chain for private key");
        }
        if (this.f6048bR.m4427b(str) != null) {
            engineDeleteEntry(str);
        }
        this.f6048bR.m4426a(str, key);
        if (certificateArr != null) {
            this.f6050bT.m4426a(str, certificateArr[0]);
            for (int i = 0; i != certificateArr.length; i++) {
                this.f6051bU.put(new CertId(certificateArr[i].getPublicKey()), certificateArr[i]);
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        throw new RuntimeException("operation not supported");
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        Hashtable hashtable = new Hashtable();
        Enumeration enumerationM4425a = this.f6050bT.m4425a();
        while (enumerationM4425a.hasMoreElements()) {
            hashtable.put(enumerationM4425a.nextElement(), "cert");
        }
        Enumeration enumerationM4425a2 = this.f6048bR.m4425a();
        while (enumerationM4425a2.hasMoreElements()) {
            String str = (String) enumerationM4425a2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
        m4418a(outputStream, cArr, false);
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException {
        char[] password;
        if (loadStoreParameter == null) {
            throw new IllegalArgumentException("'param' arg cannot be null");
        }
        if (!(loadStoreParameter instanceof PKCS12StoreParameter) && !(loadStoreParameter instanceof C1203d)) {
            throw new IllegalArgumentException("No support for 'param' of type " + loadStoreParameter.getClass().getName());
        }
        PKCS12StoreParameter pKCS12StoreParameter = loadStoreParameter instanceof PKCS12StoreParameter ? (PKCS12StoreParameter) loadStoreParameter : new PKCS12StoreParameter(((C1203d) loadStoreParameter).m2863a(), loadStoreParameter.getProtectionParameter(), ((C1203d) loadStoreParameter).m2864b());
        KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            password = null;
        } else {
            if (!(protectionParameter instanceof KeyStore.PasswordProtection)) {
                throw new IllegalArgumentException("No support for protection parameter of type " + protectionParameter.getClass().getName());
            }
            password = ((KeyStore.PasswordProtection) protectionParameter).getPassword();
        }
        m4418a(pKCS12StoreParameter.m4181a(), password, pKCS12StoreParameter.m4182b());
    }

    private static class DefaultSecretKeyProvider {

        /* JADX INFO: renamed from: a */
        private final Map f6061a;

        /* JADX INFO: renamed from: a */
        public final int m4423a(C0759a c0759a) {
            Integer num = (Integer) this.f6061a.get(c0759a.m1783a());
            if (num != null) {
                return num.intValue();
            }
            return -1;
        }

        DefaultSecretKeyProvider() {
            HashMap map = new HashMap();
            map.put(new C0653p("1.2.840.113533.7.66.10"), 128);
            map.put(InterfaceC0674n.f2615D, 192);
            map.put(InterfaceC0652b.f2508u, 128);
            map.put(InterfaceC0652b.f2455C, 192);
            map.put(InterfaceC0652b.f2463K, 256);
            map.put(InterfaceC0656a.f2559a, 128);
            map.put(InterfaceC0656a.f2560b, 192);
            map.put(InterfaceC0656a.f2561c, 256);
            map.put(InterfaceC0619a.f2198f, 256);
            this.f6061a = Collections.unmodifiableMap(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static C0779t m4422b(PublicKey publicKey) {
        try {
            C0780u c0780uM1843a = C0780u.m1843a(publicKey.getEncoded());
            C0842s c0842s = new C0842s();
            byte[] bArr = new byte[c0842s.mo1930b()];
            byte[] bArrD = c0780uM1843a.m1846c().m1474d();
            c0842s.mo1929a(bArrD, 0, bArrD.length);
            c0842s.mo1926a(bArr, 0);
            return new C0779t(bArr);
        } catch (Exception e) {
            throw new RuntimeException("error creating key");
        }
    }
}
