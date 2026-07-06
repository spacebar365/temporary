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
import java.security.KeyStore$LoadStoreParameter;
import java.security.KeyStore$PasswordProtection;
import java.security.KeyStore$ProtectionParameter;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
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
import org.bouncycastle.a.ah;
import org.bouncycastle.a.ak;
import org.bouncycastle.a.at;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.be;
import org.bouncycastle.a.bg;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.bk;
import org.bouncycastle.a.f;
import org.bouncycastle.a.f.c;
import org.bouncycastle.a.g;
import org.bouncycastle.a.p;
import org.bouncycastle.a.q;
import org.bouncycastle.a.r.b;
import org.bouncycastle.a.s.e;
import org.bouncycastle.a.s.i;
import org.bouncycastle.a.s.k;
import org.bouncycastle.a.s.m;
import org.bouncycastle.a.s.n;
import org.bouncycastle.a.s.o;
import org.bouncycastle.a.s.v;
import org.bouncycastle.a.u;
import org.bouncycastle.a.x;
import org.bouncycastle.a.z.a;
import org.bouncycastle.a.z.aa;
import org.bouncycastle.a.z.j;
import org.bouncycastle.a.z.t;
import org.bouncycastle.b.b.s;
import org.bouncycastle.b.l;
import org.bouncycastle.c.b.d;
import org.bouncycastle.f.h;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.PKCS12StoreParameter;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.jcajce.spec.PBKDF2KeySpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* JADX INFO: loaded from: classes.dex */
public class PKCS12KeyStoreSpi extends KeyStoreSpi implements n, aa {
    private static final PKCS12KeyStoreSpi$DefaultSecretKeyProvider bQ = new PKCS12KeyStoreSpi$DefaultSecretKeyProvider();
    private CertificateFactory bW;
    private p bX;
    private p bY;
    private final JcaJceHelper bP = new BCJcaJceHelper();
    private PKCS12KeyStoreSpi$IgnoresCaseHashtable bR = new PKCS12KeyStoreSpi$IgnoresCaseHashtable((byte) 0);
    private Hashtable bS = new Hashtable();
    private PKCS12KeyStoreSpi$IgnoresCaseHashtable bT = new PKCS12KeyStoreSpi$IgnoresCaseHashtable((byte) 0);
    private Hashtable bU = new Hashtable();
    private Hashtable bV = new Hashtable();
    protected SecureRandom bO = l.a();
    private a bZ = new a(b.i, bc.a);
    private int ca = 102400;
    private int cb = 20;

    public PKCS12KeyStoreSpi(JcaJceHelper jcaJceHelper, p pVar, p pVar2) {
        this.bX = pVar;
        this.bY = pVar2;
        try {
            this.bW = jcaJceHelper.g("X.509");
        } catch (Exception e) {
            throw new IllegalArgumentException("can't create cert factory - " + e.toString());
        }
    }

    private static int a(BigInteger bigInteger) {
        int iIntValue = bigInteger.intValue();
        if (iIntValue < 0) {
            throw new IllegalStateException("negative iteration count found");
        }
        BigInteger bigIntegerB = h.b("org.bouncycastle.pkcs12.max_it_count");
        if (bigIntegerB == null || bigIntegerB.intValue() >= iIntValue) {
            return iIntValue;
        }
        throw new IllegalStateException("iteration count " + iIntValue + " greater than " + bigIntegerB.intValue());
    }

    private PrivateKey a(a aVar, byte[] bArr, char[] cArr, boolean z) throws IOException {
        p pVarA = aVar.a();
        try {
            if (!pVarA.a(n.bC)) {
                if (pVarA.equals(n.A)) {
                    return (PrivateKey) a(4, cArr, aVar).unwrap(bArr, "", 2);
                }
                throw new IOException("exception unwrapping private key - cannot recognise: ".concat(String.valueOf(pVarA)));
            }
            m mVarA = m.a(aVar.b());
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(mVarA.b(), a(mVarA.a()));
            Cipher cipherA = this.bP.a(pVarA.b());
            cipherA.init(4, new PKCS12Key(cArr, z), pBEParameterSpec);
            return (PrivateKey) cipherA.unwrap(bArr, "", 2);
        } catch (Exception e) {
            throw new IOException("exception unwrapping private key - " + e.toString());
        }
    }

    private Set a() {
        HashSet hashSet = new HashSet();
        Enumeration enumerationA = this.bR.a();
        while (enumerationA.hasMoreElements()) {
            Certificate[] certificateArrEngineGetCertificateChain = engineGetCertificateChain((String) enumerationA.nextElement());
            for (int i = 0; i != certificateArrEngineGetCertificateChain.length; i++) {
                hashSet.add(certificateArrEngineGetCertificateChain[i]);
            }
        }
        Enumeration enumerationA2 = this.bT.a();
        while (enumerationA2.hasMoreElements()) {
            hashSet.add(engineGetCertificate((String) enumerationA2.nextElement()));
        }
        return hashSet;
    }

    private Cipher a(int i, char[] cArr, a aVar) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        k kVarA = k.a(aVar.b());
        org.bouncycastle.a.s.l lVarA = org.bouncycastle.a.s.l.a(kVarA.a().b());
        a aVarA = a.a(kVarA.b());
        SecretKeyFactory secretKeyFactoryE = this.bP.e(kVarA.a().a().b());
        SecretKey secretKeyGenerateSecret = lVarA.d() ? secretKeyFactoryE.generateSecret(new PBEKeySpec(cArr, lVarA.a(), a(lVarA.b()), bQ.a(aVarA))) : secretKeyFactoryE.generateSecret(new PBKDF2KeySpec(cArr, lVarA.a(), a(lVarA.b()), bQ.a(aVarA), lVarA.e()));
        Cipher cipher = Cipher.getInstance(kVarA.b().a().b());
        f fVarB = kVarA.b().b();
        if (fVarB instanceof q) {
            cipher.init(i, secretKeyGenerateSecret, new IvParameterSpec(q.a(fVarB).c()));
        } else {
            c cVarA = c.a(fVarB);
            cipher.init(i, secretKeyGenerateSecret, new GOST28147ParameterSpec(cVarA.a(), cVarA.b()));
        }
        return cipher;
    }

    static /* synthetic */ t a(PublicKey publicKey) {
        return b(publicKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(OutputStream outputStream, char[] cArr, boolean z) throws IOException {
        boolean z2;
        boolean z3;
        if (cArr == null) {
            throw new NullPointerException("No password supplied for PKCS#12 KeyStore.");
        }
        g gVar = new g();
        Enumeration enumerationA = this.bR.a();
        while (enumerationA.hasMoreElements()) {
            byte[] bArr = new byte[20];
            this.bO.nextBytes(bArr);
            String str = (String) enumerationA.nextElement();
            PrivateKey privateKey = (PrivateKey) this.bR.b(str);
            m mVar = new m(bArr, 51200);
            org.bouncycastle.a.s.f fVar = new org.bouncycastle.a.s.f(new a(this.bX, mVar.i()), a(this.bX.b(), privateKey, mVar, cArr));
            g gVar2 = new g();
            if (privateKey instanceof org.bouncycastle.c.a.n) {
                org.bouncycastle.c.a.n nVar = (org.bouncycastle.c.a.n) privateKey;
                at atVar = (at) nVar.a(ak);
                if (atVar == null || !atVar.b().equals(str)) {
                    nVar.a(ak, new at(str));
                }
                if (nVar.a(al) == null) {
                    nVar.a(al, b(engineGetCertificate(str).getPublicKey()));
                }
                Enumeration enumerationB = nVar.b();
                z3 = false;
                while (enumerationB.hasMoreElements()) {
                    p pVar = (p) enumerationB.nextElement();
                    g gVar3 = new g();
                    gVar3.a(pVar);
                    gVar3.a(new bk(nVar.a(pVar)));
                    z3 = true;
                    gVar2.a(new bi(gVar3));
                }
            } else {
                z3 = false;
            }
            if (!z3) {
                g gVar4 = new g();
                Certificate certificateEngineGetCertificate = engineGetCertificate(str);
                gVar4.a(al);
                gVar4.a(new bk(b(certificateEngineGetCertificate.getPublicKey())));
                gVar2.a(new bi(gVar4));
                g gVar5 = new g();
                gVar5.a(ak);
                gVar5.a(new bk(new at(str)));
                gVar2.a(new bi(gVar5));
            }
            gVar.a(new v(bx, fVar.i(), new bk(gVar2)));
        }
        ah ahVar = new ah(new bi(gVar).a("DER"));
        byte[] bArr2 = new byte[20];
        this.bO.nextBytes(bArr2);
        g gVar6 = new g();
        a aVar = new a(this.bY, new m(bArr2, 51200).i());
        Hashtable hashtable = new Hashtable();
        Enumeration enumerationA2 = this.bR.a();
        while (enumerationA2.hasMoreElements()) {
            try {
                String str2 = (String) enumerationA2.nextElement();
                Certificate certificateEngineGetCertificate2 = engineGetCertificate(str2);
                org.bouncycastle.a.s.b bVar = new org.bouncycastle.a.s.b(ao, new be(certificateEngineGetCertificate2.getEncoded()));
                g gVar7 = new g();
                if (certificateEngineGetCertificate2 instanceof org.bouncycastle.c.a.n) {
                    org.bouncycastle.c.a.n nVar2 = (org.bouncycastle.c.a.n) certificateEngineGetCertificate2;
                    at atVar2 = (at) nVar2.a(ak);
                    if (atVar2 == null || !atVar2.b().equals(str2)) {
                        nVar2.a(ak, new at(str2));
                    }
                    if (nVar2.a(al) == null) {
                        nVar2.a(al, b(certificateEngineGetCertificate2.getPublicKey()));
                    }
                    Enumeration enumerationB2 = nVar2.b();
                    z2 = false;
                    while (enumerationB2.hasMoreElements()) {
                        p pVar2 = (p) enumerationB2.nextElement();
                        g gVar8 = new g();
                        gVar8.a(pVar2);
                        gVar8.a(new bk(nVar2.a(pVar2)));
                        gVar7.a(new bi(gVar8));
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
                if (!z2) {
                    g gVar9 = new g();
                    gVar9.a(al);
                    gVar9.a(new bk(b(certificateEngineGetCertificate2.getPublicKey())));
                    gVar7.a(new bi(gVar9));
                    g gVar10 = new g();
                    gVar10.a(ak);
                    gVar10.a(new bk(new at(str2)));
                    gVar7.a(new bi(gVar10));
                }
                gVar6.a(new v(by, bVar.i(), new bk(gVar7)));
                hashtable.put(certificateEngineGetCertificate2, certificateEngineGetCertificate2);
            } catch (CertificateEncodingException e) {
                throw new IOException("Error encoding certificate: " + e.toString());
            }
        }
        Enumeration enumerationA3 = this.bT.a();
        while (enumerationA3.hasMoreElements()) {
            try {
                String str3 = (String) enumerationA3.nextElement();
                Certificate certificate = (Certificate) this.bT.b(str3);
                boolean z4 = false;
                if (this.bR.b(str3) == null) {
                    org.bouncycastle.a.s.b bVar2 = new org.bouncycastle.a.s.b(ao, new be(certificate.getEncoded()));
                    g gVar11 = new g();
                    if (certificate instanceof org.bouncycastle.c.a.n) {
                        org.bouncycastle.c.a.n nVar3 = (org.bouncycastle.c.a.n) certificate;
                        at atVar3 = (at) nVar3.a(ak);
                        if (atVar3 == null || !atVar3.b().equals(str3)) {
                            nVar3.a(ak, new at(str3));
                        }
                        Enumeration enumerationB3 = nVar3.b();
                        while (enumerationB3.hasMoreElements()) {
                            p pVar3 = (p) enumerationB3.nextElement();
                            if (!pVar3.equals(n.al)) {
                                g gVar12 = new g();
                                gVar12.a(pVar3);
                                gVar12.a(new bk(nVar3.a(pVar3)));
                                gVar11.a(new bi(gVar12));
                                z4 = true;
                            }
                        }
                    }
                    if (!z4) {
                        g gVar13 = new g();
                        gVar13.a(ak);
                        gVar13.a(new bk(new at(str3)));
                        gVar11.a(new bi(gVar13));
                    }
                    gVar6.a(new v(by, bVar2.i(), new bk(gVar11)));
                    hashtable.put(certificate, certificate);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException("Error encoding certificate: " + e2.toString());
            }
        }
        Set setA = a();
        Enumeration enumerationKeys = this.bU.keys();
        while (enumerationKeys.hasMoreElements()) {
            try {
                Certificate certificate2 = (Certificate) this.bU.get((PKCS12KeyStoreSpi$CertId) enumerationKeys.nextElement());
                if (setA.contains(certificate2) && hashtable.get(certificate2) == null) {
                    org.bouncycastle.a.s.b bVar3 = new org.bouncycastle.a.s.b(ao, new be(certificate2.getEncoded()));
                    g gVar14 = new g();
                    if (certificate2 instanceof org.bouncycastle.c.a.n) {
                        org.bouncycastle.c.a.n nVar4 = (org.bouncycastle.c.a.n) certificate2;
                        Enumeration enumerationB4 = nVar4.b();
                        while (enumerationB4.hasMoreElements()) {
                            p pVar4 = (p) enumerationB4.nextElement();
                            if (!pVar4.equals(n.al)) {
                                g gVar15 = new g();
                                gVar15.a(pVar4);
                                gVar15.a(new bk(nVar4.a(pVar4)));
                                gVar14.a(new bi(gVar15));
                            }
                        }
                    }
                    gVar6.a(new v(by, bVar3.i(), new bk(gVar14)));
                }
            } catch (CertificateEncodingException e3) {
                throw new IOException("Error encoding certificate: " + e3.toString());
            }
        }
        org.bouncycastle.a.s.a aVar2 = new org.bouncycastle.a.s.a(new org.bouncycastle.a.s.c[]{new org.bouncycastle.a.s.c(Q, ahVar), new org.bouncycastle.a.s.c(V, new e(Q, aVar, new ah(a(true, aVar, cArr, false, new bi(gVar6).a("DER")))).i())});
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        (z ? new bg(byteArrayOutputStream) : new ak(byteArrayOutputStream)).a(aVar2);
        org.bouncycastle.a.s.c cVar = new org.bouncycastle.a.s.c(Q, new ah(byteArrayOutputStream.toByteArray()));
        byte[] bArr3 = new byte[this.cb];
        this.bO.nextBytes(bArr3);
        try {
            (z ? new bg(outputStream) : new ak(outputStream)).a(new o(cVar, new i(new j(this.bZ, a(this.bZ.a(), bArr3, this.ca, cArr, false, ((q) cVar.b()).c())), bArr3, this.ca)));
        } catch (Exception e4) {
            throw new IOException("error constructing MAC: " + e4.toString());
        }
    }

    private byte[] a(String str, Key key, m mVar, char[] cArr) throws IOException {
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
        try {
            SecretKeyFactory secretKeyFactoryE = this.bP.e(str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(mVar.b(), mVar.a().intValue());
            Cipher cipherA = this.bP.a(str);
            cipherA.init(3, secretKeyFactoryE.generateSecret(pBEKeySpec), pBEParameterSpec);
            return cipherA.wrap(key);
        } catch (Exception e) {
            throw new IOException("exception encrypting data - " + e.toString());
        }
    }

    private byte[] a(p pVar, byte[] bArr, int i, char[] cArr, boolean z, byte[] bArr2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i);
        Mac macB = this.bP.b(pVar.b());
        macB.init(new PKCS12Key(cArr, z), pBEParameterSpec);
        macB.update(bArr2);
        return macB.doFinal();
    }

    private byte[] a(boolean z, a aVar, char[] cArr, boolean z2, byte[] bArr) throws IOException {
        p pVarA = aVar.a();
        int i = z ? 1 : 2;
        if (!pVarA.a(n.bC)) {
            if (!pVarA.equals(n.A)) {
                throw new IOException("unknown PBE algorithm: ".concat(String.valueOf(pVarA)));
            }
            try {
                return a(i, cArr, aVar).doFinal(bArr);
            } catch (Exception e) {
                throw new IOException("exception decrypting data - " + e.toString());
            }
        }
        m mVarA = m.a(aVar.b());
        try {
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(mVarA.b(), mVarA.a().intValue());
            PKCS12Key pKCS12Key = new PKCS12Key(cArr, z2);
            Cipher cipherA = this.bP.a(pVarA.b());
            cipherA.init(i, pKCS12Key, pBEParameterSpec);
            return cipherA.doFinal(bArr);
        } catch (Exception e2) {
            throw new IOException("exception decrypting data - " + e2.toString());
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        Hashtable hashtable = new Hashtable();
        Enumeration enumerationA = this.bT.a();
        while (enumerationA.hasMoreElements()) {
            hashtable.put(enumerationA.nextElement(), "cert");
        }
        Enumeration enumerationA2 = this.bR.a();
        while (enumerationA2.hasMoreElements()) {
            String str = (String) enumerationA2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.keys();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        return (this.bT.b(str) == null && this.bR.b(str) == null) ? false : true;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) {
        Key key = (Key) this.bR.a(str);
        Certificate certificate = (Certificate) this.bT.a(str);
        if (certificate != null) {
            this.bU.remove(new PKCS12KeyStoreSpi$CertId(this, certificate.getPublicKey()));
        }
        if (key != null) {
            String str2 = (String) this.bS.remove(str);
            Certificate certificate2 = str2 != null ? (Certificate) this.bV.remove(str2) : certificate;
            if (certificate2 != null) {
                this.bU.remove(new PKCS12KeyStoreSpi$CertId(this, certificate2.getPublicKey()));
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null alias passed to getCertificate.");
        }
        Certificate certificate = (Certificate) this.bT.b(str);
        if (certificate != null) {
            return certificate;
        }
        String str2 = (String) this.bS.get(str);
        return str2 != null ? (Certificate) this.bV.get(str2) : (Certificate) this.bV.get(str);
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        Enumeration enumerationB = this.bT.b();
        Enumeration enumerationA = this.bT.a();
        while (enumerationB.hasMoreElements()) {
            Certificate certificate2 = (Certificate) enumerationB.nextElement();
            String str = (String) enumerationA.nextElement();
            if (certificate2.equals(certificate)) {
                return str;
            }
        }
        Enumeration enumerationElements = this.bV.elements();
        Enumeration enumerationKeys = this.bV.keys();
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
        if (this.bR.b(str) == null && this.bT.b(str) == null) {
            return null;
        }
        return new Date();
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) {
        if (str == null) {
            throw new IllegalArgumentException("null alias passed to getKey.");
        }
        return (Key) this.bR.b(str);
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        return this.bT.b(str) != null && this.bR.b(str) == null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        return this.bR.b(str) != null;
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
        String strB;
        q qVar;
        boolean z2;
        q qVar2;
        u uVar;
        boolean z3;
        String str;
        u uVar2;
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
            o oVarA = o.a(new org.bouncycastle.a.l(bufferedInputStream).b());
            org.bouncycastle.a.s.c cVarA = oVarA.a();
            Vector vector = new Vector();
            boolean z5 = false;
            if (oVarA.b() != null) {
                i iVarB = oVarA.b();
                j jVarA = iVarB.a();
                this.bZ = jVarA.a();
                byte[] bArrB = iVarB.b();
                this.ca = a(iVarB.c());
                this.cb = bArrB.length;
                byte[] bArrC = ((q) cVarA.b()).c();
                try {
                    byte[] bArrA = a(this.bZ.a(), bArrB, this.ca, cArr, false, bArrC);
                    byte[] bArrB2 = jVarA.b();
                    if (org.bouncycastle.f.a.b(bArrA, bArrB2)) {
                        z4 = false;
                    } else {
                        if (cArr.length > 0) {
                            throw new IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
                        }
                        if (!org.bouncycastle.f.a.b(a(this.bZ.a(), bArrB, this.ca, cArr, true, bArrC), bArrB2)) {
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
            this.bR = new PKCS12KeyStoreSpi$IgnoresCaseHashtable((byte) 0);
            this.bS = new Hashtable();
            if (cVarA.a().equals(Q)) {
                org.bouncycastle.a.s.c[] cVarArrA = org.bouncycastle.a.s.a.a(new org.bouncycastle.a.l(((q) cVarA.b()).c()).b()).a();
                int i = 0;
                while (i != cVarArrA.length) {
                    if (cVarArrA[i].a().equals(Q)) {
                        org.bouncycastle.a.v vVar = (org.bouncycastle.a.v) new org.bouncycastle.a.l(((q) cVarArrA[i].b()).c()).b();
                        int i2 = 0;
                        z2 = z5;
                        while (i2 != vVar.d()) {
                            v vVarA = v.a(vVar.a(i2));
                            if (vVarA.a().equals(bx)) {
                                org.bouncycastle.a.s.f fVarA = org.bouncycastle.a.s.f.a(vVarA.b());
                                PrivateKey privateKeyA = a(fVarA.a(), fVarA.b(), cArr, z);
                                q qVar3 = null;
                                if (vVarA.c() != null) {
                                    Enumeration enumerationB = vVarA.c().b();
                                    str = null;
                                    while (enumerationB.hasMoreElements()) {
                                        org.bouncycastle.a.v vVar2 = (org.bouncycastle.a.v) enumerationB.nextElement();
                                        p pVar = (p) vVar2.a(0);
                                        x xVar = (x) vVar2.a(1);
                                        if (xVar.c() > 0) {
                                            uVar2 = (u) xVar.a(0);
                                            if (privateKeyA instanceof org.bouncycastle.c.a.n) {
                                                org.bouncycastle.c.a.n nVar = (org.bouncycastle.c.a.n) privateKeyA;
                                                f fVarA2 = nVar.a(pVar);
                                                if (fVarA2 == null) {
                                                    nVar.a(pVar, uVar2);
                                                } else if (!fVarA2.i().equals(uVar2)) {
                                                    throw new IOException("attempt to add existing attribute with different value");
                                                }
                                            }
                                        } else {
                                            uVar2 = null;
                                        }
                                        if (pVar.equals(ak)) {
                                            String strB2 = ((at) uVar2).b();
                                            this.bR.a(strB2, privateKeyA);
                                            str = strB2;
                                        } else {
                                            qVar3 = pVar.equals(al) ? (q) uVar2 : qVar3;
                                        }
                                    }
                                } else {
                                    str = null;
                                }
                                if (qVar3 != null) {
                                    String str2 = new String(org.bouncycastle.f.a.f.b(qVar3.c()));
                                    if (str == null) {
                                        this.bR.a(str2, privateKeyA);
                                        z3 = z2;
                                    } else {
                                        this.bS.put(str, str2);
                                        z3 = z2;
                                    }
                                } else {
                                    z3 = true;
                                    this.bR.a("unmarked", privateKeyA);
                                }
                            } else if (vVarA.a().equals(by)) {
                                vector.addElement(vVarA);
                                z3 = z2;
                            } else {
                                System.out.println("extra in data " + vVarA.a());
                                System.out.println(org.bouncycastle.a.x.a.a(vVarA));
                                z3 = z2;
                            }
                            i2++;
                            z2 = z3;
                        }
                    } else if (cVarArrA[i].a().equals(V)) {
                        e eVarA = e.a(cVarArrA[i].b());
                        org.bouncycastle.a.v vVar3 = (org.bouncycastle.a.v) u.b(a(false, eVarA.a(), cArr, z, eVarA.b().c()));
                        int i3 = 0;
                        while (true) {
                            int i4 = i3;
                            if (i4 == vVar3.d()) {
                                z2 = z5;
                                break;
                            }
                            v vVarA2 = v.a(vVar3.a(i4));
                            if (vVarA2.a().equals(by)) {
                                vector.addElement(vVarA2);
                            } else if (vVarA2.a().equals(bx)) {
                                org.bouncycastle.a.s.f fVarA3 = org.bouncycastle.a.s.f.a(vVarA2.b());
                                PrivateKey privateKeyA2 = a(fVarA3.a(), fVarA3.b(), cArr, z);
                                org.bouncycastle.c.a.n nVar2 = (org.bouncycastle.c.a.n) privateKeyA2;
                                q qVar4 = null;
                                Enumeration enumerationB2 = vVarA2.c().b();
                                String str3 = null;
                                while (enumerationB2.hasMoreElements()) {
                                    org.bouncycastle.a.v vVar4 = (org.bouncycastle.a.v) enumerationB2.nextElement();
                                    p pVar2 = (p) vVar4.a(0);
                                    x xVar2 = (x) vVar4.a(1);
                                    if (xVar2.c() > 0) {
                                        uVar = (u) xVar2.a(0);
                                        f fVarA4 = nVar2.a(pVar2);
                                        if (fVarA4 == null) {
                                            nVar2.a(pVar2, uVar);
                                        } else if (!fVarA4.i().equals(uVar)) {
                                            throw new IOException("attempt to add existing attribute with different value");
                                        }
                                    } else {
                                        uVar = null;
                                    }
                                    if (pVar2.equals(ak)) {
                                        String strB3 = ((at) uVar).b();
                                        this.bR.a(strB3, privateKeyA2);
                                        str3 = strB3;
                                    } else {
                                        qVar4 = pVar2.equals(al) ? (q) uVar : qVar4;
                                    }
                                }
                                String str4 = new String(org.bouncycastle.f.a.f.b(qVar4.c()));
                                if (str3 == null) {
                                    this.bR.a(str4, privateKeyA2);
                                } else {
                                    this.bS.put(str3, str4);
                                }
                            } else if (vVarA2.a().equals(bw)) {
                                PrivateKey privateKeyA3 = org.bouncycastle.c.b.a.a(org.bouncycastle.a.s.p.a(vVarA2.b()));
                                org.bouncycastle.c.a.n nVar3 = (org.bouncycastle.c.a.n) privateKeyA3;
                                q qVar5 = null;
                                Enumeration enumerationB3 = vVarA2.c().b();
                                String str5 = null;
                                while (enumerationB3.hasMoreElements()) {
                                    org.bouncycastle.a.v vVarA3 = org.bouncycastle.a.v.a(enumerationB3.nextElement());
                                    p pVarA = p.a(vVarA3.a(0));
                                    x xVarA = x.a((Object) vVarA3.a(1));
                                    if (xVarA.c() > 0) {
                                        u uVar3 = (u) xVarA.a(0);
                                        f fVarA5 = nVar3.a(pVarA);
                                        if (fVarA5 == null) {
                                            nVar3.a(pVarA, uVar3);
                                        } else if (!fVarA5.i().equals(uVar3)) {
                                            throw new IOException("attempt to add existing attribute with different value");
                                        }
                                        if (pVarA.equals(ak)) {
                                            String strB4 = ((at) uVar3).b();
                                            this.bR.a(strB4, privateKeyA3);
                                            str5 = strB4;
                                        } else {
                                            if (pVarA.equals(al)) {
                                                qVar2 = (q) uVar3;
                                            }
                                            qVar5 = qVar2;
                                        }
                                    }
                                    qVar2 = qVar5;
                                    qVar5 = qVar2;
                                }
                                String str6 = new String(org.bouncycastle.f.a.f.b(qVar5.c()));
                                if (str5 == null) {
                                    this.bR.a(str6, privateKeyA3);
                                } else {
                                    this.bS.put(str5, str6);
                                }
                            } else {
                                System.out.println("extra in encryptedData " + vVarA2.a());
                                System.out.println(org.bouncycastle.a.x.a.a(vVarA2));
                            }
                            i3 = i4 + 1;
                        }
                    } else {
                        System.out.println("extra " + cVarArrA[i].a().b());
                        System.out.println("extra " + org.bouncycastle.a.x.a.a(cVarArrA[i].b()));
                        z2 = z5;
                    }
                    i++;
                    z5 = z2;
                }
            }
            this.bT = new PKCS12KeyStoreSpi$IgnoresCaseHashtable((byte) 0);
            this.bU = new Hashtable();
            this.bV = new Hashtable();
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 == vector.size()) {
                    return;
                }
                v vVar5 = (v) vector.elementAt(i6);
                org.bouncycastle.a.s.b bVarA = org.bouncycastle.a.s.b.a(vVar5.b());
                if (!bVarA.a().equals(ao)) {
                    throw new RuntimeException("Unsupported certificate type: " + bVarA.a());
                }
                try {
                    Certificate certificateGenerateCertificate = this.bW.generateCertificate(new ByteArrayInputStream(((q) bVarA.b()).c()));
                    q qVar6 = null;
                    if (vVar5.c() != null) {
                        Enumeration enumerationB4 = vVar5.c().b();
                        strB = null;
                        while (enumerationB4.hasMoreElements()) {
                            org.bouncycastle.a.v vVarA4 = org.bouncycastle.a.v.a(enumerationB4.nextElement());
                            p pVarA2 = p.a(vVarA4.a(0));
                            x xVarA2 = x.a((Object) vVarA4.a(1));
                            if (xVarA2.c() > 0) {
                                u uVar4 = (u) xVarA2.a(0);
                                if (certificateGenerateCertificate instanceof org.bouncycastle.c.a.n) {
                                    org.bouncycastle.c.a.n nVar4 = (org.bouncycastle.c.a.n) certificateGenerateCertificate;
                                    f fVarA6 = nVar4.a(pVarA2);
                                    if (fVarA6 == null) {
                                        nVar4.a(pVarA2, uVar4);
                                    } else if (!fVarA6.i().equals(uVar4)) {
                                        throw new IOException("attempt to add existing attribute with different value");
                                    }
                                }
                                if (pVarA2.equals(ak)) {
                                    strB = ((at) uVar4).b();
                                } else {
                                    if (pVarA2.equals(al)) {
                                        qVar = (q) uVar4;
                                    }
                                    qVar6 = qVar;
                                }
                            }
                            qVar = qVar6;
                            qVar6 = qVar;
                        }
                    } else {
                        strB = null;
                    }
                    this.bU.put(new PKCS12KeyStoreSpi$CertId(this, certificateGenerateCertificate.getPublicKey()), certificateGenerateCertificate);
                    if (!z5) {
                        if (qVar6 != null) {
                            this.bV.put(new String(org.bouncycastle.f.a.f.b(qVar6.c())), certificateGenerateCertificate);
                        }
                        if (strB != null) {
                            this.bT.a(strB, certificateGenerateCertificate);
                        }
                    } else if (this.bV.isEmpty()) {
                        String str7 = new String(org.bouncycastle.f.a.f.b(b(certificateGenerateCertificate.getPublicKey()).a()));
                        this.bV.put(str7, certificateGenerateCertificate);
                        this.bR.a(str7, this.bR.a("unmarked"));
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
        if (this.bR.b(str) != null) {
            throw new KeyStoreException("There is a key entry with the name " + str + ".");
        }
        this.bT.a(str, certificate);
        this.bU.put(new PKCS12KeyStoreSpi$CertId(this, certificate.getPublicKey()), certificate);
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        if (!(key instanceof PrivateKey)) {
            throw new KeyStoreException("PKCS12 does not support non-PrivateKeys");
        }
        if ((key instanceof PrivateKey) && certificateArr == null) {
            throw new KeyStoreException("no certificate chain for private key");
        }
        if (this.bR.b(str) != null) {
            engineDeleteEntry(str);
        }
        this.bR.a(str, key);
        if (certificateArr != null) {
            this.bT.a(str, certificateArr[0]);
            for (int i = 0; i != certificateArr.length; i++) {
                this.bU.put(new PKCS12KeyStoreSpi$CertId(this, certificateArr[i].getPublicKey()), certificateArr[i]);
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
        Enumeration enumerationA = this.bT.a();
        while (enumerationA.hasMoreElements()) {
            hashtable.put(enumerationA.nextElement(), "cert");
        }
        Enumeration enumerationA2 = this.bR.a();
        while (enumerationA2.hasMoreElements()) {
            String str = (String) enumerationA2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
        a(outputStream, cArr, false);
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore$LoadStoreParameter keyStore$LoadStoreParameter) throws IOException {
        char[] password;
        if (keyStore$LoadStoreParameter == null) {
            throw new IllegalArgumentException("'param' arg cannot be null");
        }
        if (!(keyStore$LoadStoreParameter instanceof PKCS12StoreParameter) && !(keyStore$LoadStoreParameter instanceof d)) {
            throw new IllegalArgumentException("No support for 'param' of type " + keyStore$LoadStoreParameter.getClass().getName());
        }
        PKCS12StoreParameter pKCS12StoreParameter = keyStore$LoadStoreParameter instanceof PKCS12StoreParameter ? (PKCS12StoreParameter) keyStore$LoadStoreParameter : new PKCS12StoreParameter(((d) keyStore$LoadStoreParameter).a(), keyStore$LoadStoreParameter.getProtectionParameter(), ((d) keyStore$LoadStoreParameter).b());
        KeyStore$ProtectionParameter protectionParameter = keyStore$LoadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            password = null;
        } else {
            if (!(protectionParameter instanceof KeyStore$PasswordProtection)) {
                throw new IllegalArgumentException("No support for protection parameter of type " + protectionParameter.getClass().getName());
            }
            password = ((KeyStore$PasswordProtection) protectionParameter).getPassword();
        }
        a(pKCS12StoreParameter.a(), password, pKCS12StoreParameter.b());
    }

    private static t b(PublicKey publicKey) {
        try {
            org.bouncycastle.a.z.u uVarA = org.bouncycastle.a.z.u.a(publicKey.getEncoded());
            s sVar = new s();
            byte[] bArr = new byte[sVar.b()];
            byte[] bArrD = uVarA.c().d();
            sVar.a(bArrD, 0, bArrD.length);
            sVar.a(bArr, 0);
            return new t(bArr);
        } catch (Exception e) {
            throw new RuntimeException("error creating key");
        }
    }
}
