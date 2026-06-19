package org.bouncycastle.p054a.p055a;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.a.b */
/* JADX INFO: loaded from: classes.dex */
final class C0500b extends AbstractC0508ae {
    C0500b() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerM1348c = C0499a.m1348c("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
        BigInteger bigIntegerM1348c2 = C0499a.m1348c("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
        BigInteger bigIntegerM1348c3 = C0499a.m1348c("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
        BigInteger bigIntegerM1348c4 = C0499a.m1348c("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        AbstractC1381d abstractC1381dM1345a = C0499a.m1345a(new AbstractC1381d.e(bigIntegerM1348c, bigIntegerM1348c2, bigIntegerM1348c3, bigIntegerM1348c4, bigIntegerValueOf));
        return new C0507ad(abstractC1381dM1345a, new C0509af(abstractC1381dM1345a, C1541f.m4106a("04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB")), bigIntegerM1348c4, bigIntegerValueOf, (byte[]) null);
    }
}
