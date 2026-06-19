package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.g */
/* JADX INFO: loaded from: classes.dex */
final class C0519g extends AbstractC0508ae {
    C0519g() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("010092537397ECA4F6145799D62B0A19CE06FE26AD", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(65390L);
        AbstractC1381d.d dVar = new AbstractC1381d.d(176, 1, 2, 43, new BigInteger("00E4E6DB2995065C407D9D39B8D0967B96704BA8E9C90B", 16), new BigInteger("005DDA470ABE6414DE8EC133AE28E9BBD7FCEC0AE0FFF2", 16), bigInteger, bigIntegerValueOf);
        return new C0507ad(dVar, new C0509af(dVar, C1541f.m4106a("038D16C2866798B600F9F08BB4A8E860F3298CE04A5798")), bigInteger, bigIntegerValueOf, (byte[]) null);
    }
}
