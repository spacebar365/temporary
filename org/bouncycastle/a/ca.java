package org.bouncycastle.a;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
final class ca extends cf {
    private static final byte[] b = new byte[0];
    private final int c;
    private int d;

    ca(InputStream inputStream, int i) {
        super(inputStream, i);
        if (i < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this.c = i;
        this.d = i;
        if (i == 0) {
            c();
        }
    }

    @Override // org.bouncycastle.a.cf
    final int a() {
        return this.d;
    }

    final byte[] b() throws EOFException {
        if (this.d == 0) {
            return b;
        }
        byte[] bArr = new byte[this.d];
        int iA = this.d - org.bouncycastle.f.b.a.a(this.a, bArr);
        this.d = iA;
        if (iA != 0) {
            throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
        }
        c();
        return bArr;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.d == 0) {
            return -1;
        }
        int i = this.a.read();
        if (i < 0) {
            throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
        }
        int i2 = this.d - 1;
        this.d = i2;
        if (i2 != 0) {
            return i;
        }
        c();
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.d == 0) {
            return -1;
        }
        int i3 = this.a.read(bArr, i, Math.min(i2, this.d));
        if (i3 < 0) {
            throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
        }
        int i4 = this.d - i3;
        this.d = i4;
        if (i4 != 0) {
            return i3;
        }
        c();
        return i3;
    }
}
