package org.bouncycastle.d.a;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ad extends a {
    private static j$a a(j$a j_a, byte[] bArr) {
        d$a d_a = (d$a) j_a.d();
        j$a[] j_aArrA = ((af) d_a.a(j_a, "bc_wtnaf", new ae(j_a, d_a.g().a().byteValue()))).a();
        j$a[] j_aArr = new j$a[j_aArrA.length];
        for (int i = 0; i < j_aArrA.length; i++) {
            j_aArr[i] = (j$a) j_aArrA[i].s();
        }
        j$a j_a2 = (j$a) j_a.d().e();
        int length = bArr.length - 1;
        int i2 = 0;
        while (length >= 0) {
            int i3 = i2 + 1;
            byte b = bArr[length];
            if (b != 0) {
                j_a2 = (j$a) j_a2.c(i3).b(b > 0 ? j_aArrA[b >>> 1] : j_aArr[(-b) >>> 1]);
                i3 = 0;
            }
            length--;
            i2 = i3;
        }
        return i2 > 0 ? j_a2.c(i2) : j_a2;
    }

    @Override // org.bouncycastle.d.a.a
    protected final j b(j jVar, BigInteger bigInteger) {
        if (!(jVar instanceof j$a)) {
            throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
        }
        j$a j_a = (j$a) jVar;
        d$a d_a = (d$a) j_a.d();
        int iA = d_a.a();
        byte bByteValue = d_a.g().a().byteValue();
        byte bA = w.a((int) bByteValue);
        return a(j_a, w.a(bA, w.a(bigInteger, iA, bByteValue, d_a.n(), bA), BigInteger.valueOf(16L), w.a(bA), bByteValue == 0 ? w.a : w.c));
    }
}
