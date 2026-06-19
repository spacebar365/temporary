package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.k.ak */
/* JADX INFO: loaded from: classes.dex */
public final class C1059ak extends C1075b {

    /* JADX INFO: renamed from: b */
    private final byte[] f4385b;

    public C1059ak(byte[] bArr, int i) {
        super(false);
        this.f4385b = new byte[57];
        System.arraycopy(bArr, i, this.f4385b, 0, 57);
    }

    /* JADX INFO: renamed from: a */
    public final void m2575a(byte[] bArr, int i) {
        System.arraycopy(this.f4385b, 0, bArr, i, 57);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m2576b() {
        return C1535a.m4086b(this.f4385b);
    }
}
