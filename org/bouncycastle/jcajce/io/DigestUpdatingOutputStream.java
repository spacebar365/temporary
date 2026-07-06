package org.bouncycastle.jcajce.io;

import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
class DigestUpdatingOutputStream extends OutputStream {
    private MessageDigest a;

    @Override // java.io.OutputStream
    public void write(int i) {
        this.a.update((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.a.update(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.a.update(bArr, i, i2);
    }
}
