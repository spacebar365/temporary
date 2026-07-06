package org.bouncycastle.a.aa;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class aa extends ae {
    aa() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigInteger = new BigInteger("03FFFFFFFFFFFFFFFFFFFDF64DE1151ADBB78F10A7", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        d$d d_d = new d$d(163, 1, 2, 8, new BigInteger("0108B39E77C4B108BED981ED0E890E117C511CF072", 16), new BigInteger("0667ACEB38AF4E488C407433FFAE4F1C811638DF20", 16), bigInteger, bigIntegerValueOf);
        return new ad(d_d, new af(d_d, org.bouncycastle.f.a.f.a("030024266E4EB5106D0A964D92C4860E2671DB9B6CC5")), bigInteger, bigIntegerValueOf, (byte[]) null);
    }
}
