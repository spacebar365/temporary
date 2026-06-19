package org.bouncycastle.p118e.p129c.p131b.p132a;

import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p118e.p119a.C1430d;
import org.bouncycastle.p118e.p119a.InterfaceC1431e;
import org.bouncycastle.p118e.p120b.p121a.C1447g;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1499d implements PublicKey {

    /* JADX INFO: renamed from: a */
    private C1447g f5418a;

    public C1499d(C1447g c1447g) {
        this.f5418a = c1447g;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return new C0780u(new C0759a(InterfaceC1431e.f5182m), new C1430d(this.f5418a.m3789b(), this.f5418a.m3790c(), this.f5418a.m3791d())).mo1578k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return ((this.f5418a.m3789b() + (this.f5418a.m3790c() * 37)) * 37) + this.f5418a.m3791d().hashCode();
    }

    public final String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.f5418a.m3789b() + "\n") + " error correction capability: " + this.f5418a.m3790c() + "\n") + " generator matrix           : " + this.f5418a.m3791d();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1499d)) {
            return false;
        }
        C1499d c1499d = (C1499d) obj;
        return this.f5418a.m3789b() == c1499d.f5418a.m3789b() && this.f5418a.m3790c() == c1499d.f5418a.m3790c() && this.f5418a.m3791d().equals(c1499d.f5418a.m3791d());
    }
}
