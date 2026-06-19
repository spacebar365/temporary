package org.bouncycastle.p054a.p074s;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0603c;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.AbstractC0747x;
import org.bouncycastle.p054a.C0558au;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0590bn;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.a.s.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0676p extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private C0640m f2758a;

    /* JADX INFO: renamed from: b */
    private C0759a f2759b;

    /* JADX INFO: renamed from: c */
    private AbstractC0655q f2760c;

    /* JADX INFO: renamed from: d */
    private AbstractC0747x f2761d;

    /* JADX INFO: renamed from: e */
    private AbstractC0603c f2762e;

    public C0676p(C0759a c0759a, InterfaceC0618f interfaceC0618f) {
        this(c0759a, interfaceC0618f, null, null);
    }

    public C0676p(C0759a c0759a, InterfaceC0618f interfaceC0618f, AbstractC0747x abstractC0747x) {
        this(c0759a, interfaceC0618f, abstractC0747x, null);
    }

    public C0676p(C0759a c0759a, InterfaceC0618f interfaceC0618f, AbstractC0747x abstractC0747x, byte[] bArr) {
        this.f2758a = new C0640m(bArr != null ? C1544b.f5495b : C1544b.f5494a);
        this.f2759b = c0759a;
        this.f2760c = new C0581be(interfaceC0618f);
        this.f2761d = abstractC0747x;
        this.f2762e = bArr == null ? null : new C0558au(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static C0676p m1656a(Object obj) {
        if (obj instanceof C0676p) {
            return (C0676p) obj;
        }
        if (obj != null) {
            return new C0676p(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0747x m1657a() {
        return this.f2761d;
    }

    /* JADX INFO: renamed from: b */
    public final C0759a m1658b() {
        return this.f2759b;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0618f m1659c() {
        return AbstractC0686u.m1692b(this.f2760c.mo1410c());
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1660d() {
        return this.f2762e != null;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2758a);
        c0625g.m1521a(this.f2759b);
        c0625g.m1521a(this.f2760c);
        if (this.f2761d != null) {
            c0625g.m1521a(new C0590bn(false, 0, this.f2761d));
        }
        if (this.f2762e != null) {
            c0625g.m1521a(new C0590bn(false, 1, this.f2762e));
        }
        return new C0585bi(c0625g);
    }

    private C0676p(AbstractC0723v abstractC0723v) {
        Enumeration enumerationMo1483c = abstractC0723v.mo1483c();
        this.f2758a = C0640m.m1561a(enumerationMo1483c.nextElement());
        BigInteger bigIntegerM1564b = this.f2758a.m1564b();
        if (bigIntegerM1564b.compareTo(C1544b.f5494a) < 0 || bigIntegerM1564b.compareTo(C1544b.f5495b) > 0) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        int iIntValue = bigIntegerM1564b.intValue();
        this.f2759b = C0759a.m1781a(enumerationMo1483c.nextElement());
        this.f2760c = AbstractC0655q.m1596a(enumerationMo1483c.nextElement());
        int i = -1;
        while (enumerationMo1483c.hasMoreElements()) {
            AbstractC0539ab abstractC0539ab = (AbstractC0539ab) enumerationMo1483c.nextElement();
            int iM1396b = abstractC0539ab.m1396b();
            if (iM1396b <= i) {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
            switch (iM1396b) {
                case 0:
                    this.f2761d = AbstractC0747x.m1742a(abstractC0539ab);
                    i = iM1396b;
                    break;
                case 1:
                    if (iIntValue <= 0) {
                        throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                    }
                    this.f2762e = C0558au.m1415a(abstractC0539ab, false);
                    i = iM1396b;
                    break;
                default:
                    throw new IllegalArgumentException("unknown optional field in private key info");
            }
        }
    }
}
