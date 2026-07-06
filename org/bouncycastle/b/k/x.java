package org.bouncycastle.b.k;

/* JADX INFO: loaded from: classes.dex */
public final class x implements org.bouncycastle.b.i {
    private ae a;
    private ae b;

    public final ae a() {
        return this.a;
    }

    public final ae b() {
        return this.b;
    }

    public x(ae aeVar, ae aeVar2) {
        if (aeVar == null) {
            throw new NullPointerException("staticPublicKey cannot be null");
        }
        if (aeVar2 == null) {
            throw new NullPointerException("ephemeralPublicKey cannot be null");
        }
        if (!aeVar.b.equals(aeVar2.b)) {
            throw new IllegalArgumentException("static and ephemeral public keys have different domain parameters");
        }
        this.a = aeVar;
        this.b = aeVar2;
    }
}
