package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.h */
/* JADX INFO: loaded from: classes.dex */
final class C0520h extends AbstractC0508ae {
    C0520h() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("40000000000000000000000004A20E90C39067C893BBB9A5", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        AbstractC1381d.d dVar = new AbstractC1381d.d(191, 9, new BigInteger("2866537B676752636A68F56554E12640276B649EF7526267", 16), new BigInteger("2E45EF571F00786F67B0081B9495A3D95462F5DE0AA185EC", 16), bigInteger, bigIntegerValueOf);
        return new C0507ad(dVar, new C0509af(dVar, C1541f.m4106a("0236B3DAF8A23206F9C4F299D7B21A9C369137F2C84AE1AA0D")), bigInteger, bigIntegerValueOf, C1541f.m4106a("4E13CA542744D696E67687561517552F279A8C84"));
    }
}
