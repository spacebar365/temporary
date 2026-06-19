package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.InterfaceC0618f;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0503a extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private final C0640m f1877a;

    /* JADX INFO: renamed from: b */
    private final C0640m f1878b;

    /* JADX INFO: renamed from: c */
    private final C0640m f1879c;

    /* JADX INFO: renamed from: d */
    private final C0640m f1880d;

    /* JADX INFO: renamed from: e */
    private final C0515c f1881e;

    public C0503a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, C0515c c0515c) {
        if (bigInteger == null) {
            throw new IllegalArgumentException("'p' cannot be null");
        }
        if (bigInteger2 == null) {
            throw new IllegalArgumentException("'g' cannot be null");
        }
        if (bigInteger3 == null) {
            throw new IllegalArgumentException("'q' cannot be null");
        }
        this.f1877a = new C0640m(bigInteger);
        this.f1878b = new C0640m(bigInteger2);
        this.f1879c = new C0640m(bigInteger3);
        if (bigInteger4 != null) {
            this.f1880d = new C0640m(bigInteger4);
        } else {
            this.f1880d = null;
        }
        this.f1881e = c0515c;
    }

    private C0503a(AbstractC0723v abstractC0723v) {
        if (abstractC0723v.mo1484d() < 3 || abstractC0723v.mo1484d() > 5) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC0723v.mo1484d());
        }
        Enumeration enumerationMo1483c = abstractC0723v.mo1483c();
        this.f1877a = C0640m.m1561a(enumerationMo1483c.nextElement());
        this.f1878b = C0640m.m1561a(enumerationMo1483c.nextElement());
        this.f1879c = C0640m.m1561a(enumerationMo1483c.nextElement());
        InterfaceC0618f interfaceC0618fM1352a = m1352a(enumerationMo1483c);
        if (interfaceC0618fM1352a == null || !(interfaceC0618fM1352a instanceof C0640m)) {
            this.f1880d = null;
        } else {
            this.f1880d = C0640m.m1561a(interfaceC0618fM1352a);
            interfaceC0618fM1352a = m1352a(enumerationMo1483c);
        }
        if (interfaceC0618fM1352a != null) {
            this.f1881e = C0515c.m1385a(interfaceC0618fM1352a.mo1358i());
        } else {
            this.f1881e = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0503a m1351a(Object obj) {
        if (obj != null) {
            return new C0503a(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC0618f m1352a(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (InterfaceC0618f) enumeration.nextElement();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m1353a() {
        return this.f1877a.m1565c();
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m1354b() {
        return this.f1878b.m1565c();
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m1355c() {
        return this.f1879c.m1565c();
    }

    /* JADX INFO: renamed from: d */
    public final BigInteger m1356d() {
        if (this.f1880d == null) {
            return null;
        }
        return this.f1880d.m1565c();
    }

    /* JADX INFO: renamed from: e */
    public final C0515c m1357e() {
        return this.f1881e;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f1877a);
        c0625g.m1521a(this.f1878b);
        c0625g.m1521a(this.f1879c);
        if (this.f1880d != null) {
            c0625g.m1521a(this.f1880d);
        }
        if (this.f1881e != null) {
            c0625g.m1521a(this.f1881e);
        }
        return new C0585bi(c0625g);
    }
}
