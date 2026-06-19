package org.bouncycastle.p083b.p091g;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.p083b.InterfaceC1175r;

/* JADX INFO: renamed from: org.bouncycastle.b.g.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0982b extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    protected InterfaceC1175r f4053a;

    public C0982b(InputStream inputStream, InterfaceC1175r interfaceC1175r) {
        super(inputStream);
        this.f4053a = interfaceC1175r;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = this.in.read();
        if (i >= 0) {
            this.f4053a.mo1928a((byte) i);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.in.read(bArr, i, i2);
        if (i3 > 0) {
            this.f4053a.mo1929a(bArr, i, i3);
        }
        return i3;
    }
}
