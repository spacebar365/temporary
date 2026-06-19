package org.bouncycastle.p054a.p056aa;

import org.bouncycastle.p054a.AbstractC0642n;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0616e;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.ab */
/* JADX INFO: loaded from: classes.dex */
public final class C0505ab extends AbstractC0650o implements InterfaceC0616e {

    /* JADX INFO: renamed from: a */
    private AbstractC0686u f1882a;

    public C0505ab(C0507ad c0507ad) {
        this.f1882a = null;
        this.f1882a = c0507ad.mo1358i();
    }

    public C0505ab(AbstractC0642n abstractC0642n) {
        this.f1882a = null;
        this.f1882a = abstractC0642n;
    }

    public C0505ab(C0653p c0653p) {
        this.f1882a = null;
        this.f1882a = c0653p;
    }

    private C0505ab(AbstractC0686u abstractC0686u) {
        this.f1882a = null;
        this.f1882a = abstractC0686u;
    }

    /* JADX INFO: renamed from: a */
    public static C0505ab m1359a(Object obj) {
        if (obj == null || (obj instanceof C0505ab)) {
            return (C0505ab) obj;
        }
        if (obj instanceof AbstractC0686u) {
            return new C0505ab((AbstractC0686u) obj);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
        try {
            return new C0505ab(AbstractC0686u.m1692b((byte[]) obj));
        } catch (Exception e) {
            throw new IllegalArgumentException("unable to parse encoded data: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1360a() {
        return this.f1882a instanceof C0653p;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1361b() {
        return this.f1882a instanceof AbstractC0642n;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0686u m1362c() {
        return this.f1882a;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return this.f1882a;
    }
}
