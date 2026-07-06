package org.cybergarage.e;

/* JADX INFO: compiled from: ThreadCore.java */
/* JADX INFO: loaded from: classes.dex */
public class e implements Runnable {
    private Thread a = null;

    public final Thread e() {
        return this.a;
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public final boolean g() {
        return Thread.currentThread() == this.a;
    }

    public final void f() {
        if (this.a == null) {
            Thread thread = new Thread(this, "Cyber.ThreadCore");
            this.a = thread;
            thread.start();
        }
    }

    public final void h() {
        Thread thread = this.a;
        if (thread != null) {
            thread.interrupt();
            this.a = null;
        }
    }
}
