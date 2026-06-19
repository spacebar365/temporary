package org.bouncycastle.p054a.p064i;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.i.b */
/* JADX INFO: loaded from: classes.dex */
final class C0631b extends AbstractC0508ae {
    C0631b() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigIntegerM1533c = C0630a.m1533c("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF");
        BigInteger bigIntegerM1533c2 = C0630a.m1533c("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC");
        BigInteger bigIntegerM1533c3 = C0630a.m1533c("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93");
        BigInteger bigIntegerM1533c4 = C0630a.m1533c("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        AbstractC1381d abstractC1381dM1529a = C0630a.m1529a(new AbstractC1381d.e(bigIntegerM1533c, bigIntegerM1533c2, bigIntegerM1533c3, bigIntegerM1533c4, bigIntegerValueOf));
        return new C0507ad(abstractC1381dM1529a, new C0509af(abstractC1381dM1529a, C1541f.m4106a("0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0")), bigIntegerM1533c4, bigIntegerValueOf, (byte[]) null);
    }
}
