package org.bouncycastle.f.b.a;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends IOException {
    private Throwable a;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
