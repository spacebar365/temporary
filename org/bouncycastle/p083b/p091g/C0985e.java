package org.bouncycastle.p083b.p091g;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.p083b.InterfaceC1183z;

/* JADX INFO: renamed from: org.bouncycastle.b.g.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0985e extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    protected InterfaceC1183z f4055a;

    public C0985e(InputStream inputStream, InterfaceC1183z interfaceC1183z) {
        super(inputStream);
        this.f4055a = interfaceC1183z;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = this.in.read();
        if (i >= 0) {
            this.f4055a.mo2448a((byte) i);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.in.read(bArr, i, i2);
        if (i3 >= 0) {
            this.f4055a.mo2450a(bArr, i, i3);
        }
        return i3;
    }
}
