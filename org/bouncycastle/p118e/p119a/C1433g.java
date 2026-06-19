package org.bouncycastle.p118e.p119a;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p118e.p120b.p124d.p125a.C1454a;

/* JADX INFO: renamed from: org.bouncycastle.e.a.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1433g extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private C0640m f5204a;

    /* JADX INFO: renamed from: b */
    private C0653p f5205b;

    /* JADX INFO: renamed from: c */
    private C0640m f5206c;

    /* JADX INFO: renamed from: d */
    private byte[][] f5207d;

    /* JADX INFO: renamed from: e */
    private byte[][] f5208e;

    /* JADX INFO: renamed from: f */
    private byte[] f5209f;

    public C1433g(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f5204a = new C0640m(0L);
        this.f5206c = new C0640m(i);
        this.f5207d = C1454a.m3808a(sArr);
        this.f5208e = C1454a.m3808a(sArr2);
        this.f5209f = C1454a.m3806a(sArr3);
    }

    private C1433g(AbstractC0723v abstractC0723v) {
        if (abstractC0723v.mo1482a(0) instanceof C0640m) {
            this.f5204a = C0640m.m1561a(abstractC0723v.mo1482a(0));
        } else {
            this.f5205b = C0653p.m1584a(abstractC0723v.mo1482a(0));
        }
        this.f5206c = C0640m.m1561a(abstractC0723v.mo1482a(1));
        AbstractC0723v abstractC0723vM1708a = AbstractC0723v.m1708a(abstractC0723v.mo1482a(2));
        this.f5207d = new byte[abstractC0723vM1708a.mo1484d()][];
        for (int i = 0; i < abstractC0723vM1708a.mo1484d(); i++) {
            this.f5207d[i] = AbstractC0655q.m1596a(abstractC0723vM1708a.mo1482a(i)).mo1410c();
        }
        AbstractC0723v abstractC0723v2 = (AbstractC0723v) abstractC0723v.mo1482a(3);
        this.f5208e = new byte[abstractC0723v2.mo1484d()][];
        for (int i2 = 0; i2 < abstractC0723v2.mo1484d(); i2++) {
            this.f5208e[i2] = AbstractC0655q.m1596a(abstractC0723v2.mo1482a(i2)).mo1410c();
        }
        this.f5209f = AbstractC0655q.m1596a(((AbstractC0723v) abstractC0723v.mo1482a(4)).mo1482a(0)).mo1410c();
    }

    /* JADX INFO: renamed from: a */
    public static C1433g m3748a(Object obj) {
        if (obj != null) {
            return new C1433g(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final int m3749a() {
        return this.f5206c.m1564b().intValue();
    }

    /* JADX INFO: renamed from: b */
    public final short[][] m3750b() {
        return C1454a.m3809a(this.f5207d);
    }

    /* JADX INFO: renamed from: c */
    public final short[][] m3751c() {
        return C1454a.m3809a(this.f5208e);
    }

    /* JADX INFO: renamed from: d */
    public final short[] m3752d() {
        return C1454a.m3807a(this.f5209f);
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        if (this.f5204a != null) {
            c0625g.m1521a(this.f5204a);
        } else {
            c0625g.m1521a(this.f5205b);
        }
        c0625g.m1521a(this.f5206c);
        C0625g c0625g2 = new C0625g();
        for (int i = 0; i < this.f5207d.length; i++) {
            c0625g2.m1521a(new C0581be(this.f5207d[i]));
        }
        c0625g.m1521a(new C0585bi(c0625g2));
        C0625g c0625g3 = new C0625g();
        for (int i2 = 0; i2 < this.f5208e.length; i2++) {
            c0625g3.m1521a(new C0581be(this.f5208e[i2]));
        }
        c0625g.m1521a(new C0585bi(c0625g3));
        C0625g c0625g4 = new C0625g();
        c0625g4.m1521a(new C0581be(this.f5209f));
        c0625g.m1521a(new C0585bi(c0625g4));
        return new C0585bi(c0625g);
    }
}
