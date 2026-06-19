package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1418e;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1350m extends AbstractC1389j.b {
    public C1350m(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        this(abstractC1381d, abstractC1386g, abstractC1386g2, false);
    }

    public C1350m(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        super(abstractC1381d, abstractC1386g, abstractC1386g2);
        if ((abstractC1386g == null) != (abstractC1386g2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f5081f = z;
    }

    C1350m(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
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
        return new C1350m(null, m3461g(), m3462h());
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: s */
    public final AbstractC1389j mo2949s() {
        return m3469p() ? this : new C1350m(this.f5077b, this.f5078c, this.f5079d.mo2934d(), this.f5080e, this.f5081f);
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
        C1349l c1349l = (C1349l) this.f5078c;
        C1349l c1349l2 = (C1349l) this.f5079d;
        C1349l c1349l3 = (C1349l) abstractC1389j.m3463i();
        C1349l c1349l4 = (C1349l) abstractC1389j.mo3061j();
        C1349l c1349l5 = (C1349l) this.f5080e[0];
        C1349l c1349l6 = (C1349l) abstractC1389j.mo2945a(0);
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[5];
        int[] iArr7 = new int[5];
        int[] iArr8 = new int[5];
        boolean zMo2939i = c1349l5.mo2939i();
        if (zMo2939i) {
            int[] iArr9 = c1349l3.f4937b;
            iArr = c1349l4.f4937b;
            iArr2 = iArr9;
        } else {
            C1348k.m3216d(c1349l5.f4937b, iArr7);
            C1348k.m3213b(iArr7, c1349l3.f4937b, iArr6);
            C1348k.m3213b(iArr7, c1349l5.f4937b, iArr7);
            C1348k.m3213b(iArr7, c1349l4.f4937b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zMo2939i2 = c1349l6.mo2939i();
        if (zMo2939i2) {
            int[] iArr10 = c1349l.f4937b;
            iArr3 = c1349l2.f4937b;
            iArr4 = iArr10;
        } else {
            C1348k.m3216d(c1349l6.f4937b, iArr8);
            C1348k.m3213b(iArr8, c1349l.f4937b, iArr5);
            C1348k.m3213b(iArr8, c1349l6.f4937b, iArr8);
            C1348k.m3213b(iArr8, c1349l2.f4937b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[5];
        C1348k.m3217d(iArr4, iArr2, iArr11);
        C1348k.m3217d(iArr3, iArr, iArr6);
        if (AbstractC1418e.m3622b(iArr11)) {
            return AbstractC1418e.m3622b(iArr6) ? mo2950t() : abstractC1381dD.mo2912e();
        }
        C1348k.m3216d(iArr11, iArr7);
        int[] iArr12 = new int[5];
        C1348k.m3213b(iArr7, iArr11, iArr12);
        C1348k.m3213b(iArr7, iArr4, iArr7);
        C1348k.m3212b(iArr12, iArr12);
        AbstractC1418e.m3626c(iArr3, iArr12, iArr5);
        C1348k.m3207a(AbstractC1418e.m3621b(iArr7, iArr7, iArr12), iArr12);
        C1349l c1349l7 = new C1349l(iArr8);
        C1348k.m3216d(iArr6, c1349l7.f4937b);
        C1348k.m3217d(c1349l7.f4937b, iArr12, c1349l7.f4937b);
        C1349l c1349l8 = new C1349l(iArr12);
        C1348k.m3217d(iArr7, c1349l7.f4937b, c1349l8.f4937b);
        C1348k.m3215c(c1349l8.f4937b, iArr6, iArr5);
        C1348k.m3214c(iArr5, c1349l8.f4937b);
        C1349l c1349l9 = new C1349l(iArr11);
        if (!zMo2939i) {
            C1348k.m3213b(c1349l9.f4937b, c1349l5.f4937b, c1349l9.f4937b);
        }
        if (!zMo2939i2) {
            C1348k.m3213b(c1349l9.f4937b, c1349l6.f4937b, c1349l9.f4937b);
        }
        return new C1350m(abstractC1381dD, c1349l7, c1349l8, new AbstractC1386g[]{c1349l9}, this.f5081f);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: t */
    public final AbstractC1389j mo2950t() {
        if (m3469p()) {
            return this;
        }
        AbstractC1381d abstractC1381dD = m3459d();
        C1349l c1349l = (C1349l) this.f5079d;
        if (c1349l.mo2940j()) {
            return abstractC1381dD.mo2912e();
        }
        C1349l c1349l2 = (C1349l) this.f5078c;
        C1349l c1349l3 = (C1349l) this.f5080e[0];
        int[] iArr = new int[5];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        C1348k.m3216d(c1349l.f4937b, iArr3);
        int[] iArr4 = new int[5];
        C1348k.m3216d(iArr3, iArr4);
        boolean zMo2939i = c1349l3.mo2939i();
        int[] iArr5 = c1349l3.f4937b;
        if (!zMo2939i) {
            C1348k.m3216d(c1349l3.f4937b, iArr2);
            iArr5 = iArr2;
        }
        C1348k.m3217d(c1349l2.f4937b, iArr5, iArr);
        C1348k.m3210a(c1349l2.f4937b, iArr5, iArr2);
        C1348k.m3213b(iArr2, iArr, iArr2);
        C1348k.m3207a(AbstractC1418e.m3621b(iArr2, iArr2, iArr2), iArr2);
        C1348k.m3213b(iArr3, c1349l2.f4937b, iArr3);
        C1348k.m3207a(AbstractC1416c.m3600e(5, iArr3, 0), iArr3);
        C1348k.m3207a(AbstractC1416c.m3585b(5, iArr4, 0, iArr), iArr);
        C1349l c1349l4 = new C1349l(iArr4);
        C1348k.m3216d(iArr2, c1349l4.f4937b);
        C1348k.m3217d(c1349l4.f4937b, iArr3, c1349l4.f4937b);
        C1348k.m3217d(c1349l4.f4937b, iArr3, c1349l4.f4937b);
        C1349l c1349l5 = new C1349l(iArr3);
        C1348k.m3217d(iArr3, c1349l4.f4937b, c1349l5.f4937b);
        C1348k.m3213b(c1349l5.f4937b, iArr2, c1349l5.f4937b);
        C1348k.m3217d(c1349l5.f4937b, iArr, c1349l5.f4937b);
        C1349l c1349l6 = new C1349l(iArr2);
        C1348k.m3218e(c1349l.f4937b, c1349l6.f4937b);
        if (!zMo2939i) {
            C1348k.m3213b(c1349l6.f4937b, c1349l3.f4937b, c1349l6.f4937b);
        }
        return new C1350m(abstractC1381dD, c1349l4, c1349l5, new AbstractC1386g[]{c1349l6}, this.f5081f);
    }
}
