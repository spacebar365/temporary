package org.cybergarage.d.e.a.a.b.d;

import org.cybergarage.d.e.a.a.b.i;
import org.cybergarage.d.e.a.a.b.k;

/* JADX INFO: compiled from: IdSearchCap.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements i {
    @Override // org.cybergarage.d.e.a.a.b.i
    public final String a() {
        return "@id";
    }

    @Override // org.cybergarage.d.e.a.a.b.i
    public final boolean a(k kVar, org.cybergarage.d.e.a.a.b.a aVar) {
        String strI = kVar.i();
        String strJ = aVar.j("id");
        return strI != null && strJ != null && kVar.b() && strI.compareTo(strJ) == 0;
    }
}
