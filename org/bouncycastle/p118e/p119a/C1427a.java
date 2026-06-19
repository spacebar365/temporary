package org.bouncycastle.p118e.p119a;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p118e.p140d.p141a.C1525b;
import org.bouncycastle.p118e.p140d.p141a.C1531h;
import org.bouncycastle.p118e.p140d.p141a.C1532i;

/* JADX INFO: renamed from: org.bouncycastle.e.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1427a extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private int f5122a;

    /* JADX INFO: renamed from: b */
    private int f5123b;

    /* JADX INFO: renamed from: c */
    private byte[] f5124c;

    /* JADX INFO: renamed from: d */
    private byte[] f5125d;

    /* JADX INFO: renamed from: e */
    private byte[] f5126e;

    /* JADX INFO: renamed from: f */
    private C0759a f5127f;

    public C1427a(int i, int i2, C1525b c1525b, C1532i c1532i, C1531h c1531h, C0759a c0759a) {
        this.f5122a = i;
        this.f5123b = i2;
        this.f5124c = c1525b.m4030b();
        this.f5125d = c1532i.m4054b();
        this.f5126e = c1531h.m4042a();
        this.f5127f = c0759a;
    }

    private C1427a(AbstractC0723v abstractC0723v) {
        this.f5122a = ((C0640m) abstractC0723v.mo1482a(0)).m1564b().intValue();
        this.f5123b = ((C0640m) abstractC0723v.mo1482a(1)).m1564b().intValue();
        this.f5124c = ((AbstractC0655q) abstractC0723v.mo1482a(2)).mo1410c();
        this.f5125d = ((AbstractC0655q) abstractC0723v.mo1482a(3)).mo1410c();
        this.f5126e = ((AbstractC0655q) abstractC0723v.mo1482a(4)).mo1410c();
        this.f5127f = C0759a.m1781a(abstractC0723v.mo1482a(5));
    }

    /* JADX INFO: renamed from: a */
    public static C1427a m3717a(Object obj) {
        if (obj instanceof C1427a) {
            return (C1427a) obj;
        }
        if (obj != null) {
            return new C1427a(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final int m3718a() {
        return this.f5122a;
    }

    /* JADX INFO: renamed from: b */
    public final int m3719b() {
        return this.f5123b;
    }

    /* JADX INFO: renamed from: c */
    public final C1525b m3720c() {
        return new C1525b(this.f5124c);
    }

    /* JADX INFO: renamed from: d */
    public final C1532i m3721d() {
        return new C1532i(m3720c(), this.f5125d);
    }

    /* JADX INFO: renamed from: e */
    public final C1531h m3722e() {
        return new C1531h(this.f5126e);
    }

    /* JADX INFO: renamed from: f */
    public final C0759a m3723f() {
        return this.f5127f;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0640m(this.f5122a));
        c0625g.m1521a(new C0640m(this.f5123b));
        c0625g.m1521a(new C0581be(this.f5124c));
        c0625g.m1521a(new C0581be(this.f5125d));
        c0625g.m1521a(new C0581be(this.f5126e));
        c0625g.m1521a(this.f5127f);
        return new C0585bi(c0625g);
    }
}
