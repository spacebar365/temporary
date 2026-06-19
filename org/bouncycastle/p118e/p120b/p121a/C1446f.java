package org.bouncycastle.p118e.p120b.p121a;

import org.bouncycastle.p118e.p140d.p141a.C1524a;
import org.bouncycastle.p118e.p140d.p141a.C1525b;
import org.bouncycastle.p118e.p140d.p141a.C1526c;
import org.bouncycastle.p118e.p140d.p141a.C1531h;
import org.bouncycastle.p118e.p140d.p141a.C1532i;
import org.bouncycastle.p118e.p140d.p141a.C1534k;

/* JADX INFO: renamed from: org.bouncycastle.e.b.a.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1446f extends C1444d {

    /* JADX INFO: renamed from: b */
    private int f5247b;

    /* JADX INFO: renamed from: c */
    private int f5248c;

    /* JADX INFO: renamed from: d */
    private C1525b f5249d;

    /* JADX INFO: renamed from: e */
    private C1532i f5250e;

    /* JADX INFO: renamed from: f */
    private C1524a f5251f;

    /* JADX INFO: renamed from: g */
    private C1531h f5252g;

    /* JADX INFO: renamed from: h */
    private C1531h f5253h;

    /* JADX INFO: renamed from: i */
    private C1524a f5254i;

    /* JADX INFO: renamed from: j */
    private C1532i[] f5255j;

    public C1446f(int i, int i2, C1525b c1525b, C1532i c1532i, C1531h c1531h, C1531h c1531h2, C1524a c1524a) {
        super(true);
        this.f5248c = i2;
        this.f5247b = i;
        this.f5249d = c1525b;
        this.f5250e = c1532i;
        this.f5251f = c1524a;
        this.f5252g = c1531h;
        this.f5253h = c1531h2;
        this.f5254i = C1526c.m4032a(c1525b, c1532i);
        this.f5255j = new C1534k(c1525b, c1532i).m4064a();
    }

    /* JADX INFO: renamed from: b */
    public final int m3782b() {
        return this.f5247b;
    }

    /* JADX INFO: renamed from: c */
    public final int m3783c() {
        return this.f5248c;
    }

    /* JADX INFO: renamed from: d */
    public final C1525b m3784d() {
        return this.f5249d;
    }

    /* JADX INFO: renamed from: e */
    public final C1532i m3785e() {
        return this.f5250e;
    }

    /* JADX INFO: renamed from: f */
    public final C1524a m3786f() {
        return this.f5251f;
    }

    /* JADX INFO: renamed from: g */
    public final C1531h m3787g() {
        return this.f5252g;
    }

    /* JADX INFO: renamed from: h */
    public final C1531h m3788h() {
        return this.f5253h;
    }
}
