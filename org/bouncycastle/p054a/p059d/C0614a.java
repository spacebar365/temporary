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

/* JADX INFO: renamed from: org.bouncycastle.a.d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0614a extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private byte[] f2180a;

    /* JADX INFO: renamed from: b */
    private int f2181b;

    private C0614a(AbstractC0723v abstractC0723v) {
        this.f2180a = AbstractC0655q.m1596a(abstractC0723v.mo1482a(0)).mo1410c();
        if (abstractC0723v.mo1484d() == 2) {
            this.f2181b = C0640m.m1561a(abstractC0723v.mo1482a(1)).m1564b().intValue();
        } else {
            this.f2181b = 12;
        }
    }

    public C0614a(byte[] bArr, int i) {
        this.f2180a = C1535a.m4086b(bArr);
        this.f2181b = i;
    }

    /* JADX INFO: renamed from: a */
    public static C0614a m1496a(Object obj) {
        if (obj instanceof C0614a) {
            return (C0614a) obj;
        }
        if (obj != null) {
            return new C0614a(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m1497a() {
        return C1535a.m4086b(this.f2180a);
    }

    /* JADX INFO: renamed from: b */
    public final int m1498b() {
        return this.f2181b;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0581be(this.f2180a));
        if (this.f2181b != 12) {
            c0625g.m1521a(new C0640m(this.f2181b));
        }
        return new C0585bi(c0625g);
    }
}
