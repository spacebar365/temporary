package org.bouncycastle.p107d.p108a.p109a.p112c;

import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1376c;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.dg */
/* JADX INFO: loaded from: classes.dex */
public final class C1322dg extends AbstractC1389j.a {
    public C1322dg(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2) {
        this(abstractC1381d, abstractC1386g, abstractC1386g2, false);
    }

    public C1322dg(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        super(abstractC1381d, abstractC1386g, abstractC1386g2);
        if ((abstractC1386g == null) != (abstractC1386g2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f5081f = z;
    }

    C1322dg(AbstractC1381d abstractC1381d, AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
        super(abstractC1381d, abstractC1386g, abstractC1386g2, abstractC1386gArr);
        this.f5081f = z;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: b */
    public final AbstractC1389j mo2946b(AbstractC1389j abstractC1389j) {
        AbstractC1386g abstractC1386gMo2933c;
        AbstractC1386g abstractC1386gMo2933c2;
        AbstractC1386g abstractC1386gMo2933c3;
        AbstractC1386g abstractC1386gMo2933c4;
        AbstractC1386g abstractC1386gMo3056a;
        AbstractC1386g abstractC1386gMo2933c5;
        if (m3469p()) {
            return abstractC1389j;
        }
        if (abstractC1389j.m3469p()) {
            return this;
        }
        AbstractC1381d abstractC1381dD = m3459d();
        AbstractC1386g abstractC1386gMo2933c6 = this.f5078c;
        AbstractC1386g abstractC1386gM3464k = abstractC1389j.m3464k();
        if (abstractC1386gMo2933c6.mo2940j()) {
            return abstractC1386gM3464k.mo2940j() ? abstractC1381dD.mo2912e() : abstractC1389j.mo2946b(this);
        }
        AbstractC1386g abstractC1386g = this.f5079d;
        AbstractC1386g abstractC1386g2 = this.f5080e[0];
        AbstractC1386g abstractC1386gM3465l = abstractC1389j.m3465l();
        AbstractC1386g abstractC1386gMo2945a = abstractC1389j.mo2945a(0);
        boolean zMo2939i = abstractC1386g2.mo2939i();
        if (zMo2939i) {
            abstractC1386gMo2933c = abstractC1386gM3465l;
            abstractC1386gMo2933c2 = abstractC1386gM3464k;
        } else {
            abstractC1386gMo2933c2 = abstractC1386gM3464k.mo2933c(abstractC1386g2);
            abstractC1386gMo2933c = abstractC1386gM3465l.mo2933c(abstractC1386g2);
        }
        boolean zMo2939i2 = abstractC1386gMo2945a.mo2939i();
        if (zMo2939i2) {
            abstractC1386gMo2933c3 = abstractC1386g;
        } else {
            abstractC1386gMo2933c6 = abstractC1386gMo2933c6.mo2933c(abstractC1386gMo2945a);
            abstractC1386gMo2933c3 = abstractC1386g.mo2933c(abstractC1386gMo2945a);
        }
        AbstractC1386g abstractC1386gMo2929a = abstractC1386gMo2933c3.mo2929a(abstractC1386gMo2933c);
        AbstractC1386g abstractC1386gMo2929a2 = abstractC1386gMo2933c6.mo2929a(abstractC1386gMo2933c2);
        if (abstractC1386gMo2929a2.mo2940j()) {
            return abstractC1386gMo2929a.mo2940j() ? mo2950t() : abstractC1381dD.mo2912e();
        }
        if (abstractC1386gM3464k.mo2940j()) {
            AbstractC1389j abstractC1389jO = m3468o();
            AbstractC1386g abstractC1386gM3463i = abstractC1389jO.m3463i();
            AbstractC1386g abstractC1386gMo3061j = abstractC1389jO.mo3061j();
            AbstractC1386g abstractC1386gMo2935d = abstractC1386gMo3061j.mo2929a(abstractC1386gM3465l).mo2935d(abstractC1386gM3463i);
            abstractC1386gMo2933c4 = abstractC1386gMo2935d.mo2936e().mo2929a(abstractC1386gMo2935d).mo2929a(abstractC1386gM3463i);
            if (abstractC1386gMo2933c4.mo2940j()) {
                return new C1322dg(abstractC1381dD, abstractC1386gMo2933c4, abstractC1381dD.m3367h(), this.f5081f);
            }
            abstractC1386gMo3056a = abstractC1386gMo2935d.mo2933c(abstractC1386gM3463i.mo2929a(abstractC1386gMo2933c4)).mo2929a(abstractC1386gMo2933c4).mo2929a(abstractC1386gMo3061j).mo2935d(abstractC1386gMo2933c4).mo2929a(abstractC1386gMo2933c4);
            abstractC1386gMo2933c5 = abstractC1381dD.mo2906a(InterfaceC1376c.f4995d);
        } else {
            AbstractC1386g abstractC1386gMo2936e = abstractC1386gMo2929a2.mo2936e();
            AbstractC1386g abstractC1386gMo2933c7 = abstractC1386gMo2929a.mo2933c(abstractC1386gMo2933c6);
            AbstractC1386g abstractC1386gMo2933c8 = abstractC1386gMo2929a.mo2933c(abstractC1386gMo2933c2);
            abstractC1386gMo2933c4 = abstractC1386gMo2933c7.mo2933c(abstractC1386gMo2933c8);
            if (abstractC1386gMo2933c4.mo2940j()) {
                return new C1322dg(abstractC1381dD, abstractC1386gMo2933c4, abstractC1381dD.m3367h(), this.f5081f);
            }
            AbstractC1386g abstractC1386gMo2933c9 = abstractC1386gMo2929a.mo2933c(abstractC1386gMo2936e);
            if (!zMo2939i2) {
                abstractC1386gMo2933c9 = abstractC1386gMo2933c9.mo2933c(abstractC1386gMo2945a);
            }
            abstractC1386gMo3056a = abstractC1386gMo2933c8.mo2929a(abstractC1386gMo2936e).mo3056a(abstractC1386gMo2933c9, abstractC1386g.mo2929a(abstractC1386g2));
            abstractC1386gMo2933c5 = !zMo2939i ? abstractC1386gMo2933c9.mo2933c(abstractC1386g2) : abstractC1386gMo2933c9;
        }
        return new C1322dg(abstractC1381dD, abstractC1386gMo2933c4, abstractC1386gMo3056a, new AbstractC1386g[]{abstractC1386gMo2933c5}, this.f5081f);
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
            return new C1322dg(abstractC1381dD, abstractC1386gMo3058b, abstractC1381dD.m3367h(), this.f5081f);
        }
        AbstractC1386g abstractC1386gMo2933c2 = abstractC1386gMo3058b.mo2936e().mo2933c(abstractC1386gMo2933c);
        AbstractC1386g abstractC1386gMo2933c3 = abstractC1386gMo3058b.mo2933c(abstractC1386gMo2936e4).mo2933c(abstractC1386gMo2936e3);
        return new C1322dg(abstractC1381dD, abstractC1386gMo2933c2, abstractC1386gMo3058b.mo2929a(abstractC1386gMo2936e4).mo2936e().mo3058b(abstractC1386gMo2929a, abstractC1386gMo2932c, abstractC1386gMo2933c3), new AbstractC1386g[]{abstractC1386gMo2933c3}, this.f5081f);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1389j
    /* JADX INFO: renamed from: e */
    protected final AbstractC1389j mo2948e() {
        return new C1322dg(null, m3461g(), m3462h());
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
        return new C1322dg(this.f5077b, abstractC1386g, abstractC1386g2.mo2929a(abstractC1386g3), new AbstractC1386g[]{abstractC1386g3}, this.f5081f);
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
            return new C1322dg(abstractC1381dD, abstractC1386gMo2929a, abstractC1381dD.m3367h(), this.f5081f);
        }
        AbstractC1386g abstractC1386gMo2936e2 = abstractC1386gMo2929a.mo2936e();
        AbstractC1386g abstractC1386gMo2933c = zMo2939i ? abstractC1386gMo2929a : abstractC1386gMo2929a.mo2933c(abstractC1386gMo2936e);
        AbstractC1386g abstractC1386gMo2936e3 = abstractC1386g2.mo2929a(abstractC1386g).mo2936e();
        return new C1322dg(abstractC1381dD, abstractC1386gMo2936e2, abstractC1386gMo2936e3.mo2929a(abstractC1386gMo2929a).mo2929a(abstractC1386gMo2936e).mo2933c(abstractC1386gMo2936e3).mo2929a(zMo2939i ? abstractC1386g3 : abstractC1386gMo2936e.mo2936e()).mo2929a(abstractC1386gMo2936e2).mo2929a(abstractC1386gMo2933c), new AbstractC1386g[]{abstractC1386gMo2933c}, this.f5081f);
    }
}
