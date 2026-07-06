package org.cybergarage.d.d;

import java.io.IOException;

/* JADX INFO: compiled from: SSDPSearchSocket.java */
/* JADX INFO: loaded from: classes.dex */
public final class m extends a implements Runnable {
    private boolean a;
    private org.cybergarage.e.b b = new org.cybergarage.e.b();
    private Thread c = null;

    public m(String str, String str2) {
        if (org.cybergarage.b.a.c(str) && org.cybergarage.b.a.c(str2)) {
            this.a = true;
        } else if (org.cybergarage.b.a.d(str) && org.cybergarage.b.a.d(str2)) {
            this.a = false;
        } else {
            throw new IllegalArgumentException("Cannot open a UDP Socket for IPv6 address on IPv4 interface or viceversa");
        }
        a(str2, str);
    }

    public final void a(org.cybergarage.d.b.g gVar) {
        this.b.add(gVar);
    }

    private void a(g gVar) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((org.cybergarage.d.b.g) this.b.get(i)).b(gVar);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        while (this.c == threadCurrentThread) {
            Thread.yield();
            try {
                org.cybergarage.e.a.b("[SSDPSearchSocket.java] Clogging monitor the multicast address of the message (receive only 'device found message', the rest is ignored) MulticastSocket receive ...");
                g gVarH = h();
                if (gVarH.j()) {
                    org.cybergarage.e.a.b("[SSDPSearchSocket.java] Listening to the 'device found message' SSDPPacket:\n" + gVarH.toString());
                    a(gVarH);
                }
            } catch (IOException e) {
                return;
            }
        }
    }

    public final void i() {
        StringBuffer stringBuffer = new StringBuffer("Cyber.SSDPSearchSocket/");
        String strA = a();
        if (strA != null && strA.length() > 0) {
            stringBuffer.append(a()).append(':');
            stringBuffer.append(c()).append(" -> ");
            stringBuffer.append(f()).append(':');
            stringBuffer.append(b());
        }
        this.c = new Thread(this, stringBuffer.toString());
        this.c.start();
    }

    public final void j() {
        g();
        this.c = null;
    }
}
