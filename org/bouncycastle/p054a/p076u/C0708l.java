package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.u.l */
/* JADX INFO: loaded from: classes.dex */
final class C0708l extends AbstractC0508ae {
    C0708l() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerM1706c = C0698b.m1706c("07A11B09A76B562144418FF3FF8C2570B8");
        BigInteger bigIntegerM1706c2 = C0698b.m1706c("0217C05610884B63B9C6C7291678F9D341");
        byte[] bArrM4106a = C1541f.m4106a("4D696E676875615175985BD3ADBADA21B43A97E2");
        BigInteger bigIntegerM1706c3 = C0698b.m1706c("0400000000000000023123953A9464B54D");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        AbstractC1381d abstractC1381dM1701a = C0698b.m1701a(new AbstractC1381d.d(131, 2, 3, 8, bigIntegerM1706c, bigIntegerM1706c2, bigIntegerM1706c3, bigIntegerValueOf));
        return new C0507ad(abstractC1381dM1701a, new C0509af(abstractC1381dM1701a, C1541f.m4106a("040081BAF91FDF9833C40F9C181343638399078C6E7EA38C001F73C8134B1B4EF9E150")), bigIntegerM1706c3, bigIntegerValueOf, bArrM4106a);
    }
}
