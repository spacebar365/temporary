package org.cybergarage.p157d.p162e.p163a.p164a.p166b.p170d;

import org.cybergarage.p157d.p162e.p163a.p164a.p166b.AbstractC1689a;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.C1718k;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.InterfaceC1716i;

/* JADX INFO: renamed from: org.cybergarage.d.e.a.a.b.d.b */
/* JADX INFO: compiled from: TitleSearchCap.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1708b implements InterfaceC1716i {
    @Override // org.cybergarage.p157d.p162e.p163a.p164a.p166b.InterfaceC1716i
    /* JADX INFO: renamed from: a */
    public final String mo4898a() {
        return "dc:title";
    }

    @Override // org.cybergarage.p157d.p162e.p163a.p164a.p166b.InterfaceC1716i
    /* JADX INFO: renamed from: a */
    public final boolean mo4899a(C1718k c1718k, AbstractC1689a abstractC1689a) {
        String strM4919i = c1718k.m4919i();
        String strM4874d = abstractC1689a.m4874d();
        if (strM4919i == null || strM4874d == null) {
            return false;
        }
        int iCompareTo = strM4874d.compareTo(strM4919i);
        if (iCompareTo == 0 && (c1718k.m4910b() || c1718k.m4914d() || c1718k.m4916f())) {
            return true;
        }
        if (iCompareTo < 0 && c1718k.m4912c()) {
            return true;
        }
        if (iCompareTo <= 0 || !c1718k.m4915e()) {
            return (strM4874d.indexOf(strM4919i) >= 0 && c1718k.m4917g()) || c1718k.m4918h();
        }
        return true;
    }
}
