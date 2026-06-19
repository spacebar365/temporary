package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1376c;
import org.bouncycastle.p107d.p117c.AbstractC1426m;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.dw */
/* JADX INFO: loaded from: classes.dex */
public final class C1338dw extends AbstractC1389j.a {
    public C1338dw(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        this(abstractC1381d, abstractC1386g, abstractC1386g2, false);
    }

    public C1338dw(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        super(abstractC1381d, abstractC1386g, abstractC1386g2);
        if ((abstractC1386g == null) != (abstractC1386g2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f5081f = z;
    }

    C1338dw(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
        super(abstractC1381d, abstractC1386g, abstractC1386g2, abstractC1386gArr);
        this.f5081f = z;
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
        AbstractC1386g abstractC1386g = this.f5078c;
        if (abstractC1386g.mo2940j()) {
            return abstractC1389j;
        }
        AbstractC1386g abstractC1386gM3464k = abstractC1389j.m3464k();
        AbstractC1386g abstractC1386gMo2945a = abstractC1389j.mo2945a(0);
        if (abstractC1386gM3464k.mo2940j() || !abstractC1386gMo2945a.mo2939i()) {
            return mo2950t().mo2946b(abstractC1389j);
        }
        AbstractC1386g abstractC1386g2 = this.f5079d;
        AbstractC1386g abstractC1386g3 = this.f5080e[0];
        AbstractC1386g abstractC1386gM3465l = abstractC1389j.m3465l();
        AbstractC1386g abstractC1386gMo2936e = abstractC1386g.mo2936e();
        AbstractC1386g abstractC1386gMo2936e2 = abstractC1386g2.mo2936e();
        AbstractC1386g abstractC1386gMo2936e3 = abstractC1386g3.mo2936e();
        AbstractC1386g abstractC1386gMo2929a = abstractC1386gMo2936e2.mo2929a(abstractC1386g2.mo2933c(abstractC1386g3));
        AbstractC1386g abstractC1386gMo2932c = abstractC1386gM3465l.mo2932c();
        AbstractC1386g abstractC1386gMo3058b = abstractC1386gMo2932c.mo2933c(abstractC1386gMo2936e3).mo2929a(abstractC1386gMo2936e2).mo3058b(abstractC1386gMo2929a, abstractC1386gMo2936e, abstractC1386gMo2936e3);
        AbstractC1386g abstractC1386gMo2933c = abstractC1386gM3464k.mo2933c(abstractC1386gMo2936e3);
        AbstractC1386g abstractC1386gMo2936e4 = abstractC1386gMo2933c.mo2929a(abstractC1386gMo2929a).mo2936e();
        if (abstractC1386gMo2936e4.mo2940j()) {
            return abstractC1386gMo3058b.mo2940j() ? abstractC1389j.mo2950t() : abstractC1381dD.mo2912e();
        }
        if (abstractC1386gMo3058b.mo2940j()) {
            return new C1338dw(abstractC1381dD, abstractC1386gMo3058b, abstractC1381dD.m3367h(), this.f5081f);
        }
        AbstractC1386g abstractC1386gMo2933c2 = abstractC1386gMo3058b.mo2936e().mo2933c(abstractC1386gMo2933c);
        AbstractC1386g abstractC1386gMo2933c3 = abstractC1386gMo3058b.mo2933c(abstractC1386gMo2936e4).mo2933c(abstractC1386gMo2936e3);
        return new C1338dw(abstractC1381dD, abstractC1386gMo2933c2, abstractC1386gMo3058b.mo2929a(abstractC1386gMo2936e4).mo2936e().mo3058b(abstractC1386gMo2929a, abstractC1386gMo2932c, abstractC1386gMo2933c3), new AbstractC1386g[]{abstractC1386gMo2933c3}, this.f5081f);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: e */
    protected final AbstractC1389j mo2948e() {
        return new C1338dw(null, m3461g(), m3462h());
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
        return new C1338dw(this.f5077b, abstractC1386g, abstractC1386g2.mo2929a(abstractC1386g3), new AbstractC1386g[]{abstractC1386g3}, this.f5081f);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: t */
    public final AbstractC1389j mo2950t() {
        if (m3469p()) {
            return this;
        }
        AbstractC1381d abstractC1381dD = m3459d();
        AbstractC1386g abstractC1386g = this.f5078c;
        if (abstractC1386g.mo2940j()) {
            return abstractC1381dD.mo2912e();
        }
        AbstractC1386g abstractC1386g2 = this.f5079d;
        AbstractC1386g abstractC1386g3 = this.f5080e[0];
        boolean zMo2939i = abstractC1386g3.mo2939i();
        AbstractC1386g abstractC1386gMo2936e = zMo2939i ? abstractC1386g3 : abstractC1386g3.mo2936e();
        AbstractC1386g abstractC1386gMo2929a = zMo2939i ? abstractC1386g2.mo2936e().mo2929a(abstractC1386g2) : abstractC1386g2.mo2929a(abstractC1386g3).mo2933c(abstractC1386g2);
        if (abstractC1386gMo2929a.mo2940j()) {
            return new C1338dw(abstractC1381dD, abstractC1386gMo2929a, abstractC1381dD.m3367h(), this.f5081f);
        }
        AbstractC1386g abstractC1386gMo2936e2 = abstractC1386gMo2929a.mo2936e();
        AbstractC1386g abstractC1386gMo2933c = zMo2939i ? abstractC1386gMo2929a : abstractC1386gMo2929a.mo2933c(abstractC1386gMo2936e);
        AbstractC1386g abstractC1386gMo2936e3 = abstractC1386g2.mo2929a(abstractC1386g).mo2936e();
        return new C1338dw(abstractC1381dD, abstractC1386gMo2936e2, abstractC1386gMo2936e3.mo2929a(abstractC1386gMo2929a).mo2929a(abstractC1386gMo2936e).mo2933c(abstractC1386gMo2936e3).mo2929a(zMo2939i ? abstractC1386g3 : abstractC1386gMo2936e.mo2936e()).mo2929a(abstractC1386gMo2936e2).mo2929a(abstractC1386gMo2933c), new AbstractC1386g[]{abstractC1386gMo2933c}, this.f5081f);
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
            c1335dt = (C1335dt) abstractC1386gMo2935d.mo2936e().mo2929a(abstractC1386gMo2935d).mo2929a(c1335dt10);
            if (c1335dt.mo2940j()) {
                return new C1338dw(abstractC1381dD, c1335dt, abstractC1381dD.m3367h(), this.f5081f);
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
                return new C1338dw(abstractC1381dD, c1335dt, abstractC1381dD.m3367h(), this.f5081f);
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
        return new C1338dw(abstractC1381dD, c1335dt, c1335dt2, new AbstractC1386g[]{c1335dt3}, this.f5081f);
    }
}
