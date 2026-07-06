package org.bouncycastle.b.e;

import org.bouncycastle.b.k.bh;

/* JADX INFO: loaded from: classes.dex */
public final class n extends v {
    @Override // org.bouncycastle.b.e.v, org.bouncycastle.b.ap
    public final void a(boolean z, org.bouncycastle.b.i iVar) {
        org.bouncycastle.b.k.ba baVar;
        bh bhVar = (bh) (iVar instanceof org.bouncycastle.b.k.bf ? ((org.bouncycastle.b.k.bf) iVar).b() : iVar);
        byte[] bArrA = null;
        if (bhVar.b() instanceof org.bouncycastle.b.k.bg) {
            baVar = (org.bouncycastle.b.k.ba) ((org.bouncycastle.b.k.bg) bhVar.b()).b();
            bArrA = ((org.bouncycastle.b.k.bg) bhVar.b()).a();
        } else {
            baVar = (org.bouncycastle.b.k.ba) bhVar.b();
        }
        org.bouncycastle.b.k.ba baVar2 = new org.bouncycastle.b.k.ba(a(baVar.a(), bhVar.a(), bArrA));
        if (bArrA != null) {
            super.a(z, new bh(new org.bouncycastle.b.k.bg(baVar2, bArrA), bhVar.a()));
        } else {
            super.a(z, new bh(baVar2, bhVar.a()));
        }
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i = 0; i != 8; i++) {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 != 8; i4++) {
                int iC = org.bouncycastle.f.g.c(bArr, i4 * 4);
                if ((bArr2[i] & (1 << i4)) != 0) {
                    i3 += iC;
                } else {
                    i2 += iC;
                }
            }
            byte[] bArr4 = new byte[8];
            org.bouncycastle.f.g.b(i3, bArr4, 0);
            org.bouncycastle.f.g.b(i2, bArr4, 4);
            org.bouncycastle.b.i.k kVar = new org.bouncycastle.b.i.k(new u());
            kVar.a(true, new org.bouncycastle.b.k.be(new org.bouncycastle.b.k.bg(new org.bouncycastle.b.k.ba(bArr), bArr3), bArr4));
            kVar.a(bArr, 0, bArr, 0);
            kVar.a(bArr, 8, bArr, 8);
            kVar.a(bArr, 16, bArr, 16);
            kVar.a(bArr, 24, bArr, 24);
        }
        return bArr;
    }
}
