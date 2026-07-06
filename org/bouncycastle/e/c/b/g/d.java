package org.bouncycastle.e.c.b.g;

import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.a.p;
import org.bouncycastle.a.z.u;
import org.bouncycastle.e.a.i;
import org.bouncycastle.e.b.g.z;

/* JADX INFO: loaded from: classes.dex */
public final class d implements PublicKey {
    private transient z a;
    private transient p b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.b.equals(dVar.b) && org.bouncycastle.f.a.a(this.a.c(), dVar.a.c());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return org.bouncycastle.e.b.f.d.a(this.a).k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return this.b.hashCode() + (org.bouncycastle.f.a.a(this.a.c()) * 37);
    }

    public d(u uVar) {
        this.b = i.a(uVar.a().b()).b().a();
        this.a = (z) org.bouncycastle.e.b.f.c.a(uVar);
    }
}
