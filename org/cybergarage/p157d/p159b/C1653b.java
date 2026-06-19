package org.cybergarage.p157d.p159b;

import org.cybergarage.p157d.C1684e;
import org.cybergarage.p173e.RunnableC1748e;

/* JADX INFO: renamed from: org.cybergarage.d.b.b */
/* JADX INFO: compiled from: Disposer.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1653b extends RunnableC1748e {

    /* JADX INFO: renamed from: a */
    private C1684e f6376a;

    @Override // org.cybergarage.p173e.RunnableC1748e, java.lang.Runnable
    public final void run() {
        C1684e c1684e = this.f6376a;
        long jM4851b = c1684e.m4851b() * 1000;
        while (m5129g()) {
            try {
                Thread.sleep(jM4851b);
            } catch (InterruptedException e) {
            }
            c1684e.m4849a();
        }
    }
}
