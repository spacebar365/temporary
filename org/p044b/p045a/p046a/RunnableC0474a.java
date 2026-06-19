package org.p044b.p045a.p046a;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: renamed from: org.b.a.a.a */
/* JADX INFO: compiled from: ClientHandler.java */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0474a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final AbstractC0486d f1745a;

    /* JADX INFO: renamed from: b */
    private final InputStream f1746b;

    /* JADX INFO: renamed from: c */
    private final Socket f1747c;

    public RunnableC0474a(AbstractC0486d abstractC0486d, InputStream inputStream, Socket socket) {
        this.f1745a = abstractC0486d;
        this.f1746b = inputStream;
        this.f1747c = socket;
    }

    /* JADX INFO: renamed from: a */
    public final void m1281a() {
        AbstractC0486d.m1318a(this.f1746b);
        AbstractC0486d.m1318a(this.f1747c);
    }

    @Override // java.lang.Runnable
    public final void run() {
        OutputStream outputStream = null;
        try {
            outputStream = this.f1747c.getOutputStream();
            C0478b c0478b = new C0478b(this.f1745a, this.f1745a.m1322b().mo1329a(), this.f1746b, outputStream, this.f1747c.getInetAddress());
            while (!this.f1747c.isClosed()) {
                c0478b.m1291a();
            }
        } catch (Exception e) {
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                AbstractC0486d.f1849d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
            }
        } finally {
            AbstractC0486d.m1318a(outputStream);
            AbstractC0486d.m1318a(this.f1746b);
            AbstractC0486d.m1318a(this.f1747c);
            this.f1745a.f1853h.mo1333a(this);
        }
    }
}
