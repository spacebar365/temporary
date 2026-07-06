package org.bouncycastle.b.g;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.b.r;

/* JADX INFO: loaded from: classes.dex */
public final class b extends FilterInputStream {
    protected r a;

    public b(InputStream inputStream, r rVar) {
        super(inputStream);
        this.a = rVar;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = this.in.read();
        if (i >= 0) {
            this.a.a((byte) i);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.in.read(bArr, i, i2);
        if (i3 > 0) {
            this.a.a(bArr, i, i3);
        }
        return i3;
    }
}
