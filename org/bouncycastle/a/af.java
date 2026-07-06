package org.bouncycastle.a;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class af implements b {
    private final int a;
    private final z b;

    af(int i, z zVar) {
        this.a = i;
        this.b = zVar;
    }

    @Override // org.bouncycastle.a.cb
    public final u d() {
        return new ae(this.a, this.b.b());
    }

    @Override // org.bouncycastle.a.f
    public final u i() {
        try {
            return d();
        } catch (IOException e) {
            throw new t(e.getMessage(), e);
        }
    }
}
