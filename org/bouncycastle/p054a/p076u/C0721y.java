package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.y */
/* JADX INFO: loaded from: classes.dex */
final class C0721y extends AbstractC0508ae {
    C0721y() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerM1706c = C0698b.m1706c("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF");
        BigInteger bigIntegerM1706c2 = C0698b.m1706c("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC");
        BigInteger bigIntegerM1706c3 = C0698b.m1706c("E87579C11079F43DD824993C2CEE5ED3");
        byte[] bArrM4106a = C1541f.m4106a("000E0D4D696E6768756151750CC03A4473D03679");
        BigInteger bigIntegerM1706c4 = C0698b.m1706c("FFFFFFFE0000000075A30D1B9038A115");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        AbstractC1381d abstractC1381dM1701a = C0698b.m1701a(new AbstractC1381d.e(bigIntegerM1706c, bigIntegerM1706c2, bigIntegerM1706c3, bigIntegerM1706c4, bigIntegerValueOf));
        return new C0507ad(abstractC1381dM1701a, new C0509af(abstractC1381dM1701a, C1541f.m4106a("04161FF7528B899B2D0C28607CA52C5B86CF5AC8395BAFEB13C02DA292DDED7A83")), bigIntegerM1706c4, bigIntegerValueOf, bArrM4106a);
    }
}
