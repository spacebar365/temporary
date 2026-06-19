package org.cybergarage.p157d.p162e.p163a.p164a.p166b.p171e;

import org.cybergarage.p157d.p162e.p163a.p164a.p166b.AbstractC1689a;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.InterfaceC1720m;

/* JADX INFO: renamed from: org.cybergarage.d.e.a.a.b.e.c */
/* JADX INFO: compiled from: UPnPClassSortCap.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1712c implements InterfaceC1720m {
    @Override // org.cybergarage.p157d.p162e.p163a.p164a.p166b.InterfaceC1720m
    /* JADX INFO: renamed from: a */
    public final String mo4904a() {
        return "upnp:class";
    }

    @Override // org.cybergarage.p157d.p162e.p163a.p164a.p166b.InterfaceC1720m
    /* JADX INFO: renamed from: a */
    public final int mo4903a(AbstractC1689a abstractC1689a, AbstractC1689a abstractC1689a2) {
        if (abstractC1689a == null || abstractC1689a2 == null) {
            return 0;
        }
        String strM4876e = abstractC1689a.m4876e();
        String strM4876e2 = abstractC1689a2.m4876e();
        if (strM4876e == null || strM4876e2 == null) {
            return 0;
        }
        return strM4876e.compareTo(strM4876e2);
    }
}
