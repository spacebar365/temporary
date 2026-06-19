package org.bouncycastle.p054a.p082z;

import java.text.ParseException;
import java.util.Date;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.C0541ad;
import org.bouncycastle.p054a.C0636k;
import org.bouncycastle.p054a.InterfaceC0616e;

/* JADX INFO: renamed from: org.bouncycastle.a.z.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0783x extends AbstractC0650o implements InterfaceC0616e {

    /* JADX INFO: renamed from: a */
    AbstractC0686u f3242a;

    private C0783x(AbstractC0686u abstractC0686u) {
        if (!(abstractC0686u instanceof C0541ad) && !(abstractC0686u instanceof C0636k)) {
            throw new IllegalArgumentException("unknown object passed to Time");
        }
        this.f3242a = abstractC0686u;
    }

    /* JADX INFO: renamed from: a */
    public static C0783x m1859a(Object obj) {
        if (obj == null || (obj instanceof C0783x)) {
            return (C0783x) obj;
        }
        if (obj instanceof C0541ad) {
            return new C0783x((C0541ad) obj);
        }
        if (obj instanceof C0636k) {
            return new C0783x((C0636k) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    /* JADX INFO: renamed from: a */
    public final String m1860a() {
        return this.f3242a instanceof C0541ad ? ((C0541ad) this.f3242a).m1405d() : ((C0636k) this.f3242a).m1545b();
    }

    /* JADX INFO: renamed from: b */
    public final Date m1861b() {
        try {
            return this.f3242a instanceof C0541ad ? ((C0541ad) this.f3242a).m1403b() : ((C0636k) this.f3242a).m1546c();
        } catch (ParseException e) {
            throw new IllegalStateException("invalid date string: " + e.getMessage());
        }
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return this.f3242a;
    }

    public final String toString() {
        return m1860a();
    }
}
