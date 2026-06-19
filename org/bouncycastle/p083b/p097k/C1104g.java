package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p083b.InterfaceC1003i;

/* JADX INFO: renamed from: org.bouncycastle.b.k.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1104g implements InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private C1107j f4459a;

    /* JADX INFO: renamed from: b */
    private C1107j f4460b;

    /* JADX INFO: renamed from: c */
    private C1108k f4461c;

    public C1104g(C1107j c1107j, C1107j c1107j2) {
        this(c1107j, c1107j2, null);
    }

    public C1104g(C1107j c1107j, C1107j c1107j2, C1108k c1108k) {
        if (c1107j == null) {
            throw new NullPointerException("staticPrivateKey cannot be null");
        }
        if (c1107j2 == null) {
            throw new NullPointerException("ephemeralPrivateKey cannot be null");
        }
        C1106i c1106iB = c1107j.m2658b();
        if (!c1106iB.equals(c1107j2.m2658b())) {
            throw new IllegalArgumentException("Static and ephemeral private keys have different domain parameters");
        }
        if (c1108k == null) {
            c1108k = new C1108k(c1106iB.m2665b().multiply(c1107j2.m2671c()), c1106iB);
        } else if (!c1106iB.equals(c1108k.m2658b())) {
            throw new IllegalArgumentException("Ephemeral public key has different domain parameters");
        }
        this.f4459a = c1107j;
        this.f4460b = c1107j2;
        this.f4461c = c1108k;
    }

    /* JADX INFO: renamed from: a */
    public final C1107j m2659a() {
        return this.f4459a;
    }

    /* JADX INFO: renamed from: b */
    public final C1107j m2660b() {
        return this.f4460b;
    }

    /* JADX INFO: renamed from: c */
    public final C1108k m2661c() {
        return this.f4461c;
    }
}
