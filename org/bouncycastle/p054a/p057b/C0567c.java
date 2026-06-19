package org.bouncycastle.p054a.p057b;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.p074s.C0666f;
import org.bouncycastle.p054a.p082z.C0766g;

/* JADX INFO: renamed from: org.bouncycastle.a.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0567c extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private final C0666f f2081a;

    /* JADX INFO: renamed from: b */
    private final C0766g[] f2082b;

    public C0567c(C0666f c0666f, C0766g[] c0766gArr) {
        this.f2081a = c0666f;
        this.f2082b = new C0766g[c0766gArr.length];
        System.arraycopy(c0766gArr, 0, this.f2082b, 0, c0766gArr.length);
    }

    private C0567c(AbstractC0723v abstractC0723v) {
        this.f2081a = C0666f.m1625a(abstractC0723v.mo1482a(0));
        AbstractC0723v abstractC0723vM1708a = AbstractC0723v.m1708a(abstractC0723v.mo1482a(1));
        this.f2082b = new C0766g[abstractC0723vM1708a.mo1484d()];
        for (int i = 0; i != this.f2082b.length; i++) {
            this.f2082b[i] = C0766g.m1793a(abstractC0723vM1708a.mo1482a(i));
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0567c m1422a(Object obj) {
        if (obj != null) {
            return new C0567c(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0766g[] m1423a() {
        C0766g[] c0766gArr = new C0766g[this.f2082b.length];
        System.arraycopy(this.f2082b, 0, c0766gArr, 0, this.f2082b.length);
        return c0766gArr;
    }

    /* JADX INFO: renamed from: b */
    public final C0666f m1424b() {
        return this.f2081a;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2081a);
        c0625g.m1521a(new C0585bi(this.f2082b));
        return new C0585bi(c0625g);
    }
}
