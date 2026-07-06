package org.bouncycastle.a;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class aq implements ac {
    private boolean a;
    private int b;
    private z c;

    aq(boolean z, int i, z zVar) {
        this.a = z;
        this.b = i;
        this.c = zVar;
    }

    @Override // org.bouncycastle.a.cb
    public final u d() {
        return this.c.a(this.a, this.b);
    }

    @Override // org.bouncycastle.a.f
    public final u i() {
        try {
            return d();
        } catch (IOException e) {
            throw new t(e.getMessage());
        }
    }
}
