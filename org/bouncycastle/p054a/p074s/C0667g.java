package org.bouncycastle.p054a.p074s;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p082z.C0759a;

/* JADX INFO: renamed from: org.bouncycastle.a.s.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0667g extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private C0759a f2595a;

    public C0667g(C0653p c0653p) {
        this.f2595a = new C0759a(c0653p);
    }

    public C0667g(C0653p c0653p, InterfaceC0618f interfaceC0618f) {
        this.f2595a = new C0759a(c0653p, interfaceC0618f);
    }

    private C0667g(AbstractC0723v abstractC0723v) {
        this.f2595a = C0759a.m1781a(abstractC0723v);
    }

    /* JADX INFO: renamed from: a */
    public static C0667g m1628a(Object obj) {
        if (obj instanceof C0667g) {
            return (C0667g) obj;
        }
        if (obj != null) {
            return new C0667g(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0653p m1629a() {
        return this.f2595a.m1783a();
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0618f m1630b() {
        return this.f2595a.m1784b();
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return this.f2595a.mo1358i();
    }
}
