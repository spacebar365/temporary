package org.bouncycastle.p054a.p074s;

import java.util.Enumeration;
import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.AbstractC0747x;
import org.bouncycastle.p054a.C0549al;
import org.bouncycastle.p054a.C0590bn;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;

/* JADX INFO: renamed from: org.bouncycastle.a.s.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0683w extends AbstractC0650o implements InterfaceC0674n {

    /* JADX INFO: renamed from: bO */
    private C0640m f2794bO;

    /* JADX INFO: renamed from: bP */
    private AbstractC0747x f2795bP;

    /* JADX INFO: renamed from: bQ */
    private C0663c f2796bQ;

    /* JADX INFO: renamed from: bR */
    private AbstractC0747x f2797bR;

    /* JADX INFO: renamed from: bS */
    private AbstractC0747x f2798bS;

    /* JADX INFO: renamed from: bT */
    private AbstractC0747x f2799bT;

    public C0683w(C0640m c0640m, AbstractC0747x abstractC0747x, C0663c c0663c, AbstractC0747x abstractC0747x2, AbstractC0747x abstractC0747x3) {
        this.f2794bO = c0640m;
        this.f2795bP = abstractC0747x;
        this.f2796bQ = c0663c;
        this.f2797bR = abstractC0747x2;
        this.f2798bS = null;
        this.f2799bT = abstractC0747x3;
    }

    private C0683w(AbstractC0723v abstractC0723v) {
        Enumeration enumerationMo1483c = abstractC0723v.mo1483c();
        this.f2794bO = (C0640m) enumerationMo1483c.nextElement();
        this.f2795bP = (AbstractC0747x) enumerationMo1483c.nextElement();
        this.f2796bQ = C0663c.m1615a(enumerationMo1483c.nextElement());
        while (enumerationMo1483c.hasMoreElements()) {
            AbstractC0686u abstractC0686u = (AbstractC0686u) enumerationMo1483c.nextElement();
            if (abstractC0686u instanceof AbstractC0539ab) {
                AbstractC0539ab abstractC0539ab = (AbstractC0539ab) abstractC0686u;
                switch (abstractC0539ab.m1396b()) {
                    case 0:
                        this.f2797bR = AbstractC0747x.m1742a(abstractC0539ab);
                        break;
                    case 1:
                        this.f2798bS = AbstractC0747x.m1742a(abstractC0539ab);
                        break;
                    default:
                        throw new IllegalArgumentException("unknown tag value " + abstractC0539ab.m1396b());
                }
            } else {
                this.f2799bT = (AbstractC0747x) abstractC0686u;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0683w m1689a(Object obj) {
        if (obj != null) {
            return new C0683w(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0747x m1690a() {
        return this.f2797bR;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0747x m1691b() {
        return this.f2798bS;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2794bO);
        c0625g.m1521a(this.f2795bP);
        c0625g.m1521a(this.f2796bQ);
        if (this.f2797bR != null) {
            c0625g.m1521a(new C0590bn(false, 0, this.f2797bR));
        }
        if (this.f2798bS != null) {
            c0625g.m1521a(new C0590bn(false, 1, this.f2798bS));
        }
        c0625g.m1521a(this.f2799bT);
        return new C0549al(c0625g);
    }
}
