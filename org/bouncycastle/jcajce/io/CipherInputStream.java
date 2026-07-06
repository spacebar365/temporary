package org.bouncycastle.jcajce.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import org.bouncycastle.b.g.d;

/* JADX INFO: loaded from: classes.dex */
public class CipherInputStream extends FilterInputStream {
    private final Cipher a;
    private final byte[] b;
    private boolean c;
    private byte[] d;
    private int e;
    private int f;

    private int a() throws IOException {
        if (this.c) {
            return -1;
        }
        this.f = 0;
        this.e = 0;
        while (this.e == 0) {
            int i = this.in.read(this.b);
            if (i == -1) {
                this.d = b();
                if (this.d == null || this.d.length == 0) {
                    return -1;
                }
                this.e = this.d.length;
                return this.e;
            }
            this.d = this.a.update(this.b, 0, i);
            if (this.d != null) {
                this.e = this.d.length;
            }
        }
        return this.e;
    }

    private byte[] b() throws d {
        try {
            this.c = true;
            return this.a.doFinal();
        } catch (GeneralSecurityException e) {
            throw new d("Error finalising cipher", e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.e - this.f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws d {
        try {
            this.in.close();
            this.f = 0;
            this.e = 0;
        } finally {
            if (!this.c) {
                b();
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.f >= this.e && a() < 0) {
            return -1;
        }
        byte[] bArr = this.d;
        int i = this.f;
        this.f = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (this.f >= this.e && a() < 0) {
            return -1;
        }
        int iMin = Math.min(i2, available());
        System.arraycopy(this.d, this.f, bArr, i, iMin);
        this.f += iMin;
        return iMin;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        if (j <= 0) {
            return 0L;
        }
        int iMin = (int) Math.min(j, available());
        this.f += iMin;
        return iMin;
    }
}
