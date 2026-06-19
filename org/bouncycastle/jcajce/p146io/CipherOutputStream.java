package org.bouncycastle.jcajce.p146io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import org.bouncycastle.p083b.p091g.C0984d;

/* JADX INFO: loaded from: classes.dex */
public class CipherOutputStream extends FilterOutputStream {

    /* JADX INFO: renamed from: a */
    private final Cipher f5580a;

    /* JADX INFO: renamed from: b */
    private final byte[] f5581b;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IOException iOException = null;
        try {
            byte[] bArrDoFinal = this.f5580a.doFinal();
            if (bArrDoFinal != null) {
                this.out.write(bArrDoFinal);
            }
        } catch (GeneralSecurityException e) {
            iOException = new C0984d("Error during cipher finalisation", e);
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
        this.f5581b[0] = (byte) i;
        write(this.f5581b, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArrUpdate = this.f5580a.update(bArr, i, i2);
        if (bArrUpdate != null) {
            this.out.write(bArrUpdate);
        }
    }
}
