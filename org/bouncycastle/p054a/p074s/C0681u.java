package org.bouncycastle.p054a.p074s;

import java.math.BigInteger;
import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0590bn;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.p073r.InterfaceC0659b;
import org.bouncycastle.p054a.p082z.C0759a;

/* JADX INFO: renamed from: org.bouncycastle.a.s.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0681u extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    public static final C0759a f2783a = new C0759a(InterfaceC0659b.f2575i, C0579bc.f2112a);

    /* JADX INFO: renamed from: b */
    public static final C0759a f2784b = new C0759a(InterfaceC0674n.f2738j_, f2783a);

    /* JADX INFO: renamed from: c */
    public static final C0640m f2785c = new C0640m(20);

    /* JADX INFO: renamed from: d */
    public static final C0640m f2786d = new C0640m(1);

    /* JADX INFO: renamed from: e */
    private C0759a f2787e;

    /* JADX INFO: renamed from: f */
    private C0759a f2788f;

    /* JADX INFO: renamed from: g */
    private C0640m f2789g;

    /* JADX INFO: renamed from: h */
    private C0640m f2790h;

    public C0681u() {
        this.f2787e = f2783a;
        this.f2788f = f2784b;
        this.f2789g = f2785c;
        this.f2790h = f2786d;
    }

    private C0681u(AbstractC0723v abstractC0723v) {
        this.f2787e = f2783a;
        this.f2788f = f2784b;
        this.f2789g = f2785c;
        this.f2790h = f2786d;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 == abstractC0723v.mo1484d()) {
                return;
            }
            AbstractC0539ab abstractC0539ab = (AbstractC0539ab) abstractC0723v.mo1482a(i2);
            switch (abstractC0539ab.m1396b()) {
                case 0:
                    this.f2787e = C0759a.m1782a(abstractC0539ab);
                    break;
                case 1:
                    this.f2788f = C0759a.m1782a(abstractC0539ab);
                    break;
                case 2:
                    this.f2789g = C0640m.m1562a(abstractC0539ab, true);
                    break;
                case 3:
                    this.f2790h = C0640m.m1562a(abstractC0539ab, true);
                    break;
                default:
                    throw new IllegalArgumentException("unknown tag");
            }
            i = i2 + 1;
        }
    }

    public C0681u(C0759a c0759a, C0759a c0759a2, C0640m c0640m, C0640m c0640m2) {
        this.f2787e = c0759a;
        this.f2788f = c0759a2;
        this.f2789g = c0640m;
        this.f2790h = c0640m2;
    }

    /* JADX INFO: renamed from: a */
    public static C0681u m1680a(Object obj) {
        if (obj instanceof C0681u) {
            return (C0681u) obj;
        }
        if (obj != null) {
            return new C0681u(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0759a m1681a() {
        return this.f2787e;
    }

    /* JADX INFO: renamed from: b */
    public final C0759a m1682b() {
        return this.f2788f;
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m1683c() {
        return this.f2789g.m1564b();
    }

    /* JADX INFO: renamed from: d */
    public final BigInteger m1684d() {
        return this.f2790h.m1564b();
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        if (!this.f2787e.equals(f2783a)) {
            c0625g.m1521a(new C0590bn(true, 0, this.f2787e));
        }
        if (!this.f2788f.equals(f2784b)) {
            c0625g.m1521a(new C0590bn(true, 1, this.f2788f));
        }
        if (!this.f2789g.equals(f2785c)) {
            c0625g.m1521a(new C0590bn(true, 2, this.f2789g));
        }
        if (!this.f2790h.equals(f2786d)) {
            c0625g.m1521a(new C0590bn(true, 3, this.f2790h));
        }
        return new C0585bi(c0625g);
    }
}
