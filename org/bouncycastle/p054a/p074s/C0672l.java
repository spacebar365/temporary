package org.bouncycastle.p054a.p074s;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.s.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0672l extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private static final C0759a f2605a = new C0759a(InterfaceC0674n.f2622K, C0579bc.f2112a);

    /* JADX INFO: renamed from: b */
    private final AbstractC0655q f2606b;

    /* JADX INFO: renamed from: c */
    private final C0640m f2607c;

    /* JADX INFO: renamed from: d */
    private final C0640m f2608d;

    /* JADX INFO: renamed from: e */
    private final C0759a f2609e;

    private C0672l(AbstractC0723v abstractC0723v) {
        Enumeration enumerationMo1483c = abstractC0723v.mo1483c();
        this.f2606b = (AbstractC0655q) enumerationMo1483c.nextElement();
        this.f2607c = (C0640m) enumerationMo1483c.nextElement();
        if (!enumerationMo1483c.hasMoreElements()) {
            this.f2608d = null;
            this.f2609e = null;
            return;
        }
        Object objNextElement = enumerationMo1483c.nextElement();
        if (objNextElement instanceof C0640m) {
            this.f2608d = C0640m.m1561a(objNextElement);
            objNextElement = enumerationMo1483c.hasMoreElements() ? enumerationMo1483c.nextElement() : null;
        } else {
            this.f2608d = null;
        }
        if (objNextElement != null) {
            this.f2609e = C0759a.m1781a(objNextElement);
        } else {
            this.f2609e = null;
        }
    }

    public C0672l(byte[] bArr, int i) {
        this(bArr, i, (byte) 0);
    }

    private C0672l(byte[] bArr, int i, byte b) {
        this(bArr, i, 0, null);
    }

    public C0672l(byte[] bArr, int i, int i2, C0759a c0759a) {
        this.f2606b = new C0581be(C1535a.m4086b(bArr));
        this.f2607c = new C0640m(i);
        if (i2 > 0) {
            this.f2608d = new C0640m(i2);
        } else {
            this.f2608d = null;
        }
        this.f2609e = c0759a;
    }

    /* JADX INFO: renamed from: a */
    public static C0672l m1644a(Object obj) {
        if (obj instanceof C0672l) {
            return (C0672l) obj;
        }
        if (obj != null) {
            return new C0672l(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m1645a() {
        return this.f2606b.mo1410c();
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m1646b() {
        return this.f2607c.m1564b();
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m1647c() {
        if (this.f2608d != null) {
            return this.f2608d.m1564b();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1648d() {
        return this.f2609e == null || this.f2609e.equals(f2605a);
    }

    /* JADX INFO: renamed from: e */
    public final C0759a m1649e() {
        return this.f2609e != null ? this.f2609e : f2605a;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2606b);
        c0625g.m1521a(this.f2607c);
        if (this.f2608d != null) {
            c0625g.m1521a(this.f2608d);
        }
        if (this.f2609e != null && !this.f2609e.equals(f2605a)) {
            c0625g.m1521a(this.f2609e);
        }
        return new C0585bi(c0625g);
    }
}
