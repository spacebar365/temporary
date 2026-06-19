package org.bouncycastle.p054a.p082z;

import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;

/* JADX INFO: renamed from: org.bouncycastle.a.z.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0759a extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private C0653p f3115a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0618f f3116b;

    public C0759a(C0653p c0653p) {
        this.f3115a = c0653p;
    }

    public C0759a(C0653p c0653p, InterfaceC0618f interfaceC0618f) {
        this.f3115a = c0653p;
        this.f3116b = interfaceC0618f;
    }

    private C0759a(AbstractC0723v abstractC0723v) {
        if (abstractC0723v.mo1484d() <= 0 || abstractC0723v.mo1484d() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC0723v.mo1484d());
        }
        this.f3115a = C0653p.m1584a(abstractC0723v.mo1482a(0));
        if (abstractC0723v.mo1484d() == 2) {
            this.f3116b = abstractC0723v.mo1482a(1);
        } else {
            this.f3116b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0759a m1781a(Object obj) {
        if (obj instanceof C0759a) {
            return (C0759a) obj;
        }
        if (obj != null) {
            return new C0759a(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static C0759a m1782a(AbstractC0539ab abstractC0539ab) {
        return m1781a(AbstractC0723v.m1709a(abstractC0539ab, true));
    }

    /* JADX INFO: renamed from: a */
    public final C0653p m1783a() {
        return this.f3115a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0618f m1784b() {
        return this.f3116b;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f3115a);
        if (this.f3116b != null) {
            c0625g.m1521a(this.f3116b);
        }
        return new C0585bi(c0625g);
    }
}
