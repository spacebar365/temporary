package org.bouncycastle.p118e.p119a;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.p082z.C0759a;

/* JADX INFO: renamed from: org.bouncycastle.e.a.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1435i extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private final C0640m f5212a;

    /* JADX INFO: renamed from: b */
    private final int f5213b;

    /* JADX INFO: renamed from: c */
    private final C0759a f5214c;

    public C1435i(int i, C0759a c0759a) {
        this.f5212a = new C0640m(0L);
        this.f5213b = i;
        this.f5214c = c0759a;
    }

    private C1435i(AbstractC0723v abstractC0723v) {
        this.f5212a = C0640m.m1561a(abstractC0723v.mo1482a(0));
        this.f5213b = C0640m.m1561a(abstractC0723v.mo1482a(1)).m1564b().intValue();
        this.f5214c = C0759a.m1781a(abstractC0723v.mo1482a(2));
    }

    /* JADX INFO: renamed from: a */
    public static C1435i m3755a(Object obj) {
        if (obj instanceof C1435i) {
            return (C1435i) obj;
        }
        if (obj != null) {
            return new C1435i(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final int m3756a() {
        return this.f5213b;
    }

    /* JADX INFO: renamed from: b */
    public final C0759a m3757b() {
        return this.f5214c;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f5212a);
        c0625g.m1521a(new C0640m(this.f5213b));
        c0625g.m1521a(this.f5214c);
        return new C0585bi(c0625g);
    }
}
