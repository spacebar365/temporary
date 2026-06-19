package org.bouncycastle.p054a.p082z;

import java.math.BigInteger;
import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0558au;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.p080y.C0756c;

/* JADX INFO: renamed from: org.bouncycastle.a.z.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0782w extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    AbstractC0723v f3230a;

    /* JADX INFO: renamed from: b */
    C0640m f3231b;

    /* JADX INFO: renamed from: c */
    C0640m f3232c;

    /* JADX INFO: renamed from: d */
    C0759a f3233d;

    /* JADX INFO: renamed from: e */
    C0756c f3234e;

    /* JADX INFO: renamed from: f */
    C0783x f3235f;

    /* JADX INFO: renamed from: g */
    C0783x f3236g;

    /* JADX INFO: renamed from: h */
    C0756c f3237h;

    /* JADX INFO: renamed from: i */
    C0780u f3238i;

    /* JADX INFO: renamed from: j */
    C0558au f3239j;

    /* JADX INFO: renamed from: k */
    C0558au f3240k;

    /* JADX INFO: renamed from: l */
    C0773n f3241l;

    private C0782w(AbstractC0723v abstractC0723v) {
        int i;
        boolean z;
        boolean z2;
        this.f3230a = abstractC0723v;
        if (abstractC0723v.mo1482a(0) instanceof AbstractC0539ab) {
            this.f3231b = C0640m.m1562a((AbstractC0539ab) abstractC0723v.mo1482a(0), true);
            i = 0;
        } else {
            this.f3231b = new C0640m(0L);
            i = -1;
        }
        if (this.f3231b.m1564b().equals(BigInteger.valueOf(0L))) {
            z = false;
            z2 = true;
        } else if (this.f3231b.m1564b().equals(BigInteger.valueOf(1L))) {
            z = true;
            z2 = false;
        } else {
            if (!this.f3231b.m1564b().equals(BigInteger.valueOf(2L))) {
                throw new IllegalArgumentException("version number not recognised");
            }
            z = false;
            z2 = false;
        }
        this.f3232c = C0640m.m1561a(abstractC0723v.mo1482a(i + 1));
        this.f3233d = C0759a.m1781a(abstractC0723v.mo1482a(i + 2));
        this.f3234e = C0756c.m1774a(abstractC0723v.mo1482a(i + 3));
        AbstractC0723v abstractC0723v2 = (AbstractC0723v) abstractC0723v.mo1482a(i + 4);
        this.f3235f = C0783x.m1859a(abstractC0723v2.mo1482a(0));
        this.f3236g = C0783x.m1859a(abstractC0723v2.mo1482a(1));
        this.f3237h = C0756c.m1774a(abstractC0723v.mo1482a(i + 5));
        this.f3238i = C0780u.m1843a(abstractC0723v.mo1482a(i + 6));
        int iMo1484d = (abstractC0723v.mo1484d() - (i + 6)) - 1;
        if (iMo1484d != 0 && z2) {
            throw new IllegalArgumentException("version 1 certificate contains extra data");
        }
        for (int i2 = iMo1484d; i2 > 0; i2--) {
            AbstractC0539ab abstractC0539ab = (AbstractC0539ab) abstractC0723v.mo1482a(i + 6 + i2);
            switch (abstractC0539ab.m1396b()) {
                case 1:
                    this.f3239j = C0558au.m1415a(abstractC0539ab, false);
                    break;
                case 2:
                    this.f3240k = C0558au.m1415a(abstractC0539ab, false);
                    break;
                case 3:
                    if (z) {
                        throw new IllegalArgumentException("version 2 certificate cannot contain extensions");
                    }
                    this.f3241l = C0773n.m1828a(AbstractC0723v.m1709a(abstractC0539ab, true));
                    break;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown tag encountered in structure: " + abstractC0539ab.m1396b());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0782w m1854a(Object obj) {
        if (obj instanceof C0782w) {
            return (C0782w) obj;
        }
        if (obj != null) {
            return new C0782w(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0759a m1855a() {
        return this.f3233d;
    }

    /* JADX INFO: renamed from: b */
    public final C0558au m1856b() {
        return this.f3239j;
    }

    /* JADX INFO: renamed from: c */
    public final C0558au m1857c() {
        return this.f3240k;
    }

    /* JADX INFO: renamed from: d */
    public final C0773n m1858d() {
        return this.f3241l;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return this.f3230a;
    }
}
