package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.c */
/* JADX INFO: loaded from: classes.dex */
final class C0699c extends AbstractC0508ae {
    C0699c() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerM1706c = C0698b.m1706c("DB7C2ABF62E35E668076BEAD208B");
        BigInteger bigIntegerM1706c2 = C0698b.m1706c("DB7C2ABF62E35E668076BEAD2088");
        BigInteger bigIntegerM1706c3 = C0698b.m1706c("659EF8BA043916EEDE8911702B22");
        byte[] bArrM4106a = C1541f.m4106a("00F50B028E4D696E676875615175290472783FB1");
        BigInteger bigIntegerM1706c4 = C0698b.m1706c("DB7C2ABF62E35E7628DFAC6561C5");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        AbstractC1381d abstractC1381dM1701a = C0698b.m1701a(new AbstractC1381d.e(bigIntegerM1706c, bigIntegerM1706c2, bigIntegerM1706c3, bigIntegerM1706c4, bigIntegerValueOf));
        return new C0507ad(abstractC1381dM1701a, new C0509af(abstractC1381dM1701a, C1541f.m4106a("0409487239995A5EE76B55F9C2F098A89CE5AF8724C0A23E0E0FF77500")), bigIntegerM1706c4, bigIntegerValueOf, bArrM4106a);
    }
}
