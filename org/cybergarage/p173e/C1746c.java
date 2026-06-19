package org.cybergarage.p173e;

/* JADX INFO: renamed from: org.cybergarage.e.c */
/* JADX INFO: compiled from: Mutex.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1746c {

    /* JADX INFO: renamed from: a */
    private boolean f6522a = false;

    /* JADX INFO: renamed from: a */
    public final synchronized void m5123a() {
        while (this.f6522a) {
            try {
                wait();
            } catch (Exception e) {
                C1744a.m5117a(e);
            }
        }
        this.f6522a = true;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5124b() {
        this.f6522a = false;
        notifyAll();
    }
}
