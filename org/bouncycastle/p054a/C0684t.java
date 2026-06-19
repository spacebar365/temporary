package org.bouncycastle.p054a;

/* JADX INFO: renamed from: org.bouncycastle.a.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0684t extends IllegalStateException {

    /* JADX INFO: renamed from: a */
    private Throwable f2800a;

    public C0684t(String str) {
        super(str);
    }

    public C0684t(String str, Throwable th) {
        super(str);
        this.f2800a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f2800a;
    }
}
