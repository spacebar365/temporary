package org.bouncycastle.a.aa;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class m extends ae {
    m() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigInteger = new BigInteger("1555555555555555555555555555553C6F2885259C31E3FCDF154624522D", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(6L);
        d$d d_d = new d$d(239, 36, new BigInteger("4230017757A767FAE42398569B746325D45313AF0766266479B75654E65F", 16), new BigInteger("5037EA654196CFF0CD82B2C14A2FCF2E3FF8775285B545722F03EACDB74B", 16), bigInteger, bigIntegerValueOf);
        return new ad(d_d, new af(d_d, org.bouncycastle.f.a.f.a("0228F9D04E900069C8DC47A08534FE76D2B900B7D7EF31F5709F200C4CA205")), bigInteger, bigIntegerValueOf, (byte[]) null);
    }
}
