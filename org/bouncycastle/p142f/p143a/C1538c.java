package org.bouncycastle.p142f.p143a;

/* JADX INFO: renamed from: org.bouncycastle.f.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1538c extends IllegalStateException {

    /* JADX INFO: renamed from: a */
    private Throwable f5487a;

    C1538c(String str, Throwable th) {
        super(str);
        this.f5487a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f5487a;
    }
}
