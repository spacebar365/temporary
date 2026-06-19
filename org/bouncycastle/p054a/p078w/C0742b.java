package org.bouncycastle.p054a.p078w;

import java.math.BigInteger;
import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0590bn;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.w.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0742b extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    BigInteger f2959a;

    /* JADX INFO: renamed from: b */
    C0741a f2960b;

    /* JADX INFO: renamed from: c */
    C0640m f2961c;

    /* JADX INFO: renamed from: d */
    AbstractC0655q f2962d;

    /* JADX INFO: renamed from: e */
    C0640m f2963e;

    /* JADX INFO: renamed from: f */
    AbstractC0655q f2964f;

    private C0742b(AbstractC0723v abstractC0723v) {
        int i = 0;
        this.f2959a = BigInteger.valueOf(0L);
        if (abstractC0723v.mo1482a(0) instanceof AbstractC0539ab) {
            AbstractC0539ab abstractC0539ab = (AbstractC0539ab) abstractC0723v.mo1482a(0);
            if (!abstractC0539ab.m1397c() || abstractC0539ab.m1396b() != 0) {
                throw new IllegalArgumentException("object parse error");
            }
            this.f2959a = C0640m.m1561a((Object) abstractC0539ab.mo1398d()).m1564b();
            i = 1;
        }
        this.f2960b = C0741a.m1718a(abstractC0723v.mo1482a(i));
        int i2 = i + 1;
        this.f2961c = C0640m.m1561a(abstractC0723v.mo1482a(i2));
        int i3 = i2 + 1;
        this.f2962d = AbstractC0655q.m1596a(abstractC0723v.mo1482a(i3));
        int i4 = i3 + 1;
        this.f2963e = C0640m.m1561a(abstractC0723v.mo1482a(i4));
        this.f2964f = AbstractC0655q.m1596a(abstractC0723v.mo1482a(i4 + 1));
    }

    /* JADX INFO: renamed from: a */
    public static C0742b m1723a(Object obj) {
        if (obj instanceof C0742b) {
            return (C0742b) obj;
        }
        if (obj != null) {
            return new C0742b(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0741a m1724a() {
        return this.f2960b;
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m1725b() {
        return this.f2961c.m1564b();
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m1726c() {
        return C1535a.m4086b(this.f2962d.mo1410c());
    }

    /* JADX INFO: renamed from: d */
    public final BigInteger m1727d() {
        return this.f2963e.m1564b();
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m1728e() {
        return C1535a.m4086b(this.f2964f.mo1410c());
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        if (this.f2959a.compareTo(BigInteger.valueOf(0L)) != 0) {
            c0625g.m1521a(new C0590bn(true, 0, new C0640m(this.f2959a)));
        }
        c0625g.m1521a(this.f2960b);
        c0625g.m1521a(this.f2961c);
        c0625g.m1521a(this.f2962d);
        c0625g.m1521a(this.f2963e);
        c0625g.m1521a(this.f2964f);
        return new C0585bi(c0625g);
    }
}
