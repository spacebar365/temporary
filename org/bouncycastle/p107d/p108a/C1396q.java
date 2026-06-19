package org.bouncycastle.p107d.p108a;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.p113b.InterfaceC1373b;

/* JADX INFO: renamed from: org.bouncycastle.d.a.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1396q extends AbstractC1223a {

    /* JADX INFO: renamed from: a */
    protected final AbstractC1381d f5091a;

    /* JADX INFO: renamed from: b */
    protected final InterfaceC1373b f5092b;

    public C1396q(AbstractC1381d abstractC1381d, InterfaceC1373b interfaceC1373b) {
        if (abstractC1381d.m3368i() == null) {
            throw new IllegalArgumentException("Need curve with known group order");
        }
        this.f5091a = abstractC1381d;
        this.f5092b = interfaceC1373b;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1223a
    /* JADX INFO: renamed from: b */
    protected final AbstractC1389j mo2904b(AbstractC1389j abstractC1389j, BigInteger bigInteger) {
        if (!this.f5091a.m3362a(abstractC1389j.m3459d())) {
            throw new IllegalStateException();
        }
        BigInteger[] bigIntegerArrMo3282a = this.f5092b.mo3282a(bigInteger.mod(abstractC1389j.m3459d().m3368i()));
        return C1371b.m3275a(abstractC1389j, bigIntegerArrMo3282a[0], this.f5092b.mo3281a(), bigIntegerArrMo3282a[1]);
    }
}
