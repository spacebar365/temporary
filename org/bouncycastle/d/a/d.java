package org.bouncycastle.d.a;

import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    protected org.bouncycastle.d.b.b a;
    protected g b;
    protected g c;
    protected BigInteger d;
    protected BigInteger e;
    protected int f = 0;
    protected org.bouncycastle.d.a.b.a g = null;
    protected i h = null;

    protected d(org.bouncycastle.d.b.b bVar) {
        this.a = bVar;
    }

    private void a(j[] jVarArr, int i, int i2) {
        if (jVarArr == null) {
            throw new IllegalArgumentException("'points' cannot be null");
        }
        if (i < 0 || i2 < 0 || i > jVarArr.length - i2) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            j jVar = jVarArr[i + i3];
            if (jVar != null && this != jVar.d()) {
                throw new IllegalArgumentException("'points' entries must be null or on this curve");
            }
        }
    }

    private void b(j jVar) {
        if (jVar == null || this != jVar.d()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
    }

    public abstract int a();

    public abstract g a(BigInteger bigInteger);

    public h a(j[] jVarArr, int i) {
        int iA = (a() + 7) >>> 3;
        byte[] bArr = new byte[i * iA * 2];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            j jVar = jVarArr[i2 + 0];
            byte[] byteArray = jVar.k().a().toByteArray();
            byte[] byteArray2 = jVar.l().a().toByteArray();
            int i4 = byteArray.length > iA ? 1 : 0;
            int length = byteArray.length - i4;
            int i5 = byteArray2.length > iA ? 1 : 0;
            int length2 = byteArray2.length - i5;
            System.arraycopy(byteArray, i4, bArr, (i3 + iA) - length, length);
            int i6 = i3 + iA;
            System.arraycopy(byteArray2, i5, bArr, (i6 + iA) - length2, length2);
            i2++;
            i3 = i6 + iA;
        }
        return new e(this, i, iA, bArr);
    }

    protected abstract j a(int i, BigInteger bigInteger);

    public j a(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        return a(a(bigInteger), a(bigInteger2), z);
    }

    protected abstract j a(g gVar, g gVar2, boolean z);

    protected abstract j a(g gVar, g gVar2, g[] gVarArr, boolean z);

    public j a(j jVar) {
        if (this == jVar.d()) {
            return jVar;
        }
        if (jVar.p()) {
            return e();
        }
        j jVarO = jVar.o();
        return a(jVarO.i().a(), jVarO.j().a(), jVarO.f);
    }

    public final j a(byte[] bArr) {
        j jVarA;
        int iA = (a() + 7) / 8;
        byte b = bArr[0];
        switch (b) {
            case 0:
                if (bArr.length != 1) {
                    throw new IllegalArgumentException("Incorrect length for infinity encoding");
                }
                jVarA = e();
                break;
            case 1:
            case 5:
            default:
                throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b, 16));
            case 2:
            case 3:
                if (bArr.length != iA + 1) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                jVarA = a(b & 1, org.bouncycastle.f.b.a(bArr, 1, iA));
                if (!jVarA.a(true, true)) {
                    throw new IllegalArgumentException("Invalid point");
                }
                break;
            case 4:
                if (bArr.length != (iA * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
                }
                jVarA = a(org.bouncycastle.f.b.a(bArr, 1, iA), org.bouncycastle.f.b.a(bArr, iA + 1, iA));
                break;
            case 6:
            case 7:
                if (bArr.length != (iA * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
                BigInteger bigIntegerA = org.bouncycastle.f.b.a(bArr, 1, iA);
                BigInteger bigIntegerA2 = org.bouncycastle.f.b.a(bArr, iA + 1, iA);
                if (bigIntegerA2.testBit(0) != (b == 7)) {
                    throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                }
                jVarA = a(bigIntegerA, bigIntegerA2);
                break;
        }
        if (b == 0 || !jVarA.p()) {
            return jVarA;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    public final t a(j jVar, String str) {
        Hashtable hashtable;
        t tVar;
        b(jVar);
        synchronized (jVar) {
            hashtable = jVar.g;
        }
        if (hashtable == null) {
            return null;
        }
        synchronized (hashtable) {
            tVar = (t) hashtable.get(str);
        }
        return tVar;
    }

    public final t a(j jVar, String str, s sVar) {
        Hashtable hashtable;
        t tVarA;
        b(jVar);
        synchronized (jVar) {
            Hashtable hashtable2 = jVar.g;
            if (hashtable2 == null) {
                Hashtable hashtable3 = new Hashtable(4);
                jVar.g = hashtable3;
                hashtable = hashtable3;
            } else {
                hashtable = hashtable2;
            }
        }
        synchronized (hashtable) {
            t tVar = (t) hashtable.get(str);
            tVarA = sVar.a(tVar);
            if (tVarA != tVar) {
                hashtable.put(str, tVarA);
            }
        }
        return tVarA;
    }

    public final void a(j[] jVarArr) {
        a(jVarArr, 0, jVarArr.length, (g) null);
    }

    public boolean a(int i) {
        return i == 0;
    }

    public final synchronized d$c b() {
        return new d$c(this, this.f, this.g, this.h);
    }

    public abstract boolean b(BigInteger bigInteger);

    protected abstract d c();

    protected i d() {
        return this.g instanceof org.bouncycastle.d.a.b.b ? new q(this, (org.bouncycastle.d.a.b.b) this.g) : new y();
    }

    public abstract j e();

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof d) && a((d) obj));
    }

    public final org.bouncycastle.d.b.b f() {
        return this.a;
    }

    public final g g() {
        return this.b;
    }

    public final g h() {
        return this.c;
    }

    public final BigInteger i() {
        return this.d;
    }

    public final BigInteger j() {
        return this.e;
    }

    public final int k() {
        return this.f;
    }

    public final org.bouncycastle.d.a.b.a l() {
        return this.g;
    }

    public final synchronized i m() {
        if (this.h == null) {
            this.h = d();
        }
        return this.h;
    }

    public final j a(BigInteger bigInteger, BigInteger bigInteger2) {
        j jVarA = a(bigInteger, bigInteger2, false);
        if (jVarA.a(false, true)) {
            return jVarA;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public final void a(j[] jVarArr, int i, int i2, g gVar) {
        a(jVarArr, i, i2);
        switch (this.f) {
            case 0:
            case 5:
                if (gVar != null) {
                    throw new IllegalArgumentException("'iso' not valid for affine coordinates");
                }
                return;
            default:
                g[] gVarArr = new g[i2];
                int[] iArr = new int[i2];
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    j jVar = jVarArr[i + i4];
                    if (jVar != null && (gVar != null || !jVar.n())) {
                        gVarArr[i3] = jVar.a(0);
                        iArr[i3] = i + i4;
                        i3++;
                    }
                }
                if (i3 == 0) {
                    return;
                }
                b.a(gVarArr, i3, gVar);
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = iArr[i5];
                    jVarArr[i6] = jVarArr[i6].a(gVarArr[i5]);
                }
                return;
        }
    }

    public final boolean a(d dVar) {
        return this == dVar || (dVar != null && this.a.equals(dVar.a) && this.b.a().equals(dVar.b.a()) && this.c.a().equals(dVar.c.a()));
    }

    public int hashCode() {
        return (this.a.hashCode() ^ Integer.rotateLeft(this.b.a().hashCode(), 8)) ^ Integer.rotateLeft(this.c.a().hashCode(), 16);
    }
}
