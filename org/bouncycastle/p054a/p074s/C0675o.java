package org.bouncycastle.p054a.p074s;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0549al;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;

/* JADX INFO: renamed from: org.bouncycastle.a.s.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0675o extends AbstractC0650o implements InterfaceC0674n {

    /* JADX INFO: renamed from: bO */
    private C0663c f2756bO;

    /* JADX INFO: renamed from: bP */
    private C0669i f2757bP;

    public C0675o(C0663c c0663c, C0669i c0669i) {
        this.f2757bP = null;
        this.f2756bO = c0663c;
        this.f2757bP = c0669i;
    }

    private C0675o(AbstractC0723v abstractC0723v) {
        this.f2757bP = null;
        if (C0640m.m1561a(abstractC0723v.mo1482a(0)).m1564b().intValue() != 3) {
            throw new IllegalArgumentException("wrong version for PFX PDU");
        }
        this.f2756bO = C0663c.m1615a(abstractC0723v.mo1482a(1));
        if (abstractC0723v.mo1484d() == 3) {
            this.f2757bP = C0669i.m1634a(abstractC0723v.mo1482a(2));
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0675o m1653a(Object obj) {
        if (obj != null) {
            return new C0675o(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0663c m1654a() {
        return this.f2756bO;
    }

    /* JADX INFO: renamed from: b */
    public final C0669i m1655b() {
        return this.f2757bP;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0640m(3L));
        c0625g.m1521a(this.f2756bO);
        if (this.f2757bP != null) {
            c0625g.m1521a(this.f2757bP);
        }
        return new C0549al(c0625g);
    }
}
