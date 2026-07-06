package org.bouncycastle.a.z;

import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public final class f extends org.bouncycastle.a.o {
    private static final String[] a = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
    private static final Hashtable b = new Hashtable();
    private org.bouncycastle.a.h c;

    private f(int i) {
        this.c = new org.bouncycastle.a.h(i);
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        return this.c;
    }

    public static f a(Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = org.bouncycastle.a.h.a(obj).b().intValue();
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (!b.containsKey(numValueOf)) {
            b.put(numValueOf, new f(iIntValue));
        }
        return (f) b.get(numValueOf);
    }

    public final String toString() {
        int iIntValue = this.c.b().intValue();
        return "CRLReason: ".concat(String.valueOf((iIntValue < 0 || iIntValue > 10) ? "invalid" : a[iIntValue]));
    }
}
