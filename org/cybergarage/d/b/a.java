package org.cybergarage.d.b;

/* JADX INFO: compiled from: Advertiser.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends org.cybergarage.e.e {
    private org.cybergarage.d.f a;

    public a(org.cybergarage.d.f fVar) {
        this.a = fVar;
    }

    @Override // org.cybergarage.e.e, java.lang.Runnable
    public final void run() {
        org.cybergarage.d.f fVar = this.a;
        long jH = fVar.h();
        while (g()) {
            try {
                Thread.sleep(jH);
            } catch (InterruptedException e) {
            }
            if (e() != null && !e().isInterrupted()) {
                fVar.o();
            }
        }
    }
}
