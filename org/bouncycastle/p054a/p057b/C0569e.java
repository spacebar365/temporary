package org.bouncycastle.p054a.p057b;

import java.math.BigInteger;
import java.util.Date;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0563az;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0591bo;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0636k;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.b.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0569e extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private final BigInteger f2085a;

    /* JADX INFO: renamed from: b */
    private final String f2086b;

    /* JADX INFO: renamed from: c */
    private final C0636k f2087c;

    /* JADX INFO: renamed from: d */
    private final C0636k f2088d;

    /* JADX INFO: renamed from: e */
    private final AbstractC0655q f2089e;

    /* JADX INFO: renamed from: f */
    private final String f2090f;

    public C0569e(BigInteger bigInteger, String str, Date date, Date date2, byte[] bArr) {
        this.f2085a = bigInteger;
        this.f2086b = str;
        this.f2087c = new C0563az(date);
        this.f2088d = new C0563az(date2);
        this.f2089e = new C0581be(C1535a.m4086b(bArr));
        this.f2090f = null;
    }

    private C0569e(AbstractC0723v abstractC0723v) {
        this.f2085a = C0640m.m1561a(abstractC0723v.mo1482a(0)).m1564b();
        this.f2086b = C0591bo.m1464a(abstractC0723v.mo1482a(1)).mo1350b();
        this.f2087c = C0636k.m1542a(abstractC0723v.mo1482a(2));
        this.f2088d = C0636k.m1542a(abstractC0723v.mo1482a(3));
        this.f2089e = AbstractC0655q.m1596a(abstractC0723v.mo1482a(4));
        this.f2090f = abstractC0723v.mo1484d() == 6 ? C0591bo.m1464a(abstractC0723v.mo1482a(5)).mo1350b() : null;
    }

    /* JADX INFO: renamed from: a */
    public static C0569e m1428a(Object obj) {
        if (obj instanceof C0569e) {
            return (C0569e) obj;
        }
        if (obj != null) {
            return new C0569e(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0636k m1429a() {
        return this.f2087c;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m1430b() {
        return C1535a.m4086b(this.f2089e.mo1410c());
    }

    /* JADX INFO: renamed from: c */
    public final String m1431c() {
        return this.f2086b;
    }

    /* JADX INFO: renamed from: d */
    public final C0636k m1432d() {
        return this.f2088d;
    }

    /* JADX INFO: renamed from: e */
    public final BigInteger m1433e() {
        return this.f2085a;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0640m(this.f2085a));
        c0625g.m1521a(new C0591bo(this.f2086b));
        c0625g.m1521a(this.f2087c);
        c0625g.m1521a(this.f2088d);
        c0625g.m1521a(this.f2089e);
        if (this.f2090f != null) {
            c0625g.m1521a(new C0591bo(this.f2090f));
        }
        return new C0585bi(c0625g);
    }
}
