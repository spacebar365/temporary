package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p083b.InterfaceC1003i;

/* JADX INFO: renamed from: org.bouncycastle.b.k.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1109l implements InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private C1107j f4475a;

    /* JADX INFO: renamed from: b */
    private C1107j f4476b;

    /* JADX INFO: renamed from: c */
    private C1108k f4477c;

    public C1109l(C1107j c1107j, C1107j c1107j2) {
        this(c1107j, c1107j2, null);
    }

    public C1109l(C1107j c1107j, C1107j c1107j2, C1108k c1108k) {
        if (c1107j == null) {
            throw new NullPointerException("staticPrivateKey cannot be null");
        }
        if (c1107j2 == null) {
            throw new NullPointerException("ephemeralPrivateKey cannot be null");
        }
        C1106i c1106iB = c1107j.m2658b();
        if (!c1106iB.equals(c1107j2.m2658b())) {
            throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
        }
        if (c1108k == null) {
            c1108k = new C1108k(c1106iB.m2665b().modPow(c1107j2.m2671c(), c1106iB.m2664a()), c1106iB);
        } else if (!c1106iB.equals(c1108k.m2658b())) {
            throw new IllegalArgumentException("ephemeral public key has different domain parameters");
        }
        this.f4475a = c1107j;
        this.f4476b = c1107j2;
        this.f4477c = c1108k;
    }

    /* JADX INFO: renamed from: a */
    public final C1107j m2673a() {
        return this.f4475a;
    }

    /* JADX INFO: renamed from: b */
    public final C1107j m2674b() {
        return this.f4476b;
    }
}
