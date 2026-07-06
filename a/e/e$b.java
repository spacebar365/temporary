package a.e;

import a.p;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: NameServiceClientImpl.java */
/* JADX INFO: loaded from: classes.dex */
class e$b extends Thread {
    private e$c a;
    private String b;
    private String c;
    private int d;
    private p e;
    private InetAddress f;
    private UnknownHostException g;
    private a.c h;

    e$b(e$c e_c, String str, int i, InetAddress inetAddress, a.c cVar) {
        super("JCIFS-QueryThread: ".concat(String.valueOf(str)));
        this.e = null;
        this.a = e_c;
        this.b = str;
        this.d = i;
        this.c = null;
        this.f = inetAddress;
        this.h = cVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            try {
                try {
                    this.e = this.h.b().a(this.b, this.d, this.c, this.f);
                    synchronized (this.a) {
                        e$c e_c = this.a;
                        e_c.a--;
                        this.a.notify();
                    }
                } catch (Exception e) {
                    this.g = new UnknownHostException(e.getMessage());
                    synchronized (this.a) {
                        e$c e_c2 = this.a;
                        e_c2.a--;
                        this.a.notify();
                    }
                }
            } catch (UnknownHostException e2) {
                this.g = e2;
                synchronized (this.a) {
                    e$c e_c3 = this.a;
                    e_c3.a--;
                    this.a.notify();
                }
            }
        } catch (Throwable th) {
            synchronized (this.a) {
                e$c e_c4 = this.a;
                e_c4.a--;
                this.a.notify();
                throw th;
            }
        }
    }

    public final p a() {
        return this.e;
    }

    public final UnknownHostException b() {
        return this.g;
    }
}
