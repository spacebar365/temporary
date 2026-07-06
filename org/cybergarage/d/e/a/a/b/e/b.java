package org.cybergarage.d.e.a.a.b.e;

import org.cybergarage.d.e.a.a.b.m;

/* JADX INFO: compiled from: DCTitleSortCap.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements m {
    @Override // org.cybergarage.d.e.a.a.b.m
    public final String a() {
        return "dc:title";
    }

    @Override // org.cybergarage.d.e.a.a.b.m
    public final int a(org.cybergarage.d.e.a.a.b.a aVar, org.cybergarage.d.e.a.a.b.a aVar2) {
        if (aVar == null || aVar2 == null) {
            return 0;
        }
        String strD = aVar.d();
        String strD2 = aVar2.d();
        if (strD == null || strD2 == null) {
            return 0;
        }
        return strD.compareTo(strD2);
    }
}
