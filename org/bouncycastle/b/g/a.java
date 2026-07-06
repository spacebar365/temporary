package org.bouncycastle.b.g;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class a extends IOException {
    private final Throwable a;

    public a(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }
}
