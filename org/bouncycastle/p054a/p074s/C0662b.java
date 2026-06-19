package org.bouncycastle.p054a.p074s;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0590bn;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;

/* JADX INFO: renamed from: org.bouncycastle.a.s.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0662b extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private C0653p f2584a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0618f f2585b;

    public C0662b(C0653p c0653p, InterfaceC0618f interfaceC0618f) {
        this.f2584a = c0653p;
        this.f2585b = interfaceC0618f;
    }

    private C0662b(AbstractC0723v abstractC0723v) {
        this.f2584a = (C0653p) abstractC0723v.mo1482a(0);
        this.f2585b = ((C0590bn) abstractC0723v.mo1482a(1)).m1402j();
    }

    /* JADX INFO: renamed from: a */
    public static C0662b m1612a(Object obj) {
        if (obj instanceof C0662b) {
            return (C0662b) obj;
        }
        if (obj != null) {
            return new C0662b(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0653p m1613a() {
        return this.f2584a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0618f m1614b() {
        return this.f2585b;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2584a);
        c0625g.m1521a(new C0590bn(this.f2585b));
        return new C0585bi(c0625g);
    }
}
