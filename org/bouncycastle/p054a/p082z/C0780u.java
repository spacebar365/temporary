package org.bouncycastle.p054a.p082z;

import java.util.Enumeration;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0558au;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.InterfaceC0618f;

/* JADX INFO: renamed from: org.bouncycastle.a.z.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0780u extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private C0759a f3216a;

    /* JADX INFO: renamed from: b */
    private C0558au f3217b;

    private C0780u(AbstractC0723v abstractC0723v) {
        if (abstractC0723v.mo1484d() != 2) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC0723v.mo1484d());
        }
        Enumeration enumerationMo1483c = abstractC0723v.mo1483c();
        this.f3216a = C0759a.m1781a(enumerationMo1483c.nextElement());
        this.f3217b = C0558au.m1414a(enumerationMo1483c.nextElement());
    }

    public C0780u(C0759a c0759a, InterfaceC0618f interfaceC0618f) {
        this.f3217b = new C0558au(interfaceC0618f);
        this.f3216a = c0759a;
    }

    public C0780u(C0759a c0759a, byte[] bArr) {
        this.f3217b = new C0558au(bArr);
        this.f3216a = c0759a;
    }

    /* JADX INFO: renamed from: a */
    public static C0780u m1843a(Object obj) {
        if (obj instanceof C0780u) {
            return (C0780u) obj;
        }
        if (obj != null) {
            return new C0780u(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0759a m1844a() {
        return this.f3216a;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0686u m1845b() {
        return AbstractC0686u.m1692b(this.f3217b.m1473c());
    }

    /* JADX INFO: renamed from: c */
    public final C0558au m1846c() {
        return this.f3217b;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f3216a);
        c0625g.m1521a(this.f3217b);
        return new C0585bi(c0625g);
    }
}
