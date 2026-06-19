package org.bouncycastle.jcajce.provider.keystore.p149bc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p083b.AbstractC0804ad;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p086b.C0842s;
import org.bouncycastle.p083b.p090f.C0975v;
import org.bouncycastle.p083b.p091g.C0982b;
import org.bouncycastle.p083b.p091g.C0983c;
import org.bouncycastle.p083b.p091g.C0985e;
import org.bouncycastle.p083b.p091g.C0986f;
import org.bouncycastle.p083b.p092h.C0994g;
import org.bouncycastle.p103c.p105b.C1200a;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.p144b.C1545a;
import org.bouncycastle.p142f.p144b.C1551b;

/* JADX INFO: loaded from: classes.dex */
public class BcKeyStoreSpi extends KeyStoreSpi {

    /* JADX INFO: renamed from: c */
    protected int f6014c;

    /* JADX INFO: renamed from: a */
    protected Hashtable f6012a = new Hashtable();

    /* JADX INFO: renamed from: b */
    protected SecureRandom f6013b = C1124l.m2709a();

    /* JADX INFO: renamed from: d */
    private final JcaJceHelper f6015d = new BCJcaJceHelper();

    public static class BouncyCastleStore extends BcKeyStoreSpi {
        public BouncyCastleStore() {
            super(1);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.p149bc.BcKeyStoreSpi, java.security.KeyStoreSpi
        public void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
            this.f6012a.clear();
            if (inputStream == null) {
                return;
            }
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            int i = dataInputStream.readInt();
            if (i != 2 && i != 0 && i != 1) {
                throw new IOException("Wrong version of key store.");
            }
            byte[] bArr = new byte[dataInputStream.readInt()];
            if (bArr.length != 20) {
                throw new IOException("Key store corrupted.");
            }
            dataInputStream.readFully(bArr);
            int i2 = dataInputStream.readInt();
            if (i2 < 0 || i2 > 65536) {
                throw new IOException("Key store corrupted.");
            }
            CipherInputStream cipherInputStream = new CipherInputStream(dataInputStream, m4394a(i == 0 ? "OldPBEWithSHAAndTwofish-CBC" : "PBEWithSHAAndTwofish-CBC", 2, cArr, bArr, i2));
            C0842s c0842s = new C0842s();
            m4395a(new C0982b(cipherInputStream, c0842s));
            byte[] bArr2 = new byte[c0842s.mo1930b()];
            c0842s.mo1926a(bArr2, 0);
            byte[] bArr3 = new byte[c0842s.mo1930b()];
            C1545a.m4121a(cipherInputStream, bArr3);
            if (C1535a.m4085b(bArr2, bArr3)) {
                return;
            }
            this.f6012a.clear();
            throw new IOException("KeyStore integrity check failed.");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.p149bc.BcKeyStoreSpi, java.security.KeyStoreSpi
        public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            byte[] bArr = new byte[20];
            int iNextInt = (this.f6013b.nextInt() & 1023) + 1024;
            this.f6013b.nextBytes(bArr);
            dataOutputStream.writeInt(this.f6014c);
            dataOutputStream.writeInt(20);
            dataOutputStream.write(bArr);
            dataOutputStream.writeInt(iNextInt);
            CipherOutputStream cipherOutputStream = new CipherOutputStream(dataOutputStream, m4394a("PBEWithSHAAndTwofish-CBC", 1, cArr, bArr, iNextInt));
            C0983c c0983c = new C0983c(new C0842s());
            m4396a(new C1551b(cipherOutputStream, c0983c));
            cipherOutputStream.write(c0983c.m2445a());
            cipherOutputStream.close();
        }
    }

    public static class Std extends BcKeyStoreSpi {
        public Std() {
            super(2);
        }
    }

    private class StoreEntry {

        /* JADX INFO: renamed from: a */
        int f6016a;

        /* JADX INFO: renamed from: b */
        String f6017b;

        /* JADX INFO: renamed from: c */
        Object f6018c;

        /* JADX INFO: renamed from: d */
        Certificate[] f6019d;

        /* JADX INFO: renamed from: e */
        Date f6020e;

        StoreEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws IOException {
            this.f6020e = new Date();
            this.f6016a = 4;
            this.f6017b = str;
            this.f6019d = certificateArr;
            byte[] bArr = new byte[20];
            BcKeyStoreSpi.this.f6013b.setSeed(System.currentTimeMillis());
            BcKeyStoreSpi.this.f6013b.nextBytes(bArr);
            int iNextInt = (BcKeyStoreSpi.this.f6013b.nextInt() & 1023) + 1024;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(20);
            dataOutputStream.write(bArr);
            dataOutputStream.writeInt(iNextInt);
            DataOutputStream dataOutputStream2 = new DataOutputStream(new CipherOutputStream(dataOutputStream, BcKeyStoreSpi.this.m4394a("PBEWithSHAAnd3-KeyTripleDES-CBC", 1, cArr, bArr, iNextInt)));
            BcKeyStoreSpi.m4393b(key, dataOutputStream2);
            dataOutputStream2.close();
            this.f6018c = byteArrayOutputStream.toByteArray();
        }

        StoreEntry(String str, Certificate certificate) {
            this.f6020e = new Date();
            this.f6016a = 1;
            this.f6017b = str;
            this.f6018c = certificate;
            this.f6019d = null;
        }

        StoreEntry(String str, Date date, int i, Object obj, Certificate[] certificateArr) {
            this.f6020e = new Date();
            this.f6017b = str;
            this.f6020e = date;
            this.f6016a = i;
            this.f6018c = obj;
            this.f6019d = certificateArr;
        }

        StoreEntry(String str, Date date, Object obj) {
            this.f6020e = new Date();
            this.f6017b = str;
            this.f6020e = date;
            this.f6016a = 1;
            this.f6018c = obj;
        }

        StoreEntry(String str, byte[] bArr, Certificate[] certificateArr) {
            this.f6020e = new Date();
            this.f6016a = 3;
            this.f6017b = str;
            this.f6018c = bArr;
            this.f6019d = certificateArr;
        }

        /* JADX INFO: renamed from: a */
        final Object m4397a(char[] cArr) throws UnrecoverableKeyException {
            Key keyM4392b;
            if ((cArr == null || cArr.length == 0) && (this.f6018c instanceof Key)) {
                return this.f6018c;
            }
            if (this.f6016a != 4) {
                throw new RuntimeException("forget something!");
            }
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) this.f6018c));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr);
                try {
                    return BcKeyStoreSpi.this.m4392b(new DataInputStream(new CipherInputStream(dataInputStream, BcKeyStoreSpi.this.m4394a("PBEWithSHAAnd3-KeyTripleDES-CBC", 2, cArr, bArr, dataInputStream.readInt()))));
                } catch (Exception e) {
                    DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) this.f6018c));
                    byte[] bArr2 = new byte[dataInputStream2.readInt()];
                    dataInputStream2.readFully(bArr2);
                    int i = dataInputStream2.readInt();
                    try {
                        keyM4392b = BcKeyStoreSpi.this.m4392b(new DataInputStream(new CipherInputStream(dataInputStream2, BcKeyStoreSpi.this.m4394a("BrokenPBEWithSHAAnd3-KeyTripleDES-CBC", 2, cArr, bArr2, i))));
                    } catch (Exception e2) {
                        DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) this.f6018c));
                        bArr2 = new byte[dataInputStream3.readInt()];
                        dataInputStream3.readFully(bArr2);
                        i = dataInputStream3.readInt();
                        keyM4392b = BcKeyStoreSpi.this.m4392b(new DataInputStream(new CipherInputStream(dataInputStream3, BcKeyStoreSpi.this.m4394a("OldPBEWithSHAAnd3-KeyTripleDES-CBC", 2, cArr, bArr2, i))));
                    }
                    if (keyM4392b == null) {
                        throw new UnrecoverableKeyException("no match");
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt(bArr2.length);
                    dataOutputStream.write(bArr2);
                    dataOutputStream.writeInt(i);
                    DataOutputStream dataOutputStream2 = new DataOutputStream(new CipherOutputStream(dataOutputStream, BcKeyStoreSpi.this.m4394a("PBEWithSHAAnd3-KeyTripleDES-CBC", 1, cArr, bArr2, i)));
                    BcKeyStoreSpi.m4393b(keyM4392b, dataOutputStream2);
                    dataOutputStream2.close();
                    this.f6018c = byteArrayOutputStream.toByteArray();
                    return keyM4392b;
                }
            } catch (Exception e3) {
                throw new UnrecoverableKeyException("no match");
            }
        }
    }

    public static class Version1 extends BcKeyStoreSpi {
        public Version1() {
            super(1);
        }
    }

    public BcKeyStoreSpi(int i) {
        this.f6014c = i;
    }

    /* JADX INFO: renamed from: a */
    private Certificate m4389a(DataInputStream dataInputStream) throws IOException {
        String utf = dataInputStream.readUTF();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        try {
            return this.f6015d.mo4526g(utf).generateCertificate(new ByteArrayInputStream(bArr));
        } catch (NoSuchProviderException e) {
            throw new IOException(e.toString());
        } catch (CertificateException e2) {
            throw new IOException(e2.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m4391a(Certificate certificate, DataOutputStream dataOutputStream) throws IOException {
        try {
            byte[] encoded = certificate.getEncoded();
            dataOutputStream.writeUTF(certificate.getType());
            dataOutputStream.writeInt(encoded.length);
            dataOutputStream.write(encoded);
        } catch (CertificateEncodingException e) {
            throw new IOException(e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public Key m4392b(DataInputStream dataInputStream) throws IOException {
        KeySpec pKCS8EncodedKeySpec;
        int i = dataInputStream.read();
        String utf = dataInputStream.readUTF();
        String utf2 = dataInputStream.readUTF();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        if (utf.equals("PKCS#8") || utf.equals("PKCS8")) {
            pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArr);
        } else {
            if (!utf.equals("X.509") && !utf.equals("X509")) {
                if (utf.equals("RAW")) {
                    return new SecretKeySpec(bArr, utf2);
                }
                throw new IOException("Key format " + utf + " not recognised!");
            }
            pKCS8EncodedKeySpec = new X509EncodedKeySpec(bArr);
        }
        try {
            switch (i) {
                case 0:
                    return C1200a.m2848a(C0676p.m1656a(bArr));
                case 1:
                    return C1200a.m2849a(C0780u.m1843a(bArr));
                case 2:
                    return this.f6015d.mo4524e(utf2).generateSecret(pKCS8EncodedKeySpec);
                default:
                    throw new IOException("Key type " + i + " not recognised!");
            }
        } catch (Exception e) {
            throw new IOException("Exception creating key: " + e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m4393b(Key key, DataOutputStream dataOutputStream) throws IOException {
        byte[] encoded = key.getEncoded();
        if (key instanceof PrivateKey) {
            dataOutputStream.write(0);
        } else if (key instanceof PublicKey) {
            dataOutputStream.write(1);
        } else {
            dataOutputStream.write(2);
        }
        dataOutputStream.writeUTF(key.getFormat());
        dataOutputStream.writeUTF(key.getAlgorithm());
        dataOutputStream.writeInt(encoded.length);
        dataOutputStream.write(encoded);
    }

    /* JADX INFO: renamed from: a */
    protected final Cipher m4394a(String str, int i, char[] cArr, byte[] bArr, int i2) throws IOException {
        try {
            PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
            SecretKeyFactory secretKeyFactoryMo4524e = this.f6015d.mo4524e(str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i2);
            Cipher cipherMo4520a = this.f6015d.mo4520a(str);
            cipherMo4520a.init(i, secretKeyFactoryMo4524e.generateSecret(pBEKeySpec), pBEParameterSpec);
            return cipherMo4520a;
        } catch (Exception e) {
            throw new IOException("Error initialising store of key store: ".concat(String.valueOf(e)));
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m4395a(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        for (int i = dataInputStream.read(); i > 0; i = dataInputStream.read()) {
            String utf = dataInputStream.readUTF();
            Date date = new Date(dataInputStream.readLong());
            int i2 = dataInputStream.readInt();
            Certificate[] certificateArr = null;
            if (i2 != 0) {
                certificateArr = new Certificate[i2];
                for (int i3 = 0; i3 != i2; i3++) {
                    certificateArr[i3] = m4389a(dataInputStream);
                }
            }
            switch (i) {
                case 1:
                    this.f6012a.put(utf, new StoreEntry(utf, date, m4389a(dataInputStream)));
                    break;
                case 2:
                    this.f6012a.put(utf, new StoreEntry(utf, date, 2, m4392b(dataInputStream), certificateArr));
                    break;
                case 3:
                case 4:
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    dataInputStream.readFully(bArr);
                    this.f6012a.put(utf, new StoreEntry(utf, date, i, bArr, certificateArr));
                    break;
                default:
                    throw new IOException("Unknown object type in store.");
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        return this.f6012a.keys();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        return this.f6012a.get(str) != null;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) {
        if (this.f6012a.get(str) == null) {
            return;
        }
        this.f6012a.remove(str);
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
        this.f6012a.clear();
        if (inputStream == null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        int i = dataInputStream.readInt();
        if (i != 2 && i != 0 && i != 1) {
            throw new IOException("Wrong version of key store.");
        }
        int i2 = dataInputStream.readInt();
        if (i2 <= 0) {
            throw new IOException("Invalid salt detected");
        }
        byte[] bArr = new byte[i2];
        dataInputStream.readFully(bArr);
        int i3 = dataInputStream.readInt();
        C0994g c0994g = new C0994g(new C0842s());
        if (cArr == null || cArr.length == 0) {
            m4395a((InputStream) dataInputStream);
            dataInputStream.readFully(new byte[c0994g.mo2451b()]);
            return;
        }
        byte[] bArrM1896c = AbstractC0804ad.m1896c(cArr);
        C0975v c0975v = new C0975v(new C0842s());
        c0975v.m1899a(bArrM1896c, bArr, i3);
        InterfaceC1003i interfaceC1003iMo1900b = i != 2 ? c0975v.mo1900b(c0994g.mo2451b()) : c0975v.mo1900b(c0994g.mo2451b() * 8);
        C1535a.m4071a(bArrM1896c, (byte) 0);
        c0994g.mo2449a(interfaceC1003iMo1900b);
        m4395a(new C0985e(dataInputStream, c0994g));
        byte[] bArr2 = new byte[c0994g.mo2451b()];
        c0994g.mo2446a(bArr2, 0);
        byte[] bArr3 = new byte[c0994g.mo2451b()];
        dataInputStream.readFully(bArr3);
        if (C1535a.m4085b(bArr2, bArr3)) {
            return;
        }
        this.f6012a.clear();
        throw new IOException("KeyStore integrity check failed.");
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        if ((key instanceof PrivateKey) && certificateArr == null) {
            throw new KeyStoreException("no certificate chain for private key");
        }
        try {
            this.f6012a.put(str, new StoreEntry(str, key, cArr, certificateArr));
        } catch (Exception e) {
            throw new KeyStoreException(e.toString());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        this.f6012a.put(str, new StoreEntry(str, bArr, certificateArr));
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.f6012a.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        byte[] bArr = new byte[20];
        int iNextInt = (this.f6013b.nextInt() & 1023) + 1024;
        this.f6013b.nextBytes(bArr);
        dataOutputStream.writeInt(this.f6014c);
        dataOutputStream.writeInt(20);
        dataOutputStream.write(bArr);
        dataOutputStream.writeInt(iNextInt);
        C0994g c0994g = new C0994g(new C0842s());
        C0986f c0986f = new C0986f(c0994g);
        C0975v c0975v = new C0975v(new C0842s());
        byte[] bArrM1896c = AbstractC0804ad.m1896c(cArr);
        c0975v.m1899a(bArrM1896c, bArr, iNextInt);
        if (this.f6014c < 2) {
            c0994g.mo2449a(c0975v.mo1900b(c0994g.mo2451b()));
        } else {
            c0994g.mo2449a(c0975v.mo1900b(c0994g.mo2451b() * 8));
        }
        for (int i = 0; i != bArrM1896c.length; i++) {
            bArrM1896c[i] = 0;
        }
        m4396a(new C1551b(dataOutputStream, c0986f));
        byte[] bArr2 = new byte[c0994g.mo2451b()];
        c0994g.mo2446a(bArr2, 0);
        dataOutputStream.write(bArr2);
        dataOutputStream.close();
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        StoreEntry storeEntry = (StoreEntry) this.f6012a.get(str);
        if (storeEntry != null) {
            if (storeEntry.f6016a == 1) {
                return (Certificate) storeEntry.f6018c;
            }
            Certificate[] certificateArr = storeEntry.f6019d;
            if (certificateArr != null) {
                return certificateArr[0];
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        Enumeration enumerationElements = this.f6012a.elements();
        while (enumerationElements.hasMoreElements()) {
            StoreEntry storeEntry = (StoreEntry) enumerationElements.nextElement();
            if (!(storeEntry.f6018c instanceof Certificate)) {
                Certificate[] certificateArr = storeEntry.f6019d;
                if (certificateArr != null && certificateArr[0].equals(certificate)) {
                    return storeEntry.f6017b;
                }
            } else if (((Certificate) storeEntry.f6018c).equals(certificate)) {
                return storeEntry.f6017b;
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        StoreEntry storeEntry = (StoreEntry) this.f6012a.get(str);
        if (storeEntry != null) {
            return storeEntry.f6019d;
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        StoreEntry storeEntry = (StoreEntry) this.f6012a.get(str);
        if (storeEntry != null) {
            return storeEntry.f6020e;
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) {
        StoreEntry storeEntry = (StoreEntry) this.f6012a.get(str);
        if (storeEntry == null || storeEntry.f6016a == 1) {
            return null;
        }
        return (Key) storeEntry.m4397a(cArr);
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        StoreEntry storeEntry = (StoreEntry) this.f6012a.get(str);
        return storeEntry != null && storeEntry.f6016a == 1;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        StoreEntry storeEntry = (StoreEntry) this.f6012a.get(str);
        return (storeEntry == null || storeEntry.f6016a == 1) ? false : true;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        StoreEntry storeEntry = (StoreEntry) this.f6012a.get(str);
        if (storeEntry != null && storeEntry.f6016a != 1) {
            throw new KeyStoreException("key store already has a key entry with alias ".concat(String.valueOf(str)));
        }
        this.f6012a.put(str, new StoreEntry(str, certificate));
    }

    /* JADX INFO: renamed from: a */
    protected final void m4396a(OutputStream outputStream) throws IOException {
        Enumeration enumerationElements = this.f6012a.elements();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        while (enumerationElements.hasMoreElements()) {
            StoreEntry storeEntry = (StoreEntry) enumerationElements.nextElement();
            dataOutputStream.write(storeEntry.f6016a);
            dataOutputStream.writeUTF(storeEntry.f6017b);
            dataOutputStream.writeLong(storeEntry.f6020e.getTime());
            Certificate[] certificateArr = storeEntry.f6019d;
            if (certificateArr == null) {
                dataOutputStream.writeInt(0);
            } else {
                dataOutputStream.writeInt(certificateArr.length);
                for (int i = 0; i != certificateArr.length; i++) {
                    m4391a(certificateArr[i], dataOutputStream);
                }
            }
            switch (storeEntry.f6016a) {
                case 1:
                    m4391a((Certificate) storeEntry.f6018c, dataOutputStream);
                    break;
                case 2:
                    m4393b((Key) storeEntry.f6018c, dataOutputStream);
                    break;
                case 3:
                case 4:
                    byte[] bArr = (byte[]) storeEntry.f6018c;
                    dataOutputStream.writeInt(bArr.length);
                    dataOutputStream.write(bArr);
                    break;
                default:
                    throw new IOException("Unknown object type in store.");
            }
        }
        dataOutputStream.write(0);
    }
}
