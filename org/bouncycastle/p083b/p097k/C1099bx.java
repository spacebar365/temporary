package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p083b.InterfaceC1003i;

/* JADX INFO: renamed from: org.bouncycastle.b.k.bx */
/* JADX INFO: loaded from: classes.dex */
public final class C1099bx implements InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private C1075b f4454a;

    /* JADX INFO: renamed from: b */
    private C1075b f4455b;

    public C1099bx(C1075b c1075b, C1075b c1075b2) {
        if (c1075b == null) {
            throw new NullPointerException("staticPublicKey cannot be null");
        }
        if (!(c1075b instanceof C1097bv) && !(c1075b instanceof C1094bs)) {
            throw new IllegalArgumentException("only X25519 and X448 paramaters can be used");
        }
        if (c1075b2 == null) {
            throw new NullPointerException("ephemeralPublicKey cannot be null");
        }
        if (!c1075b.getClass().isAssignableFrom(c1075b2.getClass())) {
            throw new IllegalArgumentException("static and ephemeral public keys have different domain parameters");
        }
        this.f4454a = c1075b;
        this.f4455b = c1075b2;
    }

    /* JADX INFO: renamed from: a */
    public final C1075b m2651a() {
        return this.f4454a;
    }

    /* JADX INFO: renamed from: b */
    public final C1075b m2652b() {
        return this.f4455b;
    }
}
