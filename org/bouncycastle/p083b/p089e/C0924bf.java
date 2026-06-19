package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p142f.AbstractC1556g;

/* JADX INFO: renamed from: org.bouncycastle.b.e.bf */
/* JADX INFO: loaded from: classes.dex */
public final class C0924bf extends C0912au {
    @Override // org.bouncycastle.p083b.p089e.C0912au, org.bouncycastle.p083b.InterfaceC0815ao
    /* JADX INFO: renamed from: a */
    public final String mo1911a() {
        return "XSalsa20";
    }

    @Override // org.bouncycastle.p083b.p089e.C0912au
    /* JADX INFO: renamed from: a */
    protected final void mo2227a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new IllegalArgumentException("XSalsa20 doesn't support re-init with null key");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("XSalsa20 requires a 256 bit key");
        }
        super.mo2227a(bArr, bArr2);
        AbstractC1556g.m4138a(bArr2, 8, this.f3775d, 8, 2);
        int[] iArr = new int[this.f3775d.length];
        m2225b(20, this.f3775d, iArr);
        this.f3775d[1] = iArr[0] - this.f3775d[0];
        this.f3775d[2] = iArr[5] - this.f3775d[5];
        this.f3775d[3] = iArr[10] - this.f3775d[10];
        this.f3775d[4] = iArr[15] - this.f3775d[15];
        this.f3775d[11] = iArr[6] - this.f3775d[6];
        this.f3775d[12] = iArr[7] - this.f3775d[7];
        this.f3775d[13] = iArr[8] - this.f3775d[8];
        this.f3775d[14] = iArr[9] - this.f3775d[9];
        AbstractC1556g.m4138a(bArr2, 16, this.f3775d, 6, 2);
    }

    @Override // org.bouncycastle.p083b.p089e.C0912au
    /* JADX INFO: renamed from: b */
    protected final int mo2228b() {
        return 24;
    }
}
