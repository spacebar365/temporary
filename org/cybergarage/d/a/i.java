package org.cybergarage.d.a;

/* JADX INFO: compiled from: RenewSubscriber.java */
/* JADX INFO: loaded from: classes.dex */
public final class i extends org.cybergarage.e.e {
    private org.cybergarage.d.e a;

    @Override // org.cybergarage.e.e, java.lang.Runnable
    public final void run() {
        org.cybergarage.d.e eVar = this.a;
        while (g()) {
            try {
                Thread.sleep(120000L);
            } catch (InterruptedException e) {
            }
            eVar.c();
        }
    }
}
