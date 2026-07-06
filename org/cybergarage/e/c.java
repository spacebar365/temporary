package org.cybergarage.e;

/* JADX INFO: compiled from: Mutex.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private boolean a = false;

    public final synchronized void a() {
        while (this.a) {
            try {
                wait();
            } catch (Exception e) {
                a.a(e);
            }
        }
        this.a = true;
    }

    public final synchronized void b() {
        this.a = false;
        notifyAll();
    }
}
