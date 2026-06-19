package org.bouncycastle.p054a.p078w;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.w.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0744d extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private static final byte[] f2970a = {-87, -42, -21, 69, -15, 60, 112, -126, -128, -60, -106, 123, 35, 31, 94, -83, -10, 88, -21, -92, -64, 55, 41, 29, 56, -39, 107, -16, 37, -54, 78, 23, -8, -23, 114, 13, -58, 21, -76, 58, 40, -105, 95, 11, -63, -34, -93, 100, 56, -75, 100, -22, 44, 23, -97, -48, 18, 62, 109, -72, -6, -59, 121, 4};

    /* JADX INFO: renamed from: b */
    private C0653p f2971b;

    /* JADX INFO: renamed from: c */
    private C0742b f2972c;

    /* JADX INFO: renamed from: d */
    private byte[] f2973d = f2970a;

    public C0744d(C0653p c0653p) {
        this.f2971b = c0653p;
    }

    private C0744d(C0742b c0742b) {
        this.f2972c = c0742b;
    }

    /* JADX INFO: renamed from: a */
    public static C0744d m1730a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("object parse error");
        }
        AbstractC0723v abstractC0723vM1708a = AbstractC0723v.m1708a(obj);
        C0744d c0744d = abstractC0723vM1708a.mo1482a(0) instanceof C0653p ? new C0744d(C0653p.m1584a(abstractC0723vM1708a.mo1482a(0))) : new C0744d(C0742b.m1723a(abstractC0723vM1708a.mo1482a(0)));
        if (abstractC0723vM1708a.mo1484d() == 2) {
            c0744d.f2973d = AbstractC0655q.m1596a(abstractC0723vM1708a.mo1482a(1)).mo1410c();
            if (c0744d.f2973d.length != f2970a.length) {
                throw new IllegalArgumentException("object parse error");
            }
        }
        return c0744d;
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m1731d() {
        return C1535a.m4086b(f2970a);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1732a() {
        return this.f2971b != null;
    }

    /* JADX INFO: renamed from: b */
    public final C0742b m1733b() {
        return this.f2972c;
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m1734c() {
        return C1535a.m4086b(this.f2973d);
    }

    /* JADX INFO: renamed from: e */
    public final C0653p m1735e() {
        return this.f2971b;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        if (this.f2971b != null) {
            c0625g.m1521a(this.f2971b);
        } else {
            c0625g.m1521a(this.f2972c);
        }
        if (!C1535a.m4076a(this.f2973d, f2970a)) {
            c0625g.m1521a(new C0581be(this.f2973d));
        }
        return new C0585bi(c0625g);
    }
}
