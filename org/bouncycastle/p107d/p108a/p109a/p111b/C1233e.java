package org.bouncycastle.p107d.p108a.p109a.p111b;

import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1421h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.b.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1233e extends AbstractC1389j.b {
    public C1233e(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        this(abstractC1381d, abstractC1386g, abstractC1386g2, false);
    }

    public C1233e(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        super(abstractC1381d, abstractC1386g, abstractC1386g2);
        if ((abstractC1386g == null) != (abstractC1386g2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f5081f = z;
    }

    C1233e(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
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
        return new C1233e(null, m3461g(), m3462h());
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: s */
    public final AbstractC1389j mo2949s() {
        return m3469p() ? this : new C1233e(this.f5077b, this.f5078c, this.f5079d.mo2934d(), this.f5080e, this.f5081f);
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
        C1232d c1232d = (C1232d) this.f5078c;
        C1232d c1232d2 = (C1232d) this.f5079d;
        C1232d c1232d3 = (C1232d) abstractC1389j.m3463i();
        C1232d c1232d4 = (C1232d) abstractC1389j.mo3061j();
        C1232d c1232d5 = (C1232d) this.f5080e[0];
        C1232d c1232d6 = (C1232d) abstractC1389j.mo2945a(0);
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        boolean zMo2939i = c1232d5.mo2939i();
        if (zMo2939i) {
            int[] iArr9 = c1232d3.f4765b;
            iArr = c1232d4.f4765b;
            iArr2 = iArr9;
        } else {
            C1231c.m2962d(c1232d5.f4765b, iArr7);
            C1231c.m2959b(iArr7, c1232d3.f4765b, iArr6);
            C1231c.m2959b(iArr7, c1232d5.f4765b, iArr7);
            C1231c.m2959b(iArr7, c1232d4.f4765b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zMo2939i2 = c1232d6.mo2939i();
        if (zMo2939i2) {
            int[] iArr10 = c1232d.f4765b;
            iArr3 = c1232d2.f4765b;
            iArr4 = iArr10;
        } else {
            C1231c.m2962d(c1232d6.f4765b, iArr8);
            C1231c.m2959b(iArr8, c1232d.f4765b, iArr5);
            C1231c.m2959b(iArr8, c1232d6.f4765b, iArr8);
            C1231c.m2959b(iArr8, c1232d2.f4765b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[8];
        C1231c.m2963d(iArr4, iArr2, iArr11);
        C1231c.m2963d(iArr3, iArr, iArr6);
        if (AbstractC1421h.m3691b(iArr11)) {
            return AbstractC1421h.m3691b(iArr6) ? mo2950t() : abstractC1381dD.mo2912e();
        }
        C1231c.m2962d(iArr11, iArr7);
        int[] iArr12 = new int[8];
        C1231c.m2959b(iArr7, iArr11, iArr12);
        C1231c.m2959b(iArr7, iArr4, iArr7);
        C1231c.m2958b(iArr12, iArr12);
        AbstractC1421h.m3699d(iArr3, iArr12, iArr5);
        C1231c.m2952a(AbstractC1421h.m3690b(iArr7, iArr7, iArr12), iArr12);
        C1232d c1232d7 = new C1232d(iArr8);
        C1231c.m2962d(iArr6, c1232d7.f4765b);
        C1231c.m2963d(c1232d7.f4765b, iArr12, c1232d7.f4765b);
        C1232d c1232d8 = new C1232d(iArr12);
        C1231c.m2963d(iArr7, c1232d7.f4765b, c1232d8.f4765b);
        C1231c.m2961c(c1232d8.f4765b, iArr6, iArr5);
        C1231c.m2960c(iArr5, c1232d8.f4765b);
        C1232d c1232d9 = new C1232d(iArr11);
        if (!zMo2939i) {
            C1231c.m2959b(c1232d9.f4765b, c1232d5.f4765b, c1232d9.f4765b);
        }
        if (!zMo2939i2) {
            C1231c.m2959b(c1232d9.f4765b, c1232d6.f4765b, c1232d9.f4765b);
        }
        return new C1233e(abstractC1381dD, c1232d7, c1232d8, new AbstractC1386g[]{c1232d9}, this.f5081f);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: t */
    public final AbstractC1389j mo2950t() {
        if (m3469p()) {
            return this;
        }
        AbstractC1381d abstractC1381dD = m3459d();
        C1232d c1232d = (C1232d) this.f5079d;
        if (c1232d.mo2940j()) {
            return abstractC1381dD.mo2912e();
        }
        C1232d c1232d2 = (C1232d) this.f5078c;
        C1232d c1232d3 = (C1232d) this.f5080e[0];
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        C1231c.m2962d(c1232d.f4765b, iArr3);
        int[] iArr4 = new int[8];
        C1231c.m2962d(iArr3, iArr4);
        boolean zMo2939i = c1232d3.mo2939i();
        int[] iArr5 = c1232d3.f4765b;
        if (!zMo2939i) {
            C1231c.m2962d(c1232d3.f4765b, iArr2);
            iArr5 = iArr2;
        }
        C1231c.m2963d(c1232d2.f4765b, iArr5, iArr);
        C1231c.m2956a(c1232d2.f4765b, iArr5, iArr2);
        C1231c.m2959b(iArr2, iArr, iArr2);
        C1231c.m2952a(AbstractC1421h.m3690b(iArr2, iArr2, iArr2), iArr2);
        C1231c.m2959b(iArr3, c1232d2.f4765b, iArr3);
        C1231c.m2952a(AbstractC1416c.m3600e(8, iArr3, 0), iArr3);
        C1231c.m2952a(AbstractC1416c.m3585b(8, iArr4, 0, iArr), iArr);
        C1232d c1232d4 = new C1232d(iArr4);
        C1231c.m2962d(iArr2, c1232d4.f4765b);
        C1231c.m2963d(c1232d4.f4765b, iArr3, c1232d4.f4765b);
        C1231c.m2963d(c1232d4.f4765b, iArr3, c1232d4.f4765b);
        C1232d c1232d5 = new C1232d(iArr3);
        C1231c.m2963d(iArr3, c1232d4.f4765b, c1232d5.f4765b);
        C1231c.m2959b(c1232d5.f4765b, iArr2, c1232d5.f4765b);
        C1231c.m2963d(c1232d5.f4765b, iArr, c1232d5.f4765b);
        C1232d c1232d6 = new C1232d(iArr2);
        C1231c.m2964e(c1232d.f4765b, c1232d6.f4765b);
        if (!zMo2939i) {
            C1231c.m2959b(c1232d6.f4765b, c1232d3.f4765b, c1232d6.f4765b);
        }
        return new C1233e(abstractC1381dD, c1232d4, c1232d5, new AbstractC1386g[]{c1232d6}, this.f5081f);
    }
}
