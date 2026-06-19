package org.bouncycastle.jcajce.p146io;

import java.io.OutputStream;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
class MacUpdatingOutputStream extends OutputStream {

    /* JADX INFO: renamed from: a */
    private Mac f5584a;

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f5584a.update((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f5584a.update(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.f5584a.update(bArr, i, i2);
    }
}
