package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.k.bv */
/* JADX INFO: loaded from: classes.dex */
public final class C1097bv extends C1075b {

    /* JADX INFO: renamed from: b */
    private final byte[] f4450b;

    public C1097bv(byte[] bArr, int i) {
        super(false);
        this.f4450b = new byte[56];
        System.arraycopy(bArr, i, this.f4450b, 0, 56);
    }

    /* JADX INFO: renamed from: a */
    public final void m2647a(byte[] bArr, int i) {
        System.arraycopy(this.f4450b, 0, bArr, i, 56);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m2648b() {
        return C1535a.m4086b(this.f4450b);
    }
}
