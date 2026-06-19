package org.bouncycastle.p054a;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.p142f.p144b.C1545a;

/* JADX INFO: renamed from: org.bouncycastle.a.ca */
/* JADX INFO: loaded from: classes.dex */
final class C0605ca extends AbstractC0610cf {

    /* JADX INFO: renamed from: b */
    private static final byte[] f2160b = new byte[0];

    /* JADX INFO: renamed from: c */
    private final int f2161c;

    /* JADX INFO: renamed from: d */
    private int f2162d;

    C0605ca(InputStream inputStream, int i) {
        super(inputStream, i);
        if (i < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this.f2161c = i;
        this.f2162d = i;
        if (i == 0) {
            m1485c();
        }
    }

    @Override // org.bouncycastle.p054a.AbstractC0610cf
    /* JADX INFO: renamed from: a */
    final int mo1476a() {
        return this.f2162d;
    }

    /* JADX INFO: renamed from: b */
    final byte[] m1477b() throws EOFException {
        if (this.f2162d == 0) {
            return f2160b;
        }
        byte[] bArr = new byte[this.f2162d];
        int iM4121a = this.f2162d - C1545a.m4121a(this.f2170a, bArr);
        this.f2162d = iM4121a;
        if (iM4121a != 0) {
            throw new EOFException("DEF length " + this.f2161c + " object truncated by " + this.f2162d);
        }
        m1485c();
        return bArr;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f2162d == 0) {
            return -1;
        }
        int i = this.f2170a.read();
        if (i < 0) {
            throw new EOFException("DEF length " + this.f2161c + " object truncated by " + this.f2162d);
        }
        int i2 = this.f2162d - 1;
        this.f2162d = i2;
        if (i2 != 0) {
            return i;
        }
        m1485c();
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f2162d == 0) {
            return -1;
        }
        int i3 = this.f2170a.read(bArr, i, Math.min(i2, this.f2162d));
        if (i3 < 0) {
            throw new EOFException("DEF length " + this.f2161c + " object truncated by " + this.f2162d);
        }
        int i4 = this.f2162d - i3;
        this.f2162d = i4;
        if (i4 != 0) {
            return i3;
        }
        m1485c();
        return i3;
    }
}
