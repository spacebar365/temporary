package org.bouncycastle.jcajce.p146io;

import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
class DigestUpdatingOutputStream extends OutputStream {

    /* JADX INFO: renamed from: a */
    private MessageDigest f5582a;

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f5582a.update((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f5582a.update(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.f5582a.update(bArr, i, i2);
    }
}
