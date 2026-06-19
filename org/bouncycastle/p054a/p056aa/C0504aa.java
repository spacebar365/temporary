package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.aa */
/* JADX INFO: loaded from: classes.dex */
final class C0504aa extends AbstractC0508ae {
    C0504aa() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("03FFFFFFFFFFFFFFFFFFFDF64DE1151ADBB78F10A7", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        AbstractC1381d.d dVar = new AbstractC1381d.d(163, 1, 2, 8, new BigInteger("0108B39E77C4B108BED981ED0E890E117C511CF072", 16), new BigInteger("0667ACEB38AF4E488C407433FFAE4F1C811638DF20", 16), bigInteger, bigIntegerValueOf);
        return new C0507ad(dVar, new C0509af(dVar, C1541f.m4106a("030024266E4EB5106D0A964D92C4860E2671DB9B6CC5")), bigInteger, bigIntegerValueOf, (byte[]) null);
    }
}
