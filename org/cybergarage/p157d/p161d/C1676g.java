package org.cybergarage.p157d.p161d;

import java.net.DatagramPacket;
import org.cybergarage.p154a.C1625c;
import org.cybergarage.p157d.p159b.C1655d;
import org.cybergarage.p157d.p159b.C1657f;

/* JADX INFO: renamed from: org.cybergarage.d.d.g */
/* JADX INFO: compiled from: SSDPPacket.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1676g {

    /* JADX INFO: renamed from: b */
    private DatagramPacket f6401b;

    /* JADX INFO: renamed from: d */
    private long f6403d;

    /* JADX INFO: renamed from: c */
    private String f6402c = "";

    /* JADX INFO: renamed from: a */
    public byte[] f6400a = null;

    public C1676g(byte[] bArr) {
        this.f6401b = null;
        this.f6401b = new DatagramPacket(bArr, 1024);
    }

    /* JADX INFO: renamed from: a */
    public final DatagramPacket m4815a() {
        return this.f6401b;
    }

    /* JADX INFO: renamed from: a */
    public final void m4817a(String str) {
        this.f6402c = str;
    }

    /* JADX INFO: renamed from: b */
    public final String m4818b() {
        return this.f6402c;
    }

    /* JADX INFO: renamed from: a */
    public final void m4816a(long j) {
        this.f6403d = j;
    }

    /* JADX INFO: renamed from: c */
    public final long m4819c() {
        return this.f6403d;
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m4820d() {
        if (this.f6400a != null) {
            return this.f6400a;
        }
        DatagramPacket datagramPacket = this.f6401b;
        this.f6400a = new String(datagramPacket.getData(), 0, datagramPacket.getLength()).getBytes();
        return this.f6400a;
    }

    /* JADX INFO: renamed from: e */
    public final String m4821e() {
        return C1625c.m4586a(m4820d(), "Location");
    }

    /* JADX INFO: renamed from: f */
    public final String m4822f() {
        return C1625c.m4586a(m4820d(), "ST");
    }

    /* JADX INFO: renamed from: g */
    public final String m4823g() {
        return C1625c.m4586a(m4820d(), "NTS");
    }

    /* JADX INFO: renamed from: h */
    public final String m4824h() {
        return C1625c.m4586a(m4820d(), "USN");
    }

    /* JADX INFO: renamed from: k */
    public final boolean m4827k() {
        return C1655d.m4741a(m4823g());
    }

    public final String toString() {
        return new String(m4820d());
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4825i() {
        String strM4586a = C1625c.m4586a(m4820d(), "NT");
        if ((strM4586a == null ? false : strM4586a.startsWith("upnp:rootdevice")) || C1657f.m4743b(m4822f())) {
            return true;
        }
        String strM4824h = m4824h();
        if (strM4824h == null) {
            return false;
        }
        return strM4824h.endsWith("upnp:rootdevice");
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4826j() {
        String strM4586a = C1625c.m4586a(m4820d(), "MAN");
        if (strM4586a == null) {
            return false;
        }
        if (strM4586a.equals("ssdp:discover")) {
            return true;
        }
        return strM4586a.equals("\"ssdp:discover\"");
    }
}
