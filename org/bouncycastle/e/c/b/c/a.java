package org.bouncycastle.e.c.b.c;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.x;

/* JADX INFO: loaded from: classes.dex */
public final class a implements PrivateKey {
    private transient org.bouncycastle.e.b.c.a a;
    private transient x b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.b() == aVar.a.b() && org.bouncycastle.f.a.a(this.a.c(), aVar.a.c());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return org.bouncycastle.e.b.c.c.a(this.a.b());
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return org.bouncycastle.e.b.f.b.a(this.a, this.b).k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return this.a.b() + (org.bouncycastle.f.a.a(this.a.c()) * 37);
    }

    public a(p pVar) {
        this.b = pVar.a();
        this.a = (org.bouncycastle.e.b.c.a) org.bouncycastle.e.b.f.a.a(pVar);
    }
}
