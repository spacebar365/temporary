package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public final class bf extends au {
    @Override // org.bouncycastle.b.e.au, org.bouncycastle.b.ao
    public final String a() {
        return "XSalsa20";
    }

    @Override // org.bouncycastle.b.e.au
    protected final void a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new IllegalArgumentException("XSalsa20 doesn't support re-init with null key");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("XSalsa20 requires a 256 bit key");
        }
        super.a(bArr, bArr2);
        org.bouncycastle.f.g.a(bArr2, 8, this.d, 8, 2);
        int[] iArr = new int[this.d.length];
        b(20, this.d, iArr);
        this.d[1] = iArr[0] - this.d[0];
        this.d[2] = iArr[5] - this.d[5];
        this.d[3] = iArr[10] - this.d[10];
        this.d[4] = iArr[15] - this.d[15];
        this.d[11] = iArr[6] - this.d[6];
        this.d[12] = iArr[7] - this.d[7];
        this.d[13] = iArr[8] - this.d[8];
        this.d[14] = iArr[9] - this.d[9];
        org.bouncycastle.f.g.a(bArr2, 16, this.d, 6, 2);
    }

    @Override // org.bouncycastle.b.e.au
    protected final int b() {
        return 24;
    }
}
