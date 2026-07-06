package org.bouncycastle.d.a;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class g$c extends g$a {
    r a;
    private int b;
    private int i;
    private int[] j;

    public g$c(int i, int i2, int i3, int i4, BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            throw new IllegalArgumentException("x value invalid in F2m field element");
        }
        if (i3 == 0 && i4 == 0) {
            this.b = 2;
            this.j = new int[]{i2};
        } else {
            if (i3 >= i4) {
                throw new IllegalArgumentException("k2 must be smaller than k3");
            }
            if (i3 <= 0) {
                throw new IllegalArgumentException("k2 must be larger than 0");
            }
            this.b = 3;
            this.j = new int[]{i2, i3, i4};
        }
        this.i = i;
        this.a = new r(bigInteger);
    }

    g$c(int i, int[] iArr, r rVar) {
        this.i = i;
        this.b = iArr.length == 1 ? 2 : 3;
        this.j = iArr;
        this.a = rVar;
    }

    public static void b(g gVar, g gVar2) {
        if (!(gVar instanceof g$c) || !(gVar2 instanceof g$c)) {
            throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
        }
        g$c g_c = (g$c) gVar;
        g$c g_c2 = (g$c) gVar2;
        if (g_c.b != g_c2.b) {
            throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
        }
        if (g_c.i != g_c2.i || !org.bouncycastle.f.a.a(g_c.j, g_c2.j)) {
            throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
        }
    }

    @Override // org.bouncycastle.d.a.g
    public final BigInteger a() {
        return this.a.d();
    }

    @Override // org.bouncycastle.d.a.g
    public final g a(int i) {
        return i <= 0 ? this : new g$c(this.i, this.j, this.a.a(i, this.i, this.j));
    }

    @Override // org.bouncycastle.d.a.g
    public final g a(g gVar) {
        r rVar = (r) this.a.clone();
        rVar.a(((g$c) gVar).a);
        return new g$c(this.i, this.j, rVar);
    }

    @Override // org.bouncycastle.d.a.g
    public final g a(g gVar, g gVar2) {
        r rVar = this.a;
        r rVar2 = ((g$c) gVar).a;
        r rVar3 = ((g$c) gVar2).a;
        r rVarG = rVar.g();
        r rVarB = rVar2.b(rVar3);
        if (rVarG == rVar) {
            rVarG = (r) rVarG.clone();
        }
        rVarG.a(rVarB);
        rVarG.a(this.i, this.j);
        return new g$c(this.i, this.j, rVarG);
    }

    @Override // org.bouncycastle.d.a.g
    public final g a(g gVar, g gVar2, g gVar3) {
        return b(gVar, gVar2, gVar3);
    }

    @Override // org.bouncycastle.d.a.g
    public final int b() {
        return this.i;
    }

    @Override // org.bouncycastle.d.a.g
    public final g b(g gVar) {
        return a(gVar);
    }

    @Override // org.bouncycastle.d.a.g
    public final g b(g gVar, g gVar2, g gVar3) {
        r rVar = this.a;
        r rVar2 = ((g$c) gVar).a;
        r rVar3 = ((g$c) gVar2).a;
        r rVar4 = ((g$c) gVar3).a;
        r rVarB = rVar.b(rVar2);
        r rVarB2 = rVar3.b(rVar4);
        if (rVarB == rVar || rVarB == rVar2) {
            rVarB = (r) rVarB.clone();
        }
        rVarB.a(rVarB2);
        rVarB.a(this.i, this.j);
        return new g$c(this.i, this.j, rVarB);
    }

    @Override // org.bouncycastle.d.a.g
    public final g c() {
        return new g$c(this.i, this.j, this.a.e());
    }

    @Override // org.bouncycastle.d.a.g
    public final g c(g gVar) {
        return new g$c(this.i, this.j, this.a.a(((g$c) gVar).a, this.i, this.j));
    }

    @Override // org.bouncycastle.d.a.g
    public final g d() {
        return this;
    }

    @Override // org.bouncycastle.d.a.g
    public final g d(g gVar) {
        return c(gVar.f());
    }

    @Override // org.bouncycastle.d.a.g
    public final g e() {
        return new g$c(this.i, this.j, this.a.b(this.i, this.j));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g$c)) {
            return false;
        }
        g$c g_c = (g$c) obj;
        return this.i == g_c.i && this.b == g_c.b && org.bouncycastle.f.a.a(this.j, g_c.j) && this.a.equals(g_c.a);
    }

    @Override // org.bouncycastle.d.a.g
    public final g f() {
        return new g$c(this.i, this.j, this.a.c(this.i, this.j));
    }

    @Override // org.bouncycastle.d.a.g
    public final g g() {
        return (this.a.b() || this.a.a()) ? this : a(this.i - 1);
    }

    @Override // org.bouncycastle.d.a.g
    public final int h() {
        return this.a.c();
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.i) ^ org.bouncycastle.f.a.b(this.j);
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean i() {
        return this.a.a();
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean j() {
        return this.a.b();
    }

    @Override // org.bouncycastle.d.a.g
    public final boolean k() {
        return this.a.f();
    }
}
