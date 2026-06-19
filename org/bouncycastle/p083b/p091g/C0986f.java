package org.bouncycastle.p083b.p091g;

import java.io.OutputStream;
import org.bouncycastle.p083b.InterfaceC1183z;

/* JADX INFO: renamed from: org.bouncycastle.b.g.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0986f extends OutputStream {

    /* JADX INFO: renamed from: a */
    protected InterfaceC1183z f4056a;

    public C0986f(InterfaceC1183z interfaceC1183z) {
        this.f4056a = interfaceC1183z;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f4056a.mo2448a((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f4056a.mo2450a(bArr, i, i2);
    }
}
