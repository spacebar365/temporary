package org.bouncycastle.a.z;

import java.text.ParseException;
import java.util.Date;
import org.bouncycastle.a.ad;

/* JADX INFO: loaded from: classes.dex */
public final class x extends org.bouncycastle.a.o implements org.bouncycastle.a.e {
    org.bouncycastle.a.u a;

    private x(org.bouncycastle.a.u uVar) {
        if (!(uVar instanceof ad) && !(uVar instanceof org.bouncycastle.a.k)) {
            throw new IllegalArgumentException("unknown object passed to Time");
        }
        this.a = uVar;
    }

    public static x a(Object obj) {
        if (obj == null || (obj instanceof x)) {
            return (x) obj;
        }
        if (obj instanceof ad) {
            return new x((ad) obj);
        }
        if (obj instanceof org.bouncycastle.a.k) {
            return new x((org.bouncycastle.a.k) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    public final String a() {
        return this.a instanceof ad ? ((ad) this.a).d() : ((org.bouncycastle.a.k) this.a).b();
    }

    public final Date b() {
        try {
            return this.a instanceof ad ? ((ad) this.a).b() : ((org.bouncycastle.a.k) this.a).c();
        } catch (ParseException e) {
            throw new IllegalStateException("invalid date string: " + e.getMessage());
        }
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        return this.a;
    }

    public final String toString() {
        return a();
    }
}
