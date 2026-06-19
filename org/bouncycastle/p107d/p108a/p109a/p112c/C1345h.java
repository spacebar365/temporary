package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1418e;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1345h extends AbstractC1389j.b {
    public C1345h(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        this(abstractC1381d, abstractC1386g, abstractC1386g2, false);
    }

    public C1345h(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        super(abstractC1381d, abstractC1386g, abstractC1386g2);
        if ((abstractC1386g == null) != (abstractC1386g2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f5081f = z;
    }

    C1345h(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
        super(abstractC1381d, abstractC1386g, abstractC1386g2, abstractC1386gArr);
        this.f5081f = z;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: d */
    public final AbstractC1389j mo2947d(AbstractC1389j abstractC1389j) {
        return this == abstractC1389j ? mo2951u() : !m3469p() ? abstractC1389j.m3469p() ? mo2950t() : !this.f5079d.mo2940j() ? mo2950t().mo2946b(abstractC1389j) : abstractC1389j : abstractC1389j;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: e */
    protected final AbstractC1389j mo2948e() {
        return new C1345h(null, m3461g(), m3462h());
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: s */
    public final AbstractC1389j mo2949s() {
        return m3469p() ? this : new C1345h(this.f5077b, this.f5078c, this.f5079d.mo2934d(), this.f5080e, this.f5081f);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: u */
    public final AbstractC1389j mo2951u() {
        return (m3469p() || this.f5079d.mo2940j()) ? this : mo2950t().mo2946b(this);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: b */
    public final AbstractC1389j mo2946b(AbstractC1389j abstractC1389j) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (m3469p()) {
            return abstractC1389j;
        }
        if (abstractC1389j.m3469p()) {
            return this;
        }
        if (this == abstractC1389j) {
            return mo2950t();
        }
        AbstractC1381d abstractC1381dD = m3459d();
        C1354q c1354q = (C1354q) this.f5078c;
        C1354q c1354q2 = (C1354q) this.f5079d;
        C1354q c1354q3 = (C1354q) abstractC1389j.m3463i();
        C1354q c1354q4 = (C1354q) abstractC1389j.mo3061j();
        C1354q c1354q5 = (C1354q) this.f5080e[0];
        C1354q c1354q6 = (C1354q) abstractC1389j.mo2945a(0);
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[5];
        int[] iArr7 = new int[5];
        int[] iArr8 = new int[5];
        boolean zMo2939i = c1354q5.mo2939i();
        if (zMo2939i) {
            int[] iArr9 = c1354q3.f4947b;
            iArr = c1354q4.f4947b;
            iArr2 = iArr9;
        } else {
            C1353p.m3228d(c1354q5.f4947b, iArr7);
            C1353p.m3225b(iArr7, c1354q3.f4947b, iArr6);
            C1353p.m3225b(iArr7, c1354q5.f4947b, iArr7);
            C1353p.m3225b(iArr7, c1354q4.f4947b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zMo2939i2 = c1354q6.mo2939i();
        if (zMo2939i2) {
            int[] iArr10 = c1354q.f4947b;
            iArr3 = c1354q2.f4947b;
            iArr4 = iArr10;
        } else {
            C1353p.m3228d(c1354q6.f4947b, iArr8);
            C1353p.m3225b(iArr8, c1354q.f4947b, iArr5);
            C1353p.m3225b(iArr8, c1354q6.f4947b, iArr8);
            C1353p.m3225b(iArr8, c1354q2.f4947b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[5];
        C1353p.m3229d(iArr4, iArr2, iArr11);
        C1353p.m3229d(iArr3, iArr, iArr6);
        if (AbstractC1418e.m3622b(iArr11)) {
            return AbstractC1418e.m3622b(iArr6) ? mo2950t() : abstractC1381dD.mo2912e();
        }
        C1353p.m3228d(iArr11, iArr7);
        int[] iArr12 = new int[5];
        C1353p.m3225b(iArr7, iArr11, iArr12);
        C1353p.m3225b(iArr7, iArr4, iArr7);
        C1353p.m3224b(iArr12, iArr12);
        AbstractC1418e.m3626c(iArr3, iArr12, iArr5);
        C1353p.m3219a(AbstractC1418e.m3621b(iArr7, iArr7, iArr12), iArr12);
        C1354q c1354q7 = new C1354q(iArr8);
        C1353p.m3228d(iArr6, c1354q7.f4947b);
        C1353p.m3229d(c1354q7.f4947b, iArr12, c1354q7.f4947b);
        C1354q c1354q8 = new C1354q(iArr12);
        C1353p.m3229d(iArr7, c1354q7.f4947b, c1354q8.f4947b);
        C1353p.m3227c(c1354q8.f4947b, iArr6, iArr5);
        C1353p.m3226c(iArr5, c1354q8.f4947b);
        C1354q c1354q9 = new C1354q(iArr11);
        if (!zMo2939i) {
            C1353p.m3225b(c1354q9.f4947b, c1354q5.f4947b, c1354q9.f4947b);
        }
        if (!zMo2939i2) {
            C1353p.m3225b(c1354q9.f4947b, c1354q6.f4947b, c1354q9.f4947b);
        }
        return new C1345h(abstractC1381dD, c1354q7, c1354q8, new AbstractC1386g[]{c1354q9}, this.f5081f);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: t */
    public final AbstractC1389j mo2950t() {
        if (m3469p()) {
            return this;
        }
        AbstractC1381d abstractC1381dD = m3459d();
        C1354q c1354q = (C1354q) this.f5079d;
        if (c1354q.mo2940j()) {
            return abstractC1381dD.mo2912e();
        }
        C1354q c1354q2 = (C1354q) this.f5078c;
        C1354q c1354q3 = (C1354q) this.f5080e[0];
        int[] iArr = new int[5];
        C1353p.m3228d(c1354q.f4947b, iArr);
        int[] iArr2 = new int[5];
        C1353p.m3228d(iArr, iArr2);
        int[] iArr3 = new int[5];
        C1353p.m3228d(c1354q2.f4947b, iArr3);
        C1353p.m3219a(AbstractC1418e.m3621b(iArr3, iArr3, iArr3), iArr3);
        C1353p.m3225b(iArr, c1354q2.f4947b, iArr);
        C1353p.m3219a(AbstractC1416c.m3600e(5, iArr, 0), iArr);
        int[] iArr4 = new int[5];
        C1353p.m3219a(AbstractC1416c.m3585b(5, iArr2, 0, iArr4), iArr4);
        C1354q c1354q4 = new C1354q(iArr2);
        C1353p.m3228d(iArr3, c1354q4.f4947b);
        C1353p.m3229d(c1354q4.f4947b, iArr, c1354q4.f4947b);
        C1353p.m3229d(c1354q4.f4947b, iArr, c1354q4.f4947b);
        C1354q c1354q5 = new C1354q(iArr);
        C1353p.m3229d(iArr, c1354q4.f4947b, c1354q5.f4947b);
        C1353p.m3225b(c1354q5.f4947b, iArr3, c1354q5.f4947b);
        C1353p.m3229d(c1354q5.f4947b, iArr4, c1354q5.f4947b);
        C1354q c1354q6 = new C1354q(iArr3);
        C1353p.m3230e(c1354q.f4947b, c1354q6.f4947b);
        if (!c1354q3.mo2939i()) {
            C1353p.m3225b(c1354q6.f4947b, c1354q3.f4947b, c1354q6.f4947b);
        }
        return new C1345h(abstractC1381dD, c1354q4, c1354q5, new AbstractC1386g[]{c1354q6}, this.f5081f);
    }
}
