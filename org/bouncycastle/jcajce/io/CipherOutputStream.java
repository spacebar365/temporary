package org.bouncycastle.jcajce.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import org.bouncycastle.b.g.d;

/* JADX INFO: loaded from: classes.dex */
public class CipherOutputStream extends FilterOutputStream {
    private final Cipher a;
    private final byte[] b;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IOException iOException = null;
        try {
            byte[] bArrDoFinal = this.a.doFinal();
            if (bArrDoFinal != null) {
                this.out.write(bArrDoFinal);
            }
        } catch (GeneralSecurityException e) {
            iOException = new d("Error during cipher finalisation", e);
        } catch (Exception e2) {
            iOException = new IOException("Error closing stream: ".concat(String.valueOf(e2)));
        }
        try {
            flush();
            this.out.close();
            e = iOException;
        } catch (IOException e3) {
            e = e3;
            if (iOException != null) {
                e = iOException;
            }
        }
        if (e != null) {
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        this.b[0] = (byte) i;
        write(this.b, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArrUpdate = this.a.update(bArr, i, i2);
        if (bArrUpdate != null) {
            this.out.write(bArrUpdate);
        }
    }
}
