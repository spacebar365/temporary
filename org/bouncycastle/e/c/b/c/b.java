package org.bouncycastle.e.c.b.c;

import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.a.z.u;
import org.bouncycastle.e.b.f.d;

/* JADX INFO: loaded from: classes.dex */
public final class b implements PublicKey {
    private transient org.bouncycastle.e.b.c.b a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.b() == bVar.a.b() && org.bouncycastle.f.a.a(this.a.c(), bVar.a.c());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return org.bouncycastle.e.b.c.c.a(this.a.b());
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return d.a(this.a).k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return this.a.b() + (org.bouncycastle.f.a.a(this.a.c()) * 37);
    }

    public b(u uVar) {
        this.a = (org.bouncycastle.e.b.c.b) org.bouncycastle.e.b.f.c.a(uVar);
    }
}
