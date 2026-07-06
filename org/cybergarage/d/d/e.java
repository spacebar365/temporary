package org.cybergarage.d.d;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/* JADX INFO: compiled from: SSDPNotifySocket.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a implements Runnable {
    private boolean a;
    private org.cybergarage.d.e b;
    private Thread c = null;

    public e(String str) {
        this.b = null;
        String strA = "239.255.255.250";
        this.a = false;
        if (org.cybergarage.b.a.c(str)) {
            strA = c.a();
            this.a = true;
        }
        a(strA, str);
        this.b = null;
    }

    public final boolean a(d dVar) {
        String strA = "239.255.255.250";
        if (this.a) {
            strA = c.a();
        }
        dVar.b(strA, 1900);
        return a(dVar.toString());
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        org.cybergarage.d.e eVar = this.b;
        while (this.c == threadCurrentThread) {
            Thread.yield();
            try {
                org.cybergarage.e.a.b("[SSDPNotifySocket.java] Clogging monitor the multicast address of the message (the listener 'device notification message') MulticastSocket receive ..." + d().getLocalAddress() + ":" + d().getLocalPort());
                g gVarH = h();
                InetAddress inetAddressE = e();
                String strSubstring = "127.0.0.1";
                String strA = org.cybergarage.a.c.a(gVarH.d(), "HOST");
                int iLastIndexOf = strA.lastIndexOf(":");
                if (iLastIndexOf >= 0) {
                    strSubstring = strA.substring(0, iLastIndexOf);
                    if (strSubstring.charAt(0) == '[') {
                        strSubstring = strSubstring.substring(1, strSubstring.length());
                    }
                    if (strSubstring.charAt(strSubstring.length() - 1) == ']') {
                        strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                    }
                }
                InetAddress address = new InetSocketAddress(strSubstring, 0).getAddress();
                if (!inetAddressE.equals(address)) {
                    org.cybergarage.e.a.c("Invalidate Multicast Received from IP " + inetAddressE + " on " + address);
                } else if (eVar != null) {
                    org.cybergarage.e.a.b("[SSDPNotifySocket.java] Listening to the multicast address sent the message (the listener 'device notification message') NotifyReceived, SSDPPacket:\n" + gVarH.toString());
                    eVar.a(gVarH);
                }
            } catch (IOException e) {
                return;
            }
        }
    }

    public final void i() {
        g();
        this.c = null;
    }
}
