package org.bouncycastle.a;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class bf implements r {
    private ca a;

    bf(ca caVar) {
        this.a = caVar;
    }

    @Override // org.bouncycastle.a.r
    public final InputStream b() {
        return this.a;
    }

    @Override // org.bouncycastle.a.cb
    public final u d() {
        return new be(this.a.b());
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
