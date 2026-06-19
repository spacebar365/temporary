package org.bouncycastle.p054a.p074s;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p082z.C0759a;

/* JADX INFO: renamed from: org.bouncycastle.a.s.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0668h extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private C0759a f2596a;

    public C0668h(C0653p c0653p, InterfaceC0618f interfaceC0618f) {
        this.f2596a = new C0759a(c0653p, interfaceC0618f);
    }

    private C0668h(AbstractC0723v abstractC0723v) {
        this.f2596a = C0759a.m1781a(abstractC0723v);
    }

    /* JADX INFO: renamed from: a */
    public static C0668h m1631a(Object obj) {
        if (obj instanceof C0668h) {
            return (C0668h) obj;
        }
        if (obj != null) {
            return new C0668h(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0653p m1632a() {
        return this.f2596a.m1783a();
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0618f m1633b() {
        return this.f2596a.m1784b();
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return this.f2596a.mo1358i();
    }
}
