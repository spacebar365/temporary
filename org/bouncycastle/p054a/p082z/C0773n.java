package org.bouncycastle.p054a.p082z;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0653p;

/* JADX INFO: renamed from: org.bouncycastle.a.z.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0773n extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private Hashtable f3202a = new Hashtable();

    /* JADX INFO: renamed from: b */
    private Vector f3203b = new Vector();

    private C0773n(AbstractC0723v abstractC0723v) {
        Enumeration enumerationMo1483c = abstractC0723v.mo1483c();
        while (enumerationMo1483c.hasMoreElements()) {
            C0772m c0772mM1823a = C0772m.m1823a(enumerationMo1483c.nextElement());
            if (this.f3202a.containsKey(c0772mM1823a.m1824a())) {
                throw new IllegalArgumentException("repeated extension found: " + c0772mM1823a.m1824a());
            }
            this.f3202a.put(c0772mM1823a.m1824a(), c0772mM1823a);
            this.f3203b.addElement(c0772mM1823a.m1824a());
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0773n m1828a(Object obj) {
        if (obj instanceof C0773n) {
            return (C0773n) obj;
        }
        if (obj != null) {
            return new C0773n(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final Enumeration m1829a() {
        return this.f3203b.elements();
    }

    /* JADX INFO: renamed from: a */
    public final C0772m m1830a(C0653p c0653p) {
        return (C0772m) this.f3202a.get(c0653p);
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        Enumeration enumerationElements = this.f3203b.elements();
        while (enumerationElements.hasMoreElements()) {
            c0625g.m1521a((C0772m) this.f3202a.get((C0653p) enumerationElements.nextElement()));
        }
        return new C0585bi(c0625g);
    }
}
