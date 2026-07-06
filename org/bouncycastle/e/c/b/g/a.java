package org.bouncycastle.e.c.b.g;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.a.p;
import org.bouncycastle.a.x;
import org.bouncycastle.e.a.j;
import org.bouncycastle.e.b.g.s;

/* JADX INFO: loaded from: classes.dex */
public final class a implements PrivateKey, org.bouncycastle.e.c.a.e {
    private transient p a;
    private transient s b;
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
        return "XMSSMT";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return org.bouncycastle.e.b.f.b.a(this.b, this.c).k();
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
        this.a = j.a(pVar.b().b()).c().a();
        this.b = (s) org.bouncycastle.e.b.f.a.a(pVar);
    }
}
