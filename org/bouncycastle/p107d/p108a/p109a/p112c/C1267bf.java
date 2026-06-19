package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p117c.AbstractC1416c;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.bf */
/* JADX INFO: loaded from: classes.dex */
public final class C1267bf extends AbstractC1389j.b {
    public C1267bf(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        this(abstractC1381d, abstractC1386g, abstractC1386g2, false);
    }

    public C1267bf(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        super(abstractC1381d, abstractC1386g, abstractC1386g2);
        if ((abstractC1386g == null) != (abstractC1386g2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f5081f = z;
    }

    C1267bf(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
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
        return new C1267bf(null, m3461g(), m3462h());
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: s */
    public final AbstractC1389j mo2949s() {
        return m3469p() ? this : new C1267bf(this.f5077b, this.f5078c, this.f5079d.mo2934d(), this.f5080e, this.f5081f);
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
        C1266be c1266be = (C1266be) this.f5078c;
        C1266be c1266be2 = (C1266be) this.f5079d;
        C1266be c1266be3 = (C1266be) abstractC1389j.m3463i();
        C1266be c1266be4 = (C1266be) abstractC1389j.mo3061j();
        C1266be c1266be5 = (C1266be) this.f5080e[0];
        C1266be c1266be6 = (C1266be) abstractC1389j.mo2945a(0);
        int[] iArr5 = new int[17];
        int[] iArr6 = new int[17];
        int[] iArr7 = new int[17];
        int[] iArr8 = new int[17];
        boolean zMo2939i = c1266be5.mo2939i();
        if (zMo2939i) {
            int[] iArr9 = c1266be3.f4830b;
            iArr = c1266be4.f4830b;
            iArr2 = iArr9;
        } else {
            C1265bd.m3038c(c1266be5.f4830b, iArr7);
            C1265bd.m3037b(iArr7, c1266be3.f4830b, iArr6);
            C1265bd.m3037b(iArr7, c1266be5.f4830b, iArr7);
            C1265bd.m3037b(iArr7, c1266be4.f4830b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zMo2939i2 = c1266be6.mo2939i();
        if (zMo2939i2) {
            int[] iArr10 = c1266be.f4830b;
            iArr3 = c1266be2.f4830b;
            iArr4 = iArr10;
        } else {
            C1265bd.m3038c(c1266be6.f4830b, iArr8);
            C1265bd.m3037b(iArr8, c1266be.f4830b, iArr5);
            C1265bd.m3037b(iArr8, c1266be6.f4830b, iArr8);
            C1265bd.m3037b(iArr8, c1266be2.f4830b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[17];
        C1265bd.m3039c(iArr4, iArr2, iArr11);
        C1265bd.m3039c(iArr3, iArr, iArr6);
        if (AbstractC1416c.m3595c(17, iArr11)) {
            return AbstractC1416c.m3595c(17, iArr6) ? mo2950t() : abstractC1381dD.mo2912e();
        }
        C1265bd.m3038c(iArr11, iArr7);
        int[] iArr12 = new int[17];
        C1265bd.m3037b(iArr7, iArr11, iArr12);
        C1265bd.m3037b(iArr7, iArr4, iArr7);
        C1265bd.m3037b(iArr3, iArr12, iArr5);
        C1266be c1266be7 = new C1266be(iArr8);
        C1265bd.m3038c(iArr6, c1266be7.f4830b);
        C1265bd.m3034a(c1266be7.f4830b, iArr12, c1266be7.f4830b);
        C1265bd.m3039c(c1266be7.f4830b, iArr7, c1266be7.f4830b);
        C1265bd.m3039c(c1266be7.f4830b, iArr7, c1266be7.f4830b);
        C1266be c1266be8 = new C1266be(iArr12);
        C1265bd.m3039c(iArr7, c1266be7.f4830b, c1266be8.f4830b);
        C1265bd.m3037b(c1266be8.f4830b, iArr6, iArr6);
        C1265bd.m3039c(iArr6, iArr5, c1266be8.f4830b);
        C1266be c1266be9 = new C1266be(iArr11);
        if (!zMo2939i) {
            C1265bd.m3037b(c1266be9.f4830b, c1266be5.f4830b, c1266be9.f4830b);
        }
        if (!zMo2939i2) {
            C1265bd.m3037b(c1266be9.f4830b, c1266be6.f4830b, c1266be9.f4830b);
        }
        return new C1267bf(abstractC1381dD, c1266be7, c1266be8, new AbstractC1386g[]{c1266be9}, this.f5081f);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: t */
    public final AbstractC1389j mo2950t() {
        if (m3469p()) {
            return this;
        }
        AbstractC1381d abstractC1381dD = m3459d();
        C1266be c1266be = (C1266be) this.f5079d;
        if (c1266be.mo2940j()) {
            return abstractC1381dD.mo2912e();
        }
        C1266be c1266be2 = (C1266be) this.f5078c;
        C1266be c1266be3 = (C1266be) this.f5080e[0];
        int[] iArr = new int[17];
        int[] iArr2 = new int[17];
        int[] iArr3 = new int[17];
        C1265bd.m3038c(c1266be.f4830b, iArr3);
        int[] iArr4 = new int[17];
        C1265bd.m3038c(iArr3, iArr4);
        boolean zMo2939i = c1266be3.mo2939i();
        int[] iArr5 = c1266be3.f4830b;
        if (!zMo2939i) {
            C1265bd.m3038c(c1266be3.f4830b, iArr2);
            iArr5 = iArr2;
        }
        C1265bd.m3039c(c1266be2.f4830b, iArr5, iArr);
        C1265bd.m3034a(c1266be2.f4830b, iArr5, iArr2);
        C1265bd.m3037b(iArr2, iArr, iArr2);
        AbstractC1416c.m3586b(17, iArr2, iArr2, iArr2);
        C1265bd.m3031a(iArr2);
        C1265bd.m3037b(iArr3, c1266be2.f4830b, iArr3);
        AbstractC1416c.m3600e(17, iArr3, 0);
        C1265bd.m3031a(iArr3);
        AbstractC1416c.m3585b(17, iArr4, 0, iArr);
        C1265bd.m3031a(iArr);
        C1266be c1266be4 = new C1266be(iArr4);
        C1265bd.m3038c(iArr2, c1266be4.f4830b);
        C1265bd.m3039c(c1266be4.f4830b, iArr3, c1266be4.f4830b);
        C1265bd.m3039c(c1266be4.f4830b, iArr3, c1266be4.f4830b);
        C1266be c1266be5 = new C1266be(iArr3);
        C1265bd.m3039c(iArr3, c1266be4.f4830b, c1266be5.f4830b);
        C1265bd.m3037b(c1266be5.f4830b, iArr2, c1266be5.f4830b);
        C1265bd.m3039c(c1266be5.f4830b, iArr, c1266be5.f4830b);
        C1266be c1266be6 = new C1266be(iArr2);
        C1265bd.m3040d(c1266be.f4830b, c1266be6.f4830b);
        if (!zMo2939i) {
            C1265bd.m3037b(c1266be6.f4830b, c1266be3.f4830b, c1266be6.f4830b);
        }
        return new C1267bf(abstractC1381dD, c1266be4, c1266be5, new AbstractC1386g[]{c1266be6}, this.f5081f);
    }
}
