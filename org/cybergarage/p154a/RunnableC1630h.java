package org.cybergarage.p154a;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import org.cybergarage.p173e.C1744a;
import org.cybergarage.p173e.C1745b;

/* JADX INFO: renamed from: org.cybergarage.a.h */
/* JADX INFO: compiled from: HTTPServer.java */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1630h implements Runnable {

    /* JADX INFO: renamed from: b */
    private ServerSocket f6343b;

    /* JADX INFO: renamed from: c */
    private InetAddress f6344c = null;

    /* JADX INFO: renamed from: d */
    private int f6345d = 0;

    /* JADX INFO: renamed from: a */
    protected int f6342a = 80000;

    /* JADX INFO: renamed from: e */
    private C1745b f6346e = new C1745b();

    /* JADX INFO: renamed from: f */
    private Thread f6347f = null;

    /* JADX INFO: renamed from: a */
    public static String m4676a() {
        return String.valueOf(System.getProperty("os.name")) + "/" + System.getProperty("os.version") + " CyberHTTP/1.0";
    }

    public RunnableC1630h() {
        this.f6343b = null;
        this.f6343b = null;
    }

    /* JADX INFO: renamed from: e */
    private synchronized int m4677e() {
        return this.f6342a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4681a(String str, int i) {
        if (this.f6343b != null) {
            return true;
        }
        try {
            this.f6344c = InetAddress.getByName(str);
            this.f6345d = i;
            this.f6343b = new ServerSocket(this.f6345d, 0, this.f6344c);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4682b() {
        if (this.f6343b == null) {
            return true;
        }
        try {
            this.f6343b.close();
            this.f6343b = null;
            this.f6344c = null;
            this.f6345d = 0;
            return true;
        } catch (Exception e) {
            C1744a.m5117a(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    private Socket m4678f() {
        if (this.f6343b == null) {
            return null;
        }
        try {
            Socket socketAccept = this.f6343b.accept();
            socketAccept.setSoTimeout(m4677e());
            return socketAccept;
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4680a(InterfaceC1628f interfaceC1628f) {
        this.f6346e.add(interfaceC1628f);
    }

    /* JADX INFO: renamed from: a */
    public final void m4679a(C1627e c1627e) {
        int size = this.f6346e.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC1628f) this.f6346e.get(i)).mo4669a(c1627e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4683c() {
        StringBuffer stringBuffer = new StringBuffer("Cyber.HTTPServer/");
        stringBuffer.append(this.f6343b.getLocalSocketAddress());
        this.f6347f = new Thread(this, stringBuffer.toString());
        this.f6347f.start();
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4684d() {
        this.f6347f = null;
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6343b != null) {
            Thread threadCurrentThread = Thread.currentThread();
            while (this.f6347f == threadCurrentThread) {
                Thread.yield();
                try {
                    C1744a.m5120b("[HTTPServer.java] Listen for HTTP requests‚ ServerSocket accept ..." + this.f6343b.getLocalSocketAddress());
                    Socket socketM4678f = m4678f();
                    if (socketM4678f != null) {
                        C1744a.m5120b("[HTTPServer.java] Receive the HTTP request, a remote request address: " + socketM4678f.getRemoteSocketAddress() + ", create a sub-thread dedicated to process the request, create a httpServerThread...");
                    }
                    new C1632j(this, socketM4678f).start();
                } catch (Exception e) {
                    C1744a.m5117a(e);
                    return;
                }
            }
        }
    }
}
