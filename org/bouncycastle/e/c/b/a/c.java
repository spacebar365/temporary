package org.bouncycastle.e.c.b.a;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.a.s.p;
import org.bouncycastle.b.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements PrivateKey, i {
    private org.bouncycastle.e.b.a.f a;

    public c(org.bouncycastle.e.b.a.f fVar) {
        this.a = fVar;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            try {
                return new p(new org.bouncycastle.a.z.a(org.bouncycastle.e.a.e.m), new org.bouncycastle.e.a.c(this.a.b(), this.a.c(), this.a.d(), this.a.e(), this.a.g(), this.a.h(), this.a.f())).k();
            } catch (IOException e) {
                return null;
            }
        } catch (IOException e2) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (((((((((((this.a.c() * 37) + this.a.b()) * 37) + this.a.d().hashCode()) * 37) + this.a.e().hashCode()) * 37) + this.a.g().hashCode()) * 37) + this.a.h().hashCode()) * 37) + this.a.f().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.b() == cVar.a.b() && this.a.c() == cVar.a.c() && this.a.d().equals(cVar.a.d()) && this.a.e().equals(cVar.a.e()) && this.a.f().equals(cVar.a.f()) && this.a.g().equals(cVar.a.g()) && this.a.h().equals(cVar.a.h());
    }
}
