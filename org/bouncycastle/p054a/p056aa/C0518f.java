package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.f */
/* JADX INFO: loaded from: classes.dex */
final class C0518f extends AbstractC0508ae {
    C0518f() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("03FFFFFFFFFFFFFFFFFFFE1AEE140F110AFF961309", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        AbstractC1381d.d dVar = new AbstractC1381d.d(163, 1, 2, 8, new BigInteger("07A526C63D3E25A256A007699F5447E32AE456B50E", 16), new BigInteger("03F7061798EB99E238FD6F1BF95B48FEEB4854252B", 16), bigInteger, bigIntegerValueOf);
        return new C0507ad(dVar, new C0509af(dVar, C1541f.m4106a("0202F9F87B7C574D0BDECF8A22E6524775F98CDEBDCB")), bigInteger, bigIntegerValueOf, (byte[]) null);
    }
}
