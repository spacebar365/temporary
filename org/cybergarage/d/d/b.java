package org.cybergarage.d.d;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/* JADX INFO: compiled from: HTTPUSocket.java */
/* JADX INFO: loaded from: classes.dex */
public class b {
    private DatagramSocket a = null;
    private String b = "";

    public final DatagramSocket a() {
        return this.a;
    }

    public b() {
        d();
    }

    protected void finalize() {
        b();
    }

    private boolean d() {
        b();
        try {
            this.a = new DatagramSocket();
            return true;
        } catch (Exception e) {
            org.cybergarage.e.a.a(e);
            return false;
        }
    }

    public final boolean b() {
        if (this.a == null) {
            return true;
        }
        try {
            this.a.close();
            this.a = null;
            return true;
        } catch (Exception e) {
            org.cybergarage.e.a.a(e);
            return false;
        }
    }

    public final boolean a(String str, int i, String str2) {
        try {
            org.cybergarage.e.a.b("[HTTPUSocket.java] Sends a unicast message. Post to host : " + str + ":" + i + ", content:\n" + str2);
            this.a.send(new DatagramPacket(str2.getBytes(), str2.length(), InetAddress.getByName(str), i));
            return true;
        } catch (Exception e) {
            org.cybergarage.e.a.a(e);
            if (this.a != null) {
                org.cybergarage.e.a.c("[HTTPUSocket.java] localAddress = " + this.a.getLocalAddress());
                org.cybergarage.e.a.c("[HTTPUSocket.java] localPort = " + this.a.getLocalPort());
            }
            return false;
        }
    }

    public final g c() {
        String hostAddress;
        g gVar = new g(new byte[1024]);
        if (this.b.length() > 0) {
            hostAddress = this.b;
        } else {
            hostAddress = this.a.getLocalAddress().getHostAddress();
        }
        gVar.a(hostAddress);
        try {
            this.a.receive(gVar.a());
            gVar.a(System.currentTimeMillis());
            return gVar;
        } catch (Exception e) {
            return null;
        }
    }
}
