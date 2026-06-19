package org.bouncycastle.p083b.p097k;

import org.bouncycastle.p083b.InterfaceC1003i;

/* JADX INFO: renamed from: org.bouncycastle.b.k.bw */
/* JADX INFO: loaded from: classes.dex */
public final class C1098bw implements InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private C1075b f4451a;

    /* JADX INFO: renamed from: b */
    private C1075b f4452b;

    /* JADX INFO: renamed from: c */
    private C1075b f4453c;

    public C1098bw(C1075b c1075b, C1075b c1075b2, C1075b c1075b3) {
        if (c1075b == null) {
            throw new NullPointerException("staticPrivateKey cannot be null");
        }
        if (!(c1075b instanceof C1096bu) && !(c1075b instanceof C1093br)) {
            throw new IllegalArgumentException("only X25519 and X448 paramaters can be used");
        }
        if (c1075b2 == null) {
            throw new NullPointerException("ephemeralPrivateKey cannot be null");
        }
        if (!c1075b.getClass().isAssignableFrom(c1075b2.getClass())) {
            throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
        }
        if (c1075b3 == null) {
            c1075b3 = c1075b2 instanceof C1096bu ? ((C1096bu) c1075b2).m2646c() : ((C1093br) c1075b2).m2641c();
        } else {
            if ((c1075b3 instanceof C1097bv) && !(c1075b instanceof C1096bu)) {
                throw new IllegalArgumentException("ephemeral public key has different domain parameters");
            }
            if ((c1075b3 instanceof C1094bs) && !(c1075b instanceof C1093br)) {
                throw new IllegalArgumentException("ephemeral public key has different domain parameters");
            }
        }
        this.f4451a = c1075b;
        this.f4452b = c1075b2;
        this.f4453c = c1075b3;
    }

    /* JADX INFO: renamed from: a */
    public final C1075b m2649a() {
        return this.f4451a;
    }

    /* JADX INFO: renamed from: b */
    public final C1075b m2650b() {
        return this.f4452b;
    }
}
