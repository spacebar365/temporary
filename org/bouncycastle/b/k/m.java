package org.bouncycastle.b.k;

/* JADX INFO: loaded from: classes.dex */
public final class m implements org.bouncycastle.b.i {
    private k a;
    private k b;

    public m(k kVar, k kVar2) {
        if (kVar == null) {
            throw new NullPointerException("staticPublicKey cannot be null");
        }
        if (kVar2 == null) {
            throw new NullPointerException("ephemeralPublicKey cannot be null");
        }
        if (!kVar.b().equals(kVar2.b())) {
            throw new IllegalArgumentException("Static and ephemeral public keys have different domain parameters");
        }
        this.a = kVar;
        this.b = kVar2;
    }

    public final k a() {
        return this.a;
    }

    public final k b() {
        return this.b;
    }
}
