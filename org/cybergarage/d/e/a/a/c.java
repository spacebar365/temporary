package org.cybergarage.d.e.a.a;

/* JADX INFO: compiled from: ConnectionManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements org.cybergarage.d.a.a, org.cybergarage.d.a.f {
    private g a;
    private org.cybergarage.e.c b = new org.cybergarage.e.c();
    private b d = new b();
    private int c = 0;

    public c(g gVar) {
        this.a = gVar;
    }

    private a a(int i) {
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVarA = this.d.a(i2);
            if (aVarA.a() == i) {
                return aVarA;
            }
        }
        return null;
    }

    @Override // org.cybergarage.d.a.a
    public final boolean a(org.cybergarage.d.a aVar) {
        String strA = aVar.a();
        if (strA.equals("GetProtocolInfo")) {
            String str = "";
            int iC = this.a.s().c();
            for (int i = 0; i < iC; i++) {
                if (i > 0) {
                    str = String.valueOf(str) + ",";
                }
                String strA2 = this.a.s().a(i).a();
                str = String.valueOf(str) + "http-get:*:" + strA2 + (strA2.contains(":") ? "" : ":*");
            }
            aVar.a("Source").b(str);
            aVar.a("Sink").b("");
            return true;
        }
        if (strA.equals("PrepareForConnection")) {
            aVar.a("ConnectionID").a(-1);
            aVar.a("AVTransportID").a(-1);
            aVar.a("RcsID").a(-1);
            return true;
        }
        if (strA.equals("ConnectionComplete")) {
            return true;
        }
        if (!strA.equals("GetCurrentConnectionInfo")) {
            if (strA.equals("GetCurrentConnectionIDs")) {
                return b(aVar);
            }
            return false;
        }
        int iF = aVar.a("RcsID").f();
        this.b.a();
        a aVarA = a(iF);
        if (aVarA != null) {
            aVar.a("RcsID").a(aVarA.b());
            aVar.a("AVTransportID").a(aVarA.c());
            aVar.a("PeerConnectionManager").b(aVarA.d());
            aVar.a("PeerConnectionID").a(aVarA.e());
            aVar.a("Direction").b(aVarA.f());
            aVar.a("Status").b(aVarA.g());
        } else {
            aVar.a("RcsID").a(-1);
            aVar.a("AVTransportID").a(-1);
            aVar.a("PeerConnectionManager").b("");
            aVar.a("PeerConnectionID").a(-1);
            aVar.a("Direction").b("Output");
            aVar.a("Status").b("Unknown");
        }
        this.b.b();
        return true;
    }

    private boolean b(org.cybergarage.d.a aVar) {
        String str = "";
        this.b.a();
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            a aVarA = this.d.a(i);
            if (i > 0) {
                str = String.valueOf(str) + ",";
            }
            str = String.valueOf(str) + Integer.toString(aVarA.a());
        }
        aVar.a("ConnectionIDs").b(str);
        this.b.b();
        return true;
    }
}
