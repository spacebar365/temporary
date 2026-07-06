package org.bouncycastle.a.z;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class n extends org.bouncycastle.a.o {
    private Hashtable a = new Hashtable();
    private Vector b = new Vector();

    private n(org.bouncycastle.a.v vVar) {
        Enumeration enumerationC = vVar.c();
        while (enumerationC.hasMoreElements()) {
            m mVarA = m.a(enumerationC.nextElement());
            if (this.a.containsKey(mVarA.a())) {
                throw new IllegalArgumentException("repeated extension found: " + mVarA.a());
            }
            this.a.put(mVarA.a(), mVarA);
            this.b.addElement(mVarA.a());
        }
    }

    public static n a(Object obj) {
        if (obj instanceof n) {
            return (n) obj;
        }
        if (obj != null) {
            return new n(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final Enumeration a() {
        return this.b.elements();
    }

    public final m a(org.bouncycastle.a.p pVar) {
        return (m) this.a.get(pVar);
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        Enumeration enumerationElements = this.b.elements();
        while (enumerationElements.hasMoreElements()) {
            gVar.a((m) this.a.get((org.bouncycastle.a.p) enumerationElements.nextElement()));
        }
        return new bi(gVar);
    }
}
