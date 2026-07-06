package org.bouncycastle.b;

/* JADX INFO: loaded from: classes.dex */
public class j extends Exception {
    private Throwable a;

    public j() {
    }

    public j(String str) {
        super(str);
    }

    public j(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
