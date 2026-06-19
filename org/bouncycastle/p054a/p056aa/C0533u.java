package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.u */
/* JADX INFO: loaded from: classes.dex */
final class C0533u extends AbstractC0508ae {
    C0533u() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("ffffffffffffffffffffffff7a62d031c83f4294f640ec13", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
        AbstractC1381d.e eVar = new AbstractC1381d.e(new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF", 16), new BigInteger("fffffffffffffffffffffffffffffffefffffffffffffffc", 16), new BigInteger("22123dc2395a05caa7423daeccc94760a7d462256bd56916", 16), bigInteger, bigIntegerValueOf);
        return new C0507ad(eVar, new C0509af(eVar, C1541f.m4106a("027d29778100c65a1da1783716588dce2b8b4aee8e228f1896")), bigInteger, bigIntegerValueOf, C1541f.m4106a("c469684435deb378c4b65ca9591e2a5763059a2e"));
    }
}
