package org.p037a.p038a.p039a.p042b;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: org.a.a.a.b.b */
/* JADX INFO: compiled from: FromNetASCIIInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0468b extends PushbackInputStream {

    /* JADX INFO: renamed from: a */
    static final boolean f1722a;

    /* JADX INFO: renamed from: b */
    static final String f1723b;

    /* JADX INFO: renamed from: c */
    static final byte[] f1724c;

    /* JADX INFO: renamed from: d */
    private int f1725d;

    static {
        String property = System.getProperty("line.separator");
        f1723b = property;
        f1722a = property.equals("\r\n");
        try {
            f1724c = f1723b.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Broken JVM - cannot find US-ASCII charset!", e);
        }
    }

    public C0468b(InputStream inputStream) {
        super(inputStream, f1724c.length + 1);
        this.f1725d = 0;
    }

    /* JADX INFO: renamed from: a */
    private int m1265a() throws IOException {
        int i = super.read();
        if (i == 13) {
            int i2 = super.read();
            if (i2 == 10) {
                unread(f1724c);
                this.f1725d--;
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
        return f1722a ? super.read() : m1265a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (f1722a) {
            return super.read(bArr, i, i2);
        }
        if (i2 <= 0) {
            return 0;
        }
        int iAvailable = available();
        if (i2 > iAvailable) {
            i2 = iAvailable;
        }
        this.f1725d = i2;
        if (this.f1725d <= 0) {
            this.f1725d = 1;
        }
        int iM1265a = m1265a();
        if (iM1265a == -1) {
            return -1;
        }
        int i4 = i;
        while (true) {
            i3 = i4 + 1;
            bArr[i4] = (byte) iM1265a;
            int i5 = this.f1725d - 1;
            this.f1725d = i5;
            if (i5 <= 0 || (iM1265a = m1265a()) == -1) {
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
