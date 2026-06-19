package org.p044b.p045a.p046a.p049c;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: org.b.a.a.c.a */
/* JADX INFO: compiled from: ChunkedOutputStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0481a extends FilterOutputStream {
    public C0481a(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i2 != 0) {
            this.out.write(String.format("%x\r\n", Integer.valueOf(i2)).getBytes());
            this.out.write(bArr, i, i2);
            this.out.write("\r\n".getBytes());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1298a() throws IOException {
        this.out.write("0\r\n\r\n".getBytes());
    }
}
