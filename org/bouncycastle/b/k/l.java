package org.bouncycastle.b.k;

/* JADX INFO: loaded from: classes.dex */
public final class l implements org.bouncycastle.b.i {
    private j a;
    private j b;
    private k c;

    public l(j jVar, j jVar2) {
        this(jVar, jVar2, null);
    }

    public l(j jVar, j jVar2, k kVar) {
        if (jVar == null) {
            throw new NullPointerException("staticPrivateKey cannot be null");
        }
        if (jVar2 == null) {
            throw new NullPointerException("ephemeralPrivateKey cannot be null");
        }
        i iVarB = jVar.b();
        if (!iVarB.equals(jVar2.b())) {
            throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
        }
        if (kVar == null) {
            kVar = new k(iVarB.b().modPow(jVar2.c(), iVarB.a()), iVarB);
        } else if (!iVarB.equals(kVar.b())) {
            throw new IllegalArgumentException("ephemeral public key has different domain parameters");
        }
        this.a = jVar;
        this.b = jVar2;
        this.c = kVar;
    }

    public final j a() {
        return this.a;
    }

    public final j b() {
        return this.b;
    }
}
