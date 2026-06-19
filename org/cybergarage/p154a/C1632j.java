package org.cybergarage.p154a;

import java.net.Socket;
import org.cybergarage.p173e.C1744a;

/* JADX INFO: renamed from: org.cybergarage.a.j */
/* JADX INFO: compiled from: HTTPServerThread.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1632j extends Thread {

    /* JADX INFO: renamed from: a */
    private RunnableC1630h f6350a;

    /* JADX INFO: renamed from: b */
    private Socket f6351b;

    public C1632j(RunnableC1630h runnableC1630h, Socket socket) {
        super("Cyber.HTTPServerThread");
        this.f6350a = runnableC1630h;
        this.f6351b = socket;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C1633k c1633k = new C1633k(this.f6351b);
        if (c1633k.m4694c()) {
            C1627e c1627e = new C1627e();
            c1627e.m4654b(c1633k);
            while (c1627e.m4645D()) {
                C1744a.m5120b("[HTTPServerThread.java] Receive HTTP request, content :\n" + c1627e.toString());
                this.f6350a.m4679a(c1627e);
                if (!c1627e.m4644C()) {
                    break;
                }
            }
            c1633k.m4695d();
        }
    }
}
