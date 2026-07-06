package org.bouncycastle.d.a;

import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    protected static final g[] a = new g[0];
    protected d b;
    protected g c;
    protected g d;
    protected g[] e;
    protected boolean f;
    protected Hashtable g;

    protected j(d dVar, g gVar, g gVar2, g[] gVarArr) {
        this.g = null;
        this.b = dVar;
        this.c = gVar;
        this.d = gVar2;
        this.e = gVarArr;
    }

    private void v() {
        if (!n()) {
            throw new IllegalStateException("point not in normal form");
        }
    }

    public g a(int i) {
        if (i < 0 || i >= this.e.length) {
            return null;
        }
        return this.e[i];
    }

    final j a(g gVar) {
        switch (f()) {
            case 1:
            case 6:
                return a(gVar, gVar);
            case 2:
            case 3:
            case 4:
                g gVarE = gVar.e();
                return a(gVarE, gVarE.c(gVar));
            case 5:
            default:
                throw new IllegalStateException("not a projective coordinate system");
        }
    }

    protected abstract boolean a();

    public j b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
        while (true) {
            i--;
            if (i < 0) {
                return this;
            }
            this = this.t();
        }
    }

    public abstract j b(j jVar);

    protected boolean b() {
        BigInteger bigIntegerI;
        return c.d.equals(this.b.j()) || (bigIntegerI = this.b.i()) == null || b.a(this, bigIntegerI).p();
    }

    public final j c() {
        return o().e();
    }

    public abstract j c(j jVar);

    public final d d() {
        return this.b;
    }

    public j d(j jVar) {
        return t().b(jVar);
    }

    protected abstract j e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return a((j) obj);
        }
        return false;
    }

    protected final int f() {
        if (this.b == null) {
            return 0;
        }
        return this.b.k();
    }

    public final g h() {
        v();
        return j();
    }

    public final g i() {
        return this.c;
    }

    public g j() {
        return this.d;
    }

    public final g k() {
        return this.c;
    }

    public final g l() {
        return this.d;
    }

    protected final g[] m() {
        return this.e;
    }

    public final boolean n() {
        int iF = f();
        return iF == 0 || iF == 5 || p() || this.e[0].i();
    }

    public final j o() {
        if (p()) {
            return this;
        }
        switch (f()) {
            case 0:
            case 5:
                break;
            default:
                g gVarA = a(0);
                if (!gVarA.i()) {
                }
                break;
        }
        return this;
    }

    public final boolean p() {
        return this.c == null || this.d == null || (this.e.length > 0 && this.e[0].j());
    }

    public final boolean q() {
        return a(false, true);
    }

    protected abstract boolean r();

    public abstract j s();

    public abstract j t();

    public j u() {
        return d(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected j(d dVar, g gVar, g gVar2) {
        g[] gVarArr;
        int iK = dVar == null ? 0 : dVar.k();
        switch (iK) {
            case 0:
            case 5:
                gVarArr = a;
                break;
            default:
                g gVarA = dVar.a(c.d);
                switch (iK) {
                    case 1:
                    case 2:
                    case 6:
                        gVarArr = new g[]{gVarA};
                        break;
                    case 3:
                        gVarArr = new g[]{gVarA, gVarA, gVarA};
                        break;
                    case 4:
                        gVarArr = new g[]{gVarA, dVar.g()};
                        break;
                    case 5:
                    default:
                        throw new IllegalArgumentException("unknown coordinate system");
                }
                break;
        }
        this(dVar, gVar, gVar2, gVarArr);
    }

    public final g g() {
        v();
        return this.c;
    }

    private j a(g gVar, g gVar2) {
        return this.b.a(this.c.c(gVar), this.d.c(gVar2), this.f);
    }

    final boolean a(boolean z, boolean z2) {
        return p() || !((x) this.b.a(this, "bc_validity", new k(this, z, z2))).a();
    }

    public j b(g gVar) {
        return p() ? this : this.b.a(this.c.c(gVar), this.d, this.e, this.f);
    }

    public j c(g gVar) {
        return p() ? this : this.b.a(this.c, this.d.c(gVar), this.e, this.f);
    }

    public final boolean a(j jVar) {
        if (jVar == null) {
            return false;
        }
        d dVar = this.b;
        d dVar2 = jVar.b;
        boolean z = dVar == null;
        boolean z2 = dVar2 == null;
        boolean zP = p();
        boolean zP2 = jVar.p();
        if (zP || zP2) {
            if (zP && zP2) {
                return z || z2 || dVar.a(dVar2);
            }
            return false;
        }
        if (!z || !z2) {
            if (z) {
                jVar = jVar.o();
            } else if (z2) {
                this = o();
            } else {
                if (!dVar.a(dVar2)) {
                    return false;
                }
                j[] jVarArr = {this, dVar.a(jVar)};
                dVar.a(jVarArr);
                this = jVarArr[0];
                jVar = jVarArr[1];
            }
        }
        return this.c.equals(jVar.c) && this.j().equals(jVar.j());
    }

    public int hashCode() {
        d dVar = this.b;
        int iHashCode = dVar == null ? 0 : dVar.hashCode() ^ (-1);
        if (p()) {
            return iHashCode;
        }
        j jVarO = o();
        return (iHashCode ^ (jVarO.c.hashCode() * 17)) ^ (jVarO.j().hashCode() * 257);
    }

    public String toString() {
        if (p()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        stringBuffer.append(this.c);
        stringBuffer.append(',');
        stringBuffer.append(this.d);
        for (int i = 0; i < this.e.length; i++) {
            stringBuffer.append(',');
            stringBuffer.append(this.e[i]);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    public final byte[] a(boolean z) {
        if (p()) {
            return new byte[1];
        }
        j jVarO = o();
        byte[] bArrL = jVarO.c.l();
        if (z) {
            byte[] bArr = new byte[bArrL.length + 1];
            bArr[0] = (byte) (jVarO.r() ? 3 : 2);
            System.arraycopy(bArrL, 0, bArr, 1, bArrL.length);
            return bArr;
        }
        byte[] bArrL2 = jVarO.j().l();
        byte[] bArr2 = new byte[bArrL.length + bArrL2.length + 1];
        bArr2[0] = 4;
        System.arraycopy(bArrL, 0, bArr2, 1, bArrL.length);
        System.arraycopy(bArrL2, 0, bArr2, bArrL.length + 1, bArrL2.length);
        return bArr2;
    }

    public final j a(BigInteger bigInteger) {
        return this.b.m().a(this, bigInteger);
    }
}
