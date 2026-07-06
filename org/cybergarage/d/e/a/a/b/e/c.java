package org.cybergarage.d.e.a.a.b.e;

import org.cybergarage.d.e.a.a.b.m;

/* JADX INFO: compiled from: UPnPClassSortCap.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements m {
    @Override // org.cybergarage.d.e.a.a.b.m
    public final String a() {
        return "upnp:class";
    }

    @Override // org.cybergarage.d.e.a.a.b.m
    public final int a(org.cybergarage.d.e.a.a.b.a aVar, org.cybergarage.d.e.a.a.b.a aVar2) {
        if (aVar == null || aVar2 == null) {
            return 0;
        }
        String strE = aVar.e();
        String strE2 = aVar2.e();
        if (strE == null || strE2 == null) {
            return 0;
        }
        return strE.compareTo(strE2);
    }
}
