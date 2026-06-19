package org.cybergarage.p157d.p161d;

import org.cybergarage.p157d.C1684e;
import org.cybergarage.p173e.C1744a;

/* JADX INFO: renamed from: org.cybergarage.d.d.k */
/* JADX INFO: compiled from: SSDPSearchResponseSocket.java */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1680k extends C1671b implements Runnable {

    /* JADX INFO: renamed from: a */
    private C1684e f6404a;

    /* JADX INFO: renamed from: b */
    private Thread f6405b = null;

    public RunnableC1680k() {
        this.f6404a = null;
        this.f6404a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        C1684e c1684e = this.f6404a;
        while (this.f6405b == threadCurrentThread) {
            Thread.yield();
            C1744a.m5120b("[SSDPSearchResponseSocket.java] Clogging monitor a single broadcast message (monitor 'device discovery response message') DatagramSocket receive ..." + m4805a().getLocalAddress() + ":" + m4805a().getLocalPort());
            C1676g c1676gC = m4808c();
            if (c1676gC != null) {
                if (c1684e != null) {
                    C1744a.m5120b("[SSDPSearchResponseSocket.java] Listening to the 'device discovery response message' SearchResponseReceived, SSDPPacket:\n" + c1676gC.toString());
                    c1684e.m4852b(c1676gC);
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4829d() {
        this.f6405b = null;
    }
}
