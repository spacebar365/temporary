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
import org.bouncycastle.p118e.p140d.p141a.C1525b;
import org.bouncycastle.p118e.p140d.p141a.C1531h;
import org.bouncycastle.p118e.p140d.p141a.C1532i;

/* JADX INFO: renamed from: org.bouncycastle.e.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1429c extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private int f5132a;

    /* JADX INFO: renamed from: b */
    private int f5133b;

    /* JADX INFO: renamed from: c */
    private byte[] f5134c;

    /* JADX INFO: renamed from: d */
    private byte[] f5135d;

    /* JADX INFO: renamed from: e */
    private byte[] f5136e;

    /* JADX INFO: renamed from: f */
    private byte[] f5137f;

    /* JADX INFO: renamed from: g */
    private byte[] f5138g;

    public C1429c(int i, int i2, C1525b c1525b, C1532i c1532i, C1531h c1531h, C1531h c1531h2, C1524a c1524a) {
        this.f5132a = i;
        this.f5133b = i2;
        this.f5134c = c1525b.m4030b();
        this.f5135d = c1532i.m4054b();
        this.f5136e = c1524a.m4023a();
        this.f5137f = c1531h.m4042a();
        this.f5138g = c1531h2.m4042a();
    }

    private C1429c(AbstractC0723v abstractC0723v) {
        this.f5132a = ((C0640m) abstractC0723v.mo1482a(0)).m1564b().intValue();
        this.f5133b = ((C0640m) abstractC0723v.mo1482a(1)).m1564b().intValue();
        this.f5134c = ((AbstractC0655q) abstractC0723v.mo1482a(2)).mo1410c();
        this.f5135d = ((AbstractC0655q) abstractC0723v.mo1482a(3)).mo1410c();
        this.f5137f = ((AbstractC0655q) abstractC0723v.mo1482a(4)).mo1410c();
        this.f5138g = ((AbstractC0655q) abstractC0723v.mo1482a(5)).mo1410c();
        this.f5136e = ((AbstractC0655q) abstractC0723v.mo1482a(6)).mo1410c();
    }

    /* JADX INFO: renamed from: a */
    public static C1429c m3729a(Object obj) {
        if (obj instanceof C1429c) {
            return (C1429c) obj;
        }
        if (obj != null) {
            return new C1429c(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final int m3730a() {
        return this.f5132a;
    }

    /* JADX INFO: renamed from: b */
    public final int m3731b() {
        return this.f5133b;
    }

    /* JADX INFO: renamed from: c */
    public final C1525b m3732c() {
        return new C1525b(this.f5134c);
    }

    /* JADX INFO: renamed from: d */
    public final C1532i m3733d() {
        return new C1532i(m3732c(), this.f5135d);
    }

    /* JADX INFO: renamed from: e */
    public final C1524a m3734e() {
        return new C1524a(this.f5136e);
    }

    /* JADX INFO: renamed from: f */
    public final C1531h m3735f() {
        return new C1531h(this.f5137f);
    }

    /* JADX INFO: renamed from: g */
    public final C1531h m3736g() {
        return new C1531h(this.f5138g);
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0640m(this.f5132a));
        c0625g.m1521a(new C0640m(this.f5133b));
        c0625g.m1521a(new C0581be(this.f5134c));
        c0625g.m1521a(new C0581be(this.f5135d));
        c0625g.m1521a(new C0581be(this.f5137f));
        c0625g.m1521a(new C0581be(this.f5138g));
        c0625g.m1521a(new C0581be(this.f5136e));
        return new C0585bi(c0625g);
    }
}
