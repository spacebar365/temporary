package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.n */
/* JADX INFO: loaded from: classes.dex */
final class C0710n extends AbstractC0508ae {
    C0710n() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerM1706c = C0698b.m1706c("DB7C2ABF62E35E668076BEAD208B");
        BigInteger bigIntegerM1706c2 = C0698b.m1706c("6127C24C05F38A0AAAF65C0EF02C");
        BigInteger bigIntegerM1706c3 = C0698b.m1706c("51DEF1815DB5ED74FCC34C85D709");
        byte[] bArrM4106a = C1541f.m4106a("002757A1114D696E6768756151755316C05E0BD4");
        BigInteger bigIntegerM1706c4 = C0698b.m1706c("36DF0AAFD8B8D7597CA10520D04B");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(4L);
        AbstractC1381d abstractC1381dM1701a = C0698b.m1701a(new AbstractC1381d.e(bigIntegerM1706c, bigIntegerM1706c2, bigIntegerM1706c3, bigIntegerM1706c4, bigIntegerValueOf));
        return new C0507ad(abstractC1381dM1701a, new C0509af(abstractC1381dM1701a, C1541f.m4106a("044BA30AB5E892B4E1649DD0928643ADCD46F5882E3747DEF36E956E97")), bigIntegerM1706c4, bigIntegerValueOf, bArrM4106a);
    }
}
