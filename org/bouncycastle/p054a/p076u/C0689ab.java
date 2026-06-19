package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.InterfaceC1376c;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.ab */
/* JADX INFO: loaded from: classes.dex */
final class C0689ab extends AbstractC0508ae {
    C0689ab() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = InterfaceC1376c.f4994c;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        BigInteger bigIntegerM1706c = C0698b.m1706c("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001");
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(4L);
        AbstractC1381d abstractC1381dM1701a = C0698b.m1701a(new AbstractC1381d.d(571, 2, 5, 10, bigInteger, bigIntegerValueOf, bigIntegerM1706c, bigIntegerValueOf2));
        return new C0507ad(abstractC1381dM1701a, new C0509af(abstractC1381dM1701a, C1541f.m4106a("04026EB7A859923FBC82189631F8103FE4AC9CA2970012D5D46024804801841CA44370958493B205E647DA304DB4CEB08CBBD1BA39494776FB988B47174DCA88C7E2945283A01C89720349DC807F4FBF374F4AEADE3BCA95314DD58CEC9F307A54FFC61EFC006D8A2C9D4979C0AC44AEA74FBEBBB9F772AEDCB620B01A7BA7AF1B320430C8591984F601CD4C143EF1C7A3")), bigIntegerM1706c, bigIntegerValueOf2, (byte[]) null);
    }
}
