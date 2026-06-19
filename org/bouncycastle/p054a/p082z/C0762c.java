package org.bouncycastle.p054a.p082z;

import java.math.BigInteger;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0613d;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;

/* JADX INFO: renamed from: org.bouncycastle.a.z.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0762c extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    C0613d f3141a;

    /* JADX INFO: renamed from: b */
    C0640m f3142b;

    private C0762c(AbstractC0723v abstractC0723v) {
        this.f3141a = C0613d.m1493a(false);
        this.f3142b = null;
        if (abstractC0723v.mo1484d() == 0) {
            this.f3141a = null;
            this.f3142b = null;
            return;
        }
        if (abstractC0723v.mo1482a(0) instanceof C0613d) {
            this.f3141a = C0613d.m1491a(abstractC0723v.mo1482a(0));
        } else {
            this.f3141a = null;
            this.f3142b = C0640m.m1561a(abstractC0723v.mo1482a(0));
        }
        if (abstractC0723v.mo1484d() > 1) {
            if (this.f3141a == null) {
                throw new IllegalArgumentException("wrong sequence in constructor");
            }
            this.f3142b = C0640m.m1561a(abstractC0723v.mo1482a(1));
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0762c m1787a(Object obj) {
        if (obj != null) {
            return new C0762c(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1788a() {
        return this.f3141a != null && this.f3141a.m1495b();
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m1789b() {
        if (this.f3142b != null) {
            return this.f3142b.m1564b();
        }
        return null;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        if (this.f3141a != null) {
            c0625g.m1521a(this.f3141a);
        }
        if (this.f3142b != null) {
            c0625g.m1521a(this.f3142b);
        }
        return new C0585bi(c0625g);
    }

    public final String toString() {
        return this.f3142b == null ? this.f3141a == null ? "BasicConstraints: isCa(false)" : "BasicConstraints: isCa(" + m1788a() + ")" : "BasicConstraints: isCa(" + m1788a() + "), pathLenConstraint = " + this.f3142b.m1564b();
    }
}
