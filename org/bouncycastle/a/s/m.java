package org.bouncycastle.a.s;

import java.math.BigInteger;
import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class m extends org.bouncycastle.a.o {
    org.bouncycastle.a.m a;
    org.bouncycastle.a.q b;

    private m(org.bouncycastle.a.v vVar) {
        this.b = (org.bouncycastle.a.q) vVar.a(0);
        this.a = org.bouncycastle.a.m.a(vVar.a(1));
    }

    public m(byte[] bArr, int i) {
        this.b = new be(bArr);
        this.a = new org.bouncycastle.a.m(i);
    }

    public static m a(Object obj) {
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj != null) {
            return new m(org.bouncycastle.a.v.a(obj));
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
