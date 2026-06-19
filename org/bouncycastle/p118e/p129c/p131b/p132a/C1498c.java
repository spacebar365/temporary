package org.bouncycastle.p118e.p129c.p131b.p132a;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p118e.p119a.C1429c;
import org.bouncycastle.p118e.p119a.InterfaceC1431e;
import org.bouncycastle.p118e.p120b.p121a.C1446f;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1498c implements PrivateKey, InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private C1446f f5417a;

    public C1498c(C1446f c1446f) {
        this.f5417a = c1446f;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            try {
                return new C0676p(new C0759a(InterfaceC1431e.f5182m), new C1429c(this.f5417a.m3782b(), this.f5417a.m3783c(), this.f5417a.m3784d(), this.f5417a.m3785e(), this.f5417a.m3787g(), this.f5417a.m3788h(), this.f5417a.m3786f())).mo1578k();
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
        return (((((((((((this.f5417a.m3783c() * 37) + this.f5417a.m3782b()) * 37) + this.f5417a.m3784d().hashCode()) * 37) + this.f5417a.m3785e().hashCode()) * 37) + this.f5417a.m3787g().hashCode()) * 37) + this.f5417a.m3788h().hashCode()) * 37) + this.f5417a.m3786f().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1498c)) {
            return false;
        }
        C1498c c1498c = (C1498c) obj;
        return this.f5417a.m3782b() == c1498c.f5417a.m3782b() && this.f5417a.m3783c() == c1498c.f5417a.m3783c() && this.f5417a.m3784d().equals(c1498c.f5417a.m3784d()) && this.f5417a.m3785e().equals(c1498c.f5417a.m3785e()) && this.f5417a.m3786f().equals(c1498c.f5417a.m3786f()) && this.f5417a.m3787g().equals(c1498c.f5417a.m3787g()) && this.f5417a.m3788h().equals(c1498c.f5417a.m3788h());
    }
}
