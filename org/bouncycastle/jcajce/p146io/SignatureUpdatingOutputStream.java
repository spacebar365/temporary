package org.bouncycastle.jcajce.p146io;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

/* JADX INFO: loaded from: classes.dex */
class SignatureUpdatingOutputStream extends OutputStream {

    /* JADX INFO: renamed from: a */
    private Signature f5585a;

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        try {
            this.f5585a.update((byte) i);
        } catch (SignatureException e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.f5585a.update(bArr);
        } catch (SignatureException e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.f5585a.update(bArr, i, i2);
        } catch (SignatureException e) {
            throw new IOException(e.getMessage());
        }
    }
}
