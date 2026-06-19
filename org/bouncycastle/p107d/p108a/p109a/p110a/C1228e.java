package org.bouncycastle.p107d.p108a.p109a.p110a;

import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p117c.AbstractC1421h;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1228e extends AbstractC1389j.b {
    public C1228e(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        this(abstractC1381d, abstractC1386g, abstractC1386g2, false);
    }

    public C1228e(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        super(abstractC1381d, abstractC1386g, abstractC1386g2);
        if ((abstractC1386g == null) != (abstractC1386g2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f5081f = z;
    }

    C1228e(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
        super(abstractC1381d, abstractC1386g, abstractC1386g2, abstractC1386gArr);
        this.f5081f = z;
    }

    /* JADX INFO: renamed from: a */
    private C1227d m2942a(C1227d c1227d, int[] iArr) {
        C1227d c1227d2 = (C1227d) m3459d().m3366g();
        if (c1227d.mo2939i()) {
            return c1227d2;
        }
        C1227d c1227d3 = new C1227d();
        if (iArr == null) {
            iArr = c1227d3.f4756b;
            C1226c.m2925d(c1227d.f4756b, iArr);
        }
        C1226c.m2925d(iArr, c1227d3.f4756b);
        C1226c.m2922b(c1227d3.f4756b, c1227d2.f4756b, c1227d3.f4756b);
        return c1227d3;
    }

    /* JADX INFO: renamed from: v */
    private C1227d m2944v() {
        C1227d c1227d = (C1227d) this.f5080e[1];
        if (c1227d != null) {
            return c1227d;
        }
        AbstractC1386g[] abstractC1386gArr = this.f5080e;
        C1227d c1227dM2942a = m2942a((C1227d) this.f5080e[0], (int[]) null);
        abstractC1386gArr[1] = c1227dM2942a;
        return c1227dM2942a;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2945a(int i) {
        return i == 1 ? m2944v() : super.mo2945a(i);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: d */
    public final AbstractC1389j mo2947d(AbstractC1389j abstractC1389j) {
        return this == abstractC1389j ? mo2951u() : !m3469p() ? abstractC1389j.m3469p() ? mo2950t() : !this.f5079d.mo2940j() ? m2943b(false).mo2946b(abstractC1389j) : abstractC1389j : abstractC1389j;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: e */
    protected final AbstractC1389j mo2948e() {
        return new C1228e(null, m3461g(), m3462h());
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: s */
    public final AbstractC1389j mo2949s() {
        return m3469p() ? this : new C1228e(m3459d(), this.f5078c, this.f5079d.mo2934d(), this.f5080e, this.f5081f);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: t */
    public final AbstractC1389j mo2950t() {
        if (m3469p()) {
            return this;
        }
        return this.f5079d.mo2940j() ? m3459d().mo2912e() : m2943b(true);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: u */
    public final AbstractC1389j mo2951u() {
        return (m3469p() || this.f5079d.mo2940j()) ? this : m2943b(false).mo2946b(this);
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
        C1227d c1227d = (C1227d) this.f5078c;
        C1227d c1227d2 = (C1227d) this.f5079d;
        C1227d c1227d3 = (C1227d) this.f5080e[0];
        C1227d c1227d4 = (C1227d) abstractC1389j.m3463i();
        C1227d c1227d5 = (C1227d) abstractC1389j.mo3061j();
        C1227d c1227d6 = (C1227d) abstractC1389j.mo2945a(0);
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        boolean zMo2939i = c1227d3.mo2939i();
        if (zMo2939i) {
            int[] iArr9 = c1227d4.f4756b;
            iArr = c1227d5.f4756b;
            iArr2 = iArr9;
        } else {
            C1226c.m2925d(c1227d3.f4756b, iArr7);
            C1226c.m2922b(iArr7, c1227d4.f4756b, iArr6);
            C1226c.m2922b(iArr7, c1227d3.f4756b, iArr7);
            C1226c.m2922b(iArr7, c1227d5.f4756b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zMo2939i2 = c1227d6.mo2939i();
        if (zMo2939i2) {
            int[] iArr10 = c1227d.f4756b;
            iArr3 = c1227d2.f4756b;
            iArr4 = iArr10;
        } else {
            C1226c.m2925d(c1227d6.f4756b, iArr8);
            C1226c.m2922b(iArr8, c1227d.f4756b, iArr5);
            C1226c.m2922b(iArr8, c1227d6.f4756b, iArr8);
            C1226c.m2922b(iArr8, c1227d2.f4756b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[8];
        C1226c.m2926d(iArr4, iArr2, iArr11);
        C1226c.m2926d(iArr3, iArr, iArr6);
        if (AbstractC1421h.m3691b(iArr11)) {
            return AbstractC1421h.m3691b(iArr6) ? mo2950t() : abstractC1381dD.mo2912e();
        }
        int[] iArr12 = new int[8];
        C1226c.m2925d(iArr11, iArr12);
        int[] iArr13 = new int[8];
        C1226c.m2922b(iArr12, iArr11, iArr13);
        C1226c.m2922b(iArr12, iArr4, iArr7);
        C1226c.m2921b(iArr13, iArr13);
        AbstractC1421h.m3699d(iArr3, iArr13, iArr5);
        C1226c.m2916a(AbstractC1421h.m3690b(iArr7, iArr7, iArr13), iArr13);
        C1227d c1227d7 = new C1227d(iArr8);
        C1226c.m2925d(iArr6, c1227d7.f4756b);
        C1226c.m2926d(c1227d7.f4756b, iArr13, c1227d7.f4756b);
        C1227d c1227d8 = new C1227d(iArr13);
        C1226c.m2926d(iArr7, c1227d7.f4756b, c1227d8.f4756b);
        C1226c.m2924c(c1227d8.f4756b, iArr6, iArr5);
        C1226c.m2923c(iArr5, c1227d8.f4756b);
        C1227d c1227d9 = new C1227d(iArr11);
        if (!zMo2939i) {
            C1226c.m2922b(c1227d9.f4756b, c1227d3.f4756b, c1227d9.f4756b);
        }
        if (!zMo2939i2) {
            C1226c.m2922b(c1227d9.f4756b, c1227d6.f4756b, c1227d9.f4756b);
        }
        return new C1228e(abstractC1381dD, c1227d7, c1227d8, new AbstractC1386g[]{c1227d9, m2942a(c1227d9, (zMo2939i && zMo2939i2) ? iArr12 : null)}, this.f5081f);
    }

    /* JADX INFO: renamed from: b */
    private C1228e m2943b(boolean z) {
        C1227d c1227d;
        C1227d c1227d2 = (C1227d) this.f5078c;
        C1227d c1227d3 = (C1227d) this.f5079d;
        C1227d c1227d4 = (C1227d) this.f5080e[0];
        C1227d c1227dM2944v = m2944v();
        int[] iArr = new int[8];
        C1226c.m2925d(c1227d2.f4756b, iArr);
        C1226c.m2916a(AbstractC1421h.m3690b(iArr, iArr, iArr) + AbstractC1421h.m3681a(c1227dM2944v.f4756b, iArr), iArr);
        int[] iArr2 = new int[8];
        C1226c.m2927e(c1227d3.f4756b, iArr2);
        int[] iArr3 = new int[8];
        C1226c.m2922b(iArr2, c1227d3.f4756b, iArr3);
        int[] iArr4 = new int[8];
        C1226c.m2922b(iArr3, c1227d2.f4756b, iArr4);
        C1226c.m2927e(iArr4, iArr4);
        int[] iArr5 = new int[8];
        C1226c.m2925d(iArr3, iArr5);
        C1226c.m2927e(iArr5, iArr5);
        C1227d c1227d5 = new C1227d(iArr3);
        C1226c.m2925d(iArr, c1227d5.f4756b);
        C1226c.m2926d(c1227d5.f4756b, iArr4, c1227d5.f4756b);
        C1226c.m2926d(c1227d5.f4756b, iArr4, c1227d5.f4756b);
        C1227d c1227d6 = new C1227d(iArr4);
        C1226c.m2926d(iArr4, c1227d5.f4756b, c1227d6.f4756b);
        C1226c.m2922b(c1227d6.f4756b, iArr, c1227d6.f4756b);
        C1226c.m2926d(c1227d6.f4756b, iArr5, c1227d6.f4756b);
        C1227d c1227d7 = new C1227d(iArr2);
        if (!AbstractC1421h.m3685a(c1227d4.f4756b)) {
            C1226c.m2922b(c1227d7.f4756b, c1227d4.f4756b, c1227d7.f4756b);
        }
        if (z) {
            C1227d c1227d8 = new C1227d(iArr5);
            C1226c.m2922b(c1227d8.f4756b, c1227dM2944v.f4756b, c1227d8.f4756b);
            C1226c.m2927e(c1227d8.f4756b, c1227d8.f4756b);
            c1227d = c1227d8;
        } else {
            c1227d = null;
        }
        return new C1228e(m3459d(), c1227d5, c1227d6, new AbstractC1386g[]{c1227d7, c1227d}, this.f5081f);
    }
}
