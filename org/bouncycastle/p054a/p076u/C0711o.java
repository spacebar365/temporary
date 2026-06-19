package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.o */
/* JADX INFO: loaded from: classes.dex */
final class C0711o extends AbstractC0508ae {
    C0711o() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(1L);
        BigInteger bigIntegerM1706c = C0698b.m1706c("04000000000000000000020108A2E0CC0D99F8A5EF");
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(2L);
        AbstractC1381d abstractC1381dM1701a = C0698b.m1701a(new AbstractC1381d.d(163, 3, 6, 7, bigIntegerValueOf, bigIntegerValueOf2, bigIntegerM1706c, bigIntegerValueOf3));
        return new C0507ad(abstractC1381dM1701a, new C0509af(abstractC1381dM1701a, C1541f.m4106a("0402FE13C0537BBC11ACAA07D793DE4E6D5E5C94EEE80289070FB05D38FF58321F2E800536D538CCDAA3D9")), bigIntegerM1706c, bigIntegerValueOf3, (byte[]) null);
    }
}
