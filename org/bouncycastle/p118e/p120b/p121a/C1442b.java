package org.bouncycastle.p118e.p120b.p121a;

import org.bouncycastle.p118e.p140d.p141a.C1524a;
import org.bouncycastle.p118e.p140d.p141a.C1525b;
import org.bouncycastle.p118e.p140d.p141a.C1526c;
import org.bouncycastle.p118e.p140d.p141a.C1531h;
import org.bouncycastle.p118e.p140d.p141a.C1532i;
import org.bouncycastle.p118e.p140d.p141a.C1534k;

/* JADX INFO: renamed from: org.bouncycastle.e.b.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1442b extends C1441a {

    /* JADX INFO: renamed from: b */
    private int f5236b;

    /* JADX INFO: renamed from: c */
    private int f5237c;

    /* JADX INFO: renamed from: d */
    private C1525b f5238d;

    /* JADX INFO: renamed from: e */
    private C1532i f5239e;

    /* JADX INFO: renamed from: f */
    private C1531h f5240f;

    /* JADX INFO: renamed from: g */
    private C1524a f5241g;

    /* JADX INFO: renamed from: h */
    private C1532i[] f5242h;

    private C1442b(int i, int i2, C1525b c1525b, C1532i c1532i, C1524a c1524a, C1531h c1531h, String str) {
        super(true, str);
        this.f5236b = i;
        this.f5237c = i2;
        this.f5238d = c1525b;
        this.f5239e = c1532i;
        this.f5241g = c1524a;
        this.f5240f = c1531h;
        this.f5242h = new C1534k(c1525b, c1532i).m4064a();
    }

    public C1442b(int i, int i2, C1525b c1525b, C1532i c1532i, C1531h c1531h, String str) {
        this(i, i2, c1525b, c1532i, C1526c.m4032a(c1525b, c1532i), c1531h, str);
    }

    /* JADX INFO: renamed from: c */
    public final int m3773c() {
        return this.f5236b;
    }

    /* JADX INFO: renamed from: d */
    public final int m3774d() {
        return this.f5237c;
    }

    /* JADX INFO: renamed from: e */
    public final C1525b m3775e() {
        return this.f5238d;
    }

    /* JADX INFO: renamed from: f */
    public final C1532i m3776f() {
        return this.f5239e;
    }

    /* JADX INFO: renamed from: g */
    public final C1531h m3777g() {
        return this.f5240f;
    }

    /* JADX INFO: renamed from: h */
    public final C1524a m3778h() {
        return this.f5241g;
    }
}
