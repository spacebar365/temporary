package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.j */
/* JADX INFO: loaded from: classes.dex */
final class C0522j extends AbstractC0508ae {
    C0522j() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("155555555555555555555555610C0B196812BFB6288A3EA3", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(6L);
        AbstractC1381d.d dVar = new AbstractC1381d.d(191, 9, new BigInteger("6C01074756099122221056911C77D77E77A777E7E7E77FCB", 16), new BigInteger("71FE1AF926CF847989EFEF8DB459F66394D90F32AD3F15E8", 16), bigInteger, bigIntegerValueOf);
        return new C0507ad(dVar, new C0509af(dVar, C1541f.m4106a("03375D4CE24FDE434489DE8746E71786015009E66E38A926DD")), bigInteger, bigIntegerValueOf, (byte[]) null);
    }
}
