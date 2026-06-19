package org.bouncycastle.p083b.p091g;

import java.io.IOException;

/* JADX INFO: renamed from: org.bouncycastle.b.g.a */
/* JADX INFO: loaded from: classes.dex */
public class C0981a extends IOException {

    /* JADX INFO: renamed from: a */
    private final Throwable f4052a;

    public C0981a(String str, Throwable th) {
        super(str);
        this.f4052a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f4052a;
    }
}
