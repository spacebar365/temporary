package org.bouncycastle.p118e.p119a;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p118e.p140d.p141a.C1524a;

/* JADX INFO: renamed from: org.bouncycastle.e.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1430d extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private final int f5139a;

    /* JADX INFO: renamed from: b */
    private final int f5140b;

    /* JADX INFO: renamed from: c */
    private final C1524a f5141c;

    public C1430d(int i, int i2, C1524a c1524a) {
        this.f5139a = i;
        this.f5140b = i2;
        this.f5141c = new C1524a(c1524a);
    }

    private C1430d(AbstractC0723v abstractC0723v) {
        this.f5139a = ((C0640m) abstractC0723v.mo1482a(0)).m1564b().intValue();
        this.f5140b = ((C0640m) abstractC0723v.mo1482a(1)).m1564b().intValue();
        this.f5141c = new C1524a(((AbstractC0655q) abstractC0723v.mo1482a(2)).mo1410c());
    }

    /* JADX INFO: renamed from: a */
    public static C1430d m3737a(Object obj) {
        if (obj != null) {
            return new C1430d(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final int m3738a() {
        return this.f5139a;
    }

    /* JADX INFO: renamed from: b */
    public final int m3739b() {
        return this.f5140b;
    }

    /* JADX INFO: renamed from: c */
    public final C1524a m3740c() {
        return new C1524a(this.f5141c);
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0640m(this.f5139a));
        c0625g.m1521a(new C0640m(this.f5140b));
        c0625g.m1521a(new C0581be(this.f5141c.m4023a()));
        return new C0585bi(c0625g);
    }
}
