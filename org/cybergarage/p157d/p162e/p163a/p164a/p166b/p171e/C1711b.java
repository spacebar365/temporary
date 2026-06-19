package org.cybergarage.p157d.p162e.p163a.p164a.p166b.p171e;

import org.cybergarage.p157d.p162e.p163a.p164a.p166b.AbstractC1689a;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.InterfaceC1720m;

/* JADX INFO: renamed from: org.cybergarage.d.e.a.a.b.e.b */
/* JADX INFO: compiled from: DCTitleSortCap.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1711b implements InterfaceC1720m {
    @Override // org.cybergarage.p157d.p162e.p163a.p164a.p166b.InterfaceC1720m
    /* JADX INFO: renamed from: a */
    public final String mo4904a() {
        return "dc:title";
    }

    @Override // org.cybergarage.p157d.p162e.p163a.p164a.p166b.InterfaceC1720m
    /* JADX INFO: renamed from: a */
    public final int mo4903a(AbstractC1689a abstractC1689a, AbstractC1689a abstractC1689a2) {
        if (abstractC1689a == null || abstractC1689a2 == null) {
            return 0;
        }
        String strM4874d = abstractC1689a.m4874d();
        String strM4874d2 = abstractC1689a2.m4874d();
        if (strM4874d == null || strM4874d2 == null) {
            return 0;
        }
        return strM4874d.compareTo(strM4874d2);
    }
}
