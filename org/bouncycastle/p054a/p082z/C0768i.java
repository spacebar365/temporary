package org.bouncycastle.p054a.p082z;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;

/* JADX INFO: renamed from: org.bouncycastle.a.z.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0768i extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    C0640m f3157a;

    /* JADX INFO: renamed from: b */
    C0640m f3158b;

    /* JADX INFO: renamed from: c */
    C0640m f3159c;

    public C0768i(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f3157a = new C0640m(bigInteger);
        this.f3158b = new C0640m(bigInteger2);
        this.f3159c = new C0640m(bigInteger3);
    }

    private C0768i(AbstractC0723v abstractC0723v) {
        if (abstractC0723v.mo1484d() != 3) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC0723v.mo1484d());
        }
        Enumeration enumerationMo1483c = abstractC0723v.mo1483c();
        this.f3157a = C0640m.m1561a(enumerationMo1483c.nextElement());
        this.f3158b = C0640m.m1561a(enumerationMo1483c.nextElement());
        this.f3159c = C0640m.m1561a(enumerationMo1483c.nextElement());
    }

    /* JADX INFO: renamed from: a */
    public static C0768i m1813a(Object obj) {
        if (obj instanceof C0768i) {
            return (C0768i) obj;
        }
        if (obj != null) {
            return new C0768i(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m1814a() {
        return this.f3157a.m1565c();
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m1815b() {
        return this.f3158b.m1565c();
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m1816c() {
        return this.f3159c.m1565c();
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f3157a);
        c0625g.m1521a(this.f3158b);
        c0625g.m1521a(this.f3159c);
        return new C0585bi(c0625g);
    }
}
