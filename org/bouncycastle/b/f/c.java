package org.bouncycastle.b.f;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {
    @Override // org.bouncycastle.b.f.b, org.bouncycastle.b.h
    public final void a(org.bouncycastle.b.x xVar) {
        this.a = xVar.a();
        this.b = (xVar.b() + 7) / 8;
        if (this.b == 0 || this.b == 21) {
            this.b = 24;
        } else if (this.b == 14) {
            this.b = 16;
        } else if (this.b != 24 && this.b != 16) {
            throw new IllegalArgumentException("DESede key must be 192 or 128 bits long.");
        }
    }

    @Override // org.bouncycastle.b.f.b, org.bouncycastle.b.h
    public final byte[] a() {
        byte[] bArr = new byte[this.b];
        int i = 0;
        while (true) {
            this.a.nextBytes(bArr);
            org.bouncycastle.b.k.d.a(bArr);
            i++;
            if (i >= 20 || (!org.bouncycastle.b.k.d.b(bArr, bArr.length) && org.bouncycastle.b.k.d.b(bArr))) {
                break;
            }
        }
        if (org.bouncycastle.b.k.d.b(bArr, bArr.length) || !org.bouncycastle.b.k.d.b(bArr)) {
            throw new IllegalStateException("Unable to generate DES-EDE key");
        }
        return bArr;
    }
}
