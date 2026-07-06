package org.bouncycastle.e.c.b.e;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.a.be;
import org.bouncycastle.a.p;
import org.bouncycastle.a.x;
import org.bouncycastle.e.a.e;
import org.bouncycastle.e.a.h;
import org.bouncycastle.e.c.a.d;

/* JADX INFO: loaded from: classes.dex */
public final class a implements PrivateKey, d {
    private transient p a;
    private transient org.bouncycastle.e.b.e.b b;
    private transient x c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && org.bouncycastle.f.a.a(this.b.c(), aVar.b.c());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return (this.b.b() != null ? org.bouncycastle.e.b.f.b.a(this.b, this.c) : new org.bouncycastle.a.s.p(new org.bouncycastle.a.z.a(e.r, new h(new org.bouncycastle.a.z.a(this.a))), new be(this.b.c()), this.c)).k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return this.a.hashCode() + (org.bouncycastle.f.a.a(this.b.c()) * 37);
    }

    public a(org.bouncycastle.a.s.p pVar) {
        this.c = pVar.a();
        this.a = h.a(pVar.b().b()).a().a();
        this.b = (org.bouncycastle.e.b.e.b) org.bouncycastle.e.b.f.a.a(pVar);
    }
}
