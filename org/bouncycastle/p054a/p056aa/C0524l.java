package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.l */
/* JADX INFO: loaded from: classes.dex */
final class C0524l extends AbstractC0508ae {
    C0524l() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("2000000000000000000000000000000F4D42FFE1492A4993F1CAD666E447", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(4L);
        AbstractC1381d.d dVar = new AbstractC1381d.d(239, 36, new BigInteger("32010857077C5431123A46B808906756F543423E8D27877578125778AC76", 16), new BigInteger("790408F2EEDAF392B012EDEFB3392F30F4327C0CA3F31FC383C422AA8C16", 16), bigInteger, bigIntegerValueOf);
        return new C0507ad(dVar, new C0509af(dVar, C1541f.m4106a("0257927098FA932E7C0A96D3FD5B706EF7E5F5C156E16B7E7C86038552E91D")), bigInteger, bigIntegerValueOf, (byte[]) null);
    }
}
