package org.cybergarage.d.d;

/* JADX INFO: compiled from: SSDPSearchResponseSocket.java */
/* JADX INFO: loaded from: classes.dex */
public final class k extends b implements Runnable {
    private org.cybergarage.d.e a;
    private Thread b = null;

    public k() {
        this.a = null;
        this.a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        org.cybergarage.d.e eVar = this.a;
        while (this.b == threadCurrentThread) {
            Thread.yield();
            org.cybergarage.e.a.b("[SSDPSearchResponseSocket.java] Clogging monitor a single broadcast message (monitor 'device discovery response message') DatagramSocket receive ..." + a().getLocalAddress() + ":" + a().getLocalPort());
            g gVarC = c();
            if (gVarC != null) {
                if (eVar != null) {
                    org.cybergarage.e.a.b("[SSDPSearchResponseSocket.java] Listening to the 'device discovery response message' SearchResponseReceived, SSDPPacket:\n" + gVarC.toString());
                    eVar.b(gVarC);
                }
            } else {
                return;
            }
        }
    }

    public final void d() {
        this.b = null;
    }
}
