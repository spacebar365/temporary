package org.a.a.a.a;

import java.net.InetAddress;

/* JADX INFO: compiled from: FTPClient.java */
/* JADX INFO: loaded from: classes.dex */
public class c$b implements c$a {
    private c a;

    public c$b(c cVar) {
        this.a = cVar;
    }

    @Override // org.a.a.a.a.c$a
    public final String a(String str) {
        if (InetAddress.getByName(str).isSiteLocalAddress()) {
            InetAddress inetAddressF = this.a.f();
            if (!inetAddressF.isSiteLocalAddress()) {
                return inetAddressF.getHostAddress();
            }
            return str;
        }
        return str;
    }
}
