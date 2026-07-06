package org.bouncycastle.a.s;

import java.math.BigInteger;
import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class j extends org.bouncycastle.a.o {
    org.bouncycastle.a.m a;
    org.bouncycastle.a.q b;

    private j(org.bouncycastle.a.v vVar) {
        this.b = (org.bouncycastle.a.q) vVar.a(0);
        this.a = (org.bouncycastle.a.m) vVar.a(1);
    }

    public j(byte[] bArr, int i) {
        if (bArr.length != 8) {
            throw new IllegalArgumentException("salt length must be 8");
        }
        this.b = new be(bArr);
        this.a = new org.bouncycastle.a.m(i);
    }

    public static j a(Object obj) {
        if (obj != null) {
            return new j(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final BigInteger a() {
        return this.a.b();
    }

    public final byte[] b() {
        return this.b.c();
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.b);
        gVar.a(this.a);
        return new bi(gVar);
    }
}
