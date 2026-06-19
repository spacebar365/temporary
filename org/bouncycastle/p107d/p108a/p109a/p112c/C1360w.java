package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p107d.p117c.AbstractC1419f;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1360w extends AbstractC1389j.b {
    public C1360w(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        this(abstractC1381d, abstractC1386g, abstractC1386g2, false);
    }

    public C1360w(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        super(abstractC1381d, abstractC1386g, abstractC1386g2);
        if ((abstractC1386g == null) != (abstractC1386g2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f5081f = z;
    }

    C1360w(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
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
        return new C1360w(null, m3461g(), m3462h());
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: s */
    public final AbstractC1389j mo2949s() {
        return m3469p() ? this : new C1360w(this.f5077b, this.f5078c, this.f5079d.mo2934d(), this.f5080e, this.f5081f);
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
        C1359v c1359v = (C1359v) this.f5078c;
        C1359v c1359v2 = (C1359v) this.f5079d;
        C1359v c1359v3 = (C1359v) abstractC1389j.m3463i();
        C1359v c1359v4 = (C1359v) abstractC1389j.mo3061j();
        C1359v c1359v5 = (C1359v) this.f5080e[0];
        C1359v c1359v6 = (C1359v) abstractC1389j.mo2945a(0);
        int[] iArr5 = new int[12];
        int[] iArr6 = new int[6];
        int[] iArr7 = new int[6];
        int[] iArr8 = new int[6];
        boolean zMo2939i = c1359v5.mo2939i();
        if (zMo2939i) {
            int[] iArr9 = c1359v3.f4957b;
            iArr = c1359v4.f4957b;
            iArr2 = iArr9;
        } else {
            C1358u.m3240d(c1359v5.f4957b, iArr7);
            C1358u.m3237b(iArr7, c1359v3.f4957b, iArr6);
            C1358u.m3237b(iArr7, c1359v5.f4957b, iArr7);
            C1358u.m3237b(iArr7, c1359v4.f4957b, iArr7);
            iArr = iArr7;
            iArr2 = iArr6;
        }
        boolean zMo2939i2 = c1359v6.mo2939i();
        if (zMo2939i2) {
            int[] iArr10 = c1359v.f4957b;
            iArr3 = c1359v2.f4957b;
            iArr4 = iArr10;
        } else {
            C1358u.m3240d(c1359v6.f4957b, iArr8);
            C1358u.m3237b(iArr8, c1359v.f4957b, iArr5);
            C1358u.m3237b(iArr8, c1359v6.f4957b, iArr8);
            C1358u.m3237b(iArr8, c1359v2.f4957b, iArr8);
            iArr3 = iArr8;
            iArr4 = iArr5;
        }
        int[] iArr11 = new int[6];
        C1358u.m3241d(iArr4, iArr2, iArr11);
        C1358u.m3241d(iArr3, iArr, iArr6);
        if (AbstractC1419f.m3645b(iArr11)) {
            return AbstractC1419f.m3645b(iArr6) ? mo2950t() : abstractC1381dD.mo2912e();
        }
        C1358u.m3240d(iArr11, iArr7);
        int[] iArr12 = new int[6];
        C1358u.m3237b(iArr7, iArr11, iArr12);
        C1358u.m3237b(iArr7, iArr4, iArr7);
        C1358u.m3236b(iArr12, iArr12);
        AbstractC1419f.m3655d(iArr3, iArr12, iArr5);
        C1358u.m3231a(AbstractC1419f.m3644b(iArr7, iArr7, iArr12), iArr12);
        C1359v c1359v7 = new C1359v(iArr8);
        C1358u.m3240d(iArr6, c1359v7.f4957b);
        C1358u.m3241d(c1359v7.f4957b, iArr12, c1359v7.f4957b);
        C1359v c1359v8 = new C1359v(iArr12);
        C1358u.m3241d(iArr7, c1359v7.f4957b, c1359v8.f4957b);
        C1358u.m3239c(c1359v8.f4957b, iArr6, iArr5);
        C1358u.m3238c(iArr5, c1359v8.f4957b);
        C1359v c1359v9 = new C1359v(iArr11);
        if (!zMo2939i) {
            C1358u.m3237b(c1359v9.f4957b, c1359v5.f4957b, c1359v9.f4957b);
        }
        if (!zMo2939i2) {
            C1358u.m3237b(c1359v9.f4957b, c1359v6.f4957b, c1359v9.f4957b);
        }
        return new C1360w(abstractC1381dD, c1359v7, c1359v8, new AbstractC1386g[]{c1359v9}, this.f5081f);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: t */
    public final AbstractC1389j mo2950t() {
        if (m3469p()) {
            return this;
        }
        AbstractC1381d abstractC1381dD = m3459d();
        C1359v c1359v = (C1359v) this.f5079d;
        if (c1359v.mo2940j()) {
            return abstractC1381dD.mo2912e();
        }
        C1359v c1359v2 = (C1359v) this.f5078c;
        C1359v c1359v3 = (C1359v) this.f5080e[0];
        int[] iArr = new int[6];
        C1358u.m3240d(c1359v.f4957b, iArr);
        int[] iArr2 = new int[6];
        C1358u.m3240d(iArr, iArr2);
        int[] iArr3 = new int[6];
        C1358u.m3240d(c1359v2.f4957b, iArr3);
        C1358u.m3231a(AbstractC1419f.m3644b(iArr3, iArr3, iArr3), iArr3);
        C1358u.m3237b(iArr, c1359v2.f4957b, iArr);
        C1358u.m3231a(AbstractC1416c.m3600e(6, iArr, 0), iArr);
        int[] iArr4 = new int[6];
        C1358u.m3231a(AbstractC1416c.m3585b(6, iArr2, 0, iArr4), iArr4);
        C1359v c1359v4 = new C1359v(iArr2);
        C1358u.m3240d(iArr3, c1359v4.f4957b);
        C1358u.m3241d(c1359v4.f4957b, iArr, c1359v4.f4957b);
        C1358u.m3241d(c1359v4.f4957b, iArr, c1359v4.f4957b);
        C1359v c1359v5 = new C1359v(iArr);
        C1358u.m3241d(iArr, c1359v4.f4957b, c1359v5.f4957b);
        C1358u.m3237b(c1359v5.f4957b, iArr3, c1359v5.f4957b);
        C1358u.m3241d(c1359v5.f4957b, iArr4, c1359v5.f4957b);
        C1359v c1359v6 = new C1359v(iArr3);
        C1358u.m3242e(c1359v.f4957b, c1359v6.f4957b);
        if (!c1359v3.mo2939i()) {
            C1358u.m3237b(c1359v6.f4957b, c1359v3.f4957b, c1359v6.f4957b);
        }
        return new C1360w(abstractC1381dD, c1359v4, c1359v5, new AbstractC1386g[]{c1359v6}, this.f5081f);
    }
}
