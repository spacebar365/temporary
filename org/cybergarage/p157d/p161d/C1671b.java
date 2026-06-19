package org.cybergarage.p157d.p161d;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import org.cybergarage.p173e.C1744a;

/* JADX INFO: renamed from: org.cybergarage.d.d.b */
/* JADX INFO: compiled from: HTTPUSocket.java */
/* JADX INFO: loaded from: classes.dex */
public class C1671b {

    /* JADX INFO: renamed from: a */
    private DatagramSocket f6394a = null;

    /* JADX INFO: renamed from: b */
    private String f6395b = "";

    /* JADX INFO: renamed from: a */
    public final DatagramSocket m4805a() {
        return this.f6394a;
    }

    public C1671b() {
        m4804d();
    }

    protected void finalize() {
        m4807b();
    }

    /* JADX INFO: renamed from: d */
    private boolean m4804d() {
        m4807b();
        try {
            this.f6394a = new DatagramSocket();
            return true;
        } catch (Exception e) {
            C1744a.m5117a(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4807b() {
        if (this.f6394a == null) {
            return true;
        }
        try {
            this.f6394a.close();
            this.f6394a = null;
            return true;
        } catch (Exception e) {
            C1744a.m5117a(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4806a(String str, int i, String str2) {
        try {
            C1744a.m5120b("[HTTPUSocket.java] Sends a unicast message. Post to host : " + str + ":" + i + ", content:\n" + str2);
            this.f6394a.send(new DatagramPacket(str2.getBytes(), str2.length(), InetAddress.getByName(str), i));
            return true;
        } catch (Exception e) {
            C1744a.m5117a(e);
            if (this.f6394a != null) {
                C1744a.m5121c("[HTTPUSocket.java] localAddress = " + this.f6394a.getLocalAddress());
                C1744a.m5121c("[HTTPUSocket.java] localPort = " + this.f6394a.getLocalPort());
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C1676g m4808c() {
        String hostAddress;
        C1676g c1676g = new C1676g(new byte[1024]);
        if (this.f6395b.length() > 0) {
            hostAddress = this.f6395b;
        } else {
            hostAddress = this.f6394a.getLocalAddress().getHostAddress();
        }
        c1676g.m4817a(hostAddress);
        try {
            this.f6394a.receive(c1676g.m4815a());
            c1676g.m4816a(System.currentTimeMillis());
            return c1676g;
        } catch (Exception e) {
            return null;
        }
    }
}
