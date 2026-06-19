package org.cybergarage.p157d.p159b;

import org.cybergarage.p157d.C1728f;
import org.cybergarage.p173e.RunnableC1748e;

/* JADX INFO: renamed from: org.cybergarage.d.b.a */
/* JADX INFO: compiled from: Advertiser.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1652a extends RunnableC1748e {

    /* JADX INFO: renamed from: a */
    private C1728f f6375a;

    public C1652a(C1728f c1728f) {
        this.f6375a = c1728f;
    }

    @Override // org.cybergarage.p173e.RunnableC1748e, java.lang.Runnable
    public final void run() {
        C1728f c1728f = this.f6375a;
        long jM4996h = c1728f.m4996h();
        while (m5129g()) {
            try {
                Thread.sleep(jM4996h);
            } catch (InterruptedException e) {
            }
            if (m5127e() != null && !m5127e().isInterrupted()) {
                c1728f.m5004o();
            }
        }
    }
}
