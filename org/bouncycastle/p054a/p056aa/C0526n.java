package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.n */
/* JADX INFO: loaded from: classes.dex */
final class C0526n extends AbstractC0508ae {
    C0526n() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("0CCCCCCCCCCCCCCCCCCCCCCCCCCCCCAC4912D2D9DF903EF9888B8A0E4CFF", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(10L);
        AbstractC1381d.d dVar = new AbstractC1381d.d(239, 36, new BigInteger("01238774666A67766D6676F778E676B66999176666E687666D8766C66A9F", 16), new BigInteger("6A941977BA9F6A435199ACFC51067ED587F519C5ECB541B8E44111DE1D40", 16), bigInteger, bigIntegerValueOf);
        return new C0507ad(dVar, new C0509af(dVar, C1541f.m4106a("0370F6E9D04D289C4E89913CE3530BFDE903977D42B146D539BF1BDE4E9C92")), bigInteger, bigIntegerValueOf, (byte[]) null);
    }
}
