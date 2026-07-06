package org.bouncycastle.a;

/* JADX INFO: loaded from: classes.dex */
public final class t extends IllegalStateException {
    private Throwable a;

    public t(String str) {
        super(str);
    }

    public t(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
