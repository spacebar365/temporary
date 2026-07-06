package org.bouncycastle.b.b;

import java.io.ByteArrayOutputStream;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class n$a extends ByteArrayOutputStream {
    private n$a() {
    }

    /* synthetic */ n$a(byte b) {
        this();
    }

    final void a(byte[] bArr, int i) {
        System.arraycopy(this.buf, 0, bArr, i, size());
    }

    @Override // java.io.ByteArrayOutputStream
    public final void reset() {
        super.reset();
        org.bouncycastle.f.a.d(this.buf);
    }
}
