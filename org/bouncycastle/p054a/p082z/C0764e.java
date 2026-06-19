package org.bouncycastle.p054a.p082z;

import java.math.BigInteger;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.C0640m;

/* JADX INFO: renamed from: org.bouncycastle.a.z.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0764e extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private BigInteger f3144a;

    public C0764e(BigInteger bigInteger) {
        this.f3144a = bigInteger;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return new C0640m(this.f3144a);
    }

    public final String toString() {
        return "CRLNumber: " + this.f3144a;
    }
}
