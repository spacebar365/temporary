package org.bouncycastle.p054a.p080y;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0747x;

/* JADX INFO: renamed from: org.bouncycastle.a.y.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0755b extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private AbstractC0747x f3106a;

    private C0755b(AbstractC0747x abstractC0747x) {
        this.f3106a = abstractC0747x;
    }

    /* JADX INFO: renamed from: a */
    public static C0755b m1770a(Object obj) {
        if (obj instanceof C0755b) {
            return (C0755b) obj;
        }
        if (obj != null) {
            return new C0755b(AbstractC0747x.m1741a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1771a() {
        return this.f3106a.m1748c() > 1;
    }

    /* JADX INFO: renamed from: b */
    public final C0750a m1772b() {
        if (this.f3106a.m1748c() == 0) {
            return null;
        }
        return C0750a.m1754a(this.f3106a.m1746a(0));
    }

    /* JADX INFO: renamed from: c */
    public final C0750a[] m1773c() {
        C0750a[] c0750aArr = new C0750a[this.f3106a.m1748c()];
        for (int i = 0; i != c0750aArr.length; i++) {
            c0750aArr[i] = C0750a.m1754a(this.f3106a.m1746a(i));
        }
        return c0750aArr;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return this.f3106a;
    }
}
