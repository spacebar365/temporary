package org.bouncycastle.p054a.p057b;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.p074s.C0668h;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.b.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0574j extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private final C0759a f2102a;

    /* JADX INFO: renamed from: b */
    private final C0668h f2103b;

    /* JADX INFO: renamed from: c */
    private final AbstractC0655q f2104c;

    private C0574j(AbstractC0723v abstractC0723v) {
        this.f2102a = C0759a.m1781a(abstractC0723v.mo1482a(0));
        this.f2103b = C0668h.m1631a(abstractC0723v.mo1482a(1));
        this.f2104c = AbstractC0655q.m1596a(abstractC0723v.mo1482a(2));
    }

    public C0574j(C0759a c0759a, C0668h c0668h, byte[] bArr) {
        this.f2102a = c0759a;
        this.f2103b = c0668h;
        this.f2104c = new C0581be(C1535a.m4086b(bArr));
    }

    /* JADX INFO: renamed from: a */
    public static C0574j m1446a(Object obj) {
        if (obj instanceof C0574j) {
            return (C0574j) obj;
        }
        if (obj != null) {
            return new C0574j(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0759a m1447a() {
        return this.f2102a;
    }

    /* JADX INFO: renamed from: b */
    public final C0668h m1448b() {
        return this.f2103b;
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m1449c() {
        return C1535a.m4086b(this.f2104c.mo1410c());
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2102a);
        c0625g.m1521a(this.f2103b);
        c0625g.m1521a(this.f2104c);
        return new C0585bi(c0625g);
    }
}
