package org.bouncycastle.p054a.p073r;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;

/* JADX INFO: renamed from: org.bouncycastle.a.r.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0658a extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    C0640m f2565a;

    /* JADX INFO: renamed from: b */
    C0640m f2566b;

    public C0658a(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f2565a = new C0640m(bigInteger);
        this.f2566b = new C0640m(bigInteger2);
    }

    private C0658a(AbstractC0723v abstractC0723v) {
        Enumeration enumerationMo1483c = abstractC0723v.mo1483c();
        this.f2565a = (C0640m) enumerationMo1483c.nextElement();
        this.f2566b = (C0640m) enumerationMo1483c.nextElement();
    }

    /* JADX INFO: renamed from: a */
    public static C0658a m1598a(Object obj) {
        if (obj instanceof C0658a) {
            return (C0658a) obj;
        }
        if (obj != null) {
            return new C0658a(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m1599a() {
        return this.f2565a.m1565c();
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m1600b() {
        return this.f2566b.m1565c();
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2565a);
        c0625g.m1521a(this.f2566b);
        return new C0585bi(c0625g);
    }
}
