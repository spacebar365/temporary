package org.bouncycastle.b.k;

/* JADX INFO: loaded from: classes.dex */
public final class w implements org.bouncycastle.b.i {
    private ad a;
    private ad b;
    private ae c;

    public final ad a() {
        return this.a;
    }

    public final ad b() {
        return this.b;
    }

    public w(ad adVar, ad adVar2, ae aeVar) {
        if (adVar == null) {
            throw new NullPointerException("staticPrivateKey cannot be null");
        }
        if (adVar2 == null) {
            throw new NullPointerException("ephemeralPrivateKey cannot be null");
        }
        y yVar = adVar.b;
        if (!yVar.equals(adVar2.b)) {
            throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
        }
        if (aeVar == null) {
            aeVar = new ae(yVar.b().a(adVar2.c), yVar);
        } else if (!yVar.equals(aeVar.b)) {
            throw new IllegalArgumentException("ephemeral public key has different domain parameters");
        }
        this.a = adVar;
        this.b = adVar2;
        this.c = aeVar;
    }
}
