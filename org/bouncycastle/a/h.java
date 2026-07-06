package org.bouncycastle.a;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class h extends u {
    private static h[] b = new h[12];
    private final byte[] a;

    public h(int i) {
        this.a = BigInteger.valueOf(i).toByteArray();
    }

    private h(byte[] bArr) {
        if (!org.bouncycastle.f.h.a("org.bouncycastle.asn1.allow_unsafe_integer") && m.a(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        this.a = org.bouncycastle.f.a.b(bArr);
    }

    public static h a(Object obj) {
        if (obj == null || (obj instanceof h)) {
            return (h) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (h) b((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    public static h a(ab abVar) {
        return a((Object) abVar.j());
    }

    static h a(byte[] bArr) {
        if (bArr.length > 1) {
            return new h(bArr);
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i = bArr[0] & 255;
        if (i >= b.length) {
            return new h(org.bouncycastle.f.a.b(bArr));
        }
        h hVar = b[i];
        if (hVar != null) {
            return hVar;
        }
        h[] hVarArr = b;
        h hVar2 = new h(org.bouncycastle.f.a.b(bArr));
        hVarArr[i] = hVar2;
        return hVar2;
    }

    @Override // org.bouncycastle.a.u
    final void a(s sVar) {
        sVar.a(10, this.a);
    }

    @Override // org.bouncycastle.a.u
    final boolean a() {
        return false;
    }

    @Override // org.bouncycastle.a.u
    final boolean a(u uVar) {
        if (uVar instanceof h) {
            return org.bouncycastle.f.a.a(this.a, ((h) uVar).a);
        }
        return false;
    }

    public final BigInteger b() {
        return new BigInteger(this.a);
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        return ch.a(this.a.length) + 1 + this.a.length;
    }

    @Override // org.bouncycastle.a.u, org.bouncycastle.a.o
    public final int hashCode() {
        return org.bouncycastle.f.a.a(this.a);
    }
}
