package org.cybergarage.p157d.p161d;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import org.cybergarage.p154a.C1625c;
import org.cybergarage.p155b.C1637a;
import org.cybergarage.p157d.C1684e;
import org.cybergarage.p173e.C1744a;

/* JADX INFO: renamed from: org.cybergarage.d.d.e */
/* JADX INFO: compiled from: SSDPNotifySocket.java */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1674e extends C1670a implements Runnable {

    /* JADX INFO: renamed from: a */
    private boolean f6397a;

    /* JADX INFO: renamed from: b */
    private C1684e f6398b;

    /* JADX INFO: renamed from: c */
    private Thread f6399c = null;

    public RunnableC1674e(String str) {
        this.f6398b = null;
        String strM4809a = "239.255.255.250";
        this.f6397a = false;
        if (C1637a.m4710c(str)) {
            strM4809a = C1672c.m4809a();
            this.f6397a = true;
        }
        m4796a(strM4809a, str);
        this.f6398b = null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4812a(C1673d c1673d) {
        String strM4809a = "239.255.255.250";
        if (this.f6397a) {
            strM4809a = C1672c.m4809a();
        }
        c1673d.m4613b(strM4809a, 1900);
        return m4795a(c1673d.toString());
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        C1684e c1684e = this.f6398b;
        while (this.f6399c == threadCurrentThread) {
            Thread.yield();
            try {
                C1744a.m5120b("[SSDPNotifySocket.java] Clogging monitor the multicast address of the message (the listener 'device notification message') MulticastSocket receive ..." + m4799d().getLocalAddress() + ":" + m4799d().getLocalPort());
                C1676g c1676gH = m4803h();
                InetAddress inetAddressE = m4800e();
                String strSubstring = "127.0.0.1";
                String strM4586a = C1625c.m4586a(c1676gH.m4820d(), "HOST");
                int iLastIndexOf = strM4586a.lastIndexOf(":");
                if (iLastIndexOf >= 0) {
                    strSubstring = strM4586a.substring(0, iLastIndexOf);
                    if (strSubstring.charAt(0) == '[') {
                        strSubstring = strSubstring.substring(1, strSubstring.length());
                    }
                    if (strSubstring.charAt(strSubstring.length() - 1) == ']') {
                        strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                    }
                }
                InetAddress address = new InetSocketAddress(strSubstring, 0).getAddress();
                if (!inetAddressE.equals(address)) {
                    C1744a.m5121c("Invalidate Multicast Received from IP " + inetAddressE + " on " + address);
                } else if (c1684e != null) {
                    C1744a.m5120b("[SSDPNotifySocket.java] Listening to the multicast address sent the message (the listener 'device notification message') NotifyReceived, SSDPPacket:\n" + c1676gH.toString());
                    c1684e.m4850a(c1676gH);
                }
            } catch (IOException e) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4813i() {
        m4802g();
        this.f6399c = null;
    }
}
