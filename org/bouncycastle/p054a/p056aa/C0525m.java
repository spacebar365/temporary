package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.m */
/* JADX INFO: loaded from: classes.dex */
final class C0525m extends AbstractC0508ae {
    C0525m() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("1555555555555555555555555555553C6F2885259C31E3FCDF154624522D", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(6L);
        AbstractC1381d.d dVar = new AbstractC1381d.d(239, 36, new BigInteger("4230017757A767FAE42398569B746325D45313AF0766266479B75654E65F", 16), new BigInteger("5037EA654196CFF0CD82B2C14A2FCF2E3FF8775285B545722F03EACDB74B", 16), bigInteger, bigIntegerValueOf);
        return new C0507ad(dVar, new C0509af(dVar, C1541f.m4106a("0228F9D04E900069C8DC47A08534FE76D2B900B7D7EF31F5709F200C4CA205")), bigInteger, bigIntegerValueOf, (byte[]) null);
    }
}
