package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.ai */
/* JADX INFO: loaded from: classes.dex */
final class C0696ai extends AbstractC0508ae {
    C0696ai() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerM1706c = C0698b.m1706c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF");
        BigInteger bigIntegerM1706c2 = C0698b.m1706c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC");
        BigInteger bigIntegerM1706c3 = C0698b.m1706c("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1");
        byte[] bArrM4106a = C1541f.m4106a("3045AE6FC8422F64ED579528D38120EAE12196D5");
        BigInteger bigIntegerM1706c4 = C0698b.m1706c("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        AbstractC1381d abstractC1381dM1701a = C0698b.m1701a(new AbstractC1381d.e(bigIntegerM1706c, bigIntegerM1706c2, bigIntegerM1706c3, bigIntegerM1706c4, bigIntegerValueOf));
        return new C0507ad(abstractC1381dM1701a, new C0509af(abstractC1381dM1701a, C1541f.m4106a("04188DA80EB03090F67CBF20EB43A18800F4FF0AFD82FF101207192B95FFC8DA78631011ED6B24CDD573F977A11E794811")), bigIntegerM1706c4, bigIntegerValueOf, bArrM4106a);
    }
}
