package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1420g;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.ag */
/* JADX INFO: loaded from: classes.dex */
public final class C1241ag extends AbstractC1389j.b {
    public C1241ag(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        this(abstractC1381d, abstractC1386g, abstractC1386g2, false);
    }

    public C1241ag(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        super(abstractC1381d, abstractC1386g, abstractC1386g2);
        if ((abstractC1386g == null) != (abstractC1386g2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f5081f = z;
    }

    C1241ag(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
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
        return new C1241ag(null, m3461g(), m3462h());
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: s */
    public final AbstractC1389j mo2949s() {
        return m3469p() ? this : new C1241ag(this.f5077b, this.f5078c, this.f5079d.mo2934d(), this.f5080e, this.f5081f);
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
        C1240af c1240af = (C1240af) this.f5078c;
        C1240af c1240af2 = (C1240af) this.f5079d;
        C1240af c1240af3 = (C1240af) abstractC1389j.m3463i();
        C1240af c1240af4 = (C1240af) abstractC1389j.mo3061j();
        C1240af c1240af5 = (C1240af) this.f5080e[0];
        C1240af c1240af6 = (C1240af) abstractC1389j.mo2945a(0);
        int[] iArr5 = new int[14];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        boolean zMo2939i = c1240af5.mo2939i();
        if (zMo2939i) {
            int[] iArr9 = c1240af3.f4780b;
            iArr = c1240af4.f4780b;
            iArr2 = iArr9;
        } else {
            C1239ae.m2974d(c1240af5.f4780b, iArr7);
            C1239ae.m2971b(iArr7, c1240af3.f4780b, iArr6);
            C1239ae.m2971b(iArr7, c1240af5.f4780b, iArr7);
            C1239ae.m2971b(iArr7, c1240af4.f4780b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zMo2939i2 = c1240af6.mo2939i();
        if (zMo2939i2) {
            int[] iArr10 = c1240af.f4780b;
            iArr3 = c1240af2.f4780b;
            iArr4 = iArr10;
        } else {
            C1239ae.m2974d(c1240af6.f4780b, iArr8);
            C1239ae.m2971b(iArr8, c1240af.f4780b, iArr5);
            C1239ae.m2971b(iArr8, c1240af6.f4780b, iArr8);
            C1239ae.m2971b(iArr8, c1240af2.f4780b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[7];
        C1239ae.m2975d(iArr4, iArr2, iArr11);
        C1239ae.m2975d(iArr3, iArr, iArr6);
        if (AbstractC1420g.m3668b(iArr11)) {
            return AbstractC1420g.m3668b(iArr6) ? mo2950t() : abstractC1381dD.mo2912e();
        }
        C1239ae.m2974d(iArr11, iArr7);
        int[] iArr12 = new int[7];
        C1239ae.m2971b(iArr7, iArr11, iArr12);
        C1239ae.m2971b(iArr7, iArr4, iArr7);
        C1239ae.m2970b(iArr12, iArr12);
        AbstractC1420g.m3671c(iArr3, iArr12, iArr5);
        C1239ae.m2965a(AbstractC1420g.m3667b(iArr7, iArr7, iArr12), iArr12);
        C1240af c1240af7 = new C1240af(iArr8);
        C1239ae.m2974d(iArr6, c1240af7.f4780b);
        C1239ae.m2975d(c1240af7.f4780b, iArr12, c1240af7.f4780b);
        C1240af c1240af8 = new C1240af(iArr12);
        C1239ae.m2975d(iArr7, c1240af7.f4780b, c1240af8.f4780b);
        C1239ae.m2973c(c1240af8.f4780b, iArr6, iArr5);
        C1239ae.m2972c(iArr5, c1240af8.f4780b);
        C1240af c1240af9 = new C1240af(iArr11);
        if (!zMo2939i) {
            C1239ae.m2971b(c1240af9.f4780b, c1240af5.f4780b, c1240af9.f4780b);
        }
        if (!zMo2939i2) {
            C1239ae.m2971b(c1240af9.f4780b, c1240af6.f4780b, c1240af9.f4780b);
        }
        return new C1241ag(abstractC1381dD, c1240af7, c1240af8, new AbstractC1386g[]{c1240af9}, this.f5081f);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: t */
    public final AbstractC1389j mo2950t() {
        if (m3469p()) {
            return this;
        }
        AbstractC1381d abstractC1381dD = m3459d();
        C1240af c1240af = (C1240af) this.f5079d;
        if (c1240af.mo2940j()) {
            return abstractC1381dD.mo2912e();
        }
        C1240af c1240af2 = (C1240af) this.f5078c;
        C1240af c1240af3 = (C1240af) this.f5080e[0];
        int[] iArr = new int[7];
        C1239ae.m2974d(c1240af.f4780b, iArr);
        int[] iArr2 = new int[7];
        C1239ae.m2974d(iArr, iArr2);
        int[] iArr3 = new int[7];
        C1239ae.m2974d(c1240af2.f4780b, iArr3);
        C1239ae.m2965a(AbstractC1420g.m3667b(iArr3, iArr3, iArr3), iArr3);
        C1239ae.m2971b(iArr, c1240af2.f4780b, iArr);
        C1239ae.m2965a(AbstractC1416c.m3600e(7, iArr, 0), iArr);
        int[] iArr4 = new int[7];
        C1239ae.m2965a(AbstractC1416c.m3585b(7, iArr2, 0, iArr4), iArr4);
        C1240af c1240af4 = new C1240af(iArr2);
        C1239ae.m2974d(iArr3, c1240af4.f4780b);
        C1239ae.m2975d(c1240af4.f4780b, iArr, c1240af4.f4780b);
        C1239ae.m2975d(c1240af4.f4780b, iArr, c1240af4.f4780b);
        C1240af c1240af5 = new C1240af(iArr);
        C1239ae.m2975d(iArr, c1240af4.f4780b, c1240af5.f4780b);
        C1239ae.m2971b(c1240af5.f4780b, iArr3, c1240af5.f4780b);
        C1239ae.m2975d(c1240af5.f4780b, iArr4, c1240af5.f4780b);
        C1240af c1240af6 = new C1240af(iArr3);
        C1239ae.m2976e(c1240af.f4780b, c1240af6.f4780b);
        if (!c1240af3.mo2939i()) {
            C1239ae.m2971b(c1240af6.f4780b, c1240af3.f4780b, c1240af6.f4780b);
        }
        return new C1241ag(abstractC1381dD, c1240af4, c1240af5, new AbstractC1386g[]{c1240af6}, this.f5081f);
    }
}
