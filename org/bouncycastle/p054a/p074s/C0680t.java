package org.bouncycastle.p054a.p074s;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;

/* JADX INFO: renamed from: org.bouncycastle.a.s.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0680t extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private BigInteger f2781a;

    /* JADX INFO: renamed from: b */
    private BigInteger f2782b;

    public C0680t(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f2781a = bigInteger;
        this.f2782b = bigInteger2;
    }

    private C0680t(AbstractC0723v abstractC0723v) {
        if (abstractC0723v.mo1484d() != 2) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC0723v.mo1484d());
        }
        Enumeration enumerationMo1483c = abstractC0723v.mo1483c();
        this.f2781a = C0640m.m1561a(enumerationMo1483c.nextElement()).m1565c();
        this.f2782b = C0640m.m1561a(enumerationMo1483c.nextElement()).m1565c();
    }

    /* JADX INFO: renamed from: a */
    public static C0680t m1677a(Object obj) {
        if (obj != null) {
            return new C0680t(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m1678a() {
        return this.f2781a;
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m1679b() {
        return this.f2782b;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0640m(this.f2781a));
        c0625g.m1521a(new C0640m(this.f2782b));
        return new C0585bi(c0625g);
    }
}
