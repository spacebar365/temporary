package org.cybergarage.d.e.a.a.b.d;

import org.cybergarage.d.e.a.a.b.i;
import org.cybergarage.d.e.a.a.b.k;

/* JADX INFO: compiled from: TitleSearchCap.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements i {
    @Override // org.cybergarage.d.e.a.a.b.i
    public final String a() {
        return "dc:title";
    }

    @Override // org.cybergarage.d.e.a.a.b.i
    public final boolean a(k kVar, org.cybergarage.d.e.a.a.b.a aVar) {
        String strI = kVar.i();
        String strD = aVar.d();
        if (strI == null || strD == null) {
            return false;
        }
        int iCompareTo = strD.compareTo(strI);
        if (iCompareTo == 0 && (kVar.b() || kVar.d() || kVar.f())) {
            return true;
        }
        if (iCompareTo < 0 && kVar.c()) {
            return true;
        }
        if (iCompareTo <= 0 || !kVar.e()) {
            return (strD.indexOf(strI) >= 0 && kVar.g()) || kVar.h();
        }
        return true;
    }
}
