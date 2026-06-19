package org.bouncycastle.p054a;

import java.io.IOException;

/* JADX INFO: renamed from: org.bouncycastle.a.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0629i extends IOException {

    /* JADX INFO: renamed from: a */
    private Throwable f2269a;

    C0629i(String str) {
        super(str);
    }

    C0629i(String str, Throwable th) {
        super(str);
        this.f2269a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f2269a;
    }
}
