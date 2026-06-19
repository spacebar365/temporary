package org.cybergarage.p157d.p158a;

import org.cybergarage.p157d.C1684e;
import org.cybergarage.p173e.RunnableC1748e;

/* JADX INFO: renamed from: org.cybergarage.d.a.i */
/* JADX INFO: compiled from: RenewSubscriber.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1650i extends RunnableC1748e {

    /* JADX INFO: renamed from: a */
    private C1684e f6374a;

    @Override // org.cybergarage.p173e.RunnableC1748e, java.lang.Runnable
    public final void run() {
        C1684e c1684e = this.f6374a;
        while (m5129g()) {
            try {
                Thread.sleep(120000L);
            } catch (InterruptedException e) {
            }
            c1684e.m4853c();
        }
    }
}
