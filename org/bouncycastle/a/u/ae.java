package org.bouncycastle.a.u;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$e;

/* JADX INFO: loaded from: classes.dex */
final class ae extends org.bouncycastle.a.aa.ae {
    ae() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final org.bouncycastle.a.aa.ad a() {
        BigInteger bigIntegerC = b.c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73");
        BigInteger bigInteger = org.bouncycastle.d.a.c.c;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(7L);
        BigInteger bigIntegerC2 = b.c("0100000000000000000001B8FA16DFAB9ACA16B6B3");
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(1L);
        org.bouncycastle.d.a.d dVarA = b.a(new d$e(bigIntegerC, bigInteger, bigIntegerValueOf, bigIntegerC2, bigIntegerValueOf2), new org.bouncycastle.d.a.b.d(new BigInteger("9ba48cba5ebcb9b6bd33b92830b2a2e0e192f10a", 16), new BigInteger("c39c6c3b3a36d7701b9c71a1f5804ae5d0003f4", 16), new BigInteger[]{new BigInteger("9162fbe73984472a0a9e", 16), new BigInteger("-96341f1138933bc2f505", 16)}, new BigInteger[]{new BigInteger("127971af8721782ecffa3", 16), new BigInteger("9162fbe73984472a0a9e", 16)}, new BigInteger("9162fbe73984472a0a9d0590", 16), new BigInteger("96341f1138933bc2f503fd44", 16), 176));
        return new org.bouncycastle.a.aa.ad(dVarA, new org.bouncycastle.a.aa.af(dVarA, org.bouncycastle.f.a.f.a("043B4C382CE37AA192A4019E763036F4F5DD4D7EBB938CF935318FDCED6BC28286531733C3F03C4FEE")), bigIntegerC2, bigIntegerValueOf2, (byte[]) null);
    }
}
