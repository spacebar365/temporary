package org.cybergarage.p157d.p162e.p163a.p164a;

import org.cybergarage.p157d.C1641a;
import org.cybergarage.p157d.p158a.InterfaceC1642a;
import org.cybergarage.p157d.p158a.InterfaceC1647f;
import org.cybergarage.p173e.C1746c;

/* JADX INFO: renamed from: org.cybergarage.d.e.a.a.c */
/* JADX INFO: compiled from: ConnectionManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1723c implements InterfaceC1642a, InterfaceC1647f {

    /* JADX INFO: renamed from: a */
    private C1727g f6451a;

    /* JADX INFO: renamed from: b */
    private C1746c f6452b = new C1746c();

    /* JADX INFO: renamed from: d */
    private C1688b f6454d = new C1688b();

    /* JADX INFO: renamed from: c */
    private int f6453c = 0;

    public C1723c(C1727g c1727g) {
        this.f6451a = c1727g;
    }

    /* JADX INFO: renamed from: a */
    private C1685a m4925a(int i) {
        int size = this.f6454d.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1685a c1685aM4861a = this.f6454d.m4861a(i2);
            if (c1685aM4861a.m4854a() == i) {
                return c1685aM4861a;
            }
        }
        return null;
    }

    @Override // org.cybergarage.p157d.p158a.InterfaceC1642a
    /* JADX INFO: renamed from: a */
    public final boolean mo4734a(C1641a c1641a) {
        String strM4724a = c1641a.m4724a();
        if (strM4724a.equals("GetProtocolInfo")) {
            String str = "";
            int iM4943c = this.f6451a.m4949s().m4943c();
            for (int i = 0; i < iM4943c; i++) {
                if (i > 0) {
                    str = String.valueOf(str) + ",";
                }
                String strMo1158a = this.f6451a.m4949s().m4938a(i).mo1158a();
                str = String.valueOf(str) + "http-get:*:" + strMo1158a + (strMo1158a.contains(":") ? "" : ":*");
            }
            c1641a.m4725a("Source").m4751b(str);
            c1641a.m4725a("Sink").m4751b("");
            return true;
        }
        if (strM4724a.equals("PrepareForConnection")) {
            c1641a.m4725a("ConnectionID").m4748a(-1);
            c1641a.m4725a("AVTransportID").m4748a(-1);
            c1641a.m4725a("RcsID").m4748a(-1);
            return true;
        }
        if (strM4724a.equals("ConnectionComplete")) {
            return true;
        }
        if (!strM4724a.equals("GetCurrentConnectionInfo")) {
            if (strM4724a.equals("GetCurrentConnectionIDs")) {
                return m4926b(c1641a);
            }
            return false;
        }
        int iM4755f = c1641a.m4725a("RcsID").m4755f();
        this.f6452b.m5123a();
        C1685a c1685aM4925a = m4925a(iM4755f);
        if (c1685aM4925a != null) {
            c1641a.m4725a("RcsID").m4748a(c1685aM4925a.m4855b());
            c1641a.m4725a("AVTransportID").m4748a(c1685aM4925a.m4856c());
            c1641a.m4725a("PeerConnectionManager").m4751b(c1685aM4925a.m4857d());
            c1641a.m4725a("PeerConnectionID").m4748a(c1685aM4925a.m4858e());
            c1641a.m4725a("Direction").m4751b(c1685aM4925a.m4859f());
            c1641a.m4725a("Status").m4751b(c1685aM4925a.m4860g());
        } else {
            c1641a.m4725a("RcsID").m4748a(-1);
            c1641a.m4725a("AVTransportID").m4748a(-1);
            c1641a.m4725a("PeerConnectionManager").m4751b("");
            c1641a.m4725a("PeerConnectionID").m4748a(-1);
            c1641a.m4725a("Direction").m4751b("Output");
            c1641a.m4725a("Status").m4751b("Unknown");
        }
        this.f6452b.m5124b();
        return true;
    }

    /* JADX INFO: renamed from: b */
    private boolean m4926b(C1641a c1641a) {
        String str = "";
        this.f6452b.m5123a();
        int size = this.f6454d.size();
        for (int i = 0; i < size; i++) {
            C1685a c1685aM4861a = this.f6454d.m4861a(i);
            if (i > 0) {
                str = String.valueOf(str) + ",";
            }
            str = String.valueOf(str) + Integer.toString(c1685aM4861a.m4854a());
        }
        c1641a.m4725a("ConnectionIDs").m4751b(str);
        this.f6452b.m5124b();
        return true;
    }
}
