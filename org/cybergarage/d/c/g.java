package org.cybergarage.d.c;

import org.cybergarage.d.j;

/* JADX INFO: compiled from: SubscriptionRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class g extends org.cybergarage.a.e {
    public g() {
        a(0L);
    }

    public g(org.cybergarage.a.e eVar) {
        this();
        a(eVar);
    }

    private void b(j jVar) {
        org.cybergarage.d.f fVarC;
        org.cybergarage.d.f fVarC2;
        String strG = jVar.g();
        a(strG, true);
        String strI = jVar.b().i();
        if ((strI == null || strI.length() <= 0) && (fVarC = jVar.c()) != null) {
            strI = fVarC.i();
        }
        if ((strI == null || strI.length() <= 0) && (fVarC2 = jVar.c()) != null) {
            strI = fVarC2.g();
        }
        if ((strI == null || strI.length() <= 0) && org.cybergarage.a.b.a(strG)) {
            strI = strG;
        }
        String strB = org.cybergarage.a.b.b(strI);
        int iC = org.cybergarage.a.b.c(strI);
        b(strB, iC);
        m(strB);
        b(iC);
    }

    public final void a(j jVar, String str, long j) {
        k("SUBSCRIBE");
        b(jVar);
        if (!str.startsWith("<")) {
            str = String.valueOf("<") + str;
        }
        if (!str.endsWith(">")) {
            str = String.valueOf(str) + ">";
        }
        a("CALLBACK", str);
        a("NT", "upnp:event");
        b(j);
    }

    public final void b(j jVar, String str, long j) {
        k("SUBSCRIBE");
        b(jVar);
        n(str);
        b(j);
    }

    public final void a(j jVar) {
        k("UNSUBSCRIBE");
        b(jVar);
        n(jVar.j());
    }

    public final String I() {
        return a("CALLBACK", "<", ">");
    }

    public final boolean J() {
        String strI = I();
        return strI != null && strI.length() > 0;
    }

    private void n(String str) {
        a("SID", f.b(str));
    }

    public final String K() {
        String strC = f.c(c("SID"));
        if (strC == null) {
            return "";
        }
        return strC;
    }

    public final boolean L() {
        String strK = K();
        return strK != null && strK.length() > 0;
    }

    private void b(long j) {
        a("TIMEOUT", f.a(j));
    }

    public final long M() {
        return f.a(c("TIMEOUT"));
    }

    public final void a(h hVar) {
        super.a((org.cybergarage.a.g) hVar);
    }

    public final h N() {
        return new h(c(y(), z()));
    }
}
