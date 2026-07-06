package org.bouncycastle.b.k;

/* JADX INFO: loaded from: classes.dex */
public final class bx implements org.bouncycastle.b.i {
    private b a;
    private b b;

    public bx(b bVar, b bVar2) {
        if (bVar == null) {
            throw new NullPointerException("staticPublicKey cannot be null");
        }
        if (!(bVar instanceof bv) && !(bVar instanceof bs)) {
            throw new IllegalArgumentException("only X25519 and X448 paramaters can be used");
        }
        if (bVar2 == null) {
            throw new NullPointerException("ephemeralPublicKey cannot be null");
        }
        if (!bVar.getClass().isAssignableFrom(bVar2.getClass())) {
            throw new IllegalArgumentException("static and ephemeral public keys have different domain parameters");
        }
        this.a = bVar;
        this.b = bVar2;
    }

    public final b a() {
        return this.a;
    }

    public final b b() {
        return this.b;
    }
}
