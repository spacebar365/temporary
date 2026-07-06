package org.cybergarage.d.d;

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

/* JADX INFO: compiled from: HTTPMUSocket.java */
/* JADX INFO: loaded from: classes.dex */
public class a {
    private InetSocketAddress a = null;
    private MulticastSocket b = null;
    private NetworkInterface c = null;

    protected void finalize() {
        g();
    }

    public final String a() {
        if (this.a == null || this.c == null) {
            return "";
        }
        InetAddress address = this.a.getAddress();
        Enumeration<InetAddress> inetAddresses = this.c.getInetAddresses();
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

    public final int b() {
        return this.a.getPort();
    }

    public final int c() {
        return this.b.getLocalPort();
    }

    public final MulticastSocket d() {
        return this.b;
    }

    public final InetAddress e() {
        return this.a.getAddress();
    }

    private boolean a(String str, InetAddress inetAddress) {
        try {
            this.b = new MulticastSocket((SocketAddress) null);
            this.b.setReuseAddress(true);
            this.b.bind(new InetSocketAddress(1900));
            this.a = new InetSocketAddress(InetAddress.getByName(str), 1900);
            this.c = NetworkInterface.getByInetAddress(inetAddress);
            this.b.joinGroup(this.a, this.c);
            return true;
        } catch (Exception e) {
            org.cybergarage.e.a.a(e);
            return false;
        }
    }

    public final boolean a(String str, String str2) {
        try {
            return a(str, InetAddress.getByName(str2));
        } catch (Exception e) {
            org.cybergarage.e.a.a(e);
            return false;
        }
    }

    public final boolean g() {
        if (this.b == null) {
            return true;
        }
        try {
            this.b.leaveGroup(this.a, this.c);
            this.b.close();
            this.b = null;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public final boolean a(String str) {
        org.cybergarage.e.a.b("[HTTPMUSocket.java] The device sends multicast 'device notification message' Send() address and port is " + ((String) null) + ":-1, msg:\n" + str);
        try {
            MulticastSocket multicastSocket = new MulticastSocket();
            DatagramPacket datagramPacket = new DatagramPacket(str.getBytes(), str.length(), this.a);
            multicastSocket.setTimeToLive(org.cybergarage.d.n.f());
            multicastSocket.send(datagramPacket);
            multicastSocket.close();
            return true;
        } catch (Exception e) {
            org.cybergarage.e.a.a(e);
            return false;
        }
    }

    public final g h() throws IOException {
        g gVar = new g(new byte[1024]);
        gVar.a(a());
        if (this.b != null) {
            this.b.receive(gVar.a());
            gVar.a(System.currentTimeMillis());
            return gVar;
        }
        throw new IOException("Multicast socket has already been closed.");
    }

    public final String f() {
        return this.a.getAddress().getHostAddress();
    }
}
