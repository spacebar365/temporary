package org.bouncycastle.a;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
final class cc extends cf {
    private int b;
    private int c;
    private boolean d;
    private boolean e;

    cc(InputStream inputStream, int i) throws EOFException {
        super(inputStream, i);
        this.d = false;
        this.e = true;
        this.b = inputStream.read();
        this.c = inputStream.read();
        if (this.c < 0) {
            throw new EOFException();
        }
        b();
    }

    private boolean b() {
        if (!this.d && this.e && this.b == 0 && this.c == 0) {
            this.d = true;
            c();
        }
        return this.d;
    }

    final void a(boolean z) {
        this.e = z;
        b();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (b()) {
            return -1;
        }
        int i = this.a.read();
        if (i < 0) {
            throw new EOFException();
        }
        int i2 = this.b;
        this.b = this.c;
        this.c = i;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.e || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.d) {
            return -1;
        }
        int i3 = this.a.read(bArr, i + 2, i2 - 2);
        if (i3 < 0) {
            throw new EOFException();
        }
        bArr[i] = (byte) this.b;
        bArr[i + 1] = (byte) this.c;
        this.b = this.a.read();
        this.c = this.a.read();
        if (this.c < 0) {
            throw new EOFException();
        }
        return i3 + 2;
    }
}
