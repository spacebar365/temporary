package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.ag */
/* JADX INFO: loaded from: classes.dex */
final class C0694ag extends AbstractC0508ae {
    C0694ag() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerM1706c = C0698b.m1706c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73");
        BigInteger bigIntegerM1706c2 = C0698b.m1706c("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70");
        BigInteger bigIntegerM1706c3 = C0698b.m1706c("B4E134D3FB59EB8BAB57274904664D5AF50388BA");
        byte[] bArrM4106a = C1541f.m4106a("B99B99B099B323E02709A4D696E6768756151751");
        BigInteger bigIntegerM1706c4 = C0698b.m1706c("0100000000000000000000351EE786A818F3A1A16B");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        AbstractC1381d abstractC1381dM1701a = C0698b.m1701a(new AbstractC1381d.e(bigIntegerM1706c, bigIntegerM1706c2, bigIntegerM1706c3, bigIntegerM1706c4, bigIntegerValueOf));
        return new C0507ad(abstractC1381dM1701a, new C0509af(abstractC1381dM1701a, C1541f.m4106a("0452DCB034293A117E1F4FF11B30F7199D3144CE6DFEAFFEF2E331F296E071FA0DF9982CFEA7D43F2E")), bigIntegerM1706c4, bigIntegerValueOf, bArrM4106a);
    }
}
