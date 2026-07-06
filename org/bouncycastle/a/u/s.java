package org.bouncycastle.a.u;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class s extends org.bouncycastle.a.aa.ae {
    s() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final org.bouncycastle.a.aa.ad a() {
        BigInteger bigIntegerC = b.c("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B");
        BigInteger bigIntegerC2 = b.c("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE");
        byte[] bArrA = org.bouncycastle.f.a.f.a("10B7B4D696E676875615175137C8A16FD0DA2211");
        BigInteger bigIntegerC3 = b.c("010000000000000000000000015AAB561B005413CCD4EE99D5");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        org.bouncycastle.d.a.d dVarA = b.a(new d$d(193, 15, bigIntegerC, bigIntegerC2, bigIntegerC3, bigIntegerValueOf));
        return new org.bouncycastle.a.aa.ad(dVarA, new org.bouncycastle.a.aa.af(dVarA, org.bouncycastle.f.a.f.a("0400D9B67D192E0367C803F39E1A7E82CA14A651350AAE617E8F01CE94335607C304AC29E7DEFBD9CA01F596F927224CDECF6C")), bigIntegerC3, bigIntegerValueOf, bArrA);
    }
}
