package org.bouncycastle.p054a.p074s;

import java.util.Enumeration;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.InterfaceC0618f;

/* JADX INFO: renamed from: org.bouncycastle.a.s.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0671k extends AbstractC0650o implements InterfaceC0674n {

    /* JADX INFO: renamed from: bO */
    private C0668h f2603bO;

    /* JADX INFO: renamed from: bP */
    private C0667g f2604bP;

    public C0671k(C0668h c0668h, C0667g c0667g) {
        this.f2603bO = c0668h;
        this.f2604bP = c0667g;
    }

    private C0671k(AbstractC0723v abstractC0723v) {
        Enumeration enumerationMo1483c = abstractC0723v.mo1483c();
        AbstractC0723v abstractC0723vM1708a = AbstractC0723v.m1708a((Object) ((InterfaceC0618f) enumerationMo1483c.nextElement()).mo1358i());
        if (abstractC0723vM1708a.mo1482a(0).equals(f2613B)) {
            this.f2603bO = new C0668h(f2613B, C0672l.m1644a(abstractC0723vM1708a.mo1482a(1)));
        } else {
            this.f2603bO = C0668h.m1631a(abstractC0723vM1708a);
        }
        this.f2604bP = C0667g.m1628a(enumerationMo1483c.nextElement());
    }

    /* JADX INFO: renamed from: a */
    public static C0671k m1641a(Object obj) {
        if (obj instanceof C0671k) {
            return (C0671k) obj;
        }
        if (obj != null) {
            return new C0671k(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0668h m1642a() {
        return this.f2603bO;
    }

    /* JADX INFO: renamed from: b */
    public final C0667g m1643b() {
        return this.f2604bP;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2603bO);
        c0625g.m1521a(this.f2604bP);
        return new C0585bi(c0625g);
    }
}
