package org.bouncycastle.p118e.p120b.p128g;

import java.io.Serializable;
import java.util.Stack;
import org.bouncycastle.p118e.p120b.p128g.C1470g;
import org.bouncycastle.p118e.p120b.p128g.C1472i;
import org.bouncycastle.p118e.p120b.p128g.C1473j;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.c */
/* JADX INFO: loaded from: classes.dex */
final class C1466c implements Serializable {

    /* JADX INFO: renamed from: a */
    private C1484u f5303a;

    /* JADX INFO: renamed from: b */
    private final int f5304b;

    /* JADX INFO: renamed from: c */
    private int f5305c;

    /* JADX INFO: renamed from: d */
    private int f5306d;

    /* JADX INFO: renamed from: e */
    private boolean f5307e = false;

    /* JADX INFO: renamed from: f */
    private boolean f5308f = false;

    C1466c(int i) {
        this.f5304b = i;
    }

    /* JADX INFO: renamed from: a */
    final int m3851a() {
        if (!this.f5307e || this.f5308f) {
            return Integer.MAX_VALUE;
        }
        return this.f5305c;
    }

    /* JADX INFO: renamed from: a */
    final void m3852a(int i) {
        this.f5303a = null;
        this.f5305c = this.f5304b;
        this.f5306d = i;
        this.f5307e = true;
        this.f5308f = false;
    }

    /* JADX INFO: renamed from: a */
    final void m3853a(Stack<C1484u> stack, C1474k c1474k, byte[] bArr, byte[] bArr2, C1473j c1473j) {
        if (c1473j == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.f5308f || !this.f5307e) {
            throw new IllegalStateException("finished or not initialized");
        }
        C1473j c1473j2 = (C1473j) new C1473j.a().m3918d(c1473j.m3910e()).m3917a(c1473j.m3911f()).m3893a(this.f5306d).m3894b(c1473j.m3888c()).m3895c(c1473j.m3889d()).m3919e(c1473j.m3912g()).mo3871a();
        C1472i c1472i = (C1472i) new C1472i.a().m3918d(c1473j2.m3910e()).m3917a(c1473j2.m3911f()).m3884a(this.f5306d).mo3871a();
        C1470g c1470g = (C1470g) new C1470g.a().m3918d(c1473j2.m3910e()).m3917a(c1473j2.m3911f()).m3872b(this.f5306d).mo3871a();
        c1474k.m3899a(c1474k.m3900a(bArr2, c1473j2), bArr);
        C1484u c1484uM3959a = C1485v.m3959a(c1474k, c1474k.m3898a(c1473j2), c1472i);
        while (!stack.isEmpty() && stack.peek().m3956a() == c1484uM3959a.m3956a() && stack.peek().m3956a() != this.f5304b) {
            C1470g c1470g2 = (C1470g) new C1470g.a().m3918d(c1470g.m3910e()).m3917a(c1470g.m3911f()).m3870a(c1470g.m3866b()).m3872b((c1470g.m3867c() - 1) / 2).m3919e(c1470g.m3912g()).mo3871a();
            C1484u c1484uM3960a = C1485v.m3960a(c1474k, stack.pop(), c1484uM3959a, c1470g2);
            c1484uM3959a = new C1484u(c1484uM3960a.m3956a() + 1, c1484uM3960a.m3957b());
            c1470g = (C1470g) new C1470g.a().m3918d(c1470g2.m3910e()).m3917a(c1470g2.m3911f()).m3870a(c1470g2.m3866b() + 1).m3872b(c1470g2.m3867c()).m3919e(c1470g2.m3912g()).mo3871a();
        }
        if (this.f5303a == null) {
            this.f5303a = c1484uM3959a;
        } else if (this.f5303a.m3956a() == c1484uM3959a.m3956a()) {
            C1470g c1470g3 = (C1470g) new C1470g.a().m3918d(c1470g.m3910e()).m3917a(c1470g.m3911f()).m3870a(c1470g.m3866b()).m3872b((c1470g.m3867c() - 1) / 2).m3919e(c1470g.m3912g()).mo3871a();
            c1484uM3959a = new C1484u(this.f5303a.m3956a() + 1, C1485v.m3960a(c1474k, this.f5303a, c1484uM3959a, c1470g3).m3957b());
            this.f5303a = c1484uM3959a;
            new C1470g.a().m3918d(c1470g3.m3910e()).m3917a(c1470g3.m3911f()).m3870a(c1470g3.m3866b() + 1).m3872b(c1470g3.m3867c()).m3919e(c1470g3.m3912g()).mo3871a();
        } else {
            stack.push(c1484uM3959a);
        }
        if (this.f5303a.m3956a() == this.f5304b) {
            this.f5308f = true;
        } else {
            this.f5305c = c1484uM3959a.m3956a();
            this.f5306d++;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m3854a(C1484u c1484u) {
        this.f5303a = c1484u;
        this.f5305c = c1484u.m3956a();
        if (this.f5305c == this.f5304b) {
            this.f5308f = true;
        }
    }

    /* JADX INFO: renamed from: b */
    final int m3855b() {
        return this.f5306d;
    }

    /* JADX INFO: renamed from: c */
    final boolean m3856c() {
        return this.f5308f;
    }

    /* JADX INFO: renamed from: d */
    final boolean m3857d() {
        return this.f5307e;
    }

    /* JADX INFO: renamed from: e */
    public final C1484u m3858e() {
        return this.f5303a.clone();
    }
}
