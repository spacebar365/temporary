package org.bouncycastle.p054a.p074s;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;

/* JADX INFO: renamed from: org.bouncycastle.a.s.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0679s extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private BigInteger f2771a;

    /* JADX INFO: renamed from: b */
    private BigInteger f2772b;

    /* JADX INFO: renamed from: c */
    private BigInteger f2773c;

    /* JADX INFO: renamed from: d */
    private BigInteger f2774d;

    /* JADX INFO: renamed from: e */
    private BigInteger f2775e;

    /* JADX INFO: renamed from: f */
    private BigInteger f2776f;

    /* JADX INFO: renamed from: g */
    private BigInteger f2777g;

    /* JADX INFO: renamed from: h */
    private BigInteger f2778h;

    /* JADX INFO: renamed from: i */
    private BigInteger f2779i;

    /* JADX INFO: renamed from: j */
    private AbstractC0723v f2780j;

    public C0679s(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this.f2780j = null;
        this.f2771a = BigInteger.valueOf(0L);
        this.f2772b = bigInteger;
        this.f2773c = bigInteger2;
        this.f2774d = bigInteger3;
        this.f2775e = bigInteger4;
        this.f2776f = bigInteger5;
        this.f2777g = bigInteger6;
        this.f2778h = bigInteger7;
        this.f2779i = bigInteger8;
    }

    private C0679s(AbstractC0723v abstractC0723v) {
        this.f2780j = null;
        Enumeration enumerationMo1483c = abstractC0723v.mo1483c();
        BigInteger bigIntegerM1564b = ((C0640m) enumerationMo1483c.nextElement()).m1564b();
        if (bigIntegerM1564b.intValue() != 0 && bigIntegerM1564b.intValue() != 1) {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        this.f2771a = bigIntegerM1564b;
        this.f2772b = ((C0640m) enumerationMo1483c.nextElement()).m1564b();
        this.f2773c = ((C0640m) enumerationMo1483c.nextElement()).m1564b();
        this.f2774d = ((C0640m) enumerationMo1483c.nextElement()).m1564b();
        this.f2775e = ((C0640m) enumerationMo1483c.nextElement()).m1564b();
        this.f2776f = ((C0640m) enumerationMo1483c.nextElement()).m1564b();
        this.f2777g = ((C0640m) enumerationMo1483c.nextElement()).m1564b();
        this.f2778h = ((C0640m) enumerationMo1483c.nextElement()).m1564b();
        this.f2779i = ((C0640m) enumerationMo1483c.nextElement()).m1564b();
        if (enumerationMo1483c.hasMoreElements()) {
            this.f2780j = (AbstractC0723v) enumerationMo1483c.nextElement();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0679s m1668a(Object obj) {
        if (obj instanceof C0679s) {
            return (C0679s) obj;
        }
        if (obj != null) {
            return new C0679s(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m1669a() {
        return this.f2772b;
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m1670b() {
        return this.f2773c;
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m1671c() {
        return this.f2774d;
    }

    /* JADX INFO: renamed from: d */
    public final BigInteger m1672d() {
        return this.f2775e;
    }

    /* JADX INFO: renamed from: e */
    public final BigInteger m1673e() {
        return this.f2776f;
    }

    /* JADX INFO: renamed from: f */
    public final BigInteger m1674f() {
        return this.f2777g;
    }

    /* JADX INFO: renamed from: g */
    public final BigInteger m1675g() {
        return this.f2778h;
    }

    /* JADX INFO: renamed from: h */
    public final BigInteger m1676h() {
        return this.f2779i;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0640m(this.f2771a));
        c0625g.m1521a(new C0640m(this.f2772b));
        c0625g.m1521a(new C0640m(this.f2773c));
        c0625g.m1521a(new C0640m(this.f2774d));
        c0625g.m1521a(new C0640m(this.f2775e));
        c0625g.m1521a(new C0640m(this.f2776f));
        c0625g.m1521a(new C0640m(this.f2777g));
        c0625g.m1521a(new C0640m(this.f2778h));
        c0625g.m1521a(new C0640m(this.f2779i));
        if (this.f2780j != null) {
            c0625g.m1521a(this.f2780j);
        }
        return new C0585bi(c0625g);
    }
}
