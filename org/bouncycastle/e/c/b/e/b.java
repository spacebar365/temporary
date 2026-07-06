package org.bouncycastle.e.c.b.e;

import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.a.p;
import org.bouncycastle.a.z.u;
import org.bouncycastle.e.a.e;
import org.bouncycastle.e.a.h;
import org.bouncycastle.e.c.a.d;

/* JADX INFO: loaded from: classes.dex */
public final class b implements PublicKey, d {
    private transient p a;
    private transient org.bouncycastle.e.b.e.c b;

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
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return (this.b.b() != null ? org.bouncycastle.e.b.f.d.a(this.b) : new u(new org.bouncycastle.a.z.a(e.r, new h(new org.bouncycastle.a.z.a(this.a))), this.b.c())).k();
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
        this.a = h.a(uVar.a().b()).a().a();
        this.b = (org.bouncycastle.e.b.e.c) org.bouncycastle.e.b.f.c.a(uVar);
    }
}
