package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.y */
/* JADX INFO: loaded from: classes.dex */
final class C0537y extends AbstractC0508ae {
    C0537y() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("ffffffff00000000ffffffffffffffffbce6faada7179e84f3b9cac2fc632551", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        AbstractC1381d.e eVar = new AbstractC1381d.e(new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853951"), new BigInteger("ffffffff00000001000000000000000000000000fffffffffffffffffffffffc", 16), new BigInteger("5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", 16), bigInteger, bigIntegerValueOf);
        return new C0507ad(eVar, new C0509af(eVar, C1541f.m4106a("036b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296")), bigInteger, bigIntegerValueOf, C1541f.m4106a("c49d360886e704936a6678e1139d26b7819f7e90"));
    }
}
