package org.bouncycastle.a.u;

import java.math.BigInteger;
import org.bouncycastle.d.a.d$d;

/* JADX INFO: loaded from: classes.dex */
final class l extends org.bouncycastle.a.aa.ae {
    l() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final org.bouncycastle.a.aa.ad a() {
        BigInteger bigIntegerC = b.c("07A11B09A76B562144418FF3FF8C2570B8");
        BigInteger bigIntegerC2 = b.c("0217C05610884B63B9C6C7291678F9D341");
        byte[] bArrA = org.bouncycastle.f.a.f.a("4D696E676875615175985BD3ADBADA21B43A97E2");
        BigInteger bigIntegerC3 = b.c("0400000000000000023123953A9464B54D");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        org.bouncycastle.d.a.d dVarA = b.a(new d$d(131, 2, 3, 8, bigIntegerC, bigIntegerC2, bigIntegerC3, bigIntegerValueOf));
        return new org.bouncycastle.a.aa.ad(dVarA, new org.bouncycastle.a.aa.af(dVarA, org.bouncycastle.f.a.f.a("040081BAF91FDF9833C40F9C181343638399078C6E7EA38C001F73C8134B1B4EF9E150")), bigIntegerC3, bigIntegerValueOf, bArrA);
    }
}
