package org.bouncycastle.f.a;

/* JADX INFO: loaded from: classes.dex */
public final class c extends IllegalStateException {
    private Throwable a;

    c(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
