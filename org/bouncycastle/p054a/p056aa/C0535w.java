package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.w */
/* JADX INFO: loaded from: classes.dex */
final class C0535w extends AbstractC0508ae {
    C0535w() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("7fffffffffffffffffffffff800000cfa7e8594377d414c03821bc582063", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        AbstractC1381d.e eVar = new AbstractC1381d.e(new BigInteger("883423532389192164791648750360308885314476597252960362792450860609699839"), new BigInteger("7fffffffffffffffffffffff7fffffffffff8000000000007ffffffffffc", 16), new BigInteger("617fab6832576cbbfed50d99f0249c3fee58b94ba0038c7ae84c8c832f2c", 16), bigInteger, bigIntegerValueOf);
        return new C0507ad(eVar, new C0509af(eVar, C1541f.m4106a("0238af09d98727705120c921bb5e9e26296a3cdcf2f35757a0eafd87b830e7")), bigInteger, bigIntegerValueOf, C1541f.m4106a("e8b4011604095303ca3b8099982be09fcb9ae616"));
    }
}
