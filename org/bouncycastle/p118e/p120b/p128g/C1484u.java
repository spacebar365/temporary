package org.bouncycastle.p118e.p120b.p128g;

import java.io.Serializable;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1484u implements Serializable {

    /* JADX INFO: renamed from: a */
    private final int f5387a;

    /* JADX INFO: renamed from: b */
    private final byte[] f5388b;

    protected C1484u(int i, byte[] bArr) {
        this.f5387a = i;
        this.f5388b = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final int m3956a() {
        return this.f5387a;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m3957b() {
        return C1464aa.m3841a(this.f5388b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C1484u clone() {
        return new C1484u(this.f5387a, C1464aa.m3841a(this.f5388b));
    }
}
