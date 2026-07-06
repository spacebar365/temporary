package org.bouncycastle.a;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class bl implements y {
    private z a;

    bl(z zVar) {
        this.a = zVar;
    }

    @Override // org.bouncycastle.a.cb
    public final u d() {
        return new bk(this.a.b(), (byte) 0);
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
