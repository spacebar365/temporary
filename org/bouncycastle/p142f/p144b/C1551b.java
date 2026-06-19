package org.bouncycastle.p142f.p144b;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: org.bouncycastle.f.b.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1551b extends OutputStream {

    /* JADX INFO: renamed from: a */
    private OutputStream f5508a;

    /* JADX INFO: renamed from: b */
    private OutputStream f5509b;

    public C1551b(OutputStream outputStream, OutputStream outputStream2) {
        this.f5508a = outputStream;
        this.f5509b = outputStream2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f5508a.close();
        this.f5509b.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f5508a.flush();
        this.f5509b.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f5508a.write(i);
        this.f5509b.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f5508a.write(bArr);
        this.f5509b.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f5508a.write(bArr, i, i2);
        this.f5509b.write(bArr, i, i2);
    }
}
