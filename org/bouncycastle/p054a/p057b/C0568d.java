package org.bouncycastle.p054a.p057b;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0568d extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private final C0759a f2083a;

    /* JADX INFO: renamed from: b */
    private final AbstractC0655q f2084b;

    private C0568d(AbstractC0723v abstractC0723v) {
        this.f2083a = C0759a.m1781a(abstractC0723v.mo1482a(0));
        this.f2084b = AbstractC0655q.m1596a(abstractC0723v.mo1482a(1));
    }

    public C0568d(C0759a c0759a, byte[] bArr) {
        this.f2083a = c0759a;
        this.f2084b = new C0581be(C1535a.m4086b(bArr));
    }

    /* JADX INFO: renamed from: a */
    public static C0568d m1425a(Object obj) {
        if (obj != null) {
            return new C0568d(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0759a m1426a() {
        return this.f2083a;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m1427b() {
        return C1535a.m4086b(this.f2084b.mo1410c());
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2083a);
        c0625g.m1521a(this.f2084b);
        return new C0585bi(c0625g);
    }
}
