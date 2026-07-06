package org.bouncycastle.b.g;

import java.io.OutputStream;
import org.bouncycastle.b.r;

/* JADX INFO: loaded from: classes.dex */
public final class c extends OutputStream {
    protected r a;

    public c(r rVar) {
        this.a = rVar;
    }

    public final byte[] a() {
        byte[] bArr = new byte[this.a.b()];
        this.a.a(bArr, 0);
        return bArr;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.a.a((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2);
    }
}
