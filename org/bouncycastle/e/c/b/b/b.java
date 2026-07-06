package org.bouncycastle.e.c.b.b;

import java.io.IOException;
import org.bouncycastle.a.z.u;
import org.bouncycastle.e.b.f.d;

/* JADX INFO: loaded from: classes.dex */
public final class b implements org.bouncycastle.e.c.a.c {
    private transient org.bouncycastle.e.b.b.b a;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return org.bouncycastle.f.a.a(this.a.b(), ((b) obj).a.b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return d.a(this.a).k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return org.bouncycastle.f.a.a(this.a.b());
    }

    public b(u uVar) {
        this.a = (org.bouncycastle.e.b.b.b) org.bouncycastle.e.b.f.c.a(uVar);
    }
}
