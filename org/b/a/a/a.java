package org.b.a.a;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: compiled from: ClientHandler.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {
    private final d a;
    private final InputStream b;
    private final Socket c;

    public a(d dVar, InputStream inputStream, Socket socket) {
        this.a = dVar;
        this.b = inputStream;
        this.c = socket;
    }

    public final void a() {
        d.a(this.b);
        d.a(this.c);
    }

    @Override // java.lang.Runnable
    public final void run() {
        OutputStream outputStream = null;
        try {
            outputStream = this.c.getOutputStream();
            b bVar = new b(this.a, this.a.b().a(), this.b, outputStream, this.c.getInetAddress());
            while (!this.c.isClosed()) {
                bVar.a();
            }
        } catch (Exception e) {
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                d.d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
            }
        } finally {
            d.a(outputStream);
            d.a(this.b);
            d.a(this.c);
            this.a.h.a(this);
        }
    }
}
