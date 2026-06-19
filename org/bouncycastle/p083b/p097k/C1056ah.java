package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.k.ah */
/* JADX INFO: loaded from: classes.dex */
public final class C1056ah extends C1075b {

    /* JADX INFO: renamed from: b */
    private final byte[] f4383b;

    public C1056ah(byte[] bArr, int i) {
        super(false);
        this.f4383b = new byte[32];
        System.arraycopy(bArr, i, this.f4383b, 0, 32);
    }

    /* JADX INFO: renamed from: a */
    public final void m2570a(byte[] bArr, int i) {
        System.arraycopy(this.f4383b, 0, bArr, i, 32);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m2571b() {
        return C1535a.m4086b(this.f4383b);
    }
}
