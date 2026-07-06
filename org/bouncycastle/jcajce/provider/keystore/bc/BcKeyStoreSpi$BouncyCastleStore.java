package org.bouncycastle.jcajce.provider.keystore.bc;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import org.bouncycastle.b.b.s;
import org.bouncycastle.b.g.b;
import org.bouncycastle.b.g.c;
import org.bouncycastle.f.b.a;

/* JADX INFO: loaded from: classes.dex */
public class BcKeyStoreSpi$BouncyCastleStore extends BcKeyStoreSpi {
    public BcKeyStoreSpi$BouncyCastleStore() {
        super(1);
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi, java.security.KeyStoreSpi
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
        byte[] bArr = new byte[dataInputStream.readInt()];
        if (bArr.length != 20) {
            throw new IOException("Key store corrupted.");
        }
        dataInputStream.readFully(bArr);
        int i2 = dataInputStream.readInt();
        if (i2 < 0 || i2 > 65536) {
            throw new IOException("Key store corrupted.");
        }
        CipherInputStream cipherInputStream = new CipherInputStream(dataInputStream, a(i == 0 ? "OldPBEWithSHAAndTwofish-CBC" : "PBEWithSHAAndTwofish-CBC", 2, cArr, bArr, i2));
        s sVar = new s();
        a(new b(cipherInputStream, sVar));
        byte[] bArr2 = new byte[sVar.b()];
        sVar.a(bArr2, 0);
        byte[] bArr3 = new byte[sVar.b()];
        a.a(cipherInputStream, bArr3);
        if (org.bouncycastle.f.a.b(bArr2, bArr3)) {
            return;
        }
        this.a.clear();
        throw new IOException("KeyStore integrity check failed.");
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi, java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        byte[] bArr = new byte[20];
        int iNextInt = (this.b.nextInt() & 1023) + 1024;
        this.b.nextBytes(bArr);
        dataOutputStream.writeInt(this.c);
        dataOutputStream.writeInt(20);
        dataOutputStream.write(bArr);
        dataOutputStream.writeInt(iNextInt);
        CipherOutputStream cipherOutputStream = new CipherOutputStream(dataOutputStream, a("PBEWithSHAAndTwofish-CBC", 1, cArr, bArr, iNextInt));
        c cVar = new c(new s());
        a(new org.bouncycastle.f.b.b(cipherOutputStream, cVar));
        cipherOutputStream.write(cVar.a());
        cipherOutputStream.close();
    }
}
