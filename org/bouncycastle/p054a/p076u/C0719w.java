package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.InterfaceC1376c;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.w */
/* JADX INFO: loaded from: classes.dex */
final class C0719w extends AbstractC0508ae {
    C0719w() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = InterfaceC1376c.f4994c;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        BigInteger bigIntegerM1706c = C0698b.m1706c("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61");
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(4L);
        AbstractC1381d abstractC1381dM1701a = C0698b.m1701a(new AbstractC1381d.d(283, 5, 7, 12, bigInteger, bigIntegerValueOf, bigIntegerM1706c, bigIntegerValueOf2));
        return new C0507ad(abstractC1381dM1701a, new C0509af(abstractC1381dM1701a, C1541f.m4106a("040503213F78CA44883F1A3B8162F188E553CD265F23C1567A16876913B0C2AC245849283601CCDA380F1C9E318D90F95D07E5426FE87E45C0E8184698E45962364E34116177DD2259")), bigIntegerM1706c, bigIntegerValueOf2, (byte[]) null);
    }
}
