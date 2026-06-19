package org.bouncycastle.p118e.p129c.p131b.p132a;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p118e.p119a.C1427a;
import org.bouncycastle.p118e.p119a.InterfaceC1431e;
import org.bouncycastle.p118e.p120b.p121a.C1442b;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1496a implements PrivateKey {

    /* JADX INFO: renamed from: a */
    private C1442b f5415a;

    public C1496a(C1442b c1442b) {
        this.f5415a = c1442b;
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
        return (((((((((this.f5415a.m3774d() * 37) + this.f5415a.m3773c()) * 37) + this.f5415a.m3775e().hashCode()) * 37) + this.f5415a.m3776f().hashCode()) * 37) + this.f5415a.m3777g().hashCode()) * 37) + this.f5415a.m3778h().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1496a)) {
            return false;
        }
        C1496a c1496a = (C1496a) obj;
        return this.f5415a.m3773c() == c1496a.f5415a.m3773c() && this.f5415a.m3774d() == c1496a.f5415a.m3774d() && this.f5415a.m3775e().equals(c1496a.f5415a.m3775e()) && this.f5415a.m3776f().equals(c1496a.f5415a.m3776f()) && this.f5415a.m3777g().equals(c1496a.f5415a.m3777g()) && this.f5415a.m3778h().equals(c1496a.f5415a.m3778h());
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return new C0676p(new C0759a(InterfaceC1431e.f5183n), new C1427a(this.f5415a.m3773c(), this.f5415a.m3774d(), this.f5415a.m3775e(), this.f5415a.m3776f(), this.f5415a.m3777g(), C1502g.m3999a(this.f5415a.m3772b()))).mo1578k();
        } catch (IOException e) {
            return null;
        }
    }
}
