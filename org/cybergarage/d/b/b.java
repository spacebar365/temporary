package org.cybergarage.d.b;

/* JADX INFO: compiled from: Disposer.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends org.cybergarage.e.e {
    private org.cybergarage.d.e a;

    @Override // org.cybergarage.e.e, java.lang.Runnable
    public final void run() {
        org.cybergarage.d.e eVar = this.a;
        long jB = eVar.b() * 1000;
        while (g()) {
            try {
                Thread.sleep(jB);
            } catch (InterruptedException e) {
            }
            eVar.a();
        }
    }
}
