package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1417d;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1342e extends AbstractC1389j.b {
    public C1342e(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        this(abstractC1381d, abstractC1386g, abstractC1386g2, false);
    }

    public C1342e(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        super(abstractC1381d, abstractC1386g, abstractC1386g2);
        if ((abstractC1386g == null) != (abstractC1386g2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f5081f = z;
    }

    C1342e(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
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
        return new C1342e(null, m3461g(), m3462h());
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: s */
    public final AbstractC1389j mo2949s() {
        return m3469p() ? this : new C1342e(this.f5077b, this.f5078c, this.f5079d.mo2934d(), this.f5080e, this.f5081f);
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
        C1315d c1315d = (C1315d) this.f5078c;
        C1315d c1315d2 = (C1315d) this.f5079d;
        C1315d c1315d3 = (C1315d) abstractC1389j.m3463i();
        C1315d c1315d4 = (C1315d) abstractC1389j.mo3061j();
        C1315d c1315d5 = (C1315d) this.f5080e[0];
        C1315d c1315d6 = (C1315d) abstractC1389j.mo2945a(0);
        int[] iArr5 = new int[8];
        int[] iArr6 = new int[4];
        int[] iArr7 = new int[4];
        int[] iArr8 = new int[4];
        boolean zMo2939i = c1315d5.mo2939i();
        if (zMo2939i) {
            int[] iArr9 = c1315d3.f4888b;
            iArr = c1315d4.f4888b;
            iArr2 = iArr9;
        } else {
            C1288c.m3108d(c1315d5.f4888b, iArr7);
            C1288c.m3105b(iArr7, c1315d3.f4888b, iArr6);
            C1288c.m3105b(iArr7, c1315d5.f4888b, iArr7);
            C1288c.m3105b(iArr7, c1315d4.f4888b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zMo2939i2 = c1315d6.mo2939i();
        if (zMo2939i2) {
            int[] iArr10 = c1315d.f4888b;
            iArr3 = c1315d2.f4888b;
            iArr4 = iArr10;
        } else {
            C1288c.m3108d(c1315d6.f4888b, iArr8);
            C1288c.m3105b(iArr8, c1315d.f4888b, iArr5);
            C1288c.m3105b(iArr8, c1315d6.f4888b, iArr8);
            C1288c.m3105b(iArr8, c1315d2.f4888b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[4];
        C1288c.m3109d(iArr4, iArr2, iArr11);
        C1288c.m3109d(iArr3, iArr, iArr6);
        if (AbstractC1417d.m3610b(iArr11)) {
            return AbstractC1417d.m3610b(iArr6) ? mo2950t() : abstractC1381dD.mo2912e();
        }
        C1288c.m3108d(iArr11, iArr7);
        int[] iArr12 = new int[4];
        C1288c.m3105b(iArr7, iArr11, iArr12);
        C1288c.m3105b(iArr7, iArr4, iArr7);
        C1288c.m3104b(iArr12, iArr12);
        AbstractC1417d.m3609b(iArr3, iArr12, iArr5);
        C1288c.m3098a(AbstractC1417d.m3603a(iArr7, iArr7, iArr12), iArr12);
        C1315d c1315d7 = new C1315d(iArr8);
        C1288c.m3108d(iArr6, c1315d7.f4888b);
        C1288c.m3109d(c1315d7.f4888b, iArr12, c1315d7.f4888b);
        C1315d c1315d8 = new C1315d(iArr12);
        C1288c.m3109d(iArr7, c1315d7.f4888b, c1315d8.f4888b);
        C1288c.m3107c(c1315d8.f4888b, iArr6, iArr5);
        C1288c.m3106c(iArr5, c1315d8.f4888b);
        C1315d c1315d9 = new C1315d(iArr11);
        if (!zMo2939i) {
            C1288c.m3105b(c1315d9.f4888b, c1315d5.f4888b, c1315d9.f4888b);
        }
        if (!zMo2939i2) {
            C1288c.m3105b(c1315d9.f4888b, c1315d6.f4888b, c1315d9.f4888b);
        }
        return new C1342e(abstractC1381dD, c1315d7, c1315d8, new AbstractC1386g[]{c1315d9}, this.f5081f);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: t */
    public final AbstractC1389j mo2950t() {
        if (m3469p()) {
            return this;
        }
        AbstractC1381d abstractC1381dD = m3459d();
        C1315d c1315d = (C1315d) this.f5079d;
        if (c1315d.mo2940j()) {
            return abstractC1381dD.mo2912e();
        }
        C1315d c1315d2 = (C1315d) this.f5078c;
        C1315d c1315d3 = (C1315d) this.f5080e[0];
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        C1288c.m3108d(c1315d.f4888b, iArr3);
        int[] iArr4 = new int[4];
        C1288c.m3108d(iArr3, iArr4);
        boolean zMo2939i = c1315d3.mo2939i();
        int[] iArr5 = c1315d3.f4888b;
        if (!zMo2939i) {
            C1288c.m3108d(c1315d3.f4888b, iArr2);
            iArr5 = iArr2;
        }
        C1288c.m3109d(c1315d2.f4888b, iArr5, iArr);
        C1288c.m3102a(c1315d2.f4888b, iArr5, iArr2);
        C1288c.m3105b(iArr2, iArr, iArr2);
        C1288c.m3098a(AbstractC1417d.m3603a(iArr2, iArr2, iArr2), iArr2);
        C1288c.m3105b(iArr3, c1315d2.f4888b, iArr3);
        C1288c.m3098a(AbstractC1416c.m3600e(4, iArr3, 0), iArr3);
        C1288c.m3098a(AbstractC1416c.m3585b(4, iArr4, 0, iArr), iArr);
        C1315d c1315d4 = new C1315d(iArr4);
        C1288c.m3108d(iArr2, c1315d4.f4888b);
        C1288c.m3109d(c1315d4.f4888b, iArr3, c1315d4.f4888b);
        C1288c.m3109d(c1315d4.f4888b, iArr3, c1315d4.f4888b);
        C1315d c1315d5 = new C1315d(iArr3);
        C1288c.m3109d(iArr3, c1315d4.f4888b, c1315d5.f4888b);
        C1288c.m3105b(c1315d5.f4888b, iArr2, c1315d5.f4888b);
        C1288c.m3109d(c1315d5.f4888b, iArr, c1315d5.f4888b);
        C1315d c1315d6 = new C1315d(iArr2);
        C1288c.m3110e(c1315d.f4888b, c1315d6.f4888b);
        if (!zMo2939i) {
            C1288c.m3105b(c1315d6.f4888b, c1315d3.f4888b, c1315d6.f4888b);
        }
        return new C1342e(abstractC1381dD, c1315d4, c1315d5, new AbstractC1386g[]{c1315d6}, this.f5081f);
    }
}
