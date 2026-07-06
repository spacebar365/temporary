package org.cybergarage.d.d;

import java.net.DatagramPacket;

/* JADX INFO: compiled from: SSDPPacket.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    private DatagramPacket b;
    private long d;
    private String c = "";
    public byte[] a = null;

    public g(byte[] bArr) {
        this.b = null;
        this.b = new DatagramPacket(bArr, 1024);
    }

    public final DatagramPacket a() {
        return this.b;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final String b() {
        return this.c;
    }

    public final void a(long j) {
        this.d = j;
    }

    public final long c() {
        return this.d;
    }

    public final byte[] d() {
        if (this.a != null) {
            return this.a;
        }
        DatagramPacket datagramPacket = this.b;
        this.a = new String(datagramPacket.getData(), 0, datagramPacket.getLength()).getBytes();
        return this.a;
    }

    public final String e() {
        return org.cybergarage.a.c.a(d(), "Location");
    }

    public final String f() {
        return org.cybergarage.a.c.a(d(), "ST");
    }

    public final String g() {
        return org.cybergarage.a.c.a(d(), "NTS");
    }

    public final String h() {
        return org.cybergarage.a.c.a(d(), "USN");
    }

    public final boolean k() {
        return org.cybergarage.d.b.d.a(g());
    }

    public final String toString() {
        return new String(d());
    }

    public final boolean i() {
        String strA = org.cybergarage.a.c.a(d(), "NT");
        if ((strA == null ? false : strA.startsWith("upnp:rootdevice")) || org.cybergarage.d.b.f.b(f())) {
            return true;
        }
        String strH = h();
        if (strH == null) {
            return false;
        }
        return strH.endsWith("upnp:rootdevice");
    }

    public final boolean j() {
        String strA = org.cybergarage.a.c.a(d(), "MAN");
        if (strA == null) {
            return false;
        }
        if (strA.equals("ssdp:discover")) {
            return true;
        }
        return strA.equals("\"ssdp:discover\"");
    }
}
