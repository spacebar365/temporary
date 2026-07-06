package org.cybergarage.a;

import java.net.Socket;

/* JADX INFO: compiled from: HTTPServerThread.java */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Thread {
    private h a;
    private Socket b;

    public j(h hVar, Socket socket) {
        super("Cyber.HTTPServerThread");
        this.a = hVar;
        this.b = socket;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        k kVar = new k(this.b);
        if (kVar.c()) {
            e eVar = new e();
            eVar.b(kVar);
            while (eVar.D()) {
                org.cybergarage.e.a.b("[HTTPServerThread.java] Receive HTTP request, content :\n" + eVar.toString());
                this.a.a(eVar);
                if (!eVar.C()) {
                    break;
                }
            }
            kVar.d();
        }
    }
}
