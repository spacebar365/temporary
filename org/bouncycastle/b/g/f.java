package org.bouncycastle.b.g;

import java.io.OutputStream;
import org.bouncycastle.b.z;

/* JADX INFO: loaded from: classes.dex */
public final class f extends OutputStream {
    protected z a;

    public f(z zVar) {
        this.a = zVar;
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
