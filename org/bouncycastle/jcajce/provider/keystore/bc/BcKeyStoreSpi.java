package org.bouncycastle.jcajce.provider.keystore.bc;

import java.io.ByteArrayInputStream;
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
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.ad;
import org.bouncycastle.b.b.s;
import org.bouncycastle.b.f.v;
import org.bouncycastle.b.g.e;
import org.bouncycastle.b.g.f;
import org.bouncycastle.b.h.g;
import org.bouncycastle.b.i;
import org.bouncycastle.b.l;
import org.bouncycastle.c.b.a;
import org.bouncycastle.f.b.b;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* JADX INFO: loaded from: classes.dex */
public class BcKeyStoreSpi extends KeyStoreSpi {
    protected int c;
    protected Hashtable a = new Hashtable();
    protected SecureRandom b = l.a();
    private final JcaJceHelper d = new BCJcaJceHelper();

    public BcKeyStoreSpi(int i) {
        this.c = i;
    }

    static /* synthetic */ Key a(BcKeyStoreSpi bcKeyStoreSpi, DataInputStream dataInputStream) {
        return bcKeyStoreSpi.b(dataInputStream);
    }

    private Certificate a(DataInputStream dataInputStream) throws IOException {
        String utf = dataInputStream.readUTF();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        try {
            return this.d.g(utf).generateCertificate(new ByteArrayInputStream(bArr));
        } catch (NoSuchProviderException e) {
            throw new IOException(e.toString());
        } catch (CertificateException e2) {
            throw new IOException(e2.toString());
        }
    }

    static /* synthetic */ void a(Key key, DataOutputStream dataOutputStream) {
        b(key, dataOutputStream);
    }

    private static void a(Certificate certificate, DataOutputStream dataOutputStream) throws IOException {
        try {
            byte[] encoded = certificate.getEncoded();
            dataOutputStream.writeUTF(certificate.getType());
            dataOutputStream.writeInt(encoded.length);
            dataOutputStream.write(encoded);
        } catch (CertificateEncodingException e) {
            throw new IOException(e.toString());
        }
    }

    private Key b(DataInputStream dataInputStream) throws IOException {
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
                    return a.a(p.a(bArr));
                case 1:
                    return a.a(u.a(bArr));
                case 2:
                    return this.d.e(utf2).generateSecret(pKCS8EncodedKeySpec);
                default:
                    throw new IOException("Key type " + i + " not recognised!");
            }
        } catch (Exception e) {
            throw new IOException("Exception creating key: " + e.toString());
        }
    }

    private static void b(Key key, DataOutputStream dataOutputStream) throws IOException {
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

    protected final Cipher a(String str, int i, char[] cArr, byte[] bArr, int i2) throws IOException {
        try {
            PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
            SecretKeyFactory secretKeyFactoryE = this.d.e(str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i2);
            Cipher cipherA = this.d.a(str);
            cipherA.init(i, secretKeyFactoryE.generateSecret(pBEKeySpec), pBEParameterSpec);
            return cipherA;
        } catch (Exception e) {
            throw new IOException("Error initialising store of key store: ".concat(String.valueOf(e)));
        }
    }

    protected final void a(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        for (int i = dataInputStream.read(); i > 0; i = dataInputStream.read()) {
            String utf = dataInputStream.readUTF();
            Date date = new Date(dataInputStream.readLong());
            int i2 = dataInputStream.readInt();
            Certificate[] certificateArr = null;
            if (i2 != 0) {
                certificateArr = new Certificate[i2];
                for (int i3 = 0; i3 != i2; i3++) {
                    certificateArr[i3] = a(dataInputStream);
                }
            }
            switch (i) {
                case 1:
                    this.a.put(utf, new BcKeyStoreSpi$StoreEntry(this, utf, date, a(dataInputStream)));
                    break;
                case 2:
                    this.a.put(utf, new BcKeyStoreSpi$StoreEntry(this, utf, date, 2, b(dataInputStream), certificateArr));
                    break;
                case 3:
                case 4:
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    dataInputStream.readFully(bArr);
                    this.a.put(utf, new BcKeyStoreSpi$StoreEntry(this, utf, date, i, bArr, certificateArr));
                    break;
                default:
                    throw new IOException("Unknown object type in store.");
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        return this.a.keys();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        return this.a.get(str) != null;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) {
        if (this.a.get(str) == null) {
            return;
        }
        this.a.remove(str);
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
        this.a.clear();
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
        g gVar = new g(new s());
        if (cArr == null || cArr.length == 0) {
            a((InputStream) dataInputStream);
            dataInputStream.readFully(new byte[gVar.b()]);
            return;
        }
        byte[] bArrC = ad.c(cArr);
        v vVar = new v(new s());
        vVar.a(bArrC, bArr, i3);
        i iVarB = i != 2 ? vVar.b(gVar.b()) : vVar.b(gVar.b() * 8);
        org.bouncycastle.f.a.a(bArrC, (byte) 0);
        gVar.a(iVarB);
        a(new e(dataInputStream, gVar));
        byte[] bArr2 = new byte[gVar.b()];
        gVar.a(bArr2, 0);
        byte[] bArr3 = new byte[gVar.b()];
        dataInputStream.readFully(bArr3);
        if (org.bouncycastle.f.a.b(bArr2, bArr3)) {
            return;
        }
        this.a.clear();
        throw new IOException("KeyStore integrity check failed.");
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        if ((key instanceof PrivateKey) && certificateArr == null) {
            throw new KeyStoreException("no certificate chain for private key");
        }
        try {
            this.a.put(str, new BcKeyStoreSpi$StoreEntry(this, str, key, cArr, certificateArr));
        } catch (Exception e) {
            throw new KeyStoreException(e.toString());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        this.a.put(str, new BcKeyStoreSpi$StoreEntry(this, str, bArr, certificateArr));
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.a.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        byte[] bArr = new byte[20];
        int iNextInt = (this.b.nextInt() & 1023) + 1024;
        this.b.nextBytes(bArr);
        dataOutputStream.writeInt(this.c);
        dataOutputStream.writeInt(20);
        dataOutputStream.write(bArr);
        dataOutputStream.writeInt(iNextInt);
        g gVar = new g(new s());
        f fVar = new f(gVar);
        v vVar = new v(new s());
        byte[] bArrC = ad.c(cArr);
        vVar.a(bArrC, bArr, iNextInt);
        if (this.c < 2) {
            gVar.a(vVar.b(gVar.b()));
        } else {
            gVar.a(vVar.b(gVar.b() * 8));
        }
        for (int i = 0; i != bArrC.length; i++) {
            bArrC[i] = 0;
        }
        a(new b(dataOutputStream, fVar));
        byte[] bArr2 = new byte[gVar.b()];
        gVar.a(bArr2, 0);
        dataOutputStream.write(bArr2);
        dataOutputStream.close();
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        BcKeyStoreSpi$StoreEntry bcKeyStoreSpi$StoreEntry = (BcKeyStoreSpi$StoreEntry) this.a.get(str);
        if (bcKeyStoreSpi$StoreEntry != null) {
            if (bcKeyStoreSpi$StoreEntry.a == 1) {
                return (Certificate) bcKeyStoreSpi$StoreEntry.c;
            }
            Certificate[] certificateArr = bcKeyStoreSpi$StoreEntry.d;
            if (certificateArr != null) {
                return certificateArr[0];
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        Enumeration enumerationElements = this.a.elements();
        while (enumerationElements.hasMoreElements()) {
            BcKeyStoreSpi$StoreEntry bcKeyStoreSpi$StoreEntry = (BcKeyStoreSpi$StoreEntry) enumerationElements.nextElement();
            if (!(bcKeyStoreSpi$StoreEntry.c instanceof Certificate)) {
                Certificate[] certificateArr = bcKeyStoreSpi$StoreEntry.d;
                if (certificateArr != null && certificateArr[0].equals(certificate)) {
                    return bcKeyStoreSpi$StoreEntry.b;
                }
            } else if (((Certificate) bcKeyStoreSpi$StoreEntry.c).equals(certificate)) {
                return bcKeyStoreSpi$StoreEntry.b;
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        BcKeyStoreSpi$StoreEntry bcKeyStoreSpi$StoreEntry = (BcKeyStoreSpi$StoreEntry) this.a.get(str);
        if (bcKeyStoreSpi$StoreEntry != null) {
            return bcKeyStoreSpi$StoreEntry.d;
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        BcKeyStoreSpi$StoreEntry bcKeyStoreSpi$StoreEntry = (BcKeyStoreSpi$StoreEntry) this.a.get(str);
        if (bcKeyStoreSpi$StoreEntry != null) {
            return bcKeyStoreSpi$StoreEntry.e;
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) {
        BcKeyStoreSpi$StoreEntry bcKeyStoreSpi$StoreEntry = (BcKeyStoreSpi$StoreEntry) this.a.get(str);
        if (bcKeyStoreSpi$StoreEntry == null || bcKeyStoreSpi$StoreEntry.a == 1) {
            return null;
        }
        return (Key) bcKeyStoreSpi$StoreEntry.a(cArr);
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        BcKeyStoreSpi$StoreEntry bcKeyStoreSpi$StoreEntry = (BcKeyStoreSpi$StoreEntry) this.a.get(str);
        return bcKeyStoreSpi$StoreEntry != null && bcKeyStoreSpi$StoreEntry.a == 1;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        BcKeyStoreSpi$StoreEntry bcKeyStoreSpi$StoreEntry = (BcKeyStoreSpi$StoreEntry) this.a.get(str);
        return (bcKeyStoreSpi$StoreEntry == null || bcKeyStoreSpi$StoreEntry.a == 1) ? false : true;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        BcKeyStoreSpi$StoreEntry bcKeyStoreSpi$StoreEntry = (BcKeyStoreSpi$StoreEntry) this.a.get(str);
        if (bcKeyStoreSpi$StoreEntry != null && bcKeyStoreSpi$StoreEntry.a != 1) {
            throw new KeyStoreException("key store already has a key entry with alias ".concat(String.valueOf(str)));
        }
        this.a.put(str, new BcKeyStoreSpi$StoreEntry(this, str, certificate));
    }

    protected final void a(OutputStream outputStream) throws IOException {
        Enumeration enumerationElements = this.a.elements();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        while (enumerationElements.hasMoreElements()) {
            BcKeyStoreSpi$StoreEntry bcKeyStoreSpi$StoreEntry = (BcKeyStoreSpi$StoreEntry) enumerationElements.nextElement();
            dataOutputStream.write(bcKeyStoreSpi$StoreEntry.a);
            dataOutputStream.writeUTF(bcKeyStoreSpi$StoreEntry.b);
            dataOutputStream.writeLong(bcKeyStoreSpi$StoreEntry.e.getTime());
            Certificate[] certificateArr = bcKeyStoreSpi$StoreEntry.d;
            if (certificateArr == null) {
                dataOutputStream.writeInt(0);
            } else {
                dataOutputStream.writeInt(certificateArr.length);
                for (int i = 0; i != certificateArr.length; i++) {
                    a(certificateArr[i], dataOutputStream);
                }
            }
            switch (bcKeyStoreSpi$StoreEntry.a) {
                case 1:
                    a((Certificate) bcKeyStoreSpi$StoreEntry.c, dataOutputStream);
                    break;
                case 2:
                    b((Key) bcKeyStoreSpi$StoreEntry.c, dataOutputStream);
                    break;
                case 3:
                case 4:
                    byte[] bArr = (byte[]) bcKeyStoreSpi$StoreEntry.c;
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
