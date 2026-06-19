package org.bouncycastle.jcajce.p146io;

import java.io.OutputStream;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class MacOutputStream extends OutputStream {

    /* JADX INFO: renamed from: a */
    private Mac f5583a;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f5583a.update((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f5583a.update(bArr, i, i2);
    }
}
