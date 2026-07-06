package org.a.a.a.b;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: FromNetASCIIInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends PushbackInputStream {
    static final boolean a;
    static final String b;
    static final byte[] c;
    private int d;

    static {
        String property = System.getProperty("line.separator");
        b = property;
        a = property.equals("\r\n");
        try {
            c = b.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Broken JVM - cannot find US-ASCII charset!", e);
        }
    }

    public b(InputStream inputStream) {
        super(inputStream, c.length + 1);
        this.d = 0;
    }

    private int a() throws IOException {
        int i = super.read();
        if (i == 13) {
            int i2 = super.read();
            if (i2 == 10) {
                unread(c);
                this.d--;
                return super.read();
            }
            if (i2 != -1) {
                unread(i2);
            }
            return 13;
        }
        return i;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        return a ? super.read() : a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (a) {
            return super.read(bArr, i, i2);
        }
        if (i2 <= 0) {
            return 0;
        }
        int iAvailable = available();
        if (i2 > iAvailable) {
            i2 = iAvailable;
        }
        this.d = i2;
        if (this.d <= 0) {
            this.d = 1;
        }
        int iA = a();
        if (iA == -1) {
            return -1;
        }
        int i4 = i;
        while (true) {
            i3 = i4 + 1;
            bArr[i4] = (byte) iA;
            int i5 = this.d - 1;
            this.d = i5;
            if (i5 <= 0 || (iA = a()) == -1) {
                break;
            }
            i4 = i3;
        }
        return i3 - i;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        if (this.in == null) {
            throw new IOException("Stream closed");
        }
        return (this.buf.length - this.pos) + this.in.available();
    }
}
