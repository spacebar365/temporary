package org.bouncycastle.e.c.b.g;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.a.p;
import org.bouncycastle.a.x;
import org.bouncycastle.e.a.i;
import org.bouncycastle.e.b.g.y;

/* JADX INFO: loaded from: classes.dex */
public final class c implements PrivateKey, org.bouncycastle.e.c.a.f {
    private transient y a;
    private transient p b;
    private transient x c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.b.equals(cVar.b) && org.bouncycastle.f.a.a(this.a.c(), cVar.a.c());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return org.bouncycastle.e.b.f.b.a(this.a, this.c).k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return this.b.hashCode() + (org.bouncycastle.f.a.a(this.a.c()) * 37);
    }

    public c(org.bouncycastle.a.s.p pVar) {
        this.c = pVar.a();
        this.b = i.a(pVar.b().b()).b().a();
        this.a = (y) org.bouncycastle.e.b.f.a.a(pVar);
    }
}
