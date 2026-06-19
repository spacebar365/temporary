package org.bouncycastle.p083b.p091g;

import java.io.OutputStream;
import org.bouncycastle.p083b.InterfaceC1175r;

/* JADX INFO: renamed from: org.bouncycastle.b.g.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0983c extends OutputStream {

    /* JADX INFO: renamed from: a */
    protected InterfaceC1175r f4054a;

    public C0983c(InterfaceC1175r interfaceC1175r) {
        this.f4054a = interfaceC1175r;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m2445a() {
        byte[] bArr = new byte[this.f4054a.mo1930b()];
        this.f4054a.mo1926a(bArr, 0);
        return bArr;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f4054a.mo1928a((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f4054a.mo1929a(bArr, i, i2);
    }
}
