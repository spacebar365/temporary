package org.bouncycastle.a.y.a;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.a.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements org.bouncycastle.a.y.d {
    private static int a(f fVar) {
        return c.a(c.a(fVar)).hashCode();
    }

    public static Hashtable a(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            hashtable2.put(objNextElement, hashtable.get(objNextElement));
        }
        return hashtable2;
    }

    @Override // org.bouncycastle.a.y.d
    public final int a(org.bouncycastle.a.y.c cVar) {
        org.bouncycastle.a.y.b[] bVarArrA = cVar.a();
        int iHashCode = 0;
        for (int i = 0; i != bVarArrA.length; i++) {
            if (bVarArrA[i].a()) {
                org.bouncycastle.a.y.a[] aVarArrC = bVarArrA[i].c();
                int iA = iHashCode;
                for (int i2 = 0; i2 != aVarArrC.length; i2++) {
                    iA = a(aVarArrC[i2].b()) ^ (aVarArrC[i2].a().hashCode() ^ iA);
                }
                iHashCode = iA;
            } else {
                iHashCode = (iHashCode ^ bVarArrA[i].b().a().hashCode()) ^ a(bVarArrA[i].b().b());
            }
        }
        return iHashCode;
    }

    @Override // org.bouncycastle.a.y.d
    public final boolean a(org.bouncycastle.a.y.c cVar, org.bouncycastle.a.y.c cVar2) {
        boolean z;
        org.bouncycastle.a.y.b[] bVarArrA = cVar.a();
        org.bouncycastle.a.y.b[] bVarArrA2 = cVar2.a();
        if (bVarArrA.length != bVarArrA2.length) {
            return false;
        }
        boolean z2 = (bVarArrA[0].b() == null || bVarArrA2[0].b() == null || bVarArrA[0].b().a().equals(bVarArrA2[0].b().a())) ? false : true;
        for (int i = 0; i != bVarArrA.length; i++) {
            org.bouncycastle.a.y.b bVar = bVarArrA[i];
            if (z2) {
                for (int length = bVarArrA2.length - 1; length >= 0; length--) {
                    if (bVarArrA2[length] != null && c.a(bVar, bVarArrA2[length])) {
                        bVarArrA2[length] = null;
                        z = true;
                        break;
                    }
                }
                z = false;
            } else {
                for (int i2 = 0; i2 != bVarArrA2.length; i2++) {
                    if (bVarArrA2[i2] != null && c.a(bVar, bVarArrA2[i2])) {
                        bVarArrA2[i2] = null;
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
