package org.cybergarage.p173e;

/* JADX INFO: renamed from: org.cybergarage.e.e */
/* JADX INFO: compiled from: ThreadCore.java */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC1748e implements Runnable {

    /* JADX INFO: renamed from: a */
    private Thread f6523a = null;

    /* JADX INFO: renamed from: e */
    public final Thread m5127e() {
        return this.f6523a;
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5129g() {
        return Thread.currentThread() == this.f6523a;
    }

    /* JADX INFO: renamed from: f */
    public final void m5128f() {
        if (this.f6523a == null) {
            Thread thread = new Thread(this, "Cyber.ThreadCore");
            this.f6523a = thread;
            thread.start();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5130h() {
        Thread thread = this.f6523a;
        if (thread != null) {
            thread.interrupt();
            this.f6523a = null;
        }
    }
}
