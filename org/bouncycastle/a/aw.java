package org.bouncycastle.a;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class aw implements cb, f {
    private z a;

    public aw(z zVar) {
        this.a = zVar;
    }

    @Override // org.bouncycastle.a.cb
    public final u d() throws i {
        try {
            return new bu(this.a.b());
        } catch (IllegalArgumentException e) {
            throw new i(e.getMessage(), e);
        }
    }

    @Override // org.bouncycastle.a.f
    public final u i() {
        try {
            return d();
        } catch (IOException e) {
            throw new t("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new t("unable to get DER object", e2);
        }
    }
}
