package org.bouncycastle.p083b.p086b;

import org.bouncycastle.p142f.InterfaceC1554e;

/* JADX INFO: renamed from: org.bouncycastle.b.b.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0829f extends AbstractC0828e {

    /* JADX INFO: renamed from: a */
    private static final byte[] f3465a = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    public C0829f() {
        super(f3465a);
    }

    public C0829f(C0829f c0829f) {
        super(f3465a);
        mo1939a(c0829f);
    }

    @Override // org.bouncycastle.p083b.p086b.AbstractC0828e, org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        byte[] bArr2 = new byte[64];
        super.mo1926a(bArr2, 0);
        System.arraycopy(bArr2, 32, bArr, i, 32);
        return 32;
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "GOST3411-2012-256";
    }

    @Override // org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: b */
    public final int mo1930b() {
        return 32;
    }

    @Override // org.bouncycastle.p142f.InterfaceC1554e
    /* JADX INFO: renamed from: e */
    public final InterfaceC1554e mo1941e() {
        return new C0829f(this);
    }
}
