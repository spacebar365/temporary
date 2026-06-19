package org.bouncycastle.p054a.p082z;

import java.util.Enumeration;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.z.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0769j extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private byte[] f3160a;

    /* JADX INFO: renamed from: b */
    private C0759a f3161b;

    public C0769j(AbstractC0723v abstractC0723v) {
        Enumeration enumerationMo1483c = abstractC0723v.mo1483c();
        this.f3161b = C0759a.m1781a(enumerationMo1483c.nextElement());
        this.f3160a = AbstractC0655q.m1596a(enumerationMo1483c.nextElement()).mo1410c();
    }

    public C0769j(C0759a c0759a, byte[] bArr) {
        this.f3160a = C1535a.m4086b(bArr);
        this.f3161b = c0759a;
    }

    /* JADX INFO: renamed from: a */
    public final C0759a m1817a() {
        return this.f3161b;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m1818b() {
        return C1535a.m4086b(this.f3160a);
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f3161b);
        c0625g.m1521a(new C0581be(this.f3160a));
        return new C0585bi(c0625g);
    }
}
