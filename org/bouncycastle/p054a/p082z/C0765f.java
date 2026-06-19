package org.bouncycastle.p054a.p082z;

import java.util.Hashtable;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.C0627h;

/* JADX INFO: renamed from: org.bouncycastle.a.z.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0765f extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private static final String[] f3145a = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    /* JADX INFO: renamed from: b */
    private static final Hashtable f3146b = new Hashtable();

    /* JADX INFO: renamed from: c */
    private C0627h f3147c;

    private C0765f(int i) {
        this.f3147c = new C0627h(i);
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return this.f3147c;
    }

    /* JADX INFO: renamed from: a */
    public static C0765f m1792a(Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = C0627h.m1522a(obj).m1525b().intValue();
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (!f3146b.containsKey(numValueOf)) {
            f3146b.put(numValueOf, new C0765f(iIntValue));
        }
        return (C0765f) f3146b.get(numValueOf);
    }

    public final String toString() {
        int iIntValue = this.f3147c.m1525b().intValue();
        return "CRLReason: ".concat(String.valueOf((iIntValue < 0 || iIntValue > 10) ? "invalid" : f3145a[iIntValue]));
    }
}
