package com.p033al.dlnaserver.customs;

import java.util.Comparator;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.p169c.C1703a;
import org.cybergarage.xml.C1750a;

/* JADX INFO: renamed from: com.al.dlnaserver.customs.b */
/* JADX INFO: compiled from: CustomItemNodeListSorter.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0379b implements Comparator<C1703a> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(C1703a c1703a, C1703a c1703a2) {
        return m1078a(c1703a, c1703a2);
    }

    /* JADX INFO: renamed from: a */
    private static int m1078a(C1703a c1703a, C1703a c1703a2) {
        C1750a c1750aI = c1703a.m5156i("rawDate");
        C1750a c1750aI2 = c1703a2.m5156i("rawDate");
        if (c1750aI != null && c1750aI2 != null) {
            try {
                return Long.valueOf(c1750aI2.m5134b()).compareTo(Long.valueOf(c1750aI.m5134b()));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}
