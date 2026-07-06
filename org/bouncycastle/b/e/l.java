package org.bouncycastle.b.e;

/* JADX INFO: loaded from: classes.dex */
public final class l extends au {
    @Override // org.bouncycastle.b.e.au, org.bouncycastle.b.ao
    public final String a() {
        return "ChaCha7539-" + this.c;
    }

    @Override // org.bouncycastle.b.e.au
    protected final void a(byte[] bArr) {
        m.a(this.c, this.d, this.e);
        org.bouncycastle.f.g.a(this.e, bArr, 0);
    }

    @Override // org.bouncycastle.b.e.au
    protected final void a(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 32) {
                throw new IllegalArgumentException(a() + " requires 256 bit key");
            }
            a(bArr.length, this.d);
            org.bouncycastle.f.g.a(bArr, 0, this.d, 4, 8);
        }
        org.bouncycastle.f.g.a(bArr2, 0, this.d, 13, 3);
    }

    @Override // org.bouncycastle.b.e.au
    protected final int b() {
        return 12;
    }

    @Override // org.bouncycastle.b.e.au
    protected final void d() {
        int[] iArr = this.d;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i == 0) {
            throw new IllegalStateException("attempt to increase counter past 2^32.");
        }
    }

    @Override // org.bouncycastle.b.e.au
    protected final void e() {
        this.d[12] = 0;
    }
}
