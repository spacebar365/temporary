package org.bouncycastle.p107d.p108a;

import java.math.BigInteger;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1223a implements InterfaceC1388i {
    /* JADX INFO: renamed from: b */
    protected abstract AbstractC1389j mo2904b(AbstractC1389j abstractC1389j, BigInteger bigInteger);

    @Override // org.bouncycastle.p107d.p108a.InterfaceC1388i
    /* JADX INFO: renamed from: a */
    public final AbstractC1389j mo2903a(AbstractC1389j abstractC1389j, BigInteger bigInteger) {
        int iSignum = bigInteger.signum();
        if (iSignum == 0 || abstractC1389j.m3469p()) {
            return abstractC1389j.m3459d().mo2912e();
        }
        AbstractC1389j abstractC1389jMo2904b = mo2904b(abstractC1389j, bigInteger.abs());
        if (iSignum <= 0) {
            abstractC1389jMo2904b = abstractC1389jMo2904b.mo2949s();
        }
        return C1371b.m3272a(abstractC1389jMo2904b);
    }
}
