package org.bouncycastle.p054a.p061f;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0653p;

/* JADX INFO: renamed from: org.bouncycastle.a.f.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0624f extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private C0653p f2234a;

    /* JADX INFO: renamed from: b */
    private C0653p f2235b;

    /* JADX INFO: renamed from: c */
    private C0653p f2236c;

    public C0624f(C0653p c0653p, C0653p c0653p2) {
        this.f2234a = c0653p;
        this.f2235b = c0653p2;
        this.f2236c = null;
    }

    public C0624f(C0653p c0653p, C0653p c0653p2, C0653p c0653p3) {
        this.f2234a = c0653p;
        this.f2235b = c0653p2;
        this.f2236c = c0653p3;
    }

    public C0624f(AbstractC0723v abstractC0723v) {
        this.f2234a = (C0653p) abstractC0723v.mo1482a(0);
        this.f2235b = (C0653p) abstractC0723v.mo1482a(1);
        if (abstractC0723v.mo1484d() > 2) {
            this.f2236c = (C0653p) abstractC0723v.mo1482a(2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0624f m1515a(Object obj) {
        if (obj instanceof C0624f) {
            return (C0624f) obj;
        }
        if (obj != null) {
            return new C0624f(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0653p m1516a() {
        return this.f2234a;
    }

    /* JADX INFO: renamed from: b */
    public final C0653p m1517b() {
        return this.f2235b;
    }

    /* JADX INFO: renamed from: c */
    public final C0653p m1518c() {
        return this.f2236c;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2234a);
        c0625g.m1521a(this.f2235b);
        if (this.f2236c != null) {
            c0625g.m1521a(this.f2236c);
        }
        return new C0585bi(c0625g);
    }
}
