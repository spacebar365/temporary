package org.bouncycastle.p054a;

import java.math.BigInteger;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1557h;

/* JADX INFO: renamed from: org.bouncycastle.a.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0627h extends AbstractC0686u {

    /* JADX INFO: renamed from: b */
    private static C0627h[] f2262b = new C0627h[12];

    /* JADX INFO: renamed from: a */
    private final byte[] f2263a;

    public C0627h(int i) {
        this.f2263a = BigInteger.valueOf(i).toByteArray();
    }

    private C0627h(byte[] bArr) {
        if (!C1557h.m4155a("org.bouncycastle.asn1.allow_unsafe_integer") && C0640m.m1563a(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        this.f2263a = C1535a.m4086b(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static C0627h m1522a(Object obj) {
        if (obj == null || (obj instanceof C0627h)) {
            return (C0627h) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (C0627h) m1692b((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0627h m1523a(AbstractC0539ab abstractC0539ab) {
        return m1522a((Object) abstractC0539ab.m1402j());
    }

    /* JADX INFO: renamed from: a */
    static C0627h m1524a(byte[] bArr) {
        if (bArr.length > 1) {
            return new C0627h(bArr);
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i = bArr[0] & 255;
        if (i >= f2262b.length) {
            return new C0627h(C1535a.m4086b(bArr));
        }
        C0627h c0627h = f2262b[i];
        if (c0627h != null) {
            return c0627h;
        }
        C0627h[] c0627hArr = f2262b;
        C0627h c0627h2 = new C0627h(C1535a.m4086b(bArr));
        c0627hArr[i] = c0627h2;
        return c0627h2;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) {
        c0660s.m1605a(10, this.f2263a);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1336a() {
        return false;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1337a(AbstractC0686u abstractC0686u) {
        if (abstractC0686u instanceof C0627h) {
            return C1535a.m4076a(this.f2263a, ((C0627h) abstractC0686u).f2263a);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m1525b() {
        return new BigInteger(this.f2263a);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        return C0612ch.m1488a(this.f2263a.length) + 1 + this.f2263a.length;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u, org.bouncycastle.p054a.AbstractC0650o
    public final int hashCode() {
        return C1535a.m4066a(this.f2263a);
    }
}
