package org.cybergarage.p157d.p162e.p163a.p164a.p166b.p171e;

import org.cybergarage.p157d.p162e.p163a.p164a.p166b.AbstractC1689a;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.InterfaceC1720m;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.p169c.C1703a;

/* JADX INFO: renamed from: org.cybergarage.d.e.a.a.b.e.a */
/* JADX INFO: compiled from: DCDateSortCap.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1710a implements InterfaceC1720m {
    @Override // org.cybergarage.p157d.p162e.p163a.p164a.p166b.InterfaceC1720m
    /* JADX INFO: renamed from: a */
    public final String mo4904a() {
        return "dc:date";
    }

    @Override // org.cybergarage.p157d.p162e.p163a.p164a.p166b.InterfaceC1720m
    /* JADX INFO: renamed from: a */
    public final int mo4903a(AbstractC1689a abstractC1689a, AbstractC1689a abstractC1689a2) {
        if (abstractC1689a == null || abstractC1689a2 == null || !(abstractC1689a instanceof C1703a) || !(abstractC1689a2 instanceof C1703a)) {
            return 0;
        }
        long jM4892a = ((C1703a) abstractC1689a).m4892a();
        long jM4892a2 = ((C1703a) abstractC1689a2).m4892a();
        if (jM4892a != jM4892a2) {
            return jM4892a < jM4892a2 ? -1 : 1;
        }
        return 0;
    }
}
