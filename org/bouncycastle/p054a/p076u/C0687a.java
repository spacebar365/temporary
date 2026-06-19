package org.bouncycastle.p054a.p076u;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0558au;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0590bn;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.a.u.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0687a extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private AbstractC0723v f2821a;

    public C0687a(int i, BigInteger bigInteger, C0558au c0558au, InterfaceC0618f interfaceC0618f) {
        byte[] bArrM4117a = C1544b.m4117a((i + 7) / 8, bigInteger);
        C0625g c0625g = new C0625g();
        c0625g.m1521a(new C0640m(1L));
        c0625g.m1521a(new C0581be(bArrM4117a));
        if (interfaceC0618f != null) {
            c0625g.m1521a(new C0590bn(true, 0, interfaceC0618f));
        }
        if (c0558au != null) {
            c0625g.m1521a(new C0590bn(true, 1, c0558au));
        }
        this.f2821a = new C0585bi(c0625g);
    }

    public C0687a(int i, BigInteger bigInteger, InterfaceC0618f interfaceC0618f) {
        this(i, bigInteger, null, interfaceC0618f);
    }

    private C0687a(AbstractC0723v abstractC0723v) {
        this.f2821a = abstractC0723v;
    }

    /* JADX INFO: renamed from: a */
    public static C0687a m1693a(Object obj) {
        if (obj instanceof C0687a) {
            return (C0687a) obj;
        }
        if (obj != null) {
            return new C0687a(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private AbstractC0686u m1694a(int i) {
        Enumeration enumerationMo1483c = this.f2821a.mo1483c();
        while (enumerationMo1483c.hasMoreElements()) {
            InterfaceC0618f interfaceC0618f = (InterfaceC0618f) enumerationMo1483c.nextElement();
            if (interfaceC0618f instanceof AbstractC0539ab) {
                AbstractC0539ab abstractC0539ab = (AbstractC0539ab) interfaceC0618f;
                if (abstractC0539ab.m1396b() == i) {
                    return abstractC0539ab.m1402j().mo1358i();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m1695a() {
        return new BigInteger(1, ((AbstractC0655q) this.f2821a.mo1482a(1)).mo1410c());
    }

    /* JADX INFO: renamed from: b */
    public final C0558au m1696b() {
        return (C0558au) m1694a(1);
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0686u m1697c() {
        return m1694a(0);
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return this.f2821a;
    }
}
