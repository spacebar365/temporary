package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1419f;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.ab */
/* JADX INFO: loaded from: classes.dex */
public final class C1236ab extends AbstractC1389j.b {
    public C1236ab(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        this(abstractC1381d, abstractC1386g, abstractC1386g2, false);
    }

    public C1236ab(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        super(abstractC1381d, abstractC1386g, abstractC1386g2);
        if ((abstractC1386g == null) != (abstractC1386g2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f5081f = z;
    }

    C1236ab(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
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
        return new C1236ab(null, m3461g(), m3462h());
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: s */
    public final AbstractC1389j mo2949s() {
        return m3469p() ? this : new C1236ab(this.f5077b, this.f5078c, this.f5079d.mo2934d(), this.f5080e, this.f5081f);
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
        C1235aa c1235aa = (C1235aa) this.f5078c;
        C1235aa c1235aa2 = (C1235aa) this.f5079d;
        C1235aa c1235aa3 = (C1235aa) abstractC1389j.m3463i();
        C1235aa c1235aa4 = (C1235aa) abstractC1389j.mo3061j();
        C1235aa c1235aa5 = (C1235aa) this.f5080e[0];
        C1235aa c1235aa6 = (C1235aa) abstractC1389j.mo2945a(0);
        int[] iArr5 = new int[12];
        int[] iArr6 = new int[6];
        int[] iArr7 = new int[6];
        int[] iArr8 = new int[6];
        boolean zMo2939i = c1235aa5.mo2939i();
        if (zMo2939i) {
            int[] iArr9 = c1235aa3.f4769b;
            iArr = c1235aa4.f4769b;
            iArr2 = iArr9;
        } else {
            C1363z.m3253d(c1235aa5.f4769b, iArr7);
            C1363z.m3250b(iArr7, c1235aa3.f4769b, iArr6);
            C1363z.m3250b(iArr7, c1235aa5.f4769b, iArr7);
            C1363z.m3250b(iArr7, c1235aa4.f4769b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zMo2939i2 = c1235aa6.mo2939i();
        if (zMo2939i2) {
            int[] iArr10 = c1235aa.f4769b;
            iArr3 = c1235aa2.f4769b;
            iArr4 = iArr10;
        } else {
            C1363z.m3253d(c1235aa6.f4769b, iArr8);
            C1363z.m3250b(iArr8, c1235aa.f4769b, iArr5);
            C1363z.m3250b(iArr8, c1235aa6.f4769b, iArr8);
            C1363z.m3250b(iArr8, c1235aa2.f4769b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[6];
        C1363z.m3254d(iArr4, iArr2, iArr11);
        C1363z.m3254d(iArr3, iArr, iArr6);
        if (AbstractC1419f.m3645b(iArr11)) {
            return AbstractC1419f.m3645b(iArr6) ? mo2950t() : abstractC1381dD.mo2912e();
        }
        C1363z.m3253d(iArr11, iArr7);
        int[] iArr12 = new int[6];
        C1363z.m3250b(iArr7, iArr11, iArr12);
        C1363z.m3250b(iArr7, iArr4, iArr7);
        C1363z.m3249b(iArr12, iArr12);
        AbstractC1419f.m3655d(iArr3, iArr12, iArr5);
        C1363z.m3243a(AbstractC1419f.m3644b(iArr7, iArr7, iArr12), iArr12);
        C1235aa c1235aa7 = new C1235aa(iArr8);
        C1363z.m3253d(iArr6, c1235aa7.f4769b);
        C1363z.m3254d(c1235aa7.f4769b, iArr12, c1235aa7.f4769b);
        C1235aa c1235aa8 = new C1235aa(iArr12);
        C1363z.m3254d(iArr7, c1235aa7.f4769b, c1235aa8.f4769b);
        C1363z.m3252c(c1235aa8.f4769b, iArr6, iArr5);
        C1363z.m3251c(iArr5, c1235aa8.f4769b);
        C1235aa c1235aa9 = new C1235aa(iArr11);
        if (!zMo2939i) {
            C1363z.m3250b(c1235aa9.f4769b, c1235aa5.f4769b, c1235aa9.f4769b);
        }
        if (!zMo2939i2) {
            C1363z.m3250b(c1235aa9.f4769b, c1235aa6.f4769b, c1235aa9.f4769b);
        }
        return new C1236ab(abstractC1381dD, c1235aa7, c1235aa8, new AbstractC1386g[]{c1235aa9}, this.f5081f);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: t */
    public final AbstractC1389j mo2950t() {
        if (m3469p()) {
            return this;
        }
        AbstractC1381d abstractC1381dD = m3459d();
        C1235aa c1235aa = (C1235aa) this.f5079d;
        if (c1235aa.mo2940j()) {
            return abstractC1381dD.mo2912e();
        }
        C1235aa c1235aa2 = (C1235aa) this.f5078c;
        C1235aa c1235aa3 = (C1235aa) this.f5080e[0];
        int[] iArr = new int[6];
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        C1363z.m3253d(c1235aa.f4769b, iArr3);
        int[] iArr4 = new int[6];
        C1363z.m3253d(iArr3, iArr4);
        boolean zMo2939i = c1235aa3.mo2939i();
        int[] iArr5 = c1235aa3.f4769b;
        if (!zMo2939i) {
            C1363z.m3253d(c1235aa3.f4769b, iArr2);
            iArr5 = iArr2;
        }
        C1363z.m3254d(c1235aa2.f4769b, iArr5, iArr);
        C1363z.m3247a(c1235aa2.f4769b, iArr5, iArr2);
        C1363z.m3250b(iArr2, iArr, iArr2);
        C1363z.m3243a(AbstractC1419f.m3644b(iArr2, iArr2, iArr2), iArr2);
        C1363z.m3250b(iArr3, c1235aa2.f4769b, iArr3);
        C1363z.m3243a(AbstractC1416c.m3600e(6, iArr3, 0), iArr3);
        C1363z.m3243a(AbstractC1416c.m3585b(6, iArr4, 0, iArr), iArr);
        C1235aa c1235aa4 = new C1235aa(iArr4);
        C1363z.m3253d(iArr2, c1235aa4.f4769b);
        C1363z.m3254d(c1235aa4.f4769b, iArr3, c1235aa4.f4769b);
        C1363z.m3254d(c1235aa4.f4769b, iArr3, c1235aa4.f4769b);
        C1235aa c1235aa5 = new C1235aa(iArr3);
        C1363z.m3254d(iArr3, c1235aa4.f4769b, c1235aa5.f4769b);
        C1363z.m3250b(c1235aa5.f4769b, iArr2, c1235aa5.f4769b);
        C1363z.m3254d(c1235aa5.f4769b, iArr, c1235aa5.f4769b);
        C1235aa c1235aa6 = new C1235aa(iArr2);
        C1363z.m3255e(c1235aa.f4769b, c1235aa6.f4769b);
        if (!zMo2939i) {
            C1363z.m3250b(c1235aa6.f4769b, c1235aa3.f4769b, c1235aa6.f4769b);
        }
        return new C1236ab(abstractC1381dD, c1235aa4, c1235aa5, new AbstractC1386g[]{c1235aa6}, this.f5081f);
    }
}
