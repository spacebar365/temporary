package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.k */
/* JADX INFO: loaded from: classes.dex */
final class C0523k extends AbstractC0508ae {
    C0523k() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("0101BAF95C9723C57B6C21DA2EFF2D5ED588BDD5717E212F9D", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(65096L);
        AbstractC1381d.d dVar = new AbstractC1381d.d(208, 1, 2, 83, new BigInteger("0", 16), new BigInteger("00C8619ED45A62E6212E1160349E2BFA844439FAFC2A3FD1638F9E", 16), bigInteger, bigIntegerValueOf);
        return new C0507ad(dVar, new C0509af(dVar, C1541f.m4106a("0289FDFBE4ABE193DF9559ECF07AC0CE78554E2784EB8C1ED1A57A")), bigInteger, bigIntegerValueOf, (byte[]) null);
    }
}
