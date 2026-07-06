package org.bouncycastle.jcajce.provider.keystore.bc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.Key;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.util.Date;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class BcKeyStoreSpi$StoreEntry {
    int a;
    String b;
    Object c;
    Certificate[] d;
    Date e;
    final /* synthetic */ BcKeyStoreSpi f;

    BcKeyStoreSpi$StoreEntry(BcKeyStoreSpi bcKeyStoreSpi, String str, Key key, char[] cArr, Certificate[] certificateArr) throws IOException {
        this.f = bcKeyStoreSpi;
        this.e = new Date();
        this.a = 4;
        this.b = str;
        this.d = certificateArr;
        byte[] bArr = new byte[20];
        bcKeyStoreSpi.b.setSeed(System.currentTimeMillis());
        bcKeyStoreSpi.b.nextBytes(bArr);
        int iNextInt = (bcKeyStoreSpi.b.nextInt() & 1023) + 1024;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(20);
        dataOutputStream.write(bArr);
        dataOutputStream.writeInt(iNextInt);
        DataOutputStream dataOutputStream2 = new DataOutputStream(new CipherOutputStream(dataOutputStream, bcKeyStoreSpi.a("PBEWithSHAAnd3-KeyTripleDES-CBC", 1, cArr, bArr, iNextInt)));
        BcKeyStoreSpi.a(key, dataOutputStream2);
        dataOutputStream2.close();
        this.c = byteArrayOutputStream.toByteArray();
    }

    BcKeyStoreSpi$StoreEntry(BcKeyStoreSpi bcKeyStoreSpi, String str, Certificate certificate) {
        this.f = bcKeyStoreSpi;
        this.e = new Date();
        this.a = 1;
        this.b = str;
        this.c = certificate;
        this.d = null;
    }

    BcKeyStoreSpi$StoreEntry(BcKeyStoreSpi bcKeyStoreSpi, String str, Date date, int i, Object obj, Certificate[] certificateArr) {
        this.f = bcKeyStoreSpi;
        this.e = new Date();
        this.b = str;
        this.e = date;
        this.a = i;
        this.c = obj;
        this.d = certificateArr;
    }

    BcKeyStoreSpi$StoreEntry(BcKeyStoreSpi bcKeyStoreSpi, String str, Date date, Object obj) {
        this.f = bcKeyStoreSpi;
        this.e = new Date();
        this.b = str;
        this.e = date;
        this.a = 1;
        this.c = obj;
    }

    BcKeyStoreSpi$StoreEntry(BcKeyStoreSpi bcKeyStoreSpi, String str, byte[] bArr, Certificate[] certificateArr) {
        this.f = bcKeyStoreSpi;
        this.e = new Date();
        this.a = 3;
        this.b = str;
        this.c = bArr;
        this.d = certificateArr;
    }

    final Object a(char[] cArr) throws UnrecoverableKeyException {
        Key keyA;
        if ((cArr == null || cArr.length == 0) && (this.c instanceof Key)) {
            return this.c;
        }
        if (this.a != 4) {
            throw new RuntimeException("forget something!");
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) this.c));
        try {
            byte[] bArr = new byte[dataInputStream.readInt()];
            dataInputStream.readFully(bArr);
            try {
                return BcKeyStoreSpi.a(this.f, new DataInputStream(new CipherInputStream(dataInputStream, this.f.a("PBEWithSHAAnd3-KeyTripleDES-CBC", 2, cArr, bArr, dataInputStream.readInt()))));
            } catch (Exception e) {
                DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) this.c));
                byte[] bArr2 = new byte[dataInputStream2.readInt()];
                dataInputStream2.readFully(bArr2);
                int i = dataInputStream2.readInt();
                try {
                    keyA = BcKeyStoreSpi.a(this.f, new DataInputStream(new CipherInputStream(dataInputStream2, this.f.a("BrokenPBEWithSHAAnd3-KeyTripleDES-CBC", 2, cArr, bArr2, i))));
                } catch (Exception e2) {
                    DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) this.c));
                    bArr2 = new byte[dataInputStream3.readInt()];
                    dataInputStream3.readFully(bArr2);
                    i = dataInputStream3.readInt();
                    keyA = BcKeyStoreSpi.a(this.f, new DataInputStream(new CipherInputStream(dataInputStream3, this.f.a("OldPBEWithSHAAnd3-KeyTripleDES-CBC", 2, cArr, bArr2, i))));
                }
                if (keyA == null) {
                    throw new UnrecoverableKeyException("no match");
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeInt(bArr2.length);
                dataOutputStream.write(bArr2);
                dataOutputStream.writeInt(i);
                DataOutputStream dataOutputStream2 = new DataOutputStream(new CipherOutputStream(dataOutputStream, this.f.a("PBEWithSHAAnd3-KeyTripleDES-CBC", 1, cArr, bArr2, i)));
                BcKeyStoreSpi.a(keyA, dataOutputStream2);
                dataOutputStream2.close();
                this.c = byteArrayOutputStream.toByteArray();
                return keyA;
            }
        } catch (Exception e3) {
            throw new UnrecoverableKeyException("no match");
        }
    }
}
