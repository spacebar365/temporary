package org.bouncycastle.p054a.p057b;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.b.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0575k extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private final C0653p f2105a;

    /* JADX INFO: renamed from: b */
    private final AbstractC0655q f2106b;

    public C0575k(C0653p c0653p, byte[] bArr) {
        this.f2105a = c0653p;
        this.f2106b = new C0581be(C1535a.m4086b(bArr));
    }

    private C0575k(AbstractC0723v abstractC0723v) {
        this.f2105a = C0653p.m1584a(abstractC0723v.mo1482a(0));
        this.f2106b = AbstractC0655q.m1596a(abstractC0723v.mo1482a(1));
    }

    /* JADX INFO: renamed from: a */
    public static C0575k m1450a(Object obj) {
        if (obj != null) {
            return new C0575k(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m1451a() {
        return C1535a.m4086b(this.f2106b.mo1410c());
    }

    /* JADX INFO: renamed from: b */
    public final C0653p m1452b() {
        return this.f2105a;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2105a);
        c0625g.m1521a(this.f2106b);
        return new C0585bi(c0625g);
    }
}
