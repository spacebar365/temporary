package org.b.a.a;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;

/* JADX INFO: compiled from: ServerRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {
    private d a;
    private IOException c;
    private boolean d = false;
    private final int b = 5000;

    public f(d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.a().bind(this.a.e != null ? new InetSocketAddress(this.a.e, this.a.f) : new InetSocketAddress(this.a.f));
            this.d = true;
            do {
                try {
                    Socket socketAccept = this.a.a().accept();
                    if (this.b > 0) {
                        socketAccept.setSoTimeout(this.b);
                    }
                    this.a.h.b(new a(this.a, socketAccept.getInputStream(), socketAccept));
                } catch (IOException e) {
                    d.d.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                }
            } while (!this.a.a().isClosed());
        } catch (IOException e2) {
            this.c = e2;
        }
    }

    public final IOException a() {
        return this.c;
    }

    public final boolean b() {
        return this.d;
    }
}
