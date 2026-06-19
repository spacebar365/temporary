package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p142f.AbstractC1556g;

/* JADX INFO: renamed from: org.bouncycastle.b.e.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0935l extends C0912au {
    @Override // org.bouncycastle.p083b.p089e.C0912au, org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final String mo1911a() {
        return "ChaCha7539-" + this.f3774c;
    }

    @Override // org.bouncycastle.p083b.p089e.C0912au
    /* JADX INFO: renamed from: a */
    protected final void mo2226a(byte[] bArr) {
        C0936m.m2346a(this.f3774c, this.f3775d, this.f3776e);
        AbstractC1556g.m4140a(this.f3776e, bArr, 0);
    }

    @Override // org.bouncycastle.p083b.p089e.C0912au
    /* JADX INFO: renamed from: a */
    protected final void mo2227a(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 32) {
                throw new IllegalArgumentException(mo1911a() + " requires 256 bit key");
            }
            m2224a(bArr.length, this.f3775d);
            AbstractC1556g.m4138a(bArr, 0, this.f3775d, 4, 8);
        }
        AbstractC1556g.m4138a(bArr2, 0, this.f3775d, 13, 3);
    }

    @Override // org.bouncycastle.p083b.p089e.C0912au
    /* JADX INFO: renamed from: b */
    protected final int mo2228b() {
        return 12;
    }

    @Override // org.bouncycastle.p083b.p089e.C0912au
    /* JADX INFO: renamed from: d */
    protected final void mo2229d() {
        int[] iArr = this.f3775d;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i == 0) {
            throw new IllegalStateException("attempt to increase counter past 2^32.");
        }
    }

    @Override // org.bouncycastle.p083b.p089e.C0912au
    /* JADX INFO: renamed from: e */
    protected final void mo2230e() {
        this.f3775d[12] = 0;
    }
}
