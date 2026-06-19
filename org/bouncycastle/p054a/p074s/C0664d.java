package org.bouncycastle.p054a.p074s;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;

/* JADX INFO: renamed from: org.bouncycastle.a.s.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0664d extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    C0640m f2589a;

    /* JADX INFO: renamed from: b */
    C0640m f2590b;

    /* JADX INFO: renamed from: c */
    C0640m f2591c;

    public C0664d(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f2589a = new C0640m(bigInteger);
        this.f2590b = new C0640m(bigInteger2);
        if (i != 0) {
            this.f2591c = new C0640m(i);
        } else {
            this.f2591c = null;
        }
    }

    private C0664d(AbstractC0723v abstractC0723v) {
        Enumeration enumerationMo1483c = abstractC0723v.mo1483c();
        this.f2589a = C0640m.m1561a(enumerationMo1483c.nextElement());
        this.f2590b = C0640m.m1561a(enumerationMo1483c.nextElement());
        if (enumerationMo1483c.hasMoreElements()) {
            this.f2591c = (C0640m) enumerationMo1483c.nextElement();
        } else {
            this.f2591c = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0664d m1618a(Object obj) {
        if (obj instanceof C0664d) {
            return (C0664d) obj;
        }
        if (obj != null) {
            return new C0664d(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m1619a() {
        return this.f2589a.m1565c();
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m1620b() {
        return this.f2590b.m1565c();
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m1621c() {
        if (this.f2591c == null) {
            return null;
        }
        return this.f2591c.m1565c();
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2589a);
        c0625g.m1521a(this.f2590b);
        if (m1621c() != null) {
            c0625g.m1521a(this.f2591c);
        }
        return new C0585bi(c0625g);
    }
}
