package org.bouncycastle.p054a.p080y.p081a;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p080y.C0750a;
import org.bouncycastle.p054a.p080y.C0755b;
import org.bouncycastle.p054a.p080y.C0756c;
import org.bouncycastle.p054a.p080y.InterfaceC0757d;

/* JADX INFO: renamed from: org.bouncycastle.a.y.a.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0751a implements InterfaceC0757d {
    /* JADX INFO: renamed from: a */
    private static int m1757a(InterfaceC0618f interfaceC0618f) {
        return C0753c.m1762a(C0753c.m1763a(interfaceC0618f)).hashCode();
    }

    /* JADX INFO: renamed from: a */
    public static Hashtable m1758a(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            hashtable2.put(objNextElement, hashtable.get(objNextElement));
        }
        return hashtable2;
    }

    @Override // org.bouncycastle.p054a.p080y.InterfaceC0757d
    /* JADX INFO: renamed from: a */
    public final int mo1759a(C0756c c0756c) {
        C0755b[] c0755bArrM1777a = c0756c.m1777a();
        int iHashCode = 0;
        for (int i = 0; i != c0755bArrM1777a.length; i++) {
            if (c0755bArrM1777a[i].m1771a()) {
                C0750a[] c0750aArrM1773c = c0755bArrM1777a[i].m1773c();
                int iM1757a = iHashCode;
                for (int i2 = 0; i2 != c0750aArrM1773c.length; i2++) {
                    iM1757a = m1757a(c0750aArrM1773c[i2].m1756b()) ^ (c0750aArrM1773c[i2].m1755a().hashCode() ^ iM1757a);
                }
                iHashCode = iM1757a;
            } else {
                iHashCode = (iHashCode ^ c0755bArrM1777a[i].m1772b().m1755a().hashCode()) ^ m1757a(c0755bArrM1777a[i].m1772b().m1756b());
            }
        }
        return iHashCode;
    }

    @Override // org.bouncycastle.p054a.p080y.InterfaceC0757d
    /* JADX INFO: renamed from: a */
    public final boolean mo1760a(C0756c c0756c, C0756c c0756c2) {
        boolean z;
        C0755b[] c0755bArrM1777a = c0756c.m1777a();
        C0755b[] c0755bArrM1777a2 = c0756c2.m1777a();
        if (c0755bArrM1777a.length != c0755bArrM1777a2.length) {
            return false;
        }
        boolean z2 = (c0755bArrM1777a[0].m1772b() == null || c0755bArrM1777a2[0].m1772b() == null || c0755bArrM1777a[0].m1772b().m1755a().equals(c0755bArrM1777a2[0].m1772b().m1755a())) ? false : true;
        for (int i = 0; i != c0755bArrM1777a.length; i++) {
            C0755b c0755b = c0755bArrM1777a[i];
            if (z2) {
                for (int length = c0755bArrM1777a2.length - 1; length >= 0; length--) {
                    if (c0755bArrM1777a2[length] != null && C0753c.m1768a(c0755b, c0755bArrM1777a2[length])) {
                        c0755bArrM1777a2[length] = null;
                        z = true;
                        break;
                    }
                }
                z = false;
            } else {
                for (int i2 = 0; i2 != c0755bArrM1777a2.length; i2++) {
                    if (c0755bArrM1777a2[i2] != null && C0753c.m1768a(c0755b, c0755bArrM1777a2[i2])) {
                        c0755bArrM1777a2[i2] = null;
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
