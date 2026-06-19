package org.bouncycastle.p054a.p057b;

import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0603c;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0558au;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0590bn;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0766g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.b.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0576l extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private final C0759a f2107a;

    /* JADX INFO: renamed from: b */
    private final AbstractC0723v f2108b;

    /* JADX INFO: renamed from: c */
    private final AbstractC0603c f2109c;

    private C0576l(AbstractC0723v abstractC0723v) {
        int i;
        this.f2107a = C0759a.m1781a(abstractC0723v.mo1482a(0));
        if (abstractC0723v.mo1482a(1) instanceof AbstractC0539ab) {
            i = 2;
            this.f2108b = AbstractC0723v.m1708a((Object) AbstractC0539ab.m1394a(abstractC0723v.mo1482a(1)).m1402j());
        } else {
            this.f2108b = null;
            i = 1;
        }
        this.f2109c = C0558au.m1414a(abstractC0723v.mo1482a(i));
    }

    public C0576l(C0759a c0759a, byte[] bArr) {
        this.f2107a = c0759a;
        this.f2108b = null;
        this.f2109c = new C0558au(C1535a.m4086b(bArr));
    }

    public C0576l(C0759a c0759a, C0766g[] c0766gArr, byte[] bArr) {
        this.f2107a = c0759a;
        this.f2108b = new C0585bi(c0766gArr);
        this.f2109c = new C0558au(C1535a.m4086b(bArr));
    }

    /* JADX INFO: renamed from: a */
    public static C0576l m1453a(Object obj) {
        if (obj instanceof C0576l) {
            return (C0576l) obj;
        }
        if (obj != null) {
            return new C0576l(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0603c m1454a() {
        return new C0558au(C1535a.m4086b(this.f2109c.m1474d()), this.f2109c.m1475f());
    }

    /* JADX INFO: renamed from: b */
    public final C0759a m1455b() {
        return this.f2107a;
    }

    /* JADX INFO: renamed from: c */
    public final C0766g[] m1456c() {
        if (this.f2108b == null) {
            return null;
        }
        C0766g[] c0766gArr = new C0766g[this.f2108b.mo1484d()];
        for (int i = 0; i != c0766gArr.length; i++) {
            c0766gArr[i] = C0766g.m1793a(this.f2108b.mo1482a(i));
        }
        return c0766gArr;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2107a);
        if (this.f2108b != null) {
            c0625g.m1521a(new C0590bn(this.f2108b));
        }
        c0625g.m1521a(this.f2109c);
        return new C0585bi(c0625g);
    }
}
