package org.bouncycastle.a.s;

import java.math.BigInteger;
import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class q extends org.bouncycastle.a.o {
    org.bouncycastle.a.m a;
    org.bouncycastle.a.q b;

    public q(int i, byte[] bArr) {
        this.a = new org.bouncycastle.a.m(i);
        this.b = new be(bArr);
    }

    private q(org.bouncycastle.a.v vVar) {
        if (vVar.d() == 1) {
            this.a = null;
            this.b = (org.bouncycastle.a.q) vVar.a(0);
        } else {
            this.a = (org.bouncycastle.a.m) vVar.a(0);
            this.b = (org.bouncycastle.a.q) vVar.a(1);
        }
    }

    public q(byte[] bArr) {
        this.a = null;
        this.b = new be(bArr);
    }

    public static q a(Object obj) {
        if (obj != null) {
            return new q(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final BigInteger a() {
        if (this.a == null) {
            return null;
        }
        return this.a.b();
    }

    public final byte[] b() {
        return this.b.c();
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        if (this.a != null) {
            gVar.a(this.a);
        }
        gVar.a(this.b);
        return new bi(gVar);
    }
}
