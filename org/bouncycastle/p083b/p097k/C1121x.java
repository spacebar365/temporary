package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p083b.InterfaceC1003i;

/* JADX INFO: renamed from: org.bouncycastle.b.k.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1121x implements InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private C1053ae f4504a;

    /* JADX INFO: renamed from: b */
    private C1053ae f4505b;

    /* JADX INFO: renamed from: a */
    public final C1053ae m2696a() {
        return this.f4504a;
    }

    /* JADX INFO: renamed from: b */
    public final C1053ae m2697b() {
        return this.f4505b;
    }

    public C1121x(C1053ae c1053ae, C1053ae c1053ae2) {
        if (c1053ae == null) {
            throw new NullPointerException("staticPublicKey cannot be null");
        }
        if (c1053ae2 == null) {
            throw new NullPointerException("ephemeralPublicKey cannot be null");
        }
        if (!c1053ae.f4378b.equals(c1053ae2.f4378b)) {
            throw new IllegalArgumentException("static and ephemeral public keys have different domain parameters");
        }
        this.f4504a = c1053ae;
        this.f4505b = c1053ae2;
    }
}
