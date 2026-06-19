package org.bouncycastle.p083b.p086b;

/* JADX INFO: renamed from: org.bouncycastle.b.b.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0846w extends C0832i {
    public C0846w() {
        this(256);
    }

    public C0846w(C0846w c0846w) {
        super(c0846w);
    }

    @Override // org.bouncycastle.p083b.p086b.C0832i, org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        m2025a(2, 2);
        return super.mo1926a(bArr, i);
    }

    @Override // org.bouncycastle.p083b.p086b.C0832i, org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "SHA3-" + this.f3475e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0846w(int i) {
        super(i);
        switch (i) {
            case 224:
            case 256:
            case 384:
            case 512:
                return;
            default:
                throw new IllegalArgumentException("'bitLength' " + i + " not supported for SHA-3");
        }
    }
}
