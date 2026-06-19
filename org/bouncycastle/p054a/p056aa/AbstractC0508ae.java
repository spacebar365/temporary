package org.bouncycastle.p054a.p056aa;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.ae */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0508ae {

    /* JADX INFO: renamed from: a */
    private C0507ad f1893a;

    /* JADX INFO: renamed from: a */
    protected abstract C0507ad mo1349a();

    /* JADX INFO: renamed from: b */
    public final synchronized C0507ad m1371b() {
        if (this.f1893a == null) {
            this.f1893a = mo1349a();
        }
        return this.f1893a;
    }
}
