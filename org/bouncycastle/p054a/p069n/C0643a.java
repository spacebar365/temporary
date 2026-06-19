package org.bouncycastle.p054a.p069n;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.n.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0643a extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    C0640m f2405a;

    /* JADX INFO: renamed from: b */
    AbstractC0655q f2406b;

    private C0643a(AbstractC0723v abstractC0723v) {
        this.f2406b = (AbstractC0655q) abstractC0723v.mo1482a(0);
        this.f2405a = (C0640m) abstractC0723v.mo1482a(1);
    }

    public C0643a(byte[] bArr, int i) {
        this.f2406b = new C0581be(C1535a.m4086b(bArr));
        this.f2405a = new C0640m(i);
    }

    /* JADX INFO: renamed from: a */
    public static C0643a m1566a(Object obj) {
        if (obj != null) {
            return new C0643a(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m1567a() {
        return C1535a.m4086b(this.f2406b.mo1410c());
    }

    /* JADX INFO: renamed from: b */
    public final int m1568b() {
        return this.f2405a.m1564b().intValue();
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2406b);
        c0625g.m1521a(this.f2405a);
        return new C0585bi(c0625g);
    }
}
