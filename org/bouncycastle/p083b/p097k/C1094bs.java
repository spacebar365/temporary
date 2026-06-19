package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.k.bs */
/* JADX INFO: loaded from: classes.dex */
public final class C1094bs extends C1075b {

    /* JADX INFO: renamed from: b */
    private final byte[] f4448b;

    public C1094bs(byte[] bArr, int i) {
        super(false);
        this.f4448b = new byte[32];
        System.arraycopy(bArr, i, this.f4448b, 0, 32);
    }

    /* JADX INFO: renamed from: a */
    public final void m2642a(byte[] bArr, int i) {
        System.arraycopy(this.f4448b, 0, bArr, i, 32);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m2643b() {
        return C1535a.m4086b(this.f4448b);
    }
}
