package org.bouncycastle.d.a;

import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class d$a extends d {
    private BigInteger[] i;

    protected final g a(g gVar) {
        g gVarA;
        if (gVar.j()) {
            return gVar;
        }
        g gVarA2 = a(c.c);
        int iA = a();
        Random random = new Random();
        do {
            g gVarA3 = a(new BigInteger(iA, random));
            g gVarA4 = gVar;
            gVarA = gVarA2;
            for (int i = 1; i < iA; i++) {
                g gVarE = gVarA4.e();
                gVarA = gVarA.e().a(gVarE.c(gVarA3));
                gVarA4 = gVarE.a(gVar);
            }
            if (!gVarA4.j()) {
                return null;
            }
        } while (gVarA.e().a(gVarA).j());
        return gVarA;
    }

    @Override // org.bouncycastle.d.a.d
    protected final j a(int i, BigInteger bigInteger) {
        g gVarA;
        g gVarA2 = a(bigInteger);
        if (gVarA2.j()) {
            gVarA = h().g();
        } else {
            g gVarA3 = a(gVarA2.e().f().c(h()).a(g()).a(gVarA2));
            if (gVarA3 != null) {
                if (gVarA3.k() != (i == 1)) {
                    gVarA3 = gVarA3.c();
                }
                switch (k()) {
                    case 5:
                    case 6:
                        gVarA = gVarA3.a(gVarA2);
                        break;
                    default:
                        gVarA = gVarA3.c(gVarA2);
                        break;
                }
            } else {
                gVarA = null;
            }
        }
        if (gVarA == null) {
            throw new IllegalArgumentException("Invalid point compression");
        }
        return a(gVarA2, gVarA, true);
    }

    @Override // org.bouncycastle.d.a.d
    public final j a(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        g gVarA = a(bigInteger);
        g gVarA2 = a(bigInteger2);
        switch (k()) {
            case 5:
            case 6:
                if (!gVarA.j()) {
                    gVarA2 = gVarA2.d(gVarA).a(gVarA);
                } else if (!gVarA2.e().equals(h())) {
                    throw new IllegalArgumentException();
                }
                break;
        }
        return a(gVarA, gVarA2, z);
    }

    @Override // org.bouncycastle.d.a.d
    public final boolean b(BigInteger bigInteger) {
        return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= a();
    }

    final synchronized BigInteger[] n() {
        if (this.i == null) {
            this.i = w.a(this);
        }
        return this.i;
    }

    public boolean o() {
        return this.d != null && this.e != null && this.c.i() && (this.b.j() || this.b.i());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected d$a(int i, int i2, int i3, int i4) {
        org.bouncycastle.d.b.g gVarA;
        if (i2 == 0) {
            throw new IllegalArgumentException("k1 must be > 0");
        }
        if (i3 == 0) {
            if (i4 != 0) {
                throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
            }
            gVarA = org.bouncycastle.d.b.c.a(new int[]{0, i2, i});
        } else {
            if (i3 <= i2) {
                throw new IllegalArgumentException("k2 must be > k1");
            }
            if (i4 <= i3) {
                throw new IllegalArgumentException("k3 must be > k2");
            }
            gVarA = org.bouncycastle.d.b.c.a(new int[]{0, i2, i3, i4, i});
        }
        super(gVarA);
        this.i = null;
    }
}
