package org.cybergarage.d.e.a.a.b.e;

import org.cybergarage.d.e.a.a.b.m;

/* JADX INFO: compiled from: DCDateSortCap.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m {
    @Override // org.cybergarage.d.e.a.a.b.m
    public final String a() {
        return "dc:date";
    }

    @Override // org.cybergarage.d.e.a.a.b.m
    public final int a(org.cybergarage.d.e.a.a.b.a aVar, org.cybergarage.d.e.a.a.b.a aVar2) {
        if (aVar == null || aVar2 == null || !(aVar instanceof org.cybergarage.d.e.a.a.b.c.a) || !(aVar2 instanceof org.cybergarage.d.e.a.a.b.c.a)) {
            return 0;
        }
        long jA = ((org.cybergarage.d.e.a.a.b.c.a) aVar).a();
        long jA2 = ((org.cybergarage.d.e.a.a.b.c.a) aVar2).a();
        if (jA != jA2) {
            return jA < jA2 ? -1 : 1;
        }
        return 0;
    }
}
