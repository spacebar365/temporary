package org.bouncycastle.e.c.b.g;

import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.a.p;
import org.bouncycastle.a.z.u;
import org.bouncycastle.e.a.j;
import org.bouncycastle.e.b.g.t;

/* JADX INFO: loaded from: classes.dex */
public final class b implements PublicKey {
    private transient p a;
    private transient t b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && org.bouncycastle.f.a.a(this.b.c(), bVar.b.c());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return org.bouncycastle.e.b.f.d.a(this.b).k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return this.a.hashCode() + (org.bouncycastle.f.a.a(this.b.c()) * 37);
    }

    public b(u uVar) {
        this.a = j.a(uVar.a().b()).c().a();
        this.b = (t) org.bouncycastle.e.b.f.c.a(uVar);
    }
}
