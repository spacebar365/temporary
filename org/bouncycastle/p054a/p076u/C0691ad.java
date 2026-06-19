package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.ad */
/* JADX INFO: loaded from: classes.dex */
final class C0691ad extends AbstractC0508ae {
    C0691ad() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerM1706c = C0698b.m1706c("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF");
        BigInteger bigIntegerM1706c2 = C0698b.m1706c("D6031998D1B3BBFEBF59CC9BBFF9AEE1");
        BigInteger bigIntegerM1706c3 = C0698b.m1706c("5EEEFCA380D02919DC2C6558BB6D8A5D");
        byte[] bArrM4106a = C1541f.m4106a("004D696E67687561517512D8F03431FCE63B88F4");
        BigInteger bigIntegerM1706c4 = C0698b.m1706c("3FFFFFFF7FFFFFFFBE0024720613B5A3");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(4L);
        AbstractC1381d abstractC1381dM1701a = C0698b.m1701a(new AbstractC1381d.e(bigIntegerM1706c, bigIntegerM1706c2, bigIntegerM1706c3, bigIntegerM1706c4, bigIntegerValueOf));
        return new C0507ad(abstractC1381dM1701a, new C0509af(abstractC1381dM1701a, C1541f.m4106a("047B6AA5D85E572983E6FB32A7CDEBC14027B6916A894D3AEE7106FE805FC34B44")), bigIntegerM1706c4, bigIntegerValueOf, bArrM4106a);
    }
}
