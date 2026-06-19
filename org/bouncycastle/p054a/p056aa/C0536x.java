package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.x */
/* JADX INFO: loaded from: classes.dex */
final class C0536x extends AbstractC0508ae {
    C0536x() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("7fffffffffffffffffffffff7fffff975deb41b3a6057c3c432146526551", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        AbstractC1381d.e eVar = new AbstractC1381d.e(new BigInteger("883423532389192164791648750360308885314476597252960362792450860609699839"), new BigInteger("7fffffffffffffffffffffff7fffffffffff8000000000007ffffffffffc", 16), new BigInteger("255705fa2a306654b1f4cb03d6a750a30c250102d4988717d9ba15ab6d3e", 16), bigInteger, bigIntegerValueOf);
        return new C0507ad(eVar, new C0509af(eVar, C1541f.m4106a("036768ae8e18bb92cfcf005c949aa2c6d94853d0e660bbf854b1c9505fe95a")), bigInteger, bigIntegerValueOf, C1541f.m4106a("7d7374168ffe3471b60a857686a19475d3bfa2ff"));
    }
}
