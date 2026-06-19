package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p083b.InterfaceC1003i;

/* JADX INFO: renamed from: org.bouncycastle.b.k.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1110m implements InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private C1108k f4478a;

    /* JADX INFO: renamed from: b */
    private C1108k f4479b;

    public C1110m(C1108k c1108k, C1108k c1108k2) {
        if (c1108k == null) {
            throw new NullPointerException("staticPublicKey cannot be null");
        }
        if (c1108k2 == null) {
            throw new NullPointerException("ephemeralPublicKey cannot be null");
        }
        if (!c1108k.m2658b().equals(c1108k2.m2658b())) {
            throw new IllegalArgumentException("Static and ephemeral public keys have different domain parameters");
        }
        this.f4478a = c1108k;
        this.f4479b = c1108k2;
    }

    /* JADX INFO: renamed from: a */
    public final C1108k m2675a() {
        return this.f4478a;
    }

    /* JADX INFO: renamed from: b */
    public final C1108k m2676b() {
        return this.f4479b;
    }
}
