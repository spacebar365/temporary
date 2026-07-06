package org.bouncycastle.a.aa;

import java.math.BigInteger;
import org.bouncycastle.a.au;
import org.bouncycastle.a.bi;

/* JADX INFO: loaded from: classes.dex */
public final class c extends org.bouncycastle.a.o {
    private au a;
    private org.bouncycastle.a.m b;

    private c(org.bouncycastle.a.v vVar) {
        if (vVar.d() != 2) {
            throw new IllegalArgumentException("Bad sequence size: " + vVar.d());
        }
        this.a = au.a(vVar.a(0));
        this.b = org.bouncycastle.a.m.a(vVar.a(1));
    }

    public c(byte[] bArr, int i) {
        if (bArr == null) {
            throw new IllegalArgumentException("'seed' cannot be null");
        }
        this.a = new au(bArr);
        this.b = new org.bouncycastle.a.m(i);
    }

    public static c a(Object obj) {
        if (obj != null) {
            return new c(org.bouncycastle.a.v.a(obj));
        }
        return null;
    }

    public final byte[] a() {
        return this.a.d();
    }

    public final BigInteger b() {
        return this.b.c();
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(this.a);
        gVar.a(this.b);
        return new bi(gVar);
    }
}
