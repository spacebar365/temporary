package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1376c;
import org.bouncycastle.p107d.p117c.AbstractC1426m;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.dz */
/* JADX INFO: loaded from: classes.dex */
public final class C1341dz extends AbstractC1389j.a {
    public C1341dz(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        this(abstractC1381d, abstractC1386g, abstractC1386g2, false);
    }

    public C1341dz(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        super(abstractC1381d, abstractC1386g, abstractC1386g2);
        if ((abstractC1386g == null) != (abstractC1386g2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f5081f = z;
    }

    C1341dz(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
        super(abstractC1381d, abstractC1386g, abstractC1386g2, abstractC1386gArr);
        this.f5081f = z;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: e */
    protected final AbstractC1389j mo2948e() {
        return new C1341dz(null, m3461g(), m3462h());
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: j */
    public final AbstractC1386g mo3061j() {
        AbstractC1386g abstractC1386g = this.f5078c;
        AbstractC1386g abstractC1386g2 = this.f5079d;
        if (m3469p() || abstractC1386g.mo2940j()) {
            return abstractC1386g2;
        }
        AbstractC1386g abstractC1386gMo2933c = abstractC1386g2.mo2929a(abstractC1386g).mo2933c(abstractC1386g);
        AbstractC1386g abstractC1386g3 = this.f5080e[0];
        return !abstractC1386g3.mo2939i() ? abstractC1386gMo2933c.mo2935d(abstractC1386g3) : abstractC1386gMo2933c;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: r */
    protected final boolean mo3062r() {
        AbstractC1386g abstractC1386gK = m3464k();
        return (abstractC1386gK.mo2940j() || m3465l().mo2941k() == abstractC1386gK.mo2941k()) ? false : true;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: s */
    public final AbstractC1389j mo2949s() {
        if (m3469p()) {
            return this;
        }
        AbstractC1386g abstractC1386g = this.f5078c;
        if (abstractC1386g.mo2940j()) {
            return this;
        }
        AbstractC1386g abstractC1386g2 = this.f5079d;
        AbstractC1386g abstractC1386g3 = this.f5080e[0];
        return new C1341dz(this.f5077b, abstractC1386g, abstractC1386g2.mo2929a(abstractC1386g3), new AbstractC1386g[]{abstractC1386g3}, this.f5081f);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: b */
    public final AbstractC1389j mo2946b(AbstractC1389j abstractC1389j) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        C1335dt c1335dt;
        C1335dt c1335dt2;
        C1335dt c1335dt3;
        if (m3469p()) {
            return abstractC1389j;
        }
        if (abstractC1389j.m3469p()) {
            return this;
        }
        AbstractC1381d abstractC1381dD = m3459d();
        C1335dt c1335dt4 = (C1335dt) this.f5078c;
        C1335dt c1335dt5 = (C1335dt) abstractC1389j.m3464k();
        if (c1335dt4.mo2940j()) {
            return c1335dt5.mo2940j() ? abstractC1381dD.mo2912e() : abstractC1389j.mo2946b(this);
        }
        C1335dt c1335dt6 = (C1335dt) this.f5079d;
        C1335dt c1335dt7 = (C1335dt) this.f5080e[0];
        C1335dt c1335dt8 = (C1335dt) abstractC1389j.m3465l();
        C1335dt c1335dt9 = (C1335dt) abstractC1389j.mo2945a(0);
        long[] jArr5 = new long[9];
        long[] jArr6 = new long[9];
        long[] jArr7 = new long[9];
        long[] jArr8 = new long[9];
        long[] jArrM3191a = c1335dt7.mo2939i() ? null : C1334ds.m3191a(c1335dt7.f4912a);
        if (jArrM3191a == null) {
            jArr2 = c1335dt5.f4912a;
            jArr = c1335dt8.f4912a;
        } else {
            C1334ds.m3200e(c1335dt5.f4912a, jArrM3191a, jArr6);
            C1334ds.m3200e(c1335dt8.f4912a, jArrM3191a, jArr8);
            jArr = jArr8;
            jArr2 = jArr6;
        }
        long[] jArrM3191a2 = c1335dt9.mo2939i() ? null : C1334ds.m3191a(c1335dt9.f4912a);
        if (jArrM3191a2 == null) {
            jArr4 = c1335dt4.f4912a;
            jArr3 = c1335dt6.f4912a;
        } else {
            C1334ds.m3200e(c1335dt4.f4912a, jArrM3191a2, jArr5);
            C1334ds.m3200e(c1335dt6.f4912a, jArrM3191a2, jArr7);
            jArr3 = jArr7;
            jArr4 = jArr5;
        }
        C1334ds.m3189a(jArr3, jArr, jArr7);
        C1334ds.m3189a(jArr4, jArr2, jArr8);
        if (AbstractC1426m.m3716a(jArr8)) {
            return AbstractC1426m.m3716a(jArr7) ? mo2950t() : abstractC1381dD.mo2912e();
        }
        if (c1335dt5.mo2940j()) {
            AbstractC1389j abstractC1389jO = m3468o();
            C1335dt c1335dt10 = (C1335dt) abstractC1389jO.m3463i();
            AbstractC1386g abstractC1386gMo3061j = abstractC1389jO.mo3061j();
            AbstractC1386g abstractC1386gMo2935d = abstractC1386gMo3061j.mo2929a(c1335dt8).mo2935d(c1335dt10);
            c1335dt = (C1335dt) abstractC1386gMo2935d.mo2936e().mo2929a(abstractC1386gMo2935d).mo2929a(c1335dt10).mo2932c();
            if (c1335dt.mo2940j()) {
                return new C1341dz(abstractC1381dD, c1335dt, C1339dx.f4918k, this.f5081f);
            }
            C1335dt c1335dt11 = (C1335dt) abstractC1386gMo2935d.mo2933c(c1335dt10.mo2929a(c1335dt)).mo2929a(c1335dt).mo2929a(abstractC1386gMo3061j).mo2935d(c1335dt).mo2929a(c1335dt);
            c1335dt3 = (C1335dt) abstractC1381dD.mo2906a(InterfaceC1376c.f4995d);
            c1335dt2 = c1335dt11;
        } else {
            C1334ds.m3199e(jArr8, jArr8);
            long[] jArrM3191a3 = C1334ds.m3191a(jArr7);
            C1334ds.m3200e(jArr4, jArrM3191a3, jArr5);
            C1334ds.m3200e(jArr2, jArrM3191a3, jArr6);
            c1335dt = new C1335dt(jArr5);
            C1334ds.m3196c(jArr5, jArr6, c1335dt.f4912a);
            if (c1335dt.mo2940j()) {
                return new C1341dz(abstractC1381dD, c1335dt, C1339dx.f4918k, this.f5081f);
            }
            C1335dt c1335dt12 = new C1335dt(jArr7);
            C1334ds.m3200e(jArr8, jArrM3191a3, c1335dt12.f4912a);
            if (jArrM3191a2 != null) {
                C1334ds.m3200e(c1335dt12.f4912a, jArrM3191a2, c1335dt12.f4912a);
            }
            long[] jArr9 = new long[18];
            C1334ds.m3189a(jArr6, jArr8, jArr8);
            C1334ds.m3201f(jArr8, jArr9);
            C1334ds.m3189a(c1335dt6.f4912a, c1335dt7.f4912a, jArr8);
            C1334ds.m3198d(jArr8, c1335dt12.f4912a, jArr9);
            c1335dt2 = new C1335dt(jArr8);
            C1334ds.m3195c(jArr9, c1335dt2.f4912a);
            if (jArrM3191a != null) {
                C1334ds.m3200e(c1335dt12.f4912a, jArrM3191a, c1335dt12.f4912a);
            }
            c1335dt3 = c1335dt12;
        }
        return new C1341dz(abstractC1381dD, c1335dt, c1335dt2, new AbstractC1386g[]{c1335dt3}, this.f5081f);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: t */
    public final AbstractC1389j mo2950t() {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        if (m3469p()) {
            return this;
        }
        AbstractC1381d abstractC1381dD = m3459d();
        C1335dt c1335dt = (C1335dt) this.f5078c;
        if (c1335dt.mo2940j()) {
            return abstractC1381dD.mo2912e();
        }
        C1335dt c1335dt2 = (C1335dt) this.f5079d;
        C1335dt c1335dt3 = (C1335dt) this.f5080e[0];
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        long[] jArrM3191a = c1335dt3.mo2939i() ? null : C1334ds.m3191a(c1335dt3.f4912a);
        if (jArrM3191a == null) {
            long[] jArr6 = c1335dt2.f4912a;
            jArr2 = c1335dt3.f4912a;
            jArr = jArr6;
        } else {
            C1334ds.m3200e(c1335dt2.f4912a, jArrM3191a, jArr4);
            C1334ds.m3199e(c1335dt3.f4912a, jArr5);
            jArr = jArr4;
            jArr2 = jArr5;
        }
        long[] jArr7 = new long[9];
        C1334ds.m3199e(c1335dt2.f4912a, jArr7);
        C1334ds.m3194b(jArr, jArr2, jArr7);
        if (AbstractC1426m.m3716a(jArr7)) {
            return new C1341dz(abstractC1381dD, new C1335dt(jArr7), C1339dx.f4918k, this.f5081f);
        }
        long[] jArr8 = new long[18];
        C1334ds.m3198d(jArr7, jArr, jArr8);
        C1335dt c1335dt4 = new C1335dt(jArr4);
        C1334ds.m3199e(jArr7, c1335dt4.f4912a);
        C1335dt c1335dt5 = new C1335dt(jArr7);
        if (jArrM3191a != null) {
            C1334ds.m3196c(c1335dt5.f4912a, jArr2, c1335dt5.f4912a);
        }
        if (jArrM3191a == null) {
            jArr3 = c1335dt.f4912a;
        } else {
            C1334ds.m3200e(c1335dt.f4912a, jArrM3191a, jArr5);
            jArr3 = jArr5;
        }
        C1334ds.m3201f(jArr3, jArr8);
        C1334ds.m3195c(jArr8, jArr5);
        C1334ds.m3194b(c1335dt4.f4912a, c1335dt5.f4912a, jArr5);
        return new C1341dz(abstractC1381dD, c1335dt4, new C1335dt(jArr5), new AbstractC1386g[]{c1335dt5}, this.f5081f);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: d */
    public final AbstractC1389j mo2947d(AbstractC1389j abstractC1389j) {
        if (m3469p()) {
            return abstractC1389j;
        }
        if (abstractC1389j.m3469p()) {
            return mo2950t();
        }
        AbstractC1381d abstractC1381dD = m3459d();
        C1335dt c1335dt = (C1335dt) this.f5078c;
        if (c1335dt.mo2940j()) {
            return abstractC1389j;
        }
        C1335dt c1335dt2 = (C1335dt) abstractC1389j.m3464k();
        C1335dt c1335dt3 = (C1335dt) abstractC1389j.mo2945a(0);
        if (c1335dt2.mo2940j() || !c1335dt3.mo2939i()) {
            return mo2950t().mo2946b(abstractC1389j);
        }
        C1335dt c1335dt4 = (C1335dt) this.f5079d;
        C1335dt c1335dt5 = (C1335dt) this.f5080e[0];
        C1335dt c1335dt6 = (C1335dt) abstractC1389j.m3465l();
        long[] jArr = new long[9];
        long[] jArr2 = new long[9];
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        C1334ds.m3199e(c1335dt.f4912a, jArr);
        C1334ds.m3199e(c1335dt4.f4912a, jArr2);
        C1334ds.m3199e(c1335dt5.f4912a, jArr3);
        C1334ds.m3196c(c1335dt4.f4912a, c1335dt5.f4912a, jArr4);
        C1334ds.m3194b(jArr3, jArr2, jArr4);
        long[] jArrM3191a = C1334ds.m3191a(jArr3);
        C1334ds.m3200e(c1335dt6.f4912a, jArrM3191a, jArr3);
        C1334ds.m3189a(jArr3, jArr2, jArr3);
        long[] jArr5 = new long[18];
        C1334ds.m3198d(jArr3, jArr4, jArr5);
        C1334ds.m3202f(jArr, jArrM3191a, jArr5);
        C1334ds.m3195c(jArr5, jArr3);
        C1334ds.m3200e(c1335dt2.f4912a, jArrM3191a, jArr);
        C1334ds.m3189a(jArr, jArr4, jArr2);
        C1334ds.m3199e(jArr2, jArr2);
        if (AbstractC1426m.m3716a(jArr2)) {
            return AbstractC1426m.m3716a(jArr3) ? abstractC1389j.mo2950t() : abstractC1381dD.mo2912e();
        }
        if (AbstractC1426m.m3716a(jArr3)) {
            return new C1341dz(abstractC1381dD, new C1335dt(jArr3), C1339dx.f4918k, this.f5081f);
        }
        C1335dt c1335dt7 = new C1335dt();
        C1334ds.m3199e(jArr3, c1335dt7.f4912a);
        C1334ds.m3196c(c1335dt7.f4912a, jArr, c1335dt7.f4912a);
        C1335dt c1335dt8 = new C1335dt(jArr);
        C1334ds.m3196c(jArr3, jArr2, c1335dt8.f4912a);
        C1334ds.m3200e(c1335dt8.f4912a, jArrM3191a, c1335dt8.f4912a);
        C1335dt c1335dt9 = new C1335dt(jArr2);
        C1334ds.m3189a(jArr3, jArr2, c1335dt9.f4912a);
        C1334ds.m3199e(c1335dt9.f4912a, c1335dt9.f4912a);
        for (int i = 0; i < 18; i++) {
            jArr5[i] = 0;
        }
        C1334ds.m3198d(c1335dt9.f4912a, jArr4, jArr5);
        C1334ds.m3188a(c1335dt6.f4912a, jArr4);
        C1334ds.m3198d(jArr4, c1335dt8.f4912a, jArr5);
        C1334ds.m3195c(jArr5, c1335dt9.f4912a);
        return new C1341dz(abstractC1381dD, c1335dt7, c1335dt9, new AbstractC1386g[]{c1335dt8}, this.f5081f);
    }
}
