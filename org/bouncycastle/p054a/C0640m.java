package org.bouncycastle.p054a;

import java.math.BigInteger;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1557h;

/* JADX INFO: renamed from: org.bouncycastle.a.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0640m extends AbstractC0686u {

    /* JADX INFO: renamed from: a */
    private final byte[] f2399a;

    public C0640m(long j) {
        this.f2399a = BigInteger.valueOf(j).toByteArray();
    }

    public C0640m(BigInteger bigInteger) {
        this.f2399a = bigInteger.toByteArray();
    }

    public C0640m(byte[] bArr) {
        this(bArr, true);
    }

    C0640m(byte[] bArr, boolean z) {
        if (!C1557h.m4155a("org.bouncycastle.asn1.allow_unsafe_integer") && m1563a(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.f2399a = z ? C1535a.m4086b(bArr) : bArr;
    }

    /* JADX INFO: renamed from: a */
    public static C0640m m1561a(Object obj) {
        if (obj == null || (obj instanceof C0640m)) {
            return (C0640m) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (C0640m) m1692b((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0640m m1562a(AbstractC0539ab abstractC0539ab, boolean z) {
        AbstractC0686u abstractC0686uM1402j = abstractC0539ab.m1402j();
        return (z || (abstractC0686uM1402j instanceof C0640m)) ? m1561a((Object) abstractC0686uM1402j) : new C0640m(AbstractC0655q.m1596a((Object) abstractC0686uM1402j).mo1410c());
    }

    /* JADX INFO: renamed from: a */
    static boolean m1563a(byte[] bArr) {
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

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) {
        c0660s.m1605a(2, this.f2399a);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1336a() {
        return false;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1337a(AbstractC0686u abstractC0686u) {
        if (abstractC0686u instanceof C0640m) {
            return C1535a.m4076a(this.f2399a, ((C0640m) abstractC0686u).f2399a);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m1564b() {
        return new BigInteger(this.f2399a);
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m1565c() {
        return new BigInteger(1, this.f2399a);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        return C0612ch.m1488a(this.f2399a.length) + 1 + this.f2399a.length;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u, org.bouncycastle.p054a.AbstractC0650o
    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i2 == this.f2399a.length) {
                return i3;
            }
            i = ((this.f2399a[i2] & 255) << (i2 % 4)) ^ i3;
            i2++;
        }
    }

    public final String toString() {
        return m1564b().toString();
    }
}
