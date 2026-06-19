package org.p044b.p045a.p046a;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;

/* JADX INFO: renamed from: org.b.a.a.f */
/* JADX INFO: compiled from: ServerRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0492f implements Runnable {

    /* JADX INFO: renamed from: a */
    private AbstractC0486d f1863a;

    /* JADX INFO: renamed from: c */
    private IOException f1865c;

    /* JADX INFO: renamed from: d */
    private boolean f1866d = false;

    /* JADX INFO: renamed from: b */
    private final int f1864b = 5000;

    public RunnableC0492f(AbstractC0486d abstractC0486d) {
        this.f1863a = abstractC0486d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1863a.m1320a().bind(this.f1863a.f1850e != null ? new InetSocketAddress(this.f1863a.f1850e, this.f1863a.f1851f) : new InetSocketAddress(this.f1863a.f1851f));
            this.f1866d = true;
            do {
                try {
                    Socket socketAccept = this.f1863a.m1320a().accept();
                    if (this.f1864b > 0) {
                        socketAccept.setSoTimeout(this.f1864b);
                    }
                    this.f1863a.f1853h.mo1334b(new RunnableC0474a(this.f1863a, socketAccept.getInputStream(), socketAccept));
                } catch (IOException e) {
                    AbstractC0486d.f1849d.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                }
            } while (!this.f1863a.m1320a().isClosed());
        } catch (IOException e2) {
            this.f1865c = e2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final IOException m1330a() {
        return this.f1865c;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1331b() {
        return this.f1866d;
    }
}
