package org.bouncycastle.e.c.b.a;

import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.a.z.u;

/* JADX INFO: loaded from: classes.dex */
public final class d implements PublicKey {
    private org.bouncycastle.e.b.a.g a;

    public d(org.bouncycastle.e.b.a.g gVar) {
        this.a = gVar;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return new u(new org.bouncycastle.a.z.a(org.bouncycastle.e.a.e.m), new org.bouncycastle.e.a.d(this.a.b(), this.a.c(), this.a.d())).k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return ((this.a.b() + (this.a.c() * 37)) * 37) + this.a.d().hashCode();
    }

    public final String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.a.b() + "\n") + " error correction capability: " + this.a.c() + "\n") + " generator matrix           : " + this.a.d();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.b() == dVar.a.b() && this.a.c() == dVar.a.c() && this.a.d().equals(dVar.a.d());
    }
}
