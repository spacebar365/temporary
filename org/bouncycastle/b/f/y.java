package org.bouncycastle.b.f;

/* JADX INFO: loaded from: classes.dex */
public final class y extends org.bouncycastle.b.h {
    @Override // org.bouncycastle.b.h
    public final void a(org.bouncycastle.b.x xVar) {
        super.a(new org.bouncycastle.b.x(xVar.a(), 256));
    }

    @Override // org.bouncycastle.b.h
    public final byte[] a() {
        byte[] bArrA = super.a();
        if (bArrA.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        bArrA[3] = (byte) (bArrA[3] & 15);
        bArrA[7] = (byte) (bArrA[7] & 15);
        bArrA[11] = (byte) (bArrA[11] & 15);
        bArrA[15] = (byte) (bArrA[15] & 15);
        bArrA[4] = (byte) (bArrA[4] & (-4));
        bArrA[8] = (byte) (bArrA[8] & (-4));
        bArrA[12] = (byte) (bArrA[12] & (-4));
        return bArrA;
    }
}
