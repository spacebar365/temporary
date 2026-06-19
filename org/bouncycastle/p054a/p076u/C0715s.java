package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.s */
/* JADX INFO: loaded from: classes.dex */
final class C0715s extends AbstractC0508ae {
    C0715s() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerM1706c = C0698b.m1706c("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B");
        BigInteger bigIntegerM1706c2 = C0698b.m1706c("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE");
        byte[] bArrM4106a = C1541f.m4106a("10B7B4D696E676875615175137C8A16FD0DA2211");
        BigInteger bigIntegerM1706c3 = C0698b.m1706c("010000000000000000000000015AAB561B005413CCD4EE99D5");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        AbstractC1381d abstractC1381dM1701a = C0698b.m1701a(new AbstractC1381d.d(193, 15, bigIntegerM1706c, bigIntegerM1706c2, bigIntegerM1706c3, bigIntegerValueOf));
        return new C0507ad(abstractC1381dM1701a, new C0509af(abstractC1381dM1701a, C1541f.m4106a("0400D9B67D192E0367C803F39E1A7E82CA14A651350AAE617E8F01CE94335607C304AC29E7DEFBD9CA01F596F927224CDECF6C")), bigIntegerM1706c3, bigIntegerValueOf, bArrM4106a);
    }
}
