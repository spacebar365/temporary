package org.bouncycastle.jcajce.io;

import java.io.OutputStream;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class MacOutputStream extends OutputStream {
    private Mac a;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.a.update((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.update(bArr, i, i2);
    }
}
