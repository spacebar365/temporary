package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.k */
/* JADX INFO: loaded from: classes.dex */
final class C0707k extends AbstractC0508ae {
    C0707k() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerM1706c = C0698b.m1706c("00689918DBEC7E5A0DD6DFC0AA55C7");
        BigInteger bigIntegerM1706c2 = C0698b.m1706c("0095E9A9EC9B297BD4BF36E059184F");
        byte[] bArrM4106a = C1541f.m4106a("10C0FB15760860DEF1EEF4D696E676875615175D");
        BigInteger bigIntegerM1706c3 = C0698b.m1706c("010000000000000108789B2496AF93");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        AbstractC1381d abstractC1381dM1701a = C0698b.m1701a(new AbstractC1381d.d(113, 9, bigIntegerM1706c, bigIntegerM1706c2, bigIntegerM1706c3, bigIntegerValueOf));
        return new C0507ad(abstractC1381dM1701a, new C0509af(abstractC1381dM1701a, C1541f.m4106a("0401A57A6A7B26CA5EF52FCDB816479700B3ADC94ED1FE674C06E695BABA1D")), bigIntegerM1706c3, bigIntegerValueOf, bArrM4106a);
    }
}
