package org.bouncycastle.jcajce.provider.keystore.bcfks;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore$CallbackHandlerProtection;
import java.security.KeyStore$LoadStoreParameter;
import java.security.KeyStore$PasswordProtection;
import java.security.KeyStore$ProtectionParameter;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAKey;
import java.security.interfaces.RSAKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.ParseException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.bouncycastle.a.aa.aj;
import org.bouncycastle.a.b.c;
import org.bouncycastle.a.b.d;
import org.bouncycastle.a.b.e;
import org.bouncycastle.a.b.f;
import org.bouncycastle.a.b.i;
import org.bouncycastle.a.b.j;
import org.bouncycastle.a.b.l;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.o.b;
import org.bouncycastle.a.p;
import org.bouncycastle.a.s.h;
import org.bouncycastle.a.s.k;
import org.bouncycastle.a.s.n;
import org.bouncycastle.a.z.a;
import org.bouncycastle.a.z.g;
import org.bouncycastle.b.ad;
import org.bouncycastle.b.b.w;
import org.bouncycastle.b.f.aa;
import org.bouncycastle.b.f.x;
import org.bouncycastle.b.k.ba;
import org.bouncycastle.jcajce.BCFKSLoadStoreParameter;
import org.bouncycastle.jcajce.BCFKSLoadStoreParameter$CertChainValidator;
import org.bouncycastle.jcajce.BCFKSLoadStoreParameter$EncryptionAlgorithm;
import org.bouncycastle.jcajce.BCFKSLoadStoreParameter$MacAlgorithm;
import org.bouncycastle.jcajce.BCFKSLoadStoreParameter$SignatureAlgorithm;
import org.bouncycastle.jcajce.BCFKSStoreParameter;
import org.bouncycastle.jcajce.BCLoadStoreParameter;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* JADX INFO: loaded from: classes.dex */
class BcFKSKeyStoreSpi extends KeyStoreSpi {
    private static final Map<String, p> a = new HashMap();
    private static final Map<p, String> b = new HashMap();
    private static final BigInteger e;
    private static final BigInteger f;
    private static final BigInteger g;
    private static final BigInteger h;
    private static final BigInteger i;
    private PublicKey c;
    private BCFKSLoadStoreParameter$CertChainValidator d;
    private final JcaJceHelper j;
    private a m;
    private h n;
    private a o;
    private Date p;
    private Date q;
    private final Map<String, e> k = new HashMap();
    private final Map<String, PrivateKey> l = new HashMap();
    private p r = b.P;

    static {
        a.put("DESEDE", org.bouncycastle.a.r.b.h);
        a.put("TRIPLEDES", org.bouncycastle.a.r.b.h);
        a.put("TDEA", org.bouncycastle.a.r.b.h);
        a.put("HMACSHA1", n.K);
        a.put("HMACSHA224", n.L);
        a.put("HMACSHA256", n.M);
        a.put("HMACSHA384", n.N);
        a.put("HMACSHA512", n.O);
        a.put("SEED", org.bouncycastle.a.m.a.a);
        a.put("CAMELLIA.128", org.bouncycastle.a.q.a.a);
        a.put("CAMELLIA.192", org.bouncycastle.a.q.a.b);
        a.put("CAMELLIA.256", org.bouncycastle.a.q.a.c);
        a.put("ARIA.128", org.bouncycastle.a.p.a.h);
        a.put("ARIA.192", org.bouncycastle.a.p.a.m);
        a.put("ARIA.256", org.bouncycastle.a.p.a.r);
        b.put(n.f_, "RSA");
        b.put(aj.k, "EC");
        b.put(org.bouncycastle.a.r.b.l, "DH");
        b.put(n.s, "DH");
        b.put(aj.U, "DSA");
        e = BigInteger.valueOf(0L);
        f = BigInteger.valueOf(1L);
        g = BigInteger.valueOf(2L);
        h = BigInteger.valueOf(3L);
        i = BigInteger.valueOf(4L);
    }

    BcFKSKeyStoreSpi(JcaJceHelper jcaJceHelper) {
        this.j = jcaJceHelper;
    }

    private Certificate a(Object obj) {
        if (this.j != null) {
            try {
                return this.j.g("X.509").generateCertificate(new ByteArrayInputStream(g.a(obj).k()));
            } catch (Exception e2) {
                return null;
            }
        }
        try {
            return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(g.a(obj).k()));
        } catch (Exception e3) {
            return null;
        }
    }

    private static Date a(e eVar, Date date) {
        try {
            return eVar.a().c();
        } catch (ParseException e2) {
            return date;
        }
    }

    private Cipher a(String str, byte[] bArr) throws InvalidKeyException {
        Cipher cipherA = this.j.a(str);
        cipherA.init(1, new SecretKeySpec(bArr, "AES"));
        return cipherA;
    }

    private org.bouncycastle.a.b.b a(a aVar, char[] cArr) throws NoSuchAlgorithmException, IOException {
        e[] eVarArr = (e[]) this.k.values().toArray(new e[this.k.size()]);
        h hVarA = a(this.n, 32);
        if (cArr == null) {
            cArr = new char[0];
        }
        byte[] bArrA = a(hVarA, "STORE_ENCRYPTION", cArr, 32);
        org.bouncycastle.a.b.h hVar = new org.bouncycastle.a.b.h(aVar, this.p, this.q, new f(eVarArr));
        try {
            if (!this.r.equals(b.P)) {
                return new org.bouncycastle.a.b.b(new a(n.A, new k(hVarA, new org.bouncycastle.a.s.g(b.Q))), a("AESKWP", bArrA).doFinal(hVar.k()));
            }
            Cipher cipherA = a("AES/CCM/NoPadding", bArrA);
            return new org.bouncycastle.a.b.b(new a(n.A, new k(hVarA, new org.bouncycastle.a.s.g(b.P, org.bouncycastle.a.d.a.a(cipherA.getParameters().getEncoded())))), cipherA.doFinal(hVar.k()));
        } catch (InvalidKeyException e2) {
            throw new IOException(e2.toString());
        } catch (NoSuchProviderException e3) {
            throw new IOException(e3.toString());
        } catch (BadPaddingException e4) {
            throw new IOException(e4.toString());
        } catch (IllegalBlockSizeException e5) {
            throw new IOException(e5.toString());
        } catch (NoSuchPaddingException e6) {
            throw new NoSuchAlgorithmException(e6.toString());
        }
    }

    private static c a(org.bouncycastle.a.s.f fVar, Certificate[] certificateArr) {
        g[] gVarArr = new g[certificateArr.length];
        for (int i2 = 0; i2 != certificateArr.length; i2++) {
            gVarArr[i2] = g.a(certificateArr[i2].getEncoded());
        }
        return new c(fVar, gVarArr);
    }

    private static a a(Key key, BCFKSLoadStoreParameter$SignatureAlgorithm bCFKSLoadStoreParameter$SignatureAlgorithm) throws IOException {
        if (key == null) {
            return null;
        }
        if (key instanceof org.bouncycastle.c.a.a) {
            if (bCFKSLoadStoreParameter$SignatureAlgorithm == BCFKSLoadStoreParameter$SignatureAlgorithm.c) {
                return new a(aj.p);
            }
            if (bCFKSLoadStoreParameter$SignatureAlgorithm == BCFKSLoadStoreParameter$SignatureAlgorithm.d) {
                return new a(b.ae);
            }
        }
        if (key instanceof DSAKey) {
            if (bCFKSLoadStoreParameter$SignatureAlgorithm == BCFKSLoadStoreParameter$SignatureAlgorithm.a) {
                return new a(b.W);
            }
            if (bCFKSLoadStoreParameter$SignatureAlgorithm == BCFKSLoadStoreParameter$SignatureAlgorithm.b) {
                return new a(b.aa);
            }
        }
        if (key instanceof RSAKey) {
            if (bCFKSLoadStoreParameter$SignatureAlgorithm == BCFKSLoadStoreParameter$SignatureAlgorithm.e) {
                return new a(n.n_, bc.a);
            }
            if (bCFKSLoadStoreParameter$SignatureAlgorithm == BCFKSLoadStoreParameter$SignatureAlgorithm.f) {
                return new a(b.ai, bc.a);
            }
        }
        throw new IOException("unknown signature algorithm");
    }

    private void a(org.bouncycastle.a.f fVar, l lVar, PublicKey publicKey) throws SignatureException, InvalidKeyException, IOException {
        Signature signatureF = this.j.f(lVar.b().a().b());
        signatureF.initVerify(publicKey);
        signatureF.update(fVar.i().a("DER"));
        if (!signatureF.verify(lVar.a().c())) {
            throw new IOException("BCFKS KeyStore corrupted: signature calculation failed");
        }
    }

    private void a(byte[] bArr, j jVar, char[] cArr) throws IOException {
        if (!org.bouncycastle.f.a.b(a(bArr, jVar.a(), jVar.b(), cArr), jVar.c())) {
            throw new IOException("BCFKS KeyStore corrupted: MAC calculation failed");
        }
    }

    private byte[] a(String str, a aVar, char[] cArr, byte[] bArr) throws IOException {
        Cipher cipherA;
        AlgorithmParameters algorithmParametersC;
        if (!aVar.a().equals(n.A)) {
            throw new IOException("BCFKS KeyStore cannot recognize protection algorithm.");
        }
        k kVarA = k.a(aVar.b());
        org.bouncycastle.a.s.g gVarB = kVarA.b();
        try {
            if (gVarB.a().equals(b.P)) {
                cipherA = this.j.a("AES/CCM/NoPadding");
                algorithmParametersC = this.j.c("CCM");
                algorithmParametersC.init(org.bouncycastle.a.d.a.a(gVarB.b()).k());
            } else {
                if (!gVarB.a().equals(b.Q)) {
                    throw new IOException("BCFKS KeyStore cannot recognize protection encryption algorithm.");
                }
                cipherA = this.j.a("AESKWP");
                algorithmParametersC = null;
            }
            h hVarA = kVarA.a();
            if (cArr == null) {
                cArr = new char[0];
            }
            cipherA.init(2, new SecretKeySpec(a(hVarA, str, cArr, 32), "AES"), algorithmParametersC);
            return cipherA.doFinal(bArr);
        } catch (IOException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new IOException(e3.toString());
        }
    }

    private static byte[] a(h hVar, String str, char[] cArr, int i2) throws IOException {
        int iIntValue;
        byte[] bArrC = ad.c(cArr);
        byte[] bArrC2 = ad.c(str.toCharArray());
        if (org.bouncycastle.a.n.c.L.equals(hVar.a())) {
            org.bouncycastle.a.n.f fVarA = org.bouncycastle.a.n.f.a(hVar.b());
            if (fVarA.e() != null) {
                iIntValue = fVarA.e().intValue();
            } else {
                if (i2 == -1) {
                    throw new IOException("no keyLength found in ScryptParams");
                }
                iIntValue = i2;
            }
            return aa.a(org.bouncycastle.f.a.d(bArrC, bArrC2), fVarA.a(), fVarA.b().intValue(), fVarA.c().intValue(), fVarA.c().intValue(), iIntValue);
        }
        if (!hVar.a().equals(n.B)) {
            throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD.");
        }
        org.bouncycastle.a.s.l lVarA = org.bouncycastle.a.s.l.a(hVar.b());
        if (lVarA.c() != null) {
            i2 = lVarA.c().intValue();
        } else if (i2 == -1) {
            throw new IOException("no keyLength found in PBKDF2Params");
        }
        if (lVarA.e().a().equals(n.O)) {
            x xVar = new x(new org.bouncycastle.b.b.x());
            xVar.a(org.bouncycastle.f.a.d(bArrC, bArrC2), lVarA.a(), lVarA.b().intValue());
            return ((ba) xVar.a(i2 * 8)).a();
        }
        if (!lVarA.e().a().equals(b.r)) {
            throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD PRF: " + lVarA.e().a());
        }
        x xVar2 = new x(new w(512));
        xVar2.a(org.bouncycastle.f.a.d(bArrC, bArrC2), lVarA.a(), lVarA.b().intValue());
        return ((ba) xVar2.a(i2 * 8)).a();
    }

    private byte[] a(byte[] bArr, a aVar, h hVar, char[] cArr) throws IOException {
        String strB = aVar.a().b();
        Mac macB = this.j.b(strB);
        try {
            if (cArr == null) {
                cArr = new char[0];
            }
            macB.init(new SecretKeySpec(a(hVar, "INTEGRITY_CHECK", cArr, -1), strB));
            return macB.doFinal(bArr);
        } catch (InvalidKeyException e2) {
            throw new IOException("Cannot set up MAC calculation: " + e2.getMessage());
        }
    }

    private static char[] a(KeyStore$LoadStoreParameter keyStore$LoadStoreParameter) throws IOException {
        KeyStore$ProtectionParameter protectionParameter = keyStore$LoadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            return null;
        }
        if (protectionParameter instanceof KeyStore$PasswordProtection) {
            return ((KeyStore$PasswordProtection) protectionParameter).getPassword();
        }
        if (!(protectionParameter instanceof KeyStore$CallbackHandlerProtection)) {
            throw new IllegalArgumentException("no support for protection parameter of type " + protectionParameter.getClass().getName());
        }
        CallbackHandler callbackHandler = ((KeyStore$CallbackHandlerProtection) protectionParameter).getCallbackHandler();
        PasswordCallback passwordCallback = new PasswordCallback("password: ", false);
        try {
            callbackHandler.handle(new Callback[]{passwordCallback});
            return passwordCallback.getPassword();
        } catch (UnsupportedCallbackException e2) {
            throw new IllegalArgumentException("PasswordCallback not recognised: " + e2.getMessage(), e2);
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration<String> engineAliases() {
        return new BcFKSKeyStoreSpi$1(this, new HashSet(this.k.keySet()).iterator());
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        if (str == null) {
            throw new NullPointerException("alias value is null");
        }
        return this.k.containsKey(str);
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) {
        if (this.k.get(str) == null) {
            return;
        }
        this.l.remove(str);
        this.k.remove(str);
        this.q = new Date();
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        e eVar = this.k.get(str);
        if (eVar != null) {
            if (eVar.e().equals(f) || eVar.e().equals(h)) {
                return a(c.a(eVar.b()).a()[0]);
            }
            if (eVar.e().equals(e)) {
                return a(eVar.b());
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        if (certificate == null) {
            return null;
        }
        try {
            byte[] encoded = certificate.getEncoded();
            for (String str : this.k.keySet()) {
                e eVar = this.k.get(str);
                if (eVar.e().equals(e)) {
                    if (org.bouncycastle.f.a.a(eVar.b(), encoded)) {
                        return str;
                    }
                } else if (eVar.e().equals(f) || eVar.e().equals(h)) {
                    try {
                        if (org.bouncycastle.f.a.a(c.a(eVar.b()).a()[0].i().k(), encoded)) {
                            return str;
                        }
                    } catch (IOException e2) {
                    }
                }
            }
            return null;
        } catch (CertificateEncodingException e3) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        e eVar = this.k.get(str);
        if (eVar == null || !(eVar.e().equals(f) || eVar.e().equals(h))) {
            return null;
        }
        g[] gVarArrA = c.a(eVar.b()).a();
        X509Certificate[] x509CertificateArr = new X509Certificate[gVarArrA.length];
        for (int i2 = 0; i2 != x509CertificateArr.length; i2++) {
            x509CertificateArr[i2] = a(gVarArrA[i2]);
        }
        return x509CertificateArr;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        e eVar = this.k.get(str);
        if (eVar == null) {
            return null;
        }
        try {
            return eVar.d().c();
        } catch (ParseException e2) {
            return new Date();
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        e eVar = this.k.get(str);
        if (eVar != null) {
            return eVar.e().equals(e);
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        e eVar = this.k.get(str);
        if (eVar == null) {
            return false;
        }
        BigInteger bigIntegerE = eVar.e();
        return bigIntegerE.equals(f) || bigIntegerE.equals(g) || bigIntegerE.equals(h) || bigIntegerE.equals(i);
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) {
        a aVarB;
        org.bouncycastle.a.b.h hVarA;
        this.k.clear();
        this.l.clear();
        this.p = null;
        this.q = null;
        this.m = null;
        if (inputStream == null) {
            Date date = new Date();
            this.p = date;
            this.q = date;
            this.c = null;
            this.d = null;
            this.m = new a(n.O, bc.a);
            this.n = a(n.B, 64);
            return;
        }
        try {
            org.bouncycastle.a.b.g gVarA = org.bouncycastle.a.b.g.a(new org.bouncycastle.a.l(inputStream).b());
            i iVarA = gVarA.a();
            if (iVarA.a() == 0) {
                j jVarA = j.a(iVarA.b());
                this.m = jVarA.a();
                this.n = jVarA.b();
                a aVar = this.m;
                try {
                    a(gVarA.b().i().k(), jVarA, cArr);
                    aVarB = aVar;
                } catch (NoSuchProviderException e2) {
                    throw new IOException(e2.getMessage());
                }
            } else {
                if (iVarA.a() != 1) {
                    throw new IOException("BCFKS KeyStore unable to recognize integrity check.");
                }
                l lVarA = l.a(iVarA.b());
                aVarB = lVarA.b();
                try {
                    g[] gVarArrC = lVarA.c();
                    if (this.d == null) {
                        a(gVarA.b(), lVarA, this.c);
                    } else {
                        if (gVarArrC == null) {
                            throw new IOException("validator specified but no certifcates in store");
                        }
                        CertificateFactory certificateFactoryG = this.j.g("X.509");
                        X509Certificate[] x509CertificateArr = new X509Certificate[gVarArrC.length];
                        for (int i2 = 0; i2 != x509CertificateArr.length; i2++) {
                            x509CertificateArr[i2] = (X509Certificate) certificateFactoryG.generateCertificate(new ByteArrayInputStream(gVarArrC[i2].k()));
                        }
                        if (!this.d.a()) {
                            throw new IOException("certificate chain in key store signature not valid");
                        }
                        a(gVarA.b(), lVarA, x509CertificateArr[0].getPublicKey());
                    }
                } catch (GeneralSecurityException e3) {
                    throw new IOException("error verifying signature: " + e3.getMessage(), e3);
                }
            }
            org.bouncycastle.a.f fVarB = gVarA.b();
            if (fVarB instanceof org.bouncycastle.a.b.b) {
                org.bouncycastle.a.b.b bVar = (org.bouncycastle.a.b.b) fVarB;
                hVarA = org.bouncycastle.a.b.h.a(a("STORE_ENCRYPTION", bVar.b(), cArr, bVar.a().c()));
            } else {
                hVarA = org.bouncycastle.a.b.h.a(fVarB);
            }
            try {
                this.p = hVarA.a().c();
                this.q = hVarA.c().c();
                if (!hVarA.b().equals(aVarB)) {
                    throw new IOException("BCFKS KeyStore storeData integrity algorithm does not match store integrity algorithm.");
                }
                Iterator<org.bouncycastle.a.f> it = hVarA.d().iterator();
                while (it.hasNext()) {
                    e eVarA = e.a(it.next());
                    this.k.put(eVarA.c(), eVarA);
                }
            } catch (ParseException e4) {
                throw new IOException("BCFKS KeyStore unable to parse store data information.");
            }
        } catch (Exception e5) {
            throw new IOException(e5.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) {
        Date dateA;
        e eVar = this.k.get(str);
        Date date = new Date();
        if (eVar == null) {
            dateA = date;
        } else {
            if (!eVar.e().equals(e)) {
                throw new KeyStoreException("BCFKS KeyStore already has a key entry with alias ".concat(String.valueOf(str)));
            }
            dateA = a(eVar, date);
        }
        try {
            this.k.put(str, new e(e, str, dateA, date, certificate.getEncoded()));
            this.q = date;
        } catch (CertificateEncodingException e2) {
            throw new BcFKSKeyStoreSpi$ExtKeyStoreException("BCFKS KeyStore unable to handle certificate: " + e2.getMessage(), e2);
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
        org.bouncycastle.a.b.k kVar;
        d dVar;
        org.bouncycastle.a.s.f fVar;
        Date date = new Date();
        e eVar = this.k.get(str);
        Date dateA = eVar != null ? a(eVar, date) : date;
        this.l.remove(str);
        if (key instanceof PrivateKey) {
            if (certificateArr == null) {
                throw new KeyStoreException("BCFKS KeyStore requires a certificate chain for private key storage.");
            }
            try {
                byte[] encoded = key.getEncoded();
                h hVarA = a(n.B, 32);
                if (cArr == null) {
                    cArr = new char[0];
                }
                byte[] bArrA = a(hVarA, "PRIVATE_KEY_ENCRYPTION", cArr, 32);
                if (this.r.equals(b.P)) {
                    Cipher cipherA = a("AES/CCM/NoPadding", bArrA);
                    fVar = new org.bouncycastle.a.s.f(new a(n.A, new k(hVarA, new org.bouncycastle.a.s.g(b.P, org.bouncycastle.a.d.a.a(cipherA.getParameters().getEncoded())))), cipherA.doFinal(encoded));
                } else {
                    fVar = new org.bouncycastle.a.s.f(new a(n.A, new k(hVarA, new org.bouncycastle.a.s.g(b.Q))), a("AESKWP", bArrA).doFinal(encoded));
                }
                this.k.put(str, new e(f, str, dateA, date, a(fVar, certificateArr).k()));
            } catch (Exception e2) {
                throw new BcFKSKeyStoreSpi$ExtKeyStoreException("BCFKS KeyStore exception storing private key: " + e2.toString(), e2);
            }
        } else {
            if (!(key instanceof SecretKey)) {
                throw new KeyStoreException("BCFKS KeyStore unable to recognize key.");
            }
            if (certificateArr != null) {
                throw new KeyStoreException("BCFKS KeyStore cannot store certificate chain with secret key.");
            }
            try {
                byte[] encoded2 = key.getEncoded();
                h hVarA2 = a(n.B, 32);
                if (cArr == null) {
                    cArr = new char[0];
                }
                byte[] bArrA2 = a(hVarA2, "SECRET_KEY_ENCRYPTION", cArr, 32);
                String strB = org.bouncycastle.f.k.b(key.getAlgorithm());
                if (strB.indexOf("AES") >= 0) {
                    kVar = new org.bouncycastle.a.b.k(b.s, encoded2);
                } else {
                    p pVar = a.get(strB);
                    if (pVar != null) {
                        kVar = new org.bouncycastle.a.b.k(pVar, encoded2);
                    } else {
                        p pVar2 = a.get(strB + "." + (encoded2.length * 8));
                        if (pVar2 == null) {
                            throw new KeyStoreException("BCFKS KeyStore cannot recognize secret key (" + strB + ") for storage.");
                        }
                        kVar = new org.bouncycastle.a.b.k(pVar2, encoded2);
                    }
                }
                if (this.r.equals(b.P)) {
                    Cipher cipherA2 = a("AES/CCM/NoPadding", bArrA2);
                    dVar = new d(new a(n.A, new k(hVarA2, new org.bouncycastle.a.s.g(b.P, org.bouncycastle.a.d.a.a(cipherA2.getParameters().getEncoded())))), cipherA2.doFinal(kVar.k()));
                } else {
                    dVar = new d(new a(n.A, new k(hVarA2, new org.bouncycastle.a.s.g(b.Q))), a("AESKWP", bArrA2).doFinal(kVar.k()));
                }
                this.k.put(str, new e(g, str, dateA, date, dVar.k()));
            } catch (Exception e3) {
                throw new BcFKSKeyStoreSpi$ExtKeyStoreException("BCFKS KeyStore exception storing private key: " + e3.toString(), e3);
            }
        }
        this.q = date;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        Date date = new Date();
        e eVar = this.k.get(str);
        Date dateA = eVar != null ? a(eVar, date) : date;
        if (certificateArr != null) {
            try {
                org.bouncycastle.a.s.f fVarA = org.bouncycastle.a.s.f.a(bArr);
                try {
                    this.l.remove(str);
                    this.k.put(str, new e(h, str, dateA, date, a(fVarA, certificateArr).k()));
                } catch (Exception e2) {
                    throw new BcFKSKeyStoreSpi$ExtKeyStoreException("BCFKS KeyStore exception storing protected private key: " + e2.toString(), e2);
                }
            } catch (Exception e3) {
                throw new BcFKSKeyStoreSpi$ExtKeyStoreException("BCFKS KeyStore private key encoding must be an EncryptedPrivateKeyInfo.", e3);
            }
        } else {
            try {
                this.k.put(str, new e(i, str, dateA, date, bArr));
            } catch (Exception e4) {
                throw new BcFKSKeyStoreSpi$ExtKeyStoreException("BCFKS KeyStore exception storing protected private key: " + e4.toString(), e4);
            }
        }
        this.q = date;
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.k.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) {
        if (this.p == null) {
            throw new IOException("KeyStore not initialized");
        }
        org.bouncycastle.a.b.b bVarA = a(this.m, cArr);
        if (org.bouncycastle.a.n.c.L.equals(this.n.a())) {
            this.n = a(this.n, org.bouncycastle.a.n.f.a(this.n.b()).e().intValue());
        } else {
            this.n = a(this.n, org.bouncycastle.a.s.l.a(this.n.b()).c().intValue());
        }
        try {
            outputStream.write(new org.bouncycastle.a.b.g(bVarA, new i(new j(this.m, this.n, a(bVarA.k(), this.m, this.n, cArr)))).k());
            outputStream.flush();
        } catch (NoSuchProviderException e2) {
            throw new IOException("cannot calculate mac: " + e2.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore$LoadStoreParameter keyStore$LoadStoreParameter) {
        l lVar;
        if (keyStore$LoadStoreParameter == null) {
            throw new IllegalArgumentException("'parameter' arg cannot be null");
        }
        if (keyStore$LoadStoreParameter instanceof BCFKSStoreParameter) {
            BCFKSStoreParameter bCFKSStoreParameter = (BCFKSStoreParameter) keyStore$LoadStoreParameter;
            char[] cArrA = a(keyStore$LoadStoreParameter);
            this.n = a(bCFKSStoreParameter.b());
            engineStore(bCFKSStoreParameter.a(), cArrA);
            return;
        }
        if (!(keyStore$LoadStoreParameter instanceof BCFKSLoadStoreParameter)) {
            if (!(keyStore$LoadStoreParameter instanceof BCLoadStoreParameter)) {
                throw new IllegalArgumentException("no support for 'parameter' of type " + keyStore$LoadStoreParameter.getClass().getName());
            }
            engineStore(((BCLoadStoreParameter) keyStore$LoadStoreParameter).h(), a(keyStore$LoadStoreParameter));
            return;
        }
        BCFKSLoadStoreParameter bCFKSLoadStoreParameter = (BCFKSLoadStoreParameter) keyStore$LoadStoreParameter;
        if (bCFKSLoadStoreParameter.e() == null) {
            char[] cArrA2 = a((KeyStore$LoadStoreParameter) bCFKSLoadStoreParameter);
            this.n = a(bCFKSLoadStoreParameter.a());
            if (bCFKSLoadStoreParameter.b() == BCFKSLoadStoreParameter$EncryptionAlgorithm.a) {
                this.r = b.P;
            } else {
                this.r = b.Q;
            }
            if (bCFKSLoadStoreParameter.c() == BCFKSLoadStoreParameter$MacAlgorithm.a) {
                this.m = new a(n.O, bc.a);
            } else {
                this.m = new a(b.r, bc.a);
            }
            engineStore(bCFKSLoadStoreParameter.h(), cArrA2);
            return;
        }
        this.o = a(bCFKSLoadStoreParameter.e(), bCFKSLoadStoreParameter.d());
        this.n = a(bCFKSLoadStoreParameter.a());
        if (bCFKSLoadStoreParameter.b() == BCFKSLoadStoreParameter$EncryptionAlgorithm.a) {
            this.r = b.P;
        } else {
            this.r = b.Q;
        }
        if (bCFKSLoadStoreParameter.c() == BCFKSLoadStoreParameter$MacAlgorithm.a) {
            this.m = new a(n.O, bc.a);
        } else {
            this.m = new a(b.r, bc.a);
        }
        org.bouncycastle.a.b.b bVarA = a(this.o, a((KeyStore$LoadStoreParameter) bCFKSLoadStoreParameter));
        try {
            Signature signatureF = this.j.f(this.o.a().b());
            signatureF.initSign((PrivateKey) bCFKSLoadStoreParameter.e());
            signatureF.update(bVarA.k());
            X509Certificate[] x509CertificateArrF = bCFKSLoadStoreParameter.f();
            if (x509CertificateArrF != null) {
                g[] gVarArr = new g[x509CertificateArrF.length];
                for (int i2 = 0; i2 != gVarArr.length; i2++) {
                    gVarArr[i2] = g.a(x509CertificateArrF[i2].getEncoded());
                }
                lVar = new l(this.o, gVarArr, signatureF.sign());
            } else {
                lVar = new l(this.o, signatureF.sign());
            }
            bCFKSLoadStoreParameter.h().write(new org.bouncycastle.a.b.g(bVarA, new i(lVar)).k());
            bCFKSLoadStoreParameter.h().flush();
        } catch (GeneralSecurityException e2) {
            throw new IOException("error creating signature: " + e2.getMessage(), e2);
        }
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) {
        e eVar = this.k.get(str);
        if (eVar == null) {
            return null;
        }
        if (!eVar.e().equals(f) && !eVar.e().equals(h)) {
            if (!eVar.e().equals(g) && !eVar.e().equals(i)) {
                throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover secret key (" + str + "): type not recognized");
            }
            d dVarA = d.a(eVar.b());
            try {
                org.bouncycastle.a.b.k kVarA = org.bouncycastle.a.b.k.a(a("SECRET_KEY_ENCRYPTION", dVarA.a(), cArr, dVarA.b()));
                return this.j.e(kVarA.b().b()).generateSecret(new SecretKeySpec(kVarA.a(), kVarA.b().b()));
            } catch (Exception e2) {
                throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover secret key (" + str + "): " + e2.getMessage());
            }
        }
        PrivateKey privateKey = this.l.get(str);
        if (privateKey != null) {
            return privateKey;
        }
        org.bouncycastle.a.s.f fVarA = org.bouncycastle.a.s.f.a(c.a(eVar.b()).b());
        try {
            org.bouncycastle.a.s.p pVarA = org.bouncycastle.a.s.p.a(a("PRIVATE_KEY_ENCRYPTION", fVarA.a(), cArr, fVarA.b()));
            JcaJceHelper jcaJceHelper = this.j;
            p pVarA2 = pVarA.b().a();
            String strB = b.get(pVarA2);
            if (strB == null) {
                strB = pVarA2.b();
            }
            PrivateKey privateKeyGeneratePrivate = jcaJceHelper.d(strB).generatePrivate(new PKCS8EncodedKeySpec(pVarA.k()));
            this.l.put(str, privateKeyGeneratePrivate);
            return privateKeyGeneratePrivate;
        } catch (Exception e3) {
            throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover private key (" + str + "): " + e3.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void engineLoad(java.security.KeyStore$LoadStoreParameter r7) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.engineLoad(java.security.KeyStore$LoadStoreParameter):void");
    }

    private static h a(org.bouncycastle.b.o.e eVar) {
        if (!org.bouncycastle.a.n.c.L.equals(eVar.d())) {
            org.bouncycastle.b.o.d dVar = (org.bouncycastle.b.o.d) eVar;
            byte[] bArr = new byte[dVar.c()];
            org.bouncycastle.b.l.a().nextBytes(bArr);
            return new h(n.B, new org.bouncycastle.a.s.l(bArr, dVar.a(), 64, dVar.b()));
        }
        org.bouncycastle.b.o.i iVar = (org.bouncycastle.b.o.i) eVar;
        byte[] bArr2 = new byte[iVar.e()];
        org.bouncycastle.b.l.a().nextBytes(bArr2);
        return new h(org.bouncycastle.a.n.c.L, new org.bouncycastle.a.n.f(bArr2, iVar.a(), iVar.b(), iVar.c()));
    }

    private static h a(h hVar, int i2) {
        if (org.bouncycastle.a.n.c.L.equals(hVar.a())) {
            org.bouncycastle.a.n.f fVarA = org.bouncycastle.a.n.f.a(hVar.b());
            byte[] bArr = new byte[fVarA.a().length];
            org.bouncycastle.b.l.a().nextBytes(bArr);
            return new h(org.bouncycastle.a.n.c.L, new org.bouncycastle.a.n.f(bArr, fVarA.b(), fVarA.c(), fVarA.d(), BigInteger.valueOf(i2)));
        }
        org.bouncycastle.a.s.l lVarA = org.bouncycastle.a.s.l.a(hVar.b());
        byte[] bArr2 = new byte[lVarA.a().length];
        org.bouncycastle.b.l.a().nextBytes(bArr2);
        return new h(n.B, new org.bouncycastle.a.s.l(bArr2, lVarA.b().intValue(), i2, lVarA.e()));
    }

    private static h a(p pVar, int i2) {
        byte[] bArr = new byte[64];
        org.bouncycastle.b.l.a().nextBytes(bArr);
        if (n.B.equals(pVar)) {
            return new h(n.B, new org.bouncycastle.a.s.l(bArr, 51200, i2, new a(n.O, bc.a)));
        }
        throw new IllegalStateException("unknown derivation algorithm: ".concat(String.valueOf(pVar)));
    }
}
