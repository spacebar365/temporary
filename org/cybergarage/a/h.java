package org.cybergarage.a;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/* JADX INFO: compiled from: HTTPServer.java */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {
    private ServerSocket b;
    private InetAddress c = null;
    private int d = 0;
    protected int a = 80000;
    private org.cybergarage.e.b e = new org.cybergarage.e.b();
    private Thread f = null;

    public static String a() {
        return String.valueOf(System.getProperty("os.name")) + "/" + System.getProperty("os.version") + " CyberHTTP/1.0";
    }

    public h() {
        this.b = null;
        this.b = null;
    }

    private synchronized int e() {
        return this.a;
    }

    public final boolean a(String str, int i) {
        if (this.b != null) {
            return true;
        }
        try {
            this.c = InetAddress.getByName(str);
            this.d = i;
            this.b = new ServerSocket(this.d, 0, this.c);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public final boolean b() {
        if (this.b == null) {
            return true;
        }
        try {
            this.b.close();
            this.b = null;
            this.c = null;
            this.d = 0;
            return true;
        } catch (Exception e) {
            org.cybergarage.e.a.a(e);
            return false;
        }
    }

    private Socket f() {
        if (this.b == null) {
            return null;
        }
        try {
            Socket socketAccept = this.b.accept();
            socketAccept.setSoTimeout(e());
            return socketAccept;
        } catch (Exception e) {
            return null;
        }
    }

    public final void a(f fVar) {
        this.e.add(fVar);
    }

    public final void a(e eVar) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            ((f) this.e.get(i)).a(eVar);
        }
    }

    public final boolean c() {
        StringBuffer stringBuffer = new StringBuffer("Cyber.HTTPServer/");
        stringBuffer.append(this.b.getLocalSocketAddress());
        this.f = new Thread(this, stringBuffer.toString());
        this.f.start();
        return true;
    }

    public final boolean d() {
        this.f = null;
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != null) {
            Thread threadCurrentThread = Thread.currentThread();
            while (this.f == threadCurrentThread) {
                Thread.yield();
                try {
                    org.cybergarage.e.a.b("[HTTPServer.java] Listen for HTTP requests‚ ServerSocket accept ..." + this.b.getLocalSocketAddress());
                    Socket socketF = f();
                    if (socketF != null) {
                        org.cybergarage.e.a.b("[HTTPServer.java] Receive the HTTP request, a remote request address: " + socketF.getRemoteSocketAddress() + ", create a sub-thread dedicated to process the request, create a httpServerThread...");
                    }
                    new j(this, socketF).start();
                } catch (Exception e) {
                    org.cybergarage.e.a.a(e);
                    return;
                }
            }
        }
    }
}
