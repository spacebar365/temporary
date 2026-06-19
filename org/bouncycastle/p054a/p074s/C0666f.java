package org.bouncycastle.p054a.p074s;

import java.util.Enumeration;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.p082z.C0759a;

/* JADX INFO: renamed from: org.bouncycastle.a.s.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0666f extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private C0759a f2593a;

    /* JADX INFO: renamed from: b */
    private AbstractC0655q f2594b;

    private C0666f(AbstractC0723v abstractC0723v) {
        Enumeration enumerationMo1483c = abstractC0723v.mo1483c();
        this.f2593a = C0759a.m1781a(enumerationMo1483c.nextElement());
        this.f2594b = AbstractC0655q.m1596a(enumerationMo1483c.nextElement());
    }

    public C0666f(C0759a c0759a, byte[] bArr) {
        this.f2593a = c0759a;
        this.f2594b = new C0581be(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static C0666f m1625a(Object obj) {
        if (obj instanceof C0666f) {
            return (C0666f) obj;
        }
        if (obj != null) {
            return new C0666f(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0759a m1626a() {
        return this.f2593a;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m1627b() {
        return this.f2594b.mo1410c();
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2593a);
        c0625g.m1521a(this.f2594b);
        return new C0585bi(c0625g);
    }
}
