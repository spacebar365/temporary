package org.bouncycastle.p083b.p086b;

import org.bouncycastle.p083b.InterfaceC0817aq;

/* JADX INFO: renamed from: org.bouncycastle.b.b.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0849z extends C0832i implements InterfaceC0817aq {
    public C0849z() {
        this(128);
    }

    /* JADX INFO: renamed from: c */
    private int m2107c(byte[] bArr, int i, int i2) {
        if (!this.f3476f) {
            m2025a(15, 4);
        }
        m2026a(bArr, i, ((long) i2) * 8);
        return i2;
    }

    @Override // org.bouncycastle.p083b.p086b.C0832i, org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final int mo1926a(byte[] bArr, int i) {
        return mo1918b(bArr, i, mo1930b());
    }

    @Override // org.bouncycastle.p083b.p086b.C0832i, org.bouncycastle.p083b.InterfaceC1175r
    /* JADX INFO: renamed from: a */
    public final String mo1927a() {
        return "SHAKE" + this.f3475e;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0817aq
    /* JADX INFO: renamed from: b */
    public final int mo1918b(byte[] bArr, int i, int i2) {
        int iM2107c = m2107c(bArr, i, i2);
        mo1931c();
        return iM2107c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0849z(int i) {
        super(i);
        switch (i) {
            case 128:
            case 256:
                return;
            default:
                throw new IllegalArgumentException("'bitLength' " + i + " not supported for SHAKE");
        }
    }
}
