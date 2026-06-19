package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.v */
/* JADX INFO: loaded from: classes.dex */
final class C0534v extends AbstractC0508ae {
    C0534v() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("7fffffffffffffffffffffff7fffff9e5e9a9f5d9071fbd1522688909d0b", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        AbstractC1381d.e eVar = new AbstractC1381d.e(new BigInteger("883423532389192164791648750360308885314476597252960362792450860609699839"), new BigInteger("7fffffffffffffffffffffff7fffffffffff8000000000007ffffffffffc", 16), new BigInteger("6b016c3bdcf18941d0d654921475ca71a9db2fb27d1d37796185c2942c0a", 16), bigInteger, bigIntegerValueOf);
        return new C0507ad(eVar, new C0509af(eVar, C1541f.m4106a("020ffa963cdca8816ccc33b8642bedf905c3d358573d3f27fbbd3b3cb9aaaf")), bigInteger, bigIntegerValueOf, C1541f.m4106a("e43bb460f0b80cc0c0b075798e948060f8321b7d"));
    }
}
