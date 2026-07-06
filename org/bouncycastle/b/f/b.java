package org.bouncycastle.b.f;

/* JADX INFO: loaded from: classes.dex */
public class b extends org.bouncycastle.b.h {
    @Override // org.bouncycastle.b.h
    public void a(org.bouncycastle.b.x xVar) {
        super.a(xVar);
        if (this.b == 0 || this.b == 7) {
            this.b = 8;
        } else if (this.b != 8) {
            throw new IllegalArgumentException("DES key must be 64 bits long.");
        }
    }

    @Override // org.bouncycastle.b.h
    public byte[] a() {
        byte[] bArr = new byte[8];
        do {
            this.a.nextBytes(bArr);
            org.bouncycastle.b.k.c.a(bArr);
        } while (org.bouncycastle.b.k.c.a(bArr, 0));
        return bArr;
    }
}
