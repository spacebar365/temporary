package org.bouncycastle.p083b.p086b;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.b.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0837n implements InterfaceC1175r {

    /* JADX INFO: renamed from: a */
    private a f3511a = new a(0);

    /* JADX INFO: renamed from: org.bouncycastle.b.b.n$a */
    private static class a extends ByteArrayOutputStream {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        /* JADX INFO: renamed from: a */
        final void m2051a(byte[] bArr, int i) {
            System.arraycopy(this.buf, 0, bArr, i, size());
        }

        @Override // java.io.ByteArrayOutputStream
        public final void reset() {
            super.reset();
            C1535a.m4094d(this.buf);
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "NULL";
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final void mo1928a(byte b) {
        this.f3511a.write(b);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final void mo1929a(byte[] bArr, int i, int i2) {
        this.f3511a.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: b */
    public final int mo1930b() {
        return this.f3511a.size();
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: c */
    public final void mo1931c() {
        this.f3511a.reset();
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        int size = this.f3511a.size();
        this.f3511a.m2051a(bArr, i);
        this.f3511a.reset();
        return size;
    }
}
