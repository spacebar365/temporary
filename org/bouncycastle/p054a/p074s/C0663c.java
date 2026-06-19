package org.bouncycastle.p054a.p074s;

import java.util.Enumeration;
import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0549al;
import org.bouncycastle.p054a.C0553ap;
import org.bouncycastle.p054a.C0599bw;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;

/* JADX INFO: renamed from: org.bouncycastle.a.s.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0663c extends AbstractC0650o implements InterfaceC0674n {

    /* JADX INFO: renamed from: bO */
    private C0653p f2586bO;

    /* JADX INFO: renamed from: bP */
    private InterfaceC0618f f2587bP;

    /* JADX INFO: renamed from: bQ */
    private boolean f2588bQ;

    public C0663c(C0653p c0653p, InterfaceC0618f interfaceC0618f) {
        this.f2588bQ = true;
        this.f2586bO = c0653p;
        this.f2587bP = interfaceC0618f;
    }

    private C0663c(AbstractC0723v abstractC0723v) {
        this.f2588bQ = true;
        Enumeration enumerationMo1483c = abstractC0723v.mo1483c();
        this.f2586bO = (C0653p) enumerationMo1483c.nextElement();
        if (enumerationMo1483c.hasMoreElements()) {
            this.f2587bP = ((AbstractC0539ab) enumerationMo1483c.nextElement()).m1402j();
        }
        this.f2588bQ = abstractC0723v instanceof C0549al;
    }

    /* JADX INFO: renamed from: a */
    public static C0663c m1615a(Object obj) {
        if (obj instanceof C0663c) {
            return (C0663c) obj;
        }
        if (obj != null) {
            return new C0663c(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0653p m1616a() {
        return this.f2586bO;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0618f m1617b() {
        return this.f2587bP;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2586bO);
        if (this.f2587bP != null) {
            c0625g.m1521a(new C0553ap(true, 0, this.f2587bP));
        }
        return this.f2588bQ ? new C0549al(c0625g) : new C0599bw(c0625g);
    }
}
