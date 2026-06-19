package org.bouncycastle.p054a;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: org.bouncycastle.a.cc */
/* JADX INFO: loaded from: classes.dex */
final class C0607cc extends AbstractC0610cf {

    /* JADX INFO: renamed from: b */
    private int f2163b;

    /* JADX INFO: renamed from: c */
    private int f2164c;

    /* JADX INFO: renamed from: d */
    private boolean f2165d;

    /* JADX INFO: renamed from: e */
    private boolean f2166e;

    C0607cc(InputStream inputStream, int i) throws EOFException {
        super(inputStream, i);
        this.f2165d = false;
        this.f2166e = true;
        this.f2163b = inputStream.read();
        this.f2164c = inputStream.read();
        if (this.f2164c < 0) {
            throw new EOFException();
        }
        m1478b();
    }

    /* JADX INFO: renamed from: b */
    private boolean m1478b() {
        if (!this.f2165d && this.f2166e && this.f2163b == 0 && this.f2164c == 0) {
            this.f2165d = true;
            m1485c();
        }
        return this.f2165d;
    }

    /* JADX INFO: renamed from: a */
    final void m1479a(boolean z) {
        this.f2166e = z;
        m1478b();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (m1478b()) {
            return -1;
        }
        int i = this.f2170a.read();
        if (i < 0) {
            throw new EOFException();
        }
        int i2 = this.f2163b;
        this.f2163b = this.f2164c;
        this.f2164c = i;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f2166e || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.f2165d) {
            return -1;
        }
        int i3 = this.f2170a.read(bArr, i + 2, i2 - 2);
        if (i3 < 0) {
            throw new EOFException();
        }
        bArr[i] = (byte) this.f2163b;
        bArr[i + 1] = (byte) this.f2164c;
        this.f2163b = this.f2170a.read();
        this.f2164c = this.f2170a.read();
        if (this.f2164c < 0) {
            throw new EOFException();
        }
        return i3 + 2;
    }
}
