package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1421h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.aq */
/* JADX INFO: loaded from: classes.dex */
public final class C1251aq extends AbstractC1389j.b {
    public C1251aq(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        this(abstractC1381d, abstractC1386g, abstractC1386g2, false);
    }

    public C1251aq(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        super(abstractC1381d, abstractC1386g, abstractC1386g2);
        if ((abstractC1386g == null) != (abstractC1386g2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f5081f = z;
    }

    C1251aq(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
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
        return new C1251aq(null, m3461g(), m3462h());
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: s */
    public final AbstractC1389j mo2949s() {
        return m3469p() ? this : new C1251aq(this.f5077b, this.f5078c, this.f5079d.mo2934d(), this.f5080e, this.f5081f);
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
        C1250ap c1250ap = (C1250ap) this.f5078c;
        C1250ap c1250ap2 = (C1250ap) this.f5079d;
        C1250ap c1250ap3 = (C1250ap) abstractC1389j.m3463i();
        C1250ap c1250ap4 = (C1250ap) abstractC1389j.mo3061j();
        C1250ap c1250ap5 = (C1250ap) this.f5080e[0];
        C1250ap c1250ap6 = (C1250ap) abstractC1389j.mo2945a(0);
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        boolean zMo2939i = c1250ap5.mo2939i();
        if (zMo2939i) {
            int[] iArr9 = c1250ap3.f4800b;
            iArr = c1250ap4.f4800b;
            iArr2 = iArr9;
        } else {
            C1249ao.m3002d(c1250ap5.f4800b, iArr7);
            C1249ao.m2999b(iArr7, c1250ap3.f4800b, iArr6);
            C1249ao.m2999b(iArr7, c1250ap5.f4800b, iArr7);
            C1249ao.m2999b(iArr7, c1250ap4.f4800b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zMo2939i2 = c1250ap6.mo2939i();
        if (zMo2939i2) {
            int[] iArr10 = c1250ap.f4800b;
            iArr3 = c1250ap2.f4800b;
            iArr4 = iArr10;
        } else {
            C1249ao.m3002d(c1250ap6.f4800b, iArr8);
            C1249ao.m2999b(iArr8, c1250ap.f4800b, iArr5);
            C1249ao.m2999b(iArr8, c1250ap6.f4800b, iArr8);
            C1249ao.m2999b(iArr8, c1250ap2.f4800b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[8];
        C1249ao.m3003d(iArr4, iArr2, iArr11);
        C1249ao.m3003d(iArr3, iArr, iArr6);
        if (AbstractC1421h.m3691b(iArr11)) {
            return AbstractC1421h.m3691b(iArr6) ? mo2950t() : abstractC1381dD.mo2912e();
        }
        C1249ao.m3002d(iArr11, iArr7);
        int[] iArr12 = new int[8];
        C1249ao.m2999b(iArr7, iArr11, iArr12);
        C1249ao.m2999b(iArr7, iArr4, iArr7);
        C1249ao.m2998b(iArr12, iArr12);
        AbstractC1421h.m3699d(iArr3, iArr12, iArr5);
        C1249ao.m2993a(AbstractC1421h.m3690b(iArr7, iArr7, iArr12), iArr12);
        C1250ap c1250ap7 = new C1250ap(iArr8);
        C1249ao.m3002d(iArr6, c1250ap7.f4800b);
        C1249ao.m3003d(c1250ap7.f4800b, iArr12, c1250ap7.f4800b);
        C1250ap c1250ap8 = new C1250ap(iArr12);
        C1249ao.m3003d(iArr7, c1250ap7.f4800b, c1250ap8.f4800b);
        C1249ao.m3001c(c1250ap8.f4800b, iArr6, iArr5);
        C1249ao.m3000c(iArr5, c1250ap8.f4800b);
        C1250ap c1250ap9 = new C1250ap(iArr11);
        if (!zMo2939i) {
            C1249ao.m2999b(c1250ap9.f4800b, c1250ap5.f4800b, c1250ap9.f4800b);
        }
        if (!zMo2939i2) {
            C1249ao.m2999b(c1250ap9.f4800b, c1250ap6.f4800b, c1250ap9.f4800b);
        }
        return new C1251aq(abstractC1381dD, c1250ap7, c1250ap8, new AbstractC1386g[]{c1250ap9}, this.f5081f);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: t */
    public final AbstractC1389j mo2950t() {
        if (m3469p()) {
            return this;
        }
        AbstractC1381d abstractC1381dD = m3459d();
        C1250ap c1250ap = (C1250ap) this.f5079d;
        if (c1250ap.mo2940j()) {
            return abstractC1381dD.mo2912e();
        }
        C1250ap c1250ap2 = (C1250ap) this.f5078c;
        C1250ap c1250ap3 = (C1250ap) this.f5080e[0];
        int[] iArr = new int[8];
        C1249ao.m3002d(c1250ap.f4800b, iArr);
        int[] iArr2 = new int[8];
        C1249ao.m3002d(iArr, iArr2);
        int[] iArr3 = new int[8];
        C1249ao.m3002d(c1250ap2.f4800b, iArr3);
        C1249ao.m2993a(AbstractC1421h.m3690b(iArr3, iArr3, iArr3), iArr3);
        C1249ao.m2999b(iArr, c1250ap2.f4800b, iArr);
        C1249ao.m2993a(AbstractC1416c.m3600e(8, iArr, 0), iArr);
        int[] iArr4 = new int[8];
        C1249ao.m2993a(AbstractC1416c.m3585b(8, iArr2, 0, iArr4), iArr4);
        C1250ap c1250ap4 = new C1250ap(iArr2);
        C1249ao.m3002d(iArr3, c1250ap4.f4800b);
        C1249ao.m3003d(c1250ap4.f4800b, iArr, c1250ap4.f4800b);
        C1249ao.m3003d(c1250ap4.f4800b, iArr, c1250ap4.f4800b);
        C1250ap c1250ap5 = new C1250ap(iArr);
        C1249ao.m3003d(iArr, c1250ap4.f4800b, c1250ap5.f4800b);
        C1249ao.m2999b(c1250ap5.f4800b, iArr3, c1250ap5.f4800b);
        C1249ao.m3003d(c1250ap5.f4800b, iArr4, c1250ap5.f4800b);
        C1250ap c1250ap6 = new C1250ap(iArr3);
        C1249ao.m3004e(c1250ap.f4800b, c1250ap6.f4800b);
        if (!c1250ap3.mo2939i()) {
            C1249ao.m2999b(c1250ap6.f4800b, c1250ap3.f4800b, c1250ap6.f4800b);
        }
        return new C1251aq(abstractC1381dD, c1250ap4, c1250ap5, new AbstractC1386g[]{c1250ap6}, this.f5081f);
    }
}
