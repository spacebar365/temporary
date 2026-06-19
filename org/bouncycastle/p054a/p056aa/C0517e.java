package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.e */
/* JADX INFO: loaded from: classes.dex */
final class C0517e extends AbstractC0508ae {
    C0517e() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("ffffffffffffffffffffffff99def836146bc9b1b4d22831", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        AbstractC1381d.e eVar = new AbstractC1381d.e(new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF", 16), new BigInteger("fffffffffffffffffffffffffffffffefffffffffffffffc", 16), new BigInteger("64210519e59c80e70fa7e9ab72243049feb8deecc146b9b1", 16), bigInteger, bigIntegerValueOf);
        return new C0507ad(eVar, new C0509af(eVar, C1541f.m4106a("03188da80eb03090f67cbf20eb43a18800f4ff0afd82ff1012")), bigInteger, bigIntegerValueOf, C1541f.m4106a("3045AE6FC8422f64ED579528D38120EAE12196D5"));
    }
}
