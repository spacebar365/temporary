package org.bouncycastle.p054a.p074s;

import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.AbstractC0747x;
import org.bouncycastle.p054a.C0599bw;
import org.bouncycastle.p054a.C0601by;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;

/* JADX INFO: renamed from: org.bouncycastle.a.s.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0682v extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private C0653p f2791a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0618f f2792b;

    /* JADX INFO: renamed from: c */
    private AbstractC0747x f2793c;

    public C0682v(C0653p c0653p, InterfaceC0618f interfaceC0618f, AbstractC0747x abstractC0747x) {
        this.f2791a = c0653p;
        this.f2792b = interfaceC0618f;
        this.f2793c = abstractC0747x;
    }

    private C0682v(AbstractC0723v abstractC0723v) {
        this.f2791a = (C0653p) abstractC0723v.mo1482a(0);
        this.f2792b = ((AbstractC0539ab) abstractC0723v.mo1482a(1)).m1402j();
        if (abstractC0723v.mo1484d() == 3) {
            this.f2793c = (AbstractC0747x) abstractC0723v.mo1482a(2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0682v m1685a(Object obj) {
        if (obj instanceof C0682v) {
            return (C0682v) obj;
        }
        if (obj != null) {
            return new C0682v(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0653p m1686a() {
        return this.f2791a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0618f m1687b() {
        return this.f2792b;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0747x m1688c() {
        return this.f2793c;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2791a);
        c0625g.m1521a(new C0601by(true, 0, this.f2792b));
        if (this.f2793c != null) {
            c0625g.m1521a(this.f2793c);
        }
        return new C0599bw(c0625g);
    }
}
