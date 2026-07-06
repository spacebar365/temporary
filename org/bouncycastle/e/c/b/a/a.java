package org.bouncycastle.e.c.b.a;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.a.s.p;

/* JADX INFO: loaded from: classes.dex */
public final class a implements PrivateKey {
    private org.bouncycastle.e.b.a.b a;

    public a(org.bouncycastle.e.b.a.b bVar) {
        this.a = bVar;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (((((((((this.a.d() * 37) + this.a.c()) * 37) + this.a.e().hashCode()) * 37) + this.a.f().hashCode()) * 37) + this.a.g().hashCode()) * 37) + this.a.h().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.c() == aVar.a.c() && this.a.d() == aVar.a.d() && this.a.e().equals(aVar.a.e()) && this.a.f().equals(aVar.a.f()) && this.a.g().equals(aVar.a.g()) && this.a.h().equals(aVar.a.h());
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return new p(new org.bouncycastle.a.z.a(org.bouncycastle.e.a.e.n), new org.bouncycastle.e.a.a(this.a.c(), this.a.d(), this.a.e(), this.a.f(), this.a.g(), g.a(this.a.b()))).k();
        } catch (IOException e) {
            return null;
        }
    }
}
