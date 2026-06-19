package org.bouncycastle.p054a.p074s;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0549al;
import org.bouncycastle.p054a.C0599bw;
import org.bouncycastle.p054a.C0625g;

/* JADX INFO: renamed from: org.bouncycastle.a.s.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0661a extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private C0663c[] f2582a;

    /* JADX INFO: renamed from: b */
    private boolean f2583b;

    private C0661a(AbstractC0723v abstractC0723v) {
        this.f2583b = true;
        this.f2582a = new C0663c[abstractC0723v.mo1484d()];
        for (int i = 0; i != this.f2582a.length; i++) {
            this.f2582a[i] = C0663c.m1615a(abstractC0723v.mo1482a(i));
        }
        this.f2583b = abstractC0723v instanceof C0549al;
    }

    public C0661a(C0663c[] c0663cArr) {
        this.f2583b = true;
        this.f2582a = m1610a(c0663cArr);
    }

    /* JADX INFO: renamed from: a */
    public static C0661a m1609a(Object obj) {
        if (obj != null) {
            return new C0661a(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static C0663c[] m1610a(C0663c[] c0663cArr) {
        C0663c[] c0663cArr2 = new C0663c[c0663cArr.length];
        System.arraycopy(c0663cArr, 0, c0663cArr2, 0, c0663cArr2.length);
        return c0663cArr2;
    }

    /* JADX INFO: renamed from: a */
    public final C0663c[] m1611a() {
        return m1610a(this.f2582a);
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        for (int i = 0; i != this.f2582a.length; i++) {
            c0625g.m1521a(this.f2582a[i]);
        }
        return this.f2583b ? new C0549al(c0625g) : new C0599bw(c0625g);
    }
}
