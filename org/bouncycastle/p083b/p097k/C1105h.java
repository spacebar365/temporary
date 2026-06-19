package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p083b.InterfaceC1003i;

/* JADX INFO: renamed from: org.bouncycastle.b.k.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1105h implements InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private C1108k f4462a;

    /* JADX INFO: renamed from: b */
    private C1108k f4463b;

    public C1105h(C1108k c1108k, C1108k c1108k2) {
        if (c1108k == null) {
            throw new NullPointerException("staticPublicKey cannot be null");
        }
        if (c1108k2 == null) {
            throw new NullPointerException("ephemeralPublicKey cannot be null");
        }
        if (!c1108k.m2658b().equals(c1108k2.m2658b())) {
            throw new IllegalArgumentException("Static and ephemeral public keys have different domain parameters");
        }
        this.f4462a = c1108k;
        this.f4463b = c1108k2;
    }

    /* JADX INFO: renamed from: a */
    public final C1108k m2662a() {
        return this.f4462a;
    }

    /* JADX INFO: renamed from: b */
    public final C1108k m2663b() {
        return this.f4463b;
    }
}
