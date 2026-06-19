package org.cybergarage.p157d.p161d;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketAddress;
import java.util.Enumeration;
import org.cybergarage.p157d.C1742n;
import org.cybergarage.p173e.C1744a;

/* JADX INFO: renamed from: org.cybergarage.d.d.a */
/* JADX INFO: compiled from: HTTPMUSocket.java */
/* JADX INFO: loaded from: classes.dex */
public class C1670a {

    /* JADX INFO: renamed from: a */
    private InetSocketAddress f6391a = null;

    /* JADX INFO: renamed from: b */
    private MulticastSocket f6392b = null;

    /* JADX INFO: renamed from: c */
    private NetworkInterface f6393c = null;

    protected void finalize() {
        m4802g();
    }

    /* JADX INFO: renamed from: a */
    public final String m4794a() {
        if (this.f6391a == null || this.f6393c == null) {
            return "";
        }
        InetAddress address = this.f6391a.getAddress();
        Enumeration<InetAddress> inetAddresses = this.f6393c.getInetAddresses();
        while (inetAddresses.hasMoreElements()) {
            InetAddress inetAddressNextElement = inetAddresses.nextElement();
            if ((address instanceof Inet6Address) && (inetAddressNextElement instanceof Inet6Address)) {
                return inetAddressNextElement.getHostAddress();
            }
            if ((address instanceof Inet4Address) && (inetAddressNextElement instanceof Inet4Address)) {
                return inetAddressNextElement.getHostAddress();
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    public final int m4797b() {
        return this.f6391a.getPort();
    }

    /* JADX INFO: renamed from: c */
    public final int m4798c() {
        return this.f6392b.getLocalPort();
    }

    /* JADX INFO: renamed from: d */
    public final MulticastSocket m4799d() {
        return this.f6392b;
    }

    /* JADX INFO: renamed from: e */
    public final InetAddress m4800e() {
        return this.f6391a.getAddress();
    }

    /* JADX INFO: renamed from: a */
    private boolean m4793a(String str, InetAddress inetAddress) {
        try {
            this.f6392b = new MulticastSocket((SocketAddress) null);
            this.f6392b.setReuseAddress(true);
            this.f6392b.bind(new InetSocketAddress(1900));
            this.f6391a = new InetSocketAddress(InetAddress.getByName(str), 1900);
            this.f6393c = NetworkInterface.getByInetAddress(inetAddress);
            this.f6392b.joinGroup(this.f6391a, this.f6393c);
            return true;
        } catch (Exception e) {
            C1744a.m5117a(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4796a(String str, String str2) {
        try {
            return m4793a(str, InetAddress.getByName(str2));
        } catch (Exception e) {
            C1744a.m5117a(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m4802g() {
        if (this.f6392b == null) {
            return true;
        }
        try {
            this.f6392b.leaveGroup(this.f6391a, this.f6393c);
            this.f6392b.close();
            this.f6392b = null;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4795a(String str) {
        C1744a.m5120b("[HTTPMUSocket.java] The device sends multicast 'device notification message' Send() address and port is " + ((String) null) + ":-1, msg:\n" + str);
        try {
            MulticastSocket multicastSocket = new MulticastSocket();
            DatagramPacket datagramPacket = new DatagramPacket(str.getBytes(), str.length(), this.f6391a);
            multicastSocket.setTimeToLive(C1742n.m5108f());
            multicastSocket.send(datagramPacket);
            multicastSocket.close();
            return true;
        } catch (Exception e) {
            C1744a.m5117a(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public final C1676g m4803h() throws IOException {
        C1676g c1676g = new C1676g(new byte[1024]);
        c1676g.m4817a(m4794a());
        if (this.f6392b != null) {
            this.f6392b.receive(c1676g.m4815a());
            c1676g.m4816a(System.currentTimeMillis());
            return c1676g;
        }
        throw new IOException("Multicast socket has already been closed.");
    }

    /* JADX INFO: renamed from: f */
    public final String m4801f() {
        return this.f6391a.getAddress().getHostAddress();
    }
}
