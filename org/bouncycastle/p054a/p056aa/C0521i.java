package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.i */
/* JADX INFO: loaded from: classes.dex */
final class C0521i extends AbstractC0508ae {
    C0521i() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("20000000000000000000000050508CB89F652824E06B8173", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(4L);
        AbstractC1381d.d dVar = new AbstractC1381d.d(191, 9, new BigInteger("401028774D7777C7B7666D1366EA432071274F89FF01E718", 16), new BigInteger("0620048D28BCBD03B6249C99182B7C8CD19700C362C46A01", 16), bigInteger, bigIntegerValueOf);
        return new C0507ad(dVar, new C0509af(dVar, C1541f.m4106a("023809B2B7CC1B28CC5A87926AAD83FD28789E81E2C9E3BF10")), bigInteger, bigIntegerValueOf, (byte[]) null);
    }
}
