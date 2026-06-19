package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p083b.InterfaceC1003i;

/* JADX INFO: renamed from: org.bouncycastle.b.k.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1120w implements InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private C1052ad f4501a;

    /* JADX INFO: renamed from: b */
    private C1052ad f4502b;

    /* JADX INFO: renamed from: c */
    private C1053ae f4503c;

    /* JADX INFO: renamed from: a */
    public final C1052ad m2694a() {
        return this.f4501a;
    }

    /* JADX INFO: renamed from: b */
    public final C1052ad m2695b() {
        return this.f4502b;
    }

    public C1120w(C1052ad c1052ad, C1052ad c1052ad2, C1053ae c1053ae) {
        if (c1052ad == null) {
            throw new NullPointerException("staticPrivateKey cannot be null");
        }
        if (c1052ad2 == null) {
            throw new NullPointerException("ephemeralPrivateKey cannot be null");
        }
        C1122y c1122y = c1052ad.f4378b;
        if (!c1122y.equals(c1052ad2.f4378b)) {
            throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
        }
        if (c1053ae == null) {
            c1053ae = new C1053ae(c1122y.m2700b().m3447a(c1052ad2.f4380c), c1122y);
        } else if (!c1122y.equals(c1053ae.f4378b)) {
            throw new IllegalArgumentException("ephemeral public key has different domain parameters");
        }
        this.f4501a = c1052ad;
        this.f4502b = c1052ad2;
        this.f4503c = c1053ae;
    }
}
