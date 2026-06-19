package org.bouncycastle.p118e.p129c.p131b.p132a;

import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p118e.p119a.C1428b;
import org.bouncycastle.p118e.p119a.InterfaceC1431e;
import org.bouncycastle.p118e.p120b.p121a.C1443c;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1497b implements PublicKey, InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private C1443c f5416a;

    public C1497b(C1443c c1443c) {
        this.f5416a = c1443c;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return new C0780u(new C0759a(InterfaceC1431e.f5183n), new C1428b(this.f5416a.m3779c(), this.f5416a.m3780d(), this.f5416a.m3781e(), C1502g.m3999a(this.f5416a.m3772b()))).mo1578k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return ((this.f5416a.m3779c() + (this.f5416a.m3780d() * 37)) * 37) + this.f5416a.m3781e().hashCode();
    }

    public final String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.f5416a.m3779c() + "\n") + " error correction capability: " + this.f5416a.m3780d() + "\n") + " generator matrix           : " + this.f5416a.m3781e().toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1497b)) {
            return false;
        }
        C1497b c1497b = (C1497b) obj;
        return this.f5416a.m3779c() == c1497b.f5416a.m3779c() && this.f5416a.m3780d() == c1497b.f5416a.m3780d() && this.f5416a.m3781e().equals(c1497b.f5416a.m3781e());
    }
}
