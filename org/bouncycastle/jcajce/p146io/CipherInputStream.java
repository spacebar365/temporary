package org.bouncycastle.jcajce.p146io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import org.bouncycastle.p083b.p091g.C0984d;

/* JADX INFO: loaded from: classes.dex */
public class CipherInputStream extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    private final Cipher f5574a;

    /* JADX INFO: renamed from: b */
    private final byte[] f5575b;

    /* JADX INFO: renamed from: c */
    private boolean f5576c;

    /* JADX INFO: renamed from: d */
    private byte[] f5577d;

    /* JADX INFO: renamed from: e */
    private int f5578e;

    /* JADX INFO: renamed from: f */
    private int f5579f;

    /* JADX INFO: renamed from: a */
    private int m4185a() throws IOException {
        if (this.f5576c) {
            return -1;
        }
        this.f5579f = 0;
        this.f5578e = 0;
        while (this.f5578e == 0) {
            int i = this.in.read(this.f5575b);
            if (i == -1) {
                this.f5577d = m4186b();
                if (this.f5577d == null || this.f5577d.length == 0) {
                    return -1;
                }
                this.f5578e = this.f5577d.length;
                return this.f5578e;
            }
            this.f5577d = this.f5574a.update(this.f5575b, 0, i);
            if (this.f5577d != null) {
                this.f5578e = this.f5577d.length;
            }
        }
        return this.f5578e;
    }

    /* JADX INFO: renamed from: b */
    private byte[] m4186b() throws C0984d {
        try {
            this.f5576c = true;
            return this.f5574a.doFinal();
        } catch (GeneralSecurityException e) {
            throw new C0984d("Error finalising cipher", e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.f5578e - this.f5579f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws C0984d {
        try {
            this.in.close();
            this.f5579f = 0;
            this.f5578e = 0;
        } finally {
            if (!this.f5576c) {
                m4186b();
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
        if (this.f5579f >= this.f5578e && m4185a() < 0) {
            return -1;
        }
        byte[] bArr = this.f5577d;
        int i = this.f5579f;
        this.f5579f = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (this.f5579f >= this.f5578e && m4185a() < 0) {
            return -1;
        }
        int iMin = Math.min(i2, available());
        System.arraycopy(this.f5577d, this.f5579f, bArr, i, iMin);
        this.f5579f += iMin;
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
        this.f5579f += iMin;
        return iMin;
    }
}
