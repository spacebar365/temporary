package org.bouncycastle.e.c.b.a;

import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements PublicKey, i {
    private org.bouncycastle.e.b.a.c a;

    public b(org.bouncycastle.e.b.a.c cVar) {
        this.a = cVar;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return new u(new org.bouncycastle.a.z.a(org.bouncycastle.e.a.e.n), new org.bouncycastle.e.a.b(this.a.c(), this.a.d(), this.a.e(), g.a(this.a.b()))).k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return ((this.a.c() + (this.a.d() * 37)) * 37) + this.a.e().hashCode();
    }

    public final String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.a.c() + "\n") + " error correction capability: " + this.a.d() + "\n") + " generator matrix           : " + this.a.e().toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.c() == bVar.a.c() && this.a.d() == bVar.a.d() && this.a.e().equals(bVar.a.e());
    }
}
