package org.bouncycastle.p054a.p074s;

import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0590bn;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.p073r.InterfaceC0659b;
import org.bouncycastle.p054a.p082z.C0759a;

/* JADX INFO: renamed from: org.bouncycastle.a.s.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0678r extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    public static final C0759a f2765a = new C0759a(InterfaceC0659b.f2575i, C0579bc.f2112a);

    /* JADX INFO: renamed from: b */
    public static final C0759a f2766b = new C0759a(InterfaceC0674n.f2738j_, f2765a);

    /* JADX INFO: renamed from: c */
    public static final C0759a f2767c = new C0759a(InterfaceC0674n.f2740k_, new C0581be(new byte[0]));

    /* JADX INFO: renamed from: d */
    private C0759a f2768d;

    /* JADX INFO: renamed from: e */
    private C0759a f2769e;

    /* JADX INFO: renamed from: f */
    private C0759a f2770f;

    public C0678r() {
        this.f2768d = f2765a;
        this.f2769e = f2766b;
        this.f2770f = f2767c;
    }

    private C0678r(AbstractC0723v abstractC0723v) {
        this.f2768d = f2765a;
        this.f2769e = f2766b;
        this.f2770f = f2767c;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 == abstractC0723v.mo1484d()) {
                return;
            }
            AbstractC0539ab abstractC0539ab = (AbstractC0539ab) abstractC0723v.mo1482a(i2);
            switch (abstractC0539ab.m1396b()) {
                case 0:
                    this.f2768d = C0759a.m1782a(abstractC0539ab);
                    break;
                case 1:
                    this.f2769e = C0759a.m1782a(abstractC0539ab);
                    break;
                case 2:
                    this.f2770f = C0759a.m1782a(abstractC0539ab);
                    break;
                default:
                    throw new IllegalArgumentException("unknown tag");
            }
            i = i2 + 1;
        }
    }

    public C0678r(C0759a c0759a, C0759a c0759a2, C0759a c0759a3) {
        this.f2768d = c0759a;
        this.f2769e = c0759a2;
        this.f2770f = c0759a3;
    }

    /* JADX INFO: renamed from: a */
    public static C0678r m1664a(Object obj) {
        if (obj != null) {
            return new C0678r(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0759a m1665a() {
        return this.f2768d;
    }

    /* JADX INFO: renamed from: b */
    public final C0759a m1666b() {
        return this.f2769e;
    }

    /* JADX INFO: renamed from: c */
    public final C0759a m1667c() {
        return this.f2770f;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        if (!this.f2768d.equals(f2765a)) {
            c0625g.m1521a(new C0590bn(true, 0, this.f2768d));
        }
        if (!this.f2769e.equals(f2766b)) {
            c0625g.m1521a(new C0590bn(true, 1, this.f2769e));
        }
        if (!this.f2770f.equals(f2767c)) {
            c0625g.m1521a(new C0590bn(true, 2, this.f2770f));
        }
        return new C0585bi(c0625g);
    }
}
