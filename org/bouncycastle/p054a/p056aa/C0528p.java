package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.p */
/* JADX INFO: loaded from: classes.dex */
final class C0528p extends AbstractC0508ae {
    C0528p() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("fffffffffffffffffffffffe5fb1a724dc80418648d8dd31", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        AbstractC1381d.e eVar = new AbstractC1381d.e(new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF", 16), new BigInteger("fffffffffffffffffffffffffffffffefffffffffffffffc", 16), new BigInteger("cc22d6dfb95c6b25e49c0d6364a4e5980c393aa21668d953", 16), bigInteger, bigIntegerValueOf);
        return new C0507ad(eVar, new C0509af(eVar, C1541f.m4106a("03eea2bae7e1497842f2de7769cfe9c989c072ad696f48034a")), bigInteger, bigIntegerValueOf, C1541f.m4106a("31a92ee2029fd10d901b113e990710f0d21ac6b6"));
    }
}
