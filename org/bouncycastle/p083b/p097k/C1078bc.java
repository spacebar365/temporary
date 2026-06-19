package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p083b.InterfaceC1003i;

/* JADX INFO: renamed from: org.bouncycastle.b.k.bc */
/* JADX INFO: loaded from: classes.dex */
public final class C1078bc implements InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private C1053ae f4416a;

    /* JADX INFO: renamed from: b */
    private C1053ae f4417b;

    /* JADX INFO: renamed from: a */
    public final C1053ae m2607a() {
        return this.f4416a;
    }

    /* JADX INFO: renamed from: b */
    public final C1053ae m2608b() {
        return this.f4417b;
    }

    public C1078bc(C1053ae c1053ae, C1053ae c1053ae2) {
        if (c1053ae == null) {
            throw new NullPointerException("staticPublicKey cannot be null");
        }
        if (c1053ae2 == null) {
            throw new NullPointerException("ephemeralPublicKey cannot be null");
        }
        if (!c1053ae.f4378b.equals(c1053ae2.f4378b)) {
            throw new IllegalArgumentException("Static and ephemeral public keys have different domain parameters");
        }
        this.f4416a = c1053ae;
        this.f4417b = c1053ae2;
    }
}
