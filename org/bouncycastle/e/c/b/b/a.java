package org.bouncycastle.e.c.b.b;

import java.io.IOException;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.x;

/* JADX INFO: loaded from: classes.dex */
public final class a implements org.bouncycastle.e.c.a.b {
    private transient org.bouncycastle.e.b.b.a a;
    private transient x b;

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
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
        return org.bouncycastle.f.a.b(this.a.b());
    }

    public a(p pVar) {
        this.b = pVar.a();
        this.a = (org.bouncycastle.e.b.b.a) org.bouncycastle.e.b.f.a.a(pVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        short[] sArrB = this.a.b();
        short[] sArrB2 = ((a) obj).a.b();
        if (sArrB != sArrB2) {
            if (sArrB == null || sArrB2 == null || sArrB.length != sArrB2.length) {
                return false;
            }
            for (int i = 0; i != sArrB.length; i++) {
                if (sArrB[i] != sArrB2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
