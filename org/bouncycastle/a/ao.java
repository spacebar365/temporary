package org.bouncycastle.a;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ao implements y {
    private z a;

    ao(z zVar) {
        this.a = zVar;
    }

    @Override // org.bouncycastle.a.cb
    public final u d() {
        return new an(this.a.b());
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
