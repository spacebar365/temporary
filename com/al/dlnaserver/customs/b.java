package com.al.dlnaserver.customs;

import java.util.Comparator;

/* JADX INFO: compiled from: CustomItemNodeListSorter.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparator<org.cybergarage.d.e.a.a.b.c.a> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(org.cybergarage.d.e.a.a.b.c.a aVar, org.cybergarage.d.e.a.a.b.c.a aVar2) {
        return a(aVar, aVar2);
    }

    private static int a(org.cybergarage.d.e.a.a.b.c.a aVar, org.cybergarage.d.e.a.a.b.c.a aVar2) {
        org.cybergarage.xml.a aVarI = aVar.i("rawDate");
        org.cybergarage.xml.a aVarI2 = aVar2.i("rawDate");
        if (aVarI != null && aVarI2 != null) {
            try {
                return Long.valueOf(aVarI2.b()).compareTo(Long.valueOf(aVarI.b()));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}
