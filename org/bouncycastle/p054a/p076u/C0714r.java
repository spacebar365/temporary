package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.r */
/* JADX INFO: loaded from: classes.dex */
final class C0714r extends AbstractC0508ae {
    C0714r() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerM1706c = C0698b.m1706c("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01");
        BigInteger bigIntegerM1706c2 = C0698b.m1706c("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814");
        byte[] bArrM4106a = C1541f.m4106a("103FAEC74D696E676875615175777FC5B191EF30");
        BigInteger bigIntegerM1706c3 = C0698b.m1706c("01000000000000000000000000C7F34A778F443ACC920EBA49");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        AbstractC1381d abstractC1381dM1701a = C0698b.m1701a(new AbstractC1381d.d(193, 15, bigIntegerM1706c, bigIntegerM1706c2, bigIntegerM1706c3, bigIntegerValueOf));
        return new C0507ad(abstractC1381dM1701a, new C0509af(abstractC1381dM1701a, C1541f.m4106a("0401F481BC5F0FF84A74AD6CDF6FDEF4BF6179625372D8C0C5E10025E399F2903712CCF3EA9E3A1AD17FB0B3201B6AF7CE1B05")), bigIntegerM1706c3, bigIntegerValueOf, bArrM4106a);
    }
}
