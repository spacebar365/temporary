package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.q */
/* JADX INFO: loaded from: classes.dex */
final class C0713q extends AbstractC0508ae {
    C0713q() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        BigInteger bigIntegerM1706c = C0698b.m1706c("020A601907B8C953CA1481EB10512F78744A3205FD");
        byte[] bArrM4106a = C1541f.m4106a("85E25BFE5C86226CDB12016F7553F9D0E693A268");
        BigInteger bigIntegerM1706c2 = C0698b.m1706c("040000000000000000000292FE77E70C12A4234C33");
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2L);
        AbstractC1381d abstractC1381dM1701a = C0698b.m1701a(new AbstractC1381d.d(163, 3, 6, 7, bigIntegerValueOf, bigIntegerM1706c, bigIntegerM1706c2, bigIntegerValueOf2));
        return new C0507ad(abstractC1381dM1701a, new C0509af(abstractC1381dM1701a, C1541f.m4106a("0403F0EBA16286A2D57EA0991168D4994637E8343E3600D51FBC6C71A0094FA2CDD545B11C5C0C797324F1")), bigIntegerM1706c2, bigIntegerValueOf2, bArrM4106a);
    }
}
