package org.cybergarage.d.a;

/* JADX INFO: compiled from: ActionRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d {
    public b() {
    }

    public b(org.cybergarage.a.e eVar) {
        a(eVar);
    }

    private org.cybergarage.xml.c M() {
        org.cybergarage.xml.c cVarJ = J();
        if (cVarJ != null && cVarJ.m()) {
            return cVarJ.c(0);
        }
        return null;
    }

    public final String K() {
        String strH;
        int iIndexOf;
        org.cybergarage.xml.c cVarM = M();
        if (cVarM == null || (strH = cVarM.h()) == null || (iIndexOf = strH.indexOf(":") + 1) < 0) {
            return "";
        }
        return strH.substring(iIndexOf, strH.length());
    }

    public final org.cybergarage.d.d L() {
        org.cybergarage.xml.c cVarM = M();
        int iK = cVarM.k();
        org.cybergarage.d.d dVar = new org.cybergarage.d.d();
        for (int i = 0; i < iK; i++) {
            org.cybergarage.d.c cVar = new org.cybergarage.d.c();
            org.cybergarage.xml.c cVarC = cVarM.c(i);
            cVar.a(cVarC.h());
            cVar.b(cVarC.i());
            dVar.add(cVar);
        }
        return dVar;
    }
}
