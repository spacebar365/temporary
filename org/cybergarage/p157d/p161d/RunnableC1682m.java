package org.cybergarage.p157d.p161d;

import java.io.IOException;
import org.cybergarage.p155b.C1637a;
import org.cybergarage.p157d.p159b.InterfaceC1658g;
import org.cybergarage.p173e.C1744a;
import org.cybergarage.p173e.C1745b;

/* JADX INFO: renamed from: org.cybergarage.d.d.m */
/* JADX INFO: compiled from: SSDPSearchSocket.java */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1682m extends C1670a implements Runnable {

    /* JADX INFO: renamed from: a */
    private boolean f6406a;

    /* JADX INFO: renamed from: b */
    private C1745b f6407b = new C1745b();

    /* JADX INFO: renamed from: c */
    private Thread f6408c = null;

    public RunnableC1682m(String str, String str2) {
        if (C1637a.m4710c(str) && C1637a.m4710c(str2)) {
            this.f6406a = true;
        } else if (C1637a.m4711d(str) && C1637a.m4711d(str2)) {
            this.f6406a = false;
        } else {
            throw new IllegalArgumentException("Cannot open a UDP Socket for IPv6 address on IPv4 interface or viceversa");
        }
        m4796a(str2, str);
    }

    /* JADX INFO: renamed from: a */
    public final void m4832a(InterfaceC1658g interfaceC1658g) {
        this.f6407b.add(interfaceC1658g);
    }

    /* JADX INFO: renamed from: a */
    private void m4831a(C1676g c1676g) {
        int size = this.f6407b.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC1658g) this.f6407b.get(i)).mo4744b(c1676g);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        while (this.f6408c == threadCurrentThread) {
            Thread.yield();
            try {
                C1744a.m5120b("[SSDPSearchSocket.java] Clogging monitor the multicast address of the message (receive only 'device found message', the rest is ignored) MulticastSocket receive ...");
                C1676g c1676gH = m4803h();
                if (c1676gH.m4826j()) {
                    C1744a.m5120b("[SSDPSearchSocket.java] Listening to the 'device found message' SSDPPacket:\n" + c1676gH.toString());
                    m4831a(c1676gH);
                }
            } catch (IOException e) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4833i() {
        StringBuffer stringBuffer = new StringBuffer("Cyber.SSDPSearchSocket/");
        String strA = m4794a();
        if (strA != null && strA.length() > 0) {
            stringBuffer.append(m4794a()).append(':');
            stringBuffer.append(m4798c()).append(" -> ");
            stringBuffer.append(m4801f()).append(':');
            stringBuffer.append(m4797b());
        }
        this.f6408c = new Thread(this, stringBuffer.toString());
        this.f6408c.start();
    }

    /* JADX INFO: renamed from: j */
    public final void m4834j() {
        m4802g();
        this.f6408c = null;
    }
}
