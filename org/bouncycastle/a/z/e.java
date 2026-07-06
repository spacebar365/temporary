package org.bouncycastle.a.z;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class e extends org.bouncycastle.a.o {
    private BigInteger a;

    public e(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        return new org.bouncycastle.a.m(this.a);
    }

    public final String toString() {
        return "CRLNumber: " + this.a;
    }
}
