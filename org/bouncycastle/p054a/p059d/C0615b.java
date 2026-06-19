package org.bouncycastle.p054a.p059d;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.d.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0615b extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private byte[] f2182a;

    /* JADX INFO: renamed from: b */
    private int f2183b;

    private C0615b(AbstractC0723v abstractC0723v) {
        this.f2182a = AbstractC0655q.m1596a(abstractC0723v.mo1482a(0)).mo1410c();
        if (abstractC0723v.mo1484d() == 2) {
            this.f2183b = C0640m.m1561a(abstractC0723v.mo1482a(1)).m1564b().intValue();
        } else {
            this.f2183b = 12;
        }
    }

    public C0615b(byte[] bArr, int i) {
        this.f2182a = C1535a.m4086b(bArr);
        this.f2183b = i;
    }

    /* JADX INFO: renamed from: a */
    public static C0615b m1499a(Object obj) {
        if (obj instanceof C0615b) {
            return (C0615b) obj;
        }
        if (obj != null) {
            return new C0615b(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m1500a() {
        return C1535a.m4086b(this.f2182a);
    }

    /* JADX INFO: renamed from: b */
    public final int m1501b() {
        return this.f2183b;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0581be(this.f2182a));
        if (this.f2183b != 12) {
            c0625g.m1521a(new C0640m(this.f2183b));
        }
        return new C0585bi(c0625g);
    }
}
