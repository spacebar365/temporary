package org.bouncycastle.p054a.p082z;

import java.util.Enumeration;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0558au;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p080y.C0756c;
import org.bouncycastle.p054a.p082z.C0781v;
import org.bouncycastle.p054a.p082z.C0781v.c;

/* JADX INFO: renamed from: org.bouncycastle.a.z.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0767h extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    C0781v f3152a;

    /* JADX INFO: renamed from: b */
    C0759a f3153b;

    /* JADX INFO: renamed from: c */
    C0558au f3154c;

    /* JADX INFO: renamed from: d */
    boolean f3155d = false;

    /* JADX INFO: renamed from: e */
    int f3156e;

    /* JADX INFO: renamed from: a */
    public static C0767h m1804a(Object obj) {
        if (obj instanceof C0767h) {
            return (C0767h) obj;
        }
        if (obj != null) {
            return new C0767h(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0781v m1805a() {
        return this.f3152a;
    }

    /* JADX INFO: renamed from: c */
    public final C0759a m1807c() {
        return this.f3153b;
    }

    /* JADX INFO: renamed from: d */
    public final C0558au m1808d() {
        return this.f3154c;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o
    public final int hashCode() {
        if (!this.f3155d) {
            this.f3156e = super.hashCode();
            this.f3155d = true;
        }
        return this.f3156e;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f3152a);
        c0625g.m1521a(this.f3153b);
        c0625g.m1521a(this.f3154c);
        return new C0585bi(c0625g);
    }

    private C0767h(AbstractC0723v abstractC0723v) {
        if (abstractC0723v.mo1484d() != 3) {
            throw new IllegalArgumentException("sequence wrong size for CertificateList");
        }
        InterfaceC0618f interfaceC0618fMo1482a = abstractC0723v.mo1482a(0);
        this.f3152a = interfaceC0618fMo1482a instanceof C0781v ? (C0781v) interfaceC0618fMo1482a : interfaceC0618fMo1482a != null ? new C0781v(AbstractC0723v.m1708a(interfaceC0618fMo1482a)) : null;
        this.f3153b = C0759a.m1781a(abstractC0723v.mo1482a(1));
        this.f3154c = C0558au.m1414a(abstractC0723v.mo1482a(2));
    }

    /* JADX INFO: renamed from: b */
    public final Enumeration m1806b() {
        C0781v c0781v = this.f3152a;
        return c0781v.f3223f == null ? new C0781v.b(c0781v, (byte) 0) : c0781v.new c(c0781v.f3223f.mo1483c());
    }

    /* JADX INFO: renamed from: e */
    public final int m1809e() {
        C0781v c0781v = this.f3152a;
        if (c0781v.f3218a == null) {
            return 1;
        }
        return c0781v.f3218a.m1564b().intValue() + 1;
    }

    /* JADX INFO: renamed from: f */
    public final C0756c m1810f() {
        return this.f3152a.f3220c;
    }

    /* JADX INFO: renamed from: g */
    public final C0783x m1811g() {
        return this.f3152a.f3221d;
    }

    /* JADX INFO: renamed from: h */
    public final C0783x m1812h() {
        return this.f3152a.f3222e;
    }
}
