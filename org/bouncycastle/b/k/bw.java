package org.bouncycastle.b.k;

/* JADX INFO: loaded from: classes.dex */
public final class bw implements org.bouncycastle.b.i {
    private b a;
    private b b;
    private b c;

    public bw(b bVar, b bVar2, b bVar3) {
        if (bVar == null) {
            throw new NullPointerException("staticPrivateKey cannot be null");
        }
        if (!(bVar instanceof bu) && !(bVar instanceof br)) {
            throw new IllegalArgumentException("only X25519 and X448 paramaters can be used");
        }
        if (bVar2 == null) {
            throw new NullPointerException("ephemeralPrivateKey cannot be null");
        }
        if (!bVar.getClass().isAssignableFrom(bVar2.getClass())) {
            throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
        }
        if (bVar3 == null) {
            bVar3 = bVar2 instanceof bu ? ((bu) bVar2).c() : ((br) bVar2).c();
        } else {
            if ((bVar3 instanceof bv) && !(bVar instanceof bu)) {
                throw new IllegalArgumentException("ephemeral public key has different domain parameters");
            }
            if ((bVar3 instanceof bs) && !(bVar instanceof br)) {
                throw new IllegalArgumentException("ephemeral public key has different domain parameters");
            }
        }
        this.a = bVar;
        this.b = bVar2;
        this.c = bVar3;
    }

    public final b a() {
        return this.a;
    }

    public final b b() {
        return this.b;
    }
}
