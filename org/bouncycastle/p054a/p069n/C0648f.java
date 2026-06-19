package org.bouncycastle.p054a.p069n;

import java.math.BigInteger;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.n.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0648f extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private final byte[] f2446a;

    /* JADX INFO: renamed from: b */
    private final BigInteger f2447b;

    /* JADX INFO: renamed from: c */
    private final BigInteger f2448c;

    /* JADX INFO: renamed from: d */
    private final BigInteger f2449d;

    /* JADX INFO: renamed from: e */
    private final BigInteger f2450e;

    private C0648f(AbstractC0723v abstractC0723v) {
        if (abstractC0723v.mo1484d() != 4 && abstractC0723v.mo1484d() != 5) {
            throw new IllegalArgumentException("invalid sequence: size = " + abstractC0723v.mo1484d());
        }
        this.f2446a = C1535a.m4086b(AbstractC0655q.m1596a(abstractC0723v.mo1482a(0)).mo1410c());
        this.f2447b = C0640m.m1561a(abstractC0723v.mo1482a(1)).m1564b();
        this.f2448c = C0640m.m1561a(abstractC0723v.mo1482a(2)).m1564b();
        this.f2449d = C0640m.m1561a(abstractC0723v.mo1482a(3)).m1564b();
        if (abstractC0723v.mo1484d() == 5) {
            this.f2450e = C0640m.m1561a(abstractC0723v.mo1482a(4)).m1564b();
        } else {
            this.f2450e = null;
        }
    }

    public C0648f(byte[] bArr, int i, int i2, int i3) {
        this(bArr, BigInteger.valueOf(i), BigInteger.valueOf(i2), BigInteger.valueOf(i3), BigInteger.valueOf(64L));
    }

    public C0648f(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f2446a = C1535a.m4086b(bArr);
        this.f2447b = bigInteger;
        this.f2448c = bigInteger2;
        this.f2449d = bigInteger3;
        this.f2450e = bigInteger4;
    }

    /* JADX INFO: renamed from: a */
    public static C0648f m1571a(Object obj) {
        if (obj instanceof C0648f) {
            return (C0648f) obj;
        }
        if (obj != null) {
            return new C0648f(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m1572a() {
        return C1535a.m4086b(this.f2446a);
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m1573b() {
        return this.f2447b;
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m1574c() {
        return this.f2448c;
    }

    /* JADX INFO: renamed from: d */
    public final BigInteger m1575d() {
        return this.f2449d;
    }

    /* JADX INFO: renamed from: e */
    public final BigInteger m1576e() {
        return this.f2450e;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0581be(this.f2446a));
        c0625g.m1521a(new C0640m(this.f2447b));
        c0625g.m1521a(new C0640m(this.f2448c));
        c0625g.m1521a(new C0640m(this.f2449d));
        if (this.f2450e != null) {
            c0625g.m1521a(new C0640m(this.f2450e));
        }
        return new C0585bi(c0625g);
    }
}
