package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.af */
/* JADX INFO: loaded from: classes.dex */
final class C0693af extends AbstractC0508ae {
    C0693af() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerM1706c = C0698b.m1706c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF");
        BigInteger bigIntegerM1706c2 = C0698b.m1706c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC");
        BigInteger bigIntegerM1706c3 = C0698b.m1706c("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45");
        byte[] bArrM4106a = C1541f.m4106a("1053CDE42C14D696E67687561517533BF3F83345");
        BigInteger bigIntegerM1706c4 = C0698b.m1706c("0100000000000000000001F4C8F927AED3CA752257");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        AbstractC1381d abstractC1381dM1701a = C0698b.m1701a(new AbstractC1381d.e(bigIntegerM1706c, bigIntegerM1706c2, bigIntegerM1706c3, bigIntegerM1706c4, bigIntegerValueOf));
        return new C0507ad(abstractC1381dM1701a, new C0509af(abstractC1381dM1701a, C1541f.m4106a("044A96B5688EF573284664698968C38BB913CBFC8223A628553168947D59DCC912042351377AC5FB32")), bigIntegerM1706c4, bigIntegerValueOf, bArrM4106a);
    }
}
