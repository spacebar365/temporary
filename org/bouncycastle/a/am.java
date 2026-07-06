package org.bouncycastle.a;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class am implements w {
    private z a;

    am(z zVar) {
        this.a = zVar;
    }

    @Override // org.bouncycastle.a.cb
    public final u d() {
        return new al(this.a.b());
    }

    @Override // org.bouncycastle.a.f
    public final u i() {
        try {
            return d();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
