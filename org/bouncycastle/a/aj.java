package org.bouncycastle.a;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class aj implements r {
    private z a;

    aj(z zVar) {
        this.a = zVar;
    }

    @Override // org.bouncycastle.a.r
    public final InputStream b() {
        return new ar(this.a);
    }

    @Override // org.bouncycastle.a.cb
    public final u d() {
        return new ah(org.bouncycastle.f.b.a.a(b()));
    }

    @Override // org.bouncycastle.a.f
    public final u i() {
        try {
            return d();
        } catch (IOException e) {
            throw new t("IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }
}
