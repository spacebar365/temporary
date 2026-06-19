package org.bouncycastle.p142f.p143a;

/* JADX INFO: renamed from: org.bouncycastle.f.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1540e extends IllegalStateException {

    /* JADX INFO: renamed from: a */
    private Throwable f5488a;

    C1540e(String str, Throwable th) {
        super(str);
        this.f5488a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f5488a;
    }
}
