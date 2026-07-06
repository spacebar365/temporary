package org.bouncycastle.a;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class m extends u {
    private final byte[] a;

    public m(long j) {
        this.a = BigInteger.valueOf(j).toByteArray();
    }

    public m(BigInteger bigInteger) {
        this.a = bigInteger.toByteArray();
    }

    public m(byte[] bArr) {
        this(bArr, true);
    }

    m(byte[] bArr, boolean z) {
        if (!org.bouncycastle.f.h.a("org.bouncycastle.asn1.allow_unsafe_integer") && a(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.a = z ? org.bouncycastle.f.a.b(bArr) : bArr;
    }

    public static m a(Object obj) {
        if (obj == null || (obj instanceof m)) {
            return (m) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (m) b((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    public static m a(ab abVar, boolean z) {
        u uVarJ = abVar.j();
        return (z || (uVarJ instanceof m)) ? a((Object) uVarJ) : new m(q.a((Object) uVarJ).c());
    }

    static boolean a(byte[] bArr) {
        if (bArr.length > 1) {
            if (bArr[0] == 0 && (bArr[1] & 128) == 0) {
                return true;
            }
            if (bArr[0] == -1 && (bArr[1] & 128) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // org.bouncycastle.a.u
    final void a(s sVar) {
        sVar.a(2, this.a);
    }

    @Override // org.bouncycastle.a.u
    final boolean a() {
        return false;
    }

    @Override // org.bouncycastle.a.u
    final boolean a(u uVar) {
        if (uVar instanceof m) {
            return org.bouncycastle.f.a.a(this.a, ((m) uVar).a);
        }
        return false;
    }

    public final BigInteger b() {
        return new BigInteger(this.a);
    }

    public final BigInteger c() {
        return new BigInteger(1, this.a);
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        return ch.a(this.a.length) + 1 + this.a.length;
    }

    @Override // org.bouncycastle.a.u, org.bouncycastle.a.o
    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i2 == this.a.length) {
                return i3;
            }
            i = ((this.a[i2] & 255) << (i2 % 4)) ^ i3;
            i2++;
        }
    }

    public final String toString() {
        return b().toString();
    }
}
