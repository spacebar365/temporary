package org.bouncycastle.a.a;

import java.math.BigInteger;
import org.bouncycastle.a.aa.ad;
import org.bouncycastle.a.aa.ae;
import org.bouncycastle.a.aa.af;
import org.bouncycastle.d.a.d;
import org.bouncycastle.d.a.d$e;
import org.bouncycastle.f.a.f;

/* JADX INFO: loaded from: classes.dex */
final class b extends ae {
    b() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigIntegerC = a.c("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
        BigInteger bigIntegerC2 = a.c("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
        BigInteger bigIntegerC3 = a.c("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
        BigInteger bigIntegerC4 = a.c("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        d dVarA = a.a(new d$e(bigIntegerC, bigIntegerC2, bigIntegerC3, bigIntegerC4, bigIntegerValueOf));
        return new ad(dVarA, new af(dVarA, f.a("04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB")), bigIntegerC4, bigIntegerValueOf, (byte[]) null);
    }
}
