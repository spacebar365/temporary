package org.bouncycastle.p083b;

/* JADX INFO: renamed from: org.bouncycastle.b.j */
/* JADX INFO: loaded from: classes.dex */
public class C1038j extends Exception {

    /* JADX INFO: renamed from: a */
    private Throwable f4368a;

    public C1038j() {
    }

    public C1038j(String str) {
        super(str);
    }

    public C1038j(String str, Throwable th) {
        super(str);
        this.f4368a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f4368a;
    }
}
