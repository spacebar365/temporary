package org.bouncycastle.p054a.p080y;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;

/* JADX INFO: renamed from: org.bouncycastle.a.y.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0750a extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private C0653p f3015a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0618f f3016b;

    private C0750a(AbstractC0723v abstractC0723v) {
        this.f3015a = (C0653p) abstractC0723v.mo1482a(0);
        this.f3016b = abstractC0723v.mo1482a(1);
    }

    /* JADX INFO: renamed from: a */
    public static C0750a m1754a(Object obj) {
        if (obj instanceof C0750a) {
            return (C0750a) obj;
        }
        if (obj != null) {
            return new C0750a(AbstractC0723v.m1708a(obj));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    /* JADX INFO: renamed from: a */
    public final C0653p m1755a() {
        return this.f3015a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0618f m1756b() {
        return this.f3016b;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f3015a);
        c0625g.m1521a(this.f3016b);
        return new C0585bi(c0625g);
    }
}
