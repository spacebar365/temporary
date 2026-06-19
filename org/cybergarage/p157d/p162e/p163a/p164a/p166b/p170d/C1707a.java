package org.cybergarage.p157d.p162e.p163a.p164a.p166b.p170d;

import org.cybergarage.p157d.p162e.p163a.p164a.p166b.AbstractC1689a;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.C1718k;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.InterfaceC1716i;

/* JADX INFO: renamed from: org.cybergarage.d.e.a.a.b.d.a */
/* JADX INFO: compiled from: IdSearchCap.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1707a implements InterfaceC1716i {
    @Override // org.cybergarage.p157d.p162e.p163a.p164a.p166b.InterfaceC1716i
    /* JADX INFO: renamed from: a */
    public final String mo4898a() {
        return "@id";
    }

    @Override // org.cybergarage.p157d.p162e.p163a.p164a.p166b.InterfaceC1716i
    /* JADX INFO: renamed from: a */
    public final boolean mo4899a(C1718k c1718k, AbstractC1689a abstractC1689a) {
        String strM4919i = c1718k.m4919i();
        String strJ = abstractC1689a.m5158j("id");
        return strM4919i != null && strJ != null && c1718k.m4910b() && strM4919i.compareTo(strJ) == 0;
    }
}
