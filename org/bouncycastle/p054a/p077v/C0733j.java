package org.bouncycastle.p054a.p077v;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.v.j */
/* JADX INFO: loaded from: classes.dex */
final class C0733j extends AbstractC0508ae {
    C0733j() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("C302F41D932A36CDA7A3462F9E9E916B5BE8F1029AC4ACC1", 16);
        BigInteger bigInteger2 = new BigInteger("01", 16);
        AbstractC1381d abstractC1381dM1714a = C0724a.m1714a(new AbstractC1381d.e(new BigInteger("C302F41D932A36CDA7A3463093D18DB78FCE476DE1A86297", 16), new BigInteger("C302F41D932A36CDA7A3463093D18DB78FCE476DE1A86294", 16), new BigInteger("13D56FFAEC78681E68F9DEB43B35BEC2FB68542E27897B79", 16), bigInteger, bigInteger2));
        return new C0507ad(abstractC1381dM1714a, new C0509af(abstractC1381dM1714a, C1541f.m4106a("043AE9E58C82F63C30282E1FE7BBF43FA72C446AF6F4618129097E2C5667C2223A902AB5CA449D0084B7E5B3DE7CCC01C9")), bigInteger, bigInteger2);
    }
}
