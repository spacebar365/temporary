package org.bouncycastle.p054a.p082z;

import java.util.Enumeration;
import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0590bn;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.z.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0761b extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    AbstractC0655q f3138a;

    /* JADX INFO: renamed from: b */
    C0775p f3139b;

    /* JADX INFO: renamed from: c */
    C0640m f3140c;

    private C0761b(AbstractC0723v abstractC0723v) {
        this.f3138a = null;
        this.f3139b = null;
        this.f3140c = null;
        Enumeration enumerationMo1483c = abstractC0723v.mo1483c();
        while (enumerationMo1483c.hasMoreElements()) {
            AbstractC0539ab abstractC0539abA = C0590bn.m1394a(enumerationMo1483c.nextElement());
            switch (abstractC0539abA.m1396b()) {
                case 0:
                    this.f3138a = AbstractC0655q.m1597a(abstractC0539abA, false);
                    break;
                case 1:
                    this.f3139b = C0775p.m1835a(abstractC0539abA);
                    break;
                case 2:
                    this.f3140c = C0640m.m1562a(abstractC0539abA, false);
                    break;
                default:
                    throw new IllegalArgumentException("illegal tag");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0761b m1785a(Object obj) {
        if (obj != null) {
            return new C0761b(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m1786a() {
        if (this.f3138a != null) {
            return this.f3138a.mo1410c();
        }
        return null;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        if (this.f3138a != null) {
            c0625g.m1521a(new C0590bn(false, 0, this.f3138a));
        }
        if (this.f3139b != null) {
            c0625g.m1521a(new C0590bn(false, 1, this.f3139b));
        }
        if (this.f3140c != null) {
            c0625g.m1521a(new C0590bn(false, 2, this.f3140c));
        }
        return new C0585bi(c0625g);
    }

    public final String toString() {
        return "AuthorityKeyIdentifier: KeyID(" + (this.f3138a != null ? C1541f.m4105a(this.f3138a.mo1410c()) : "null") + ")";
    }
}
